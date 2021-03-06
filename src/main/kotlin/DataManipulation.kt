package entity.core.base

import entity.TableEntity
import java.sql.JDBCType

class DataManipulation {
    companion object {

        /*
        查询表实体主键名称
         */
        fun Primarykey(table: TableEntity): String? {
            table.ColumnList?.forEach {
                if (it.COLUMN_KEY?.trim() == "PRI") {
                    return it.COLUMN_NAME
                }
            }
            return null
        }

        /*
        查询所有数据
         */
        fun GetListALLContent(table: TableEntity): String {
            var result_conent = "";

            table.ColumnList?.forEach {
                if (table.ColumnList?.last() != it) {
                    result_conent += "Result(property = \"${it.COLUMN_NAME}\", column = \"${it.COLUMN_NAME}\"),\n   "
                } else {
                    result_conent += "Result(property = \"${it.COLUMN_NAME}\", column = \"${it.COLUMN_NAME}\")"
                }
            }

            return """
@Results(
   ${result_conent}
)
@Select(""${'"'}<script>
   SELECT * FROM ${table.table_name}
</script>""${'"'})
fun GetListAll():ArrayList<${table.table_name + "_dto"}>?
        """
        }

        /*
        根据非空属性条件查询结果
         */
        fun ConditionalQueryContent(table: TableEntity): String {
            var result_conent = ""

            table.ColumnList?.forEach {
                if (table.ColumnList?.last() != it) {
                    result_conent += "Result(property = \"${it.COLUMN_NAME}\", column = \"${it.COLUMN_NAME}\"),\n   "
                } else {
                    result_conent += "Result(property = \"${it.COLUMN_NAME}\", column = \"${it.COLUMN_NAME}\")"
                }
            }


            var choice = ""
            table.ColumnList?.forEach {
                choice += "   <if test=\"${it.COLUMN_NAME}!=null\">\n" +
                        "      ${it.COLUMN_NAME}=#{${it.COLUMN_NAME}}\n" +
                        "   </if> \n"
            }
            var where_str = "<where>\n${choice}   </where>"

            return """
@Results(
   ${result_conent}
)
@Select(""${'"'}<script>
   SELECT * FROM ${table.table_name}
   ${where_str}
</script>""${'"'})
fun ConditionalQuery(model:${table.table_name + "_dto"}):ArrayList<${table.table_name + "_dto"}>?
                """
        }

        /*
        根据主键查询
         */
        fun ConditionalQueryByKey(table: TableEntity): String {
            var result_conent = ""

            table.ColumnList?.forEach {
                if (table.ColumnList?.last() != it) {
                    result_conent += "Result(property = \"${it.COLUMN_NAME}\", column = \"${it.COLUMN_NAME}\"),\n   "
                } else {
                    result_conent += "Result(property = \"${it.COLUMN_NAME}\", column = \"${it.COLUMN_NAME}\")"
                }
            }
            val key = Primarykey(table)

            /* 如果没有主键就返回空字符串不进行代码渲染 */
            if (key.isNullOrEmpty()) {
                return ""
            }

            var choice = ""

            choice += "      ${key}=#{${key}}\n"
            var where_str = "where ${choice} "

            return """
@Results(
   ${result_conent}
)
@Select(""${'"'}<script>
   SELECT * FROM ${table.table_name}
   ${where_str}
</script>""${'"'})
fun ConditionalQueryByKey(${key}:${EntityUtily.TypeConvert(table.ColumnList?.filter { it.COLUMN_NAME == key }?.firstOrNull()?.DATA_TYPE!!)}):ArrayList<${table.table_name + "_dto"}>?
                """
        }


        /*
          全量插入
         */
        fun InsertContent(table: TableEntity): String {
            val key = Primarykey(table)
            if (!key.isNullOrEmpty() && table.ColumnList?.filter { it.COLUMN_NAME == key }?.firstOrNull()?.EXTRA == "auto_increment") {
                return """
@Insert(""${'"'}<script>
    insert into ${table.table_name}
    (${table.ColumnList?.filter { it.COLUMN_NAME != key }?.map { it.COLUMN_NAME }?.joinToString(separator = ",")})
    values
    (${table.ColumnList?.filter { it.COLUMN_NAME != key }?.map { "#{" + it.COLUMN_NAME + "}" }?.joinToString(separator = ",")})
</script>""${'"'})
@Options(keyProperty="${key}",useGeneratedKeys=true)
fun insert(model:${table.table_name + "_dto"}):${EntityUtily.TypeConvert(table.ColumnList?.filter { it.COLUMN_NAME == key }?.firstOrNull()?.DATA_TYPE!!)}
                """
            } else {
                return """
@Insert(""${'"'}<script>
    insert into ${table.table_name}
    (${table.ColumnList?.map { it.COLUMN_NAME }?.joinToString(separator = ",")})
    values
    (${table.ColumnList?.map { "#{" + it.COLUMN_NAME + "}" }?.joinToString(separator = ",")})
</script>""${'"'})
fun Insert(model:${table.table_name + "_dto"}):Unit
                """
            }
        }


        /*
        选择性插入
         */
        fun InsertSelectiveContent(table: TableEntity): String {
            val key = Primarykey(table)
            if (!key.isNullOrEmpty() && table.ColumnList?.filter { it.COLUMN_NAME == key }?.firstOrNull()?.EXTRA == "auto_increment") {

                return """
@Insert(""${'"'}<script>
    insert into ${table.table_name}
    <trim prefix="(" suffix=")" suffixOverrides="," >
        ${table.ColumnList?.filter { it.COLUMN_NAME != key }?.map {
                    if (it.IS_NULLABLE == "YES") {
                        "<if test='" + it.COLUMN_NAME + "!= null'> \n" +
                                "        " + if (table.ColumnList?.last() == it) "   " + it.COLUMN_NAME + "\n" + "        </if>" else "   " + it.COLUMN_NAME + ",\n" + "        </if>"
                    } else {
                        if (table.ColumnList?.last() == it) "   " + it.COLUMN_NAME else "   " + it.COLUMN_NAME + ","
                    }
                }?.joinToString(separator = "\n        ")}
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
        ${table.ColumnList?.filter { it.COLUMN_NAME != key }?.map {
                    if (it.IS_NULLABLE == "YES") {
                        "<if test='" + it.COLUMN_NAME + "!= null'> \n" +
                                "        " + if (table.ColumnList?.last() == it)
                            "   #{" + it.COLUMN_NAME + ",jdbcType=" + EntityUtily.JdbcTypeConvert(it.DATA_TYPE.toLowerCase()) + "}\n" + "        </if>"
                        else
                            "   #{" + it.COLUMN_NAME + ",jdbcType=" + EntityUtily.JdbcTypeConvert(it.DATA_TYPE.toLowerCase()) + "}，\n" + "        </if>"
                    } else {
                        if (table.ColumnList?.last() == it)
                            "   #{" + it.COLUMN_NAME + ",jdbcType=" + EntityUtily.JdbcTypeConvert(it.DATA_TYPE.toLowerCase()) + "}"
                        else
                            "   #{" + it.COLUMN_NAME + ",jdbcType=" + EntityUtily.JdbcTypeConvert(it.DATA_TYPE.toLowerCase()) + "}，"
                    }
                }?.joinToString(separator = "\n        ")}
    </trim>
</script>""${'"'})
@Options(keyProperty="${key}",useGeneratedKeys=true)
fun InsertSelective(model:${table.table_name + "_dto"}):${EntityUtily.TypeConvert(table.ColumnList?.filter { it.COLUMN_NAME == key }?.firstOrNull()?.DATA_TYPE!!)}
                """

            } else {

                return """
@Insert(""${'"'}<script>
    insert into ${table.table_name}
    <trim prefix="(" suffix=")" suffixOverrides="," >
        ${table.ColumnList?.map {
                    if (it.IS_NULLABLE == "YES") {
                        "<if test='" + it.COLUMN_NAME + "!= null'> \n" +
                                "        " + if (table.ColumnList?.last() == it) "   " + it.COLUMN_NAME + "\n" + "        </if>" else "   " + it.COLUMN_NAME + ",\n" + "        </if>"
                    } else {
                        if (table.ColumnList?.last() == it) "   " + it.COLUMN_NAME else "   " + it.COLUMN_NAME + ","
                    }
                }?.joinToString(separator = "\n        ")}
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
        ${table.ColumnList?.map {
                    if (it.IS_NULLABLE == "YES") {
                        "<if test='" + it.COLUMN_NAME + "!= null'> \n" +
                                "        " + if (table.ColumnList?.last() == it)
                            "   #{" + it.COLUMN_NAME + ",jdbcType=" + EntityUtily.JdbcTypeConvert(it.DATA_TYPE.toLowerCase()) + "}\n" + "        </if>"
                        else
                            "   #{" + it.COLUMN_NAME + ",jdbcType=" + EntityUtily.JdbcTypeConvert(it.DATA_TYPE.toLowerCase()) + "}，\n" + "        </if>"
                    } else {
                        if (table.ColumnList?.last() == it)
                            "   #{" + it.COLUMN_NAME + ",jdbcType=" + EntityUtily.JdbcTypeConvert(it.DATA_TYPE.toLowerCase()) + "}"
                        else
                            "   #{" + it.COLUMN_NAME + ",jdbcType=" + EntityUtily.JdbcTypeConvert(it.DATA_TYPE.toLowerCase()) + "}，"
                    }
                }?.joinToString(separator = "\n        ")}
    </trim>
</script>""${'"'})
fun InsertSelective(model:${table.table_name + "_dto"}):Unit
                """
            }
        }

        fun DeleteByPrimaryKey(table: TableEntity): String {
            var pkId = Primarykey(table)
            if (!pkId.isNullOrBlank()) {
                return """
@Delete("DELETE FROM ${table.table_name} WHERE ${pkId}=#{arg0}")
fun DeleteByPrimaryKey(${pkId}:${EntityUtily.TypeConvert(table.ColumnList?.filter { it.COLUMN_NAME == pkId }?.firstOrNull()?.DATA_TYPE!!)})
        """
            }

            return ""
        }

        fun UpdateByPrimaryKey(table: TableEntity): String {
            var pkId = Primarykey(table)
            if (!pkId.isNullOrBlank()) {
                var str = table.ColumnList?.map { it.COLUMN_NAME + "=#{" + it.COLUMN_NAME + ",jdbcType=" + EntityUtily.JdbcTypeConvert(it.DATA_TYPE?.toLowerCase()) + "}" }?.joinToString(separator = ",\n        ")
                return """@Update(""${'"'}<script>
        UPDATE ${table.table_name} SET
        ${str}
        WHERE ${pkId}=#{${pkId},jdbcType=${EntityUtily.JdbcTypeConvert(table.ColumnList?.filter { it.COLUMN_NAME == pkId }?.firstOrNull()?.DATA_TYPE?.toLowerCase()!!)}}
        </script>""${'"'})
fun UpdateByPrimaryKey(model:${table.table_name + "_dto"})
        """
            }
            return ""
        }

        // <if test="processInstanceId != null">
        fun UpdateByPrimaryKeySelective(table: TableEntity): String {
            var pkId = Primarykey(table)
            if (!pkId.isNullOrBlank()) {
                var str = table.ColumnList?.map {
                    "<if test=\"${it.COLUMN_NAME} != null\">  " +
                            it.COLUMN_NAME + "=#{" + it.COLUMN_NAME + ",jdbcType=" + EntityUtily.JdbcTypeConvert(it.DATA_TYPE.toLowerCase()) + "}"
                }?.joinToString(separator = ",</if>\n        ")

                return """@Update(""${'"'}<script>
            UPDATE ${table.table_name} SET
            ${str + "</if>"}
              WHERE ${pkId}=#{${pkId},jdbcType=${EntityUtily.JdbcTypeConvert(table.ColumnList?.filter { it.COLUMN_NAME == pkId }?.firstOrNull()?.DATA_TYPE?.toLowerCase()!!)}}
            </script>""${'"'})
fun UpdateByPrimaryKeySelective(model:${table.table_name + "_dto"})
            """
            }
            return ""
        }

        /*
              根据BindId查询
         */
        fun ConditionalQueryByBindId(table: TableEntity): String {
            if (table.ColumnList?.filter { it.COLUMN_NAME.equals("BINDID", true) }!!.size > 0) "" else return ""
            var result_conent = ""

            table.ColumnList?.forEach {
                if (table.ColumnList?.last() != it) {
                    result_conent += "Result(property = \"${it.COLUMN_NAME}\", column = \"${it.COLUMN_NAME}\"),\n   "
                } else {
                    result_conent += "Result(property = \"${it.COLUMN_NAME}\", column = \"${it.COLUMN_NAME}\")"
                }
            }
            var where_str = "  where BINDID=#{BINDID}"

            return """
@Results(
   ${result_conent}
)
@Select(""${'"'}<script>
   SELECT * FROM ${table.table_name}
   ${where_str}
</script>""${'"'})
fun ConditionalQueryByBindId(BINDID:String):ArrayList<${table.table_name + "_dto"}>?
                """
        }

        /*
               根据bindid删除
         */
        fun DeleteByBindId(table: TableEntity): String {
            if (table.ColumnList?.filter { it.COLUMN_NAME.equals("BINDID", true) }!!.size > 0) "" else return ""

            return """
@Delete("DELETE FROM ${table.table_name} WHERE BINDID=#{BINDID}")
fun DeleteByBindId(BINDID:String)
        """
        }

        /*
               根据bindid修改
         */
        fun UpdateByBindId(table: TableEntity): String {
            if (table.ColumnList?.filter { it.COLUMN_NAME.equals("BINDID", true) }!!.size > 0) "" else return ""


            var str = table.ColumnList?.map { it.COLUMN_NAME + "=#{" + it.COLUMN_NAME + ",jdbcType=" + EntityUtily.JdbcTypeConvert(it.DATA_TYPE?.toLowerCase()) + "}" }?.joinToString(separator = ",\n        ")
            return """@Update(""${'"'}<script>
        UPDATE ${table.table_name} SET
        ${str}
        WHERE BINDID=#{BINDID,jdbcType=CHAR}
        </script>""${'"'})
fun UpdateByBindId(model:${table.table_name + "_dto"})
        """

            return ""
        }
    }
}




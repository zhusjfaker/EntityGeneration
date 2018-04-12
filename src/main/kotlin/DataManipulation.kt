package core

import entity.TableEntity

class DataManipulation {
    companion object {

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
fun GetListAll():ArrayList<${table.table_name + "_dto"}>
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
fun ConditionalQuery(model:${table.table_name + "_dto"}):ArrayList<${table.table_name + "_dto"}>
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

            choice += "   <if test=\"${key}!=null\">\n" +
                    "      ${key}=#{${key}}\n" +
                    "   </if> \n"
            var where_str = "<where>\n${choice}   </where>"

            return """
@Results(
   ${result_conent}
)
@Select(""${'"'}<script>
   SELECT * FROM ${table.table_name}
   ${where_str}
</script>""${'"'})
fun ConditionalQueryByKey(model:${table.table_name + "_dto"}):${table.table_name + "_dto"}?
                """
        }


        /*
          全量插入
         */
        fun insertContent(table: TableEntity): String {
            val key = Primarykey(table)
            if (!key.isNullOrEmpty() && table.ColumnList?.filter { it.COLUMN_NAME == key }?.firstOrNull()?.EXTRA == "auto_increment") {
                return """
@Insert(""${'"'}<script>
    insert into TStudent
    (${table.ColumnList?.filter { it.COLUMN_NAME != key }?.map { it.COLUMN_NAME }?.joinToString(separator = ",")})
    values
    (${table.ColumnList?.filter { it.COLUMN_NAME != key }?.map { "#{" + it.COLUMN_NAME + "}" }?.joinToString(separator = ",")})
</script>""${'"'})
@Options(keyProperty="${key}",useGeneratedKeys=true)
fun insert(model:${table.table_name + "_dto"}):${TypeConvert(table.ColumnList?.filter { it.COLUMN_NAME == key }?.firstOrNull()?.DATA_TYPE!!)}
                """
            } else {
                return """
@Insert(""${'"'}<script>
    insert into TStudent
    (${table.ColumnList?.map { it.COLUMN_NAME }?.joinToString(separator = ",")})
    values
    (${table.ColumnList?.map { "#{" + it.COLUMN_NAME + "}" }?.joinToString(separator = ",")})
</script>""${'"'})
fun insert(model:${table.table_name + "_dto"}):Unit
                """
            }
        }


    }
}


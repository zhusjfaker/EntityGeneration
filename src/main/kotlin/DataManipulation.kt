package core

import entity.TableEntity

class DataManipulation {
    companion object {

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


    }
}
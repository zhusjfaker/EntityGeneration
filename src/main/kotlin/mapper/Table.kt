package mapper

import entity.ColumnEntity
import entity.TableEntity
import org.apache.ibatis.annotations.Result
import org.apache.ibatis.annotations.Results
import org.apache.ibatis.annotations.Select


interface Table {

    @Select("""<script>
        select table_name from information_schema.tables where table_schema=#{arg0}
    </script>""")
    @Results(
            Result(property = "table_name", column = "table_name")
    )
    fun GetAllTable(databasename: String): ArrayList<TableEntity>


    @Select("""<script>
        SELECT COLUMN_NAME,IS_NULLABLE,DATA_TYPE,COLUMN_KEY,EXTRA,TABLE_SCHEMA,TABLE_NAME
        FROM INFORMATION_SCHEMA.Columns
        where table_name= #{arg0} and table_schema= #{arg1}
    </script>""")
    @Results(
            Result(property = "COLUMN_NAME", column = "COLUMN_NAME"),
            Result(property = "IS_NULLABLE", column = "IS_NULLABLE"),
            Result(property = "DATA_TYPE", column = "DATA_TYPE"),
            Result(property = "COLUMN_KEY", column = "COLUMN_KEY"),
            Result(property = "EXTRA", column = "EXTRA"),
            Result(property = "TABLE_SCHEMA", column = "TABLE_SCHEMA"),
            Result(property = "TABLE_NAME", column = "TABLE_NAME")
    )
    fun GetColumns(tablename: String, databasename: String): ArrayList<ColumnEntity>
}
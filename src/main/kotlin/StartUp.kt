import core.CoreLoader
import core.EntiyFactory
import mapper.Table

fun main(args: Array<String>) {

    /* 获取数据库 oop描述 */
    var factory = EntiyFactory.factory
    var session = factory!!.openSession(true)
    var table_excute = session.getMapper(Table::class.java)

    val databasename = "bpm01"
    var list = table_excute.GetAllTable(databasename)
    list.forEach {
        val col_list = table_excute.GetColumns(it.table_name, databasename)
        it.ColumnList = col_list
    }

    /* 生成路径 */
    var projectpath = "/Users/zhushijie/Desktop/gitlab-company/EntityGeneration/src/main/kotlin/output/"
    val packagename = "bpm6"


    /* 创建实体文件 并写入字段内容 */
    CoreLoader.GenerateFile(projectpath, list, packagename)

}
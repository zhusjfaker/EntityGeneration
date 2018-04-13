import core.CoreLoader
import core.EntiyFactory
import mapper.Table

fun main(args: Array<String>) {

    /* 创建实体文件 并写入字段内容 */
    CoreLoader.GenerateFile(
            projectpath = "/Users/zhushijie/Desktop/gitlab-company/EntityGeneration/src/main/kotlin/output/",
            driver = "com.mysql.jdbc.Driver",
            databasename = "bpm01",
            url = "jdbc:mysql://100.73.17.8:3306/bpm01",
            username = "root",
            password = "root123456",
            packagename = "bpm6"
    )

}
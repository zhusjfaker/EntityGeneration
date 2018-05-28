import entity.core.base.CoreLoader

fun main(args: Array<String>) {

    /* 创建实体文件 并写入字段内容 */
    CoreLoader.GenerateFile(
            projectpath = "E:\\git-project\\EntityGenrate\\src\\main\\kotlin\\output\\",
            driver = "com.mysql.cj.jdbc.Driver",
            databasename = "bpm01",
            url = "jdbc:mysql://127.0.0.1:3306/bpm01?serverTimezone=CTT",
            username = "root",
            password = "123456",
            packagename = "bpm6"
    )

}
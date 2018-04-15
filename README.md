# EntityGeneration
kotlin Server Database entity auto generation support mysql

```kotlin
 fun main(args: Array<String>) {
 
     /* 创建实体文件 并写入字段内容 */
     CoreLoader.GenerateFile(
             projectpath = "/Users/zhushijie/Desktop/gitlab-company/EntityGeneration/src/main/kotlin/output/",
             /* 生成项目路径 */
             driver = "com.mysql.cj.jdbc.Driver",
             /* jdbc驱动类型 */
             databasename = "bpm01",
             /* 数据库地址 */
             url = "jdbc:mysql://100.73.17.8:3306/bpm01",
             /* 用户名密码 */
             username = "root",
             password = "root123456",
             /* 
               生成的包名 
               默认实体在 {packagename.entity}
               默认操作在 {packagename.mapper}
             */
             packagename = "bpm6"
     )
 
 }

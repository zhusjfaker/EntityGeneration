package core

import entity.TableEntity
import mapper.Table
import java.io.File
import java.nio.charset.Charset


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
    writeDtoFile(projectpath, list, packagename)

}

fun writeDtoFile(path: String, list: ArrayList<TableEntity>, packagename: String): Unit {
    /* 初始化文件夹内容 */
    deleteFoldFiles(path)
    /* 生成实体类 */
    createEntityFile(path, list, packagename)
    /* 生成数据扩展类 */

    /* 生成工厂类 */
    createFactoryFile(path, packagename)

    /* 创建mapper repository */
    createMapperFile(path, list, packagename)
}

fun createEntityFile(path: String, list: ArrayList<TableEntity>, packagename: String) {
    /* 生成基础数据类 */
    var base_entity_path = path + "entity/"
    File(base_entity_path).mkdir()
    list.forEach {
        var filename = it.table_name + "_dto" + ".kt"
        val file = File(base_entity_path + filename)
        var column_content = ""
        var table = it
        if (it.ColumnList != null && it.ColumnList?.isNotEmpty()!!) {
            it.ColumnList?.forEach {
                column_content += "${if (it.COLUMN_KEY != "PRI") "var" else "val"}" +
                        " ${it.COLUMN_NAME} :${TypeConvert(it.DATA_TYPE)}" +
                        "${if (it.IS_NULLABLE == "NO") "" else "? = null"}" +
                        "${if (table.ColumnList?.last() == it) "" else ","}" +
                        "\n       "
            }
            file.appendText("""

package ${packagename}.entity

import java.lang.*
import java.math.*
import java.sql.*

data class ${it.table_name + "_dto"}(
       ${column_content}
)
        """.trimIndent(), Charset.defaultCharset())
            file.createNewFile()
        }
    }
}


fun createFactoryFile(path: String, packagename: String) {
    /* 生成工厂类 */
    var factory_path = path + "DBFactrory.kt"
    var factoryfile = File(factory_path)

    factoryfile.appendText("""
package  ${packagename}.factory

import org.apache.ibatis.datasource.pooled.PooledDataSource
import org.apache.ibatis.mapping.Environment
import org.apache.ibatis.session.Configuration
import org.apache.ibatis.session.SqlSessionFactory
import org.apache.ibatis.session.SqlSessionFactoryBuilder
import org.apache.ibatis.transaction.jdbc.JdbcTransactionFactory

class EntiyFactory {

    companion object {

        val driver = "${EntiyFactory.driver}"
        val url = "${EntiyFactory.url}"
        val username = "${EntiyFactory.username}"
        val password = "${EntiyFactory.password}"

        fun build(): SqlSessionFactory? {
            val dataSource = PooledDataSource(driver, url, username, password);
            val transactionFactory = JdbcTransactionFactory()
            val environment = Environment("development", transactionFactory, dataSource)
            val config = Configuration(environment)
            config.addMappers("${packagename}.mapper")
            val sqlSessionFactory = SqlSessionFactoryBuilder().build(config)
            return sqlSessionFactory
        }

        val factory = build()
    }

}

    """.trimIndent())
    factoryfile.createNewFile()

}


fun createMapperFile(path: String, list: ArrayList<TableEntity>, packagename: String) {
    /* 生成基础数据类 */
    var mapper_path = path + "mapper/"
    File(mapper_path).mkdir()
    list.forEach {
        var filename = it.table_name + ".kt"
        val file = File(mapper_path + filename)
        file.appendText("""

package ${packagename}.mapper

import ${packagename}.entity.*
import org.apache.ibatis.annotations.*

interface ${it.table_name}{

${DataManipulation.GetListALLContent(it)}

${DataManipulation.ConditionalQueryContent(it)}

${if (!IsHasPrimarykey(it)) "" else DataManipulation.ConditionalQueryByKey(it)}

${DataManipulation.InsertContent(it)}

${DataManipulation.InsertSelectiveContent(it)}

}

        """)
        file.createNewFile()

    }
}


/*
  删除文件夹内部所有递归文件
*/
fun deleteFoldFiles(path: String) {
    var pathdir = File(path)
    if (pathdir.isDirectory) {
        pathdir.list().forEach {
            val file = File(pathdir.absolutePath + "/" + it)
            if (!file.isDirectory) {
                file.delete()
            } else {
                deleteFoldFiles(file.absolutePath + "/")
                file.delete()
            }
        }
    }
}


fun TypeConvert(typelens: String): String {

    when (typelens) {
        "varchar" -> {
            return "String"
        }
        "bigint" -> {
            return "Long"
        }
        "longtext" -> {
            return "String"
        }
        "datetime" -> {
            return "Timestamp"
        }
        "int" -> {
            return "Integer"
        }
        "tinyint" -> {
            return "Integer"
        }
        "decimal" -> {
            return "BigDecimal"
        }
        "double" -> {
            return "Double"
        }
        "char" -> {
            return "String"
        }
        "text" -> {
            return "String"
        }
        "smallint" -> {
            return "Integer"
        }
        "blob" -> {
            return "ByteArray"
        }
        "date" -> {
            return "Date"
        }
        "timestamp" -> {
            return "Timestamp"
        }
        "set" -> {
            return "String"
        }
        "enum" -> {
            return "String"
        }
        "longblob" -> {
            return "ByteArray"
        }
        "mediumtext" -> {
            return "String"
        }
        "float" -> {
            return "Float"
        }
        "time" -> {
            return "Time"
        }
        else -> {
            return "String"
        }
    }

}


fun IsHasPrimarykey(table: TableEntity): Boolean {
    table.ColumnList?.forEach {
        if (it.COLUMN_KEY?.trim() == "PRI") {
            return true;
        }
    }
    return false
}


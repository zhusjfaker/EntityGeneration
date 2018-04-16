package entity.core.base

import entity.TableEntity
import mapper.Table
import java.io.File
import java.nio.charset.Charset

open class CoreLoader {

    companion object {

        fun GenerateFile(
                projectpath: String,
                driver: String,
                databasename: String,
                url: String,
                username: String,
                password: String,
                packagename: String
        ): Unit {

            /* 获取数据库 oop描述 */
            var factory = EntiyFactory(driver, url, username, password).build()
            var session = factory!!.openSession(true)
            var table_excute = session.getMapper(Table::class.java)

            var list = table_excute.GetAllTable(databasename)
            list.forEach {
                val col_list = table_excute.GetColumns(it.table_name, databasename)
                it.ColumnList = col_list
            }

            /* 初始化文件夹内容 */
            deleteFoldFiles(projectpath)
            /* 生成实体类 */
            createEntityFile(projectpath, list, packagename)
            /* 生成数据扩展类 */

            /* 生成工厂类 */
            createFactoryFile(projectpath, packagename, driver, url, username, password)

            /* 创建mapper repository */
            createMapperFile(projectpath, list, packagename)
        }

        /*
        创建实体文件
         */
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
                                " ${it.COLUMN_NAME} :${EntityUtily.TypeConvert(it.DATA_TYPE)}" +
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


        /*
        创建工厂驱动文件
         */
        fun createFactoryFile(
                path: String,
                packagename: String,
                driver: String,
                url: String,
                username: String,
                password: String
        ) {
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

        val driver = "${driver}"
        val url = "${url}"
        val username = "${username}"
        val password = "${password}"

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

        /*
        创建mapper文件
         */
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

${if (!EntityUtily.IsHasPrimarykey(it)) "" else DataManipulation.ConditionalQueryByKey(it)}

${DataManipulation.InsertContent(it)}

${DataManipulation.InsertSelectiveContent(it)}

${DataManipulation.DeleteByPrimaryKey(it)}

${DataManipulation.UpdateByPrimaryKey(it)}

${DataManipulation.UpdateByPrimaryKeySelective(it)}

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
            if (!pathdir.exists()) {
                pathdir.mkdir()
            }
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


    }

}










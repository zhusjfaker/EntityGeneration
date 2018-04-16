package entity.core.base

import entity.TableEntity
import java.sql.JDBCType

class EntityUtily {

    companion object {

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

        fun JdbcTypeConvert(typelens: String): String{
            when (typelens) {
                "varchar" -> {
                    return "varchar".toUpperCase()
                }
                "bigint" -> {
                    return "bigint".toUpperCase()
                }
                "longtext" -> {
                    return "longvarchar".toUpperCase()
                }
                "datetime" -> {
                    return "Timestamp".toUpperCase()
                }
                "int" -> {
                    return "Integer".toUpperCase()
                }
                "tinyint" -> {
                    return "Integer".toUpperCase()
                }
                "decimal" -> {
                    return "decimal".toUpperCase()
                }
                "double" -> {
                    return "Double".toUpperCase()
                }
                "char" -> {
                    return "char".toUpperCase()
                }
                "text" -> {
                    return "varchar".toUpperCase()
                }
                "smallint" -> {
                    return "Integer".toUpperCase()
                }
                "blob" -> {
                    return "blob".toUpperCase()
                }
                "date" -> {
                    return "Date".toUpperCase()
                }
                "timestamp" -> {
                    return "Timestamp".toUpperCase()
                }
                "set" -> {
                    return "varchar".toUpperCase()
                }
                "enum" -> {
                    return "varchar".toUpperCase()
                }
                "longblob" -> {
                    return "blob".toUpperCase()
                }
                "mediumtext" -> {
                    return "varchar".toUpperCase()
                }
                "float" -> {
                    return "Float".toUpperCase()
                }
                "time" -> {
                    return "Time".toUpperCase()
                }
                else -> {
                    return "varchar".toUpperCase()
                }
            }

        }
    }
}
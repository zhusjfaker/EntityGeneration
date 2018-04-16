package entity.core.base

import entity.TableEntity

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
    }
}
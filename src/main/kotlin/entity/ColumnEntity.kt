package entity

class ColumnEntity(
        var COLUMN_NAME: String,
        var IS_NULLABLE: String,
        var DATA_TYPE: String,
        var COLUMN_KEY: String,   /* PRI */
        var EXTRA: String, /* auto_increment */
        var TABLE_SCHEMA: String,
        var TABLE_NAME: String
) {

}
package entity


data class TableEntity(
        var table_name: String
) {
    var ColumnList: ArrayList<ColumnEntity>? = null
}
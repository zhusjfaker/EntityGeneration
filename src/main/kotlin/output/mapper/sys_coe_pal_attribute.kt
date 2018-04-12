

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_attribute{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "ATTRID", column = "ATTRID"),
   Result(property = "ATTRNAME", column = "ATTRNAME"),
   Result(property = "ATTRVALUE", column = "ATTRVALUE"),
   Result(property = "CATEGORY", column = "CATEGORY"),
   Result(property = "METHODID", column = "METHODID"),
   Result(property = "TYPE", column = "TYPE"),
   Result(property = "ISDELETE", column = "ISDELETE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_attribute
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_attribute_dto>
        


}

        
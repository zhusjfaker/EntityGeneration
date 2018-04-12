

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_usergroup{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "GROUPCODE", column = "GROUPCODE"),
   Result(property = "CATEGORY", column = "CATEGORY"),
   Result(property = "GROUPNAME", column = "GROUPNAME"),
   Result(property = "GROUPDESC", column = "GROUPDESC"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATEDATE", column = "CREATEDATE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_usergroup
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_usergroup_dto>
        


}

        
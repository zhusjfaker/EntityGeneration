

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_usergroup_role{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "GROUPID", column = "GROUPID"),
   Result(property = "ROLEID", column = "ROLEID")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_usergroup_role
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_usergroup_role_dto>
        


}

        
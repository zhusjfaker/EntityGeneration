

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_team_perm{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TEAMID", column = "TEAMID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "PERMTYPE", column = "PERMTYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID")
)
@Select("""<script>
   SELECT * FROM sys_coe_team_perm
</script>""")
fun GetListAll():ArrayList<sys_coe_team_perm_dto>
        


}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_teammember_perm{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TEAMID", column = "TEAMID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "ACTIONTYPE", column = "ACTIONTYPE")
)
@Select("""<script>
   SELECT * FROM sys_coe_teammember_perm
</script>""")
fun GetListAll():ArrayList<sys_coe_teammember_perm_dto>
        


}

        
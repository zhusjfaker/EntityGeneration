

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_workspace{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSNAME", column = "WSNAME"),
   Result(property = "WSDM", column = "WSDM"),
   Result(property = "WSADMIN", column = "WSADMIN"),
   Result(property = "WSDESC", column = "WSDESC"),
   Result(property = "WSSTATE", column = "WSSTATE"),
   Result(property = "WSORGTYPE", column = "WSORGTYPE"),
   Result(property = "WSTCTYPE", column = "WSTCTYPE"),
   Result(property = "WSBGURL", column = "WSBGURL"),
   Result(property = "WSORDERINDEX", column = "WSORDERINDEX"),
   Result(property = "WSVER", column = "WSVER"),
   Result(property = "WSVERSIONUUID", column = "WSVERSIONUUID"),
   Result(property = "ISUSE", column = "ISUSE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_workspace
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_workspace_dto>
        


}

        
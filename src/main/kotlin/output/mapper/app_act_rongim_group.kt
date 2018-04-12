

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_rongim_group{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "GROUPNAME", column = "GROUPNAME"),
   Result(property = "GROUPDESC", column = "GROUPDESC"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "UPDATETIME", column = "UPDATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_rongim_group
</script>""")
fun GetListAll():ArrayList<app_act_rongim_group_dto>
        


}

        
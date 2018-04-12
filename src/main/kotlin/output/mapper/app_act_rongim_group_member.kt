

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_rongim_group_member{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "GROUPID", column = "GROUPID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "ISMANAGER", column = "ISMANAGER"),
   Result(property = "STOPNOTIFY", column = "STOPNOTIFY"),
   Result(property = "ISTOP", column = "ISTOP")
)
@Select("""<script>
   SELECT * FROM app_act_rongim_group_member
</script>""")
fun GetListAll():ArrayList<app_act_rongim_group_member_dto>
        


}

        
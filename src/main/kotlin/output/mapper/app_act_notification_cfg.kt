

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_notification_cfg{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ISCLOSE", column = "ISCLOSE"),
   Result(property = "ISSTORE", column = "ISSTORE")
)
@Select("""<script>
   SELECT * FROM app_act_notification_cfg
</script>""")
fun GetListAll():ArrayList<app_act_notification_cfg_dto>
        


}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface qrtz_paused_trigger_grps{


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "TRIGGER_GROUP", column = "TRIGGER_GROUP")
)
@Select("""<script>
   SELECT * FROM qrtz_paused_trigger_grps
</script>""")
fun GetListAll():ArrayList<qrtz_paused_trigger_grps_dto>
        


}

        
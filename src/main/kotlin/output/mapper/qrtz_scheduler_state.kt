

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface qrtz_scheduler_state{


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "INSTANCE_NAME", column = "INSTANCE_NAME"),
   Result(property = "LAST_CHECKIN_TIME", column = "LAST_CHECKIN_TIME"),
   Result(property = "CHECKIN_INTERVAL", column = "CHECKIN_INTERVAL")
)
@Select("""<script>
   SELECT * FROM qrtz_scheduler_state
</script>""")
fun GetListAll():ArrayList<qrtz_scheduler_state_dto>
        


}

        
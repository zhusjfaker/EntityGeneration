

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface qrtz_cron_triggers{


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "TRIGGER_NAME", column = "TRIGGER_NAME"),
   Result(property = "TRIGGER_GROUP", column = "TRIGGER_GROUP"),
   Result(property = "CRON_EXPRESSION", column = "CRON_EXPRESSION"),
   Result(property = "TIME_ZONE_ID", column = "TIME_ZONE_ID")
)
@Select("""<script>
   SELECT * FROM qrtz_cron_triggers
</script>""")
fun GetListAll():ArrayList<qrtz_cron_triggers_dto>
        


}

        
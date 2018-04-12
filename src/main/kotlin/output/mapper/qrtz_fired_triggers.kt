

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface qrtz_fired_triggers{


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "ENTRY_ID", column = "ENTRY_ID"),
   Result(property = "TRIGGER_NAME", column = "TRIGGER_NAME"),
   Result(property = "TRIGGER_GROUP", column = "TRIGGER_GROUP"),
   Result(property = "INSTANCE_NAME", column = "INSTANCE_NAME"),
   Result(property = "FIRED_TIME", column = "FIRED_TIME"),
   Result(property = "SCHED_TIME", column = "SCHED_TIME"),
   Result(property = "PRIORITY", column = "PRIORITY"),
   Result(property = "STATE", column = "STATE"),
   Result(property = "JOB_NAME", column = "JOB_NAME"),
   Result(property = "JOB_GROUP", column = "JOB_GROUP"),
   Result(property = "IS_NONCONCURRENT", column = "IS_NONCONCURRENT"),
   Result(property = "REQUESTS_RECOVERY", column = "REQUESTS_RECOVERY")
)
@Select("""<script>
   SELECT * FROM qrtz_fired_triggers
</script>""")
fun GetListAll():ArrayList<qrtz_fired_triggers_dto>
        


}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface qrtz_triggers{


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "TRIGGER_NAME", column = "TRIGGER_NAME"),
   Result(property = "TRIGGER_GROUP", column = "TRIGGER_GROUP"),
   Result(property = "JOB_NAME", column = "JOB_NAME"),
   Result(property = "JOB_GROUP", column = "JOB_GROUP"),
   Result(property = "DESCRIPTION", column = "DESCRIPTION"),
   Result(property = "NEXT_FIRE_TIME", column = "NEXT_FIRE_TIME"),
   Result(property = "PREV_FIRE_TIME", column = "PREV_FIRE_TIME"),
   Result(property = "PRIORITY", column = "PRIORITY"),
   Result(property = "TRIGGER_STATE", column = "TRIGGER_STATE"),
   Result(property = "TRIGGER_TYPE", column = "TRIGGER_TYPE"),
   Result(property = "START_TIME", column = "START_TIME"),
   Result(property = "END_TIME", column = "END_TIME"),
   Result(property = "CALENDAR_NAME", column = "CALENDAR_NAME"),
   Result(property = "MISFIRE_INSTR", column = "MISFIRE_INSTR"),
   Result(property = "JOB_DATA", column = "JOB_DATA")
)
@Select("""<script>
   SELECT * FROM qrtz_triggers
</script>""")
fun GetListAll():ArrayList<qrtz_triggers_dto>
        


}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface qrtz_simple_triggers{


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "TRIGGER_NAME", column = "TRIGGER_NAME"),
   Result(property = "TRIGGER_GROUP", column = "TRIGGER_GROUP"),
   Result(property = "REPEAT_COUNT", column = "REPEAT_COUNT"),
   Result(property = "REPEAT_INTERVAL", column = "REPEAT_INTERVAL"),
   Result(property = "TIMES_TRIGGERED", column = "TIMES_TRIGGERED")
)
@Select("""<script>
   SELECT * FROM qrtz_simple_triggers
</script>""")
fun GetListAll():ArrayList<qrtz_simple_triggers_dto>
        


}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface qrtz_simprop_triggers{


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "TRIGGER_NAME", column = "TRIGGER_NAME"),
   Result(property = "TRIGGER_GROUP", column = "TRIGGER_GROUP"),
   Result(property = "STR_PROP_1", column = "STR_PROP_1"),
   Result(property = "STR_PROP_2", column = "STR_PROP_2"),
   Result(property = "STR_PROP_3", column = "STR_PROP_3"),
   Result(property = "INT_PROP_1", column = "INT_PROP_1"),
   Result(property = "INT_PROP_2", column = "INT_PROP_2"),
   Result(property = "LONG_PROP_1", column = "LONG_PROP_1"),
   Result(property = "LONG_PROP_2", column = "LONG_PROP_2"),
   Result(property = "DEC_PROP_1", column = "DEC_PROP_1"),
   Result(property = "DEC_PROP_2", column = "DEC_PROP_2"),
   Result(property = "BOOL_PROP_1", column = "BOOL_PROP_1"),
   Result(property = "BOOL_PROP_2", column = "BOOL_PROP_2")
)
@Select("""<script>
   SELECT * FROM qrtz_simprop_triggers
</script>""")
fun GetListAll():ArrayList<qrtz_simprop_triggers_dto>
        


}

        
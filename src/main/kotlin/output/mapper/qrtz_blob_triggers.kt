

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface qrtz_blob_triggers{


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "TRIGGER_NAME", column = "TRIGGER_NAME"),
   Result(property = "TRIGGER_GROUP", column = "TRIGGER_GROUP"),
   Result(property = "BLOB_DATA", column = "BLOB_DATA")
)
@Select("""<script>
   SELECT * FROM qrtz_blob_triggers
</script>""")
fun GetListAll():ArrayList<qrtz_blob_triggers_dto>
        


}

        
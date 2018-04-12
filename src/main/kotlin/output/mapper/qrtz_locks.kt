

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface qrtz_locks{


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "LOCK_NAME", column = "LOCK_NAME")
)
@Select("""<script>
   SELECT * FROM qrtz_locks
</script>""")
fun GetListAll():ArrayList<qrtz_locks_dto>
        


}

        
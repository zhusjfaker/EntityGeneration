

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface qrtz_calendars{


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "CALENDAR_NAME", column = "CALENDAR_NAME"),
   Result(property = "CALENDAR", column = "CALENDAR")
)
@Select("""<script>
   SELECT * FROM qrtz_calendars
</script>""")
fun GetListAll():ArrayList<qrtz_calendars_dto>
        


}

        
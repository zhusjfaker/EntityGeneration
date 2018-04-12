

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
        


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "CALENDAR_NAME", column = "CALENDAR_NAME"),
   Result(property = "CALENDAR", column = "CALENDAR")
)
@Select("""<script>
   SELECT * FROM qrtz_calendars
   <where>
   <if test="SCHED_NAME!=null">
      SCHED_NAME=#{SCHED_NAME}
   </if> 
   <if test="CALENDAR_NAME!=null">
      CALENDAR_NAME=#{CALENDAR_NAME}
   </if> 
   <if test="CALENDAR!=null">
      CALENDAR=#{CALENDAR}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:qrtz_calendars_dto):ArrayList<qrtz_calendars_dto>
                


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "CALENDAR_NAME", column = "CALENDAR_NAME"),
   Result(property = "CALENDAR", column = "CALENDAR")
)
@Select("""<script>
   SELECT * FROM qrtz_calendars
   <where>
   <if test="SCHED_NAME!=null">
      SCHED_NAME=#{SCHED_NAME}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:qrtz_calendars_dto):qrtz_calendars_dto?
                


@Insert("""<script>
    insert into TStudent
    (SCHED_NAME,CALENDAR_NAME,CALENDAR)
    values
    (#{SCHED_NAME},#{CALENDAR_NAME},#{CALENDAR})
</script>""")
fun insert(model:qrtz_calendars_dto):Unit
                

}

        
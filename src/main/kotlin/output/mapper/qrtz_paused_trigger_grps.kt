

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface qrtz_paused_trigger_grps{


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "TRIGGER_GROUP", column = "TRIGGER_GROUP")
)
@Select("""<script>
   SELECT * FROM qrtz_paused_trigger_grps
</script>""")
fun GetListAll():ArrayList<qrtz_paused_trigger_grps_dto>
        


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "TRIGGER_GROUP", column = "TRIGGER_GROUP")
)
@Select("""<script>
   SELECT * FROM qrtz_paused_trigger_grps
   <where>
   <if test="SCHED_NAME!=null">
      SCHED_NAME=#{SCHED_NAME}
   </if> 
   <if test="TRIGGER_GROUP!=null">
      TRIGGER_GROUP=#{TRIGGER_GROUP}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:qrtz_paused_trigger_grps_dto):ArrayList<qrtz_paused_trigger_grps_dto>
                


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "TRIGGER_GROUP", column = "TRIGGER_GROUP")
)
@Select("""<script>
   SELECT * FROM qrtz_paused_trigger_grps
   <where>
   <if test="SCHED_NAME!=null">
      SCHED_NAME=#{SCHED_NAME}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:qrtz_paused_trigger_grps_dto):qrtz_paused_trigger_grps_dto?
                


@Insert("""<script>
    insert into TStudent
    (SCHED_NAME,TRIGGER_GROUP)
    values
    (#{SCHED_NAME},#{TRIGGER_GROUP})
</script>""")
fun insert(model:qrtz_paused_trigger_grps_dto):Unit
                

}

        
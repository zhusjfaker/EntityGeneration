

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
        


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "TRIGGER_NAME", column = "TRIGGER_NAME"),
   Result(property = "TRIGGER_GROUP", column = "TRIGGER_GROUP"),
   Result(property = "CRON_EXPRESSION", column = "CRON_EXPRESSION"),
   Result(property = "TIME_ZONE_ID", column = "TIME_ZONE_ID")
)
@Select("""<script>
   SELECT * FROM qrtz_cron_triggers
   <where>
   <if test="SCHED_NAME!=null">
      SCHED_NAME=#{SCHED_NAME}
   </if> 
   <if test="TRIGGER_NAME!=null">
      TRIGGER_NAME=#{TRIGGER_NAME}
   </if> 
   <if test="TRIGGER_GROUP!=null">
      TRIGGER_GROUP=#{TRIGGER_GROUP}
   </if> 
   <if test="CRON_EXPRESSION!=null">
      CRON_EXPRESSION=#{CRON_EXPRESSION}
   </if> 
   <if test="TIME_ZONE_ID!=null">
      TIME_ZONE_ID=#{TIME_ZONE_ID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:qrtz_cron_triggers_dto):ArrayList<qrtz_cron_triggers_dto>
                


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "TRIGGER_NAME", column = "TRIGGER_NAME"),
   Result(property = "TRIGGER_GROUP", column = "TRIGGER_GROUP"),
   Result(property = "CRON_EXPRESSION", column = "CRON_EXPRESSION"),
   Result(property = "TIME_ZONE_ID", column = "TIME_ZONE_ID")
)
@Select("""<script>
   SELECT * FROM qrtz_cron_triggers
   <where>
   <if test="SCHED_NAME!=null">
      SCHED_NAME=#{SCHED_NAME}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:qrtz_cron_triggers_dto):qrtz_cron_triggers_dto?
                


@Insert("""<script>
    insert into TStudent
    (SCHED_NAME,TRIGGER_NAME,TRIGGER_GROUP,CRON_EXPRESSION,TIME_ZONE_ID)
    values
    (#{SCHED_NAME},#{TRIGGER_NAME},#{TRIGGER_GROUP},#{CRON_EXPRESSION},#{TIME_ZONE_ID})
</script>""")
fun insert(model:qrtz_cron_triggers_dto):Unit
                

}

        
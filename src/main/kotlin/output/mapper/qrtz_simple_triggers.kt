

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
   <if test="REPEAT_COUNT!=null">
      REPEAT_COUNT=#{REPEAT_COUNT}
   </if> 
   <if test="REPEAT_INTERVAL!=null">
      REPEAT_INTERVAL=#{REPEAT_INTERVAL}
   </if> 
   <if test="TIMES_TRIGGERED!=null">
      TIMES_TRIGGERED=#{TIMES_TRIGGERED}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:qrtz_simple_triggers_dto):ArrayList<qrtz_simple_triggers_dto>
                


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
   <where>
   <if test="SCHED_NAME!=null">
      SCHED_NAME=#{SCHED_NAME}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:qrtz_simple_triggers_dto):qrtz_simple_triggers_dto?
                


@Insert("""<script>
    insert into TStudent
    (SCHED_NAME,TRIGGER_NAME,TRIGGER_GROUP,REPEAT_COUNT,REPEAT_INTERVAL,TIMES_TRIGGERED)
    values
    (#{SCHED_NAME},#{TRIGGER_NAME},#{TRIGGER_GROUP},#{REPEAT_COUNT},#{REPEAT_INTERVAL},#{TIMES_TRIGGERED})
</script>""")
fun insert(model:qrtz_simple_triggers_dto):Unit
                

}

        
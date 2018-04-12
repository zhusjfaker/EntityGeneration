

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
   <if test="JOB_NAME!=null">
      JOB_NAME=#{JOB_NAME}
   </if> 
   <if test="JOB_GROUP!=null">
      JOB_GROUP=#{JOB_GROUP}
   </if> 
   <if test="DESCRIPTION!=null">
      DESCRIPTION=#{DESCRIPTION}
   </if> 
   <if test="NEXT_FIRE_TIME!=null">
      NEXT_FIRE_TIME=#{NEXT_FIRE_TIME}
   </if> 
   <if test="PREV_FIRE_TIME!=null">
      PREV_FIRE_TIME=#{PREV_FIRE_TIME}
   </if> 
   <if test="PRIORITY!=null">
      PRIORITY=#{PRIORITY}
   </if> 
   <if test="TRIGGER_STATE!=null">
      TRIGGER_STATE=#{TRIGGER_STATE}
   </if> 
   <if test="TRIGGER_TYPE!=null">
      TRIGGER_TYPE=#{TRIGGER_TYPE}
   </if> 
   <if test="START_TIME!=null">
      START_TIME=#{START_TIME}
   </if> 
   <if test="END_TIME!=null">
      END_TIME=#{END_TIME}
   </if> 
   <if test="CALENDAR_NAME!=null">
      CALENDAR_NAME=#{CALENDAR_NAME}
   </if> 
   <if test="MISFIRE_INSTR!=null">
      MISFIRE_INSTR=#{MISFIRE_INSTR}
   </if> 
   <if test="JOB_DATA!=null">
      JOB_DATA=#{JOB_DATA}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:qrtz_triggers_dto):ArrayList<qrtz_triggers_dto>
                


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
   <where>
   <if test="SCHED_NAME!=null">
      SCHED_NAME=#{SCHED_NAME}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:qrtz_triggers_dto):qrtz_triggers_dto?
                


@Insert("""<script>
    insert into TStudent
    (SCHED_NAME,TRIGGER_NAME,TRIGGER_GROUP,JOB_NAME,JOB_GROUP,DESCRIPTION,NEXT_FIRE_TIME,PREV_FIRE_TIME,PRIORITY,TRIGGER_STATE,TRIGGER_TYPE,START_TIME,END_TIME,CALENDAR_NAME,MISFIRE_INSTR,JOB_DATA)
    values
    (#{SCHED_NAME},#{TRIGGER_NAME},#{TRIGGER_GROUP},#{JOB_NAME},#{JOB_GROUP},#{DESCRIPTION},#{NEXT_FIRE_TIME},#{PREV_FIRE_TIME},#{PRIORITY},#{TRIGGER_STATE},#{TRIGGER_TYPE},#{START_TIME},#{END_TIME},#{CALENDAR_NAME},#{MISFIRE_INSTR},#{JOB_DATA})
</script>""")
fun insert(model:qrtz_triggers_dto):Unit
                

}

        
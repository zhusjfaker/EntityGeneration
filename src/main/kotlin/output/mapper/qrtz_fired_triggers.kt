

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface qrtz_fired_triggers{


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "ENTRY_ID", column = "ENTRY_ID"),
   Result(property = "TRIGGER_NAME", column = "TRIGGER_NAME"),
   Result(property = "TRIGGER_GROUP", column = "TRIGGER_GROUP"),
   Result(property = "INSTANCE_NAME", column = "INSTANCE_NAME"),
   Result(property = "FIRED_TIME", column = "FIRED_TIME"),
   Result(property = "SCHED_TIME", column = "SCHED_TIME"),
   Result(property = "PRIORITY", column = "PRIORITY"),
   Result(property = "STATE", column = "STATE"),
   Result(property = "JOB_NAME", column = "JOB_NAME"),
   Result(property = "JOB_GROUP", column = "JOB_GROUP"),
   Result(property = "IS_NONCONCURRENT", column = "IS_NONCONCURRENT"),
   Result(property = "REQUESTS_RECOVERY", column = "REQUESTS_RECOVERY")
)
@Select("""<script>
   SELECT * FROM qrtz_fired_triggers
</script>""")
fun GetListAll():ArrayList<qrtz_fired_triggers_dto>
        


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "ENTRY_ID", column = "ENTRY_ID"),
   Result(property = "TRIGGER_NAME", column = "TRIGGER_NAME"),
   Result(property = "TRIGGER_GROUP", column = "TRIGGER_GROUP"),
   Result(property = "INSTANCE_NAME", column = "INSTANCE_NAME"),
   Result(property = "FIRED_TIME", column = "FIRED_TIME"),
   Result(property = "SCHED_TIME", column = "SCHED_TIME"),
   Result(property = "PRIORITY", column = "PRIORITY"),
   Result(property = "STATE", column = "STATE"),
   Result(property = "JOB_NAME", column = "JOB_NAME"),
   Result(property = "JOB_GROUP", column = "JOB_GROUP"),
   Result(property = "IS_NONCONCURRENT", column = "IS_NONCONCURRENT"),
   Result(property = "REQUESTS_RECOVERY", column = "REQUESTS_RECOVERY")
)
@Select("""<script>
   SELECT * FROM qrtz_fired_triggers
   <where>
   <if test="SCHED_NAME!=null">
      SCHED_NAME=#{SCHED_NAME}
   </if> 
   <if test="ENTRY_ID!=null">
      ENTRY_ID=#{ENTRY_ID}
   </if> 
   <if test="TRIGGER_NAME!=null">
      TRIGGER_NAME=#{TRIGGER_NAME}
   </if> 
   <if test="TRIGGER_GROUP!=null">
      TRIGGER_GROUP=#{TRIGGER_GROUP}
   </if> 
   <if test="INSTANCE_NAME!=null">
      INSTANCE_NAME=#{INSTANCE_NAME}
   </if> 
   <if test="FIRED_TIME!=null">
      FIRED_TIME=#{FIRED_TIME}
   </if> 
   <if test="SCHED_TIME!=null">
      SCHED_TIME=#{SCHED_TIME}
   </if> 
   <if test="PRIORITY!=null">
      PRIORITY=#{PRIORITY}
   </if> 
   <if test="STATE!=null">
      STATE=#{STATE}
   </if> 
   <if test="JOB_NAME!=null">
      JOB_NAME=#{JOB_NAME}
   </if> 
   <if test="JOB_GROUP!=null">
      JOB_GROUP=#{JOB_GROUP}
   </if> 
   <if test="IS_NONCONCURRENT!=null">
      IS_NONCONCURRENT=#{IS_NONCONCURRENT}
   </if> 
   <if test="REQUESTS_RECOVERY!=null">
      REQUESTS_RECOVERY=#{REQUESTS_RECOVERY}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:qrtz_fired_triggers_dto):ArrayList<qrtz_fired_triggers_dto>
                


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "ENTRY_ID", column = "ENTRY_ID"),
   Result(property = "TRIGGER_NAME", column = "TRIGGER_NAME"),
   Result(property = "TRIGGER_GROUP", column = "TRIGGER_GROUP"),
   Result(property = "INSTANCE_NAME", column = "INSTANCE_NAME"),
   Result(property = "FIRED_TIME", column = "FIRED_TIME"),
   Result(property = "SCHED_TIME", column = "SCHED_TIME"),
   Result(property = "PRIORITY", column = "PRIORITY"),
   Result(property = "STATE", column = "STATE"),
   Result(property = "JOB_NAME", column = "JOB_NAME"),
   Result(property = "JOB_GROUP", column = "JOB_GROUP"),
   Result(property = "IS_NONCONCURRENT", column = "IS_NONCONCURRENT"),
   Result(property = "REQUESTS_RECOVERY", column = "REQUESTS_RECOVERY")
)
@Select("""<script>
   SELECT * FROM qrtz_fired_triggers
   <where>
   <if test="SCHED_NAME!=null">
      SCHED_NAME=#{SCHED_NAME}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:qrtz_fired_triggers_dto):qrtz_fired_triggers_dto?
                


@Insert("""<script>
    insert into qrtz_fired_triggers
    (SCHED_NAME,ENTRY_ID,TRIGGER_NAME,TRIGGER_GROUP,INSTANCE_NAME,FIRED_TIME,SCHED_TIME,PRIORITY,STATE,JOB_NAME,JOB_GROUP,IS_NONCONCURRENT,REQUESTS_RECOVERY)
    values
    (#{SCHED_NAME},#{ENTRY_ID},#{TRIGGER_NAME},#{TRIGGER_GROUP},#{INSTANCE_NAME},#{FIRED_TIME},#{SCHED_TIME},#{PRIORITY},#{STATE},#{JOB_NAME},#{JOB_GROUP},#{IS_NONCONCURRENT},#{REQUESTS_RECOVERY})
</script>""")
fun Insert(model:qrtz_fired_triggers_dto):Unit
                


@Insert("""<script>
    insert into qrtz_fired_triggers
    <trim prefix="(" suffix=")" suffixOverrides="," >
           SCHED_NAME,
           ENTRY_ID,
           TRIGGER_NAME,
           TRIGGER_GROUP,
           INSTANCE_NAME,
           FIRED_TIME,
           SCHED_TIME,
           PRIORITY,
           STATE,
        <if test='JOB_NAME!= null'> 
           JOB_NAME,
        </if>
        <if test='JOB_GROUP!= null'> 
           JOB_GROUP,
        </if>
        <if test='IS_NONCONCURRENT!= null'> 
           IS_NONCONCURRENT,
        </if>
        <if test='REQUESTS_RECOVERY!= null'> 
           REQUESTS_RECOVERY
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{SCHED_NAME,jdbcType=varchar}，
           #{ENTRY_ID,jdbcType=varchar}，
           #{TRIGGER_NAME,jdbcType=varchar}，
           #{TRIGGER_GROUP,jdbcType=varchar}，
           #{INSTANCE_NAME,jdbcType=varchar}，
           #{FIRED_TIME,jdbcType=bigint}，
           #{SCHED_TIME,jdbcType=bigint}，
           #{PRIORITY,jdbcType=int}，
           #{STATE,jdbcType=varchar}，
        <if test='JOB_NAME!= null'> 
           #{JOB_NAME,jdbcType=varchar}，
        </if>
        <if test='JOB_GROUP!= null'> 
           #{JOB_GROUP,jdbcType=varchar}，
        </if>
        <if test='IS_NONCONCURRENT!= null'> 
           #{IS_NONCONCURRENT,jdbcType=varchar}，
        </if>
        <if test='REQUESTS_RECOVERY!= null'> 
           #{REQUESTS_RECOVERY,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:qrtz_fired_triggers_dto):Unit
                

}

        
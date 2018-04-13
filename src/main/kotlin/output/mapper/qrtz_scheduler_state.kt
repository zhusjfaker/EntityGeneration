

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface qrtz_scheduler_state{


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "INSTANCE_NAME", column = "INSTANCE_NAME"),
   Result(property = "LAST_CHECKIN_TIME", column = "LAST_CHECKIN_TIME"),
   Result(property = "CHECKIN_INTERVAL", column = "CHECKIN_INTERVAL")
)
@Select("""<script>
   SELECT * FROM qrtz_scheduler_state
</script>""")
fun GetListAll():ArrayList<qrtz_scheduler_state_dto>
        


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "INSTANCE_NAME", column = "INSTANCE_NAME"),
   Result(property = "LAST_CHECKIN_TIME", column = "LAST_CHECKIN_TIME"),
   Result(property = "CHECKIN_INTERVAL", column = "CHECKIN_INTERVAL")
)
@Select("""<script>
   SELECT * FROM qrtz_scheduler_state
   <where>
   <if test="SCHED_NAME!=null">
      SCHED_NAME=#{SCHED_NAME}
   </if> 
   <if test="INSTANCE_NAME!=null">
      INSTANCE_NAME=#{INSTANCE_NAME}
   </if> 
   <if test="LAST_CHECKIN_TIME!=null">
      LAST_CHECKIN_TIME=#{LAST_CHECKIN_TIME}
   </if> 
   <if test="CHECKIN_INTERVAL!=null">
      CHECKIN_INTERVAL=#{CHECKIN_INTERVAL}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:qrtz_scheduler_state_dto):ArrayList<qrtz_scheduler_state_dto>
                


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "INSTANCE_NAME", column = "INSTANCE_NAME"),
   Result(property = "LAST_CHECKIN_TIME", column = "LAST_CHECKIN_TIME"),
   Result(property = "CHECKIN_INTERVAL", column = "CHECKIN_INTERVAL")
)
@Select("""<script>
   SELECT * FROM qrtz_scheduler_state
   <where>
   <if test="SCHED_NAME!=null">
      SCHED_NAME=#{SCHED_NAME}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:qrtz_scheduler_state_dto):qrtz_scheduler_state_dto?
                


@Insert("""<script>
    insert into qrtz_scheduler_state
    (SCHED_NAME,INSTANCE_NAME,LAST_CHECKIN_TIME,CHECKIN_INTERVAL)
    values
    (#{SCHED_NAME},#{INSTANCE_NAME},#{LAST_CHECKIN_TIME},#{CHECKIN_INTERVAL})
</script>""")
fun Insert(model:qrtz_scheduler_state_dto):Unit
                


@Insert("""<script>
    insert into qrtz_scheduler_state
    <trim prefix="(" suffix=")" suffixOverrides="," >
           SCHED_NAME,
           INSTANCE_NAME,
           LAST_CHECKIN_TIME,
           CHECKIN_INTERVAL
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{SCHED_NAME,jdbcType=varchar}，
           #{INSTANCE_NAME,jdbcType=varchar}，
           #{LAST_CHECKIN_TIME,jdbcType=bigint}，
           #{CHECKIN_INTERVAL,jdbcType=bigint}
    </trim>
</script>""")
fun InsertSelective(model:qrtz_scheduler_state_dto):Unit
                

}

        


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
    insert into qrtz_paused_trigger_grps
    (SCHED_NAME,TRIGGER_GROUP)
    values
    (#{SCHED_NAME},#{TRIGGER_GROUP})
</script>""")
fun Insert(model:qrtz_paused_trigger_grps_dto):Unit
                


@Insert("""<script>
    insert into qrtz_paused_trigger_grps
    <trim prefix="(" suffix=")" suffixOverrides="," >
           SCHED_NAME,
           TRIGGER_GROUP
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{SCHED_NAME,jdbcType=varchar}，
           #{TRIGGER_GROUP,jdbcType=varchar}
    </trim>
</script>""")
fun InsertSelective(model:qrtz_paused_trigger_grps_dto):Unit
                

}

        
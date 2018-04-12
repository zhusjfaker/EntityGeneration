

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
        


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "LOCK_NAME", column = "LOCK_NAME")
)
@Select("""<script>
   SELECT * FROM qrtz_locks
   <where>
   <if test="SCHED_NAME!=null">
      SCHED_NAME=#{SCHED_NAME}
   </if> 
   <if test="LOCK_NAME!=null">
      LOCK_NAME=#{LOCK_NAME}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:qrtz_locks_dto):ArrayList<qrtz_locks_dto>
                


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "LOCK_NAME", column = "LOCK_NAME")
)
@Select("""<script>
   SELECT * FROM qrtz_locks
   <where>
   <if test="SCHED_NAME!=null">
      SCHED_NAME=#{SCHED_NAME}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:qrtz_locks_dto):qrtz_locks_dto?
                


@Insert("""<script>
    insert into TStudent
    (SCHED_NAME,LOCK_NAME)
    values
    (#{SCHED_NAME},#{LOCK_NAME})
</script>""")
fun insert(model:qrtz_locks_dto):Unit
                

}

        
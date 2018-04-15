

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
    insert into qrtz_locks
    (SCHED_NAME,LOCK_NAME)
    values
    (#{SCHED_NAME},#{LOCK_NAME})
</script>""")
fun Insert(model:qrtz_locks_dto):Unit
                


@Insert("""<script>
    insert into qrtz_locks
    <trim prefix="(" suffix=")" suffixOverrides="," >
           SCHED_NAME,
           LOCK_NAME
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{SCHED_NAME,jdbcType=varchar}，
           #{LOCK_NAME,jdbcType=varchar}
    </trim>
</script>""")
fun InsertSelective(model:qrtz_locks_dto):Unit
                


@Delete("DELETE FROM qrtz_locks WHERE SCHED_NAME=#{arg0}")
fun DeleteByPrimaryKey(SCHED_NAME:String)
        

@Update("""<script>
        UPDATE qrtz_locks SET
        SCHED_NAME=#{SCHED_NAME,jdbcType=String},
        LOCK_NAME=#{LOCK_NAME,jdbcType=String}
        WHERE SCHED_NAME=#{SCHED_NAME,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:qrtz_locks_dto)
        

@Update("""<script>
            UPDATE qrtz_locks SET
            <if test="SCHED_NAME != null">  SCHED_NAME=#{SCHED_NAME,jdbcType=String},</if>
        <if test="LOCK_NAME != null">  LOCK_NAME=#{LOCK_NAME,jdbcType=String}
              WHERE SCHED_NAME=#{SCHED_NAME,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:qrtz_locks_dto)
            

}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface qrtz_blob_triggers{


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "TRIGGER_NAME", column = "TRIGGER_NAME"),
   Result(property = "TRIGGER_GROUP", column = "TRIGGER_GROUP"),
   Result(property = "BLOB_DATA", column = "BLOB_DATA")
)
@Select("""<script>
   SELECT * FROM qrtz_blob_triggers
</script>""")
fun GetListAll():ArrayList<qrtz_blob_triggers_dto>
        


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "TRIGGER_NAME", column = "TRIGGER_NAME"),
   Result(property = "TRIGGER_GROUP", column = "TRIGGER_GROUP"),
   Result(property = "BLOB_DATA", column = "BLOB_DATA")
)
@Select("""<script>
   SELECT * FROM qrtz_blob_triggers
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
   <if test="BLOB_DATA!=null">
      BLOB_DATA=#{BLOB_DATA}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:qrtz_blob_triggers_dto):ArrayList<qrtz_blob_triggers_dto>
                


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "TRIGGER_NAME", column = "TRIGGER_NAME"),
   Result(property = "TRIGGER_GROUP", column = "TRIGGER_GROUP"),
   Result(property = "BLOB_DATA", column = "BLOB_DATA")
)
@Select("""<script>
   SELECT * FROM qrtz_blob_triggers
   <where>
   <if test="SCHED_NAME!=null">
      SCHED_NAME=#{SCHED_NAME}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:qrtz_blob_triggers_dto):qrtz_blob_triggers_dto?
                


@Insert("""<script>
    insert into TStudent
    (SCHED_NAME,TRIGGER_NAME,TRIGGER_GROUP,BLOB_DATA)
    values
    (#{SCHED_NAME},#{TRIGGER_NAME},#{TRIGGER_GROUP},#{BLOB_DATA})
</script>""")
fun insert(model:qrtz_blob_triggers_dto):Unit
                

}

        
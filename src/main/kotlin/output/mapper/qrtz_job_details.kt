

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface qrtz_job_details{


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "JOB_NAME", column = "JOB_NAME"),
   Result(property = "JOB_GROUP", column = "JOB_GROUP"),
   Result(property = "DESCRIPTION", column = "DESCRIPTION"),
   Result(property = "JOB_CLASS_NAME", column = "JOB_CLASS_NAME"),
   Result(property = "IS_DURABLE", column = "IS_DURABLE"),
   Result(property = "IS_NONCONCURRENT", column = "IS_NONCONCURRENT"),
   Result(property = "IS_UPDATE_DATA", column = "IS_UPDATE_DATA"),
   Result(property = "REQUESTS_RECOVERY", column = "REQUESTS_RECOVERY"),
   Result(property = "JOB_DATA", column = "JOB_DATA")
)
@Select("""<script>
   SELECT * FROM qrtz_job_details
</script>""")
fun GetListAll():ArrayList<qrtz_job_details_dto>
        


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "JOB_NAME", column = "JOB_NAME"),
   Result(property = "JOB_GROUP", column = "JOB_GROUP"),
   Result(property = "DESCRIPTION", column = "DESCRIPTION"),
   Result(property = "JOB_CLASS_NAME", column = "JOB_CLASS_NAME"),
   Result(property = "IS_DURABLE", column = "IS_DURABLE"),
   Result(property = "IS_NONCONCURRENT", column = "IS_NONCONCURRENT"),
   Result(property = "IS_UPDATE_DATA", column = "IS_UPDATE_DATA"),
   Result(property = "REQUESTS_RECOVERY", column = "REQUESTS_RECOVERY"),
   Result(property = "JOB_DATA", column = "JOB_DATA")
)
@Select("""<script>
   SELECT * FROM qrtz_job_details
   <where>
   <if test="SCHED_NAME!=null">
      SCHED_NAME=#{SCHED_NAME}
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
   <if test="JOB_CLASS_NAME!=null">
      JOB_CLASS_NAME=#{JOB_CLASS_NAME}
   </if> 
   <if test="IS_DURABLE!=null">
      IS_DURABLE=#{IS_DURABLE}
   </if> 
   <if test="IS_NONCONCURRENT!=null">
      IS_NONCONCURRENT=#{IS_NONCONCURRENT}
   </if> 
   <if test="IS_UPDATE_DATA!=null">
      IS_UPDATE_DATA=#{IS_UPDATE_DATA}
   </if> 
   <if test="REQUESTS_RECOVERY!=null">
      REQUESTS_RECOVERY=#{REQUESTS_RECOVERY}
   </if> 
   <if test="JOB_DATA!=null">
      JOB_DATA=#{JOB_DATA}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:qrtz_job_details_dto):ArrayList<qrtz_job_details_dto>
                


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "JOB_NAME", column = "JOB_NAME"),
   Result(property = "JOB_GROUP", column = "JOB_GROUP"),
   Result(property = "DESCRIPTION", column = "DESCRIPTION"),
   Result(property = "JOB_CLASS_NAME", column = "JOB_CLASS_NAME"),
   Result(property = "IS_DURABLE", column = "IS_DURABLE"),
   Result(property = "IS_NONCONCURRENT", column = "IS_NONCONCURRENT"),
   Result(property = "IS_UPDATE_DATA", column = "IS_UPDATE_DATA"),
   Result(property = "REQUESTS_RECOVERY", column = "REQUESTS_RECOVERY"),
   Result(property = "JOB_DATA", column = "JOB_DATA")
)
@Select("""<script>
   SELECT * FROM qrtz_job_details
   <where>
   <if test="SCHED_NAME!=null">
      SCHED_NAME=#{SCHED_NAME}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:qrtz_job_details_dto):qrtz_job_details_dto?
                


@Insert("""<script>
    insert into TStudent
    (SCHED_NAME,JOB_NAME,JOB_GROUP,DESCRIPTION,JOB_CLASS_NAME,IS_DURABLE,IS_NONCONCURRENT,IS_UPDATE_DATA,REQUESTS_RECOVERY,JOB_DATA)
    values
    (#{SCHED_NAME},#{JOB_NAME},#{JOB_GROUP},#{DESCRIPTION},#{JOB_CLASS_NAME},#{IS_DURABLE},#{IS_NONCONCURRENT},#{IS_UPDATE_DATA},#{REQUESTS_RECOVERY},#{JOB_DATA})
</script>""")
fun insert(model:qrtz_job_details_dto):Unit
                

}

        
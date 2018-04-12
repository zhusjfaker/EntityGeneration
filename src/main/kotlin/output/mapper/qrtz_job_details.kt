

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
        


}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_schedule_log{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SCHEDULE_ID", column = "SCHEDULE_ID"),
   Result(property = "EXECUTE_TIME", column = "EXECUTE_TIME"),
   Result(property = "END_TIME", column = "END_TIME"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "LOG_MEMO", column = "LOG_MEMO"),
   Result(property = "EXECUTE_TYPE", column = "EXECUTE_TYPE"),
   Result(property = "LOG_TYPE", column = "LOG_TYPE"),
   Result(property = "LOG_TIME", column = "LOG_TIME"),
   Result(property = "JOB_GROUP", column = "JOB_GROUP")
)
@Select("""<script>
   SELECT * FROM sys_schedule_log
</script>""")
fun GetListAll():ArrayList<sys_schedule_log_dto>
        


}

        
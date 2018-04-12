

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_output_task{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TEAMID", column = "TEAMID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "PROFILEID", column = "PROFILEID"),
   Result(property = "TASKNAME", column = "TASKNAME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "BEGINTIME", column = "BEGINTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "TASKSTATE", column = "TASKSTATE"),
   Result(property = "THREADID", column = "THREADID"),
   Result(property = "LANG", column = "LANG")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_output_task
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_output_task_dto>
        


}

        
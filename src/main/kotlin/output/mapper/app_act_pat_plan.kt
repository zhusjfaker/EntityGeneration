

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_pat_plan{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "PLANNAME", column = "PLANNAME"),
   Result(property = "STARTUSER", column = "STARTUSER"),
   Result(property = "STARTUSERDEPTID", column = "STARTUSERDEPTID"),
   Result(property = "STARTUSERROLEID", column = "STARTUSERROLEID"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "PLANSTATUS", column = "PLANSTATUS"),
   Result(property = "ENDSTYLE", column = "ENDSTYLE"),
   Result(property = "STARTTIME", column = "STARTTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "PLANID", column = "PLANID"),
   Result(property = "SEQNUMBER", column = "SEQNUMBER"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ROWINDEX", column = "ROWINDEX")
)
@Select("""<script>
   SELECT * FROM app_act_pat_plan
</script>""")
fun GetListAll():ArrayList<app_act_pat_plan_dto>
        


}

        
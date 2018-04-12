

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_pat_batchplan{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BATCHPLANNAME", column = "BATCHPLANNAME"),
   Result(property = "TESTCASEID", column = "TESTCASEID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "BATCHPLANSTATUS", column = "BATCHPLANSTATUS"),
   Result(property = "ENDSTYLE", column = "ENDSTYLE"),
   Result(property = "TESTUSER", column = "TESTUSER"),
   Result(property = "STARTTIME", column = "STARTTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID")
)
@Select("""<script>
   SELECT * FROM app_act_pat_batchplan
</script>""")
fun GetListAll():ArrayList<app_act_pat_batchplan_dto>
        


}

        
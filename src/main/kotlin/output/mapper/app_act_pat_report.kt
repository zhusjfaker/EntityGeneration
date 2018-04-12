

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_pat_report{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "REPORTNAME", column = "REPORTNAME"),
   Result(property = "TESTCASEID", column = "TESTCASEID"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "DCINFO", column = "DCINFO"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID")
)
@Select("""<script>
   SELECT * FROM app_act_pat_report
</script>""")
fun GetListAll():ArrayList<app_act_pat_report_dto>
        


}

        
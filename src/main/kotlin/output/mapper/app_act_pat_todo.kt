

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_pat_todo{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TODONAME", column = "TODONAME"),
   Result(property = "TESTCASEID", column = "TESTCASEID"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "PLANID", column = "PLANID"),
   Result(property = "PLANPATHID", column = "PLANPATHID"),
   Result(property = "STYLE", column = "STYLE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID")
)
@Select("""<script>
   SELECT * FROM app_act_pat_todo
</script>""")
fun GetListAll():ArrayList<app_act_pat_todo_dto>
        


}

        
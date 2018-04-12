

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_pat_todo_remarks{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TODOID", column = "TODOID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "REMARKS", column = "REMARKS"),
   Result(property = "STYLE", column = "STYLE")
)
@Select("""<script>
   SELECT * FROM app_act_pat_todo_remarks
</script>""")
fun GetListAll():ArrayList<app_act_pat_todo_remarks_dto>
        


}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfc_comment{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "DEPTNAME", column = "DEPTNAME"),
   Result(property = "POSITIONNAME", column = "POSITIONNAME"),
   Result(property = "ACTIONNAME", column = "ACTIONNAME"),
   Result(property = "ACTIVITYNAME", column = "ACTIVITYNAME"),
   Result(property = "MSG", column = "MSG"),
   Result(property = "FILES", column = "FILES")
)
@Select("""<script>
   SELECT * FROM wfc_comment
</script>""")
fun GetListAll():ArrayList<wfc_comment_dto>
        


}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sysflowurge{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BIND_ID", column = "BIND_ID"),
   Result(property = "STEP_NO", column = "STEP_NO"),
   Result(property = "STEP_TONO", column = "STEP_TONO"),
   Result(property = "URGE_CONTENT", column = "URGE_CONTENT"),
   Result(property = "ARCHIVES", column = "ARCHIVES"),
   Result(property = "ISDISPLAY", column = "ISDISPLAY"),
   Result(property = "FLOW_ID", column = "FLOW_ID")
)
@Select("""<script>
   SELECT * FROM sysflowurge
</script>""")
fun GetListAll():ArrayList<sysflowurge_dto>
        


}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfh_formsnapshot{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ACTIVITYDEFID", column = "ACTIVITYDEFID"),
   Result(property = "AUTHORUID", column = "AUTHORUID"),
   Result(property = "AUTHORNAME", column = "AUTHORNAME"),
   Result(property = "RECORDTIME", column = "RECORDTIME"),
   Result(property = "FORMID", column = "FORMID"),
   Result(property = "VNAME", column = "VNAME")
)
@Select("""<script>
   SELECT * FROM wfh_formsnapshot
</script>""")
fun GetListAll():ArrayList<wfh_formsnapshot_dto>
        


}

        
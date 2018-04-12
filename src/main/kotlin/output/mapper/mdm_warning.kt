

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface mdm_warning{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "WARNTIME", column = "WARNTIME"),
   Result(property = "WARNTYPE", column = "WARNTYPE"),
   Result(property = "WARNMSG", column = "WARNMSG"),
   Result(property = "HANDLED", column = "HANDLED")
)
@Select("""<script>
   SELECT * FROM mdm_warning
</script>""")
fun GetListAll():ArrayList<mdm_warning_dto>
        


}

        
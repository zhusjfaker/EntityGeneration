

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface mdm_handlelog{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "HANDLETIME", column = "HANDLETIME"),
   Result(property = "HANDLETYPE", column = "HANDLETYPE"),
   Result(property = "COMMANDID", column = "COMMANDID")
)
@Select("""<script>
   SELECT * FROM mdm_handlelog
</script>""")
fun GetListAll():ArrayList<mdm_handlelog_dto>
        


}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface mdm_ios_command{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "COMMAND", column = "COMMAND"),
   Result(property = "DEVICEUDID", column = "DEVICEUDID"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "UPDATETIME", column = "UPDATETIME"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "IOSMDM", column = "IOSMDM")
)
@Select("""<script>
   SELECT * FROM mdm_ios_command
</script>""")
fun GetListAll():ArrayList<mdm_ios_command_dto>
        


}

        
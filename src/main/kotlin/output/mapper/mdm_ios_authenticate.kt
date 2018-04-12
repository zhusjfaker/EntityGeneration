

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface mdm_ios_authenticate{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "TOPIC", column = "TOPIC"),
   Result(property = "AUTHTIME", column = "AUTHTIME"),
   Result(property = "PUSHMAGIC", column = "PUSHMAGIC"),
   Result(property = "TOKEN", column = "TOKEN"),
   Result(property = "UNLOCKTOKEN", column = "UNLOCKTOKEN")
)
@Select("""<script>
   SELECT * FROM mdm_ios_authenticate
</script>""")
fun GetListAll():ArrayList<mdm_ios_authenticate_dto>
        


}

        
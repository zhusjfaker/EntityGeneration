

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_cc_ws{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "NAME", column = "NAME"),
   Result(property = "XMT", column = "XMT"),
   Result(property = "STATE", column = "STATE"),
   Result(property = "PUBLISHDATE", column = "PUBLISHDATE"),
   Result(property = "PUBLISHER", column = "PUBLISHER"),
   Result(property = "DESCRIPTION", column = "DESCRIPTION"),
   Result(property = "WEBSERVER", column = "WEBSERVER"),
   Result(property = "ADDRESS", column = "ADDRESS")
)
@Select("""<script>
   SELECT * FROM sys_cc_ws
</script>""")
fun GetListAll():ArrayList<sys_cc_ws_dto>
        


}

        
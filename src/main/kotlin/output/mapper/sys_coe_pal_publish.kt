

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_publish{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "AUDITORID", column = "AUDITORID"),
   Result(property = "PUBLISHDATE", column = "PUBLISHDATE"),
   Result(property = "PUBLISHDESC", column = "PUBLISHDESC"),
   Result(property = "PUBLISHN", column = "PUBLISHN"),
   Result(property = "PUBLISHC", column = "PUBLISHC"),
   Result(property = "PUBLISHS", column = "PUBLISHS"),
   Result(property = "TEAMID", column = "TEAMID")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_publish
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_publish_dto>
        


}

        
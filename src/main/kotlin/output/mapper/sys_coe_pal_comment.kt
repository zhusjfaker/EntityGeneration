

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_comment{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PID", column = "PID"),
   Result(property = "STREAMID", column = "STREAMID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "TARGETTYPE", column = "TARGETTYPE"),
   Result(property = "TARGETID", column = "TARGETID"),
   Result(property = "TEAMID", column = "TEAMID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "USERCOMMENT", column = "USERCOMMENT"),
   Result(property = "COMMENTDATE", column = "COMMENTDATE"),
   Result(property = "INFOTYPE", column = "INFOTYPE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_comment
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_comment_dto>
        


}

        
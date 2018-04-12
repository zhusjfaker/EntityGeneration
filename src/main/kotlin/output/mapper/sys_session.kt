

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_session{


@Results(
   Result(property = "SESSIONID", column = "SESSIONID"),
   Result(property = "ISSDK", column = "ISSDK"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "IP", column = "IP"),
   Result(property = "STARTTIME", column = "STARTTIME"),
   Result(property = "REFRESHTIME", column = "REFRESHTIME"),
   Result(property = "CLOSETIME", column = "CLOSETIME"),
   Result(property = "DEVICETYPE", column = "DEVICETYPE"),
   Result(property = "DEVICELANG", column = "DEVICELANG"),
   Result(property = "SESSIONSCOPE", column = "SESSIONSCOPE"),
   Result(property = "INSTNAME", column = "INSTNAME"),
   Result(property = "CLOSED", column = "CLOSED")
)
@Select("""<script>
   SELECT * FROM sys_session
</script>""")
fun GetListAll():ArrayList<sys_session_dto>
        


}

        
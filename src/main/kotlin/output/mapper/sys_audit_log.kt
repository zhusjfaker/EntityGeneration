

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_audit_log{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "LOG_CHANNEL", column = "LOG_CHANNEL"),
   Result(property = "LOG_CATALOG", column = "LOG_CATALOG"),
   Result(property = "LOG_OBJECT", column = "LOG_OBJECT"),
   Result(property = "OP", column = "OP"),
   Result(property = "OP_TIME", column = "OP_TIME"),
   Result(property = "OP_IP", column = "OP_IP"),
   Result(property = "OP_INFO", column = "OP_INFO"),
   Result(property = "OP_LEVEL", column = "OP_LEVEL"),
   Result(property = "AUDIT_ROLE", column = "AUDIT_ROLE"),
   Result(property = "OP_USER", column = "OP_USER"),
   Result(property = "EXT1", column = "EXT1")
)
@Select("""<script>
   SELECT * FROM sys_audit_log
</script>""")
fun GetListAll():ArrayList<sys_audit_log_dto>
        


}

        
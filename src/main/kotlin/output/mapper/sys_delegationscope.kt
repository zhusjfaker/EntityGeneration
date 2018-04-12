

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_delegationscope{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PID", column = "PID"),
   Result(property = "RESOURCETYPE", column = "RESOURCETYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID")
)
@Select("""<script>
   SELECT * FROM sys_delegationscope
</script>""")
fun GetListAll():ArrayList<sys_delegationscope_dto>
        


}

        
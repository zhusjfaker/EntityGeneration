

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_ac{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "RESOURCETYPE", column = "RESOURCETYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID"),
   Result(property = "ASSIGNMENTTYPE", column = "ASSIGNMENTTYPE"),
   Result(property = "ASSIGNMENTID", column = "ASSIGNMENTID"),
   Result(property = "ACCESSMODE", column = "ACCESSMODE")
)
@Select("""<script>
   SELECT * FROM sys_ac
</script>""")
fun GetListAll():ArrayList<sys_ac_dto>
        


}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_permissionassn{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ASSIGNMENTTYPE", column = "ASSIGNMENTTYPE"),
   Result(property = "ASSIGNMENTID", column = "ASSIGNMENTID"),
   Result(property = "PERMISSIONID", column = "PERMISSIONID")
)
@Select("""<script>
   SELECT * FROM sys_permissionassn
</script>""")
fun GetListAll():ArrayList<sys_permissionassn_dto>
        


}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_permission{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "CATEGORYNAME", column = "CATEGORYNAME"),
   Result(property = "PERMISSIONNAME", column = "PERMISSIONNAME"),
   Result(property = "PERMISSIONDESC", column = "PERMISSIONDESC"),
   Result(property = "ISSYSTEM", column = "ISSYSTEM")
)
@Select("""<script>
   SELECT * FROM sys_permission
</script>""")
fun GetListAll():ArrayList<sys_permission_dto>
        


}

        
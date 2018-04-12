

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_permissionlist{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PERMISSIONID", column = "PERMISSIONID"),
   Result(property = "RESOURCETYPE", column = "RESOURCETYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID"),
   Result(property = "ACCESSMODE", column = "ACCESSMODE"),
   Result(property = "EXT1", column = "EXT1")
)
@Select("""<script>
   SELECT * FROM sys_permissionlist
</script>""")
fun GetListAll():ArrayList<sys_permissionlist_dto>
        


}

        
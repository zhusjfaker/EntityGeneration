

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_repository_r_info{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "REMOVEUSER", column = "REMOVEUSER"),
   Result(property = "REMOVETIME", column = "REMOVETIME"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "RESOURCEID", column = "RESOURCEID"),
   Result(property = "REMOVETYPE", column = "REMOVETYPE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_repository_r_info
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_repository_r_info_dto>
        


}

        
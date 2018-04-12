

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_publish_list{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PID", column = "PID"),
   Result(property = "PALREPOSITORYID", column = "PALREPOSITORYID"),
   Result(property = "ACTIONTYPE", column = "ACTIONTYPE"),
   Result(property = "PUBLISHDESC", column = "PUBLISHDESC")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_publish_list
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_publish_list_dto>
        


}

        
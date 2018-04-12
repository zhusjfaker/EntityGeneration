

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_systemname{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SYSTEMNAME", column = "SYSTEMNAME"),
   Result(property = "ISDEFAULT", column = "ISDEFAULT")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_systemname
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_systemname_dto>
        


}

        
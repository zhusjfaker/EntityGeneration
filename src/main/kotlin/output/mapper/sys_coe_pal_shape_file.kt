

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_shape_file{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PALREPOSITORYID", column = "PALREPOSITORYID")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_shape_file
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_shape_file_dto>
        


}

        
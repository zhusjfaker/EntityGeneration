

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_shape_copy{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SHAPEGROUPTID", column = "SHAPEGROUPTID"),
   Result(property = "SHAPENAME", column = "SHAPENAME"),
   Result(property = "SHAPECATEGORYNAME", column = "SHAPECATEGORYNAME"),
   Result(property = "PALREPOSITORYID", column = "PALREPOSITORYID"),
   Result(property = "ISDELETE", column = "ISDELETE"),
   Result(property = "SHAPETYPE", column = "SHAPETYPE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_shape_copy
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_shape_copy_dto>
        


}

        
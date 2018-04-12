

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_shape_relation{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "FILEID", column = "FILEID"),
   Result(property = "SHAPEID", column = "SHAPEID"),
   Result(property = "SHAPETEXT", column = "SHAPETEXT"),
   Result(property = "ATTRID", column = "ATTRID"),
   Result(property = "RELATIONFILEID", column = "RELATIONFILEID"),
   Result(property = "RELATIONSHAPEID", column = "RELATIONSHAPEID"),
   Result(property = "RELATIONSHAPETEXT", column = "RELATIONSHAPETEXT")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_shape_relation
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_shape_relation_dto>
        


}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface vorgdept{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEPARTMENTNAME", column = "DEPARTMENTNAME"),
   Result(property = "UNITID", column = "UNITID"),
   Result(property = "PARENTDEPARTMENTID", column = "PARENTDEPARTMENTID"),
   Result(property = "DEPARTMENTNO", column = "DEPARTMENTNO"),
   Result(property = "LAYER", column = "LAYER"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "ADMINISTRATORS", column = "ADMINISTRATORS")
)
@Select("""<script>
   SELECT * FROM vorgdept
</script>""")
fun GetListAll():ArrayList<vorgdept_dto>
        


}

        
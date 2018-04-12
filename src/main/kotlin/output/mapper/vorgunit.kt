

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface vorgunit{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "RDEPTID", column = "RDEPTID"),
   Result(property = "UNITNAME", column = "UNITNAME"),
   Result(property = "ADMINISTRATORS", column = "ADMINISTRATORS"),
   Result(property = "UNITGROUP", column = "UNITGROUP"),
   Result(property = "UNITDESC", column = "UNITDESC"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5")
)
@Select("""<script>
   SELECT * FROM vorgunit
</script>""")
fun GetListAll():ArrayList<vorgunit_dto>
        


}

        
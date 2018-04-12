

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface orgrole_bk{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ROLENAME", column = "ROLENAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "CATEGORYNAME", column = "CATEGORYNAME"),
   Result(property = "LOOKANDFEEL", column = "LOOKANDFEEL"),
   Result(property = "ROLENO", column = "ROLENO"),
   Result(property = "ROLEDESC", column = "ROLEDESC"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE")
)
@Select("""<script>
   SELECT * FROM orgrole_bk
</script>""")
fun GetListAll():ArrayList<orgrole_bk_dto>
        


}

        
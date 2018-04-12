

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface orgteam{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TEAMNAME", column = "TEAMNAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "TEAMTYPE", column = "TEAMTYPE"),
   Result(property = "CLOSED", column = "CLOSED"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "PARENTID", column = "PARENTID"),
   Result(property = "ISGROUP", column = "ISGROUP"),
   Result(property = "TEAMDESC", column = "TEAMDESC"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE")
)
@Select("""<script>
   SELECT * FROM orgteam
</script>""")
fun GetListAll():ArrayList<orgteam_dto>
        


}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_ss_warehouse{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ORGID", column = "ORGID"),
   Result(property = "BINDID", column = "BINDID"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE"),
   Result(property = "UPDATEUSER", column = "UPDATEUSER"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ISEND", column = "ISEND"),
   Result(property = "WHCODE", column = "WHCODE"),
   Result(property = "WHNAME", column = "WHNAME"),
   Result(property = "ADDR", column = "ADDR"),
   Result(property = "CAPACITY", column = "CAPACITY"),
   Result(property = "PRINCIPAL", column = "PRINCIPAL"),
   Result(property = "STOREMAN", column = "STOREMAN"),
   Result(property = "TEL", column = "TEL"),
   Result(property = "FAX", column = "FAX"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "UPCODE", column = "UPCODE"),
   Result(property = "ISEND1", column = "ISEND1"),
   Result(property = "PARENTID", column = "PARENTID"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "STATUS1", column = "STATUS1"),
   Result(property = "LOSESTORE", column = "LOSESTORE"),
   Result(property = "GTYPE", column = "GTYPE")
)
@Select("""<script>
   SELECT * FROM bo_ss_warehouse
</script>""")
fun GetListAll():ArrayList<bo_ss_warehouse_dto>
        


}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_ss_gsort{


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
   Result(property = "GSCODE", column = "GSCODE"),
   Result(property = "GSNAME", column = "GSNAME"),
   Result(property = "UPCODE", column = "UPCODE"),
   Result(property = "ISEND1", column = "ISEND1"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "GTYPE", column = "GTYPE"),
   Result(property = "PARENTID", column = "PARENTID"),
   Result(property = "STATUS1", column = "STATUS1"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4")
)
@Select("""<script>
   SELECT * FROM bo_ss_gsort
</script>""")
fun GetListAll():ArrayList<bo_ss_gsort_dto>
        


}

        
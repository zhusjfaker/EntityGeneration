

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_ss_gatmain{


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
   Result(property = "UNITID", column = "UNITID"),
   Result(property = "UCODE", column = "UCODE"),
   Result(property = "UNAME", column = "UNAME"),
   Result(property = "CURAMOUNT", column = "CURAMOUNT")
)
@Select("""<script>
   SELECT * FROM bo_ss_gatmain
</script>""")
fun GetListAll():ArrayList<bo_ss_gatmain_dto>
        


}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_ss_whgoods{


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
   Result(property = "WHID", column = "WHID"),
   Result(property = "GOODSID", column = "GOODSID"),
   Result(property = "QUANTRA", column = "QUANTRA"),
   Result(property = "QUAN", column = "QUAN"),
   Result(property = "PRICE", column = "PRICE"),
   Result(property = "AMOUNT", column = "AMOUNT"),
   Result(property = "COMID", column = "COMID")
)
@Select("""<script>
   SELECT * FROM bo_ss_whgoods
</script>""")
fun GetListAll():ArrayList<bo_ss_whgoods_dto>
        


}

        
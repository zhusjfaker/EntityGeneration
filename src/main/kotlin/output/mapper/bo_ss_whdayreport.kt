

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_ss_whdayreport{


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
   Result(property = "BIZDATE", column = "BIZDATE"),
   Result(property = "WHID", column = "WHID"),
   Result(property = "DPTID1", column = "DPTID1"),
   Result(property = "COMID", column = "COMID"),
   Result(property = "UNITID", column = "UNITID"),
   Result(property = "BUID", column = "BUID"),
   Result(property = "GOODSID", column = "GOODSID"),
   Result(property = "NO", column = "NO"),
   Result(property = "BILLTYPE", column = "BILLTYPE"),
   Result(property = "BIZTYPE", column = "BIZTYPE"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "QUANIN", column = "QUANIN"),
   Result(property = "QUANOUT", column = "QUANOUT"),
   Result(property = "PRICE", column = "PRICE"),
   Result(property = "AMOUNT", column = "AMOUNT"),
   Result(property = "BIZTYPEID", column = "BIZTYPEID")
)
@Select("""<script>
   SELECT * FROM bo_ss_whdayreport
</script>""")
fun GetListAll():ArrayList<bo_ss_whdayreport_dto>
        


}

        
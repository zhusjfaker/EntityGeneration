

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_ss_payitem{


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
   Result(property = "COMID", column = "COMID"),
   Result(property = "BIZDATE", column = "BIZDATE"),
   Result(property = "DPTID1", column = "DPTID1"),
   Result(property = "UNITID", column = "UNITID"),
   Result(property = "BUID", column = "BUID"),
   Result(property = "BILLTYPE", column = "BILLTYPE"),
   Result(property = "BIZTYPE", column = "BIZTYPE"),
   Result(property = "NO", column = "NO"),
   Result(property = "BAMOUNT", column = "BAMOUNT"),
   Result(property = "FAMOUNT", column = "FAMOUNT"),
   Result(property = "MEMO", column = "MEMO")
)
@Select("""<script>
   SELECT * FROM bo_ss_payitem
</script>""")
fun GetListAll():ArrayList<bo_ss_payitem_dto>
        


}

        
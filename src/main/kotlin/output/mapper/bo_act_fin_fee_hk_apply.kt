

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_act_fin_fee_hk_apply{


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
   Result(property = "HKNO", column = "HKNO"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "PAYDATE", column = "PAYDATE"),
   Result(property = "APPLYDATE", column = "APPLYDATE"),
   Result(property = "JKNO", column = "JKNO"),
   Result(property = "JKAMOUNT", column = "JKAMOUNT"),
   Result(property = "JKBALANCE", column = "JKBALANCE"),
   Result(property = "APPLYUID", column = "APPLYUID"),
   Result(property = "APPLYUSER", column = "APPLYUSER"),
   Result(property = "APPLYDEPTID", column = "APPLYDEPTID"),
   Result(property = "APPLYDEPT", column = "APPLYDEPT"),
   Result(property = "PAYTYPE", column = "PAYTYPE"),
   Result(property = "AMOUNT", column = "AMOUNT"),
   Result(property = "AMOUNTBIG", column = "AMOUNTBIG"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "CURRENCY", column = "CURRENCY"),
   Result(property = "RATE", column = "RATE")
)
@Select("""<script>
   SELECT * FROM bo_act_fin_fee_hk_apply
</script>""")
fun GetListAll():ArrayList<bo_act_fin_fee_hk_apply_dto>
        


}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_pat_batchplanremarks{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "REMARKS", column = "REMARKS"),
   Result(property = "STYLE", column = "STYLE")
)
@Select("""<script>
   SELECT * FROM app_act_pat_batchplanremarks
</script>""")
fun GetListAll():ArrayList<app_act_pat_batchplanremarks_dto>
        


}

        
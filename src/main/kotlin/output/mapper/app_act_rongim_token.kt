

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_rongim_token{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TOKEN", column = "TOKEN"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_rongim_token
</script>""")
fun GetListAll():ArrayList<app_act_rongim_token_dto>
        


}

        
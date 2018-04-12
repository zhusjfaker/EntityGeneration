

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfc_urltoken{


@Results(
   Result(property = "TOKENID", column = "TOKENID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "AWSUID", column = "AWSUID"),
   Result(property = "TOKENSTATE", column = "TOKENSTATE"),
   Result(property = "ACCESSTIME", column = "ACCESSTIME"),
   Result(property = "MEMO", column = "MEMO")
)
@Select("""<script>
   SELECT * FROM wfc_urltoken
</script>""")
fun GetListAll():ArrayList<wfc_urltoken_dto>
        


}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_cms_data_reply{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DATAID", column = "DATAID"),
   Result(property = "REPLYER", column = "REPLYER"),
   Result(property = "REPLYTIME", column = "REPLYTIME"),
   Result(property = "REPLYCONTENT", column = "REPLYCONTENT"),
   Result(property = "ORGID", column = "ORGID"),
   Result(property = "REPLYERIP", column = "REPLYERIP")
)
@Select("""<script>
   SELECT * FROM app_act_cms_data_reply
</script>""")
fun GetListAll():ArrayList<app_act_cms_data_reply_dto>
        


}

        
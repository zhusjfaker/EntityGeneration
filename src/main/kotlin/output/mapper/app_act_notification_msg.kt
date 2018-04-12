

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_notification_msg{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "REGISTERID", column = "REGISTERID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "OWNERID", column = "OWNERID"),
   Result(property = "TARGETID", column = "TARGETID"),
   Result(property = "NOTIFYCONTENT", column = "NOTIFYCONTENT"),
   Result(property = "NOTIFYLEVEL", column = "NOTIFYLEVEL"),
   Result(property = "ISCLOSE", column = "ISCLOSE"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "ISSTORE", column = "ISSTORE"),
   Result(property = "READTIME", column = "READTIME"),
   Result(property = "READED", column = "READED"),
   Result(property = "SOURCEID", column = "SOURCEID")
)
@Select("""<script>
   SELECT * FROM app_act_notification_msg
</script>""")
fun GetListAll():ArrayList<app_act_notification_msg_dto>
        


}

        
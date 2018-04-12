

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_email_templete{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TEMPLATENAME", column = "TEMPLATENAME"),
   Result(property = "EMAILTO", column = "EMAILTO"),
   Result(property = "COPYTO", column = "COPYTO"),
   Result(property = "EMAIL_TITLE", column = "EMAIL_TITLE"),
   Result(property = "EMAIL_CONTENT", column = "EMAIL_CONTENT"),
   Result(property = "TEMPLATETYPE", column = "TEMPLATETYPE"),
   Result(property = "ISDEFAULT", column = "ISDEFAULT"),
   Result(property = "EMAILFROM", column = "EMAILFROM"),
   Result(property = "FROMNAME", column = "FROMNAME"),
   Result(property = "ISVALID", column = "ISVALID")
)
@Select("""<script>
   SELECT * FROM app_act_email_templete
</script>""")
fun GetListAll():ArrayList<app_act_email_templete_dto>
        


}

        
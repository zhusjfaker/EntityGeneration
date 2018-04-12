

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_cms_navigation{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "NAVSITEOWNERID", column = "NAVSITEOWNERID"),
   Result(property = "NAVNAME", column = "NAVNAME"),
   Result(property = "SITEID", column = "SITEID"),
   Result(property = "NAVURL", column = "NAVURL"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "LINKTARGET", column = "LINKTARGET")
)
@Select("""<script>
   SELECT * FROM app_act_cms_navigation
</script>""")
fun GetListAll():ArrayList<app_act_cms_navigation_dto>
        


}

        
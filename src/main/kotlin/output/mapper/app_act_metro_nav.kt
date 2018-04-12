

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_metro_nav{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "FUNCTIONID", column = "FUNCTIONID"),
   Result(property = "ORDERNO", column = "ORDERNO"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_metro_nav
</script>""")
fun GetListAll():ArrayList<app_act_metro_nav_dto>
        


}

        
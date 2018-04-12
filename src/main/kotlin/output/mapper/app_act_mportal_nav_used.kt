

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_mportal_nav_used{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "NAME", column = "NAME"),
   Result(property = "URL", column = "URL"),
   Result(property = "TARGET", column = "TARGET"),
   Result(property = "ICON64", column = "ICON64"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "NAVID", column = "NAVID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "FUNNAVID", column = "FUNNAVID")
)
@Select("""<script>
   SELECT * FROM app_act_mportal_nav_used
</script>""")
fun GetListAll():ArrayList<app_act_mportal_nav_used_dto>
        


}

        
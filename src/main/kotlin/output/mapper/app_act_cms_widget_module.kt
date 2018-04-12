

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_cms_widget_module{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WIDGETID", column = "WIDGETID"),
   Result(property = "MODULEID", column = "MODULEID")
)
@Select("""<script>
   SELECT * FROM app_act_cms_widget_module
</script>""")
fun GetListAll():ArrayList<app_act_cms_widget_module_dto>
        


}

        
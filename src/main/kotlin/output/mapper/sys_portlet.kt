

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_portlet{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "CATEGORYNAME", column = "CATEGORYNAME"),
   Result(property = "PORTLETTITLE", column = "PORTLETTITLE"),
   Result(property = "PORTLETHEIGHT", column = "PORTLETHEIGHT"),
   Result(property = "LINKURL", column = "LINKURL"),
   Result(property = "ICON16", column = "ICON16"),
   Result(property = "ICON64", column = "ICON64"),
   Result(property = "ICON96", column = "ICON96"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "ISACTIVITY", column = "ISACTIVITY"),
   Result(property = "NOTIFIER", column = "NOTIFIER"),
   Result(property = "PORTLETCFG", column = "PORTLETCFG")
)
@Select("""<script>
   SELECT * FROM sys_portlet
</script>""")
fun GetListAll():ArrayList<sys_portlet_dto>
        


}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_nav_system{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SYSTEMNAME", column = "SYSTEMNAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "LINKURL", column = "LINKURL"),
   Result(property = "LINKTARGET", column = "LINKTARGET"),
   Result(property = "ICON16", column = "ICON16"),
   Result(property = "ICON64", column = "ICON64"),
   Result(property = "ICON96", column = "ICON96"),
   Result(property = "NAVDESC", column = "NAVDESC"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "ISHIDDEN", column = "ISHIDDEN"),
   Result(property = "ISACTIVITY", column = "ISACTIVITY"),
   Result(property = "PORTALLAYOUT", column = "PORTALLAYOUT"),
   Result(property = "PORTALLOCKED", column = "PORTALLOCKED"),
   Result(property = "NOTIFIER", column = "NOTIFIER")
)
@Select("""<script>
   SELECT * FROM sys_nav_system
</script>""")
fun GetListAll():ArrayList<sys_nav_system_dto>
        


}

        
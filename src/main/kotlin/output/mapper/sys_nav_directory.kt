

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_nav_directory{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SYSTEMID", column = "SYSTEMID"),
   Result(property = "DIRECTORYNAME", column = "DIRECTORYNAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "LINKURL", column = "LINKURL"),
   Result(property = "LINKTARGET", column = "LINKTARGET"),
   Result(property = "ICON16", column = "ICON16"),
   Result(property = "ICON64", column = "ICON64"),
   Result(property = "ICON96", column = "ICON96"),
   Result(property = "NAVDESC", column = "NAVDESC"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "ISACTIVITY", column = "ISACTIVITY"),
   Result(property = "NOTIFIER", column = "NOTIFIER"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2")
)
@Select("""<script>
   SELECT * FROM sys_nav_directory
</script>""")
fun GetListAll():ArrayList<sys_nav_directory_dto>
        


}

        
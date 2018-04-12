

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_userportal{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "PORTALID", column = "PORTALID"),
   Result(property = "PORTLETID", column = "PORTLETID"),
   Result(property = "PORTLETTITLE", column = "PORTLETTITLE"),
   Result(property = "PORTLETHEIGHT", column = "PORTLETHEIGHT"),
   Result(property = "LINKURL", column = "LINKURL"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "POOLNAME", column = "POOLNAME"),
   Result(property = "PROFILEDATA", column = "PROFILEDATA")
)
@Select("""<script>
   SELECT * FROM sys_userportal
</script>""")
fun GetListAll():ArrayList<sys_userportal_dto>
        


}

        
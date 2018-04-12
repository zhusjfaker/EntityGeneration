

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface mam_install{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "INSTALLTIME", column = "INSTALLTIME"),
   Result(property = "INSTALLVERSION", column = "INSTALLVERSION"),
   Result(property = "CURRENTVERSION", column = "CURRENTVERSION"),
   Result(property = "UNINSTALLED", column = "UNINSTALLED")
)
@Select("""<script>
   SELECT * FROM mam_install
</script>""")
fun GetListAll():ArrayList<mam_install_dto>
        


}

        
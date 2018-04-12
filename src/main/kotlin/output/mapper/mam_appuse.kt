

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface mam_appuse{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "USETIME", column = "USETIME"),
   Result(property = "APPVERSION", column = "APPVERSION")
)
@Select("""<script>
   SELECT * FROM mam_appuse
</script>""")
fun GetListAll():ArrayList<mam_appuse_dto>
        


}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface mam_update{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "UPDATETIME", column = "UPDATETIME"),
   Result(property = "UPDATEVERSION", column = "UPDATEVERSION")
)
@Select("""<script>
   SELECT * FROM mam_update
</script>""")
fun GetListAll():ArrayList<mam_update_dto>
        


}

        
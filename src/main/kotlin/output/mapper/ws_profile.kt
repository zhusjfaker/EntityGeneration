

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface ws_profile{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "UUID", column = "UUID"),
   Result(property = "PROFILETYPE", column = "PROFILETYPE"),
   Result(property = "PROFILESOURCE", column = "PROFILESOURCE"),
   Result(property = "PROFILENAME", column = "PROFILENAME"),
   Result(property = "PROFILECONTENT", column = "PROFILECONTENT"),
   Result(property = "BEGINDATE", column = "BEGINDATE"),
   Result(property = "ENDDATE", column = "ENDDATE")
)
@Select("""<script>
   SELECT * FROM ws_profile
</script>""")
fun GetListAll():ArrayList<ws_profile_dto>
        


}

        
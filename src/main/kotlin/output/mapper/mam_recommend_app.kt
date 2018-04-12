

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface mam_recommend_app{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "OSTYPE", column = "OSTYPE"),
   Result(property = "DEVICETYPE", column = "DEVICETYPE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM mam_recommend_app
</script>""")
fun GetListAll():ArrayList<mam_recommend_app_dto>
        


}

        
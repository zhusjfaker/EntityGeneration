

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface mam_app_category{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "CATEGORY", column = "CATEGORY")
)
@Select("""<script>
   SELECT * FROM mam_app_category
</script>""")
fun GetListAll():ArrayList<mam_app_category_dto>
        


}

        
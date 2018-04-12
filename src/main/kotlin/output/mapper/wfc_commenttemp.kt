

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfc_commenttemp{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "ACTIONNAME", column = "ACTIONNAME"),
   Result(property = "MSG", column = "MSG"),
   Result(property = "FILES", column = "FILES")
)
@Select("""<script>
   SELECT * FROM wfc_commenttemp
</script>""")
fun GetListAll():ArrayList<wfc_commenttemp_dto>
        


}

        
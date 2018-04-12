

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_iox{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ADVANCETYPE", column = "ADVANCETYPE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM sys_iox
</script>""")
fun GetListAll():ArrayList<sys_iox_dto>
        


}

        
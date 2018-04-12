

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface mdm_hw_push{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "HUAWEITOKEN", column = "HUAWEITOKEN"),
   Result(property = "ISONLINE", column = "ISONLINE")
)
@Select("""<script>
   SELECT * FROM mdm_hw_push
</script>""")
fun GetListAll():ArrayList<mdm_hw_push_dto>
        


}

        
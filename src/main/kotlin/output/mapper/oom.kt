

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface oom{


@Results(
   Result(property = "ID", column = "ID")
)
@Select("""<script>
   SELECT * FROM oom
</script>""")
fun GetListAll():ArrayList<oom_dto>
        


}

        
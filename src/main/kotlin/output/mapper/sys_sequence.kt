

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_sequence{


@Results(
   Result(property = "SEQUENCENAME", column = "SEQUENCENAME"),
   Result(property = "SEQUENCEVALUE", column = "SEQUENCEVALUE"),
   Result(property = "CACHESTEP", column = "CACHESTEP")
)
@Select("""<script>
   SELECT * FROM sys_sequence
</script>""")
fun GetListAll():ArrayList<sys_sequence_dto>
        


}

        
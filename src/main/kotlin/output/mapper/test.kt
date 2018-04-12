

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface test{


@Results(
   Result(property = "id", column = "id"),
   Result(property = "ss2", column = "ss2")
)
@Select("""<script>
   SELECT * FROM test
</script>""")
fun GetListAll():ArrayList<test_dto>
        


}

        
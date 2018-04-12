

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_md5_value{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "V", column = "V")
)
@Select("""<script>
   SELECT * FROM sys_md5_value
</script>""")
fun GetListAll():ArrayList<sys_md5_value_dto>
        


}

        
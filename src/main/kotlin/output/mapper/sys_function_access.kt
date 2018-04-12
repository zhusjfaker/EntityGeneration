

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_function_access{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "CATEGORYTYPE", column = "CATEGORYTYPE"),
   Result(property = "ACCESSUSER", column = "ACCESSUSER"),
   Result(property = "ACCESSTIME", column = "ACCESSTIME"),
   Result(property = "RESOURCETYPE", column = "RESOURCETYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2")
)
@Select("""<script>
   SELECT * FROM sys_function_access
</script>""")
fun GetListAll():ArrayList<sys_function_access_dto>
        


}

        
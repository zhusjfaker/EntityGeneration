

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface vorguser{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "DEPARTMENTID", column = "DEPARTMENTID"),
   Result(property = "ROLEID", column = "ROLEID"),
   Result(property = "ISMANAGER", column = "ISMANAGER"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5")
)
@Select("""<script>
   SELECT * FROM vorguser
</script>""")
fun GetListAll():ArrayList<vorguser_dto>
        


}

        
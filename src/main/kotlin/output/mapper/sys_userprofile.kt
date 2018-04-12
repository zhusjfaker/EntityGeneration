

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_userprofile{


@Results(
   Result(property = "USERID", column = "USERID"),
   Result(property = "PROFILEKEY", column = "PROFILEKEY"),
   Result(property = "PROFILEVALUE", column = "PROFILEVALUE")
)
@Select("""<script>
   SELECT * FROM sys_userprofile
</script>""")
fun GetListAll():ArrayList<sys_userprofile_dto>
        


}

        
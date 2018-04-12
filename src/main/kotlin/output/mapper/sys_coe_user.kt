

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_user{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "ISADMIN", column = "ISADMIN")
)
@Select("""<script>
   SELECT * FROM sys_coe_user
</script>""")
fun GetListAll():ArrayList<sys_coe_user_dto>
        


}

        
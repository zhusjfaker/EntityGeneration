

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_dw_user_profile{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "VIEWID", column = "VIEWID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "PROFILE_TYPE", column = "PROFILE_TYPE"),
   Result(property = "PROFILE_VAL", column = "PROFILE_VAL"),
   Result(property = "WIDTH", column = "WIDTH"),
   Result(property = "ISDISPLAY", column = "ISDISPLAY"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "PAGE", column = "PAGE")
)
@Select("""<script>
   SELECT * FROM sys_dw_user_profile
</script>""")
fun GetListAll():ArrayList<sys_dw_user_profile_dto>
        


}

        
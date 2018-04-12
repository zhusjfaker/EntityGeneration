

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface orgteam_member{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TEAMID", column = "TEAMID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "MEMBERTYPE", column = "MEMBERTYPE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM orgteam_member
</script>""")
fun GetListAll():ArrayList<orgteam_member_dto>
        


}

        
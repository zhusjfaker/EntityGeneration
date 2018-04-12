

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface orguser_pwd_cycle{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "PASSWORD", column = "PASSWORD"),
   Result(property = "LASTDATE", column = "LASTDATE"),
   Result(property = "IP", column = "IP")
)
@Select("""<script>
   SELECT * FROM orguser_pwd_cycle
</script>""")
fun GetListAll():ArrayList<orguser_pwd_cycle_dto>
        


}

        
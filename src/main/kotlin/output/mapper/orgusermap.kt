

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface orgusermap{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "DEPARTMENTID", column = "DEPARTMENTID"),
   Result(property = "ROLEID", column = "ROLEID"),
   Result(property = "ISMANAGER", column = "ISMANAGER"),
   Result(property = "ISSHOW", column = "ISSHOW")
)
@Select("""<script>
   SELECT * FROM orgusermap
</script>""")
fun GetListAll():ArrayList<orgusermap_dto>
        


}

        
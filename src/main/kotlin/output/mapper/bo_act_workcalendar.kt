

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_act_workcalendar{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ORGID", column = "ORGID"),
   Result(property = "BINDID", column = "BINDID"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE"),
   Result(property = "UPDATEUSER", column = "UPDATEUSER"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ISEND", column = "ISEND"),
   Result(property = "WCKEY", column = "WCKEY"),
   Result(property = "WCNAME", column = "WCNAME"),
   Result(property = "WCTIMEZONE", column = "WCTIMEZONE"),
   Result(property = "WCEXTCLASS", column = "WCEXTCLASS"),
   Result(property = "MEMO", column = "MEMO")
)
@Select("""<script>
   SELECT * FROM bo_act_workcalendar
</script>""")
fun GetListAll():ArrayList<bo_act_workcalendar_dto>
        


}

        
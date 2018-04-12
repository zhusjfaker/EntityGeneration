

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_act_workcalendar_batchsub{


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
   Result(property = "YEAR", column = "YEAR"),
   Result(property = "WCTYPE", column = "WCTYPE"),
   Result(property = "WCNAME", column = "WCNAME"),
   Result(property = "AMSTARTTIME", column = "AMSTARTTIME"),
   Result(property = "AMENDTIME", column = "AMENDTIME"),
   Result(property = "PMSTARTTIME", column = "PMSTARTTIME"),
   Result(property = "PMENDTIME", column = "PMENDTIME")
)
@Select("""<script>
   SELECT * FROM bo_act_workcalendar_batchsub
</script>""")
fun GetListAll():ArrayList<bo_act_workcalendar_batchsub_dto>
        


}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_sla_alarm{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "INSTNAME", column = "INSTNAME"),
   Result(property = "ALARMNAME", column = "ALARMNAME"),
   Result(property = "EVENTTIME", column = "EVENTTIME"),
   Result(property = "ALARMLEVEL", column = "ALARMLEVEL"),
   Result(property = "METRICID", column = "METRICID"),
   Result(property = "TAKEVALUE", column = "TAKEVALUE"),
   Result(property = "TAKEDETAIL", column = "TAKEDETAIL"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "RESOURCEID", column = "RESOURCEID"),
   Result(property = "ISREAD", column = "ISREAD")
)
@Select("""<script>
   SELECT * FROM sys_sla_alarm
</script>""")
fun GetListAll():ArrayList<sys_sla_alarm_dto>
        


}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_orgimp_log{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "OPTYPE", column = "OPTYPE"),
   Result(property = "ORGTYPE", column = "ORGTYPE"),
   Result(property = "LOGFILE", column = "LOGFILE"),
   Result(property = "XLSFILE", column = "XLSFILE"),
   Result(property = "STARTTIME", column = "STARTTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "REMARK", column = "REMARK"),
   Result(property = "OPTUSER", column = "OPTUSER"),
   Result(property = "IP", column = "IP"),
   Result(property = "LOGDOWNLOAD", column = "LOGDOWNLOAD")
)
@Select("""<script>
   SELECT * FROM app_act_orgimp_log
</script>""")
fun GetListAll():ArrayList<app_act_orgimp_log_dto>
        


}

        
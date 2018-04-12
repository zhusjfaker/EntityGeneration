

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_pat_planpath{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PLANPATHTYPE", column = "PLANPATHTYPE"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "PLANID", column = "PLANID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "PROCESSTITLE", column = "PROCESSTITLE"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "PROCESSCREATEUSER", column = "PROCESSCREATEUSER"),
   Result(property = "NODEID", column = "NODEID"),
   Result(property = "TASKTITLE", column = "TASKTITLE"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "OWNER", column = "OWNER"),
   Result(property = "OWNERUSERNAME", column = "OWNERUSERNAME"),
   Result(property = "OWNERDEPTID", column = "OWNERDEPTID"),
   Result(property = "OWNERDEPTNAME", column = "OWNERDEPTNAME"),
   Result(property = "OWNERDEPTFULLNAME", column = "OWNERDEPTFULLNAME"),
   Result(property = "TARGET", column = "TARGET"),
   Result(property = "TARGETUSERNAME", column = "TARGETUSERNAME"),
   Result(property = "TARGETDEPTID", column = "TARGETDEPTID"),
   Result(property = "TARGETDEPTNAME", column = "TARGETDEPTNAME"),
   Result(property = "TARGETDEPTFULLNAME", column = "TARGETDEPTFULLNAME"),
   Result(property = "TARGETROLEID", column = "TARGETROLEID"),
   Result(property = "TARGETROLENAME", column = "TARGETROLENAME"),
   Result(property = "SEQNUMBER", column = "SEQNUMBER"),
   Result(property = "EXCEPTIONMSG", column = "EXCEPTIONMSG")
)
@Select("""<script>
   SELECT * FROM app_act_pat_planpath
</script>""")
fun GetListAll():ArrayList<app_act_pat_planpath_dto>
        


}

        
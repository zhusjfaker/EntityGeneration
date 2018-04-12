

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfc_task{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PARENTTASKINSTID", column = "PARENTTASKINSTID"),
   Result(property = "SCOPEID", column = "SCOPEID"),
   Result(property = "ACTIVITYTYPE", column = "ACTIVITYTYPE"),
   Result(property = "ACTIVITYDEFID", column = "ACTIVITYDEFID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "PROCESSDEFVERID", column = "PROCESSDEFVERID"),
   Result(property = "PROCESSGROUPID", column = "PROCESSGROUPID"),
   Result(property = "DISPATCHID", column = "DISPATCHID"),
   Result(property = "TASKTITLE", column = "TASKTITLE"),
   Result(property = "TASKSTATE", column = "TASKSTATE"),
   Result(property = "CONTROLSTATE", column = "CONTROLSTATE"),
   Result(property = "PRIORITY", column = "PRIORITY"),
   Result(property = "OWNER", column = "OWNER"),
   Result(property = "TARGET", column = "TARGET"),
   Result(property = "CLAIMTYPE", column = "CLAIMTYPE"),
   Result(property = "CLAIMRESOURCEID", column = "CLAIMRESOURCEID"),
   Result(property = "DUETIME", column = "DUETIME"),
   Result(property = "BEGINTIME", column = "BEGINTIME"),
   Result(property = "BEGINENGINENODE", column = "BEGINENGINENODE"),
   Result(property = "READTIME", column = "READTIME"),
   Result(property = "OWNERDEPTID", column = "OWNERDEPTID"),
   Result(property = "TARGETDEPTID", column = "TARGETDEPTID"),
   Result(property = "TARGETCOMPANYID", column = "TARGETCOMPANYID"),
   Result(property = "TARGETROLEID", column = "TARGETROLEID"),
   Result(property = "ISMONITOR", column = "ISMONITOR"),
   Result(property = "ISASYNC", column = "ISASYNC"),
   Result(property = "EXCEPTIONERR", column = "EXCEPTIONERR"),
   Result(property = "IOBD", column = "IOBD"),
   Result(property = "IOR", column = "IOR"),
   Result(property = "IOS", column = "IOS"),
   Result(property = "IOC", column = "IOC"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "REMINDTIMES", column = "REMINDTIMES"),
   Result(property = "DELAYTIMES", column = "DELAYTIMES"),
   Result(property = "READSTATE", column = "READSTATE"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "EXT6", column = "EXT6"),
   Result(property = "EXT7", column = "EXT7"),
   Result(property = "EXT8", column = "EXT8"),
   Result(property = "SECURITYLEVEL", column = "SECURITYLEVEL")
)
@Select("""<script>
   SELECT * FROM wfc_task
</script>""")
fun GetListAll():ArrayList<wfc_task_dto>
        


}

        
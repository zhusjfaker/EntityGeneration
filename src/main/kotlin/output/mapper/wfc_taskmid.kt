

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfc_taskmid{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "PROCESSDEFVERID", column = "PROCESSDEFVERID"),
   Result(property = "ACTIVITYDEFID", column = "ACTIVITYDEFID"),
   Result(property = "OWNER", column = "OWNER"),
   Result(property = "OWNERDEPTID", column = "OWNERDEPTID"),
   Result(property = "TARGET", column = "TARGET"),
   Result(property = "TARGETDEPTID", column = "TARGETDEPTID"),
   Result(property = "TARGETCOMPANYID", column = "TARGETCOMPANYID"),
   Result(property = "TARGETROLEID", column = "TARGETROLEID"),
   Result(property = "DISPATCHSTATE", column = "DISPATCHSTATE"),
   Result(property = "PRIORITY", column = "PRIORITY"),
   Result(property = "DUETIME", column = "DUETIME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM wfc_taskmid
</script>""")
fun GetListAll():ArrayList<wfc_taskmid_dto>
        


}

        
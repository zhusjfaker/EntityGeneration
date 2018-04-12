

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfh_transition{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "SOURCEDEFID", column = "SOURCEDEFID"),
   Result(property = "SOURCETYPE", column = "SOURCETYPE"),
   Result(property = "SEQUENCEFLOWDEFID", column = "SEQUENCEFLOWDEFID"),
   Result(property = "TARGETDEFID", column = "TARGETDEFID"),
   Result(property = "TARGETTYPE", column = "TARGETTYPE"),
   Result(property = "ISACTIVE", column = "ISACTIVE"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "ENDTIME", column = "ENDTIME")
)
@Select("""<script>
   SELECT * FROM wfh_transition
</script>""")
fun GetListAll():ArrayList<wfh_transition_dto>
        


}

        
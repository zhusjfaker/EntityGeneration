

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_delegation{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "APPLICANTUSER", column = "APPLICANTUSER"),
   Result(property = "DELEGATEUSER", column = "DELEGATEUSER"),
   Result(property = "SCOPETYPE", column = "SCOPETYPE"),
   Result(property = "DELEGATEREASON", column = "DELEGATEREASON"),
   Result(property = "BEGINTIME", column = "BEGINTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID")
)
@Select("""<script>
   SELECT * FROM sys_delegation
</script>""")
fun GetListAll():ArrayList<sys_delegation_dto>
        


}

        
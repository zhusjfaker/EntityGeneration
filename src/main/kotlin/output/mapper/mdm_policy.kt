

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface mdm_policy{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "NAME", column = "NAME"),
   Result(property = "DESCRIPTION", column = "DESCRIPTION"),
   Result(property = "FILE_NAME", column = "FILE_NAME"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "ALLOW_ROOT", column = "ALLOW_ROOT"),
   Result(property = "POLICYVERSION", column = "POLICYVERSION"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "UPDATETIME", column = "UPDATETIME")
)
@Select("""<script>
   SELECT * FROM mdm_policy
</script>""")
fun GetListAll():ArrayList<mdm_policy_dto>
        


}

        
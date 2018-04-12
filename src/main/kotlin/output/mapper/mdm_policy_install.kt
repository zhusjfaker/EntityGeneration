

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface mdm_policy_install{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "POLICYID", column = "POLICYID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "INSTALLVERSION", column = "INSTALLVERSION"),
   Result(property = "INSTALLTIME", column = "INSTALLTIME")
)
@Select("""<script>
   SELECT * FROM mdm_policy_install
</script>""")
fun GetListAll():ArrayList<mdm_policy_install_dto>
        


}

        
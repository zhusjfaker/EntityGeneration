

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_patch_bootstrap{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "CLASSNAME", column = "CLASSNAME"),
   Result(property = "PATCHNAME", column = "PATCHNAME"),
   Result(property = "PATCHDESC", column = "PATCHDESC"),
   Result(property = "PATCHDATE", column = "PATCHDATE"),
   Result(property = "BEGINTIME", column = "BEGINTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "PATCHSTATE", column = "PATCHSTATE"),
   Result(property = "ERRLOG", column = "ERRLOG"),
   Result(property = "INSTNAME", column = "INSTNAME")
)
@Select("""<script>
   SELECT * FROM sys_patch_bootstrap
</script>""")
fun GetListAll():ArrayList<sys_patch_bootstrap_dto>
        


}

        
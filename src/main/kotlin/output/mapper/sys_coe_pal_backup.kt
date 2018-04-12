

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_backup{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "BACKUPTIME", column = "BACKUPTIME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "REMARK", column = "REMARK"),
   Result(property = "STATE", column = "STATE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_backup
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_backup_dto>
        


}

        
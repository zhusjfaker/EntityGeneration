

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfc_formfiles{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "BOID", column = "BOID"),
   Result(property = "BONAME", column = "BONAME"),
   Result(property = "BOFIELDNAME", column = "BOFIELDNAME"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "FILENAME", column = "FILENAME"),
   Result(property = "FILESIZE", column = "FILESIZE"),
   Result(property = "REMARK", column = "REMARK"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "SECURITYLEVEL", column = "SECURITYLEVEL")
)
@Select("""<script>
   SELECT * FROM wfc_formfiles
</script>""")
fun GetListAll():ArrayList<wfc_formfiles_dto>
        


}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_upfile{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PALREPOSITORYID", column = "PALREPOSITORYID"),
   Result(property = "SHAPEID", column = "SHAPEID"),
   Result(property = "FILETYPE", column = "FILETYPE"),
   Result(property = "FILENAME", column = "FILENAME"),
   Result(property = "DOWNLOAD", column = "DOWNLOAD"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_upfile
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_upfile_dto>
        


}

        
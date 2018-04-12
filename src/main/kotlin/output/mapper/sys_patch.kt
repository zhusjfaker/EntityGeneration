

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_patch{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DOWNLOADID", column = "DOWNLOADID"),
   Result(property = "VERSIONID", column = "VERSIONID"),
   Result(property = "OPSTATE", column = "OPSTATE"),
   Result(property = "OPDATE", column = "OPDATE"),
   Result(property = "MD5DIGEST", column = "MD5DIGEST"),
   Result(property = "ISDEGRADE", column = "ISDEGRADE"),
   Result(property = "RELEASETYPE", column = "RELEASETYPE")
)
@Select("""<script>
   SELECT * FROM sys_patch
</script>""")
fun GetListAll():ArrayList<sys_patch_dto>
        


}

        
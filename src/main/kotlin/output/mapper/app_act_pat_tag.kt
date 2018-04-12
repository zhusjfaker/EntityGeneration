

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_pat_tag{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TAGNAME", column = "TAGNAME"),
   Result(property = "TESTCASEID", column = "TESTCASEID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_pat_tag
</script>""")
fun GetListAll():ArrayList<app_act_pat_tag_dto>
        


}

        
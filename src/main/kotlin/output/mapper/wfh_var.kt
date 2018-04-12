

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfh_var{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "VARSCOPE", column = "VARSCOPE"),
   Result(property = "VARNAME", column = "VARNAME"),
   Result(property = "VALUETYPE", column = "VALUETYPE"),
   Result(property = "TEXTVALUE", column = "TEXTVALUE"),
   Result(property = "LONGVALUE", column = "LONGVALUE"),
   Result(property = "DOUBLEVALUE", column = "DOUBLEVALUE"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "UPDATETIME", column = "UPDATETIME")
)
@Select("""<script>
   SELECT * FROM wfh_var
</script>""")
fun GetListAll():ArrayList<wfh_var_dto>
        


}

        
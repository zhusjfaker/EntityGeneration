

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_iweboffice_tem_type{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TYPENAME", column = "TYPENAME"),
   Result(property = "TYPEDESC", column = "TYPEDESC"),
   Result(property = "POSTFIX", column = "POSTFIX"),
   Result(property = "ISPAUSE", column = "ISPAUSE")
)
@Select("""<script>
   SELECT * FROM app_act_iweboffice_tem_type
</script>""")
fun GetListAll():ArrayList<app_act_iweboffice_tem_type_dto>
        


}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_iweboffice_tem{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TYPEID", column = "TYPEID"),
   Result(property = "TEMPLATENAME", column = "TEMPLATENAME"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "ISPAUSE", column = "ISPAUSE")
)
@Select("""<script>
   SELECT * FROM app_act_iweboffice_tem
</script>""")
fun GetListAll():ArrayList<app_act_iweboffice_tem_dto>
        


}

        
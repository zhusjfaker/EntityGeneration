

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_act_dict_kv_main{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ORGID", column = "ORGID"),
   Result(property = "BINDID", column = "BINDID"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE"),
   Result(property = "UPDATEUSER", column = "UPDATEUSER"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ISEND", column = "ISEND"),
   Result(property = "DICTNAME", column = "DICTNAME"),
   Result(property = "DICTKEY", column = "DICTKEY"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "ISCACHE", column = "ISCACHE"),
   Result(property = "ISSYS", column = "ISSYS"),
   Result(property = "ISTREE", column = "ISTREE"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "DICTMETA", column = "DICTMETA"),
   Result(property = "DICTCATEGORY", column = "DICTCATEGORY"),
   Result(property = "COMPONENTSETTING", column = "COMPONENTSETTING")
)
@Select("""<script>
   SELECT * FROM bo_act_dict_kv_main
</script>""")
fun GetListAll():ArrayList<bo_act_dict_kv_main_dto>
        


}

        
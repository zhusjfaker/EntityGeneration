

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_act_sso_system{


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
   Result(property = "SSONAME", column = "SSONAME"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "ICON32", column = "ICON32"),
   Result(property = "ICON96", column = "ICON96"),
   Result(property = "LOGINURL", column = "LOGINURL"),
   Result(property = "SUBMITTYPE", column = "SUBMITTYPE"),
   Result(property = "LOGINTARGET", column = "LOGINTARGET"),
   Result(property = "ISACTIVE", column = "ISACTIVE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "ACCESSKEY", column = "ACCESSKEY"),
   Result(property = "SEC", column = "SEC")
)
@Select("""<script>
   SELECT * FROM bo_act_sso_system
</script>""")
fun GetListAll():ArrayList<bo_act_sso_system_dto>
        


}

        
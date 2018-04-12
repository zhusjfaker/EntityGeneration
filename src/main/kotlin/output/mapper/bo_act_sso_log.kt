

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_act_sso_log{


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
   Result(property = "OPTTYPE", column = "OPTTYPE"),
   Result(property = "OPTSTATE", column = "OPTSTATE"),
   Result(property = "SSOID", column = "SSOID"),
   Result(property = "SSONAME", column = "SSONAME"),
   Result(property = "OPTTIME", column = "OPTTIME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "USERNAME", column = "USERNAME"),
   Result(property = "OPTIP", column = "OPTIP"),
   Result(property = "DEPTID", column = "DEPTID"),
   Result(property = "DEPTNAME", column = "DEPTNAME"),
   Result(property = "COMPANYID", column = "COMPANYID"),
   Result(property = "COMPANYNAME", column = "COMPANYNAME")
)
@Select("""<script>
   SELECT * FROM bo_act_sso_log
</script>""")
fun GetListAll():ArrayList<bo_act_sso_log_dto>
        


}

        
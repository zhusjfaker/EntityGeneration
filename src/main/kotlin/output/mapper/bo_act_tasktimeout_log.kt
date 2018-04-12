

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_act_tasktimeout_log{


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
   Result(property = "YEAR", column = "YEAR"),
   Result(property = "MONTH", column = "MONTH"),
   Result(property = "DAY", column = "DAY"),
   Result(property = "HM", column = "HM"),
   Result(property = "PINSTID", column = "PINSTID"),
   Result(property = "TINSTID", column = "TINSTID"),
   Result(property = "TASKTITLE", column = "TASKTITLE"),
   Result(property = "KPISCORE", column = "KPISCORE"),
   Result(property = "EXECMEMO", column = "EXECMEMO"),
   Result(property = "COMPANYID", column = "COMPANYID"),
   Result(property = "COMPANYNAME", column = "COMPANYNAME"),
   Result(property = "DEPTID", column = "DEPTID"),
   Result(property = "DEPTNAME", column = "DEPTNAME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "USERNAME", column = "USERNAME"),
   Result(property = "ROLEID", column = "ROLEID"),
   Result(property = "ROLENAME", column = "ROLENAME"),
   Result(property = "POLICYID", column = "POLICYID"),
   Result(property = "RECORDTIME", column = "RECORDTIME"),
   Result(property = "PDEFID", column = "PDEFID"),
   Result(property = "TDEFID", column = "TDEFID"),
   Result(property = "ACTIONTYPE", column = "ACTIONTYPE")
)
@Select("""<script>
   SELECT * FROM bo_act_tasktimeout_log
</script>""")
fun GetListAll():ArrayList<bo_act_tasktimeout_log_dto>
        


}

        
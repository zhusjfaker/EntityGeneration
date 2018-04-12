

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_eu_ceshibt{


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
   Result(property = "APPLICANTUSER", column = "APPLICANTUSER"),
   Result(property = "USERNAME", column = "USERNAME"),
   Result(property = "USERDEPT", column = "USERDEPT"),
   Result(property = "SCOPETYPE", column = "SCOPETYPE"),
   Result(property = "SCOPE", column = "SCOPE"),
   Result(property = "BEGIN_TIME", column = "BEGIN_TIME"),
   Result(property = "END_TIME", column = "END_TIME")
)
@Select("""<script>
   SELECT * FROM bo_eu_ceshibt
</script>""")
fun GetListAll():ArrayList<bo_eu_ceshibt_dto>
        


}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_personaladdress{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "EMAIL", column = "EMAIL"),
   Result(property = "GROUPNAME", column = "GROUPNAME"),
   Result(property = "FAMILYNAME", column = "FAMILYNAME"),
   Result(property = "SUFFIXNAME", column = "SUFFIXNAME"),
   Result(property = "FULLNAME", column = "FULLNAME"),
   Result(property = "PY", column = "PY"),
   Result(property = "PYINDEX", column = "PYINDEX"),
   Result(property = "BCOMPANY", column = "BCOMPANY"),
   Result(property = "BWWW", column = "BWWW"),
   Result(property = "BDEPT", column = "BDEPT"),
   Result(property = "BPOSITION", column = "BPOSITION"),
   Result(property = "BADDRESS", column = "BADDRESS"),
   Result(property = "BPOSTCODE", column = "BPOSTCODE"),
   Result(property = "BCOUNTRY", column = "BCOUNTRY"),
   Result(property = "BCITY", column = "BCITY"),
   Result(property = "BTEL", column = "BTEL"),
   Result(property = "BFAX", column = "BFAX"),
   Result(property = "PPOSTCODE", column = "PPOSTCODE"),
   Result(property = "PADDRESS", column = "PADDRESS"),
   Result(property = "PTEL", column = "PTEL"),
   Result(property = "PFAX", column = "PFAX"),
   Result(property = "PMOB", column = "PMOB"),
   Result(property = "PQQ", column = "PQQ"),
   Result(property = "PWEIBO", column = "PWEIBO"),
   Result(property = "PWEIXIN", column = "PWEIXIN"),
   Result(property = "PSKYPE", column = "PSKYPE"),
   Result(property = "PLIKE", column = "PLIKE"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "UPDATETIME", column = "UPDATETIME"),
   Result(property = "SHARETO", column = "SHARETO")
)
@Select("""<script>
   SELECT * FROM app_act_personaladdress
</script>""")
fun GetListAll():ArrayList<app_act_personaladdress_dto>
        


}

        
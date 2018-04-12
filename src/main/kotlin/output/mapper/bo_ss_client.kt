

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_ss_client{


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
   Result(property = "CCODE", column = "CCODE"),
   Result(property = "CNAME", column = "CNAME"),
   Result(property = "OFFADDR", column = "OFFADDR"),
   Result(property = "REGADDR", column = "REGADDR"),
   Result(property = "STATUS1", column = "STATUS1"),
   Result(property = "BANK", column = "BANK"),
   Result(property = "ACCOUNT", column = "ACCOUNT"),
   Result(property = "TAXNO", column = "TAXNO"),
   Result(property = "CATTRIBUTE", column = "CATTRIBUTE"),
   Result(property = "CREDIT", column = "CREDIT"),
   Result(property = "LIMITRANGE", column = "LIMITRANGE"),
   Result(property = "REGFUND", column = "REGFUND"),
   Result(property = "POSTCODE", column = "POSTCODE"),
   Result(property = "TEL", column = "TEL"),
   Result(property = "FAX", column = "FAX"),
   Result(property = "WWW", column = "WWW"),
   Result(property = "REGDATE", column = "REGDATE"),
   Result(property = "GTYPE", column = "GTYPE"),
   Result(property = "RECDATE", column = "RECDATE"),
   Result(property = "BUID", column = "BUID"),
   Result(property = "BUNAME", column = "BUNAME"),
   Result(property = "MODDATE", column = "MODDATE"),
   Result(property = "MEMO", column = "MEMO")
)
@Select("""<script>
   SELECT * FROM bo_ss_client
</script>""")
fun GetListAll():ArrayList<bo_ss_client_dto>
        


}

        
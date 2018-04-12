

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_ss_baseinfo{


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
   Result(property = "TYPE", column = "TYPE"),
   Result(property = "NAME", column = "NAME"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "GTYPE", column = "GTYPE"),
   Result(property = "SN", column = "SN"),
   Result(property = "TYPEID", column = "TYPEID"),
   Result(property = "CNNAME", column = "CNNAME"),
   Result(property = "ENNAME", column = "ENNAME"),
   Result(property = "BIG5NAME", column = "BIG5NAME")
)
@Select("""<script>
   SELECT * FROM bo_ss_baseinfo
</script>""")
fun GetListAll():ArrayList<bo_ss_baseinfo_dto>
        


}

        
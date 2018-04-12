

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_act_dict_kv_item{


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
   Result(property = "ITEMNO", column = "ITEMNO"),
   Result(property = "CNNAME", column = "CNNAME"),
   Result(property = "ENNAME", column = "ENNAME"),
   Result(property = "BIG5NAME", column = "BIG5NAME"),
   Result(property = "EXTTEXT1", column = "EXTTEXT1"),
   Result(property = "EXTTEXT2", column = "EXTTEXT2"),
   Result(property = "EXTTEXT3", column = "EXTTEXT3"),
   Result(property = "EXTTEXT4", column = "EXTTEXT4"),
   Result(property = "EXTTEXT5", column = "EXTTEXT5"),
   Result(property = "EXTTEXT6", column = "EXTTEXT6"),
   Result(property = "EXTTEXT7", column = "EXTTEXT7"),
   Result(property = "EXTTEXT8", column = "EXTTEXT8"),
   Result(property = "EXTTEXT9", column = "EXTTEXT9"),
   Result(property = "EXTTEXT10", column = "EXTTEXT10"),
   Result(property = "EXTINT1", column = "EXTINT1"),
   Result(property = "EXTINT2", column = "EXTINT2"),
   Result(property = "EXTINT3", column = "EXTINT3"),
   Result(property = "EXTINT4", column = "EXTINT4"),
   Result(property = "EXTINT5", column = "EXTINT5"),
   Result(property = "EXTDOUBLE1", column = "EXTDOUBLE1"),
   Result(property = "EXTDOUBLE2", column = "EXTDOUBLE2"),
   Result(property = "EXTDOUBLE3", column = "EXTDOUBLE3"),
   Result(property = "EXTDATE1", column = "EXTDATE1"),
   Result(property = "EXTDATE2", column = "EXTDATE2"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "ISACTIVE", column = "ISACTIVE"),
   Result(property = "ISSYS", column = "ISSYS"),
   Result(property = "DICTKEY", column = "DICTKEY"),
   Result(property = "PNO", column = "PNO"),
   Result(property = "ISLEAF", column = "ISLEAF")
)
@Select("""<script>
   SELECT * FROM bo_act_dict_kv_item
</script>""")
fun GetListAll():ArrayList<bo_act_dict_kv_item_dto>
        


}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface orgcompany{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "COMPANYNO", column = "COMPANYNO"),
   Result(property = "COMPANYNAME", column = "COMPANYNAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "WORKCANLENDAR", column = "WORKCANLENDAR"),
   Result(property = "COMPANYTYPE", column = "COMPANYTYPE"),
   Result(property = "COMPANYDESC", column = "COMPANYDESC"),
   Result(property = "LOOKANDFEEL", column = "LOOKANDFEEL"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "CLOSED", column = "CLOSED"),
   Result(property = "CLOSEDATE", column = "CLOSEDATE"),
   Result(property = "BEGINDATE", column = "BEGINDATE"),
   Result(property = "ENDDATE", column = "ENDDATE"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE")
)
@Select("""<script>
   SELECT * FROM orgcompany
</script>""")
fun GetListAll():ArrayList<orgcompany_dto>
        


}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface orgdepartment_bk{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PARENTDEPARTMENTID", column = "PARENTDEPARTMENTID"),
   Result(property = "DEPARTMENTNAME", column = "DEPARTMENTNAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "DEPARTMENTDESC", column = "DEPARTMENTDESC"),
   Result(property = "DEPARTMENTNO", column = "DEPARTMENTNO"),
   Result(property = "LAYER", column = "LAYER"),
   Result(property = "ADMINISTRATORS", column = "ADMINISTRATORS"),
   Result(property = "DEPARTMENTZONE", column = "DEPARTMENTZONE"),
   Result(property = "COMPANYID", column = "COMPANYID"),
   Result(property = "OUTERID", column = "OUTERID"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "WORKCANLENDAR", column = "WORKCANLENDAR"),
   Result(property = "ISUNIT", column = "ISUNIT"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "DEPARTMENTTYPE", column = "DEPARTMENTTYPE"),
   Result(property = "CLOSED", column = "CLOSED"),
   Result(property = "CLOSEDATE", column = "CLOSEDATE"),
   Result(property = "BEGINDATE", column = "BEGINDATE"),
   Result(property = "ENDDATE", column = "ENDDATE"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE")
)
@Select("""<script>
   SELECT * FROM orgdepartment_bk
</script>""")
fun GetListAll():ArrayList<orgdepartment_bk_dto>
        


}

        
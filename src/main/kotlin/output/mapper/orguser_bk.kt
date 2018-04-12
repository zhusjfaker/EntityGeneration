

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface orguser_bk{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERNO", column = "USERNO"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "USERNAME", column = "USERNAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "PASSWORD", column = "PASSWORD"),
   Result(property = "CLOSED", column = "CLOSED"),
   Result(property = "DEPARTMENTID", column = "DEPARTMENTID"),
   Result(property = "ROLEID", column = "ROLEID"),
   Result(property = "ISMANAGER", column = "ISMANAGER"),
   Result(property = "WORKCANLENDAR", column = "WORKCANLENDAR"),
   Result(property = "POSITION_NO", column = "POSITION_NO"),
   Result(property = "POSITION_NAME", column = "POSITION_NAME"),
   Result(property = "POSITION_LAYER", column = "POSITION_LAYER"),
   Result(property = "OFFICETEL", column = "OFFICETEL"),
   Result(property = "OFFICEFAX", column = "OFFICEFAX"),
   Result(property = "MOBILE", column = "MOBILE"),
   Result(property = "EMAIL", column = "EMAIL"),
   Result(property = "USERIP", column = "USERIP"),
   Result(property = "ISSINGLELOGIN", column = "ISSINGLELOGIN"),
   Result(property = "WORK_STATUS", column = "WORK_STATUS"),
   Result(property = "SESSIONTIME", column = "SESSIONTIME"),
   Result(property = "OUTERID", column = "OUTERID"),
   Result(property = "WECHAT", column = "WECHAT"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "REPORTTO", column = "REPORTTO"),
   Result(property = "CLOSEDATE", column = "CLOSEDATE"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE")
)
@Select("""<script>
   SELECT * FROM orguser_bk
</script>""")
fun GetListAll():ArrayList<orguser_bk_dto>
        


}

        
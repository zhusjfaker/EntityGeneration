

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_repository{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "PLRID", column = "PLRID"),
   Result(property = "PLNO", column = "PLNO"),
   Result(property = "PLNAME", column = "PLNAME"),
   Result(property = "PLLEVEL", column = "PLLEVEL"),
   Result(property = "PLPARENTID", column = "PLPARENTID"),
   Result(property = "PLORDERINDEX", column = "PLORDERINDEX"),
   Result(property = "PLISBOTTOMLEVEL", column = "PLISBOTTOMLEVEL"),
   Result(property = "PLDESC", column = "PLDESC"),
   Result(property = "PLRD", column = "PLRD"),
   Result(property = "PLRP", column = "PLRP"),
   Result(property = "PM", column = "PM"),
   Result(property = "PLINPUT", column = "PLINPUT"),
   Result(property = "PLOUTPUT", column = "PLOUTPUT"),
   Result(property = "PLEXECTYPE", column = "PLEXECTYPE"),
   Result(property = "PLSYSTEMNAME", column = "PLSYSTEMNAME"),
   Result(property = "PLAWSPID", column = "PLAWSPID"),
   Result(property = "PLDIAGRAMURL", column = "PLDIAGRAMURL"),
   Result(property = "PLCOLOR", column = "PLCOLOR"),
   Result(property = "PLCATEGORY", column = "PLCATEGORY"),
   Result(property = "PLMETHODID", column = "PLMETHODID"),
   Result(property = "PLVER", column = "PLVER"),
   Result(property = "PLVERSIONID", column = "PLVERSIONID"),
   Result(property = "ISUSE", column = "ISUSE"),
   Result(property = "ISPUBLISH", column = "ISPUBLISH"),
   Result(property = "ISSYSTEMFILE", column = "ISSYSTEMFILE"),
   Result(property = "FILEPATH", column = "FILEPATH"),
   Result(property = "HISTORYMAXVERSION", column = "HISTORYMAXVERSION"),
   Result(property = "VIEWCOUNT", column = "VIEWCOUNT"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "MODIFYUSER", column = "MODIFYUSER"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "MODIFYDATE", column = "MODIFYDATE"),
   Result(property = "PLDUTYDEPT", column = "PLDUTYDEPT"),
   Result(property = "PLDUTYPERSON", column = "PLDUTYPERSON")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_repository
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_repository_dto>
        


}

        
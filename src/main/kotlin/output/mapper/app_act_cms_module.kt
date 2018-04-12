

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_cms_module{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "MODULENAME", column = "MODULENAME"),
   Result(property = "MODULETYPE", column = "MODULETYPE"),
   Result(property = "MODULEDESC", column = "MODULEDESC"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "SITEID", column = "SITEID"),
   Result(property = "USEFLAG", column = "USEFLAG"),
   Result(property = "MODULESORT", column = "MODULESORT"),
   Result(property = "PROCESSID", column = "PROCESSID"),
   Result(property = "QUICKADDUSERLIST", column = "QUICKADDUSERLIST"),
   Result(property = "PID", column = "PID"),
   Result(property = "CANVISTIOUTERNET", column = "CANVISTIOUTERNET"),
   Result(property = "CANUSEDEPUTY", column = "CANUSEDEPUTY"),
   Result(property = "NORMALFLAG", column = "NORMALFLAG"),
   Result(property = "CONTENTTYPE", column = "CONTENTTYPE"),
   Result(property = "TITLEPICTURE", column = "TITLEPICTURE"),
   Result(property = "SUBPAGE", column = "SUBPAGE"),
   Result(property = "DETAILPAGE", column = "DETAILPAGE"),
   Result(property = "MODULELINKURL", column = "MODULELINKURL"),
   Result(property = "LINKMODULEFLAG", column = "LINKMODULEFLAG"),
   Result(property = "NAVSHOWFLAG", column = "NAVSHOWFLAG"),
   Result(property = "SHOWTITLEPICFLAG", column = "SHOWTITLEPICFLAG")
)
@Select("""<script>
   SELECT * FROM app_act_cms_module
</script>""")
fun GetListAll():ArrayList<app_act_cms_module_dto>
        


}

        
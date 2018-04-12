

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_cms_site{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SITENAME", column = "SITENAME"),
   Result(property = "SITEURL", column = "SITEURL"),
   Result(property = "SITEDESC", column = "SITEDESC"),
   Result(property = "SITESHOWBANNER", column = "SITESHOWBANNER"),
   Result(property = "SITEBANNERIMAGE", column = "SITEBANNERIMAGE"),
   Result(property = "USEFLAG", column = "USEFLAG"),
   Result(property = "SITETYPE", column = "SITETYPE"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "SHOWNAVFLAG", column = "SHOWNAVFLAG"),
   Result(property = "NAVFONTCOLOR", column = "NAVFONTCOLOR"),
   Result(property = "NAVBGCOLOR", column = "NAVBGCOLOR"),
   Result(property = "NAVHOVERFONTCOLOR", column = "NAVHOVERFONTCOLOR"),
   Result(property = "NAVHOVERBGCOLOR", column = "NAVHOVERBGCOLOR"),
   Result(property = "SITEBGIMAGE", column = "SITEBGIMAGE")
)
@Select("""<script>
   SELECT * FROM app_act_cms_site
</script>""")
fun GetListAll():ArrayList<app_act_cms_site_dto>
        


}

        
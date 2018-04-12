

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_cms_widget{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SITEID", column = "SITEID"),
   Result(property = "BOARDID", column = "BOARDID"),
   Result(property = "WIDGETNAME", column = "WIDGETNAME"),
   Result(property = "WIDGETDESC", column = "WIDGETDESC"),
   Result(property = "WIDGETSORT", column = "WIDGETSORT"),
   Result(property = "WIDGETWIDTH", column = "WIDGETWIDTH"),
   Result(property = "USEFLAG", column = "USEFLAG"),
   Result(property = "SHOWTITLEBARFLAG", column = "SHOWTITLEBARFLAG"),
   Result(property = "TITLEBARCOLOR", column = "TITLEBARCOLOR"),
   Result(property = "TITLEBARCONTENT", column = "TITLEBARCONTENT"),
   Result(property = "TABFLAG", column = "TABFLAG"),
   Result(property = "CONTENTFLAG", column = "CONTENTFLAG"),
   Result(property = "FONTCOLOR", column = "FONTCOLOR"),
   Result(property = "FONTSIZE", column = "FONTSIZE"),
   Result(property = "BORDERFLAG", column = "BORDERFLAG"),
   Result(property = "BORDERCOLOR", column = "BORDERCOLOR"),
   Result(property = "BGCOLOR", column = "BGCOLOR"),
   Result(property = "TOPRULEFLAG", column = "TOPRULEFLAG"),
   Result(property = "TOPNUM", column = "TOPNUM"),
   Result(property = "MODULEFORTOP", column = "MODULEFORTOP"),
   Result(property = "SYSTEMSTYLE", column = "SYSTEMSTYLE"),
   Result(property = "TITLEBARICON", column = "TITLEBARICON"),
   Result(property = "FONTFAMILY", column = "FONTFAMILY"),
   Result(property = "SHOWLISTICONFLAG", column = "SHOWLISTICONFLAG"),
   Result(property = "LISTICON", column = "LISTICON"),
   Result(property = "UNDERLINEFLAG", column = "UNDERLINEFLAG"),
   Result(property = "SHOWEXT", column = "SHOWEXT"),
   Result(property = "TITLEBARFONTCOLOR", column = "TITLEBARFONTCOLOR"),
   Result(property = "TITLEBARFONTSIZE", column = "TITLEBARFONTSIZE"),
   Result(property = "CUSTOMURL", column = "CUSTOMURL"),
   Result(property = "BORDERSHADOWFLAG", column = "BORDERSHADOWFLAG")
)
@Select("""<script>
   SELECT * FROM app_act_cms_widget
</script>""")
fun GetListAll():ArrayList<app_act_cms_widget_dto>
        


}

        
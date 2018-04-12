

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
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="SITEID!=null">
      SITEID=#{SITEID}
   </if> 
   <if test="BOARDID!=null">
      BOARDID=#{BOARDID}
   </if> 
   <if test="WIDGETNAME!=null">
      WIDGETNAME=#{WIDGETNAME}
   </if> 
   <if test="WIDGETDESC!=null">
      WIDGETDESC=#{WIDGETDESC}
   </if> 
   <if test="WIDGETSORT!=null">
      WIDGETSORT=#{WIDGETSORT}
   </if> 
   <if test="WIDGETWIDTH!=null">
      WIDGETWIDTH=#{WIDGETWIDTH}
   </if> 
   <if test="USEFLAG!=null">
      USEFLAG=#{USEFLAG}
   </if> 
   <if test="SHOWTITLEBARFLAG!=null">
      SHOWTITLEBARFLAG=#{SHOWTITLEBARFLAG}
   </if> 
   <if test="TITLEBARCOLOR!=null">
      TITLEBARCOLOR=#{TITLEBARCOLOR}
   </if> 
   <if test="TITLEBARCONTENT!=null">
      TITLEBARCONTENT=#{TITLEBARCONTENT}
   </if> 
   <if test="TABFLAG!=null">
      TABFLAG=#{TABFLAG}
   </if> 
   <if test="CONTENTFLAG!=null">
      CONTENTFLAG=#{CONTENTFLAG}
   </if> 
   <if test="FONTCOLOR!=null">
      FONTCOLOR=#{FONTCOLOR}
   </if> 
   <if test="FONTSIZE!=null">
      FONTSIZE=#{FONTSIZE}
   </if> 
   <if test="BORDERFLAG!=null">
      BORDERFLAG=#{BORDERFLAG}
   </if> 
   <if test="BORDERCOLOR!=null">
      BORDERCOLOR=#{BORDERCOLOR}
   </if> 
   <if test="BGCOLOR!=null">
      BGCOLOR=#{BGCOLOR}
   </if> 
   <if test="TOPRULEFLAG!=null">
      TOPRULEFLAG=#{TOPRULEFLAG}
   </if> 
   <if test="TOPNUM!=null">
      TOPNUM=#{TOPNUM}
   </if> 
   <if test="MODULEFORTOP!=null">
      MODULEFORTOP=#{MODULEFORTOP}
   </if> 
   <if test="SYSTEMSTYLE!=null">
      SYSTEMSTYLE=#{SYSTEMSTYLE}
   </if> 
   <if test="TITLEBARICON!=null">
      TITLEBARICON=#{TITLEBARICON}
   </if> 
   <if test="FONTFAMILY!=null">
      FONTFAMILY=#{FONTFAMILY}
   </if> 
   <if test="SHOWLISTICONFLAG!=null">
      SHOWLISTICONFLAG=#{SHOWLISTICONFLAG}
   </if> 
   <if test="LISTICON!=null">
      LISTICON=#{LISTICON}
   </if> 
   <if test="UNDERLINEFLAG!=null">
      UNDERLINEFLAG=#{UNDERLINEFLAG}
   </if> 
   <if test="SHOWEXT!=null">
      SHOWEXT=#{SHOWEXT}
   </if> 
   <if test="TITLEBARFONTCOLOR!=null">
      TITLEBARFONTCOLOR=#{TITLEBARFONTCOLOR}
   </if> 
   <if test="TITLEBARFONTSIZE!=null">
      TITLEBARFONTSIZE=#{TITLEBARFONTSIZE}
   </if> 
   <if test="CUSTOMURL!=null">
      CUSTOMURL=#{CUSTOMURL}
   </if> 
   <if test="BORDERSHADOWFLAG!=null">
      BORDERSHADOWFLAG=#{BORDERSHADOWFLAG}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_cms_widget_dto):ArrayList<app_act_cms_widget_dto>
                


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
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_cms_widget_dto):app_act_cms_widget_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,SITEID,BOARDID,WIDGETNAME,WIDGETDESC,WIDGETSORT,WIDGETWIDTH,USEFLAG,SHOWTITLEBARFLAG,TITLEBARCOLOR,TITLEBARCONTENT,TABFLAG,CONTENTFLAG,FONTCOLOR,FONTSIZE,BORDERFLAG,BORDERCOLOR,BGCOLOR,TOPRULEFLAG,TOPNUM,MODULEFORTOP,SYSTEMSTYLE,TITLEBARICON,FONTFAMILY,SHOWLISTICONFLAG,LISTICON,UNDERLINEFLAG,SHOWEXT,TITLEBARFONTCOLOR,TITLEBARFONTSIZE,CUSTOMURL,BORDERSHADOWFLAG)
    values
    (#{ID},#{SITEID},#{BOARDID},#{WIDGETNAME},#{WIDGETDESC},#{WIDGETSORT},#{WIDGETWIDTH},#{USEFLAG},#{SHOWTITLEBARFLAG},#{TITLEBARCOLOR},#{TITLEBARCONTENT},#{TABFLAG},#{CONTENTFLAG},#{FONTCOLOR},#{FONTSIZE},#{BORDERFLAG},#{BORDERCOLOR},#{BGCOLOR},#{TOPRULEFLAG},#{TOPNUM},#{MODULEFORTOP},#{SYSTEMSTYLE},#{TITLEBARICON},#{FONTFAMILY},#{SHOWLISTICONFLAG},#{LISTICON},#{UNDERLINEFLAG},#{SHOWEXT},#{TITLEBARFONTCOLOR},#{TITLEBARFONTSIZE},#{CUSTOMURL},#{BORDERSHADOWFLAG})
</script>""")
fun insert(model:app_act_cms_widget_dto):Unit
                

}

        
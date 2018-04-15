

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
    insert into app_act_cms_widget
    (ID,SITEID,BOARDID,WIDGETNAME,WIDGETDESC,WIDGETSORT,WIDGETWIDTH,USEFLAG,SHOWTITLEBARFLAG,TITLEBARCOLOR,TITLEBARCONTENT,TABFLAG,CONTENTFLAG,FONTCOLOR,FONTSIZE,BORDERFLAG,BORDERCOLOR,BGCOLOR,TOPRULEFLAG,TOPNUM,MODULEFORTOP,SYSTEMSTYLE,TITLEBARICON,FONTFAMILY,SHOWLISTICONFLAG,LISTICON,UNDERLINEFLAG,SHOWEXT,TITLEBARFONTCOLOR,TITLEBARFONTSIZE,CUSTOMURL,BORDERSHADOWFLAG)
    values
    (#{ID},#{SITEID},#{BOARDID},#{WIDGETNAME},#{WIDGETDESC},#{WIDGETSORT},#{WIDGETWIDTH},#{USEFLAG},#{SHOWTITLEBARFLAG},#{TITLEBARCOLOR},#{TITLEBARCONTENT},#{TABFLAG},#{CONTENTFLAG},#{FONTCOLOR},#{FONTSIZE},#{BORDERFLAG},#{BORDERCOLOR},#{BGCOLOR},#{TOPRULEFLAG},#{TOPNUM},#{MODULEFORTOP},#{SYSTEMSTYLE},#{TITLEBARICON},#{FONTFAMILY},#{SHOWLISTICONFLAG},#{LISTICON},#{UNDERLINEFLAG},#{SHOWEXT},#{TITLEBARFONTCOLOR},#{TITLEBARFONTSIZE},#{CUSTOMURL},#{BORDERSHADOWFLAG})
</script>""")
fun Insert(model:app_act_cms_widget_dto):Unit
                


@Insert("""<script>
    insert into app_act_cms_widget
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='SITEID!= null'> 
           SITEID,
        </if>
        <if test='BOARDID!= null'> 
           BOARDID,
        </if>
        <if test='WIDGETNAME!= null'> 
           WIDGETNAME,
        </if>
        <if test='WIDGETDESC!= null'> 
           WIDGETDESC,
        </if>
        <if test='WIDGETSORT!= null'> 
           WIDGETSORT,
        </if>
        <if test='WIDGETWIDTH!= null'> 
           WIDGETWIDTH,
        </if>
        <if test='USEFLAG!= null'> 
           USEFLAG,
        </if>
        <if test='SHOWTITLEBARFLAG!= null'> 
           SHOWTITLEBARFLAG,
        </if>
        <if test='TITLEBARCOLOR!= null'> 
           TITLEBARCOLOR,
        </if>
        <if test='TITLEBARCONTENT!= null'> 
           TITLEBARCONTENT,
        </if>
        <if test='TABFLAG!= null'> 
           TABFLAG,
        </if>
        <if test='CONTENTFLAG!= null'> 
           CONTENTFLAG,
        </if>
        <if test='FONTCOLOR!= null'> 
           FONTCOLOR,
        </if>
        <if test='FONTSIZE!= null'> 
           FONTSIZE,
        </if>
        <if test='BORDERFLAG!= null'> 
           BORDERFLAG,
        </if>
        <if test='BORDERCOLOR!= null'> 
           BORDERCOLOR,
        </if>
        <if test='BGCOLOR!= null'> 
           BGCOLOR,
        </if>
        <if test='TOPRULEFLAG!= null'> 
           TOPRULEFLAG,
        </if>
        <if test='TOPNUM!= null'> 
           TOPNUM,
        </if>
        <if test='MODULEFORTOP!= null'> 
           MODULEFORTOP,
        </if>
        <if test='SYSTEMSTYLE!= null'> 
           SYSTEMSTYLE,
        </if>
        <if test='TITLEBARICON!= null'> 
           TITLEBARICON,
        </if>
        <if test='FONTFAMILY!= null'> 
           FONTFAMILY,
        </if>
        <if test='SHOWLISTICONFLAG!= null'> 
           SHOWLISTICONFLAG,
        </if>
        <if test='LISTICON!= null'> 
           LISTICON,
        </if>
        <if test='UNDERLINEFLAG!= null'> 
           UNDERLINEFLAG,
        </if>
        <if test='SHOWEXT!= null'> 
           SHOWEXT,
        </if>
        <if test='TITLEBARFONTCOLOR!= null'> 
           TITLEBARFONTCOLOR,
        </if>
        <if test='TITLEBARFONTSIZE!= null'> 
           TITLEBARFONTSIZE,
        </if>
        <if test='CUSTOMURL!= null'> 
           CUSTOMURL,
        </if>
        <if test='BORDERSHADOWFLAG!= null'> 
           BORDERSHADOWFLAG
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='SITEID!= null'> 
           #{SITEID,jdbcType=char}，
        </if>
        <if test='BOARDID!= null'> 
           #{BOARDID,jdbcType=char}，
        </if>
        <if test='WIDGETNAME!= null'> 
           #{WIDGETNAME,jdbcType=varchar}，
        </if>
        <if test='WIDGETDESC!= null'> 
           #{WIDGETDESC,jdbcType=varchar}，
        </if>
        <if test='WIDGETSORT!= null'> 
           #{WIDGETSORT,jdbcType=varchar}，
        </if>
        <if test='WIDGETWIDTH!= null'> 
           #{WIDGETWIDTH,jdbcType=varchar}，
        </if>
        <if test='USEFLAG!= null'> 
           #{USEFLAG,jdbcType=char}，
        </if>
        <if test='SHOWTITLEBARFLAG!= null'> 
           #{SHOWTITLEBARFLAG,jdbcType=char}，
        </if>
        <if test='TITLEBARCOLOR!= null'> 
           #{TITLEBARCOLOR,jdbcType=varchar}，
        </if>
        <if test='TITLEBARCONTENT!= null'> 
           #{TITLEBARCONTENT,jdbcType=varchar}，
        </if>
        <if test='TABFLAG!= null'> 
           #{TABFLAG,jdbcType=char}，
        </if>
        <if test='CONTENTFLAG!= null'> 
           #{CONTENTFLAG,jdbcType=char}，
        </if>
        <if test='FONTCOLOR!= null'> 
           #{FONTCOLOR,jdbcType=varchar}，
        </if>
        <if test='FONTSIZE!= null'> 
           #{FONTSIZE,jdbcType=varchar}，
        </if>
        <if test='BORDERFLAG!= null'> 
           #{BORDERFLAG,jdbcType=char}，
        </if>
        <if test='BORDERCOLOR!= null'> 
           #{BORDERCOLOR,jdbcType=varchar}，
        </if>
        <if test='BGCOLOR!= null'> 
           #{BGCOLOR,jdbcType=varchar}，
        </if>
        <if test='TOPRULEFLAG!= null'> 
           #{TOPRULEFLAG,jdbcType=char}，
        </if>
        <if test='TOPNUM!= null'> 
           #{TOPNUM,jdbcType=varchar}，
        </if>
        <if test='MODULEFORTOP!= null'> 
           #{MODULEFORTOP,jdbcType=text}，
        </if>
        <if test='SYSTEMSTYLE!= null'> 
           #{SYSTEMSTYLE,jdbcType=varchar}，
        </if>
        <if test='TITLEBARICON!= null'> 
           #{TITLEBARICON,jdbcType=varchar}，
        </if>
        <if test='FONTFAMILY!= null'> 
           #{FONTFAMILY,jdbcType=varchar}，
        </if>
        <if test='SHOWLISTICONFLAG!= null'> 
           #{SHOWLISTICONFLAG,jdbcType=char}，
        </if>
        <if test='LISTICON!= null'> 
           #{LISTICON,jdbcType=varchar}，
        </if>
        <if test='UNDERLINEFLAG!= null'> 
           #{UNDERLINEFLAG,jdbcType=char}，
        </if>
        <if test='SHOWEXT!= null'> 
           #{SHOWEXT,jdbcType=varchar}，
        </if>
        <if test='TITLEBARFONTCOLOR!= null'> 
           #{TITLEBARFONTCOLOR,jdbcType=varchar}，
        </if>
        <if test='TITLEBARFONTSIZE!= null'> 
           #{TITLEBARFONTSIZE,jdbcType=varchar}，
        </if>
        <if test='CUSTOMURL!= null'> 
           #{CUSTOMURL,jdbcType=varchar}，
        </if>
        <if test='BORDERSHADOWFLAG!= null'> 
           #{BORDERSHADOWFLAG,jdbcType=char}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_cms_widget_dto):Unit
                


@Delete("DELETE FROM app_act_cms_widget WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE app_act_cms_widget SET
        ID=#{ID,jdbcType=String},
        SITEID=#{SITEID,jdbcType=String},
        BOARDID=#{BOARDID,jdbcType=String},
        WIDGETNAME=#{WIDGETNAME,jdbcType=String},
        WIDGETDESC=#{WIDGETDESC,jdbcType=String},
        WIDGETSORT=#{WIDGETSORT,jdbcType=String},
        WIDGETWIDTH=#{WIDGETWIDTH,jdbcType=String},
        USEFLAG=#{USEFLAG,jdbcType=String},
        SHOWTITLEBARFLAG=#{SHOWTITLEBARFLAG,jdbcType=String},
        TITLEBARCOLOR=#{TITLEBARCOLOR,jdbcType=String},
        TITLEBARCONTENT=#{TITLEBARCONTENT,jdbcType=String},
        TABFLAG=#{TABFLAG,jdbcType=String},
        CONTENTFLAG=#{CONTENTFLAG,jdbcType=String},
        FONTCOLOR=#{FONTCOLOR,jdbcType=String},
        FONTSIZE=#{FONTSIZE,jdbcType=String},
        BORDERFLAG=#{BORDERFLAG,jdbcType=String},
        BORDERCOLOR=#{BORDERCOLOR,jdbcType=String},
        BGCOLOR=#{BGCOLOR,jdbcType=String},
        TOPRULEFLAG=#{TOPRULEFLAG,jdbcType=String},
        TOPNUM=#{TOPNUM,jdbcType=String},
        MODULEFORTOP=#{MODULEFORTOP,jdbcType=String},
        SYSTEMSTYLE=#{SYSTEMSTYLE,jdbcType=String},
        TITLEBARICON=#{TITLEBARICON,jdbcType=String},
        FONTFAMILY=#{FONTFAMILY,jdbcType=String},
        SHOWLISTICONFLAG=#{SHOWLISTICONFLAG,jdbcType=String},
        LISTICON=#{LISTICON,jdbcType=String},
        UNDERLINEFLAG=#{UNDERLINEFLAG,jdbcType=String},
        SHOWEXT=#{SHOWEXT,jdbcType=String},
        TITLEBARFONTCOLOR=#{TITLEBARFONTCOLOR,jdbcType=String},
        TITLEBARFONTSIZE=#{TITLEBARFONTSIZE,jdbcType=String},
        CUSTOMURL=#{CUSTOMURL,jdbcType=String},
        BORDERSHADOWFLAG=#{BORDERSHADOWFLAG,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:app_act_cms_widget_dto)
        

@Update("""<script>
            UPDATE app_act_cms_widget SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="SITEID != null">  SITEID=#{SITEID,jdbcType=String},</if>
        <if test="BOARDID != null">  BOARDID=#{BOARDID,jdbcType=String},</if>
        <if test="WIDGETNAME != null">  WIDGETNAME=#{WIDGETNAME,jdbcType=String},</if>
        <if test="WIDGETDESC != null">  WIDGETDESC=#{WIDGETDESC,jdbcType=String},</if>
        <if test="WIDGETSORT != null">  WIDGETSORT=#{WIDGETSORT,jdbcType=String},</if>
        <if test="WIDGETWIDTH != null">  WIDGETWIDTH=#{WIDGETWIDTH,jdbcType=String},</if>
        <if test="USEFLAG != null">  USEFLAG=#{USEFLAG,jdbcType=String},</if>
        <if test="SHOWTITLEBARFLAG != null">  SHOWTITLEBARFLAG=#{SHOWTITLEBARFLAG,jdbcType=String},</if>
        <if test="TITLEBARCOLOR != null">  TITLEBARCOLOR=#{TITLEBARCOLOR,jdbcType=String},</if>
        <if test="TITLEBARCONTENT != null">  TITLEBARCONTENT=#{TITLEBARCONTENT,jdbcType=String},</if>
        <if test="TABFLAG != null">  TABFLAG=#{TABFLAG,jdbcType=String},</if>
        <if test="CONTENTFLAG != null">  CONTENTFLAG=#{CONTENTFLAG,jdbcType=String},</if>
        <if test="FONTCOLOR != null">  FONTCOLOR=#{FONTCOLOR,jdbcType=String},</if>
        <if test="FONTSIZE != null">  FONTSIZE=#{FONTSIZE,jdbcType=String},</if>
        <if test="BORDERFLAG != null">  BORDERFLAG=#{BORDERFLAG,jdbcType=String},</if>
        <if test="BORDERCOLOR != null">  BORDERCOLOR=#{BORDERCOLOR,jdbcType=String},</if>
        <if test="BGCOLOR != null">  BGCOLOR=#{BGCOLOR,jdbcType=String},</if>
        <if test="TOPRULEFLAG != null">  TOPRULEFLAG=#{TOPRULEFLAG,jdbcType=String},</if>
        <if test="TOPNUM != null">  TOPNUM=#{TOPNUM,jdbcType=String},</if>
        <if test="MODULEFORTOP != null">  MODULEFORTOP=#{MODULEFORTOP,jdbcType=String},</if>
        <if test="SYSTEMSTYLE != null">  SYSTEMSTYLE=#{SYSTEMSTYLE,jdbcType=String},</if>
        <if test="TITLEBARICON != null">  TITLEBARICON=#{TITLEBARICON,jdbcType=String},</if>
        <if test="FONTFAMILY != null">  FONTFAMILY=#{FONTFAMILY,jdbcType=String},</if>
        <if test="SHOWLISTICONFLAG != null">  SHOWLISTICONFLAG=#{SHOWLISTICONFLAG,jdbcType=String},</if>
        <if test="LISTICON != null">  LISTICON=#{LISTICON,jdbcType=String},</if>
        <if test="UNDERLINEFLAG != null">  UNDERLINEFLAG=#{UNDERLINEFLAG,jdbcType=String},</if>
        <if test="SHOWEXT != null">  SHOWEXT=#{SHOWEXT,jdbcType=String},</if>
        <if test="TITLEBARFONTCOLOR != null">  TITLEBARFONTCOLOR=#{TITLEBARFONTCOLOR,jdbcType=String},</if>
        <if test="TITLEBARFONTSIZE != null">  TITLEBARFONTSIZE=#{TITLEBARFONTSIZE,jdbcType=String},</if>
        <if test="CUSTOMURL != null">  CUSTOMURL=#{CUSTOMURL,jdbcType=String},</if>
        <if test="BORDERSHADOWFLAG != null">  BORDERSHADOWFLAG=#{BORDERSHADOWFLAG,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:app_act_cms_widget_dto)
            

}

        
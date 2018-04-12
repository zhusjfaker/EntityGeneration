

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_cms_board{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SITEID", column = "SITEID"),
   Result(property = "BOARDNAME", column = "BOARDNAME"),
   Result(property = "BOARDSORT", column = "BOARDSORT"),
   Result(property = "BOARDWIDTH", column = "BOARDWIDTH"),
   Result(property = "WIDGETHEIGHT", column = "WIDGETHEIGHT"),
   Result(property = "BOARDDESC", column = "BOARDDESC"),
   Result(property = "USEFLAG", column = "USEFLAG"),
   Result(property = "SHOWTITLEBARFLAG", column = "SHOWTITLEBARFLAG"),
   Result(property = "TITLEBARCOLOR", column = "TITLEBARCOLOR"),
   Result(property = "TITLEBARICON", column = "TITLEBARICON"),
   Result(property = "TITLEBARBGIMAGE", column = "TITLEBARBGIMAGE"),
   Result(property = "BOARDTITLEBARBGFLAG", column = "BOARDTITLEBARBGFLAG"),
   Result(property = "BOARDTITLEBARCONTENT", column = "BOARDTITLEBARCONTENT"),
   Result(property = "TITLEBARFONTCOLOR", column = "TITLEBARFONTCOLOR"),
   Result(property = "TITLEBARFONTSIZE", column = "TITLEBARFONTSIZE")
)
@Select("""<script>
   SELECT * FROM app_act_cms_board
</script>""")
fun GetListAll():ArrayList<app_act_cms_board_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SITEID", column = "SITEID"),
   Result(property = "BOARDNAME", column = "BOARDNAME"),
   Result(property = "BOARDSORT", column = "BOARDSORT"),
   Result(property = "BOARDWIDTH", column = "BOARDWIDTH"),
   Result(property = "WIDGETHEIGHT", column = "WIDGETHEIGHT"),
   Result(property = "BOARDDESC", column = "BOARDDESC"),
   Result(property = "USEFLAG", column = "USEFLAG"),
   Result(property = "SHOWTITLEBARFLAG", column = "SHOWTITLEBARFLAG"),
   Result(property = "TITLEBARCOLOR", column = "TITLEBARCOLOR"),
   Result(property = "TITLEBARICON", column = "TITLEBARICON"),
   Result(property = "TITLEBARBGIMAGE", column = "TITLEBARBGIMAGE"),
   Result(property = "BOARDTITLEBARBGFLAG", column = "BOARDTITLEBARBGFLAG"),
   Result(property = "BOARDTITLEBARCONTENT", column = "BOARDTITLEBARCONTENT"),
   Result(property = "TITLEBARFONTCOLOR", column = "TITLEBARFONTCOLOR"),
   Result(property = "TITLEBARFONTSIZE", column = "TITLEBARFONTSIZE")
)
@Select("""<script>
   SELECT * FROM app_act_cms_board
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="SITEID!=null">
      SITEID=#{SITEID}
   </if> 
   <if test="BOARDNAME!=null">
      BOARDNAME=#{BOARDNAME}
   </if> 
   <if test="BOARDSORT!=null">
      BOARDSORT=#{BOARDSORT}
   </if> 
   <if test="BOARDWIDTH!=null">
      BOARDWIDTH=#{BOARDWIDTH}
   </if> 
   <if test="WIDGETHEIGHT!=null">
      WIDGETHEIGHT=#{WIDGETHEIGHT}
   </if> 
   <if test="BOARDDESC!=null">
      BOARDDESC=#{BOARDDESC}
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
   <if test="TITLEBARICON!=null">
      TITLEBARICON=#{TITLEBARICON}
   </if> 
   <if test="TITLEBARBGIMAGE!=null">
      TITLEBARBGIMAGE=#{TITLEBARBGIMAGE}
   </if> 
   <if test="BOARDTITLEBARBGFLAG!=null">
      BOARDTITLEBARBGFLAG=#{BOARDTITLEBARBGFLAG}
   </if> 
   <if test="BOARDTITLEBARCONTENT!=null">
      BOARDTITLEBARCONTENT=#{BOARDTITLEBARCONTENT}
   </if> 
   <if test="TITLEBARFONTCOLOR!=null">
      TITLEBARFONTCOLOR=#{TITLEBARFONTCOLOR}
   </if> 
   <if test="TITLEBARFONTSIZE!=null">
      TITLEBARFONTSIZE=#{TITLEBARFONTSIZE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_cms_board_dto):ArrayList<app_act_cms_board_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SITEID", column = "SITEID"),
   Result(property = "BOARDNAME", column = "BOARDNAME"),
   Result(property = "BOARDSORT", column = "BOARDSORT"),
   Result(property = "BOARDWIDTH", column = "BOARDWIDTH"),
   Result(property = "WIDGETHEIGHT", column = "WIDGETHEIGHT"),
   Result(property = "BOARDDESC", column = "BOARDDESC"),
   Result(property = "USEFLAG", column = "USEFLAG"),
   Result(property = "SHOWTITLEBARFLAG", column = "SHOWTITLEBARFLAG"),
   Result(property = "TITLEBARCOLOR", column = "TITLEBARCOLOR"),
   Result(property = "TITLEBARICON", column = "TITLEBARICON"),
   Result(property = "TITLEBARBGIMAGE", column = "TITLEBARBGIMAGE"),
   Result(property = "BOARDTITLEBARBGFLAG", column = "BOARDTITLEBARBGFLAG"),
   Result(property = "BOARDTITLEBARCONTENT", column = "BOARDTITLEBARCONTENT"),
   Result(property = "TITLEBARFONTCOLOR", column = "TITLEBARFONTCOLOR"),
   Result(property = "TITLEBARFONTSIZE", column = "TITLEBARFONTSIZE")
)
@Select("""<script>
   SELECT * FROM app_act_cms_board
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_cms_board_dto):app_act_cms_board_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,SITEID,BOARDNAME,BOARDSORT,BOARDWIDTH,WIDGETHEIGHT,BOARDDESC,USEFLAG,SHOWTITLEBARFLAG,TITLEBARCOLOR,TITLEBARICON,TITLEBARBGIMAGE,BOARDTITLEBARBGFLAG,BOARDTITLEBARCONTENT,TITLEBARFONTCOLOR,TITLEBARFONTSIZE)
    values
    (#{ID},#{SITEID},#{BOARDNAME},#{BOARDSORT},#{BOARDWIDTH},#{WIDGETHEIGHT},#{BOARDDESC},#{USEFLAG},#{SHOWTITLEBARFLAG},#{TITLEBARCOLOR},#{TITLEBARICON},#{TITLEBARBGIMAGE},#{BOARDTITLEBARBGFLAG},#{BOARDTITLEBARCONTENT},#{TITLEBARFONTCOLOR},#{TITLEBARFONTSIZE})
</script>""")
fun insert(model:app_act_cms_board_dto):Unit
                

}

        
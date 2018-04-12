

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_portlet{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "CATEGORYNAME", column = "CATEGORYNAME"),
   Result(property = "PORTLETTITLE", column = "PORTLETTITLE"),
   Result(property = "PORTLETHEIGHT", column = "PORTLETHEIGHT"),
   Result(property = "LINKURL", column = "LINKURL"),
   Result(property = "ICON16", column = "ICON16"),
   Result(property = "ICON64", column = "ICON64"),
   Result(property = "ICON96", column = "ICON96"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "ISACTIVITY", column = "ISACTIVITY"),
   Result(property = "NOTIFIER", column = "NOTIFIER"),
   Result(property = "PORTLETCFG", column = "PORTLETCFG")
)
@Select("""<script>
   SELECT * FROM sys_portlet
</script>""")
fun GetListAll():ArrayList<sys_portlet_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "CATEGORYNAME", column = "CATEGORYNAME"),
   Result(property = "PORTLETTITLE", column = "PORTLETTITLE"),
   Result(property = "PORTLETHEIGHT", column = "PORTLETHEIGHT"),
   Result(property = "LINKURL", column = "LINKURL"),
   Result(property = "ICON16", column = "ICON16"),
   Result(property = "ICON64", column = "ICON64"),
   Result(property = "ICON96", column = "ICON96"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "ISACTIVITY", column = "ISACTIVITY"),
   Result(property = "NOTIFIER", column = "NOTIFIER"),
   Result(property = "PORTLETCFG", column = "PORTLETCFG")
)
@Select("""<script>
   SELECT * FROM sys_portlet
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="CATEGORYNAME!=null">
      CATEGORYNAME=#{CATEGORYNAME}
   </if> 
   <if test="PORTLETTITLE!=null">
      PORTLETTITLE=#{PORTLETTITLE}
   </if> 
   <if test="PORTLETHEIGHT!=null">
      PORTLETHEIGHT=#{PORTLETHEIGHT}
   </if> 
   <if test="LINKURL!=null">
      LINKURL=#{LINKURL}
   </if> 
   <if test="ICON16!=null">
      ICON16=#{ICON16}
   </if> 
   <if test="ICON64!=null">
      ICON64=#{ICON64}
   </if> 
   <if test="ICON96!=null">
      ICON96=#{ICON96}
   </if> 
   <if test="APPID!=null">
      APPID=#{APPID}
   </if> 
   <if test="ISACTIVITY!=null">
      ISACTIVITY=#{ISACTIVITY}
   </if> 
   <if test="NOTIFIER!=null">
      NOTIFIER=#{NOTIFIER}
   </if> 
   <if test="PORTLETCFG!=null">
      PORTLETCFG=#{PORTLETCFG}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_portlet_dto):ArrayList<sys_portlet_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "CATEGORYNAME", column = "CATEGORYNAME"),
   Result(property = "PORTLETTITLE", column = "PORTLETTITLE"),
   Result(property = "PORTLETHEIGHT", column = "PORTLETHEIGHT"),
   Result(property = "LINKURL", column = "LINKURL"),
   Result(property = "ICON16", column = "ICON16"),
   Result(property = "ICON64", column = "ICON64"),
   Result(property = "ICON96", column = "ICON96"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "ISACTIVITY", column = "ISACTIVITY"),
   Result(property = "NOTIFIER", column = "NOTIFIER"),
   Result(property = "PORTLETCFG", column = "PORTLETCFG")
)
@Select("""<script>
   SELECT * FROM sys_portlet
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_portlet_dto):sys_portlet_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,CATEGORYNAME,PORTLETTITLE,PORTLETHEIGHT,LINKURL,ICON16,ICON64,ICON96,APPID,ISACTIVITY,NOTIFIER,PORTLETCFG)
    values
    (#{ID},#{CATEGORYNAME},#{PORTLETTITLE},#{PORTLETHEIGHT},#{LINKURL},#{ICON16},#{ICON64},#{ICON96},#{APPID},#{ISACTIVITY},#{NOTIFIER},#{PORTLETCFG})
</script>""")
fun insert(model:sys_portlet_dto):Unit
                

}

        
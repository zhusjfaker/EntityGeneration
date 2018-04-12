

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_nav_system{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SYSTEMNAME", column = "SYSTEMNAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "LINKURL", column = "LINKURL"),
   Result(property = "LINKTARGET", column = "LINKTARGET"),
   Result(property = "ICON16", column = "ICON16"),
   Result(property = "ICON64", column = "ICON64"),
   Result(property = "ICON96", column = "ICON96"),
   Result(property = "NAVDESC", column = "NAVDESC"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "ISHIDDEN", column = "ISHIDDEN"),
   Result(property = "ISACTIVITY", column = "ISACTIVITY"),
   Result(property = "PORTALLAYOUT", column = "PORTALLAYOUT"),
   Result(property = "PORTALLOCKED", column = "PORTALLOCKED"),
   Result(property = "NOTIFIER", column = "NOTIFIER")
)
@Select("""<script>
   SELECT * FROM sys_nav_system
</script>""")
fun GetListAll():ArrayList<sys_nav_system_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SYSTEMNAME", column = "SYSTEMNAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "LINKURL", column = "LINKURL"),
   Result(property = "LINKTARGET", column = "LINKTARGET"),
   Result(property = "ICON16", column = "ICON16"),
   Result(property = "ICON64", column = "ICON64"),
   Result(property = "ICON96", column = "ICON96"),
   Result(property = "NAVDESC", column = "NAVDESC"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "ISHIDDEN", column = "ISHIDDEN"),
   Result(property = "ISACTIVITY", column = "ISACTIVITY"),
   Result(property = "PORTALLAYOUT", column = "PORTALLAYOUT"),
   Result(property = "PORTALLOCKED", column = "PORTALLOCKED"),
   Result(property = "NOTIFIER", column = "NOTIFIER")
)
@Select("""<script>
   SELECT * FROM sys_nav_system
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="SYSTEMNAME!=null">
      SYSTEMNAME=#{SYSTEMNAME}
   </if> 
   <if test="ORDERINDEX!=null">
      ORDERINDEX=#{ORDERINDEX}
   </if> 
   <if test="LINKURL!=null">
      LINKURL=#{LINKURL}
   </if> 
   <if test="LINKTARGET!=null">
      LINKTARGET=#{LINKTARGET}
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
   <if test="NAVDESC!=null">
      NAVDESC=#{NAVDESC}
   </if> 
   <if test="APPID!=null">
      APPID=#{APPID}
   </if> 
   <if test="ISHIDDEN!=null">
      ISHIDDEN=#{ISHIDDEN}
   </if> 
   <if test="ISACTIVITY!=null">
      ISACTIVITY=#{ISACTIVITY}
   </if> 
   <if test="PORTALLAYOUT!=null">
      PORTALLAYOUT=#{PORTALLAYOUT}
   </if> 
   <if test="PORTALLOCKED!=null">
      PORTALLOCKED=#{PORTALLOCKED}
   </if> 
   <if test="NOTIFIER!=null">
      NOTIFIER=#{NOTIFIER}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_nav_system_dto):ArrayList<sys_nav_system_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SYSTEMNAME", column = "SYSTEMNAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "LINKURL", column = "LINKURL"),
   Result(property = "LINKTARGET", column = "LINKTARGET"),
   Result(property = "ICON16", column = "ICON16"),
   Result(property = "ICON64", column = "ICON64"),
   Result(property = "ICON96", column = "ICON96"),
   Result(property = "NAVDESC", column = "NAVDESC"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "ISHIDDEN", column = "ISHIDDEN"),
   Result(property = "ISACTIVITY", column = "ISACTIVITY"),
   Result(property = "PORTALLAYOUT", column = "PORTALLAYOUT"),
   Result(property = "PORTALLOCKED", column = "PORTALLOCKED"),
   Result(property = "NOTIFIER", column = "NOTIFIER")
)
@Select("""<script>
   SELECT * FROM sys_nav_system
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_nav_system_dto):sys_nav_system_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,SYSTEMNAME,ORDERINDEX,LINKURL,LINKTARGET,ICON16,ICON64,ICON96,NAVDESC,APPID,ISHIDDEN,ISACTIVITY,PORTALLAYOUT,PORTALLOCKED,NOTIFIER)
    values
    (#{ID},#{SYSTEMNAME},#{ORDERINDEX},#{LINKURL},#{LINKTARGET},#{ICON16},#{ICON64},#{ICON96},#{NAVDESC},#{APPID},#{ISHIDDEN},#{ISACTIVITY},#{PORTALLAYOUT},#{PORTALLOCKED},#{NOTIFIER})
</script>""")
fun insert(model:sys_nav_system_dto):Unit
                

}

        
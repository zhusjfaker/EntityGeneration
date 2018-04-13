

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_nav_function{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DIRECTORYID", column = "DIRECTORYID"),
   Result(property = "FUNCTIONNAME", column = "FUNCTIONNAME"),
   Result(property = "LINKURL", column = "LINKURL"),
   Result(property = "LINKTARGET", column = "LINKTARGET"),
   Result(property = "ICON16", column = "ICON16"),
   Result(property = "ICON64", column = "ICON64"),
   Result(property = "ICON96", column = "ICON96"),
   Result(property = "NAVDESC", column = "NAVDESC"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "ISACTIVITY", column = "ISACTIVITY"),
   Result(property = "NOTIFIER", column = "NOTIFIER"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2")
)
@Select("""<script>
   SELECT * FROM sys_nav_function
</script>""")
fun GetListAll():ArrayList<sys_nav_function_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DIRECTORYID", column = "DIRECTORYID"),
   Result(property = "FUNCTIONNAME", column = "FUNCTIONNAME"),
   Result(property = "LINKURL", column = "LINKURL"),
   Result(property = "LINKTARGET", column = "LINKTARGET"),
   Result(property = "ICON16", column = "ICON16"),
   Result(property = "ICON64", column = "ICON64"),
   Result(property = "ICON96", column = "ICON96"),
   Result(property = "NAVDESC", column = "NAVDESC"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "ISACTIVITY", column = "ISACTIVITY"),
   Result(property = "NOTIFIER", column = "NOTIFIER"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2")
)
@Select("""<script>
   SELECT * FROM sys_nav_function
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="DIRECTORYID!=null">
      DIRECTORYID=#{DIRECTORYID}
   </if> 
   <if test="FUNCTIONNAME!=null">
      FUNCTIONNAME=#{FUNCTIONNAME}
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
   <if test="ORDERINDEX!=null">
      ORDERINDEX=#{ORDERINDEX}
   </if> 
   <if test="ISACTIVITY!=null">
      ISACTIVITY=#{ISACTIVITY}
   </if> 
   <if test="NOTIFIER!=null">
      NOTIFIER=#{NOTIFIER}
   </if> 
   <if test="EXT1!=null">
      EXT1=#{EXT1}
   </if> 
   <if test="EXT2!=null">
      EXT2=#{EXT2}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_nav_function_dto):ArrayList<sys_nav_function_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DIRECTORYID", column = "DIRECTORYID"),
   Result(property = "FUNCTIONNAME", column = "FUNCTIONNAME"),
   Result(property = "LINKURL", column = "LINKURL"),
   Result(property = "LINKTARGET", column = "LINKTARGET"),
   Result(property = "ICON16", column = "ICON16"),
   Result(property = "ICON64", column = "ICON64"),
   Result(property = "ICON96", column = "ICON96"),
   Result(property = "NAVDESC", column = "NAVDESC"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "ISACTIVITY", column = "ISACTIVITY"),
   Result(property = "NOTIFIER", column = "NOTIFIER"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2")
)
@Select("""<script>
   SELECT * FROM sys_nav_function
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_nav_function_dto):sys_nav_function_dto?
                


@Insert("""<script>
    insert into sys_nav_function
    (ID,DIRECTORYID,FUNCTIONNAME,LINKURL,LINKTARGET,ICON16,ICON64,ICON96,NAVDESC,APPID,ORDERINDEX,ISACTIVITY,NOTIFIER,EXT1,EXT2)
    values
    (#{ID},#{DIRECTORYID},#{FUNCTIONNAME},#{LINKURL},#{LINKTARGET},#{ICON16},#{ICON64},#{ICON96},#{NAVDESC},#{APPID},#{ORDERINDEX},#{ISACTIVITY},#{NOTIFIER},#{EXT1},#{EXT2})
</script>""")
fun Insert(model:sys_nav_function_dto):Unit
                


@Insert("""<script>
    insert into sys_nav_function
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
           DIRECTORYID,
           FUNCTIONNAME,
           LINKURL,
           LINKTARGET,
        <if test='ICON16!= null'> 
           ICON16,
        </if>
        <if test='ICON64!= null'> 
           ICON64,
        </if>
        <if test='ICON96!= null'> 
           ICON96,
        </if>
        <if test='NAVDESC!= null'> 
           NAVDESC,
        </if>
        <if test='APPID!= null'> 
           APPID,
        </if>
           ORDERINDEX,
        <if test='ISACTIVITY!= null'> 
           ISACTIVITY,
        </if>
        <if test='NOTIFIER!= null'> 
           NOTIFIER,
        </if>
        <if test='EXT1!= null'> 
           EXT1,
        </if>
        <if test='EXT2!= null'> 
           EXT2
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=varchar}，
           #{DIRECTORYID,jdbcType=varchar}，
           #{FUNCTIONNAME,jdbcType=varchar}，
           #{LINKURL,jdbcType=varchar}，
           #{LINKTARGET,jdbcType=varchar}，
        <if test='ICON16!= null'> 
           #{ICON16,jdbcType=varchar}，
        </if>
        <if test='ICON64!= null'> 
           #{ICON64,jdbcType=varchar}，
        </if>
        <if test='ICON96!= null'> 
           #{ICON96,jdbcType=varchar}，
        </if>
        <if test='NAVDESC!= null'> 
           #{NAVDESC,jdbcType=varchar}，
        </if>
        <if test='APPID!= null'> 
           #{APPID,jdbcType=varchar}，
        </if>
           #{ORDERINDEX,jdbcType=smallint}，
        <if test='ISACTIVITY!= null'> 
           #{ISACTIVITY,jdbcType=smallint}，
        </if>
        <if test='NOTIFIER!= null'> 
           #{NOTIFIER,jdbcType=varchar}，
        </if>
        <if test='EXT1!= null'> 
           #{EXT1,jdbcType=varchar}，
        </if>
        <if test='EXT2!= null'> 
           #{EXT2,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_nav_function_dto):Unit
                

}

        


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
    insert into sys_portlet
    (ID,CATEGORYNAME,PORTLETTITLE,PORTLETHEIGHT,LINKURL,ICON16,ICON64,ICON96,APPID,ISACTIVITY,NOTIFIER,PORTLETCFG)
    values
    (#{ID},#{CATEGORYNAME},#{PORTLETTITLE},#{PORTLETHEIGHT},#{LINKURL},#{ICON16},#{ICON64},#{ICON96},#{APPID},#{ISACTIVITY},#{NOTIFIER},#{PORTLETCFG})
</script>""")
fun Insert(model:sys_portlet_dto):Unit
                


@Insert("""<script>
    insert into sys_portlet
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='CATEGORYNAME!= null'> 
           CATEGORYNAME,
        </if>
        <if test='PORTLETTITLE!= null'> 
           PORTLETTITLE,
        </if>
        <if test='PORTLETHEIGHT!= null'> 
           PORTLETHEIGHT,
        </if>
        <if test='LINKURL!= null'> 
           LINKURL,
        </if>
        <if test='ICON16!= null'> 
           ICON16,
        </if>
        <if test='ICON64!= null'> 
           ICON64,
        </if>
        <if test='ICON96!= null'> 
           ICON96,
        </if>
        <if test='APPID!= null'> 
           APPID,
        </if>
        <if test='ISACTIVITY!= null'> 
           ISACTIVITY,
        </if>
        <if test='NOTIFIER!= null'> 
           NOTIFIER,
        </if>
        <if test='PORTLETCFG!= null'> 
           PORTLETCFG
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=varchar}，
        <if test='CATEGORYNAME!= null'> 
           #{CATEGORYNAME,jdbcType=varchar}，
        </if>
        <if test='PORTLETTITLE!= null'> 
           #{PORTLETTITLE,jdbcType=varchar}，
        </if>
        <if test='PORTLETHEIGHT!= null'> 
           #{PORTLETHEIGHT,jdbcType=varchar}，
        </if>
        <if test='LINKURL!= null'> 
           #{LINKURL,jdbcType=varchar}，
        </if>
        <if test='ICON16!= null'> 
           #{ICON16,jdbcType=varchar}，
        </if>
        <if test='ICON64!= null'> 
           #{ICON64,jdbcType=varchar}，
        </if>
        <if test='ICON96!= null'> 
           #{ICON96,jdbcType=varchar}，
        </if>
        <if test='APPID!= null'> 
           #{APPID,jdbcType=varchar}，
        </if>
        <if test='ISACTIVITY!= null'> 
           #{ISACTIVITY,jdbcType=smallint}，
        </if>
        <if test='NOTIFIER!= null'> 
           #{NOTIFIER,jdbcType=varchar}，
        </if>
        <if test='PORTLETCFG!= null'> 
           #{PORTLETCFG,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_portlet_dto):Unit
                


@Delete("DELETE FROM sys_portlet WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_portlet SET
        ID=#{ID,jdbcType=String},
        CATEGORYNAME=#{CATEGORYNAME,jdbcType=String},
        PORTLETTITLE=#{PORTLETTITLE,jdbcType=String},
        PORTLETHEIGHT=#{PORTLETHEIGHT,jdbcType=String},
        LINKURL=#{LINKURL,jdbcType=String},
        ICON16=#{ICON16,jdbcType=String},
        ICON64=#{ICON64,jdbcType=String},
        ICON96=#{ICON96,jdbcType=String},
        APPID=#{APPID,jdbcType=String},
        ISACTIVITY=#{ISACTIVITY,jdbcType=Integer},
        NOTIFIER=#{NOTIFIER,jdbcType=String},
        PORTLETCFG=#{PORTLETCFG,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_portlet_dto)
        

@Update("""<script>
            UPDATE sys_portlet SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="CATEGORYNAME != null">  CATEGORYNAME=#{CATEGORYNAME,jdbcType=String},</if>
        <if test="PORTLETTITLE != null">  PORTLETTITLE=#{PORTLETTITLE,jdbcType=String},</if>
        <if test="PORTLETHEIGHT != null">  PORTLETHEIGHT=#{PORTLETHEIGHT,jdbcType=String},</if>
        <if test="LINKURL != null">  LINKURL=#{LINKURL,jdbcType=String},</if>
        <if test="ICON16 != null">  ICON16=#{ICON16,jdbcType=String},</if>
        <if test="ICON64 != null">  ICON64=#{ICON64,jdbcType=String},</if>
        <if test="ICON96 != null">  ICON96=#{ICON96,jdbcType=String},</if>
        <if test="APPID != null">  APPID=#{APPID,jdbcType=String},</if>
        <if test="ISACTIVITY != null">  ISACTIVITY=#{ISACTIVITY,jdbcType=Integer},</if>
        <if test="NOTIFIER != null">  NOTIFIER=#{NOTIFIER,jdbcType=String},</if>
        <if test="PORTLETCFG != null">  PORTLETCFG=#{PORTLETCFG,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_portlet_dto)
            

}

        
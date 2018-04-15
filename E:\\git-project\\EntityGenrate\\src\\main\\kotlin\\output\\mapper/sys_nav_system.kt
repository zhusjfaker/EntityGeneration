

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
    insert into sys_nav_system
    (ID,SYSTEMNAME,ORDERINDEX,LINKURL,LINKTARGET,ICON16,ICON64,ICON96,NAVDESC,APPID,ISHIDDEN,ISACTIVITY,PORTALLAYOUT,PORTALLOCKED,NOTIFIER)
    values
    (#{ID},#{SYSTEMNAME},#{ORDERINDEX},#{LINKURL},#{LINKTARGET},#{ICON16},#{ICON64},#{ICON96},#{NAVDESC},#{APPID},#{ISHIDDEN},#{ISACTIVITY},#{PORTALLAYOUT},#{PORTALLOCKED},#{NOTIFIER})
</script>""")
fun Insert(model:sys_nav_system_dto):Unit
                


@Insert("""<script>
    insert into sys_nav_system
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
           SYSTEMNAME,
           ORDERINDEX,
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
        <if test='ISHIDDEN!= null'> 
           ISHIDDEN,
        </if>
        <if test='ISACTIVITY!= null'> 
           ISACTIVITY,
        </if>
        <if test='PORTALLAYOUT!= null'> 
           PORTALLAYOUT,
        </if>
        <if test='PORTALLOCKED!= null'> 
           PORTALLOCKED,
        </if>
        <if test='NOTIFIER!= null'> 
           NOTIFIER
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=varchar}，
           #{SYSTEMNAME,jdbcType=varchar}，
           #{ORDERINDEX,jdbcType=smallint}，
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
        <if test='ISHIDDEN!= null'> 
           #{ISHIDDEN,jdbcType=smallint}，
        </if>
        <if test='ISACTIVITY!= null'> 
           #{ISACTIVITY,jdbcType=smallint}，
        </if>
        <if test='PORTALLAYOUT!= null'> 
           #{PORTALLAYOUT,jdbcType=varchar}，
        </if>
        <if test='PORTALLOCKED!= null'> 
           #{PORTALLOCKED,jdbcType=varchar}，
        </if>
        <if test='NOTIFIER!= null'> 
           #{NOTIFIER,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_nav_system_dto):Unit
                


@Delete("DELETE FROM sys_nav_system WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_nav_system SET
        ID=#{ID,jdbcType=String},
        SYSTEMNAME=#{SYSTEMNAME,jdbcType=String},
        ORDERINDEX=#{ORDERINDEX,jdbcType=Integer},
        LINKURL=#{LINKURL,jdbcType=String},
        LINKTARGET=#{LINKTARGET,jdbcType=String},
        ICON16=#{ICON16,jdbcType=String},
        ICON64=#{ICON64,jdbcType=String},
        ICON96=#{ICON96,jdbcType=String},
        NAVDESC=#{NAVDESC,jdbcType=String},
        APPID=#{APPID,jdbcType=String},
        ISHIDDEN=#{ISHIDDEN,jdbcType=Integer},
        ISACTIVITY=#{ISACTIVITY,jdbcType=Integer},
        PORTALLAYOUT=#{PORTALLAYOUT,jdbcType=String},
        PORTALLOCKED=#{PORTALLOCKED,jdbcType=String},
        NOTIFIER=#{NOTIFIER,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_nav_system_dto)
        

@Update("""<script>
            UPDATE sys_nav_system SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="SYSTEMNAME != null">  SYSTEMNAME=#{SYSTEMNAME,jdbcType=String},</if>
        <if test="ORDERINDEX != null">  ORDERINDEX=#{ORDERINDEX,jdbcType=Integer},</if>
        <if test="LINKURL != null">  LINKURL=#{LINKURL,jdbcType=String},</if>
        <if test="LINKTARGET != null">  LINKTARGET=#{LINKTARGET,jdbcType=String},</if>
        <if test="ICON16 != null">  ICON16=#{ICON16,jdbcType=String},</if>
        <if test="ICON64 != null">  ICON64=#{ICON64,jdbcType=String},</if>
        <if test="ICON96 != null">  ICON96=#{ICON96,jdbcType=String},</if>
        <if test="NAVDESC != null">  NAVDESC=#{NAVDESC,jdbcType=String},</if>
        <if test="APPID != null">  APPID=#{APPID,jdbcType=String},</if>
        <if test="ISHIDDEN != null">  ISHIDDEN=#{ISHIDDEN,jdbcType=Integer},</if>
        <if test="ISACTIVITY != null">  ISACTIVITY=#{ISACTIVITY,jdbcType=Integer},</if>
        <if test="PORTALLAYOUT != null">  PORTALLAYOUT=#{PORTALLAYOUT,jdbcType=String},</if>
        <if test="PORTALLOCKED != null">  PORTALLOCKED=#{PORTALLOCKED,jdbcType=String},</if>
        <if test="NOTIFIER != null">  NOTIFIER=#{NOTIFIER,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_nav_system_dto)
            

}

        

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
    insert into sys_nav_system
    (ID,SYSTEMNAME,ORDERINDEX,LINKURL,LINKTARGET,ICON16,ICON64,ICON96,NAVDESC,APPID,ISHIDDEN,ISACTIVITY,PORTALLAYOUT,PORTALLOCKED,NOTIFIER)
    values
    (#{ID},#{SYSTEMNAME},#{ORDERINDEX},#{LINKURL},#{LINKTARGET},#{ICON16},#{ICON64},#{ICON96},#{NAVDESC},#{APPID},#{ISHIDDEN},#{ISACTIVITY},#{PORTALLAYOUT},#{PORTALLOCKED},#{NOTIFIER})
</script>""")
fun Insert(model:sys_nav_system_dto):Unit
                


@Insert("""<script>
    insert into sys_nav_system
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
           SYSTEMNAME,
           ORDERINDEX,
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
        <if test='ISHIDDEN!= null'> 
           ISHIDDEN,
        </if>
        <if test='ISACTIVITY!= null'> 
           ISACTIVITY,
        </if>
        <if test='PORTALLAYOUT!= null'> 
           PORTALLAYOUT,
        </if>
        <if test='PORTALLOCKED!= null'> 
           PORTALLOCKED,
        </if>
        <if test='NOTIFIER!= null'> 
           NOTIFIER
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=varchar}，
           #{SYSTEMNAME,jdbcType=varchar}，
           #{ORDERINDEX,jdbcType=smallint}，
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
        <if test='ISHIDDEN!= null'> 
           #{ISHIDDEN,jdbcType=smallint}，
        </if>
        <if test='ISACTIVITY!= null'> 
           #{ISACTIVITY,jdbcType=smallint}，
        </if>
        <if test='PORTALLAYOUT!= null'> 
           #{PORTALLAYOUT,jdbcType=varchar}，
        </if>
        <if test='PORTALLOCKED!= null'> 
           #{PORTALLOCKED,jdbcType=varchar}，
        </if>
        <if test='NOTIFIER!= null'> 
           #{NOTIFIER,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_nav_system_dto):Unit
                


@Delete("DELETE FROM sys_nav_system WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_nav_system SET
        ID=#{ID,jdbcType=String},
        SYSTEMNAME=#{SYSTEMNAME,jdbcType=String},
        ORDERINDEX=#{ORDERINDEX,jdbcType=Integer},
        LINKURL=#{LINKURL,jdbcType=String},
        LINKTARGET=#{LINKTARGET,jdbcType=String},
        ICON16=#{ICON16,jdbcType=String},
        ICON64=#{ICON64,jdbcType=String},
        ICON96=#{ICON96,jdbcType=String},
        NAVDESC=#{NAVDESC,jdbcType=String},
        APPID=#{APPID,jdbcType=String},
        ISHIDDEN=#{ISHIDDEN,jdbcType=Integer},
        ISACTIVITY=#{ISACTIVITY,jdbcType=Integer},
        PORTALLAYOUT=#{PORTALLAYOUT,jdbcType=String},
        PORTALLOCKED=#{PORTALLOCKED,jdbcType=String},
        NOTIFIER=#{NOTIFIER,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_nav_system_dto)
        

@Update("""<script>
            UPDATE sys_nav_system SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="SYSTEMNAME != null">  SYSTEMNAME=#{SYSTEMNAME,jdbcType=String},</if>
        <if test="ORDERINDEX != null">  ORDERINDEX=#{ORDERINDEX,jdbcType=Integer},</if>
        <if test="LINKURL != null">  LINKURL=#{LINKURL,jdbcType=String},</if>
        <if test="LINKTARGET != null">  LINKTARGET=#{LINKTARGET,jdbcType=String},</if>
        <if test="ICON16 != null">  ICON16=#{ICON16,jdbcType=String},</if>
        <if test="ICON64 != null">  ICON64=#{ICON64,jdbcType=String},</if>
        <if test="ICON96 != null">  ICON96=#{ICON96,jdbcType=String},</if>
        <if test="NAVDESC != null">  NAVDESC=#{NAVDESC,jdbcType=String},</if>
        <if test="APPID != null">  APPID=#{APPID,jdbcType=String},</if>
        <if test="ISHIDDEN != null">  ISHIDDEN=#{ISHIDDEN,jdbcType=Integer},</if>
        <if test="ISACTIVITY != null">  ISACTIVITY=#{ISACTIVITY,jdbcType=Integer},</if>
        <if test="PORTALLAYOUT != null">  PORTALLAYOUT=#{PORTALLAYOUT,jdbcType=String},</if>
        <if test="PORTALLOCKED != null">  PORTALLOCKED=#{PORTALLOCKED,jdbcType=String},</if>
        <if test="NOTIFIER != null">  NOTIFIER=#{NOTIFIER,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_nav_system_dto)
            

}

        
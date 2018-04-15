

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_nav_directory{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SYSTEMID", column = "SYSTEMID"),
   Result(property = "DIRECTORYNAME", column = "DIRECTORYNAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "LINKURL", column = "LINKURL"),
   Result(property = "LINKTARGET", column = "LINKTARGET"),
   Result(property = "ICON16", column = "ICON16"),
   Result(property = "ICON64", column = "ICON64"),
   Result(property = "ICON96", column = "ICON96"),
   Result(property = "NAVDESC", column = "NAVDESC"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "ISACTIVITY", column = "ISACTIVITY"),
   Result(property = "NOTIFIER", column = "NOTIFIER"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2")
)
@Select("""<script>
   SELECT * FROM sys_nav_directory
</script>""")
fun GetListAll():ArrayList<sys_nav_directory_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SYSTEMID", column = "SYSTEMID"),
   Result(property = "DIRECTORYNAME", column = "DIRECTORYNAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "LINKURL", column = "LINKURL"),
   Result(property = "LINKTARGET", column = "LINKTARGET"),
   Result(property = "ICON16", column = "ICON16"),
   Result(property = "ICON64", column = "ICON64"),
   Result(property = "ICON96", column = "ICON96"),
   Result(property = "NAVDESC", column = "NAVDESC"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "ISACTIVITY", column = "ISACTIVITY"),
   Result(property = "NOTIFIER", column = "NOTIFIER"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2")
)
@Select("""<script>
   SELECT * FROM sys_nav_directory
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="SYSTEMID!=null">
      SYSTEMID=#{SYSTEMID}
   </if> 
   <if test="DIRECTORYNAME!=null">
      DIRECTORYNAME=#{DIRECTORYNAME}
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
fun ConditionalQuery(model:sys_nav_directory_dto):ArrayList<sys_nav_directory_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SYSTEMID", column = "SYSTEMID"),
   Result(property = "DIRECTORYNAME", column = "DIRECTORYNAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "LINKURL", column = "LINKURL"),
   Result(property = "LINKTARGET", column = "LINKTARGET"),
   Result(property = "ICON16", column = "ICON16"),
   Result(property = "ICON64", column = "ICON64"),
   Result(property = "ICON96", column = "ICON96"),
   Result(property = "NAVDESC", column = "NAVDESC"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "ISACTIVITY", column = "ISACTIVITY"),
   Result(property = "NOTIFIER", column = "NOTIFIER"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2")
)
@Select("""<script>
   SELECT * FROM sys_nav_directory
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_nav_directory_dto):sys_nav_directory_dto?
                


@Insert("""<script>
    insert into sys_nav_directory
    (ID,SYSTEMID,DIRECTORYNAME,ORDERINDEX,LINKURL,LINKTARGET,ICON16,ICON64,ICON96,NAVDESC,APPID,ISACTIVITY,NOTIFIER,EXT1,EXT2)
    values
    (#{ID},#{SYSTEMID},#{DIRECTORYNAME},#{ORDERINDEX},#{LINKURL},#{LINKTARGET},#{ICON16},#{ICON64},#{ICON96},#{NAVDESC},#{APPID},#{ISACTIVITY},#{NOTIFIER},#{EXT1},#{EXT2})
</script>""")
fun Insert(model:sys_nav_directory_dto):Unit
                


@Insert("""<script>
    insert into sys_nav_directory
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
           SYSTEMID,
           DIRECTORYNAME,
           ORDERINDEX,
        <if test='LINKURL!= null'> 
           LINKURL,
        </if>
        <if test='LINKTARGET!= null'> 
           LINKTARGET,
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
        <if test='NAVDESC!= null'> 
           NAVDESC,
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
        <if test='EXT1!= null'> 
           EXT1,
        </if>
        <if test='EXT2!= null'> 
           EXT2
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=varchar}，
           #{SYSTEMID,jdbcType=varchar}，
           #{DIRECTORYNAME,jdbcType=varchar}，
           #{ORDERINDEX,jdbcType=smallint}，
        <if test='LINKURL!= null'> 
           #{LINKURL,jdbcType=varchar}，
        </if>
        <if test='LINKTARGET!= null'> 
           #{LINKTARGET,jdbcType=varchar}，
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
        <if test='NAVDESC!= null'> 
           #{NAVDESC,jdbcType=varchar}，
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
        <if test='EXT1!= null'> 
           #{EXT1,jdbcType=varchar}，
        </if>
        <if test='EXT2!= null'> 
           #{EXT2,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_nav_directory_dto):Unit
                


@Delete("DELETE FROM sys_nav_directory WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_nav_directory SET
        ID=#{ID,jdbcType=String},
        SYSTEMID=#{SYSTEMID,jdbcType=String},
        DIRECTORYNAME=#{DIRECTORYNAME,jdbcType=String},
        ORDERINDEX=#{ORDERINDEX,jdbcType=Integer},
        LINKURL=#{LINKURL,jdbcType=String},
        LINKTARGET=#{LINKTARGET,jdbcType=String},
        ICON16=#{ICON16,jdbcType=String},
        ICON64=#{ICON64,jdbcType=String},
        ICON96=#{ICON96,jdbcType=String},
        NAVDESC=#{NAVDESC,jdbcType=String},
        APPID=#{APPID,jdbcType=String},
        ISACTIVITY=#{ISACTIVITY,jdbcType=Integer},
        NOTIFIER=#{NOTIFIER,jdbcType=String},
        EXT1=#{EXT1,jdbcType=String},
        EXT2=#{EXT2,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_nav_directory_dto)
        

@Update("""<script>
            UPDATE sys_nav_directory SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="SYSTEMID != null">  SYSTEMID=#{SYSTEMID,jdbcType=String},</if>
        <if test="DIRECTORYNAME != null">  DIRECTORYNAME=#{DIRECTORYNAME,jdbcType=String},</if>
        <if test="ORDERINDEX != null">  ORDERINDEX=#{ORDERINDEX,jdbcType=Integer},</if>
        <if test="LINKURL != null">  LINKURL=#{LINKURL,jdbcType=String},</if>
        <if test="LINKTARGET != null">  LINKTARGET=#{LINKTARGET,jdbcType=String},</if>
        <if test="ICON16 != null">  ICON16=#{ICON16,jdbcType=String},</if>
        <if test="ICON64 != null">  ICON64=#{ICON64,jdbcType=String},</if>
        <if test="ICON96 != null">  ICON96=#{ICON96,jdbcType=String},</if>
        <if test="NAVDESC != null">  NAVDESC=#{NAVDESC,jdbcType=String},</if>
        <if test="APPID != null">  APPID=#{APPID,jdbcType=String},</if>
        <if test="ISACTIVITY != null">  ISACTIVITY=#{ISACTIVITY,jdbcType=Integer},</if>
        <if test="NOTIFIER != null">  NOTIFIER=#{NOTIFIER,jdbcType=String},</if>
        <if test="EXT1 != null">  EXT1=#{EXT1,jdbcType=String},</if>
        <if test="EXT2 != null">  EXT2=#{EXT2,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_nav_directory_dto)
            

}

        
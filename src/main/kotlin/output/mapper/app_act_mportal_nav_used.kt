

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_mportal_nav_used{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "NAME", column = "NAME"),
   Result(property = "URL", column = "URL"),
   Result(property = "TARGET", column = "TARGET"),
   Result(property = "ICON64", column = "ICON64"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "NAVID", column = "NAVID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "FUNNAVID", column = "FUNNAVID")
)
@Select("""<script>
   SELECT * FROM app_act_mportal_nav_used
</script>""")
fun GetListAll():ArrayList<app_act_mportal_nav_used_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "NAME", column = "NAME"),
   Result(property = "URL", column = "URL"),
   Result(property = "TARGET", column = "TARGET"),
   Result(property = "ICON64", column = "ICON64"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "NAVID", column = "NAVID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "FUNNAVID", column = "FUNNAVID")
)
@Select("""<script>
   SELECT * FROM app_act_mportal_nav_used
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="NAME!=null">
      NAME=#{NAME}
   </if> 
   <if test="URL!=null">
      URL=#{URL}
   </if> 
   <if test="TARGET!=null">
      TARGET=#{TARGET}
   </if> 
   <if test="ICON64!=null">
      ICON64=#{ICON64}
   </if> 
   <if test="APPID!=null">
      APPID=#{APPID}
   </if> 
   <if test="NAVID!=null">
      NAVID=#{NAVID}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="FUNNAVID!=null">
      FUNNAVID=#{FUNNAVID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_mportal_nav_used_dto):ArrayList<app_act_mportal_nav_used_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "NAME", column = "NAME"),
   Result(property = "URL", column = "URL"),
   Result(property = "TARGET", column = "TARGET"),
   Result(property = "ICON64", column = "ICON64"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "NAVID", column = "NAVID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "FUNNAVID", column = "FUNNAVID")
)
@Select("""<script>
   SELECT * FROM app_act_mportal_nav_used
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_mportal_nav_used_dto):app_act_mportal_nav_used_dto?
                


@Insert("""<script>
    insert into app_act_mportal_nav_used
    (ID,NAME,URL,TARGET,ICON64,APPID,NAVID,USERID,FUNNAVID)
    values
    (#{ID},#{NAME},#{URL},#{TARGET},#{ICON64},#{APPID},#{NAVID},#{USERID},#{FUNNAVID})
</script>""")
fun Insert(model:app_act_mportal_nav_used_dto):Unit
                


@Insert("""<script>
    insert into app_act_mportal_nav_used
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='NAME!= null'> 
           NAME,
        </if>
        <if test='URL!= null'> 
           URL,
        </if>
        <if test='TARGET!= null'> 
           TARGET,
        </if>
        <if test='ICON64!= null'> 
           ICON64,
        </if>
        <if test='APPID!= null'> 
           APPID,
        </if>
        <if test='NAVID!= null'> 
           NAVID,
        </if>
        <if test='USERID!= null'> 
           USERID,
        </if>
        <if test='FUNNAVID!= null'> 
           FUNNAVID
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='NAME!= null'> 
           #{NAME,jdbcType=varchar}，
        </if>
        <if test='URL!= null'> 
           #{URL,jdbcType=varchar}，
        </if>
        <if test='TARGET!= null'> 
           #{TARGET,jdbcType=varchar}，
        </if>
        <if test='ICON64!= null'> 
           #{ICON64,jdbcType=varchar}，
        </if>
        <if test='APPID!= null'> 
           #{APPID,jdbcType=varchar}，
        </if>
        <if test='NAVID!= null'> 
           #{NAVID,jdbcType=varchar}，
        </if>
        <if test='USERID!= null'> 
           #{USERID,jdbcType=varchar}，
        </if>
        <if test='FUNNAVID!= null'> 
           #{FUNNAVID,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_mportal_nav_used_dto):Unit
                


@Delete("DELETE FROM app_act_mportal_nav_used WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE app_act_mportal_nav_used SET
        ID=#{ID,jdbcType=String},
        NAME=#{NAME,jdbcType=String},
        URL=#{URL,jdbcType=String},
        TARGET=#{TARGET,jdbcType=String},
        ICON64=#{ICON64,jdbcType=String},
        APPID=#{APPID,jdbcType=String},
        NAVID=#{NAVID,jdbcType=String},
        USERID=#{USERID,jdbcType=String},
        FUNNAVID=#{FUNNAVID,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:app_act_mportal_nav_used_dto)
        

@Update("""<script>
            UPDATE app_act_mportal_nav_used SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="NAME != null">  NAME=#{NAME,jdbcType=String},</if>
        <if test="URL != null">  URL=#{URL,jdbcType=String},</if>
        <if test="TARGET != null">  TARGET=#{TARGET,jdbcType=String},</if>
        <if test="ICON64 != null">  ICON64=#{ICON64,jdbcType=String},</if>
        <if test="APPID != null">  APPID=#{APPID,jdbcType=String},</if>
        <if test="NAVID != null">  NAVID=#{NAVID,jdbcType=String},</if>
        <if test="USERID != null">  USERID=#{USERID,jdbcType=String},</if>
        <if test="FUNNAVID != null">  FUNNAVID=#{FUNNAVID,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:app_act_mportal_nav_used_dto)
            

}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface mam_appuse{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "USETIME", column = "USETIME"),
   Result(property = "APPVERSION", column = "APPVERSION")
)
@Select("""<script>
   SELECT * FROM mam_appuse
</script>""")
fun GetListAll():ArrayList<mam_appuse_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "USETIME", column = "USETIME"),
   Result(property = "APPVERSION", column = "APPVERSION")
)
@Select("""<script>
   SELECT * FROM mam_appuse
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="APPID!=null">
      APPID=#{APPID}
   </if> 
   <if test="DEVICEID!=null">
      DEVICEID=#{DEVICEID}
   </if> 
   <if test="USETIME!=null">
      USETIME=#{USETIME}
   </if> 
   <if test="APPVERSION!=null">
      APPVERSION=#{APPVERSION}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:mam_appuse_dto):ArrayList<mam_appuse_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "USETIME", column = "USETIME"),
   Result(property = "APPVERSION", column = "APPVERSION")
)
@Select("""<script>
   SELECT * FROM mam_appuse
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:mam_appuse_dto):mam_appuse_dto?
                


@Insert("""<script>
    insert into mam_appuse
    (ID,APPID,DEVICEID,USETIME,APPVERSION)
    values
    (#{ID},#{APPID},#{DEVICEID},#{USETIME},#{APPVERSION})
</script>""")
fun Insert(model:mam_appuse_dto):Unit
                


@Insert("""<script>
    insert into mam_appuse
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='APPID!= null'> 
           APPID,
        </if>
        <if test='DEVICEID!= null'> 
           DEVICEID,
        </if>
        <if test='USETIME!= null'> 
           USETIME,
        </if>
        <if test='APPVERSION!= null'> 
           APPVERSION
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='APPID!= null'> 
           #{APPID,jdbcType=varchar}，
        </if>
        <if test='DEVICEID!= null'> 
           #{DEVICEID,jdbcType=char}，
        </if>
        <if test='USETIME!= null'> 
           #{USETIME,jdbcType=datetime}，
        </if>
        <if test='APPVERSION!= null'> 
           #{APPVERSION,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:mam_appuse_dto):Unit
                


@Delete("DELETE FROM mam_appuse WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE mam_appuse SET
        ID=#{ID,jdbcType=String},
        APPID=#{APPID,jdbcType=String},
        DEVICEID=#{DEVICEID,jdbcType=String},
        USETIME=#{USETIME,jdbcType=Timestamp},
        APPVERSION=#{APPVERSION,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:mam_appuse_dto)
        

@Update("""<script>
            UPDATE mam_appuse SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="APPID != null">  APPID=#{APPID,jdbcType=String},</if>
        <if test="DEVICEID != null">  DEVICEID=#{DEVICEID,jdbcType=String},</if>
        <if test="USETIME != null">  USETIME=#{USETIME,jdbcType=Timestamp},</if>
        <if test="APPVERSION != null">  APPVERSION=#{APPVERSION,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:mam_appuse_dto)
            

}

        
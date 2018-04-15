

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface mam_update{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "UPDATETIME", column = "UPDATETIME"),
   Result(property = "UPDATEVERSION", column = "UPDATEVERSION")
)
@Select("""<script>
   SELECT * FROM mam_update
</script>""")
fun GetListAll():ArrayList<mam_update_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "UPDATETIME", column = "UPDATETIME"),
   Result(property = "UPDATEVERSION", column = "UPDATEVERSION")
)
@Select("""<script>
   SELECT * FROM mam_update
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
   <if test="UPDATETIME!=null">
      UPDATETIME=#{UPDATETIME}
   </if> 
   <if test="UPDATEVERSION!=null">
      UPDATEVERSION=#{UPDATEVERSION}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:mam_update_dto):ArrayList<mam_update_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "UPDATETIME", column = "UPDATETIME"),
   Result(property = "UPDATEVERSION", column = "UPDATEVERSION")
)
@Select("""<script>
   SELECT * FROM mam_update
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:mam_update_dto):mam_update_dto?
                


@Insert("""<script>
    insert into mam_update
    (ID,APPID,DEVICEID,UPDATETIME,UPDATEVERSION)
    values
    (#{ID},#{APPID},#{DEVICEID},#{UPDATETIME},#{UPDATEVERSION})
</script>""")
fun Insert(model:mam_update_dto):Unit
                


@Insert("""<script>
    insert into mam_update
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='APPID!= null'> 
           APPID,
        </if>
        <if test='DEVICEID!= null'> 
           DEVICEID,
        </if>
        <if test='UPDATETIME!= null'> 
           UPDATETIME,
        </if>
        <if test='UPDATEVERSION!= null'> 
           UPDATEVERSION
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
        <if test='UPDATETIME!= null'> 
           #{UPDATETIME,jdbcType=datetime}，
        </if>
        <if test='UPDATEVERSION!= null'> 
           #{UPDATEVERSION,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:mam_update_dto):Unit
                


@Delete("DELETE FROM mam_update WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE mam_update SET
        ID=#{ID,jdbcType=String},
        APPID=#{APPID,jdbcType=String},
        DEVICEID=#{DEVICEID,jdbcType=String},
        UPDATETIME=#{UPDATETIME,jdbcType=Timestamp},
        UPDATEVERSION=#{UPDATEVERSION,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:mam_update_dto)
        

@Update("""<script>
            UPDATE mam_update SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="APPID != null">  APPID=#{APPID,jdbcType=String},</if>
        <if test="DEVICEID != null">  DEVICEID=#{DEVICEID,jdbcType=String},</if>
        <if test="UPDATETIME != null">  UPDATETIME=#{UPDATETIME,jdbcType=Timestamp},</if>
        <if test="UPDATEVERSION != null">  UPDATEVERSION=#{UPDATEVERSION,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:mam_update_dto)
            

}

        
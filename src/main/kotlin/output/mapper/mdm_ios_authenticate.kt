

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface mdm_ios_authenticate{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "TOPIC", column = "TOPIC"),
   Result(property = "AUTHTIME", column = "AUTHTIME"),
   Result(property = "PUSHMAGIC", column = "PUSHMAGIC"),
   Result(property = "TOKEN", column = "TOKEN"),
   Result(property = "UNLOCKTOKEN", column = "UNLOCKTOKEN")
)
@Select("""<script>
   SELECT * FROM mdm_ios_authenticate
</script>""")
fun GetListAll():ArrayList<mdm_ios_authenticate_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "TOPIC", column = "TOPIC"),
   Result(property = "AUTHTIME", column = "AUTHTIME"),
   Result(property = "PUSHMAGIC", column = "PUSHMAGIC"),
   Result(property = "TOKEN", column = "TOKEN"),
   Result(property = "UNLOCKTOKEN", column = "UNLOCKTOKEN")
)
@Select("""<script>
   SELECT * FROM mdm_ios_authenticate
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="DEVICEID!=null">
      DEVICEID=#{DEVICEID}
   </if> 
   <if test="TOPIC!=null">
      TOPIC=#{TOPIC}
   </if> 
   <if test="AUTHTIME!=null">
      AUTHTIME=#{AUTHTIME}
   </if> 
   <if test="PUSHMAGIC!=null">
      PUSHMAGIC=#{PUSHMAGIC}
   </if> 
   <if test="TOKEN!=null">
      TOKEN=#{TOKEN}
   </if> 
   <if test="UNLOCKTOKEN!=null">
      UNLOCKTOKEN=#{UNLOCKTOKEN}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:mdm_ios_authenticate_dto):ArrayList<mdm_ios_authenticate_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "TOPIC", column = "TOPIC"),
   Result(property = "AUTHTIME", column = "AUTHTIME"),
   Result(property = "PUSHMAGIC", column = "PUSHMAGIC"),
   Result(property = "TOKEN", column = "TOKEN"),
   Result(property = "UNLOCKTOKEN", column = "UNLOCKTOKEN")
)
@Select("""<script>
   SELECT * FROM mdm_ios_authenticate
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:mdm_ios_authenticate_dto):mdm_ios_authenticate_dto?
                


@Insert("""<script>
    insert into mdm_ios_authenticate
    (ID,DEVICEID,TOPIC,AUTHTIME,PUSHMAGIC,TOKEN,UNLOCKTOKEN)
    values
    (#{ID},#{DEVICEID},#{TOPIC},#{AUTHTIME},#{PUSHMAGIC},#{TOKEN},#{UNLOCKTOKEN})
</script>""")
fun Insert(model:mdm_ios_authenticate_dto):Unit
                


@Insert("""<script>
    insert into mdm_ios_authenticate
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='DEVICEID!= null'> 
           DEVICEID,
        </if>
        <if test='TOPIC!= null'> 
           TOPIC,
        </if>
        <if test='AUTHTIME!= null'> 
           AUTHTIME,
        </if>
        <if test='PUSHMAGIC!= null'> 
           PUSHMAGIC,
        </if>
        <if test='TOKEN!= null'> 
           TOKEN,
        </if>
        <if test='UNLOCKTOKEN!= null'> 
           UNLOCKTOKEN
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='DEVICEID!= null'> 
           #{DEVICEID,jdbcType=char}，
        </if>
        <if test='TOPIC!= null'> 
           #{TOPIC,jdbcType=varchar}，
        </if>
        <if test='AUTHTIME!= null'> 
           #{AUTHTIME,jdbcType=datetime}，
        </if>
        <if test='PUSHMAGIC!= null'> 
           #{PUSHMAGIC,jdbcType=varchar}，
        </if>
        <if test='TOKEN!= null'> 
           #{TOKEN,jdbcType=varchar}，
        </if>
        <if test='UNLOCKTOKEN!= null'> 
           #{UNLOCKTOKEN,jdbcType=text}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:mdm_ios_authenticate_dto):Unit
                


@Delete("DELETE FROM mdm_ios_authenticate WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE mdm_ios_authenticate SET
        ID=#{ID,jdbcType=String},
        DEVICEID=#{DEVICEID,jdbcType=String},
        TOPIC=#{TOPIC,jdbcType=String},
        AUTHTIME=#{AUTHTIME,jdbcType=Timestamp},
        PUSHMAGIC=#{PUSHMAGIC,jdbcType=String},
        TOKEN=#{TOKEN,jdbcType=String},
        UNLOCKTOKEN=#{UNLOCKTOKEN,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:mdm_ios_authenticate_dto)
        

@Update("""<script>
            UPDATE mdm_ios_authenticate SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="DEVICEID != null">  DEVICEID=#{DEVICEID,jdbcType=String},</if>
        <if test="TOPIC != null">  TOPIC=#{TOPIC,jdbcType=String},</if>
        <if test="AUTHTIME != null">  AUTHTIME=#{AUTHTIME,jdbcType=Timestamp},</if>
        <if test="PUSHMAGIC != null">  PUSHMAGIC=#{PUSHMAGIC,jdbcType=String},</if>
        <if test="TOKEN != null">  TOKEN=#{TOKEN,jdbcType=String},</if>
        <if test="UNLOCKTOKEN != null">  UNLOCKTOKEN=#{UNLOCKTOKEN,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:mdm_ios_authenticate_dto)
            

}

        
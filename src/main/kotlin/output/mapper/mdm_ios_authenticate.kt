

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
    insert into TStudent
    (ID,DEVICEID,TOPIC,AUTHTIME,PUSHMAGIC,TOKEN,UNLOCKTOKEN)
    values
    (#{ID},#{DEVICEID},#{TOPIC},#{AUTHTIME},#{PUSHMAGIC},#{TOKEN},#{UNLOCKTOKEN})
</script>""")
fun insert(model:mdm_ios_authenticate_dto):Unit
                

}

        
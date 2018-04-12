

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
    insert into TStudent
    (ID,APPID,DEVICEID,UPDATETIME,UPDATEVERSION)
    values
    (#{ID},#{APPID},#{DEVICEID},#{UPDATETIME},#{UPDATEVERSION})
</script>""")
fun insert(model:mam_update_dto):Unit
                

}

        
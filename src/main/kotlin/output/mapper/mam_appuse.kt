

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
    insert into TStudent
    (ID,APPID,DEVICEID,USETIME,APPVERSION)
    values
    (#{ID},#{APPID},#{DEVICEID},#{USETIME},#{APPVERSION})
</script>""")
fun insert(model:mam_appuse_dto):Unit
                

}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface mam_recommend_app{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "OSTYPE", column = "OSTYPE"),
   Result(property = "DEVICETYPE", column = "DEVICETYPE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM mam_recommend_app
</script>""")
fun GetListAll():ArrayList<mam_recommend_app_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "OSTYPE", column = "OSTYPE"),
   Result(property = "DEVICETYPE", column = "DEVICETYPE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM mam_recommend_app
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="APPID!=null">
      APPID=#{APPID}
   </if> 
   <if test="OSTYPE!=null">
      OSTYPE=#{OSTYPE}
   </if> 
   <if test="DEVICETYPE!=null">
      DEVICETYPE=#{DEVICETYPE}
   </if> 
   <if test="ORDERINDEX!=null">
      ORDERINDEX=#{ORDERINDEX}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:mam_recommend_app_dto):ArrayList<mam_recommend_app_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "OSTYPE", column = "OSTYPE"),
   Result(property = "DEVICETYPE", column = "DEVICETYPE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM mam_recommend_app
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:mam_recommend_app_dto):mam_recommend_app_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,APPID,OSTYPE,DEVICETYPE,ORDERINDEX)
    values
    (#{ID},#{APPID},#{OSTYPE},#{DEVICETYPE},#{ORDERINDEX})
</script>""")
fun insert(model:mam_recommend_app_dto):Unit
                

}

        
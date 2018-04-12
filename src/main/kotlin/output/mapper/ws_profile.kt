

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface ws_profile{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "UUID", column = "UUID"),
   Result(property = "PROFILETYPE", column = "PROFILETYPE"),
   Result(property = "PROFILESOURCE", column = "PROFILESOURCE"),
   Result(property = "PROFILENAME", column = "PROFILENAME"),
   Result(property = "PROFILECONTENT", column = "PROFILECONTENT"),
   Result(property = "BEGINDATE", column = "BEGINDATE"),
   Result(property = "ENDDATE", column = "ENDDATE")
)
@Select("""<script>
   SELECT * FROM ws_profile
</script>""")
fun GetListAll():ArrayList<ws_profile_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "UUID", column = "UUID"),
   Result(property = "PROFILETYPE", column = "PROFILETYPE"),
   Result(property = "PROFILESOURCE", column = "PROFILESOURCE"),
   Result(property = "PROFILENAME", column = "PROFILENAME"),
   Result(property = "PROFILECONTENT", column = "PROFILECONTENT"),
   Result(property = "BEGINDATE", column = "BEGINDATE"),
   Result(property = "ENDDATE", column = "ENDDATE")
)
@Select("""<script>
   SELECT * FROM ws_profile
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="UUID!=null">
      UUID=#{UUID}
   </if> 
   <if test="PROFILETYPE!=null">
      PROFILETYPE=#{PROFILETYPE}
   </if> 
   <if test="PROFILESOURCE!=null">
      PROFILESOURCE=#{PROFILESOURCE}
   </if> 
   <if test="PROFILENAME!=null">
      PROFILENAME=#{PROFILENAME}
   </if> 
   <if test="PROFILECONTENT!=null">
      PROFILECONTENT=#{PROFILECONTENT}
   </if> 
   <if test="BEGINDATE!=null">
      BEGINDATE=#{BEGINDATE}
   </if> 
   <if test="ENDDATE!=null">
      ENDDATE=#{ENDDATE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:ws_profile_dto):ArrayList<ws_profile_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "UUID", column = "UUID"),
   Result(property = "PROFILETYPE", column = "PROFILETYPE"),
   Result(property = "PROFILESOURCE", column = "PROFILESOURCE"),
   Result(property = "PROFILENAME", column = "PROFILENAME"),
   Result(property = "PROFILECONTENT", column = "PROFILECONTENT"),
   Result(property = "BEGINDATE", column = "BEGINDATE"),
   Result(property = "ENDDATE", column = "ENDDATE")
)
@Select("""<script>
   SELECT * FROM ws_profile
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:ws_profile_dto):ws_profile_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,UUID,PROFILETYPE,PROFILESOURCE,PROFILENAME,PROFILECONTENT,BEGINDATE,ENDDATE)
    values
    (#{ID},#{UUID},#{PROFILETYPE},#{PROFILESOURCE},#{PROFILENAME},#{PROFILECONTENT},#{BEGINDATE},#{ENDDATE})
</script>""")
fun insert(model:ws_profile_dto):Unit
                

}

        
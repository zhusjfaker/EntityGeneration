

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_publish{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "AUDITORID", column = "AUDITORID"),
   Result(property = "PUBLISHDATE", column = "PUBLISHDATE"),
   Result(property = "PUBLISHDESC", column = "PUBLISHDESC"),
   Result(property = "PUBLISHN", column = "PUBLISHN"),
   Result(property = "PUBLISHC", column = "PUBLISHC"),
   Result(property = "PUBLISHS", column = "PUBLISHS"),
   Result(property = "TEAMID", column = "TEAMID")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_publish
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_publish_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "AUDITORID", column = "AUDITORID"),
   Result(property = "PUBLISHDATE", column = "PUBLISHDATE"),
   Result(property = "PUBLISHDESC", column = "PUBLISHDESC"),
   Result(property = "PUBLISHN", column = "PUBLISHN"),
   Result(property = "PUBLISHC", column = "PUBLISHC"),
   Result(property = "PUBLISHS", column = "PUBLISHS"),
   Result(property = "TEAMID", column = "TEAMID")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_publish
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="PROCESSINSTID!=null">
      PROCESSINSTID=#{PROCESSINSTID}
   </if> 
   <if test="WSID!=null">
      WSID=#{WSID}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="AUDITORID!=null">
      AUDITORID=#{AUDITORID}
   </if> 
   <if test="PUBLISHDATE!=null">
      PUBLISHDATE=#{PUBLISHDATE}
   </if> 
   <if test="PUBLISHDESC!=null">
      PUBLISHDESC=#{PUBLISHDESC}
   </if> 
   <if test="PUBLISHN!=null">
      PUBLISHN=#{PUBLISHN}
   </if> 
   <if test="PUBLISHC!=null">
      PUBLISHC=#{PUBLISHC}
   </if> 
   <if test="PUBLISHS!=null">
      PUBLISHS=#{PUBLISHS}
   </if> 
   <if test="TEAMID!=null">
      TEAMID=#{TEAMID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_publish_dto):ArrayList<sys_coe_pal_publish_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "AUDITORID", column = "AUDITORID"),
   Result(property = "PUBLISHDATE", column = "PUBLISHDATE"),
   Result(property = "PUBLISHDESC", column = "PUBLISHDESC"),
   Result(property = "PUBLISHN", column = "PUBLISHN"),
   Result(property = "PUBLISHC", column = "PUBLISHC"),
   Result(property = "PUBLISHS", column = "PUBLISHS"),
   Result(property = "TEAMID", column = "TEAMID")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_publish
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_publish_dto):sys_coe_pal_publish_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,PROCESSINSTID,WSID,USERID,AUDITORID,PUBLISHDATE,PUBLISHDESC,PUBLISHN,PUBLISHC,PUBLISHS,TEAMID)
    values
    (#{ID},#{PROCESSINSTID},#{WSID},#{USERID},#{AUDITORID},#{PUBLISHDATE},#{PUBLISHDESC},#{PUBLISHN},#{PUBLISHC},#{PUBLISHS},#{TEAMID})
</script>""")
fun insert(model:sys_coe_pal_publish_dto):Unit
                

}

        
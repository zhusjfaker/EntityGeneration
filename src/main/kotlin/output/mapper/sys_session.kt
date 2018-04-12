

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_session{


@Results(
   Result(property = "SESSIONID", column = "SESSIONID"),
   Result(property = "ISSDK", column = "ISSDK"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "IP", column = "IP"),
   Result(property = "STARTTIME", column = "STARTTIME"),
   Result(property = "REFRESHTIME", column = "REFRESHTIME"),
   Result(property = "CLOSETIME", column = "CLOSETIME"),
   Result(property = "DEVICETYPE", column = "DEVICETYPE"),
   Result(property = "DEVICELANG", column = "DEVICELANG"),
   Result(property = "SESSIONSCOPE", column = "SESSIONSCOPE"),
   Result(property = "INSTNAME", column = "INSTNAME"),
   Result(property = "CLOSED", column = "CLOSED")
)
@Select("""<script>
   SELECT * FROM sys_session
</script>""")
fun GetListAll():ArrayList<sys_session_dto>
        


@Results(
   Result(property = "SESSIONID", column = "SESSIONID"),
   Result(property = "ISSDK", column = "ISSDK"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "IP", column = "IP"),
   Result(property = "STARTTIME", column = "STARTTIME"),
   Result(property = "REFRESHTIME", column = "REFRESHTIME"),
   Result(property = "CLOSETIME", column = "CLOSETIME"),
   Result(property = "DEVICETYPE", column = "DEVICETYPE"),
   Result(property = "DEVICELANG", column = "DEVICELANG"),
   Result(property = "SESSIONSCOPE", column = "SESSIONSCOPE"),
   Result(property = "INSTNAME", column = "INSTNAME"),
   Result(property = "CLOSED", column = "CLOSED")
)
@Select("""<script>
   SELECT * FROM sys_session
   <where>
   <if test="SESSIONID!=null">
      SESSIONID=#{SESSIONID}
   </if> 
   <if test="ISSDK!=null">
      ISSDK=#{ISSDK}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="IP!=null">
      IP=#{IP}
   </if> 
   <if test="STARTTIME!=null">
      STARTTIME=#{STARTTIME}
   </if> 
   <if test="REFRESHTIME!=null">
      REFRESHTIME=#{REFRESHTIME}
   </if> 
   <if test="CLOSETIME!=null">
      CLOSETIME=#{CLOSETIME}
   </if> 
   <if test="DEVICETYPE!=null">
      DEVICETYPE=#{DEVICETYPE}
   </if> 
   <if test="DEVICELANG!=null">
      DEVICELANG=#{DEVICELANG}
   </if> 
   <if test="SESSIONSCOPE!=null">
      SESSIONSCOPE=#{SESSIONSCOPE}
   </if> 
   <if test="INSTNAME!=null">
      INSTNAME=#{INSTNAME}
   </if> 
   <if test="CLOSED!=null">
      CLOSED=#{CLOSED}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_session_dto):ArrayList<sys_session_dto>
                


@Results(
   Result(property = "SESSIONID", column = "SESSIONID"),
   Result(property = "ISSDK", column = "ISSDK"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "IP", column = "IP"),
   Result(property = "STARTTIME", column = "STARTTIME"),
   Result(property = "REFRESHTIME", column = "REFRESHTIME"),
   Result(property = "CLOSETIME", column = "CLOSETIME"),
   Result(property = "DEVICETYPE", column = "DEVICETYPE"),
   Result(property = "DEVICELANG", column = "DEVICELANG"),
   Result(property = "SESSIONSCOPE", column = "SESSIONSCOPE"),
   Result(property = "INSTNAME", column = "INSTNAME"),
   Result(property = "CLOSED", column = "CLOSED")
)
@Select("""<script>
   SELECT * FROM sys_session
   <where>
   <if test="SESSIONID!=null">
      SESSIONID=#{SESSIONID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_session_dto):sys_session_dto?
                


@Insert("""<script>
    insert into TStudent
    (SESSIONID,ISSDK,USERID,IP,STARTTIME,REFRESHTIME,CLOSETIME,DEVICETYPE,DEVICELANG,SESSIONSCOPE,INSTNAME,CLOSED)
    values
    (#{SESSIONID},#{ISSDK},#{USERID},#{IP},#{STARTTIME},#{REFRESHTIME},#{CLOSETIME},#{DEVICETYPE},#{DEVICELANG},#{SESSIONSCOPE},#{INSTNAME},#{CLOSED})
</script>""")
fun insert(model:sys_session_dto):Unit
                

}

        
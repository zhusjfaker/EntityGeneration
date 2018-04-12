

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface orguser{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERNO", column = "USERNO"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "USERNAME", column = "USERNAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "PASSWORD", column = "PASSWORD"),
   Result(property = "CLOSED", column = "CLOSED"),
   Result(property = "DEPARTMENTID", column = "DEPARTMENTID"),
   Result(property = "ROLEID", column = "ROLEID"),
   Result(property = "ISMANAGER", column = "ISMANAGER"),
   Result(property = "WORKCANLENDAR", column = "WORKCANLENDAR"),
   Result(property = "POSITION_NO", column = "POSITION_NO"),
   Result(property = "POSITION_NAME", column = "POSITION_NAME"),
   Result(property = "POSITION_LAYER", column = "POSITION_LAYER"),
   Result(property = "OFFICETEL", column = "OFFICETEL"),
   Result(property = "OFFICEFAX", column = "OFFICEFAX"),
   Result(property = "MOBILE", column = "MOBILE"),
   Result(property = "EMAIL", column = "EMAIL"),
   Result(property = "USERIP", column = "USERIP"),
   Result(property = "ISSINGLELOGIN", column = "ISSINGLELOGIN"),
   Result(property = "WORK_STATUS", column = "WORK_STATUS"),
   Result(property = "SESSIONTIME", column = "SESSIONTIME"),
   Result(property = "OUTERID", column = "OUTERID"),
   Result(property = "WECHAT", column = "WECHAT"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "REPORTTO", column = "REPORTTO"),
   Result(property = "CLOSEDATE", column = "CLOSEDATE"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE"),
   Result(property = "SECURITYLEVEL", column = "SECURITYLEVEL")
)
@Select("""<script>
   SELECT * FROM orguser
</script>""")
fun GetListAll():ArrayList<orguser_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERNO", column = "USERNO"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "USERNAME", column = "USERNAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "PASSWORD", column = "PASSWORD"),
   Result(property = "CLOSED", column = "CLOSED"),
   Result(property = "DEPARTMENTID", column = "DEPARTMENTID"),
   Result(property = "ROLEID", column = "ROLEID"),
   Result(property = "ISMANAGER", column = "ISMANAGER"),
   Result(property = "WORKCANLENDAR", column = "WORKCANLENDAR"),
   Result(property = "POSITION_NO", column = "POSITION_NO"),
   Result(property = "POSITION_NAME", column = "POSITION_NAME"),
   Result(property = "POSITION_LAYER", column = "POSITION_LAYER"),
   Result(property = "OFFICETEL", column = "OFFICETEL"),
   Result(property = "OFFICEFAX", column = "OFFICEFAX"),
   Result(property = "MOBILE", column = "MOBILE"),
   Result(property = "EMAIL", column = "EMAIL"),
   Result(property = "USERIP", column = "USERIP"),
   Result(property = "ISSINGLELOGIN", column = "ISSINGLELOGIN"),
   Result(property = "WORK_STATUS", column = "WORK_STATUS"),
   Result(property = "SESSIONTIME", column = "SESSIONTIME"),
   Result(property = "OUTERID", column = "OUTERID"),
   Result(property = "WECHAT", column = "WECHAT"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "REPORTTO", column = "REPORTTO"),
   Result(property = "CLOSEDATE", column = "CLOSEDATE"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE"),
   Result(property = "SECURITYLEVEL", column = "SECURITYLEVEL")
)
@Select("""<script>
   SELECT * FROM orguser
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="USERNO!=null">
      USERNO=#{USERNO}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="USERNAME!=null">
      USERNAME=#{USERNAME}
   </if> 
   <if test="ORDERINDEX!=null">
      ORDERINDEX=#{ORDERINDEX}
   </if> 
   <if test="PASSWORD!=null">
      PASSWORD=#{PASSWORD}
   </if> 
   <if test="CLOSED!=null">
      CLOSED=#{CLOSED}
   </if> 
   <if test="DEPARTMENTID!=null">
      DEPARTMENTID=#{DEPARTMENTID}
   </if> 
   <if test="ROLEID!=null">
      ROLEID=#{ROLEID}
   </if> 
   <if test="ISMANAGER!=null">
      ISMANAGER=#{ISMANAGER}
   </if> 
   <if test="WORKCANLENDAR!=null">
      WORKCANLENDAR=#{WORKCANLENDAR}
   </if> 
   <if test="POSITION_NO!=null">
      POSITION_NO=#{POSITION_NO}
   </if> 
   <if test="POSITION_NAME!=null">
      POSITION_NAME=#{POSITION_NAME}
   </if> 
   <if test="POSITION_LAYER!=null">
      POSITION_LAYER=#{POSITION_LAYER}
   </if> 
   <if test="OFFICETEL!=null">
      OFFICETEL=#{OFFICETEL}
   </if> 
   <if test="OFFICEFAX!=null">
      OFFICEFAX=#{OFFICEFAX}
   </if> 
   <if test="MOBILE!=null">
      MOBILE=#{MOBILE}
   </if> 
   <if test="EMAIL!=null">
      EMAIL=#{EMAIL}
   </if> 
   <if test="USERIP!=null">
      USERIP=#{USERIP}
   </if> 
   <if test="ISSINGLELOGIN!=null">
      ISSINGLELOGIN=#{ISSINGLELOGIN}
   </if> 
   <if test="WORK_STATUS!=null">
      WORK_STATUS=#{WORK_STATUS}
   </if> 
   <if test="SESSIONTIME!=null">
      SESSIONTIME=#{SESSIONTIME}
   </if> 
   <if test="OUTERID!=null">
      OUTERID=#{OUTERID}
   </if> 
   <if test="WECHAT!=null">
      WECHAT=#{WECHAT}
   </if> 
   <if test="EXT1!=null">
      EXT1=#{EXT1}
   </if> 
   <if test="EXT2!=null">
      EXT2=#{EXT2}
   </if> 
   <if test="EXT3!=null">
      EXT3=#{EXT3}
   </if> 
   <if test="EXT4!=null">
      EXT4=#{EXT4}
   </if> 
   <if test="EXT5!=null">
      EXT5=#{EXT5}
   </if> 
   <if test="REPORTTO!=null">
      REPORTTO=#{REPORTTO}
   </if> 
   <if test="CLOSEDATE!=null">
      CLOSEDATE=#{CLOSEDATE}
   </if> 
   <if test="CREATEDATE!=null">
      CREATEDATE=#{CREATEDATE}
   </if> 
   <if test="UPDATEDATE!=null">
      UPDATEDATE=#{UPDATEDATE}
   </if> 
   <if test="SECURITYLEVEL!=null">
      SECURITYLEVEL=#{SECURITYLEVEL}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:orguser_dto):ArrayList<orguser_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERNO", column = "USERNO"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "USERNAME", column = "USERNAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "PASSWORD", column = "PASSWORD"),
   Result(property = "CLOSED", column = "CLOSED"),
   Result(property = "DEPARTMENTID", column = "DEPARTMENTID"),
   Result(property = "ROLEID", column = "ROLEID"),
   Result(property = "ISMANAGER", column = "ISMANAGER"),
   Result(property = "WORKCANLENDAR", column = "WORKCANLENDAR"),
   Result(property = "POSITION_NO", column = "POSITION_NO"),
   Result(property = "POSITION_NAME", column = "POSITION_NAME"),
   Result(property = "POSITION_LAYER", column = "POSITION_LAYER"),
   Result(property = "OFFICETEL", column = "OFFICETEL"),
   Result(property = "OFFICEFAX", column = "OFFICEFAX"),
   Result(property = "MOBILE", column = "MOBILE"),
   Result(property = "EMAIL", column = "EMAIL"),
   Result(property = "USERIP", column = "USERIP"),
   Result(property = "ISSINGLELOGIN", column = "ISSINGLELOGIN"),
   Result(property = "WORK_STATUS", column = "WORK_STATUS"),
   Result(property = "SESSIONTIME", column = "SESSIONTIME"),
   Result(property = "OUTERID", column = "OUTERID"),
   Result(property = "WECHAT", column = "WECHAT"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "REPORTTO", column = "REPORTTO"),
   Result(property = "CLOSEDATE", column = "CLOSEDATE"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE"),
   Result(property = "SECURITYLEVEL", column = "SECURITYLEVEL")
)
@Select("""<script>
   SELECT * FROM orguser
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:orguser_dto):orguser_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,USERNO,USERID,USERNAME,ORDERINDEX,PASSWORD,CLOSED,DEPARTMENTID,ROLEID,ISMANAGER,WORKCANLENDAR,POSITION_NO,POSITION_NAME,POSITION_LAYER,OFFICETEL,OFFICEFAX,MOBILE,EMAIL,USERIP,ISSINGLELOGIN,WORK_STATUS,SESSIONTIME,OUTERID,WECHAT,EXT1,EXT2,EXT3,EXT4,EXT5,REPORTTO,CLOSEDATE,CREATEDATE,UPDATEDATE,SECURITYLEVEL)
    values
    (#{ID},#{USERNO},#{USERID},#{USERNAME},#{ORDERINDEX},#{PASSWORD},#{CLOSED},#{DEPARTMENTID},#{ROLEID},#{ISMANAGER},#{WORKCANLENDAR},#{POSITION_NO},#{POSITION_NAME},#{POSITION_LAYER},#{OFFICETEL},#{OFFICEFAX},#{MOBILE},#{EMAIL},#{USERIP},#{ISSINGLELOGIN},#{WORK_STATUS},#{SESSIONTIME},#{OUTERID},#{WECHAT},#{EXT1},#{EXT2},#{EXT3},#{EXT4},#{EXT5},#{REPORTTO},#{CLOSEDATE},#{CREATEDATE},#{UPDATEDATE},#{SECURITYLEVEL})
</script>""")
fun insert(model:orguser_dto):Unit
                

}

        
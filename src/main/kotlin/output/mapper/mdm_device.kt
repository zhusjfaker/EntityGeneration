

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface mdm_device{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEVICEMODEL", column = "DEVICEMODEL"),
   Result(property = "DEVICEBRAND", column = "DEVICEBRAND"),
   Result(property = "OSTYPE", column = "OSTYPE"),
   Result(property = "OSNAME", column = "OSNAME"),
   Result(property = "DEVICETYPE", column = "DEVICETYPE"),
   Result(property = "DEVICESTATUS", column = "DEVICESTATUS"),
   Result(property = "SECURITYSTATUS", column = "SECURITYSTATUS"),
   Result(property = "ROOTED", column = "ROOTED"),
   Result(property = "PHONENUMBER", column = "PHONENUMBER"),
   Result(property = "REGISTERTIME", column = "REGISTERTIME"),
   Result(property = "REGISTERUSERID", column = "REGISTERUSERID"),
   Result(property = "ASSETTYPE", column = "ASSETTYPE"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "LASTLOGINTIME", column = "LASTLOGINTIME"),
   Result(property = "UNREGISTERED", column = "UNREGISTERED")
)
@Select("""<script>
   SELECT * FROM mdm_device
</script>""")
fun GetListAll():ArrayList<mdm_device_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEVICEMODEL", column = "DEVICEMODEL"),
   Result(property = "DEVICEBRAND", column = "DEVICEBRAND"),
   Result(property = "OSTYPE", column = "OSTYPE"),
   Result(property = "OSNAME", column = "OSNAME"),
   Result(property = "DEVICETYPE", column = "DEVICETYPE"),
   Result(property = "DEVICESTATUS", column = "DEVICESTATUS"),
   Result(property = "SECURITYSTATUS", column = "SECURITYSTATUS"),
   Result(property = "ROOTED", column = "ROOTED"),
   Result(property = "PHONENUMBER", column = "PHONENUMBER"),
   Result(property = "REGISTERTIME", column = "REGISTERTIME"),
   Result(property = "REGISTERUSERID", column = "REGISTERUSERID"),
   Result(property = "ASSETTYPE", column = "ASSETTYPE"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "LASTLOGINTIME", column = "LASTLOGINTIME"),
   Result(property = "UNREGISTERED", column = "UNREGISTERED")
)
@Select("""<script>
   SELECT * FROM mdm_device
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="DEVICEMODEL!=null">
      DEVICEMODEL=#{DEVICEMODEL}
   </if> 
   <if test="DEVICEBRAND!=null">
      DEVICEBRAND=#{DEVICEBRAND}
   </if> 
   <if test="OSTYPE!=null">
      OSTYPE=#{OSTYPE}
   </if> 
   <if test="OSNAME!=null">
      OSNAME=#{OSNAME}
   </if> 
   <if test="DEVICETYPE!=null">
      DEVICETYPE=#{DEVICETYPE}
   </if> 
   <if test="DEVICESTATUS!=null">
      DEVICESTATUS=#{DEVICESTATUS}
   </if> 
   <if test="SECURITYSTATUS!=null">
      SECURITYSTATUS=#{SECURITYSTATUS}
   </if> 
   <if test="ROOTED!=null">
      ROOTED=#{ROOTED}
   </if> 
   <if test="PHONENUMBER!=null">
      PHONENUMBER=#{PHONENUMBER}
   </if> 
   <if test="REGISTERTIME!=null">
      REGISTERTIME=#{REGISTERTIME}
   </if> 
   <if test="REGISTERUSERID!=null">
      REGISTERUSERID=#{REGISTERUSERID}
   </if> 
   <if test="ASSETTYPE!=null">
      ASSETTYPE=#{ASSETTYPE}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="LASTLOGINTIME!=null">
      LASTLOGINTIME=#{LASTLOGINTIME}
   </if> 
   <if test="UNREGISTERED!=null">
      UNREGISTERED=#{UNREGISTERED}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:mdm_device_dto):ArrayList<mdm_device_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEVICEMODEL", column = "DEVICEMODEL"),
   Result(property = "DEVICEBRAND", column = "DEVICEBRAND"),
   Result(property = "OSTYPE", column = "OSTYPE"),
   Result(property = "OSNAME", column = "OSNAME"),
   Result(property = "DEVICETYPE", column = "DEVICETYPE"),
   Result(property = "DEVICESTATUS", column = "DEVICESTATUS"),
   Result(property = "SECURITYSTATUS", column = "SECURITYSTATUS"),
   Result(property = "ROOTED", column = "ROOTED"),
   Result(property = "PHONENUMBER", column = "PHONENUMBER"),
   Result(property = "REGISTERTIME", column = "REGISTERTIME"),
   Result(property = "REGISTERUSERID", column = "REGISTERUSERID"),
   Result(property = "ASSETTYPE", column = "ASSETTYPE"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "LASTLOGINTIME", column = "LASTLOGINTIME"),
   Result(property = "UNREGISTERED", column = "UNREGISTERED")
)
@Select("""<script>
   SELECT * FROM mdm_device
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:mdm_device_dto):mdm_device_dto?
                


@Insert("""<script>
    insert into mdm_device
    (ID,DEVICEMODEL,DEVICEBRAND,OSTYPE,OSNAME,DEVICETYPE,DEVICESTATUS,SECURITYSTATUS,ROOTED,PHONENUMBER,REGISTERTIME,REGISTERUSERID,ASSETTYPE,USERID,LASTLOGINTIME,UNREGISTERED)
    values
    (#{ID},#{DEVICEMODEL},#{DEVICEBRAND},#{OSTYPE},#{OSNAME},#{DEVICETYPE},#{DEVICESTATUS},#{SECURITYSTATUS},#{ROOTED},#{PHONENUMBER},#{REGISTERTIME},#{REGISTERUSERID},#{ASSETTYPE},#{USERID},#{LASTLOGINTIME},#{UNREGISTERED})
</script>""")
fun Insert(model:mdm_device_dto):Unit
                


@Insert("""<script>
    insert into mdm_device
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='DEVICEMODEL!= null'> 
           DEVICEMODEL,
        </if>
        <if test='DEVICEBRAND!= null'> 
           DEVICEBRAND,
        </if>
        <if test='OSTYPE!= null'> 
           OSTYPE,
        </if>
        <if test='OSNAME!= null'> 
           OSNAME,
        </if>
        <if test='DEVICETYPE!= null'> 
           DEVICETYPE,
        </if>
        <if test='DEVICESTATUS!= null'> 
           DEVICESTATUS,
        </if>
        <if test='SECURITYSTATUS!= null'> 
           SECURITYSTATUS,
        </if>
        <if test='ROOTED!= null'> 
           ROOTED,
        </if>
        <if test='PHONENUMBER!= null'> 
           PHONENUMBER,
        </if>
        <if test='REGISTERTIME!= null'> 
           REGISTERTIME,
        </if>
        <if test='REGISTERUSERID!= null'> 
           REGISTERUSERID,
        </if>
        <if test='ASSETTYPE!= null'> 
           ASSETTYPE,
        </if>
        <if test='USERID!= null'> 
           USERID,
        </if>
        <if test='LASTLOGINTIME!= null'> 
           LASTLOGINTIME,
        </if>
        <if test='UNREGISTERED!= null'> 
           UNREGISTERED
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='DEVICEMODEL!= null'> 
           #{DEVICEMODEL,jdbcType=varchar}，
        </if>
        <if test='DEVICEBRAND!= null'> 
           #{DEVICEBRAND,jdbcType=varchar}，
        </if>
        <if test='OSTYPE!= null'> 
           #{OSTYPE,jdbcType=smallint}，
        </if>
        <if test='OSNAME!= null'> 
           #{OSNAME,jdbcType=varchar}，
        </if>
        <if test='DEVICETYPE!= null'> 
           #{DEVICETYPE,jdbcType=smallint}，
        </if>
        <if test='DEVICESTATUS!= null'> 
           #{DEVICESTATUS,jdbcType=smallint}，
        </if>
        <if test='SECURITYSTATUS!= null'> 
           #{SECURITYSTATUS,jdbcType=smallint}，
        </if>
        <if test='ROOTED!= null'> 
           #{ROOTED,jdbcType=smallint}，
        </if>
        <if test='PHONENUMBER!= null'> 
           #{PHONENUMBER,jdbcType=varchar}，
        </if>
        <if test='REGISTERTIME!= null'> 
           #{REGISTERTIME,jdbcType=datetime}，
        </if>
        <if test='REGISTERUSERID!= null'> 
           #{REGISTERUSERID,jdbcType=varchar}，
        </if>
        <if test='ASSETTYPE!= null'> 
           #{ASSETTYPE,jdbcType=smallint}，
        </if>
        <if test='USERID!= null'> 
           #{USERID,jdbcType=varchar}，
        </if>
        <if test='LASTLOGINTIME!= null'> 
           #{LASTLOGINTIME,jdbcType=datetime}，
        </if>
        <if test='UNREGISTERED!= null'> 
           #{UNREGISTERED,jdbcType=smallint}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:mdm_device_dto):Unit
                

}

        
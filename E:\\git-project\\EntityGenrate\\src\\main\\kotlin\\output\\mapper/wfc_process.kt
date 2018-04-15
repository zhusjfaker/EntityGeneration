

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfc_process{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BUSINESSKEY", column = "BUSINESSKEY"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "PROCESSDEFVERID", column = "PROCESSDEFVERID"),
   Result(property = "CONTROLSTATE", column = "CONTROLSTATE"),
   Result(property = "PROCESSGROUPID", column = "PROCESSGROUPID"),
   Result(property = "PROCESSTITLE", column = "PROCESSTITLE"),
   Result(property = "STARTACTIVITYID", column = "STARTACTIVITYID"),
   Result(property = "STARTTASKINSTID", column = "STARTTASKINSTID"),
   Result(property = "STARTTIME", column = "STARTTIME"),
   Result(property = "PROCESSPROFILEID", column = "PROCESSPROFILEID"),
   Result(property = "PROCESSINSTTYPE", column = "PROCESSINSTTYPE"),
   Result(property = "PARENTPROCESSINSTID", column = "PARENTPROCESSINSTID"),
   Result(property = "PARENTTASKINSTID", column = "PARENTTASKINSTID"),
   Result(property = "SECURITYLAYER", column = "SECURITYLAYER"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "CREATEUSERORGID", column = "CREATEUSERORGID"),
   Result(property = "CREATEUSERDEPTID", column = "CREATEUSERDEPTID"),
   Result(property = "CREATEUSERROLEID", column = "CREATEUSERROLEID"),
   Result(property = "CREATEUSERLOCATION", column = "CREATEUSERLOCATION"),
   Result(property = "ENDACTIVITYID", column = "ENDACTIVITYID"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "ISPROCESS", column = "ISPROCESS"),
   Result(property = "ISSTART", column = "ISSTART"),
   Result(property = "ISEND", column = "ISEND"),
   Result(property = "ISASYNC", column = "ISASYNC"),
   Result(property = "ISEXCEPTION", column = "ISEXCEPTION"),
   Result(property = "ISOVERTIME", column = "ISOVERTIME"),
   Result(property = "ISEXISTSUBPROC", column = "ISEXISTSUBPROC"),
   Result(property = "COSTTTIME", column = "COSTTTIME"),
   Result(property = "EXPIRETIME", column = "EXPIRETIME"),
   Result(property = "REMARK", column = "REMARK"),
   Result(property = "IOBD", column = "IOBD"),
   Result(property = "IOR", column = "IOR"),
   Result(property = "IOS", column = "IOS"),
   Result(property = "IOC", column = "IOC"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "REMINDTIMES", column = "REMINDTIMES"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "EXT6", column = "EXT6"),
   Result(property = "EXT7", column = "EXT7"),
   Result(property = "EXT8", column = "EXT8")
)
@Select("""<script>
   SELECT * FROM wfc_process
</script>""")
fun GetListAll():ArrayList<wfc_process_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BUSINESSKEY", column = "BUSINESSKEY"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "PROCESSDEFVERID", column = "PROCESSDEFVERID"),
   Result(property = "CONTROLSTATE", column = "CONTROLSTATE"),
   Result(property = "PROCESSGROUPID", column = "PROCESSGROUPID"),
   Result(property = "PROCESSTITLE", column = "PROCESSTITLE"),
   Result(property = "STARTACTIVITYID", column = "STARTACTIVITYID"),
   Result(property = "STARTTASKINSTID", column = "STARTTASKINSTID"),
   Result(property = "STARTTIME", column = "STARTTIME"),
   Result(property = "PROCESSPROFILEID", column = "PROCESSPROFILEID"),
   Result(property = "PROCESSINSTTYPE", column = "PROCESSINSTTYPE"),
   Result(property = "PARENTPROCESSINSTID", column = "PARENTPROCESSINSTID"),
   Result(property = "PARENTTASKINSTID", column = "PARENTTASKINSTID"),
   Result(property = "SECURITYLAYER", column = "SECURITYLAYER"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "CREATEUSERORGID", column = "CREATEUSERORGID"),
   Result(property = "CREATEUSERDEPTID", column = "CREATEUSERDEPTID"),
   Result(property = "CREATEUSERROLEID", column = "CREATEUSERROLEID"),
   Result(property = "CREATEUSERLOCATION", column = "CREATEUSERLOCATION"),
   Result(property = "ENDACTIVITYID", column = "ENDACTIVITYID"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "ISPROCESS", column = "ISPROCESS"),
   Result(property = "ISSTART", column = "ISSTART"),
   Result(property = "ISEND", column = "ISEND"),
   Result(property = "ISASYNC", column = "ISASYNC"),
   Result(property = "ISEXCEPTION", column = "ISEXCEPTION"),
   Result(property = "ISOVERTIME", column = "ISOVERTIME"),
   Result(property = "ISEXISTSUBPROC", column = "ISEXISTSUBPROC"),
   Result(property = "COSTTTIME", column = "COSTTTIME"),
   Result(property = "EXPIRETIME", column = "EXPIRETIME"),
   Result(property = "REMARK", column = "REMARK"),
   Result(property = "IOBD", column = "IOBD"),
   Result(property = "IOR", column = "IOR"),
   Result(property = "IOS", column = "IOS"),
   Result(property = "IOC", column = "IOC"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "REMINDTIMES", column = "REMINDTIMES"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "EXT6", column = "EXT6"),
   Result(property = "EXT7", column = "EXT7"),
   Result(property = "EXT8", column = "EXT8")
)
@Select("""<script>
   SELECT * FROM wfc_process
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="BUSINESSKEY!=null">
      BUSINESSKEY=#{BUSINESSKEY}
   </if> 
   <if test="PROCESSDEFID!=null">
      PROCESSDEFID=#{PROCESSDEFID}
   </if> 
   <if test="PROCESSDEFVERID!=null">
      PROCESSDEFVERID=#{PROCESSDEFVERID}
   </if> 
   <if test="CONTROLSTATE!=null">
      CONTROLSTATE=#{CONTROLSTATE}
   </if> 
   <if test="PROCESSGROUPID!=null">
      PROCESSGROUPID=#{PROCESSGROUPID}
   </if> 
   <if test="PROCESSTITLE!=null">
      PROCESSTITLE=#{PROCESSTITLE}
   </if> 
   <if test="STARTACTIVITYID!=null">
      STARTACTIVITYID=#{STARTACTIVITYID}
   </if> 
   <if test="STARTTASKINSTID!=null">
      STARTTASKINSTID=#{STARTTASKINSTID}
   </if> 
   <if test="STARTTIME!=null">
      STARTTIME=#{STARTTIME}
   </if> 
   <if test="PROCESSPROFILEID!=null">
      PROCESSPROFILEID=#{PROCESSPROFILEID}
   </if> 
   <if test="PROCESSINSTTYPE!=null">
      PROCESSINSTTYPE=#{PROCESSINSTTYPE}
   </if> 
   <if test="PARENTPROCESSINSTID!=null">
      PARENTPROCESSINSTID=#{PARENTPROCESSINSTID}
   </if> 
   <if test="PARENTTASKINSTID!=null">
      PARENTTASKINSTID=#{PARENTTASKINSTID}
   </if> 
   <if test="SECURITYLAYER!=null">
      SECURITYLAYER=#{SECURITYLAYER}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   <if test="CREATEUSERORGID!=null">
      CREATEUSERORGID=#{CREATEUSERORGID}
   </if> 
   <if test="CREATEUSERDEPTID!=null">
      CREATEUSERDEPTID=#{CREATEUSERDEPTID}
   </if> 
   <if test="CREATEUSERROLEID!=null">
      CREATEUSERROLEID=#{CREATEUSERROLEID}
   </if> 
   <if test="CREATEUSERLOCATION!=null">
      CREATEUSERLOCATION=#{CREATEUSERLOCATION}
   </if> 
   <if test="ENDACTIVITYID!=null">
      ENDACTIVITYID=#{ENDACTIVITYID}
   </if> 
   <if test="ENDTIME!=null">
      ENDTIME=#{ENDTIME}
   </if> 
   <if test="ISPROCESS!=null">
      ISPROCESS=#{ISPROCESS}
   </if> 
   <if test="ISSTART!=null">
      ISSTART=#{ISSTART}
   </if> 
   <if test="ISEND!=null">
      ISEND=#{ISEND}
   </if> 
   <if test="ISASYNC!=null">
      ISASYNC=#{ISASYNC}
   </if> 
   <if test="ISEXCEPTION!=null">
      ISEXCEPTION=#{ISEXCEPTION}
   </if> 
   <if test="ISOVERTIME!=null">
      ISOVERTIME=#{ISOVERTIME}
   </if> 
   <if test="ISEXISTSUBPROC!=null">
      ISEXISTSUBPROC=#{ISEXISTSUBPROC}
   </if> 
   <if test="COSTTTIME!=null">
      COSTTTIME=#{COSTTTIME}
   </if> 
   <if test="EXPIRETIME!=null">
      EXPIRETIME=#{EXPIRETIME}
   </if> 
   <if test="REMARK!=null">
      REMARK=#{REMARK}
   </if> 
   <if test="IOBD!=null">
      IOBD=#{IOBD}
   </if> 
   <if test="IOR!=null">
      IOR=#{IOR}
   </if> 
   <if test="IOS!=null">
      IOS=#{IOS}
   </if> 
   <if test="IOC!=null">
      IOC=#{IOC}
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
   <if test="REMINDTIMES!=null">
      REMINDTIMES=#{REMINDTIMES}
   </if> 
   <if test="EXT4!=null">
      EXT4=#{EXT4}
   </if> 
   <if test="EXT5!=null">
      EXT5=#{EXT5}
   </if> 
   <if test="EXT6!=null">
      EXT6=#{EXT6}
   </if> 
   <if test="EXT7!=null">
      EXT7=#{EXT7}
   </if> 
   <if test="EXT8!=null">
      EXT8=#{EXT8}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:wfc_process_dto):ArrayList<wfc_process_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BUSINESSKEY", column = "BUSINESSKEY"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "PROCESSDEFVERID", column = "PROCESSDEFVERID"),
   Result(property = "CONTROLSTATE", column = "CONTROLSTATE"),
   Result(property = "PROCESSGROUPID", column = "PROCESSGROUPID"),
   Result(property = "PROCESSTITLE", column = "PROCESSTITLE"),
   Result(property = "STARTACTIVITYID", column = "STARTACTIVITYID"),
   Result(property = "STARTTASKINSTID", column = "STARTTASKINSTID"),
   Result(property = "STARTTIME", column = "STARTTIME"),
   Result(property = "PROCESSPROFILEID", column = "PROCESSPROFILEID"),
   Result(property = "PROCESSINSTTYPE", column = "PROCESSINSTTYPE"),
   Result(property = "PARENTPROCESSINSTID", column = "PARENTPROCESSINSTID"),
   Result(property = "PARENTTASKINSTID", column = "PARENTTASKINSTID"),
   Result(property = "SECURITYLAYER", column = "SECURITYLAYER"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "CREATEUSERORGID", column = "CREATEUSERORGID"),
   Result(property = "CREATEUSERDEPTID", column = "CREATEUSERDEPTID"),
   Result(property = "CREATEUSERROLEID", column = "CREATEUSERROLEID"),
   Result(property = "CREATEUSERLOCATION", column = "CREATEUSERLOCATION"),
   Result(property = "ENDACTIVITYID", column = "ENDACTIVITYID"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "ISPROCESS", column = "ISPROCESS"),
   Result(property = "ISSTART", column = "ISSTART"),
   Result(property = "ISEND", column = "ISEND"),
   Result(property = "ISASYNC", column = "ISASYNC"),
   Result(property = "ISEXCEPTION", column = "ISEXCEPTION"),
   Result(property = "ISOVERTIME", column = "ISOVERTIME"),
   Result(property = "ISEXISTSUBPROC", column = "ISEXISTSUBPROC"),
   Result(property = "COSTTTIME", column = "COSTTTIME"),
   Result(property = "EXPIRETIME", column = "EXPIRETIME"),
   Result(property = "REMARK", column = "REMARK"),
   Result(property = "IOBD", column = "IOBD"),
   Result(property = "IOR", column = "IOR"),
   Result(property = "IOS", column = "IOS"),
   Result(property = "IOC", column = "IOC"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "REMINDTIMES", column = "REMINDTIMES"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "EXT6", column = "EXT6"),
   Result(property = "EXT7", column = "EXT7"),
   Result(property = "EXT8", column = "EXT8")
)
@Select("""<script>
   SELECT * FROM wfc_process
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:wfc_process_dto):wfc_process_dto?
                


@Insert("""<script>
    insert into wfc_process
    (ID,BUSINESSKEY,PROCESSDEFID,PROCESSDEFVERID,CONTROLSTATE,PROCESSGROUPID,PROCESSTITLE,STARTACTIVITYID,STARTTASKINSTID,STARTTIME,PROCESSPROFILEID,PROCESSINSTTYPE,PARENTPROCESSINSTID,PARENTTASKINSTID,SECURITYLAYER,CREATEUSER,CREATETIME,CREATEUSERORGID,CREATEUSERDEPTID,CREATEUSERROLEID,CREATEUSERLOCATION,ENDACTIVITYID,ENDTIME,ISPROCESS,ISSTART,ISEND,ISASYNC,ISEXCEPTION,ISOVERTIME,ISEXISTSUBPROC,COSTTTIME,EXPIRETIME,REMARK,IOBD,IOR,IOS,IOC,EXT1,EXT2,EXT3,REMINDTIMES,EXT4,EXT5,EXT6,EXT7,EXT8)
    values
    (#{ID},#{BUSINESSKEY},#{PROCESSDEFID},#{PROCESSDEFVERID},#{CONTROLSTATE},#{PROCESSGROUPID},#{PROCESSTITLE},#{STARTACTIVITYID},#{STARTTASKINSTID},#{STARTTIME},#{PROCESSPROFILEID},#{PROCESSINSTTYPE},#{PARENTPROCESSINSTID},#{PARENTTASKINSTID},#{SECURITYLAYER},#{CREATEUSER},#{CREATETIME},#{CREATEUSERORGID},#{CREATEUSERDEPTID},#{CREATEUSERROLEID},#{CREATEUSERLOCATION},#{ENDACTIVITYID},#{ENDTIME},#{ISPROCESS},#{ISSTART},#{ISEND},#{ISASYNC},#{ISEXCEPTION},#{ISOVERTIME},#{ISEXISTSUBPROC},#{COSTTTIME},#{EXPIRETIME},#{REMARK},#{IOBD},#{IOR},#{IOS},#{IOC},#{EXT1},#{EXT2},#{EXT3},#{REMINDTIMES},#{EXT4},#{EXT5},#{EXT6},#{EXT7},#{EXT8})
</script>""")
fun Insert(model:wfc_process_dto):Unit
                


@Insert("""<script>
    insert into wfc_process
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='BUSINESSKEY!= null'> 
           BUSINESSKEY,
        </if>
        <if test='PROCESSDEFID!= null'> 
           PROCESSDEFID,
        </if>
        <if test='PROCESSDEFVERID!= null'> 
           PROCESSDEFVERID,
        </if>
        <if test='CONTROLSTATE!= null'> 
           CONTROLSTATE,
        </if>
        <if test='PROCESSGROUPID!= null'> 
           PROCESSGROUPID,
        </if>
        <if test='PROCESSTITLE!= null'> 
           PROCESSTITLE,
        </if>
        <if test='STARTACTIVITYID!= null'> 
           STARTACTIVITYID,
        </if>
        <if test='STARTTASKINSTID!= null'> 
           STARTTASKINSTID,
        </if>
        <if test='STARTTIME!= null'> 
           STARTTIME,
        </if>
        <if test='PROCESSPROFILEID!= null'> 
           PROCESSPROFILEID,
        </if>
        <if test='PROCESSINSTTYPE!= null'> 
           PROCESSINSTTYPE,
        </if>
        <if test='PARENTPROCESSINSTID!= null'> 
           PARENTPROCESSINSTID,
        </if>
        <if test='PARENTTASKINSTID!= null'> 
           PARENTTASKINSTID,
        </if>
        <if test='SECURITYLAYER!= null'> 
           SECURITYLAYER,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='CREATETIME!= null'> 
           CREATETIME,
        </if>
        <if test='CREATEUSERORGID!= null'> 
           CREATEUSERORGID,
        </if>
        <if test='CREATEUSERDEPTID!= null'> 
           CREATEUSERDEPTID,
        </if>
        <if test='CREATEUSERROLEID!= null'> 
           CREATEUSERROLEID,
        </if>
        <if test='CREATEUSERLOCATION!= null'> 
           CREATEUSERLOCATION,
        </if>
        <if test='ENDACTIVITYID!= null'> 
           ENDACTIVITYID,
        </if>
        <if test='ENDTIME!= null'> 
           ENDTIME,
        </if>
        <if test='ISPROCESS!= null'> 
           ISPROCESS,
        </if>
        <if test='ISSTART!= null'> 
           ISSTART,
        </if>
        <if test='ISEND!= null'> 
           ISEND,
        </if>
        <if test='ISASYNC!= null'> 
           ISASYNC,
        </if>
        <if test='ISEXCEPTION!= null'> 
           ISEXCEPTION,
        </if>
        <if test='ISOVERTIME!= null'> 
           ISOVERTIME,
        </if>
        <if test='ISEXISTSUBPROC!= null'> 
           ISEXISTSUBPROC,
        </if>
        <if test='COSTTTIME!= null'> 
           COSTTTIME,
        </if>
        <if test='EXPIRETIME!= null'> 
           EXPIRETIME,
        </if>
        <if test='REMARK!= null'> 
           REMARK,
        </if>
        <if test='IOBD!= null'> 
           IOBD,
        </if>
        <if test='IOR!= null'> 
           IOR,
        </if>
        <if test='IOS!= null'> 
           IOS,
        </if>
        <if test='IOC!= null'> 
           IOC,
        </if>
        <if test='EXT1!= null'> 
           EXT1,
        </if>
        <if test='EXT2!= null'> 
           EXT2,
        </if>
        <if test='EXT3!= null'> 
           EXT3,
        </if>
        <if test='REMINDTIMES!= null'> 
           REMINDTIMES,
        </if>
        <if test='EXT4!= null'> 
           EXT4,
        </if>
        <if test='EXT5!= null'> 
           EXT5,
        </if>
        <if test='EXT6!= null'> 
           EXT6,
        </if>
        <if test='EXT7!= null'> 
           EXT7,
        </if>
        <if test='EXT8!= null'> 
           EXT8
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='BUSINESSKEY!= null'> 
           #{BUSINESSKEY,jdbcType=varchar}，
        </if>
        <if test='PROCESSDEFID!= null'> 
           #{PROCESSDEFID,jdbcType=char}，
        </if>
        <if test='PROCESSDEFVERID!= null'> 
           #{PROCESSDEFVERID,jdbcType=char}，
        </if>
        <if test='CONTROLSTATE!= null'> 
           #{CONTROLSTATE,jdbcType=varchar}，
        </if>
        <if test='PROCESSGROUPID!= null'> 
           #{PROCESSGROUPID,jdbcType=char}，
        </if>
        <if test='PROCESSTITLE!= null'> 
           #{PROCESSTITLE,jdbcType=varchar}，
        </if>
        <if test='STARTACTIVITYID!= null'> 
           #{STARTACTIVITYID,jdbcType=char}，
        </if>
        <if test='STARTTASKINSTID!= null'> 
           #{STARTTASKINSTID,jdbcType=char}，
        </if>
        <if test='STARTTIME!= null'> 
           #{STARTTIME,jdbcType=datetime}，
        </if>
        <if test='PROCESSPROFILEID!= null'> 
           #{PROCESSPROFILEID,jdbcType=char}，
        </if>
        <if test='PROCESSINSTTYPE!= null'> 
           #{PROCESSINSTTYPE,jdbcType=smallint}，
        </if>
        <if test='PARENTPROCESSINSTID!= null'> 
           #{PARENTPROCESSINSTID,jdbcType=char}，
        </if>
        <if test='PARENTTASKINSTID!= null'> 
           #{PARENTTASKINSTID,jdbcType=char}，
        </if>
        <if test='SECURITYLAYER!= null'> 
           #{SECURITYLAYER,jdbcType=smallint}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='CREATETIME!= null'> 
           #{CREATETIME,jdbcType=datetime}，
        </if>
        <if test='CREATEUSERORGID!= null'> 
           #{CREATEUSERORGID,jdbcType=varchar}，
        </if>
        <if test='CREATEUSERDEPTID!= null'> 
           #{CREATEUSERDEPTID,jdbcType=varchar}，
        </if>
        <if test='CREATEUSERROLEID!= null'> 
           #{CREATEUSERROLEID,jdbcType=varchar}，
        </if>
        <if test='CREATEUSERLOCATION!= null'> 
           #{CREATEUSERLOCATION,jdbcType=varchar}，
        </if>
        <if test='ENDACTIVITYID!= null'> 
           #{ENDACTIVITYID,jdbcType=char}，
        </if>
        <if test='ENDTIME!= null'> 
           #{ENDTIME,jdbcType=datetime}，
        </if>
        <if test='ISPROCESS!= null'> 
           #{ISPROCESS,jdbcType=smallint}，
        </if>
        <if test='ISSTART!= null'> 
           #{ISSTART,jdbcType=smallint}，
        </if>
        <if test='ISEND!= null'> 
           #{ISEND,jdbcType=smallint}，
        </if>
        <if test='ISASYNC!= null'> 
           #{ISASYNC,jdbcType=smallint}，
        </if>
        <if test='ISEXCEPTION!= null'> 
           #{ISEXCEPTION,jdbcType=smallint}，
        </if>
        <if test='ISOVERTIME!= null'> 
           #{ISOVERTIME,jdbcType=smallint}，
        </if>
        <if test='ISEXISTSUBPROC!= null'> 
           #{ISEXISTSUBPROC,jdbcType=smallint}，
        </if>
        <if test='COSTTTIME!= null'> 
           #{COSTTTIME,jdbcType=decimal}，
        </if>
        <if test='EXPIRETIME!= null'> 
           #{EXPIRETIME,jdbcType=decimal}，
        </if>
        <if test='REMARK!= null'> 
           #{REMARK,jdbcType=varchar}，
        </if>
        <if test='IOBD!= null'> 
           #{IOBD,jdbcType=char}，
        </if>
        <if test='IOR!= null'> 
           #{IOR,jdbcType=char}，
        </if>
        <if test='IOS!= null'> 
           #{IOS,jdbcType=char}，
        </if>
        <if test='IOC!= null'> 
           #{IOC,jdbcType=char}，
        </if>
        <if test='EXT1!= null'> 
           #{EXT1,jdbcType=varchar}，
        </if>
        <if test='EXT2!= null'> 
           #{EXT2,jdbcType=varchar}，
        </if>
        <if test='EXT3!= null'> 
           #{EXT3,jdbcType=varchar}，
        </if>
        <if test='REMINDTIMES!= null'> 
           #{REMINDTIMES,jdbcType=smallint}，
        </if>
        <if test='EXT4!= null'> 
           #{EXT4,jdbcType=varchar}，
        </if>
        <if test='EXT5!= null'> 
           #{EXT5,jdbcType=varchar}，
        </if>
        <if test='EXT6!= null'> 
           #{EXT6,jdbcType=varchar}，
        </if>
        <if test='EXT7!= null'> 
           #{EXT7,jdbcType=decimal}，
        </if>
        <if test='EXT8!= null'> 
           #{EXT8,jdbcType=decimal}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:wfc_process_dto):Unit
                


@Delete("DELETE FROM wfc_process WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE wfc_process SET
        ID=#{ID,jdbcType=String},
        BUSINESSKEY=#{BUSINESSKEY,jdbcType=String},
        PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},
        PROCESSDEFVERID=#{PROCESSDEFVERID,jdbcType=String},
        CONTROLSTATE=#{CONTROLSTATE,jdbcType=String},
        PROCESSGROUPID=#{PROCESSGROUPID,jdbcType=String},
        PROCESSTITLE=#{PROCESSTITLE,jdbcType=String},
        STARTACTIVITYID=#{STARTACTIVITYID,jdbcType=String},
        STARTTASKINSTID=#{STARTTASKINSTID,jdbcType=String},
        STARTTIME=#{STARTTIME,jdbcType=Timestamp},
        PROCESSPROFILEID=#{PROCESSPROFILEID,jdbcType=String},
        PROCESSINSTTYPE=#{PROCESSINSTTYPE,jdbcType=Integer},
        PARENTPROCESSINSTID=#{PARENTPROCESSINSTID,jdbcType=String},
        PARENTTASKINSTID=#{PARENTTASKINSTID,jdbcType=String},
        SECURITYLAYER=#{SECURITYLAYER,jdbcType=Integer},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        CREATETIME=#{CREATETIME,jdbcType=Timestamp},
        CREATEUSERORGID=#{CREATEUSERORGID,jdbcType=String},
        CREATEUSERDEPTID=#{CREATEUSERDEPTID,jdbcType=String},
        CREATEUSERROLEID=#{CREATEUSERROLEID,jdbcType=String},
        CREATEUSERLOCATION=#{CREATEUSERLOCATION,jdbcType=String},
        ENDACTIVITYID=#{ENDACTIVITYID,jdbcType=String},
        ENDTIME=#{ENDTIME,jdbcType=Timestamp},
        ISPROCESS=#{ISPROCESS,jdbcType=Integer},
        ISSTART=#{ISSTART,jdbcType=Integer},
        ISEND=#{ISEND,jdbcType=Integer},
        ISASYNC=#{ISASYNC,jdbcType=Integer},
        ISEXCEPTION=#{ISEXCEPTION,jdbcType=Integer},
        ISOVERTIME=#{ISOVERTIME,jdbcType=Integer},
        ISEXISTSUBPROC=#{ISEXISTSUBPROC,jdbcType=Integer},
        COSTTTIME=#{COSTTTIME,jdbcType=BigDecimal},
        EXPIRETIME=#{EXPIRETIME,jdbcType=BigDecimal},
        REMARK=#{REMARK,jdbcType=String},
        IOBD=#{IOBD,jdbcType=String},
        IOR=#{IOR,jdbcType=String},
        IOS=#{IOS,jdbcType=String},
        IOC=#{IOC,jdbcType=String},
        EXT1=#{EXT1,jdbcType=String},
        EXT2=#{EXT2,jdbcType=String},
        EXT3=#{EXT3,jdbcType=String},
        REMINDTIMES=#{REMINDTIMES,jdbcType=Integer},
        EXT4=#{EXT4,jdbcType=String},
        EXT5=#{EXT5,jdbcType=String},
        EXT6=#{EXT6,jdbcType=String},
        EXT7=#{EXT7,jdbcType=BigDecimal},
        EXT8=#{EXT8,jdbcType=BigDecimal}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:wfc_process_dto)
        

@Update("""<script>
            UPDATE wfc_process SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="BUSINESSKEY != null">  BUSINESSKEY=#{BUSINESSKEY,jdbcType=String},</if>
        <if test="PROCESSDEFID != null">  PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},</if>
        <if test="PROCESSDEFVERID != null">  PROCESSDEFVERID=#{PROCESSDEFVERID,jdbcType=String},</if>
        <if test="CONTROLSTATE != null">  CONTROLSTATE=#{CONTROLSTATE,jdbcType=String},</if>
        <if test="PROCESSGROUPID != null">  PROCESSGROUPID=#{PROCESSGROUPID,jdbcType=String},</if>
        <if test="PROCESSTITLE != null">  PROCESSTITLE=#{PROCESSTITLE,jdbcType=String},</if>
        <if test="STARTACTIVITYID != null">  STARTACTIVITYID=#{STARTACTIVITYID,jdbcType=String},</if>
        <if test="STARTTASKINSTID != null">  STARTTASKINSTID=#{STARTTASKINSTID,jdbcType=String},</if>
        <if test="STARTTIME != null">  STARTTIME=#{STARTTIME,jdbcType=Timestamp},</if>
        <if test="PROCESSPROFILEID != null">  PROCESSPROFILEID=#{PROCESSPROFILEID,jdbcType=String},</if>
        <if test="PROCESSINSTTYPE != null">  PROCESSINSTTYPE=#{PROCESSINSTTYPE,jdbcType=Integer},</if>
        <if test="PARENTPROCESSINSTID != null">  PARENTPROCESSINSTID=#{PARENTPROCESSINSTID,jdbcType=String},</if>
        <if test="PARENTTASKINSTID != null">  PARENTTASKINSTID=#{PARENTTASKINSTID,jdbcType=String},</if>
        <if test="SECURITYLAYER != null">  SECURITYLAYER=#{SECURITYLAYER,jdbcType=Integer},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="CREATETIME != null">  CREATETIME=#{CREATETIME,jdbcType=Timestamp},</if>
        <if test="CREATEUSERORGID != null">  CREATEUSERORGID=#{CREATEUSERORGID,jdbcType=String},</if>
        <if test="CREATEUSERDEPTID != null">  CREATEUSERDEPTID=#{CREATEUSERDEPTID,jdbcType=String},</if>
        <if test="CREATEUSERROLEID != null">  CREATEUSERROLEID=#{CREATEUSERROLEID,jdbcType=String},</if>
        <if test="CREATEUSERLOCATION != null">  CREATEUSERLOCATION=#{CREATEUSERLOCATION,jdbcType=String},</if>
        <if test="ENDACTIVITYID != null">  ENDACTIVITYID=#{ENDACTIVITYID,jdbcType=String},</if>
        <if test="ENDTIME != null">  ENDTIME=#{ENDTIME,jdbcType=Timestamp},</if>
        <if test="ISPROCESS != null">  ISPROCESS=#{ISPROCESS,jdbcType=Integer},</if>
        <if test="ISSTART != null">  ISSTART=#{ISSTART,jdbcType=Integer},</if>
        <if test="ISEND != null">  ISEND=#{ISEND,jdbcType=Integer},</if>
        <if test="ISASYNC != null">  ISASYNC=#{ISASYNC,jdbcType=Integer},</if>
        <if test="ISEXCEPTION != null">  ISEXCEPTION=#{ISEXCEPTION,jdbcType=Integer},</if>
        <if test="ISOVERTIME != null">  ISOVERTIME=#{ISOVERTIME,jdbcType=Integer},</if>
        <if test="ISEXISTSUBPROC != null">  ISEXISTSUBPROC=#{ISEXISTSUBPROC,jdbcType=Integer},</if>
        <if test="COSTTTIME != null">  COSTTTIME=#{COSTTTIME,jdbcType=BigDecimal},</if>
        <if test="EXPIRETIME != null">  EXPIRETIME=#{EXPIRETIME,jdbcType=BigDecimal},</if>
        <if test="REMARK != null">  REMARK=#{REMARK,jdbcType=String},</if>
        <if test="IOBD != null">  IOBD=#{IOBD,jdbcType=String},</if>
        <if test="IOR != null">  IOR=#{IOR,jdbcType=String},</if>
        <if test="IOS != null">  IOS=#{IOS,jdbcType=String},</if>
        <if test="IOC != null">  IOC=#{IOC,jdbcType=String},</if>
        <if test="EXT1 != null">  EXT1=#{EXT1,jdbcType=String},</if>
        <if test="EXT2 != null">  EXT2=#{EXT2,jdbcType=String},</if>
        <if test="EXT3 != null">  EXT3=#{EXT3,jdbcType=String},</if>
        <if test="REMINDTIMES != null">  REMINDTIMES=#{REMINDTIMES,jdbcType=Integer},</if>
        <if test="EXT4 != null">  EXT4=#{EXT4,jdbcType=String},</if>
        <if test="EXT5 != null">  EXT5=#{EXT5,jdbcType=String},</if>
        <if test="EXT6 != null">  EXT6=#{EXT6,jdbcType=String},</if>
        <if test="EXT7 != null">  EXT7=#{EXT7,jdbcType=BigDecimal},</if>
        <if test="EXT8 != null">  EXT8=#{EXT8,jdbcType=BigDecimal}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:wfc_process_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfc_process{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BUSINESSKEY", column = "BUSINESSKEY"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "PROCESSDEFVERID", column = "PROCESSDEFVERID"),
   Result(property = "CONTROLSTATE", column = "CONTROLSTATE"),
   Result(property = "PROCESSGROUPID", column = "PROCESSGROUPID"),
   Result(property = "PROCESSTITLE", column = "PROCESSTITLE"),
   Result(property = "STARTACTIVITYID", column = "STARTACTIVITYID"),
   Result(property = "STARTTASKINSTID", column = "STARTTASKINSTID"),
   Result(property = "STARTTIME", column = "STARTTIME"),
   Result(property = "PROCESSPROFILEID", column = "PROCESSPROFILEID"),
   Result(property = "PROCESSINSTTYPE", column = "PROCESSINSTTYPE"),
   Result(property = "PARENTPROCESSINSTID", column = "PARENTPROCESSINSTID"),
   Result(property = "PARENTTASKINSTID", column = "PARENTTASKINSTID"),
   Result(property = "SECURITYLAYER", column = "SECURITYLAYER"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "CREATEUSERORGID", column = "CREATEUSERORGID"),
   Result(property = "CREATEUSERDEPTID", column = "CREATEUSERDEPTID"),
   Result(property = "CREATEUSERROLEID", column = "CREATEUSERROLEID"),
   Result(property = "CREATEUSERLOCATION", column = "CREATEUSERLOCATION"),
   Result(property = "ENDACTIVITYID", column = "ENDACTIVITYID"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "ISPROCESS", column = "ISPROCESS"),
   Result(property = "ISSTART", column = "ISSTART"),
   Result(property = "ISEND", column = "ISEND"),
   Result(property = "ISASYNC", column = "ISASYNC"),
   Result(property = "ISEXCEPTION", column = "ISEXCEPTION"),
   Result(property = "ISOVERTIME", column = "ISOVERTIME"),
   Result(property = "ISEXISTSUBPROC", column = "ISEXISTSUBPROC"),
   Result(property = "COSTTTIME", column = "COSTTTIME"),
   Result(property = "EXPIRETIME", column = "EXPIRETIME"),
   Result(property = "REMARK", column = "REMARK"),
   Result(property = "IOBD", column = "IOBD"),
   Result(property = "IOR", column = "IOR"),
   Result(property = "IOS", column = "IOS"),
   Result(property = "IOC", column = "IOC"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "REMINDTIMES", column = "REMINDTIMES"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "EXT6", column = "EXT6"),
   Result(property = "EXT7", column = "EXT7"),
   Result(property = "EXT8", column = "EXT8")
)
@Select("""<script>
   SELECT * FROM wfc_process
</script>""")
fun GetListAll():ArrayList<wfc_process_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BUSINESSKEY", column = "BUSINESSKEY"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "PROCESSDEFVERID", column = "PROCESSDEFVERID"),
   Result(property = "CONTROLSTATE", column = "CONTROLSTATE"),
   Result(property = "PROCESSGROUPID", column = "PROCESSGROUPID"),
   Result(property = "PROCESSTITLE", column = "PROCESSTITLE"),
   Result(property = "STARTACTIVITYID", column = "STARTACTIVITYID"),
   Result(property = "STARTTASKINSTID", column = "STARTTASKINSTID"),
   Result(property = "STARTTIME", column = "STARTTIME"),
   Result(property = "PROCESSPROFILEID", column = "PROCESSPROFILEID"),
   Result(property = "PROCESSINSTTYPE", column = "PROCESSINSTTYPE"),
   Result(property = "PARENTPROCESSINSTID", column = "PARENTPROCESSINSTID"),
   Result(property = "PARENTTASKINSTID", column = "PARENTTASKINSTID"),
   Result(property = "SECURITYLAYER", column = "SECURITYLAYER"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "CREATEUSERORGID", column = "CREATEUSERORGID"),
   Result(property = "CREATEUSERDEPTID", column = "CREATEUSERDEPTID"),
   Result(property = "CREATEUSERROLEID", column = "CREATEUSERROLEID"),
   Result(property = "CREATEUSERLOCATION", column = "CREATEUSERLOCATION"),
   Result(property = "ENDACTIVITYID", column = "ENDACTIVITYID"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "ISPROCESS", column = "ISPROCESS"),
   Result(property = "ISSTART", column = "ISSTART"),
   Result(property = "ISEND", column = "ISEND"),
   Result(property = "ISASYNC", column = "ISASYNC"),
   Result(property = "ISEXCEPTION", column = "ISEXCEPTION"),
   Result(property = "ISOVERTIME", column = "ISOVERTIME"),
   Result(property = "ISEXISTSUBPROC", column = "ISEXISTSUBPROC"),
   Result(property = "COSTTTIME", column = "COSTTTIME"),
   Result(property = "EXPIRETIME", column = "EXPIRETIME"),
   Result(property = "REMARK", column = "REMARK"),
   Result(property = "IOBD", column = "IOBD"),
   Result(property = "IOR", column = "IOR"),
   Result(property = "IOS", column = "IOS"),
   Result(property = "IOC", column = "IOC"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "REMINDTIMES", column = "REMINDTIMES"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "EXT6", column = "EXT6"),
   Result(property = "EXT7", column = "EXT7"),
   Result(property = "EXT8", column = "EXT8")
)
@Select("""<script>
   SELECT * FROM wfc_process
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="BUSINESSKEY!=null">
      BUSINESSKEY=#{BUSINESSKEY}
   </if> 
   <if test="PROCESSDEFID!=null">
      PROCESSDEFID=#{PROCESSDEFID}
   </if> 
   <if test="PROCESSDEFVERID!=null">
      PROCESSDEFVERID=#{PROCESSDEFVERID}
   </if> 
   <if test="CONTROLSTATE!=null">
      CONTROLSTATE=#{CONTROLSTATE}
   </if> 
   <if test="PROCESSGROUPID!=null">
      PROCESSGROUPID=#{PROCESSGROUPID}
   </if> 
   <if test="PROCESSTITLE!=null">
      PROCESSTITLE=#{PROCESSTITLE}
   </if> 
   <if test="STARTACTIVITYID!=null">
      STARTACTIVITYID=#{STARTACTIVITYID}
   </if> 
   <if test="STARTTASKINSTID!=null">
      STARTTASKINSTID=#{STARTTASKINSTID}
   </if> 
   <if test="STARTTIME!=null">
      STARTTIME=#{STARTTIME}
   </if> 
   <if test="PROCESSPROFILEID!=null">
      PROCESSPROFILEID=#{PROCESSPROFILEID}
   </if> 
   <if test="PROCESSINSTTYPE!=null">
      PROCESSINSTTYPE=#{PROCESSINSTTYPE}
   </if> 
   <if test="PARENTPROCESSINSTID!=null">
      PARENTPROCESSINSTID=#{PARENTPROCESSINSTID}
   </if> 
   <if test="PARENTTASKINSTID!=null">
      PARENTTASKINSTID=#{PARENTTASKINSTID}
   </if> 
   <if test="SECURITYLAYER!=null">
      SECURITYLAYER=#{SECURITYLAYER}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   <if test="CREATEUSERORGID!=null">
      CREATEUSERORGID=#{CREATEUSERORGID}
   </if> 
   <if test="CREATEUSERDEPTID!=null">
      CREATEUSERDEPTID=#{CREATEUSERDEPTID}
   </if> 
   <if test="CREATEUSERROLEID!=null">
      CREATEUSERROLEID=#{CREATEUSERROLEID}
   </if> 
   <if test="CREATEUSERLOCATION!=null">
      CREATEUSERLOCATION=#{CREATEUSERLOCATION}
   </if> 
   <if test="ENDACTIVITYID!=null">
      ENDACTIVITYID=#{ENDACTIVITYID}
   </if> 
   <if test="ENDTIME!=null">
      ENDTIME=#{ENDTIME}
   </if> 
   <if test="ISPROCESS!=null">
      ISPROCESS=#{ISPROCESS}
   </if> 
   <if test="ISSTART!=null">
      ISSTART=#{ISSTART}
   </if> 
   <if test="ISEND!=null">
      ISEND=#{ISEND}
   </if> 
   <if test="ISASYNC!=null">
      ISASYNC=#{ISASYNC}
   </if> 
   <if test="ISEXCEPTION!=null">
      ISEXCEPTION=#{ISEXCEPTION}
   </if> 
   <if test="ISOVERTIME!=null">
      ISOVERTIME=#{ISOVERTIME}
   </if> 
   <if test="ISEXISTSUBPROC!=null">
      ISEXISTSUBPROC=#{ISEXISTSUBPROC}
   </if> 
   <if test="COSTTTIME!=null">
      COSTTTIME=#{COSTTTIME}
   </if> 
   <if test="EXPIRETIME!=null">
      EXPIRETIME=#{EXPIRETIME}
   </if> 
   <if test="REMARK!=null">
      REMARK=#{REMARK}
   </if> 
   <if test="IOBD!=null">
      IOBD=#{IOBD}
   </if> 
   <if test="IOR!=null">
      IOR=#{IOR}
   </if> 
   <if test="IOS!=null">
      IOS=#{IOS}
   </if> 
   <if test="IOC!=null">
      IOC=#{IOC}
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
   <if test="REMINDTIMES!=null">
      REMINDTIMES=#{REMINDTIMES}
   </if> 
   <if test="EXT4!=null">
      EXT4=#{EXT4}
   </if> 
   <if test="EXT5!=null">
      EXT5=#{EXT5}
   </if> 
   <if test="EXT6!=null">
      EXT6=#{EXT6}
   </if> 
   <if test="EXT7!=null">
      EXT7=#{EXT7}
   </if> 
   <if test="EXT8!=null">
      EXT8=#{EXT8}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:wfc_process_dto):ArrayList<wfc_process_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BUSINESSKEY", column = "BUSINESSKEY"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "PROCESSDEFVERID", column = "PROCESSDEFVERID"),
   Result(property = "CONTROLSTATE", column = "CONTROLSTATE"),
   Result(property = "PROCESSGROUPID", column = "PROCESSGROUPID"),
   Result(property = "PROCESSTITLE", column = "PROCESSTITLE"),
   Result(property = "STARTACTIVITYID", column = "STARTACTIVITYID"),
   Result(property = "STARTTASKINSTID", column = "STARTTASKINSTID"),
   Result(property = "STARTTIME", column = "STARTTIME"),
   Result(property = "PROCESSPROFILEID", column = "PROCESSPROFILEID"),
   Result(property = "PROCESSINSTTYPE", column = "PROCESSINSTTYPE"),
   Result(property = "PARENTPROCESSINSTID", column = "PARENTPROCESSINSTID"),
   Result(property = "PARENTTASKINSTID", column = "PARENTTASKINSTID"),
   Result(property = "SECURITYLAYER", column = "SECURITYLAYER"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "CREATEUSERORGID", column = "CREATEUSERORGID"),
   Result(property = "CREATEUSERDEPTID", column = "CREATEUSERDEPTID"),
   Result(property = "CREATEUSERROLEID", column = "CREATEUSERROLEID"),
   Result(property = "CREATEUSERLOCATION", column = "CREATEUSERLOCATION"),
   Result(property = "ENDACTIVITYID", column = "ENDACTIVITYID"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "ISPROCESS", column = "ISPROCESS"),
   Result(property = "ISSTART", column = "ISSTART"),
   Result(property = "ISEND", column = "ISEND"),
   Result(property = "ISASYNC", column = "ISASYNC"),
   Result(property = "ISEXCEPTION", column = "ISEXCEPTION"),
   Result(property = "ISOVERTIME", column = "ISOVERTIME"),
   Result(property = "ISEXISTSUBPROC", column = "ISEXISTSUBPROC"),
   Result(property = "COSTTTIME", column = "COSTTTIME"),
   Result(property = "EXPIRETIME", column = "EXPIRETIME"),
   Result(property = "REMARK", column = "REMARK"),
   Result(property = "IOBD", column = "IOBD"),
   Result(property = "IOR", column = "IOR"),
   Result(property = "IOS", column = "IOS"),
   Result(property = "IOC", column = "IOC"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "REMINDTIMES", column = "REMINDTIMES"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "EXT6", column = "EXT6"),
   Result(property = "EXT7", column = "EXT7"),
   Result(property = "EXT8", column = "EXT8")
)
@Select("""<script>
   SELECT * FROM wfc_process
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:wfc_process_dto):wfc_process_dto?
                


@Insert("""<script>
    insert into wfc_process
    (ID,BUSINESSKEY,PROCESSDEFID,PROCESSDEFVERID,CONTROLSTATE,PROCESSGROUPID,PROCESSTITLE,STARTACTIVITYID,STARTTASKINSTID,STARTTIME,PROCESSPROFILEID,PROCESSINSTTYPE,PARENTPROCESSINSTID,PARENTTASKINSTID,SECURITYLAYER,CREATEUSER,CREATETIME,CREATEUSERORGID,CREATEUSERDEPTID,CREATEUSERROLEID,CREATEUSERLOCATION,ENDACTIVITYID,ENDTIME,ISPROCESS,ISSTART,ISEND,ISASYNC,ISEXCEPTION,ISOVERTIME,ISEXISTSUBPROC,COSTTTIME,EXPIRETIME,REMARK,IOBD,IOR,IOS,IOC,EXT1,EXT2,EXT3,REMINDTIMES,EXT4,EXT5,EXT6,EXT7,EXT8)
    values
    (#{ID},#{BUSINESSKEY},#{PROCESSDEFID},#{PROCESSDEFVERID},#{CONTROLSTATE},#{PROCESSGROUPID},#{PROCESSTITLE},#{STARTACTIVITYID},#{STARTTASKINSTID},#{STARTTIME},#{PROCESSPROFILEID},#{PROCESSINSTTYPE},#{PARENTPROCESSINSTID},#{PARENTTASKINSTID},#{SECURITYLAYER},#{CREATEUSER},#{CREATETIME},#{CREATEUSERORGID},#{CREATEUSERDEPTID},#{CREATEUSERROLEID},#{CREATEUSERLOCATION},#{ENDACTIVITYID},#{ENDTIME},#{ISPROCESS},#{ISSTART},#{ISEND},#{ISASYNC},#{ISEXCEPTION},#{ISOVERTIME},#{ISEXISTSUBPROC},#{COSTTTIME},#{EXPIRETIME},#{REMARK},#{IOBD},#{IOR},#{IOS},#{IOC},#{EXT1},#{EXT2},#{EXT3},#{REMINDTIMES},#{EXT4},#{EXT5},#{EXT6},#{EXT7},#{EXT8})
</script>""")
fun Insert(model:wfc_process_dto):Unit
                


@Insert("""<script>
    insert into wfc_process
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='BUSINESSKEY!= null'> 
           BUSINESSKEY,
        </if>
        <if test='PROCESSDEFID!= null'> 
           PROCESSDEFID,
        </if>
        <if test='PROCESSDEFVERID!= null'> 
           PROCESSDEFVERID,
        </if>
        <if test='CONTROLSTATE!= null'> 
           CONTROLSTATE,
        </if>
        <if test='PROCESSGROUPID!= null'> 
           PROCESSGROUPID,
        </if>
        <if test='PROCESSTITLE!= null'> 
           PROCESSTITLE,
        </if>
        <if test='STARTACTIVITYID!= null'> 
           STARTACTIVITYID,
        </if>
        <if test='STARTTASKINSTID!= null'> 
           STARTTASKINSTID,
        </if>
        <if test='STARTTIME!= null'> 
           STARTTIME,
        </if>
        <if test='PROCESSPROFILEID!= null'> 
           PROCESSPROFILEID,
        </if>
        <if test='PROCESSINSTTYPE!= null'> 
           PROCESSINSTTYPE,
        </if>
        <if test='PARENTPROCESSINSTID!= null'> 
           PARENTPROCESSINSTID,
        </if>
        <if test='PARENTTASKINSTID!= null'> 
           PARENTTASKINSTID,
        </if>
        <if test='SECURITYLAYER!= null'> 
           SECURITYLAYER,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='CREATETIME!= null'> 
           CREATETIME,
        </if>
        <if test='CREATEUSERORGID!= null'> 
           CREATEUSERORGID,
        </if>
        <if test='CREATEUSERDEPTID!= null'> 
           CREATEUSERDEPTID,
        </if>
        <if test='CREATEUSERROLEID!= null'> 
           CREATEUSERROLEID,
        </if>
        <if test='CREATEUSERLOCATION!= null'> 
           CREATEUSERLOCATION,
        </if>
        <if test='ENDACTIVITYID!= null'> 
           ENDACTIVITYID,
        </if>
        <if test='ENDTIME!= null'> 
           ENDTIME,
        </if>
        <if test='ISPROCESS!= null'> 
           ISPROCESS,
        </if>
        <if test='ISSTART!= null'> 
           ISSTART,
        </if>
        <if test='ISEND!= null'> 
           ISEND,
        </if>
        <if test='ISASYNC!= null'> 
           ISASYNC,
        </if>
        <if test='ISEXCEPTION!= null'> 
           ISEXCEPTION,
        </if>
        <if test='ISOVERTIME!= null'> 
           ISOVERTIME,
        </if>
        <if test='ISEXISTSUBPROC!= null'> 
           ISEXISTSUBPROC,
        </if>
        <if test='COSTTTIME!= null'> 
           COSTTTIME,
        </if>
        <if test='EXPIRETIME!= null'> 
           EXPIRETIME,
        </if>
        <if test='REMARK!= null'> 
           REMARK,
        </if>
        <if test='IOBD!= null'> 
           IOBD,
        </if>
        <if test='IOR!= null'> 
           IOR,
        </if>
        <if test='IOS!= null'> 
           IOS,
        </if>
        <if test='IOC!= null'> 
           IOC,
        </if>
        <if test='EXT1!= null'> 
           EXT1,
        </if>
        <if test='EXT2!= null'> 
           EXT2,
        </if>
        <if test='EXT3!= null'> 
           EXT3,
        </if>
        <if test='REMINDTIMES!= null'> 
           REMINDTIMES,
        </if>
        <if test='EXT4!= null'> 
           EXT4,
        </if>
        <if test='EXT5!= null'> 
           EXT5,
        </if>
        <if test='EXT6!= null'> 
           EXT6,
        </if>
        <if test='EXT7!= null'> 
           EXT7,
        </if>
        <if test='EXT8!= null'> 
           EXT8
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='BUSINESSKEY!= null'> 
           #{BUSINESSKEY,jdbcType=varchar}，
        </if>
        <if test='PROCESSDEFID!= null'> 
           #{PROCESSDEFID,jdbcType=char}，
        </if>
        <if test='PROCESSDEFVERID!= null'> 
           #{PROCESSDEFVERID,jdbcType=char}，
        </if>
        <if test='CONTROLSTATE!= null'> 
           #{CONTROLSTATE,jdbcType=varchar}，
        </if>
        <if test='PROCESSGROUPID!= null'> 
           #{PROCESSGROUPID,jdbcType=char}，
        </if>
        <if test='PROCESSTITLE!= null'> 
           #{PROCESSTITLE,jdbcType=varchar}，
        </if>
        <if test='STARTACTIVITYID!= null'> 
           #{STARTACTIVITYID,jdbcType=char}，
        </if>
        <if test='STARTTASKINSTID!= null'> 
           #{STARTTASKINSTID,jdbcType=char}，
        </if>
        <if test='STARTTIME!= null'> 
           #{STARTTIME,jdbcType=datetime}，
        </if>
        <if test='PROCESSPROFILEID!= null'> 
           #{PROCESSPROFILEID,jdbcType=char}，
        </if>
        <if test='PROCESSINSTTYPE!= null'> 
           #{PROCESSINSTTYPE,jdbcType=smallint}，
        </if>
        <if test='PARENTPROCESSINSTID!= null'> 
           #{PARENTPROCESSINSTID,jdbcType=char}，
        </if>
        <if test='PARENTTASKINSTID!= null'> 
           #{PARENTTASKINSTID,jdbcType=char}，
        </if>
        <if test='SECURITYLAYER!= null'> 
           #{SECURITYLAYER,jdbcType=smallint}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='CREATETIME!= null'> 
           #{CREATETIME,jdbcType=datetime}，
        </if>
        <if test='CREATEUSERORGID!= null'> 
           #{CREATEUSERORGID,jdbcType=varchar}，
        </if>
        <if test='CREATEUSERDEPTID!= null'> 
           #{CREATEUSERDEPTID,jdbcType=varchar}，
        </if>
        <if test='CREATEUSERROLEID!= null'> 
           #{CREATEUSERROLEID,jdbcType=varchar}，
        </if>
        <if test='CREATEUSERLOCATION!= null'> 
           #{CREATEUSERLOCATION,jdbcType=varchar}，
        </if>
        <if test='ENDACTIVITYID!= null'> 
           #{ENDACTIVITYID,jdbcType=char}，
        </if>
        <if test='ENDTIME!= null'> 
           #{ENDTIME,jdbcType=datetime}，
        </if>
        <if test='ISPROCESS!= null'> 
           #{ISPROCESS,jdbcType=smallint}，
        </if>
        <if test='ISSTART!= null'> 
           #{ISSTART,jdbcType=smallint}，
        </if>
        <if test='ISEND!= null'> 
           #{ISEND,jdbcType=smallint}，
        </if>
        <if test='ISASYNC!= null'> 
           #{ISASYNC,jdbcType=smallint}，
        </if>
        <if test='ISEXCEPTION!= null'> 
           #{ISEXCEPTION,jdbcType=smallint}，
        </if>
        <if test='ISOVERTIME!= null'> 
           #{ISOVERTIME,jdbcType=smallint}，
        </if>
        <if test='ISEXISTSUBPROC!= null'> 
           #{ISEXISTSUBPROC,jdbcType=smallint}，
        </if>
        <if test='COSTTTIME!= null'> 
           #{COSTTTIME,jdbcType=decimal}，
        </if>
        <if test='EXPIRETIME!= null'> 
           #{EXPIRETIME,jdbcType=decimal}，
        </if>
        <if test='REMARK!= null'> 
           #{REMARK,jdbcType=varchar}，
        </if>
        <if test='IOBD!= null'> 
           #{IOBD,jdbcType=char}，
        </if>
        <if test='IOR!= null'> 
           #{IOR,jdbcType=char}，
        </if>
        <if test='IOS!= null'> 
           #{IOS,jdbcType=char}，
        </if>
        <if test='IOC!= null'> 
           #{IOC,jdbcType=char}，
        </if>
        <if test='EXT1!= null'> 
           #{EXT1,jdbcType=varchar}，
        </if>
        <if test='EXT2!= null'> 
           #{EXT2,jdbcType=varchar}，
        </if>
        <if test='EXT3!= null'> 
           #{EXT3,jdbcType=varchar}，
        </if>
        <if test='REMINDTIMES!= null'> 
           #{REMINDTIMES,jdbcType=smallint}，
        </if>
        <if test='EXT4!= null'> 
           #{EXT4,jdbcType=varchar}，
        </if>
        <if test='EXT5!= null'> 
           #{EXT5,jdbcType=varchar}，
        </if>
        <if test='EXT6!= null'> 
           #{EXT6,jdbcType=varchar}，
        </if>
        <if test='EXT7!= null'> 
           #{EXT7,jdbcType=decimal}，
        </if>
        <if test='EXT8!= null'> 
           #{EXT8,jdbcType=decimal}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:wfc_process_dto):Unit
                


@Delete("DELETE FROM wfc_process WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE wfc_process SET
        ID=#{ID,jdbcType=String},
        BUSINESSKEY=#{BUSINESSKEY,jdbcType=String},
        PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},
        PROCESSDEFVERID=#{PROCESSDEFVERID,jdbcType=String},
        CONTROLSTATE=#{CONTROLSTATE,jdbcType=String},
        PROCESSGROUPID=#{PROCESSGROUPID,jdbcType=String},
        PROCESSTITLE=#{PROCESSTITLE,jdbcType=String},
        STARTACTIVITYID=#{STARTACTIVITYID,jdbcType=String},
        STARTTASKINSTID=#{STARTTASKINSTID,jdbcType=String},
        STARTTIME=#{STARTTIME,jdbcType=Timestamp},
        PROCESSPROFILEID=#{PROCESSPROFILEID,jdbcType=String},
        PROCESSINSTTYPE=#{PROCESSINSTTYPE,jdbcType=Integer},
        PARENTPROCESSINSTID=#{PARENTPROCESSINSTID,jdbcType=String},
        PARENTTASKINSTID=#{PARENTTASKINSTID,jdbcType=String},
        SECURITYLAYER=#{SECURITYLAYER,jdbcType=Integer},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        CREATETIME=#{CREATETIME,jdbcType=Timestamp},
        CREATEUSERORGID=#{CREATEUSERORGID,jdbcType=String},
        CREATEUSERDEPTID=#{CREATEUSERDEPTID,jdbcType=String},
        CREATEUSERROLEID=#{CREATEUSERROLEID,jdbcType=String},
        CREATEUSERLOCATION=#{CREATEUSERLOCATION,jdbcType=String},
        ENDACTIVITYID=#{ENDACTIVITYID,jdbcType=String},
        ENDTIME=#{ENDTIME,jdbcType=Timestamp},
        ISPROCESS=#{ISPROCESS,jdbcType=Integer},
        ISSTART=#{ISSTART,jdbcType=Integer},
        ISEND=#{ISEND,jdbcType=Integer},
        ISASYNC=#{ISASYNC,jdbcType=Integer},
        ISEXCEPTION=#{ISEXCEPTION,jdbcType=Integer},
        ISOVERTIME=#{ISOVERTIME,jdbcType=Integer},
        ISEXISTSUBPROC=#{ISEXISTSUBPROC,jdbcType=Integer},
        COSTTTIME=#{COSTTTIME,jdbcType=BigDecimal},
        EXPIRETIME=#{EXPIRETIME,jdbcType=BigDecimal},
        REMARK=#{REMARK,jdbcType=String},
        IOBD=#{IOBD,jdbcType=String},
        IOR=#{IOR,jdbcType=String},
        IOS=#{IOS,jdbcType=String},
        IOC=#{IOC,jdbcType=String},
        EXT1=#{EXT1,jdbcType=String},
        EXT2=#{EXT2,jdbcType=String},
        EXT3=#{EXT3,jdbcType=String},
        REMINDTIMES=#{REMINDTIMES,jdbcType=Integer},
        EXT4=#{EXT4,jdbcType=String},
        EXT5=#{EXT5,jdbcType=String},
        EXT6=#{EXT6,jdbcType=String},
        EXT7=#{EXT7,jdbcType=BigDecimal},
        EXT8=#{EXT8,jdbcType=BigDecimal}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:wfc_process_dto)
        

@Update("""<script>
            UPDATE wfc_process SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="BUSINESSKEY != null">  BUSINESSKEY=#{BUSINESSKEY,jdbcType=String},</if>
        <if test="PROCESSDEFID != null">  PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},</if>
        <if test="PROCESSDEFVERID != null">  PROCESSDEFVERID=#{PROCESSDEFVERID,jdbcType=String},</if>
        <if test="CONTROLSTATE != null">  CONTROLSTATE=#{CONTROLSTATE,jdbcType=String},</if>
        <if test="PROCESSGROUPID != null">  PROCESSGROUPID=#{PROCESSGROUPID,jdbcType=String},</if>
        <if test="PROCESSTITLE != null">  PROCESSTITLE=#{PROCESSTITLE,jdbcType=String},</if>
        <if test="STARTACTIVITYID != null">  STARTACTIVITYID=#{STARTACTIVITYID,jdbcType=String},</if>
        <if test="STARTTASKINSTID != null">  STARTTASKINSTID=#{STARTTASKINSTID,jdbcType=String},</if>
        <if test="STARTTIME != null">  STARTTIME=#{STARTTIME,jdbcType=Timestamp},</if>
        <if test="PROCESSPROFILEID != null">  PROCESSPROFILEID=#{PROCESSPROFILEID,jdbcType=String},</if>
        <if test="PROCESSINSTTYPE != null">  PROCESSINSTTYPE=#{PROCESSINSTTYPE,jdbcType=Integer},</if>
        <if test="PARENTPROCESSINSTID != null">  PARENTPROCESSINSTID=#{PARENTPROCESSINSTID,jdbcType=String},</if>
        <if test="PARENTTASKINSTID != null">  PARENTTASKINSTID=#{PARENTTASKINSTID,jdbcType=String},</if>
        <if test="SECURITYLAYER != null">  SECURITYLAYER=#{SECURITYLAYER,jdbcType=Integer},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="CREATETIME != null">  CREATETIME=#{CREATETIME,jdbcType=Timestamp},</if>
        <if test="CREATEUSERORGID != null">  CREATEUSERORGID=#{CREATEUSERORGID,jdbcType=String},</if>
        <if test="CREATEUSERDEPTID != null">  CREATEUSERDEPTID=#{CREATEUSERDEPTID,jdbcType=String},</if>
        <if test="CREATEUSERROLEID != null">  CREATEUSERROLEID=#{CREATEUSERROLEID,jdbcType=String},</if>
        <if test="CREATEUSERLOCATION != null">  CREATEUSERLOCATION=#{CREATEUSERLOCATION,jdbcType=String},</if>
        <if test="ENDACTIVITYID != null">  ENDACTIVITYID=#{ENDACTIVITYID,jdbcType=String},</if>
        <if test="ENDTIME != null">  ENDTIME=#{ENDTIME,jdbcType=Timestamp},</if>
        <if test="ISPROCESS != null">  ISPROCESS=#{ISPROCESS,jdbcType=Integer},</if>
        <if test="ISSTART != null">  ISSTART=#{ISSTART,jdbcType=Integer},</if>
        <if test="ISEND != null">  ISEND=#{ISEND,jdbcType=Integer},</if>
        <if test="ISASYNC != null">  ISASYNC=#{ISASYNC,jdbcType=Integer},</if>
        <if test="ISEXCEPTION != null">  ISEXCEPTION=#{ISEXCEPTION,jdbcType=Integer},</if>
        <if test="ISOVERTIME != null">  ISOVERTIME=#{ISOVERTIME,jdbcType=Integer},</if>
        <if test="ISEXISTSUBPROC != null">  ISEXISTSUBPROC=#{ISEXISTSUBPROC,jdbcType=Integer},</if>
        <if test="COSTTTIME != null">  COSTTTIME=#{COSTTTIME,jdbcType=BigDecimal},</if>
        <if test="EXPIRETIME != null">  EXPIRETIME=#{EXPIRETIME,jdbcType=BigDecimal},</if>
        <if test="REMARK != null">  REMARK=#{REMARK,jdbcType=String},</if>
        <if test="IOBD != null">  IOBD=#{IOBD,jdbcType=String},</if>
        <if test="IOR != null">  IOR=#{IOR,jdbcType=String},</if>
        <if test="IOS != null">  IOS=#{IOS,jdbcType=String},</if>
        <if test="IOC != null">  IOC=#{IOC,jdbcType=String},</if>
        <if test="EXT1 != null">  EXT1=#{EXT1,jdbcType=String},</if>
        <if test="EXT2 != null">  EXT2=#{EXT2,jdbcType=String},</if>
        <if test="EXT3 != null">  EXT3=#{EXT3,jdbcType=String},</if>
        <if test="REMINDTIMES != null">  REMINDTIMES=#{REMINDTIMES,jdbcType=Integer},</if>
        <if test="EXT4 != null">  EXT4=#{EXT4,jdbcType=String},</if>
        <if test="EXT5 != null">  EXT5=#{EXT5,jdbcType=String},</if>
        <if test="EXT6 != null">  EXT6=#{EXT6,jdbcType=String},</if>
        <if test="EXT7 != null">  EXT7=#{EXT7,jdbcType=BigDecimal},</if>
        <if test="EXT8 != null">  EXT8=#{EXT8,jdbcType=BigDecimal}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:wfc_process_dto)
            

}

        


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
    insert into TStudent
    (ID,BUSINESSKEY,PROCESSDEFID,PROCESSDEFVERID,CONTROLSTATE,PROCESSGROUPID,PROCESSTITLE,STARTACTIVITYID,STARTTASKINSTID,STARTTIME,PROCESSPROFILEID,PROCESSINSTTYPE,PARENTPROCESSINSTID,PARENTTASKINSTID,SECURITYLAYER,CREATEUSER,CREATETIME,CREATEUSERORGID,CREATEUSERDEPTID,CREATEUSERROLEID,CREATEUSERLOCATION,ENDACTIVITYID,ENDTIME,ISPROCESS,ISSTART,ISEND,ISASYNC,ISEXCEPTION,ISOVERTIME,ISEXISTSUBPROC,COSTTTIME,EXPIRETIME,REMARK,IOBD,IOR,IOS,IOC,EXT1,EXT2,EXT3,REMINDTIMES,EXT4,EXT5,EXT6,EXT7,EXT8)
    values
    (#{ID},#{BUSINESSKEY},#{PROCESSDEFID},#{PROCESSDEFVERID},#{CONTROLSTATE},#{PROCESSGROUPID},#{PROCESSTITLE},#{STARTACTIVITYID},#{STARTTASKINSTID},#{STARTTIME},#{PROCESSPROFILEID},#{PROCESSINSTTYPE},#{PARENTPROCESSINSTID},#{PARENTTASKINSTID},#{SECURITYLAYER},#{CREATEUSER},#{CREATETIME},#{CREATEUSERORGID},#{CREATEUSERDEPTID},#{CREATEUSERROLEID},#{CREATEUSERLOCATION},#{ENDACTIVITYID},#{ENDTIME},#{ISPROCESS},#{ISSTART},#{ISEND},#{ISASYNC},#{ISEXCEPTION},#{ISOVERTIME},#{ISEXISTSUBPROC},#{COSTTTIME},#{EXPIRETIME},#{REMARK},#{IOBD},#{IOR},#{IOS},#{IOC},#{EXT1},#{EXT2},#{EXT3},#{REMINDTIMES},#{EXT4},#{EXT5},#{EXT6},#{EXT7},#{EXT8})
</script>""")
fun insert(model:wfc_process_dto):Unit
                

}

        
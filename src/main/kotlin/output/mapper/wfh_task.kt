

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfh_task{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PARENTTASKINSTID", column = "PARENTTASKINSTID"),
   Result(property = "SCOPEID", column = "SCOPEID"),
   Result(property = "ACTIVITYTYPE", column = "ACTIVITYTYPE"),
   Result(property = "ACTIVITYDEFID", column = "ACTIVITYDEFID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "PROCESSDEFVERID", column = "PROCESSDEFVERID"),
   Result(property = "PROCESSGROUPID", column = "PROCESSGROUPID"),
   Result(property = "DISPATCHID", column = "DISPATCHID"),
   Result(property = "TASKTITLE", column = "TASKTITLE"),
   Result(property = "TASKSTATE", column = "TASKSTATE"),
   Result(property = "CONTROLSTATE", column = "CONTROLSTATE"),
   Result(property = "PRIORITY", column = "PRIORITY"),
   Result(property = "OWNER", column = "OWNER"),
   Result(property = "TARGET", column = "TARGET"),
   Result(property = "DELEGATEUSER", column = "DELEGATEUSER"),
   Result(property = "CLAIMTYPE", column = "CLAIMTYPE"),
   Result(property = "CLAIMRESOURCEID", column = "CLAIMRESOURCEID"),
   Result(property = "DUETIME", column = "DUETIME"),
   Result(property = "BEGINTIME", column = "BEGINTIME"),
   Result(property = "BEGINENGINENODE", column = "BEGINENGINENODE"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "ENDENGINENODE", column = "ENDENGINENODE"),
   Result(property = "READTIME", column = "READTIME"),
   Result(property = "READSTATE", column = "READSTATE"),
   Result(property = "OWNERDEPTID", column = "OWNERDEPTID"),
   Result(property = "TARGETDEPTID", column = "TARGETDEPTID"),
   Result(property = "TARGETCOMPANYID", column = "TARGETCOMPANYID"),
   Result(property = "TARGETROLEID", column = "TARGETROLEID"),
   Result(property = "ISMONITOR", column = "ISMONITOR"),
   Result(property = "ISASYNC", column = "ISASYNC"),
   Result(property = "EXCEPTIONERR", column = "EXCEPTIONERR"),
   Result(property = "IOBD", column = "IOBD"),
   Result(property = "IOR", column = "IOR"),
   Result(property = "IOS", column = "IOS"),
   Result(property = "IOC", column = "IOC"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "ISUNDO", column = "ISUNDO"),
   Result(property = "COSTTTIME", column = "COSTTTIME"),
   Result(property = "EXPIRETIME", column = "EXPIRETIME"),
   Result(property = "REMINDTIMES", column = "REMINDTIMES"),
   Result(property = "DELAYTIMES", column = "DELAYTIMES"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "EXT6", column = "EXT6"),
   Result(property = "EXT7", column = "EXT7"),
   Result(property = "EXT8", column = "EXT8"),
   Result(property = "SECURITYLEVEL", column = "SECURITYLEVEL")
)
@Select("""<script>
   SELECT * FROM wfh_task
</script>""")
fun GetListAll():ArrayList<wfh_task_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PARENTTASKINSTID", column = "PARENTTASKINSTID"),
   Result(property = "SCOPEID", column = "SCOPEID"),
   Result(property = "ACTIVITYTYPE", column = "ACTIVITYTYPE"),
   Result(property = "ACTIVITYDEFID", column = "ACTIVITYDEFID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "PROCESSDEFVERID", column = "PROCESSDEFVERID"),
   Result(property = "PROCESSGROUPID", column = "PROCESSGROUPID"),
   Result(property = "DISPATCHID", column = "DISPATCHID"),
   Result(property = "TASKTITLE", column = "TASKTITLE"),
   Result(property = "TASKSTATE", column = "TASKSTATE"),
   Result(property = "CONTROLSTATE", column = "CONTROLSTATE"),
   Result(property = "PRIORITY", column = "PRIORITY"),
   Result(property = "OWNER", column = "OWNER"),
   Result(property = "TARGET", column = "TARGET"),
   Result(property = "DELEGATEUSER", column = "DELEGATEUSER"),
   Result(property = "CLAIMTYPE", column = "CLAIMTYPE"),
   Result(property = "CLAIMRESOURCEID", column = "CLAIMRESOURCEID"),
   Result(property = "DUETIME", column = "DUETIME"),
   Result(property = "BEGINTIME", column = "BEGINTIME"),
   Result(property = "BEGINENGINENODE", column = "BEGINENGINENODE"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "ENDENGINENODE", column = "ENDENGINENODE"),
   Result(property = "READTIME", column = "READTIME"),
   Result(property = "READSTATE", column = "READSTATE"),
   Result(property = "OWNERDEPTID", column = "OWNERDEPTID"),
   Result(property = "TARGETDEPTID", column = "TARGETDEPTID"),
   Result(property = "TARGETCOMPANYID", column = "TARGETCOMPANYID"),
   Result(property = "TARGETROLEID", column = "TARGETROLEID"),
   Result(property = "ISMONITOR", column = "ISMONITOR"),
   Result(property = "ISASYNC", column = "ISASYNC"),
   Result(property = "EXCEPTIONERR", column = "EXCEPTIONERR"),
   Result(property = "IOBD", column = "IOBD"),
   Result(property = "IOR", column = "IOR"),
   Result(property = "IOS", column = "IOS"),
   Result(property = "IOC", column = "IOC"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "ISUNDO", column = "ISUNDO"),
   Result(property = "COSTTTIME", column = "COSTTTIME"),
   Result(property = "EXPIRETIME", column = "EXPIRETIME"),
   Result(property = "REMINDTIMES", column = "REMINDTIMES"),
   Result(property = "DELAYTIMES", column = "DELAYTIMES"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "EXT6", column = "EXT6"),
   Result(property = "EXT7", column = "EXT7"),
   Result(property = "EXT8", column = "EXT8"),
   Result(property = "SECURITYLEVEL", column = "SECURITYLEVEL")
)
@Select("""<script>
   SELECT * FROM wfh_task
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="PARENTTASKINSTID!=null">
      PARENTTASKINSTID=#{PARENTTASKINSTID}
   </if> 
   <if test="SCOPEID!=null">
      SCOPEID=#{SCOPEID}
   </if> 
   <if test="ACTIVITYTYPE!=null">
      ACTIVITYTYPE=#{ACTIVITYTYPE}
   </if> 
   <if test="ACTIVITYDEFID!=null">
      ACTIVITYDEFID=#{ACTIVITYDEFID}
   </if> 
   <if test="PROCESSINSTID!=null">
      PROCESSINSTID=#{PROCESSINSTID}
   </if> 
   <if test="PROCESSDEFID!=null">
      PROCESSDEFID=#{PROCESSDEFID}
   </if> 
   <if test="PROCESSDEFVERID!=null">
      PROCESSDEFVERID=#{PROCESSDEFVERID}
   </if> 
   <if test="PROCESSGROUPID!=null">
      PROCESSGROUPID=#{PROCESSGROUPID}
   </if> 
   <if test="DISPATCHID!=null">
      DISPATCHID=#{DISPATCHID}
   </if> 
   <if test="TASKTITLE!=null">
      TASKTITLE=#{TASKTITLE}
   </if> 
   <if test="TASKSTATE!=null">
      TASKSTATE=#{TASKSTATE}
   </if> 
   <if test="CONTROLSTATE!=null">
      CONTROLSTATE=#{CONTROLSTATE}
   </if> 
   <if test="PRIORITY!=null">
      PRIORITY=#{PRIORITY}
   </if> 
   <if test="OWNER!=null">
      OWNER=#{OWNER}
   </if> 
   <if test="TARGET!=null">
      TARGET=#{TARGET}
   </if> 
   <if test="DELEGATEUSER!=null">
      DELEGATEUSER=#{DELEGATEUSER}
   </if> 
   <if test="CLAIMTYPE!=null">
      CLAIMTYPE=#{CLAIMTYPE}
   </if> 
   <if test="CLAIMRESOURCEID!=null">
      CLAIMRESOURCEID=#{CLAIMRESOURCEID}
   </if> 
   <if test="DUETIME!=null">
      DUETIME=#{DUETIME}
   </if> 
   <if test="BEGINTIME!=null">
      BEGINTIME=#{BEGINTIME}
   </if> 
   <if test="BEGINENGINENODE!=null">
      BEGINENGINENODE=#{BEGINENGINENODE}
   </if> 
   <if test="ENDTIME!=null">
      ENDTIME=#{ENDTIME}
   </if> 
   <if test="ENDENGINENODE!=null">
      ENDENGINENODE=#{ENDENGINENODE}
   </if> 
   <if test="READTIME!=null">
      READTIME=#{READTIME}
   </if> 
   <if test="READSTATE!=null">
      READSTATE=#{READSTATE}
   </if> 
   <if test="OWNERDEPTID!=null">
      OWNERDEPTID=#{OWNERDEPTID}
   </if> 
   <if test="TARGETDEPTID!=null">
      TARGETDEPTID=#{TARGETDEPTID}
   </if> 
   <if test="TARGETCOMPANYID!=null">
      TARGETCOMPANYID=#{TARGETCOMPANYID}
   </if> 
   <if test="TARGETROLEID!=null">
      TARGETROLEID=#{TARGETROLEID}
   </if> 
   <if test="ISMONITOR!=null">
      ISMONITOR=#{ISMONITOR}
   </if> 
   <if test="ISASYNC!=null">
      ISASYNC=#{ISASYNC}
   </if> 
   <if test="EXCEPTIONERR!=null">
      EXCEPTIONERR=#{EXCEPTIONERR}
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
   <if test="ISUNDO!=null">
      ISUNDO=#{ISUNDO}
   </if> 
   <if test="COSTTTIME!=null">
      COSTTTIME=#{COSTTTIME}
   </if> 
   <if test="EXPIRETIME!=null">
      EXPIRETIME=#{EXPIRETIME}
   </if> 
   <if test="REMINDTIMES!=null">
      REMINDTIMES=#{REMINDTIMES}
   </if> 
   <if test="DELAYTIMES!=null">
      DELAYTIMES=#{DELAYTIMES}
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
   <if test="SECURITYLEVEL!=null">
      SECURITYLEVEL=#{SECURITYLEVEL}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:wfh_task_dto):ArrayList<wfh_task_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PARENTTASKINSTID", column = "PARENTTASKINSTID"),
   Result(property = "SCOPEID", column = "SCOPEID"),
   Result(property = "ACTIVITYTYPE", column = "ACTIVITYTYPE"),
   Result(property = "ACTIVITYDEFID", column = "ACTIVITYDEFID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "PROCESSDEFVERID", column = "PROCESSDEFVERID"),
   Result(property = "PROCESSGROUPID", column = "PROCESSGROUPID"),
   Result(property = "DISPATCHID", column = "DISPATCHID"),
   Result(property = "TASKTITLE", column = "TASKTITLE"),
   Result(property = "TASKSTATE", column = "TASKSTATE"),
   Result(property = "CONTROLSTATE", column = "CONTROLSTATE"),
   Result(property = "PRIORITY", column = "PRIORITY"),
   Result(property = "OWNER", column = "OWNER"),
   Result(property = "TARGET", column = "TARGET"),
   Result(property = "DELEGATEUSER", column = "DELEGATEUSER"),
   Result(property = "CLAIMTYPE", column = "CLAIMTYPE"),
   Result(property = "CLAIMRESOURCEID", column = "CLAIMRESOURCEID"),
   Result(property = "DUETIME", column = "DUETIME"),
   Result(property = "BEGINTIME", column = "BEGINTIME"),
   Result(property = "BEGINENGINENODE", column = "BEGINENGINENODE"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "ENDENGINENODE", column = "ENDENGINENODE"),
   Result(property = "READTIME", column = "READTIME"),
   Result(property = "READSTATE", column = "READSTATE"),
   Result(property = "OWNERDEPTID", column = "OWNERDEPTID"),
   Result(property = "TARGETDEPTID", column = "TARGETDEPTID"),
   Result(property = "TARGETCOMPANYID", column = "TARGETCOMPANYID"),
   Result(property = "TARGETROLEID", column = "TARGETROLEID"),
   Result(property = "ISMONITOR", column = "ISMONITOR"),
   Result(property = "ISASYNC", column = "ISASYNC"),
   Result(property = "EXCEPTIONERR", column = "EXCEPTIONERR"),
   Result(property = "IOBD", column = "IOBD"),
   Result(property = "IOR", column = "IOR"),
   Result(property = "IOS", column = "IOS"),
   Result(property = "IOC", column = "IOC"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "ISUNDO", column = "ISUNDO"),
   Result(property = "COSTTTIME", column = "COSTTTIME"),
   Result(property = "EXPIRETIME", column = "EXPIRETIME"),
   Result(property = "REMINDTIMES", column = "REMINDTIMES"),
   Result(property = "DELAYTIMES", column = "DELAYTIMES"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "EXT6", column = "EXT6"),
   Result(property = "EXT7", column = "EXT7"),
   Result(property = "EXT8", column = "EXT8"),
   Result(property = "SECURITYLEVEL", column = "SECURITYLEVEL")
)
@Select("""<script>
   SELECT * FROM wfh_task
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:wfh_task_dto):wfh_task_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,PARENTTASKINSTID,SCOPEID,ACTIVITYTYPE,ACTIVITYDEFID,PROCESSINSTID,PROCESSDEFID,PROCESSDEFVERID,PROCESSGROUPID,DISPATCHID,TASKTITLE,TASKSTATE,CONTROLSTATE,PRIORITY,OWNER,TARGET,DELEGATEUSER,CLAIMTYPE,CLAIMRESOURCEID,DUETIME,BEGINTIME,BEGINENGINENODE,ENDTIME,ENDENGINENODE,READTIME,READSTATE,OWNERDEPTID,TARGETDEPTID,TARGETCOMPANYID,TARGETROLEID,ISMONITOR,ISASYNC,EXCEPTIONERR,IOBD,IOR,IOS,IOC,EXT1,EXT2,EXT3,ISUNDO,COSTTTIME,EXPIRETIME,REMINDTIMES,DELAYTIMES,EXT4,EXT5,EXT6,EXT7,EXT8,SECURITYLEVEL)
    values
    (#{ID},#{PARENTTASKINSTID},#{SCOPEID},#{ACTIVITYTYPE},#{ACTIVITYDEFID},#{PROCESSINSTID},#{PROCESSDEFID},#{PROCESSDEFVERID},#{PROCESSGROUPID},#{DISPATCHID},#{TASKTITLE},#{TASKSTATE},#{CONTROLSTATE},#{PRIORITY},#{OWNER},#{TARGET},#{DELEGATEUSER},#{CLAIMTYPE},#{CLAIMRESOURCEID},#{DUETIME},#{BEGINTIME},#{BEGINENGINENODE},#{ENDTIME},#{ENDENGINENODE},#{READTIME},#{READSTATE},#{OWNERDEPTID},#{TARGETDEPTID},#{TARGETCOMPANYID},#{TARGETROLEID},#{ISMONITOR},#{ISASYNC},#{EXCEPTIONERR},#{IOBD},#{IOR},#{IOS},#{IOC},#{EXT1},#{EXT2},#{EXT3},#{ISUNDO},#{COSTTTIME},#{EXPIRETIME},#{REMINDTIMES},#{DELAYTIMES},#{EXT4},#{EXT5},#{EXT6},#{EXT7},#{EXT8},#{SECURITYLEVEL})
</script>""")
fun insert(model:wfh_task_dto):Unit
                

}

        
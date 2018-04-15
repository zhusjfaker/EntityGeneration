

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfc_task{


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
   Result(property = "CLAIMTYPE", column = "CLAIMTYPE"),
   Result(property = "CLAIMRESOURCEID", column = "CLAIMRESOURCEID"),
   Result(property = "DUETIME", column = "DUETIME"),
   Result(property = "BEGINTIME", column = "BEGINTIME"),
   Result(property = "BEGINENGINENODE", column = "BEGINENGINENODE"),
   Result(property = "READTIME", column = "READTIME"),
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
   Result(property = "REMINDTIMES", column = "REMINDTIMES"),
   Result(property = "DELAYTIMES", column = "DELAYTIMES"),
   Result(property = "READSTATE", column = "READSTATE"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "EXT6", column = "EXT6"),
   Result(property = "EXT7", column = "EXT7"),
   Result(property = "EXT8", column = "EXT8"),
   Result(property = "SECURITYLEVEL", column = "SECURITYLEVEL")
)
@Select("""<script>
   SELECT * FROM wfc_task
</script>""")
fun GetListAll():ArrayList<wfc_task_dto>
        


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
   Result(property = "CLAIMTYPE", column = "CLAIMTYPE"),
   Result(property = "CLAIMRESOURCEID", column = "CLAIMRESOURCEID"),
   Result(property = "DUETIME", column = "DUETIME"),
   Result(property = "BEGINTIME", column = "BEGINTIME"),
   Result(property = "BEGINENGINENODE", column = "BEGINENGINENODE"),
   Result(property = "READTIME", column = "READTIME"),
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
   Result(property = "REMINDTIMES", column = "REMINDTIMES"),
   Result(property = "DELAYTIMES", column = "DELAYTIMES"),
   Result(property = "READSTATE", column = "READSTATE"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "EXT6", column = "EXT6"),
   Result(property = "EXT7", column = "EXT7"),
   Result(property = "EXT8", column = "EXT8"),
   Result(property = "SECURITYLEVEL", column = "SECURITYLEVEL")
)
@Select("""<script>
   SELECT * FROM wfc_task
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
   <if test="READTIME!=null">
      READTIME=#{READTIME}
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
   <if test="REMINDTIMES!=null">
      REMINDTIMES=#{REMINDTIMES}
   </if> 
   <if test="DELAYTIMES!=null">
      DELAYTIMES=#{DELAYTIMES}
   </if> 
   <if test="READSTATE!=null">
      READSTATE=#{READSTATE}
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
fun ConditionalQuery(model:wfc_task_dto):ArrayList<wfc_task_dto>
                


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
   Result(property = "CLAIMTYPE", column = "CLAIMTYPE"),
   Result(property = "CLAIMRESOURCEID", column = "CLAIMRESOURCEID"),
   Result(property = "DUETIME", column = "DUETIME"),
   Result(property = "BEGINTIME", column = "BEGINTIME"),
   Result(property = "BEGINENGINENODE", column = "BEGINENGINENODE"),
   Result(property = "READTIME", column = "READTIME"),
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
   Result(property = "REMINDTIMES", column = "REMINDTIMES"),
   Result(property = "DELAYTIMES", column = "DELAYTIMES"),
   Result(property = "READSTATE", column = "READSTATE"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "EXT6", column = "EXT6"),
   Result(property = "EXT7", column = "EXT7"),
   Result(property = "EXT8", column = "EXT8"),
   Result(property = "SECURITYLEVEL", column = "SECURITYLEVEL")
)
@Select("""<script>
   SELECT * FROM wfc_task
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:wfc_task_dto):wfc_task_dto?
                


@Insert("""<script>
    insert into wfc_task
    (ID,PARENTTASKINSTID,SCOPEID,ACTIVITYTYPE,ACTIVITYDEFID,PROCESSINSTID,PROCESSDEFID,PROCESSDEFVERID,PROCESSGROUPID,DISPATCHID,TASKTITLE,TASKSTATE,CONTROLSTATE,PRIORITY,OWNER,TARGET,CLAIMTYPE,CLAIMRESOURCEID,DUETIME,BEGINTIME,BEGINENGINENODE,READTIME,OWNERDEPTID,TARGETDEPTID,TARGETCOMPANYID,TARGETROLEID,ISMONITOR,ISASYNC,EXCEPTIONERR,IOBD,IOR,IOS,IOC,EXT1,EXT2,EXT3,REMINDTIMES,DELAYTIMES,READSTATE,EXT4,EXT5,EXT6,EXT7,EXT8,SECURITYLEVEL)
    values
    (#{ID},#{PARENTTASKINSTID},#{SCOPEID},#{ACTIVITYTYPE},#{ACTIVITYDEFID},#{PROCESSINSTID},#{PROCESSDEFID},#{PROCESSDEFVERID},#{PROCESSGROUPID},#{DISPATCHID},#{TASKTITLE},#{TASKSTATE},#{CONTROLSTATE},#{PRIORITY},#{OWNER},#{TARGET},#{CLAIMTYPE},#{CLAIMRESOURCEID},#{DUETIME},#{BEGINTIME},#{BEGINENGINENODE},#{READTIME},#{OWNERDEPTID},#{TARGETDEPTID},#{TARGETCOMPANYID},#{TARGETROLEID},#{ISMONITOR},#{ISASYNC},#{EXCEPTIONERR},#{IOBD},#{IOR},#{IOS},#{IOC},#{EXT1},#{EXT2},#{EXT3},#{REMINDTIMES},#{DELAYTIMES},#{READSTATE},#{EXT4},#{EXT5},#{EXT6},#{EXT7},#{EXT8},#{SECURITYLEVEL})
</script>""")
fun Insert(model:wfc_task_dto):Unit
                


@Insert("""<script>
    insert into wfc_task
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='PARENTTASKINSTID!= null'> 
           PARENTTASKINSTID,
        </if>
        <if test='SCOPEID!= null'> 
           SCOPEID,
        </if>
        <if test='ACTIVITYTYPE!= null'> 
           ACTIVITYTYPE,
        </if>
        <if test='ACTIVITYDEFID!= null'> 
           ACTIVITYDEFID,
        </if>
        <if test='PROCESSINSTID!= null'> 
           PROCESSINSTID,
        </if>
        <if test='PROCESSDEFID!= null'> 
           PROCESSDEFID,
        </if>
        <if test='PROCESSDEFVERID!= null'> 
           PROCESSDEFVERID,
        </if>
        <if test='PROCESSGROUPID!= null'> 
           PROCESSGROUPID,
        </if>
        <if test='DISPATCHID!= null'> 
           DISPATCHID,
        </if>
        <if test='TASKTITLE!= null'> 
           TASKTITLE,
        </if>
        <if test='TASKSTATE!= null'> 
           TASKSTATE,
        </if>
        <if test='CONTROLSTATE!= null'> 
           CONTROLSTATE,
        </if>
        <if test='PRIORITY!= null'> 
           PRIORITY,
        </if>
        <if test='OWNER!= null'> 
           OWNER,
        </if>
        <if test='TARGET!= null'> 
           TARGET,
        </if>
        <if test='CLAIMTYPE!= null'> 
           CLAIMTYPE,
        </if>
        <if test='CLAIMRESOURCEID!= null'> 
           CLAIMRESOURCEID,
        </if>
        <if test='DUETIME!= null'> 
           DUETIME,
        </if>
        <if test='BEGINTIME!= null'> 
           BEGINTIME,
        </if>
        <if test='BEGINENGINENODE!= null'> 
           BEGINENGINENODE,
        </if>
        <if test='READTIME!= null'> 
           READTIME,
        </if>
        <if test='OWNERDEPTID!= null'> 
           OWNERDEPTID,
        </if>
        <if test='TARGETDEPTID!= null'> 
           TARGETDEPTID,
        </if>
        <if test='TARGETCOMPANYID!= null'> 
           TARGETCOMPANYID,
        </if>
        <if test='TARGETROLEID!= null'> 
           TARGETROLEID,
        </if>
        <if test='ISMONITOR!= null'> 
           ISMONITOR,
        </if>
        <if test='ISASYNC!= null'> 
           ISASYNC,
        </if>
        <if test='EXCEPTIONERR!= null'> 
           EXCEPTIONERR,
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
        <if test='DELAYTIMES!= null'> 
           DELAYTIMES,
        </if>
        <if test='READSTATE!= null'> 
           READSTATE,
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
           EXT8,
        </if>
        <if test='SECURITYLEVEL!= null'> 
           SECURITYLEVEL
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='PARENTTASKINSTID!= null'> 
           #{PARENTTASKINSTID,jdbcType=char}，
        </if>
        <if test='SCOPEID!= null'> 
           #{SCOPEID,jdbcType=char}，
        </if>
        <if test='ACTIVITYTYPE!= null'> 
           #{ACTIVITYTYPE,jdbcType=varchar}，
        </if>
        <if test='ACTIVITYDEFID!= null'> 
           #{ACTIVITYDEFID,jdbcType=char}，
        </if>
        <if test='PROCESSINSTID!= null'> 
           #{PROCESSINSTID,jdbcType=char}，
        </if>
        <if test='PROCESSDEFID!= null'> 
           #{PROCESSDEFID,jdbcType=char}，
        </if>
        <if test='PROCESSDEFVERID!= null'> 
           #{PROCESSDEFVERID,jdbcType=char}，
        </if>
        <if test='PROCESSGROUPID!= null'> 
           #{PROCESSGROUPID,jdbcType=char}，
        </if>
        <if test='DISPATCHID!= null'> 
           #{DISPATCHID,jdbcType=char}，
        </if>
        <if test='TASKTITLE!= null'> 
           #{TASKTITLE,jdbcType=varchar}，
        </if>
        <if test='TASKSTATE!= null'> 
           #{TASKSTATE,jdbcType=smallint}，
        </if>
        <if test='CONTROLSTATE!= null'> 
           #{CONTROLSTATE,jdbcType=varchar}，
        </if>
        <if test='PRIORITY!= null'> 
           #{PRIORITY,jdbcType=smallint}，
        </if>
        <if test='OWNER!= null'> 
           #{OWNER,jdbcType=varchar}，
        </if>
        <if test='TARGET!= null'> 
           #{TARGET,jdbcType=varchar}，
        </if>
        <if test='CLAIMTYPE!= null'> 
           #{CLAIMTYPE,jdbcType=smallint}，
        </if>
        <if test='CLAIMRESOURCEID!= null'> 
           #{CLAIMRESOURCEID,jdbcType=varchar}，
        </if>
        <if test='DUETIME!= null'> 
           #{DUETIME,jdbcType=datetime}，
        </if>
        <if test='BEGINTIME!= null'> 
           #{BEGINTIME,jdbcType=datetime}，
        </if>
        <if test='BEGINENGINENODE!= null'> 
           #{BEGINENGINENODE,jdbcType=varchar}，
        </if>
        <if test='READTIME!= null'> 
           #{READTIME,jdbcType=datetime}，
        </if>
        <if test='OWNERDEPTID!= null'> 
           #{OWNERDEPTID,jdbcType=varchar}，
        </if>
        <if test='TARGETDEPTID!= null'> 
           #{TARGETDEPTID,jdbcType=varchar}，
        </if>
        <if test='TARGETCOMPANYID!= null'> 
           #{TARGETCOMPANYID,jdbcType=varchar}，
        </if>
        <if test='TARGETROLEID!= null'> 
           #{TARGETROLEID,jdbcType=varchar}，
        </if>
        <if test='ISMONITOR!= null'> 
           #{ISMONITOR,jdbcType=smallint}，
        </if>
        <if test='ISASYNC!= null'> 
           #{ISASYNC,jdbcType=smallint}，
        </if>
        <if test='EXCEPTIONERR!= null'> 
           #{EXCEPTIONERR,jdbcType=varchar}，
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
        <if test='DELAYTIMES!= null'> 
           #{DELAYTIMES,jdbcType=decimal}，
        </if>
        <if test='READSTATE!= null'> 
           #{READSTATE,jdbcType=smallint}，
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
           #{EXT8,jdbcType=decimal}，
        </if>
        <if test='SECURITYLEVEL!= null'> 
           #{SECURITYLEVEL,jdbcType=smallint}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:wfc_task_dto):Unit
                


@Delete("DELETE FROM wfc_task WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE wfc_task SET
        ID=#{ID,jdbcType=String},
        PARENTTASKINSTID=#{PARENTTASKINSTID,jdbcType=String},
        SCOPEID=#{SCOPEID,jdbcType=String},
        ACTIVITYTYPE=#{ACTIVITYTYPE,jdbcType=String},
        ACTIVITYDEFID=#{ACTIVITYDEFID,jdbcType=String},
        PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},
        PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},
        PROCESSDEFVERID=#{PROCESSDEFVERID,jdbcType=String},
        PROCESSGROUPID=#{PROCESSGROUPID,jdbcType=String},
        DISPATCHID=#{DISPATCHID,jdbcType=String},
        TASKTITLE=#{TASKTITLE,jdbcType=String},
        TASKSTATE=#{TASKSTATE,jdbcType=Integer},
        CONTROLSTATE=#{CONTROLSTATE,jdbcType=String},
        PRIORITY=#{PRIORITY,jdbcType=Integer},
        OWNER=#{OWNER,jdbcType=String},
        TARGET=#{TARGET,jdbcType=String},
        CLAIMTYPE=#{CLAIMTYPE,jdbcType=Integer},
        CLAIMRESOURCEID=#{CLAIMRESOURCEID,jdbcType=String},
        DUETIME=#{DUETIME,jdbcType=Timestamp},
        BEGINTIME=#{BEGINTIME,jdbcType=Timestamp},
        BEGINENGINENODE=#{BEGINENGINENODE,jdbcType=String},
        READTIME=#{READTIME,jdbcType=Timestamp},
        OWNERDEPTID=#{OWNERDEPTID,jdbcType=String},
        TARGETDEPTID=#{TARGETDEPTID,jdbcType=String},
        TARGETCOMPANYID=#{TARGETCOMPANYID,jdbcType=String},
        TARGETROLEID=#{TARGETROLEID,jdbcType=String},
        ISMONITOR=#{ISMONITOR,jdbcType=Integer},
        ISASYNC=#{ISASYNC,jdbcType=Integer},
        EXCEPTIONERR=#{EXCEPTIONERR,jdbcType=String},
        IOBD=#{IOBD,jdbcType=String},
        IOR=#{IOR,jdbcType=String},
        IOS=#{IOS,jdbcType=String},
        IOC=#{IOC,jdbcType=String},
        EXT1=#{EXT1,jdbcType=String},
        EXT2=#{EXT2,jdbcType=String},
        EXT3=#{EXT3,jdbcType=String},
        REMINDTIMES=#{REMINDTIMES,jdbcType=Integer},
        DELAYTIMES=#{DELAYTIMES,jdbcType=BigDecimal},
        READSTATE=#{READSTATE,jdbcType=Integer},
        EXT4=#{EXT4,jdbcType=String},
        EXT5=#{EXT5,jdbcType=String},
        EXT6=#{EXT6,jdbcType=String},
        EXT7=#{EXT7,jdbcType=BigDecimal},
        EXT8=#{EXT8,jdbcType=BigDecimal},
        SECURITYLEVEL=#{SECURITYLEVEL,jdbcType=Integer}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:wfc_task_dto)
        

@Update("""<script>
            UPDATE wfc_task SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="PARENTTASKINSTID != null">  PARENTTASKINSTID=#{PARENTTASKINSTID,jdbcType=String},</if>
        <if test="SCOPEID != null">  SCOPEID=#{SCOPEID,jdbcType=String},</if>
        <if test="ACTIVITYTYPE != null">  ACTIVITYTYPE=#{ACTIVITYTYPE,jdbcType=String},</if>
        <if test="ACTIVITYDEFID != null">  ACTIVITYDEFID=#{ACTIVITYDEFID,jdbcType=String},</if>
        <if test="PROCESSINSTID != null">  PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},</if>
        <if test="PROCESSDEFID != null">  PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},</if>
        <if test="PROCESSDEFVERID != null">  PROCESSDEFVERID=#{PROCESSDEFVERID,jdbcType=String},</if>
        <if test="PROCESSGROUPID != null">  PROCESSGROUPID=#{PROCESSGROUPID,jdbcType=String},</if>
        <if test="DISPATCHID != null">  DISPATCHID=#{DISPATCHID,jdbcType=String},</if>
        <if test="TASKTITLE != null">  TASKTITLE=#{TASKTITLE,jdbcType=String},</if>
        <if test="TASKSTATE != null">  TASKSTATE=#{TASKSTATE,jdbcType=Integer},</if>
        <if test="CONTROLSTATE != null">  CONTROLSTATE=#{CONTROLSTATE,jdbcType=String},</if>
        <if test="PRIORITY != null">  PRIORITY=#{PRIORITY,jdbcType=Integer},</if>
        <if test="OWNER != null">  OWNER=#{OWNER,jdbcType=String},</if>
        <if test="TARGET != null">  TARGET=#{TARGET,jdbcType=String},</if>
        <if test="CLAIMTYPE != null">  CLAIMTYPE=#{CLAIMTYPE,jdbcType=Integer},</if>
        <if test="CLAIMRESOURCEID != null">  CLAIMRESOURCEID=#{CLAIMRESOURCEID,jdbcType=String},</if>
        <if test="DUETIME != null">  DUETIME=#{DUETIME,jdbcType=Timestamp},</if>
        <if test="BEGINTIME != null">  BEGINTIME=#{BEGINTIME,jdbcType=Timestamp},</if>
        <if test="BEGINENGINENODE != null">  BEGINENGINENODE=#{BEGINENGINENODE,jdbcType=String},</if>
        <if test="READTIME != null">  READTIME=#{READTIME,jdbcType=Timestamp},</if>
        <if test="OWNERDEPTID != null">  OWNERDEPTID=#{OWNERDEPTID,jdbcType=String},</if>
        <if test="TARGETDEPTID != null">  TARGETDEPTID=#{TARGETDEPTID,jdbcType=String},</if>
        <if test="TARGETCOMPANYID != null">  TARGETCOMPANYID=#{TARGETCOMPANYID,jdbcType=String},</if>
        <if test="TARGETROLEID != null">  TARGETROLEID=#{TARGETROLEID,jdbcType=String},</if>
        <if test="ISMONITOR != null">  ISMONITOR=#{ISMONITOR,jdbcType=Integer},</if>
        <if test="ISASYNC != null">  ISASYNC=#{ISASYNC,jdbcType=Integer},</if>
        <if test="EXCEPTIONERR != null">  EXCEPTIONERR=#{EXCEPTIONERR,jdbcType=String},</if>
        <if test="IOBD != null">  IOBD=#{IOBD,jdbcType=String},</if>
        <if test="IOR != null">  IOR=#{IOR,jdbcType=String},</if>
        <if test="IOS != null">  IOS=#{IOS,jdbcType=String},</if>
        <if test="IOC != null">  IOC=#{IOC,jdbcType=String},</if>
        <if test="EXT1 != null">  EXT1=#{EXT1,jdbcType=String},</if>
        <if test="EXT2 != null">  EXT2=#{EXT2,jdbcType=String},</if>
        <if test="EXT3 != null">  EXT3=#{EXT3,jdbcType=String},</if>
        <if test="REMINDTIMES != null">  REMINDTIMES=#{REMINDTIMES,jdbcType=Integer},</if>
        <if test="DELAYTIMES != null">  DELAYTIMES=#{DELAYTIMES,jdbcType=BigDecimal},</if>
        <if test="READSTATE != null">  READSTATE=#{READSTATE,jdbcType=Integer},</if>
        <if test="EXT4 != null">  EXT4=#{EXT4,jdbcType=String},</if>
        <if test="EXT5 != null">  EXT5=#{EXT5,jdbcType=String},</if>
        <if test="EXT6 != null">  EXT6=#{EXT6,jdbcType=String},</if>
        <if test="EXT7 != null">  EXT7=#{EXT7,jdbcType=BigDecimal},</if>
        <if test="EXT8 != null">  EXT8=#{EXT8,jdbcType=BigDecimal},</if>
        <if test="SECURITYLEVEL != null">  SECURITYLEVEL=#{SECURITYLEVEL,jdbcType=Integer}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:wfc_task_dto)
            

}

        
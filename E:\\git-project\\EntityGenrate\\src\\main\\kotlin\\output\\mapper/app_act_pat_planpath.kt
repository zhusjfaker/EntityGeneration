

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_pat_planpath{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PLANPATHTYPE", column = "PLANPATHTYPE"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "PLANID", column = "PLANID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "PROCESSTITLE", column = "PROCESSTITLE"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "PROCESSCREATEUSER", column = "PROCESSCREATEUSER"),
   Result(property = "NODEID", column = "NODEID"),
   Result(property = "TASKTITLE", column = "TASKTITLE"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "OWNER", column = "OWNER"),
   Result(property = "OWNERUSERNAME", column = "OWNERUSERNAME"),
   Result(property = "OWNERDEPTID", column = "OWNERDEPTID"),
   Result(property = "OWNERDEPTNAME", column = "OWNERDEPTNAME"),
   Result(property = "OWNERDEPTFULLNAME", column = "OWNERDEPTFULLNAME"),
   Result(property = "TARGET", column = "TARGET"),
   Result(property = "TARGETUSERNAME", column = "TARGETUSERNAME"),
   Result(property = "TARGETDEPTID", column = "TARGETDEPTID"),
   Result(property = "TARGETDEPTNAME", column = "TARGETDEPTNAME"),
   Result(property = "TARGETDEPTFULLNAME", column = "TARGETDEPTFULLNAME"),
   Result(property = "TARGETROLEID", column = "TARGETROLEID"),
   Result(property = "TARGETROLENAME", column = "TARGETROLENAME"),
   Result(property = "SEQNUMBER", column = "SEQNUMBER"),
   Result(property = "EXCEPTIONMSG", column = "EXCEPTIONMSG")
)
@Select("""<script>
   SELECT * FROM app_act_pat_planpath
</script>""")
fun GetListAll():ArrayList<app_act_pat_planpath_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PLANPATHTYPE", column = "PLANPATHTYPE"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "PLANID", column = "PLANID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "PROCESSTITLE", column = "PROCESSTITLE"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "PROCESSCREATEUSER", column = "PROCESSCREATEUSER"),
   Result(property = "NODEID", column = "NODEID"),
   Result(property = "TASKTITLE", column = "TASKTITLE"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "OWNER", column = "OWNER"),
   Result(property = "OWNERUSERNAME", column = "OWNERUSERNAME"),
   Result(property = "OWNERDEPTID", column = "OWNERDEPTID"),
   Result(property = "OWNERDEPTNAME", column = "OWNERDEPTNAME"),
   Result(property = "OWNERDEPTFULLNAME", column = "OWNERDEPTFULLNAME"),
   Result(property = "TARGET", column = "TARGET"),
   Result(property = "TARGETUSERNAME", column = "TARGETUSERNAME"),
   Result(property = "TARGETDEPTID", column = "TARGETDEPTID"),
   Result(property = "TARGETDEPTNAME", column = "TARGETDEPTNAME"),
   Result(property = "TARGETDEPTFULLNAME", column = "TARGETDEPTFULLNAME"),
   Result(property = "TARGETROLEID", column = "TARGETROLEID"),
   Result(property = "TARGETROLENAME", column = "TARGETROLENAME"),
   Result(property = "SEQNUMBER", column = "SEQNUMBER"),
   Result(property = "EXCEPTIONMSG", column = "EXCEPTIONMSG")
)
@Select("""<script>
   SELECT * FROM app_act_pat_planpath
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="PLANPATHTYPE!=null">
      PLANPATHTYPE=#{PLANPATHTYPE}
   </if> 
   <if test="BATCHPLANID!=null">
      BATCHPLANID=#{BATCHPLANID}
   </if> 
   <if test="PLANID!=null">
      PLANID=#{PLANID}
   </if> 
   <if test="PROCESSDEFID!=null">
      PROCESSDEFID=#{PROCESSDEFID}
   </if> 
   <if test="PROCESSTITLE!=null">
      PROCESSTITLE=#{PROCESSTITLE}
   </if> 
   <if test="PROCESSINSTID!=null">
      PROCESSINSTID=#{PROCESSINSTID}
   </if> 
   <if test="PROCESSCREATEUSER!=null">
      PROCESSCREATEUSER=#{PROCESSCREATEUSER}
   </if> 
   <if test="NODEID!=null">
      NODEID=#{NODEID}
   </if> 
   <if test="TASKTITLE!=null">
      TASKTITLE=#{TASKTITLE}
   </if> 
   <if test="TASKINSTID!=null">
      TASKINSTID=#{TASKINSTID}
   </if> 
   <if test="OWNER!=null">
      OWNER=#{OWNER}
   </if> 
   <if test="OWNERUSERNAME!=null">
      OWNERUSERNAME=#{OWNERUSERNAME}
   </if> 
   <if test="OWNERDEPTID!=null">
      OWNERDEPTID=#{OWNERDEPTID}
   </if> 
   <if test="OWNERDEPTNAME!=null">
      OWNERDEPTNAME=#{OWNERDEPTNAME}
   </if> 
   <if test="OWNERDEPTFULLNAME!=null">
      OWNERDEPTFULLNAME=#{OWNERDEPTFULLNAME}
   </if> 
   <if test="TARGET!=null">
      TARGET=#{TARGET}
   </if> 
   <if test="TARGETUSERNAME!=null">
      TARGETUSERNAME=#{TARGETUSERNAME}
   </if> 
   <if test="TARGETDEPTID!=null">
      TARGETDEPTID=#{TARGETDEPTID}
   </if> 
   <if test="TARGETDEPTNAME!=null">
      TARGETDEPTNAME=#{TARGETDEPTNAME}
   </if> 
   <if test="TARGETDEPTFULLNAME!=null">
      TARGETDEPTFULLNAME=#{TARGETDEPTFULLNAME}
   </if> 
   <if test="TARGETROLEID!=null">
      TARGETROLEID=#{TARGETROLEID}
   </if> 
   <if test="TARGETROLENAME!=null">
      TARGETROLENAME=#{TARGETROLENAME}
   </if> 
   <if test="SEQNUMBER!=null">
      SEQNUMBER=#{SEQNUMBER}
   </if> 
   <if test="EXCEPTIONMSG!=null">
      EXCEPTIONMSG=#{EXCEPTIONMSG}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_pat_planpath_dto):ArrayList<app_act_pat_planpath_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PLANPATHTYPE", column = "PLANPATHTYPE"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "PLANID", column = "PLANID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "PROCESSTITLE", column = "PROCESSTITLE"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "PROCESSCREATEUSER", column = "PROCESSCREATEUSER"),
   Result(property = "NODEID", column = "NODEID"),
   Result(property = "TASKTITLE", column = "TASKTITLE"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "OWNER", column = "OWNER"),
   Result(property = "OWNERUSERNAME", column = "OWNERUSERNAME"),
   Result(property = "OWNERDEPTID", column = "OWNERDEPTID"),
   Result(property = "OWNERDEPTNAME", column = "OWNERDEPTNAME"),
   Result(property = "OWNERDEPTFULLNAME", column = "OWNERDEPTFULLNAME"),
   Result(property = "TARGET", column = "TARGET"),
   Result(property = "TARGETUSERNAME", column = "TARGETUSERNAME"),
   Result(property = "TARGETDEPTID", column = "TARGETDEPTID"),
   Result(property = "TARGETDEPTNAME", column = "TARGETDEPTNAME"),
   Result(property = "TARGETDEPTFULLNAME", column = "TARGETDEPTFULLNAME"),
   Result(property = "TARGETROLEID", column = "TARGETROLEID"),
   Result(property = "TARGETROLENAME", column = "TARGETROLENAME"),
   Result(property = "SEQNUMBER", column = "SEQNUMBER"),
   Result(property = "EXCEPTIONMSG", column = "EXCEPTIONMSG")
)
@Select("""<script>
   SELECT * FROM app_act_pat_planpath
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_pat_planpath_dto):app_act_pat_planpath_dto?
                


@Insert("""<script>
    insert into app_act_pat_planpath
    (ID,PLANPATHTYPE,BATCHPLANID,PLANID,PROCESSDEFID,PROCESSTITLE,PROCESSINSTID,PROCESSCREATEUSER,NODEID,TASKTITLE,TASKINSTID,OWNER,OWNERUSERNAME,OWNERDEPTID,OWNERDEPTNAME,OWNERDEPTFULLNAME,TARGET,TARGETUSERNAME,TARGETDEPTID,TARGETDEPTNAME,TARGETDEPTFULLNAME,TARGETROLEID,TARGETROLENAME,SEQNUMBER,EXCEPTIONMSG)
    values
    (#{ID},#{PLANPATHTYPE},#{BATCHPLANID},#{PLANID},#{PROCESSDEFID},#{PROCESSTITLE},#{PROCESSINSTID},#{PROCESSCREATEUSER},#{NODEID},#{TASKTITLE},#{TASKINSTID},#{OWNER},#{OWNERUSERNAME},#{OWNERDEPTID},#{OWNERDEPTNAME},#{OWNERDEPTFULLNAME},#{TARGET},#{TARGETUSERNAME},#{TARGETDEPTID},#{TARGETDEPTNAME},#{TARGETDEPTFULLNAME},#{TARGETROLEID},#{TARGETROLENAME},#{SEQNUMBER},#{EXCEPTIONMSG})
</script>""")
fun Insert(model:app_act_pat_planpath_dto):Unit
                


@Insert("""<script>
    insert into app_act_pat_planpath
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='PLANPATHTYPE!= null'> 
           PLANPATHTYPE,
        </if>
        <if test='BATCHPLANID!= null'> 
           BATCHPLANID,
        </if>
        <if test='PLANID!= null'> 
           PLANID,
        </if>
        <if test='PROCESSDEFID!= null'> 
           PROCESSDEFID,
        </if>
        <if test='PROCESSTITLE!= null'> 
           PROCESSTITLE,
        </if>
        <if test='PROCESSINSTID!= null'> 
           PROCESSINSTID,
        </if>
        <if test='PROCESSCREATEUSER!= null'> 
           PROCESSCREATEUSER,
        </if>
        <if test='NODEID!= null'> 
           NODEID,
        </if>
        <if test='TASKTITLE!= null'> 
           TASKTITLE,
        </if>
        <if test='TASKINSTID!= null'> 
           TASKINSTID,
        </if>
        <if test='OWNER!= null'> 
           OWNER,
        </if>
        <if test='OWNERUSERNAME!= null'> 
           OWNERUSERNAME,
        </if>
        <if test='OWNERDEPTID!= null'> 
           OWNERDEPTID,
        </if>
        <if test='OWNERDEPTNAME!= null'> 
           OWNERDEPTNAME,
        </if>
        <if test='OWNERDEPTFULLNAME!= null'> 
           OWNERDEPTFULLNAME,
        </if>
        <if test='TARGET!= null'> 
           TARGET,
        </if>
        <if test='TARGETUSERNAME!= null'> 
           TARGETUSERNAME,
        </if>
        <if test='TARGETDEPTID!= null'> 
           TARGETDEPTID,
        </if>
        <if test='TARGETDEPTNAME!= null'> 
           TARGETDEPTNAME,
        </if>
        <if test='TARGETDEPTFULLNAME!= null'> 
           TARGETDEPTFULLNAME,
        </if>
        <if test='TARGETROLEID!= null'> 
           TARGETROLEID,
        </if>
        <if test='TARGETROLENAME!= null'> 
           TARGETROLENAME,
        </if>
        <if test='SEQNUMBER!= null'> 
           SEQNUMBER,
        </if>
        <if test='EXCEPTIONMSG!= null'> 
           EXCEPTIONMSG
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='PLANPATHTYPE!= null'> 
           #{PLANPATHTYPE,jdbcType=varchar}，
        </if>
        <if test='BATCHPLANID!= null'> 
           #{BATCHPLANID,jdbcType=char}，
        </if>
        <if test='PLANID!= null'> 
           #{PLANID,jdbcType=char}，
        </if>
        <if test='PROCESSDEFID!= null'> 
           #{PROCESSDEFID,jdbcType=char}，
        </if>
        <if test='PROCESSTITLE!= null'> 
           #{PROCESSTITLE,jdbcType=varchar}，
        </if>
        <if test='PROCESSINSTID!= null'> 
           #{PROCESSINSTID,jdbcType=char}，
        </if>
        <if test='PROCESSCREATEUSER!= null'> 
           #{PROCESSCREATEUSER,jdbcType=varchar}，
        </if>
        <if test='NODEID!= null'> 
           #{NODEID,jdbcType=char}，
        </if>
        <if test='TASKTITLE!= null'> 
           #{TASKTITLE,jdbcType=varchar}，
        </if>
        <if test='TASKINSTID!= null'> 
           #{TASKINSTID,jdbcType=char}，
        </if>
        <if test='OWNER!= null'> 
           #{OWNER,jdbcType=varchar}，
        </if>
        <if test='OWNERUSERNAME!= null'> 
           #{OWNERUSERNAME,jdbcType=varchar}，
        </if>
        <if test='OWNERDEPTID!= null'> 
           #{OWNERDEPTID,jdbcType=char}，
        </if>
        <if test='OWNERDEPTNAME!= null'> 
           #{OWNERDEPTNAME,jdbcType=varchar}，
        </if>
        <if test='OWNERDEPTFULLNAME!= null'> 
           #{OWNERDEPTFULLNAME,jdbcType=varchar}，
        </if>
        <if test='TARGET!= null'> 
           #{TARGET,jdbcType=varchar}，
        </if>
        <if test='TARGETUSERNAME!= null'> 
           #{TARGETUSERNAME,jdbcType=varchar}，
        </if>
        <if test='TARGETDEPTID!= null'> 
           #{TARGETDEPTID,jdbcType=char}，
        </if>
        <if test='TARGETDEPTNAME!= null'> 
           #{TARGETDEPTNAME,jdbcType=varchar}，
        </if>
        <if test='TARGETDEPTFULLNAME!= null'> 
           #{TARGETDEPTFULLNAME,jdbcType=varchar}，
        </if>
        <if test='TARGETROLEID!= null'> 
           #{TARGETROLEID,jdbcType=char}，
        </if>
        <if test='TARGETROLENAME!= null'> 
           #{TARGETROLENAME,jdbcType=varchar}，
        </if>
        <if test='SEQNUMBER!= null'> 
           #{SEQNUMBER,jdbcType=smallint}，
        </if>
        <if test='EXCEPTIONMSG!= null'> 
           #{EXCEPTIONMSG,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_pat_planpath_dto):Unit
                


@Delete("DELETE FROM app_act_pat_planpath WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE app_act_pat_planpath SET
        ID=#{ID,jdbcType=String},
        PLANPATHTYPE=#{PLANPATHTYPE,jdbcType=String},
        BATCHPLANID=#{BATCHPLANID,jdbcType=String},
        PLANID=#{PLANID,jdbcType=String},
        PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},
        PROCESSTITLE=#{PROCESSTITLE,jdbcType=String},
        PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},
        PROCESSCREATEUSER=#{PROCESSCREATEUSER,jdbcType=String},
        NODEID=#{NODEID,jdbcType=String},
        TASKTITLE=#{TASKTITLE,jdbcType=String},
        TASKINSTID=#{TASKINSTID,jdbcType=String},
        OWNER=#{OWNER,jdbcType=String},
        OWNERUSERNAME=#{OWNERUSERNAME,jdbcType=String},
        OWNERDEPTID=#{OWNERDEPTID,jdbcType=String},
        OWNERDEPTNAME=#{OWNERDEPTNAME,jdbcType=String},
        OWNERDEPTFULLNAME=#{OWNERDEPTFULLNAME,jdbcType=String},
        TARGET=#{TARGET,jdbcType=String},
        TARGETUSERNAME=#{TARGETUSERNAME,jdbcType=String},
        TARGETDEPTID=#{TARGETDEPTID,jdbcType=String},
        TARGETDEPTNAME=#{TARGETDEPTNAME,jdbcType=String},
        TARGETDEPTFULLNAME=#{TARGETDEPTFULLNAME,jdbcType=String},
        TARGETROLEID=#{TARGETROLEID,jdbcType=String},
        TARGETROLENAME=#{TARGETROLENAME,jdbcType=String},
        SEQNUMBER=#{SEQNUMBER,jdbcType=Integer},
        EXCEPTIONMSG=#{EXCEPTIONMSG,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:app_act_pat_planpath_dto)
        

@Update("""<script>
            UPDATE app_act_pat_planpath SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="PLANPATHTYPE != null">  PLANPATHTYPE=#{PLANPATHTYPE,jdbcType=String},</if>
        <if test="BATCHPLANID != null">  BATCHPLANID=#{BATCHPLANID,jdbcType=String},</if>
        <if test="PLANID != null">  PLANID=#{PLANID,jdbcType=String},</if>
        <if test="PROCESSDEFID != null">  PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},</if>
        <if test="PROCESSTITLE != null">  PROCESSTITLE=#{PROCESSTITLE,jdbcType=String},</if>
        <if test="PROCESSINSTID != null">  PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},</if>
        <if test="PROCESSCREATEUSER != null">  PROCESSCREATEUSER=#{PROCESSCREATEUSER,jdbcType=String},</if>
        <if test="NODEID != null">  NODEID=#{NODEID,jdbcType=String},</if>
        <if test="TASKTITLE != null">  TASKTITLE=#{TASKTITLE,jdbcType=String},</if>
        <if test="TASKINSTID != null">  TASKINSTID=#{TASKINSTID,jdbcType=String},</if>
        <if test="OWNER != null">  OWNER=#{OWNER,jdbcType=String},</if>
        <if test="OWNERUSERNAME != null">  OWNERUSERNAME=#{OWNERUSERNAME,jdbcType=String},</if>
        <if test="OWNERDEPTID != null">  OWNERDEPTID=#{OWNERDEPTID,jdbcType=String},</if>
        <if test="OWNERDEPTNAME != null">  OWNERDEPTNAME=#{OWNERDEPTNAME,jdbcType=String},</if>
        <if test="OWNERDEPTFULLNAME != null">  OWNERDEPTFULLNAME=#{OWNERDEPTFULLNAME,jdbcType=String},</if>
        <if test="TARGET != null">  TARGET=#{TARGET,jdbcType=String},</if>
        <if test="TARGETUSERNAME != null">  TARGETUSERNAME=#{TARGETUSERNAME,jdbcType=String},</if>
        <if test="TARGETDEPTID != null">  TARGETDEPTID=#{TARGETDEPTID,jdbcType=String},</if>
        <if test="TARGETDEPTNAME != null">  TARGETDEPTNAME=#{TARGETDEPTNAME,jdbcType=String},</if>
        <if test="TARGETDEPTFULLNAME != null">  TARGETDEPTFULLNAME=#{TARGETDEPTFULLNAME,jdbcType=String},</if>
        <if test="TARGETROLEID != null">  TARGETROLEID=#{TARGETROLEID,jdbcType=String},</if>
        <if test="TARGETROLENAME != null">  TARGETROLENAME=#{TARGETROLENAME,jdbcType=String},</if>
        <if test="SEQNUMBER != null">  SEQNUMBER=#{SEQNUMBER,jdbcType=Integer},</if>
        <if test="EXCEPTIONMSG != null">  EXCEPTIONMSG=#{EXCEPTIONMSG,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:app_act_pat_planpath_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_pat_planpath{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PLANPATHTYPE", column = "PLANPATHTYPE"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "PLANID", column = "PLANID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "PROCESSTITLE", column = "PROCESSTITLE"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "PROCESSCREATEUSER", column = "PROCESSCREATEUSER"),
   Result(property = "NODEID", column = "NODEID"),
   Result(property = "TASKTITLE", column = "TASKTITLE"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "OWNER", column = "OWNER"),
   Result(property = "OWNERUSERNAME", column = "OWNERUSERNAME"),
   Result(property = "OWNERDEPTID", column = "OWNERDEPTID"),
   Result(property = "OWNERDEPTNAME", column = "OWNERDEPTNAME"),
   Result(property = "OWNERDEPTFULLNAME", column = "OWNERDEPTFULLNAME"),
   Result(property = "TARGET", column = "TARGET"),
   Result(property = "TARGETUSERNAME", column = "TARGETUSERNAME"),
   Result(property = "TARGETDEPTID", column = "TARGETDEPTID"),
   Result(property = "TARGETDEPTNAME", column = "TARGETDEPTNAME"),
   Result(property = "TARGETDEPTFULLNAME", column = "TARGETDEPTFULLNAME"),
   Result(property = "TARGETROLEID", column = "TARGETROLEID"),
   Result(property = "TARGETROLENAME", column = "TARGETROLENAME"),
   Result(property = "SEQNUMBER", column = "SEQNUMBER"),
   Result(property = "EXCEPTIONMSG", column = "EXCEPTIONMSG")
)
@Select("""<script>
   SELECT * FROM app_act_pat_planpath
</script>""")
fun GetListAll():ArrayList<app_act_pat_planpath_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PLANPATHTYPE", column = "PLANPATHTYPE"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "PLANID", column = "PLANID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "PROCESSTITLE", column = "PROCESSTITLE"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "PROCESSCREATEUSER", column = "PROCESSCREATEUSER"),
   Result(property = "NODEID", column = "NODEID"),
   Result(property = "TASKTITLE", column = "TASKTITLE"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "OWNER", column = "OWNER"),
   Result(property = "OWNERUSERNAME", column = "OWNERUSERNAME"),
   Result(property = "OWNERDEPTID", column = "OWNERDEPTID"),
   Result(property = "OWNERDEPTNAME", column = "OWNERDEPTNAME"),
   Result(property = "OWNERDEPTFULLNAME", column = "OWNERDEPTFULLNAME"),
   Result(property = "TARGET", column = "TARGET"),
   Result(property = "TARGETUSERNAME", column = "TARGETUSERNAME"),
   Result(property = "TARGETDEPTID", column = "TARGETDEPTID"),
   Result(property = "TARGETDEPTNAME", column = "TARGETDEPTNAME"),
   Result(property = "TARGETDEPTFULLNAME", column = "TARGETDEPTFULLNAME"),
   Result(property = "TARGETROLEID", column = "TARGETROLEID"),
   Result(property = "TARGETROLENAME", column = "TARGETROLENAME"),
   Result(property = "SEQNUMBER", column = "SEQNUMBER"),
   Result(property = "EXCEPTIONMSG", column = "EXCEPTIONMSG")
)
@Select("""<script>
   SELECT * FROM app_act_pat_planpath
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="PLANPATHTYPE!=null">
      PLANPATHTYPE=#{PLANPATHTYPE}
   </if> 
   <if test="BATCHPLANID!=null">
      BATCHPLANID=#{BATCHPLANID}
   </if> 
   <if test="PLANID!=null">
      PLANID=#{PLANID}
   </if> 
   <if test="PROCESSDEFID!=null">
      PROCESSDEFID=#{PROCESSDEFID}
   </if> 
   <if test="PROCESSTITLE!=null">
      PROCESSTITLE=#{PROCESSTITLE}
   </if> 
   <if test="PROCESSINSTID!=null">
      PROCESSINSTID=#{PROCESSINSTID}
   </if> 
   <if test="PROCESSCREATEUSER!=null">
      PROCESSCREATEUSER=#{PROCESSCREATEUSER}
   </if> 
   <if test="NODEID!=null">
      NODEID=#{NODEID}
   </if> 
   <if test="TASKTITLE!=null">
      TASKTITLE=#{TASKTITLE}
   </if> 
   <if test="TASKINSTID!=null">
      TASKINSTID=#{TASKINSTID}
   </if> 
   <if test="OWNER!=null">
      OWNER=#{OWNER}
   </if> 
   <if test="OWNERUSERNAME!=null">
      OWNERUSERNAME=#{OWNERUSERNAME}
   </if> 
   <if test="OWNERDEPTID!=null">
      OWNERDEPTID=#{OWNERDEPTID}
   </if> 
   <if test="OWNERDEPTNAME!=null">
      OWNERDEPTNAME=#{OWNERDEPTNAME}
   </if> 
   <if test="OWNERDEPTFULLNAME!=null">
      OWNERDEPTFULLNAME=#{OWNERDEPTFULLNAME}
   </if> 
   <if test="TARGET!=null">
      TARGET=#{TARGET}
   </if> 
   <if test="TARGETUSERNAME!=null">
      TARGETUSERNAME=#{TARGETUSERNAME}
   </if> 
   <if test="TARGETDEPTID!=null">
      TARGETDEPTID=#{TARGETDEPTID}
   </if> 
   <if test="TARGETDEPTNAME!=null">
      TARGETDEPTNAME=#{TARGETDEPTNAME}
   </if> 
   <if test="TARGETDEPTFULLNAME!=null">
      TARGETDEPTFULLNAME=#{TARGETDEPTFULLNAME}
   </if> 
   <if test="TARGETROLEID!=null">
      TARGETROLEID=#{TARGETROLEID}
   </if> 
   <if test="TARGETROLENAME!=null">
      TARGETROLENAME=#{TARGETROLENAME}
   </if> 
   <if test="SEQNUMBER!=null">
      SEQNUMBER=#{SEQNUMBER}
   </if> 
   <if test="EXCEPTIONMSG!=null">
      EXCEPTIONMSG=#{EXCEPTIONMSG}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_pat_planpath_dto):ArrayList<app_act_pat_planpath_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PLANPATHTYPE", column = "PLANPATHTYPE"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "PLANID", column = "PLANID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "PROCESSTITLE", column = "PROCESSTITLE"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "PROCESSCREATEUSER", column = "PROCESSCREATEUSER"),
   Result(property = "NODEID", column = "NODEID"),
   Result(property = "TASKTITLE", column = "TASKTITLE"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "OWNER", column = "OWNER"),
   Result(property = "OWNERUSERNAME", column = "OWNERUSERNAME"),
   Result(property = "OWNERDEPTID", column = "OWNERDEPTID"),
   Result(property = "OWNERDEPTNAME", column = "OWNERDEPTNAME"),
   Result(property = "OWNERDEPTFULLNAME", column = "OWNERDEPTFULLNAME"),
   Result(property = "TARGET", column = "TARGET"),
   Result(property = "TARGETUSERNAME", column = "TARGETUSERNAME"),
   Result(property = "TARGETDEPTID", column = "TARGETDEPTID"),
   Result(property = "TARGETDEPTNAME", column = "TARGETDEPTNAME"),
   Result(property = "TARGETDEPTFULLNAME", column = "TARGETDEPTFULLNAME"),
   Result(property = "TARGETROLEID", column = "TARGETROLEID"),
   Result(property = "TARGETROLENAME", column = "TARGETROLENAME"),
   Result(property = "SEQNUMBER", column = "SEQNUMBER"),
   Result(property = "EXCEPTIONMSG", column = "EXCEPTIONMSG")
)
@Select("""<script>
   SELECT * FROM app_act_pat_planpath
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_pat_planpath_dto):app_act_pat_planpath_dto?
                


@Insert("""<script>
    insert into app_act_pat_planpath
    (ID,PLANPATHTYPE,BATCHPLANID,PLANID,PROCESSDEFID,PROCESSTITLE,PROCESSINSTID,PROCESSCREATEUSER,NODEID,TASKTITLE,TASKINSTID,OWNER,OWNERUSERNAME,OWNERDEPTID,OWNERDEPTNAME,OWNERDEPTFULLNAME,TARGET,TARGETUSERNAME,TARGETDEPTID,TARGETDEPTNAME,TARGETDEPTFULLNAME,TARGETROLEID,TARGETROLENAME,SEQNUMBER,EXCEPTIONMSG)
    values
    (#{ID},#{PLANPATHTYPE},#{BATCHPLANID},#{PLANID},#{PROCESSDEFID},#{PROCESSTITLE},#{PROCESSINSTID},#{PROCESSCREATEUSER},#{NODEID},#{TASKTITLE},#{TASKINSTID},#{OWNER},#{OWNERUSERNAME},#{OWNERDEPTID},#{OWNERDEPTNAME},#{OWNERDEPTFULLNAME},#{TARGET},#{TARGETUSERNAME},#{TARGETDEPTID},#{TARGETDEPTNAME},#{TARGETDEPTFULLNAME},#{TARGETROLEID},#{TARGETROLENAME},#{SEQNUMBER},#{EXCEPTIONMSG})
</script>""")
fun Insert(model:app_act_pat_planpath_dto):Unit
                


@Insert("""<script>
    insert into app_act_pat_planpath
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='PLANPATHTYPE!= null'> 
           PLANPATHTYPE,
        </if>
        <if test='BATCHPLANID!= null'> 
           BATCHPLANID,
        </if>
        <if test='PLANID!= null'> 
           PLANID,
        </if>
        <if test='PROCESSDEFID!= null'> 
           PROCESSDEFID,
        </if>
        <if test='PROCESSTITLE!= null'> 
           PROCESSTITLE,
        </if>
        <if test='PROCESSINSTID!= null'> 
           PROCESSINSTID,
        </if>
        <if test='PROCESSCREATEUSER!= null'> 
           PROCESSCREATEUSER,
        </if>
        <if test='NODEID!= null'> 
           NODEID,
        </if>
        <if test='TASKTITLE!= null'> 
           TASKTITLE,
        </if>
        <if test='TASKINSTID!= null'> 
           TASKINSTID,
        </if>
        <if test='OWNER!= null'> 
           OWNER,
        </if>
        <if test='OWNERUSERNAME!= null'> 
           OWNERUSERNAME,
        </if>
        <if test='OWNERDEPTID!= null'> 
           OWNERDEPTID,
        </if>
        <if test='OWNERDEPTNAME!= null'> 
           OWNERDEPTNAME,
        </if>
        <if test='OWNERDEPTFULLNAME!= null'> 
           OWNERDEPTFULLNAME,
        </if>
        <if test='TARGET!= null'> 
           TARGET,
        </if>
        <if test='TARGETUSERNAME!= null'> 
           TARGETUSERNAME,
        </if>
        <if test='TARGETDEPTID!= null'> 
           TARGETDEPTID,
        </if>
        <if test='TARGETDEPTNAME!= null'> 
           TARGETDEPTNAME,
        </if>
        <if test='TARGETDEPTFULLNAME!= null'> 
           TARGETDEPTFULLNAME,
        </if>
        <if test='TARGETROLEID!= null'> 
           TARGETROLEID,
        </if>
        <if test='TARGETROLENAME!= null'> 
           TARGETROLENAME,
        </if>
        <if test='SEQNUMBER!= null'> 
           SEQNUMBER,
        </if>
        <if test='EXCEPTIONMSG!= null'> 
           EXCEPTIONMSG
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='PLANPATHTYPE!= null'> 
           #{PLANPATHTYPE,jdbcType=varchar}，
        </if>
        <if test='BATCHPLANID!= null'> 
           #{BATCHPLANID,jdbcType=char}，
        </if>
        <if test='PLANID!= null'> 
           #{PLANID,jdbcType=char}，
        </if>
        <if test='PROCESSDEFID!= null'> 
           #{PROCESSDEFID,jdbcType=char}，
        </if>
        <if test='PROCESSTITLE!= null'> 
           #{PROCESSTITLE,jdbcType=varchar}，
        </if>
        <if test='PROCESSINSTID!= null'> 
           #{PROCESSINSTID,jdbcType=char}，
        </if>
        <if test='PROCESSCREATEUSER!= null'> 
           #{PROCESSCREATEUSER,jdbcType=varchar}，
        </if>
        <if test='NODEID!= null'> 
           #{NODEID,jdbcType=char}，
        </if>
        <if test='TASKTITLE!= null'> 
           #{TASKTITLE,jdbcType=varchar}，
        </if>
        <if test='TASKINSTID!= null'> 
           #{TASKINSTID,jdbcType=char}，
        </if>
        <if test='OWNER!= null'> 
           #{OWNER,jdbcType=varchar}，
        </if>
        <if test='OWNERUSERNAME!= null'> 
           #{OWNERUSERNAME,jdbcType=varchar}，
        </if>
        <if test='OWNERDEPTID!= null'> 
           #{OWNERDEPTID,jdbcType=char}，
        </if>
        <if test='OWNERDEPTNAME!= null'> 
           #{OWNERDEPTNAME,jdbcType=varchar}，
        </if>
        <if test='OWNERDEPTFULLNAME!= null'> 
           #{OWNERDEPTFULLNAME,jdbcType=varchar}，
        </if>
        <if test='TARGET!= null'> 
           #{TARGET,jdbcType=varchar}，
        </if>
        <if test='TARGETUSERNAME!= null'> 
           #{TARGETUSERNAME,jdbcType=varchar}，
        </if>
        <if test='TARGETDEPTID!= null'> 
           #{TARGETDEPTID,jdbcType=char}，
        </if>
        <if test='TARGETDEPTNAME!= null'> 
           #{TARGETDEPTNAME,jdbcType=varchar}，
        </if>
        <if test='TARGETDEPTFULLNAME!= null'> 
           #{TARGETDEPTFULLNAME,jdbcType=varchar}，
        </if>
        <if test='TARGETROLEID!= null'> 
           #{TARGETROLEID,jdbcType=char}，
        </if>
        <if test='TARGETROLENAME!= null'> 
           #{TARGETROLENAME,jdbcType=varchar}，
        </if>
        <if test='SEQNUMBER!= null'> 
           #{SEQNUMBER,jdbcType=smallint}，
        </if>
        <if test='EXCEPTIONMSG!= null'> 
           #{EXCEPTIONMSG,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_pat_planpath_dto):Unit
                


@Delete("DELETE FROM app_act_pat_planpath WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE app_act_pat_planpath SET
        ID=#{ID,jdbcType=String},
        PLANPATHTYPE=#{PLANPATHTYPE,jdbcType=String},
        BATCHPLANID=#{BATCHPLANID,jdbcType=String},
        PLANID=#{PLANID,jdbcType=String},
        PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},
        PROCESSTITLE=#{PROCESSTITLE,jdbcType=String},
        PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},
        PROCESSCREATEUSER=#{PROCESSCREATEUSER,jdbcType=String},
        NODEID=#{NODEID,jdbcType=String},
        TASKTITLE=#{TASKTITLE,jdbcType=String},
        TASKINSTID=#{TASKINSTID,jdbcType=String},
        OWNER=#{OWNER,jdbcType=String},
        OWNERUSERNAME=#{OWNERUSERNAME,jdbcType=String},
        OWNERDEPTID=#{OWNERDEPTID,jdbcType=String},
        OWNERDEPTNAME=#{OWNERDEPTNAME,jdbcType=String},
        OWNERDEPTFULLNAME=#{OWNERDEPTFULLNAME,jdbcType=String},
        TARGET=#{TARGET,jdbcType=String},
        TARGETUSERNAME=#{TARGETUSERNAME,jdbcType=String},
        TARGETDEPTID=#{TARGETDEPTID,jdbcType=String},
        TARGETDEPTNAME=#{TARGETDEPTNAME,jdbcType=String},
        TARGETDEPTFULLNAME=#{TARGETDEPTFULLNAME,jdbcType=String},
        TARGETROLEID=#{TARGETROLEID,jdbcType=String},
        TARGETROLENAME=#{TARGETROLENAME,jdbcType=String},
        SEQNUMBER=#{SEQNUMBER,jdbcType=Integer},
        EXCEPTIONMSG=#{EXCEPTIONMSG,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:app_act_pat_planpath_dto)
        

@Update("""<script>
            UPDATE app_act_pat_planpath SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="PLANPATHTYPE != null">  PLANPATHTYPE=#{PLANPATHTYPE,jdbcType=String},</if>
        <if test="BATCHPLANID != null">  BATCHPLANID=#{BATCHPLANID,jdbcType=String},</if>
        <if test="PLANID != null">  PLANID=#{PLANID,jdbcType=String},</if>
        <if test="PROCESSDEFID != null">  PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},</if>
        <if test="PROCESSTITLE != null">  PROCESSTITLE=#{PROCESSTITLE,jdbcType=String},</if>
        <if test="PROCESSINSTID != null">  PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},</if>
        <if test="PROCESSCREATEUSER != null">  PROCESSCREATEUSER=#{PROCESSCREATEUSER,jdbcType=String},</if>
        <if test="NODEID != null">  NODEID=#{NODEID,jdbcType=String},</if>
        <if test="TASKTITLE != null">  TASKTITLE=#{TASKTITLE,jdbcType=String},</if>
        <if test="TASKINSTID != null">  TASKINSTID=#{TASKINSTID,jdbcType=String},</if>
        <if test="OWNER != null">  OWNER=#{OWNER,jdbcType=String},</if>
        <if test="OWNERUSERNAME != null">  OWNERUSERNAME=#{OWNERUSERNAME,jdbcType=String},</if>
        <if test="OWNERDEPTID != null">  OWNERDEPTID=#{OWNERDEPTID,jdbcType=String},</if>
        <if test="OWNERDEPTNAME != null">  OWNERDEPTNAME=#{OWNERDEPTNAME,jdbcType=String},</if>
        <if test="OWNERDEPTFULLNAME != null">  OWNERDEPTFULLNAME=#{OWNERDEPTFULLNAME,jdbcType=String},</if>
        <if test="TARGET != null">  TARGET=#{TARGET,jdbcType=String},</if>
        <if test="TARGETUSERNAME != null">  TARGETUSERNAME=#{TARGETUSERNAME,jdbcType=String},</if>
        <if test="TARGETDEPTID != null">  TARGETDEPTID=#{TARGETDEPTID,jdbcType=String},</if>
        <if test="TARGETDEPTNAME != null">  TARGETDEPTNAME=#{TARGETDEPTNAME,jdbcType=String},</if>
        <if test="TARGETDEPTFULLNAME != null">  TARGETDEPTFULLNAME=#{TARGETDEPTFULLNAME,jdbcType=String},</if>
        <if test="TARGETROLEID != null">  TARGETROLEID=#{TARGETROLEID,jdbcType=String},</if>
        <if test="TARGETROLENAME != null">  TARGETROLENAME=#{TARGETROLENAME,jdbcType=String},</if>
        <if test="SEQNUMBER != null">  SEQNUMBER=#{SEQNUMBER,jdbcType=Integer},</if>
        <if test="EXCEPTIONMSG != null">  EXCEPTIONMSG=#{EXCEPTIONMSG,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:app_act_pat_planpath_dto)
            

}

        
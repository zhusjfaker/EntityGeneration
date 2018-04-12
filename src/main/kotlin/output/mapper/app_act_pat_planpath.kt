

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
    insert into TStudent
    (ID,PLANPATHTYPE,BATCHPLANID,PLANID,PROCESSDEFID,PROCESSTITLE,PROCESSINSTID,PROCESSCREATEUSER,NODEID,TASKTITLE,TASKINSTID,OWNER,OWNERUSERNAME,OWNERDEPTID,OWNERDEPTNAME,OWNERDEPTFULLNAME,TARGET,TARGETUSERNAME,TARGETDEPTID,TARGETDEPTNAME,TARGETDEPTFULLNAME,TARGETROLEID,TARGETROLENAME,SEQNUMBER,EXCEPTIONMSG)
    values
    (#{ID},#{PLANPATHTYPE},#{BATCHPLANID},#{PLANID},#{PROCESSDEFID},#{PROCESSTITLE},#{PROCESSINSTID},#{PROCESSCREATEUSER},#{NODEID},#{TASKTITLE},#{TASKINSTID},#{OWNER},#{OWNERUSERNAME},#{OWNERDEPTID},#{OWNERDEPTNAME},#{OWNERDEPTFULLNAME},#{TARGET},#{TARGETUSERNAME},#{TARGETDEPTID},#{TARGETDEPTNAME},#{TARGETDEPTFULLNAME},#{TARGETROLEID},#{TARGETROLENAME},#{SEQNUMBER},#{EXCEPTIONMSG})
</script>""")
fun insert(model:app_act_pat_planpath_dto):Unit
                

}

        
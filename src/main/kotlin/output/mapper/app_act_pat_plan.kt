

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_pat_plan{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "PLANNAME", column = "PLANNAME"),
   Result(property = "STARTUSER", column = "STARTUSER"),
   Result(property = "STARTUSERDEPTID", column = "STARTUSERDEPTID"),
   Result(property = "STARTUSERROLEID", column = "STARTUSERROLEID"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "PLANSTATUS", column = "PLANSTATUS"),
   Result(property = "ENDSTYLE", column = "ENDSTYLE"),
   Result(property = "STARTTIME", column = "STARTTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "PLANID", column = "PLANID"),
   Result(property = "SEQNUMBER", column = "SEQNUMBER"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ROWINDEX", column = "ROWINDEX")
)
@Select("""<script>
   SELECT * FROM app_act_pat_plan
</script>""")
fun GetListAll():ArrayList<app_act_pat_plan_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "PLANNAME", column = "PLANNAME"),
   Result(property = "STARTUSER", column = "STARTUSER"),
   Result(property = "STARTUSERDEPTID", column = "STARTUSERDEPTID"),
   Result(property = "STARTUSERROLEID", column = "STARTUSERROLEID"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "PLANSTATUS", column = "PLANSTATUS"),
   Result(property = "ENDSTYLE", column = "ENDSTYLE"),
   Result(property = "STARTTIME", column = "STARTTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "PLANID", column = "PLANID"),
   Result(property = "SEQNUMBER", column = "SEQNUMBER"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ROWINDEX", column = "ROWINDEX")
)
@Select("""<script>
   SELECT * FROM app_act_pat_plan
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="BATCHPLANID!=null">
      BATCHPLANID=#{BATCHPLANID}
   </if> 
   <if test="PLANNAME!=null">
      PLANNAME=#{PLANNAME}
   </if> 
   <if test="STARTUSER!=null">
      STARTUSER=#{STARTUSER}
   </if> 
   <if test="STARTUSERDEPTID!=null">
      STARTUSERDEPTID=#{STARTUSERDEPTID}
   </if> 
   <if test="STARTUSERROLEID!=null">
      STARTUSERROLEID=#{STARTUSERROLEID}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="PLANSTATUS!=null">
      PLANSTATUS=#{PLANSTATUS}
   </if> 
   <if test="ENDSTYLE!=null">
      ENDSTYLE=#{ENDSTYLE}
   </if> 
   <if test="STARTTIME!=null">
      STARTTIME=#{STARTTIME}
   </if> 
   <if test="ENDTIME!=null">
      ENDTIME=#{ENDTIME}
   </if> 
   <if test="PLANID!=null">
      PLANID=#{PLANID}
   </if> 
   <if test="SEQNUMBER!=null">
      SEQNUMBER=#{SEQNUMBER}
   </if> 
   <if test="PROCESSINSTID!=null">
      PROCESSINSTID=#{PROCESSINSTID}
   </if> 
   <if test="PROCESSDEFID!=null">
      PROCESSDEFID=#{PROCESSDEFID}
   </if> 
   <if test="ROWINDEX!=null">
      ROWINDEX=#{ROWINDEX}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_pat_plan_dto):ArrayList<app_act_pat_plan_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "PLANNAME", column = "PLANNAME"),
   Result(property = "STARTUSER", column = "STARTUSER"),
   Result(property = "STARTUSERDEPTID", column = "STARTUSERDEPTID"),
   Result(property = "STARTUSERROLEID", column = "STARTUSERROLEID"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "PLANSTATUS", column = "PLANSTATUS"),
   Result(property = "ENDSTYLE", column = "ENDSTYLE"),
   Result(property = "STARTTIME", column = "STARTTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "PLANID", column = "PLANID"),
   Result(property = "SEQNUMBER", column = "SEQNUMBER"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ROWINDEX", column = "ROWINDEX")
)
@Select("""<script>
   SELECT * FROM app_act_pat_plan
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_pat_plan_dto):app_act_pat_plan_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,BATCHPLANID,PLANNAME,STARTUSER,STARTUSERDEPTID,STARTUSERROLEID,CREATETIME,CREATEUSER,PLANSTATUS,ENDSTYLE,STARTTIME,ENDTIME,PLANID,SEQNUMBER,PROCESSINSTID,PROCESSDEFID,ROWINDEX)
    values
    (#{ID},#{BATCHPLANID},#{PLANNAME},#{STARTUSER},#{STARTUSERDEPTID},#{STARTUSERROLEID},#{CREATETIME},#{CREATEUSER},#{PLANSTATUS},#{ENDSTYLE},#{STARTTIME},#{ENDTIME},#{PLANID},#{SEQNUMBER},#{PROCESSINSTID},#{PROCESSDEFID},#{ROWINDEX})
</script>""")
fun insert(model:app_act_pat_plan_dto):Unit
                

}

        
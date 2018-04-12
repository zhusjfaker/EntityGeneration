

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_pat_batchplan{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BATCHPLANNAME", column = "BATCHPLANNAME"),
   Result(property = "TESTCASEID", column = "TESTCASEID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "BATCHPLANSTATUS", column = "BATCHPLANSTATUS"),
   Result(property = "ENDSTYLE", column = "ENDSTYLE"),
   Result(property = "TESTUSER", column = "TESTUSER"),
   Result(property = "STARTTIME", column = "STARTTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID")
)
@Select("""<script>
   SELECT * FROM app_act_pat_batchplan
</script>""")
fun GetListAll():ArrayList<app_act_pat_batchplan_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BATCHPLANNAME", column = "BATCHPLANNAME"),
   Result(property = "TESTCASEID", column = "TESTCASEID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "BATCHPLANSTATUS", column = "BATCHPLANSTATUS"),
   Result(property = "ENDSTYLE", column = "ENDSTYLE"),
   Result(property = "TESTUSER", column = "TESTUSER"),
   Result(property = "STARTTIME", column = "STARTTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID")
)
@Select("""<script>
   SELECT * FROM app_act_pat_batchplan
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="BATCHPLANNAME!=null">
      BATCHPLANNAME=#{BATCHPLANNAME}
   </if> 
   <if test="TESTCASEID!=null">
      TESTCASEID=#{TESTCASEID}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   <if test="BATCHPLANSTATUS!=null">
      BATCHPLANSTATUS=#{BATCHPLANSTATUS}
   </if> 
   <if test="ENDSTYLE!=null">
      ENDSTYLE=#{ENDSTYLE}
   </if> 
   <if test="TESTUSER!=null">
      TESTUSER=#{TESTUSER}
   </if> 
   <if test="STARTTIME!=null">
      STARTTIME=#{STARTTIME}
   </if> 
   <if test="ENDTIME!=null">
      ENDTIME=#{ENDTIME}
   </if> 
   <if test="BATCHPLANID!=null">
      BATCHPLANID=#{BATCHPLANID}
   </if> 
   <if test="PROCESSDEFID!=null">
      PROCESSDEFID=#{PROCESSDEFID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_pat_batchplan_dto):ArrayList<app_act_pat_batchplan_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BATCHPLANNAME", column = "BATCHPLANNAME"),
   Result(property = "TESTCASEID", column = "TESTCASEID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "BATCHPLANSTATUS", column = "BATCHPLANSTATUS"),
   Result(property = "ENDSTYLE", column = "ENDSTYLE"),
   Result(property = "TESTUSER", column = "TESTUSER"),
   Result(property = "STARTTIME", column = "STARTTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID")
)
@Select("""<script>
   SELECT * FROM app_act_pat_batchplan
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_pat_batchplan_dto):app_act_pat_batchplan_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,BATCHPLANNAME,TESTCASEID,CREATEUSER,CREATETIME,BATCHPLANSTATUS,ENDSTYLE,TESTUSER,STARTTIME,ENDTIME,BATCHPLANID,PROCESSDEFID)
    values
    (#{ID},#{BATCHPLANNAME},#{TESTCASEID},#{CREATEUSER},#{CREATETIME},#{BATCHPLANSTATUS},#{ENDSTYLE},#{TESTUSER},#{STARTTIME},#{ENDTIME},#{BATCHPLANID},#{PROCESSDEFID})
</script>""")
fun insert(model:app_act_pat_batchplan_dto):Unit
                

}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_output_task{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TEAMID", column = "TEAMID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "PROFILEID", column = "PROFILEID"),
   Result(property = "TASKNAME", column = "TASKNAME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "BEGINTIME", column = "BEGINTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "TASKSTATE", column = "TASKSTATE"),
   Result(property = "THREADID", column = "THREADID"),
   Result(property = "LANG", column = "LANG")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_output_task
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_output_task_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TEAMID", column = "TEAMID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "PROFILEID", column = "PROFILEID"),
   Result(property = "TASKNAME", column = "TASKNAME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "BEGINTIME", column = "BEGINTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "TASKSTATE", column = "TASKSTATE"),
   Result(property = "THREADID", column = "THREADID"),
   Result(property = "LANG", column = "LANG")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_output_task
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="TEAMID!=null">
      TEAMID=#{TEAMID}
   </if> 
   <if test="WSID!=null">
      WSID=#{WSID}
   </if> 
   <if test="PROFILEID!=null">
      PROFILEID=#{PROFILEID}
   </if> 
   <if test="TASKNAME!=null">
      TASKNAME=#{TASKNAME}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   <if test="BEGINTIME!=null">
      BEGINTIME=#{BEGINTIME}
   </if> 
   <if test="ENDTIME!=null">
      ENDTIME=#{ENDTIME}
   </if> 
   <if test="TASKSTATE!=null">
      TASKSTATE=#{TASKSTATE}
   </if> 
   <if test="THREADID!=null">
      THREADID=#{THREADID}
   </if> 
   <if test="LANG!=null">
      LANG=#{LANG}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_output_task_dto):ArrayList<sys_coe_pal_output_task_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TEAMID", column = "TEAMID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "PROFILEID", column = "PROFILEID"),
   Result(property = "TASKNAME", column = "TASKNAME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "BEGINTIME", column = "BEGINTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "TASKSTATE", column = "TASKSTATE"),
   Result(property = "THREADID", column = "THREADID"),
   Result(property = "LANG", column = "LANG")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_output_task
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_output_task_dto):sys_coe_pal_output_task_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,TEAMID,WSID,PROFILEID,TASKNAME,USERID,CREATETIME,BEGINTIME,ENDTIME,TASKSTATE,THREADID,LANG)
    values
    (#{ID},#{TEAMID},#{WSID},#{PROFILEID},#{TASKNAME},#{USERID},#{CREATETIME},#{BEGINTIME},#{ENDTIME},#{TASKSTATE},#{THREADID},#{LANG})
</script>""")
fun insert(model:sys_coe_pal_output_task_dto):Unit
                

}

        
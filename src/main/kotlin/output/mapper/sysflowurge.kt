

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sysflowurge{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BIND_ID", column = "BIND_ID"),
   Result(property = "STEP_NO", column = "STEP_NO"),
   Result(property = "STEP_TONO", column = "STEP_TONO"),
   Result(property = "URGE_CONTENT", column = "URGE_CONTENT"),
   Result(property = "ARCHIVES", column = "ARCHIVES"),
   Result(property = "ISDISPLAY", column = "ISDISPLAY"),
   Result(property = "FLOW_ID", column = "FLOW_ID")
)
@Select("""<script>
   SELECT * FROM sysflowurge
</script>""")
fun GetListAll():ArrayList<sysflowurge_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BIND_ID", column = "BIND_ID"),
   Result(property = "STEP_NO", column = "STEP_NO"),
   Result(property = "STEP_TONO", column = "STEP_TONO"),
   Result(property = "URGE_CONTENT", column = "URGE_CONTENT"),
   Result(property = "ARCHIVES", column = "ARCHIVES"),
   Result(property = "ISDISPLAY", column = "ISDISPLAY"),
   Result(property = "FLOW_ID", column = "FLOW_ID")
)
@Select("""<script>
   SELECT * FROM sysflowurge
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="BIND_ID!=null">
      BIND_ID=#{BIND_ID}
   </if> 
   <if test="STEP_NO!=null">
      STEP_NO=#{STEP_NO}
   </if> 
   <if test="STEP_TONO!=null">
      STEP_TONO=#{STEP_TONO}
   </if> 
   <if test="URGE_CONTENT!=null">
      URGE_CONTENT=#{URGE_CONTENT}
   </if> 
   <if test="ARCHIVES!=null">
      ARCHIVES=#{ARCHIVES}
   </if> 
   <if test="ISDISPLAY!=null">
      ISDISPLAY=#{ISDISPLAY}
   </if> 
   <if test="FLOW_ID!=null">
      FLOW_ID=#{FLOW_ID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sysflowurge_dto):ArrayList<sysflowurge_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BIND_ID", column = "BIND_ID"),
   Result(property = "STEP_NO", column = "STEP_NO"),
   Result(property = "STEP_TONO", column = "STEP_TONO"),
   Result(property = "URGE_CONTENT", column = "URGE_CONTENT"),
   Result(property = "ARCHIVES", column = "ARCHIVES"),
   Result(property = "ISDISPLAY", column = "ISDISPLAY"),
   Result(property = "FLOW_ID", column = "FLOW_ID")
)
@Select("""<script>
   SELECT * FROM sysflowurge
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sysflowurge_dto):sysflowurge_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,BIND_ID,STEP_NO,STEP_TONO,URGE_CONTENT,ARCHIVES,ISDISPLAY,FLOW_ID)
    values
    (#{ID},#{BIND_ID},#{STEP_NO},#{STEP_TONO},#{URGE_CONTENT},#{ARCHIVES},#{ISDISPLAY},#{FLOW_ID})
</script>""")
fun insert(model:sysflowurge_dto):Unit
                

}

        
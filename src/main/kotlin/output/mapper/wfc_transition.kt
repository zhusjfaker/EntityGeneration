

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfc_transition{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "SOURCEDEFID", column = "SOURCEDEFID"),
   Result(property = "SOURCETYPE", column = "SOURCETYPE"),
   Result(property = "SEQUENCEFLOWDEFID", column = "SEQUENCEFLOWDEFID"),
   Result(property = "TARGETDEFID", column = "TARGETDEFID"),
   Result(property = "TARGETTYPE", column = "TARGETTYPE"),
   Result(property = "ISACTIVE", column = "ISACTIVE"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM wfc_transition
</script>""")
fun GetListAll():ArrayList<wfc_transition_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "SOURCEDEFID", column = "SOURCEDEFID"),
   Result(property = "SOURCETYPE", column = "SOURCETYPE"),
   Result(property = "SEQUENCEFLOWDEFID", column = "SEQUENCEFLOWDEFID"),
   Result(property = "TARGETDEFID", column = "TARGETDEFID"),
   Result(property = "TARGETTYPE", column = "TARGETTYPE"),
   Result(property = "ISACTIVE", column = "ISACTIVE"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM wfc_transition
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="PROCESSINSTID!=null">
      PROCESSINSTID=#{PROCESSINSTID}
   </if> 
   <if test="TASKINSTID!=null">
      TASKINSTID=#{TASKINSTID}
   </if> 
   <if test="PROCESSDEFID!=null">
      PROCESSDEFID=#{PROCESSDEFID}
   </if> 
   <if test="SOURCEDEFID!=null">
      SOURCEDEFID=#{SOURCEDEFID}
   </if> 
   <if test="SOURCETYPE!=null">
      SOURCETYPE=#{SOURCETYPE}
   </if> 
   <if test="SEQUENCEFLOWDEFID!=null">
      SEQUENCEFLOWDEFID=#{SEQUENCEFLOWDEFID}
   </if> 
   <if test="TARGETDEFID!=null">
      TARGETDEFID=#{TARGETDEFID}
   </if> 
   <if test="TARGETTYPE!=null">
      TARGETTYPE=#{TARGETTYPE}
   </if> 
   <if test="ISACTIVE!=null">
      ISACTIVE=#{ISACTIVE}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:wfc_transition_dto):ArrayList<wfc_transition_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "SOURCEDEFID", column = "SOURCEDEFID"),
   Result(property = "SOURCETYPE", column = "SOURCETYPE"),
   Result(property = "SEQUENCEFLOWDEFID", column = "SEQUENCEFLOWDEFID"),
   Result(property = "TARGETDEFID", column = "TARGETDEFID"),
   Result(property = "TARGETTYPE", column = "TARGETTYPE"),
   Result(property = "ISACTIVE", column = "ISACTIVE"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM wfc_transition
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:wfc_transition_dto):wfc_transition_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,PROCESSINSTID,TASKINSTID,PROCESSDEFID,SOURCEDEFID,SOURCETYPE,SEQUENCEFLOWDEFID,TARGETDEFID,TARGETTYPE,ISACTIVE,CREATETIME)
    values
    (#{ID},#{PROCESSINSTID},#{TASKINSTID},#{PROCESSDEFID},#{SOURCEDEFID},#{SOURCETYPE},#{SEQUENCEFLOWDEFID},#{TARGETDEFID},#{TARGETTYPE},#{ISACTIVE},#{CREATETIME})
</script>""")
fun insert(model:wfc_transition_dto):Unit
                

}

        
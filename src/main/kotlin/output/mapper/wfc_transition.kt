

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
    insert into wfc_transition
    (ID,PROCESSINSTID,TASKINSTID,PROCESSDEFID,SOURCEDEFID,SOURCETYPE,SEQUENCEFLOWDEFID,TARGETDEFID,TARGETTYPE,ISACTIVE,CREATETIME)
    values
    (#{ID},#{PROCESSINSTID},#{TASKINSTID},#{PROCESSDEFID},#{SOURCEDEFID},#{SOURCETYPE},#{SEQUENCEFLOWDEFID},#{TARGETDEFID},#{TARGETTYPE},#{ISACTIVE},#{CREATETIME})
</script>""")
fun Insert(model:wfc_transition_dto):Unit
                


@Insert("""<script>
    insert into wfc_transition
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='PROCESSINSTID!= null'> 
           PROCESSINSTID,
        </if>
        <if test='TASKINSTID!= null'> 
           TASKINSTID,
        </if>
        <if test='PROCESSDEFID!= null'> 
           PROCESSDEFID,
        </if>
        <if test='SOURCEDEFID!= null'> 
           SOURCEDEFID,
        </if>
        <if test='SOURCETYPE!= null'> 
           SOURCETYPE,
        </if>
        <if test='SEQUENCEFLOWDEFID!= null'> 
           SEQUENCEFLOWDEFID,
        </if>
        <if test='TARGETDEFID!= null'> 
           TARGETDEFID,
        </if>
        <if test='TARGETTYPE!= null'> 
           TARGETTYPE,
        </if>
        <if test='ISACTIVE!= null'> 
           ISACTIVE,
        </if>
        <if test='CREATETIME!= null'> 
           CREATETIME
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='PROCESSINSTID!= null'> 
           #{PROCESSINSTID,jdbcType=char}，
        </if>
        <if test='TASKINSTID!= null'> 
           #{TASKINSTID,jdbcType=char}，
        </if>
        <if test='PROCESSDEFID!= null'> 
           #{PROCESSDEFID,jdbcType=char}，
        </if>
        <if test='SOURCEDEFID!= null'> 
           #{SOURCEDEFID,jdbcType=char}，
        </if>
        <if test='SOURCETYPE!= null'> 
           #{SOURCETYPE,jdbcType=varchar}，
        </if>
        <if test='SEQUENCEFLOWDEFID!= null'> 
           #{SEQUENCEFLOWDEFID,jdbcType=char}，
        </if>
        <if test='TARGETDEFID!= null'> 
           #{TARGETDEFID,jdbcType=char}，
        </if>
        <if test='TARGETTYPE!= null'> 
           #{TARGETTYPE,jdbcType=varchar}，
        </if>
        <if test='ISACTIVE!= null'> 
           #{ISACTIVE,jdbcType=smallint}，
        </if>
        <if test='CREATETIME!= null'> 
           #{CREATETIME,jdbcType=datetime}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:wfc_transition_dto):Unit
                

}

        
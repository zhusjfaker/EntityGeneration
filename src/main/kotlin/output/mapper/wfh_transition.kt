

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfh_transition{


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
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "ENDTIME", column = "ENDTIME")
)
@Select("""<script>
   SELECT * FROM wfh_transition
</script>""")
fun GetListAll():ArrayList<wfh_transition_dto>
        


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
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "ENDTIME", column = "ENDTIME")
)
@Select("""<script>
   SELECT * FROM wfh_transition
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
   <if test="ENDTIME!=null">
      ENDTIME=#{ENDTIME}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:wfh_transition_dto):ArrayList<wfh_transition_dto>
                


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
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "ENDTIME", column = "ENDTIME")
)
@Select("""<script>
   SELECT * FROM wfh_transition
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:wfh_transition_dto):wfh_transition_dto?
                


@Insert("""<script>
    insert into wfh_transition
    (ID,PROCESSINSTID,TASKINSTID,PROCESSDEFID,SOURCEDEFID,SOURCETYPE,SEQUENCEFLOWDEFID,TARGETDEFID,TARGETTYPE,ISACTIVE,CREATETIME,ENDTIME)
    values
    (#{ID},#{PROCESSINSTID},#{TASKINSTID},#{PROCESSDEFID},#{SOURCEDEFID},#{SOURCETYPE},#{SEQUENCEFLOWDEFID},#{TARGETDEFID},#{TARGETTYPE},#{ISACTIVE},#{CREATETIME},#{ENDTIME})
</script>""")
fun Insert(model:wfh_transition_dto):Unit
                


@Insert("""<script>
    insert into wfh_transition
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
           CREATETIME,
        </if>
        <if test='ENDTIME!= null'> 
           ENDTIME
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
           #{CREATETIME,jdbcType=datetime}，
        </if>
        <if test='ENDTIME!= null'> 
           #{ENDTIME,jdbcType=datetime}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:wfh_transition_dto):Unit
                


@Delete("DELETE FROM wfh_transition WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE wfh_transition SET
        ID=#{ID,jdbcType=String},
        PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},
        TASKINSTID=#{TASKINSTID,jdbcType=String},
        PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},
        SOURCEDEFID=#{SOURCEDEFID,jdbcType=String},
        SOURCETYPE=#{SOURCETYPE,jdbcType=String},
        SEQUENCEFLOWDEFID=#{SEQUENCEFLOWDEFID,jdbcType=String},
        TARGETDEFID=#{TARGETDEFID,jdbcType=String},
        TARGETTYPE=#{TARGETTYPE,jdbcType=String},
        ISACTIVE=#{ISACTIVE,jdbcType=Integer},
        CREATETIME=#{CREATETIME,jdbcType=Timestamp},
        ENDTIME=#{ENDTIME,jdbcType=Timestamp}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:wfh_transition_dto)
        

@Update("""<script>
            UPDATE wfh_transition SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="PROCESSINSTID != null">  PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},</if>
        <if test="TASKINSTID != null">  TASKINSTID=#{TASKINSTID,jdbcType=String},</if>
        <if test="PROCESSDEFID != null">  PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},</if>
        <if test="SOURCEDEFID != null">  SOURCEDEFID=#{SOURCEDEFID,jdbcType=String},</if>
        <if test="SOURCETYPE != null">  SOURCETYPE=#{SOURCETYPE,jdbcType=String},</if>
        <if test="SEQUENCEFLOWDEFID != null">  SEQUENCEFLOWDEFID=#{SEQUENCEFLOWDEFID,jdbcType=String},</if>
        <if test="TARGETDEFID != null">  TARGETDEFID=#{TARGETDEFID,jdbcType=String},</if>
        <if test="TARGETTYPE != null">  TARGETTYPE=#{TARGETTYPE,jdbcType=String},</if>
        <if test="ISACTIVE != null">  ISACTIVE=#{ISACTIVE,jdbcType=Integer},</if>
        <if test="CREATETIME != null">  CREATETIME=#{CREATETIME,jdbcType=Timestamp},</if>
        <if test="ENDTIME != null">  ENDTIME=#{ENDTIME,jdbcType=Timestamp}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:wfh_transition_dto)
            

}

        
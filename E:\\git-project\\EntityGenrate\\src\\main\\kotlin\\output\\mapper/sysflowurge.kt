

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
    insert into sysflowurge
    (ID,BIND_ID,STEP_NO,STEP_TONO,URGE_CONTENT,ARCHIVES,ISDISPLAY,FLOW_ID)
    values
    (#{ID},#{BIND_ID},#{STEP_NO},#{STEP_TONO},#{URGE_CONTENT},#{ARCHIVES},#{ISDISPLAY},#{FLOW_ID})
</script>""")
fun Insert(model:sysflowurge_dto):Unit
                


@Insert("""<script>
    insert into sysflowurge
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='BIND_ID!= null'> 
           BIND_ID,
        </if>
        <if test='STEP_NO!= null'> 
           STEP_NO,
        </if>
        <if test='STEP_TONO!= null'> 
           STEP_TONO,
        </if>
        <if test='URGE_CONTENT!= null'> 
           URGE_CONTENT,
        </if>
        <if test='ARCHIVES!= null'> 
           ARCHIVES,
        </if>
        <if test='ISDISPLAY!= null'> 
           ISDISPLAY,
        </if>
        <if test='FLOW_ID!= null'> 
           FLOW_ID
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=decimal}，
        <if test='BIND_ID!= null'> 
           #{BIND_ID,jdbcType=decimal}，
        </if>
        <if test='STEP_NO!= null'> 
           #{STEP_NO,jdbcType=decimal}，
        </if>
        <if test='STEP_TONO!= null'> 
           #{STEP_TONO,jdbcType=decimal}，
        </if>
        <if test='URGE_CONTENT!= null'> 
           #{URGE_CONTENT,jdbcType=text}，
        </if>
        <if test='ARCHIVES!= null'> 
           #{ARCHIVES,jdbcType=text}，
        </if>
        <if test='ISDISPLAY!= null'> 
           #{ISDISPLAY,jdbcType=decimal}，
        </if>
        <if test='FLOW_ID!= null'> 
           #{FLOW_ID,jdbcType=decimal}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sysflowurge_dto):Unit
                


@Delete("DELETE FROM sysflowurge WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:BigDecimal)
        

@Update("""<script>
        UPDATE sysflowurge SET
        ID=#{ID,jdbcType=BigDecimal},
        BIND_ID=#{BIND_ID,jdbcType=BigDecimal},
        STEP_NO=#{STEP_NO,jdbcType=BigDecimal},
        STEP_TONO=#{STEP_TONO,jdbcType=BigDecimal},
        URGE_CONTENT=#{URGE_CONTENT,jdbcType=String},
        ARCHIVES=#{ARCHIVES,jdbcType=String},
        ISDISPLAY=#{ISDISPLAY,jdbcType=BigDecimal},
        FLOW_ID=#{FLOW_ID,jdbcType=BigDecimal}
        WHERE ID=#{ID,jdbcType=BigDecimal}
        </script>""")
fun UpdateByPrimaryKey(model:sysflowurge_dto)
        

@Update("""<script>
            UPDATE sysflowurge SET
            <if test="ID != null">  ID=#{ID,jdbcType=BigDecimal},</if>
        <if test="BIND_ID != null">  BIND_ID=#{BIND_ID,jdbcType=BigDecimal},</if>
        <if test="STEP_NO != null">  STEP_NO=#{STEP_NO,jdbcType=BigDecimal},</if>
        <if test="STEP_TONO != null">  STEP_TONO=#{STEP_TONO,jdbcType=BigDecimal},</if>
        <if test="URGE_CONTENT != null">  URGE_CONTENT=#{URGE_CONTENT,jdbcType=String},</if>
        <if test="ARCHIVES != null">  ARCHIVES=#{ARCHIVES,jdbcType=String},</if>
        <if test="ISDISPLAY != null">  ISDISPLAY=#{ISDISPLAY,jdbcType=BigDecimal},</if>
        <if test="FLOW_ID != null">  FLOW_ID=#{FLOW_ID,jdbcType=BigDecimal}
              WHERE ID=#{ID,jdbcType=BigDecimal}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sysflowurge_dto)
            

}

        

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
    insert into sysflowurge
    (ID,BIND_ID,STEP_NO,STEP_TONO,URGE_CONTENT,ARCHIVES,ISDISPLAY,FLOW_ID)
    values
    (#{ID},#{BIND_ID},#{STEP_NO},#{STEP_TONO},#{URGE_CONTENT},#{ARCHIVES},#{ISDISPLAY},#{FLOW_ID})
</script>""")
fun Insert(model:sysflowurge_dto):Unit
                


@Insert("""<script>
    insert into sysflowurge
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='BIND_ID!= null'> 
           BIND_ID,
        </if>
        <if test='STEP_NO!= null'> 
           STEP_NO,
        </if>
        <if test='STEP_TONO!= null'> 
           STEP_TONO,
        </if>
        <if test='URGE_CONTENT!= null'> 
           URGE_CONTENT,
        </if>
        <if test='ARCHIVES!= null'> 
           ARCHIVES,
        </if>
        <if test='ISDISPLAY!= null'> 
           ISDISPLAY,
        </if>
        <if test='FLOW_ID!= null'> 
           FLOW_ID
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=decimal}，
        <if test='BIND_ID!= null'> 
           #{BIND_ID,jdbcType=decimal}，
        </if>
        <if test='STEP_NO!= null'> 
           #{STEP_NO,jdbcType=decimal}，
        </if>
        <if test='STEP_TONO!= null'> 
           #{STEP_TONO,jdbcType=decimal}，
        </if>
        <if test='URGE_CONTENT!= null'> 
           #{URGE_CONTENT,jdbcType=text}，
        </if>
        <if test='ARCHIVES!= null'> 
           #{ARCHIVES,jdbcType=text}，
        </if>
        <if test='ISDISPLAY!= null'> 
           #{ISDISPLAY,jdbcType=decimal}，
        </if>
        <if test='FLOW_ID!= null'> 
           #{FLOW_ID,jdbcType=decimal}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sysflowurge_dto):Unit
                


@Delete("DELETE FROM sysflowurge WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:BigDecimal)
        

@Update("""<script>
        UPDATE sysflowurge SET
        ID=#{ID,jdbcType=BigDecimal},
        BIND_ID=#{BIND_ID,jdbcType=BigDecimal},
        STEP_NO=#{STEP_NO,jdbcType=BigDecimal},
        STEP_TONO=#{STEP_TONO,jdbcType=BigDecimal},
        URGE_CONTENT=#{URGE_CONTENT,jdbcType=String},
        ARCHIVES=#{ARCHIVES,jdbcType=String},
        ISDISPLAY=#{ISDISPLAY,jdbcType=BigDecimal},
        FLOW_ID=#{FLOW_ID,jdbcType=BigDecimal}
        WHERE ID=#{ID,jdbcType=BigDecimal}
        </script>""")
fun UpdateByPrimaryKey(model:sysflowurge_dto)
        

@Update("""<script>
            UPDATE sysflowurge SET
            <if test="ID != null">  ID=#{ID,jdbcType=BigDecimal},</if>
        <if test="BIND_ID != null">  BIND_ID=#{BIND_ID,jdbcType=BigDecimal},</if>
        <if test="STEP_NO != null">  STEP_NO=#{STEP_NO,jdbcType=BigDecimal},</if>
        <if test="STEP_TONO != null">  STEP_TONO=#{STEP_TONO,jdbcType=BigDecimal},</if>
        <if test="URGE_CONTENT != null">  URGE_CONTENT=#{URGE_CONTENT,jdbcType=String},</if>
        <if test="ARCHIVES != null">  ARCHIVES=#{ARCHIVES,jdbcType=String},</if>
        <if test="ISDISPLAY != null">  ISDISPLAY=#{ISDISPLAY,jdbcType=BigDecimal},</if>
        <if test="FLOW_ID != null">  FLOW_ID=#{FLOW_ID,jdbcType=BigDecimal}
              WHERE ID=#{ID,jdbcType=BigDecimal}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sysflowurge_dto)
            

}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_schedule_log{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SCHEDULE_ID", column = "SCHEDULE_ID"),
   Result(property = "EXECUTE_TIME", column = "EXECUTE_TIME"),
   Result(property = "END_TIME", column = "END_TIME"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "LOG_MEMO", column = "LOG_MEMO"),
   Result(property = "EXECUTE_TYPE", column = "EXECUTE_TYPE"),
   Result(property = "LOG_TYPE", column = "LOG_TYPE"),
   Result(property = "LOG_TIME", column = "LOG_TIME"),
   Result(property = "JOB_GROUP", column = "JOB_GROUP")
)
@Select("""<script>
   SELECT * FROM sys_schedule_log
</script>""")
fun GetListAll():ArrayList<sys_schedule_log_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SCHEDULE_ID", column = "SCHEDULE_ID"),
   Result(property = "EXECUTE_TIME", column = "EXECUTE_TIME"),
   Result(property = "END_TIME", column = "END_TIME"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "LOG_MEMO", column = "LOG_MEMO"),
   Result(property = "EXECUTE_TYPE", column = "EXECUTE_TYPE"),
   Result(property = "LOG_TYPE", column = "LOG_TYPE"),
   Result(property = "LOG_TIME", column = "LOG_TIME"),
   Result(property = "JOB_GROUP", column = "JOB_GROUP")
)
@Select("""<script>
   SELECT * FROM sys_schedule_log
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="SCHEDULE_ID!=null">
      SCHEDULE_ID=#{SCHEDULE_ID}
   </if> 
   <if test="EXECUTE_TIME!=null">
      EXECUTE_TIME=#{EXECUTE_TIME}
   </if> 
   <if test="END_TIME!=null">
      END_TIME=#{END_TIME}
   </if> 
   <if test="STATUS!=null">
      STATUS=#{STATUS}
   </if> 
   <if test="LOG_MEMO!=null">
      LOG_MEMO=#{LOG_MEMO}
   </if> 
   <if test="EXECUTE_TYPE!=null">
      EXECUTE_TYPE=#{EXECUTE_TYPE}
   </if> 
   <if test="LOG_TYPE!=null">
      LOG_TYPE=#{LOG_TYPE}
   </if> 
   <if test="LOG_TIME!=null">
      LOG_TIME=#{LOG_TIME}
   </if> 
   <if test="JOB_GROUP!=null">
      JOB_GROUP=#{JOB_GROUP}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_schedule_log_dto):ArrayList<sys_schedule_log_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SCHEDULE_ID", column = "SCHEDULE_ID"),
   Result(property = "EXECUTE_TIME", column = "EXECUTE_TIME"),
   Result(property = "END_TIME", column = "END_TIME"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "LOG_MEMO", column = "LOG_MEMO"),
   Result(property = "EXECUTE_TYPE", column = "EXECUTE_TYPE"),
   Result(property = "LOG_TYPE", column = "LOG_TYPE"),
   Result(property = "LOG_TIME", column = "LOG_TIME"),
   Result(property = "JOB_GROUP", column = "JOB_GROUP")
)
@Select("""<script>
   SELECT * FROM sys_schedule_log
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_schedule_log_dto):sys_schedule_log_dto?
                


@Insert("""<script>
    insert into sys_schedule_log
    (ID,SCHEDULE_ID,EXECUTE_TIME,END_TIME,STATUS,LOG_MEMO,EXECUTE_TYPE,LOG_TYPE,LOG_TIME,JOB_GROUP)
    values
    (#{ID},#{SCHEDULE_ID},#{EXECUTE_TIME},#{END_TIME},#{STATUS},#{LOG_MEMO},#{EXECUTE_TYPE},#{LOG_TYPE},#{LOG_TIME},#{JOB_GROUP})
</script>""")
fun Insert(model:sys_schedule_log_dto):Unit
                


@Insert("""<script>
    insert into sys_schedule_log
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='SCHEDULE_ID!= null'> 
           SCHEDULE_ID,
        </if>
        <if test='EXECUTE_TIME!= null'> 
           EXECUTE_TIME,
        </if>
        <if test='END_TIME!= null'> 
           END_TIME,
        </if>
        <if test='STATUS!= null'> 
           STATUS,
        </if>
        <if test='LOG_MEMO!= null'> 
           LOG_MEMO,
        </if>
        <if test='EXECUTE_TYPE!= null'> 
           EXECUTE_TYPE,
        </if>
        <if test='LOG_TYPE!= null'> 
           LOG_TYPE,
        </if>
        <if test='LOG_TIME!= null'> 
           LOG_TIME,
        </if>
        <if test='JOB_GROUP!= null'> 
           JOB_GROUP
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=decimal}，
        <if test='SCHEDULE_ID!= null'> 
           #{SCHEDULE_ID,jdbcType=varchar}，
        </if>
        <if test='EXECUTE_TIME!= null'> 
           #{EXECUTE_TIME,jdbcType=datetime}，
        </if>
        <if test='END_TIME!= null'> 
           #{END_TIME,jdbcType=datetime}，
        </if>
        <if test='STATUS!= null'> 
           #{STATUS,jdbcType=varchar}，
        </if>
        <if test='LOG_MEMO!= null'> 
           #{LOG_MEMO,jdbcType=text}，
        </if>
        <if test='EXECUTE_TYPE!= null'> 
           #{EXECUTE_TYPE,jdbcType=varchar}，
        </if>
        <if test='LOG_TYPE!= null'> 
           #{LOG_TYPE,jdbcType=varchar}，
        </if>
        <if test='LOG_TIME!= null'> 
           #{LOG_TIME,jdbcType=datetime}，
        </if>
        <if test='JOB_GROUP!= null'> 
           #{JOB_GROUP,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_schedule_log_dto):Unit
                


@Delete("DELETE FROM sys_schedule_log WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:BigDecimal)
        

@Update("""<script>
        UPDATE sys_schedule_log SET
        ID=#{ID,jdbcType=BigDecimal},
        SCHEDULE_ID=#{SCHEDULE_ID,jdbcType=String},
        EXECUTE_TIME=#{EXECUTE_TIME,jdbcType=Timestamp},
        END_TIME=#{END_TIME,jdbcType=Timestamp},
        STATUS=#{STATUS,jdbcType=String},
        LOG_MEMO=#{LOG_MEMO,jdbcType=String},
        EXECUTE_TYPE=#{EXECUTE_TYPE,jdbcType=String},
        LOG_TYPE=#{LOG_TYPE,jdbcType=String},
        LOG_TIME=#{LOG_TIME,jdbcType=Timestamp},
        JOB_GROUP=#{JOB_GROUP,jdbcType=String}
        WHERE ID=#{ID,jdbcType=BigDecimal}
        </script>""")
fun UpdateByPrimaryKey(model:sys_schedule_log_dto)
        

@Update("""<script>
            UPDATE sys_schedule_log SET
            <if test="ID != null">  ID=#{ID,jdbcType=BigDecimal},</if>
        <if test="SCHEDULE_ID != null">  SCHEDULE_ID=#{SCHEDULE_ID,jdbcType=String},</if>
        <if test="EXECUTE_TIME != null">  EXECUTE_TIME=#{EXECUTE_TIME,jdbcType=Timestamp},</if>
        <if test="END_TIME != null">  END_TIME=#{END_TIME,jdbcType=Timestamp},</if>
        <if test="STATUS != null">  STATUS=#{STATUS,jdbcType=String},</if>
        <if test="LOG_MEMO != null">  LOG_MEMO=#{LOG_MEMO,jdbcType=String},</if>
        <if test="EXECUTE_TYPE != null">  EXECUTE_TYPE=#{EXECUTE_TYPE,jdbcType=String},</if>
        <if test="LOG_TYPE != null">  LOG_TYPE=#{LOG_TYPE,jdbcType=String},</if>
        <if test="LOG_TIME != null">  LOG_TIME=#{LOG_TIME,jdbcType=Timestamp},</if>
        <if test="JOB_GROUP != null">  JOB_GROUP=#{JOB_GROUP,jdbcType=String}
              WHERE ID=#{ID,jdbcType=BigDecimal}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_schedule_log_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_schedule_log{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SCHEDULE_ID", column = "SCHEDULE_ID"),
   Result(property = "EXECUTE_TIME", column = "EXECUTE_TIME"),
   Result(property = "END_TIME", column = "END_TIME"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "LOG_MEMO", column = "LOG_MEMO"),
   Result(property = "EXECUTE_TYPE", column = "EXECUTE_TYPE"),
   Result(property = "LOG_TYPE", column = "LOG_TYPE"),
   Result(property = "LOG_TIME", column = "LOG_TIME"),
   Result(property = "JOB_GROUP", column = "JOB_GROUP")
)
@Select("""<script>
   SELECT * FROM sys_schedule_log
</script>""")
fun GetListAll():ArrayList<sys_schedule_log_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SCHEDULE_ID", column = "SCHEDULE_ID"),
   Result(property = "EXECUTE_TIME", column = "EXECUTE_TIME"),
   Result(property = "END_TIME", column = "END_TIME"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "LOG_MEMO", column = "LOG_MEMO"),
   Result(property = "EXECUTE_TYPE", column = "EXECUTE_TYPE"),
   Result(property = "LOG_TYPE", column = "LOG_TYPE"),
   Result(property = "LOG_TIME", column = "LOG_TIME"),
   Result(property = "JOB_GROUP", column = "JOB_GROUP")
)
@Select("""<script>
   SELECT * FROM sys_schedule_log
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="SCHEDULE_ID!=null">
      SCHEDULE_ID=#{SCHEDULE_ID}
   </if> 
   <if test="EXECUTE_TIME!=null">
      EXECUTE_TIME=#{EXECUTE_TIME}
   </if> 
   <if test="END_TIME!=null">
      END_TIME=#{END_TIME}
   </if> 
   <if test="STATUS!=null">
      STATUS=#{STATUS}
   </if> 
   <if test="LOG_MEMO!=null">
      LOG_MEMO=#{LOG_MEMO}
   </if> 
   <if test="EXECUTE_TYPE!=null">
      EXECUTE_TYPE=#{EXECUTE_TYPE}
   </if> 
   <if test="LOG_TYPE!=null">
      LOG_TYPE=#{LOG_TYPE}
   </if> 
   <if test="LOG_TIME!=null">
      LOG_TIME=#{LOG_TIME}
   </if> 
   <if test="JOB_GROUP!=null">
      JOB_GROUP=#{JOB_GROUP}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_schedule_log_dto):ArrayList<sys_schedule_log_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SCHEDULE_ID", column = "SCHEDULE_ID"),
   Result(property = "EXECUTE_TIME", column = "EXECUTE_TIME"),
   Result(property = "END_TIME", column = "END_TIME"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "LOG_MEMO", column = "LOG_MEMO"),
   Result(property = "EXECUTE_TYPE", column = "EXECUTE_TYPE"),
   Result(property = "LOG_TYPE", column = "LOG_TYPE"),
   Result(property = "LOG_TIME", column = "LOG_TIME"),
   Result(property = "JOB_GROUP", column = "JOB_GROUP")
)
@Select("""<script>
   SELECT * FROM sys_schedule_log
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_schedule_log_dto):sys_schedule_log_dto?
                


@Insert("""<script>
    insert into sys_schedule_log
    (ID,SCHEDULE_ID,EXECUTE_TIME,END_TIME,STATUS,LOG_MEMO,EXECUTE_TYPE,LOG_TYPE,LOG_TIME,JOB_GROUP)
    values
    (#{ID},#{SCHEDULE_ID},#{EXECUTE_TIME},#{END_TIME},#{STATUS},#{LOG_MEMO},#{EXECUTE_TYPE},#{LOG_TYPE},#{LOG_TIME},#{JOB_GROUP})
</script>""")
fun Insert(model:sys_schedule_log_dto):Unit
                


@Insert("""<script>
    insert into sys_schedule_log
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='SCHEDULE_ID!= null'> 
           SCHEDULE_ID,
        </if>
        <if test='EXECUTE_TIME!= null'> 
           EXECUTE_TIME,
        </if>
        <if test='END_TIME!= null'> 
           END_TIME,
        </if>
        <if test='STATUS!= null'> 
           STATUS,
        </if>
        <if test='LOG_MEMO!= null'> 
           LOG_MEMO,
        </if>
        <if test='EXECUTE_TYPE!= null'> 
           EXECUTE_TYPE,
        </if>
        <if test='LOG_TYPE!= null'> 
           LOG_TYPE,
        </if>
        <if test='LOG_TIME!= null'> 
           LOG_TIME,
        </if>
        <if test='JOB_GROUP!= null'> 
           JOB_GROUP
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=decimal}，
        <if test='SCHEDULE_ID!= null'> 
           #{SCHEDULE_ID,jdbcType=varchar}，
        </if>
        <if test='EXECUTE_TIME!= null'> 
           #{EXECUTE_TIME,jdbcType=datetime}，
        </if>
        <if test='END_TIME!= null'> 
           #{END_TIME,jdbcType=datetime}，
        </if>
        <if test='STATUS!= null'> 
           #{STATUS,jdbcType=varchar}，
        </if>
        <if test='LOG_MEMO!= null'> 
           #{LOG_MEMO,jdbcType=text}，
        </if>
        <if test='EXECUTE_TYPE!= null'> 
           #{EXECUTE_TYPE,jdbcType=varchar}，
        </if>
        <if test='LOG_TYPE!= null'> 
           #{LOG_TYPE,jdbcType=varchar}，
        </if>
        <if test='LOG_TIME!= null'> 
           #{LOG_TIME,jdbcType=datetime}，
        </if>
        <if test='JOB_GROUP!= null'> 
           #{JOB_GROUP,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_schedule_log_dto):Unit
                


@Delete("DELETE FROM sys_schedule_log WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:BigDecimal)
        

@Update("""<script>
        UPDATE sys_schedule_log SET
        ID=#{ID,jdbcType=BigDecimal},
        SCHEDULE_ID=#{SCHEDULE_ID,jdbcType=String},
        EXECUTE_TIME=#{EXECUTE_TIME,jdbcType=Timestamp},
        END_TIME=#{END_TIME,jdbcType=Timestamp},
        STATUS=#{STATUS,jdbcType=String},
        LOG_MEMO=#{LOG_MEMO,jdbcType=String},
        EXECUTE_TYPE=#{EXECUTE_TYPE,jdbcType=String},
        LOG_TYPE=#{LOG_TYPE,jdbcType=String},
        LOG_TIME=#{LOG_TIME,jdbcType=Timestamp},
        JOB_GROUP=#{JOB_GROUP,jdbcType=String}
        WHERE ID=#{ID,jdbcType=BigDecimal}
        </script>""")
fun UpdateByPrimaryKey(model:sys_schedule_log_dto)
        

@Update("""<script>
            UPDATE sys_schedule_log SET
            <if test="ID != null">  ID=#{ID,jdbcType=BigDecimal},</if>
        <if test="SCHEDULE_ID != null">  SCHEDULE_ID=#{SCHEDULE_ID,jdbcType=String},</if>
        <if test="EXECUTE_TIME != null">  EXECUTE_TIME=#{EXECUTE_TIME,jdbcType=Timestamp},</if>
        <if test="END_TIME != null">  END_TIME=#{END_TIME,jdbcType=Timestamp},</if>
        <if test="STATUS != null">  STATUS=#{STATUS,jdbcType=String},</if>
        <if test="LOG_MEMO != null">  LOG_MEMO=#{LOG_MEMO,jdbcType=String},</if>
        <if test="EXECUTE_TYPE != null">  EXECUTE_TYPE=#{EXECUTE_TYPE,jdbcType=String},</if>
        <if test="LOG_TYPE != null">  LOG_TYPE=#{LOG_TYPE,jdbcType=String},</if>
        <if test="LOG_TIME != null">  LOG_TIME=#{LOG_TIME,jdbcType=Timestamp},</if>
        <if test="JOB_GROUP != null">  JOB_GROUP=#{JOB_GROUP,jdbcType=String}
              WHERE ID=#{ID,jdbcType=BigDecimal}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_schedule_log_dto)
            

}

        
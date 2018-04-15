

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface qrtz_blob_triggers{


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "TRIGGER_NAME", column = "TRIGGER_NAME"),
   Result(property = "TRIGGER_GROUP", column = "TRIGGER_GROUP"),
   Result(property = "BLOB_DATA", column = "BLOB_DATA")
)
@Select("""<script>
   SELECT * FROM qrtz_blob_triggers
</script>""")
fun GetListAll():ArrayList<qrtz_blob_triggers_dto>
        


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "TRIGGER_NAME", column = "TRIGGER_NAME"),
   Result(property = "TRIGGER_GROUP", column = "TRIGGER_GROUP"),
   Result(property = "BLOB_DATA", column = "BLOB_DATA")
)
@Select("""<script>
   SELECT * FROM qrtz_blob_triggers
   <where>
   <if test="SCHED_NAME!=null">
      SCHED_NAME=#{SCHED_NAME}
   </if> 
   <if test="TRIGGER_NAME!=null">
      TRIGGER_NAME=#{TRIGGER_NAME}
   </if> 
   <if test="TRIGGER_GROUP!=null">
      TRIGGER_GROUP=#{TRIGGER_GROUP}
   </if> 
   <if test="BLOB_DATA!=null">
      BLOB_DATA=#{BLOB_DATA}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:qrtz_blob_triggers_dto):ArrayList<qrtz_blob_triggers_dto>
                


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "TRIGGER_NAME", column = "TRIGGER_NAME"),
   Result(property = "TRIGGER_GROUP", column = "TRIGGER_GROUP"),
   Result(property = "BLOB_DATA", column = "BLOB_DATA")
)
@Select("""<script>
   SELECT * FROM qrtz_blob_triggers
   <where>
   <if test="SCHED_NAME!=null">
      SCHED_NAME=#{SCHED_NAME}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:qrtz_blob_triggers_dto):qrtz_blob_triggers_dto?
                


@Insert("""<script>
    insert into qrtz_blob_triggers
    (SCHED_NAME,TRIGGER_NAME,TRIGGER_GROUP,BLOB_DATA)
    values
    (#{SCHED_NAME},#{TRIGGER_NAME},#{TRIGGER_GROUP},#{BLOB_DATA})
</script>""")
fun Insert(model:qrtz_blob_triggers_dto):Unit
                


@Insert("""<script>
    insert into qrtz_blob_triggers
    <trim prefix="(" suffix=")" suffixOverrides="," >
           SCHED_NAME,
           TRIGGER_NAME,
           TRIGGER_GROUP,
        <if test='BLOB_DATA!= null'> 
           BLOB_DATA
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{SCHED_NAME,jdbcType=varchar}，
           #{TRIGGER_NAME,jdbcType=varchar}，
           #{TRIGGER_GROUP,jdbcType=varchar}，
        <if test='BLOB_DATA!= null'> 
           #{BLOB_DATA,jdbcType=blob}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:qrtz_blob_triggers_dto):Unit
                


@Delete("DELETE FROM qrtz_blob_triggers WHERE SCHED_NAME=#{arg0}")
fun DeleteByPrimaryKey(SCHED_NAME:String)
        

@Update("""<script>
        UPDATE qrtz_blob_triggers SET
        SCHED_NAME=#{SCHED_NAME,jdbcType=String},
        TRIGGER_NAME=#{TRIGGER_NAME,jdbcType=String},
        TRIGGER_GROUP=#{TRIGGER_GROUP,jdbcType=String},
        BLOB_DATA=#{BLOB_DATA,jdbcType=ByteArray}
        WHERE SCHED_NAME=#{SCHED_NAME,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:qrtz_blob_triggers_dto)
        

@Update("""<script>
            UPDATE qrtz_blob_triggers SET
            <if test="SCHED_NAME != null">  SCHED_NAME=#{SCHED_NAME,jdbcType=String},</if>
        <if test="TRIGGER_NAME != null">  TRIGGER_NAME=#{TRIGGER_NAME,jdbcType=String},</if>
        <if test="TRIGGER_GROUP != null">  TRIGGER_GROUP=#{TRIGGER_GROUP,jdbcType=String},</if>
        <if test="BLOB_DATA != null">  BLOB_DATA=#{BLOB_DATA,jdbcType=ByteArray}
              WHERE SCHED_NAME=#{SCHED_NAME,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:qrtz_blob_triggers_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface qrtz_blob_triggers{


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "TRIGGER_NAME", column = "TRIGGER_NAME"),
   Result(property = "TRIGGER_GROUP", column = "TRIGGER_GROUP"),
   Result(property = "BLOB_DATA", column = "BLOB_DATA")
)
@Select("""<script>
   SELECT * FROM qrtz_blob_triggers
</script>""")
fun GetListAll():ArrayList<qrtz_blob_triggers_dto>
        


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "TRIGGER_NAME", column = "TRIGGER_NAME"),
   Result(property = "TRIGGER_GROUP", column = "TRIGGER_GROUP"),
   Result(property = "BLOB_DATA", column = "BLOB_DATA")
)
@Select("""<script>
   SELECT * FROM qrtz_blob_triggers
   <where>
   <if test="SCHED_NAME!=null">
      SCHED_NAME=#{SCHED_NAME}
   </if> 
   <if test="TRIGGER_NAME!=null">
      TRIGGER_NAME=#{TRIGGER_NAME}
   </if> 
   <if test="TRIGGER_GROUP!=null">
      TRIGGER_GROUP=#{TRIGGER_GROUP}
   </if> 
   <if test="BLOB_DATA!=null">
      BLOB_DATA=#{BLOB_DATA}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:qrtz_blob_triggers_dto):ArrayList<qrtz_blob_triggers_dto>
                


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "TRIGGER_NAME", column = "TRIGGER_NAME"),
   Result(property = "TRIGGER_GROUP", column = "TRIGGER_GROUP"),
   Result(property = "BLOB_DATA", column = "BLOB_DATA")
)
@Select("""<script>
   SELECT * FROM qrtz_blob_triggers
   <where>
   <if test="SCHED_NAME!=null">
      SCHED_NAME=#{SCHED_NAME}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:qrtz_blob_triggers_dto):qrtz_blob_triggers_dto?
                


@Insert("""<script>
    insert into qrtz_blob_triggers
    (SCHED_NAME,TRIGGER_NAME,TRIGGER_GROUP,BLOB_DATA)
    values
    (#{SCHED_NAME},#{TRIGGER_NAME},#{TRIGGER_GROUP},#{BLOB_DATA})
</script>""")
fun Insert(model:qrtz_blob_triggers_dto):Unit
                


@Insert("""<script>
    insert into qrtz_blob_triggers
    <trim prefix="(" suffix=")" suffixOverrides="," >
           SCHED_NAME,
           TRIGGER_NAME,
           TRIGGER_GROUP,
        <if test='BLOB_DATA!= null'> 
           BLOB_DATA
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{SCHED_NAME,jdbcType=varchar}，
           #{TRIGGER_NAME,jdbcType=varchar}，
           #{TRIGGER_GROUP,jdbcType=varchar}，
        <if test='BLOB_DATA!= null'> 
           #{BLOB_DATA,jdbcType=blob}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:qrtz_blob_triggers_dto):Unit
                


@Delete("DELETE FROM qrtz_blob_triggers WHERE SCHED_NAME=#{arg0}")
fun DeleteByPrimaryKey(SCHED_NAME:String)
        

@Update("""<script>
        UPDATE qrtz_blob_triggers SET
        SCHED_NAME=#{SCHED_NAME,jdbcType=String},
        TRIGGER_NAME=#{TRIGGER_NAME,jdbcType=String},
        TRIGGER_GROUP=#{TRIGGER_GROUP,jdbcType=String},
        BLOB_DATA=#{BLOB_DATA,jdbcType=ByteArray}
        WHERE SCHED_NAME=#{SCHED_NAME,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:qrtz_blob_triggers_dto)
        

@Update("""<script>
            UPDATE qrtz_blob_triggers SET
            <if test="SCHED_NAME != null">  SCHED_NAME=#{SCHED_NAME,jdbcType=String},</if>
        <if test="TRIGGER_NAME != null">  TRIGGER_NAME=#{TRIGGER_NAME,jdbcType=String},</if>
        <if test="TRIGGER_GROUP != null">  TRIGGER_GROUP=#{TRIGGER_GROUP,jdbcType=String},</if>
        <if test="BLOB_DATA != null">  BLOB_DATA=#{BLOB_DATA,jdbcType=ByteArray}
              WHERE SCHED_NAME=#{SCHED_NAME,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:qrtz_blob_triggers_dto)
            

}

        
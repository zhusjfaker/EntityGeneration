

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface mdm_ios_command{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "COMMAND", column = "COMMAND"),
   Result(property = "DEVICEUDID", column = "DEVICEUDID"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "UPDATETIME", column = "UPDATETIME"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "IOSMDM", column = "IOSMDM")
)
@Select("""<script>
   SELECT * FROM mdm_ios_command
</script>""")
fun GetListAll():ArrayList<mdm_ios_command_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "COMMAND", column = "COMMAND"),
   Result(property = "DEVICEUDID", column = "DEVICEUDID"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "UPDATETIME", column = "UPDATETIME"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "IOSMDM", column = "IOSMDM")
)
@Select("""<script>
   SELECT * FROM mdm_ios_command
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="COMMAND!=null">
      COMMAND=#{COMMAND}
   </if> 
   <if test="DEVICEUDID!=null">
      DEVICEUDID=#{DEVICEUDID}
   </if> 
   <if test="STATUS!=null">
      STATUS=#{STATUS}
   </if> 
   <if test="UPDATETIME!=null">
      UPDATETIME=#{UPDATETIME}
   </if> 
   <if test="EXT1!=null">
      EXT1=#{EXT1}
   </if> 
   <if test="EXT2!=null">
      EXT2=#{EXT2}
   </if> 
   <if test="IOSMDM!=null">
      IOSMDM=#{IOSMDM}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:mdm_ios_command_dto):ArrayList<mdm_ios_command_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "COMMAND", column = "COMMAND"),
   Result(property = "DEVICEUDID", column = "DEVICEUDID"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "UPDATETIME", column = "UPDATETIME"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "IOSMDM", column = "IOSMDM")
)
@Select("""<script>
   SELECT * FROM mdm_ios_command
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:mdm_ios_command_dto):mdm_ios_command_dto?
                


@Insert("""<script>
    insert into mdm_ios_command
    (ID,COMMAND,DEVICEUDID,STATUS,UPDATETIME,EXT1,EXT2,IOSMDM)
    values
    (#{ID},#{COMMAND},#{DEVICEUDID},#{STATUS},#{UPDATETIME},#{EXT1},#{EXT2},#{IOSMDM})
</script>""")
fun Insert(model:mdm_ios_command_dto):Unit
                


@Insert("""<script>
    insert into mdm_ios_command
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='COMMAND!= null'> 
           COMMAND,
        </if>
        <if test='DEVICEUDID!= null'> 
           DEVICEUDID,
        </if>
        <if test='STATUS!= null'> 
           STATUS,
        </if>
        <if test='UPDATETIME!= null'> 
           UPDATETIME,
        </if>
        <if test='EXT1!= null'> 
           EXT1,
        </if>
        <if test='EXT2!= null'> 
           EXT2,
        </if>
        <if test='IOSMDM!= null'> 
           IOSMDM
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='COMMAND!= null'> 
           #{COMMAND,jdbcType=varchar}，
        </if>
        <if test='DEVICEUDID!= null'> 
           #{DEVICEUDID,jdbcType=char}，
        </if>
        <if test='STATUS!= null'> 
           #{STATUS,jdbcType=smallint}，
        </if>
        <if test='UPDATETIME!= null'> 
           #{UPDATETIME,jdbcType=datetime}，
        </if>
        <if test='EXT1!= null'> 
           #{EXT1,jdbcType=varchar}，
        </if>
        <if test='EXT2!= null'> 
           #{EXT2,jdbcType=varchar}，
        </if>
        <if test='IOSMDM!= null'> 
           #{IOSMDM,jdbcType=smallint}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:mdm_ios_command_dto):Unit
                


@Delete("DELETE FROM mdm_ios_command WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE mdm_ios_command SET
        ID=#{ID,jdbcType=String},
        COMMAND=#{COMMAND,jdbcType=String},
        DEVICEUDID=#{DEVICEUDID,jdbcType=String},
        STATUS=#{STATUS,jdbcType=Integer},
        UPDATETIME=#{UPDATETIME,jdbcType=Timestamp},
        EXT1=#{EXT1,jdbcType=String},
        EXT2=#{EXT2,jdbcType=String},
        IOSMDM=#{IOSMDM,jdbcType=Integer}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:mdm_ios_command_dto)
        

@Update("""<script>
            UPDATE mdm_ios_command SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="COMMAND != null">  COMMAND=#{COMMAND,jdbcType=String},</if>
        <if test="DEVICEUDID != null">  DEVICEUDID=#{DEVICEUDID,jdbcType=String},</if>
        <if test="STATUS != null">  STATUS=#{STATUS,jdbcType=Integer},</if>
        <if test="UPDATETIME != null">  UPDATETIME=#{UPDATETIME,jdbcType=Timestamp},</if>
        <if test="EXT1 != null">  EXT1=#{EXT1,jdbcType=String},</if>
        <if test="EXT2 != null">  EXT2=#{EXT2,jdbcType=String},</if>
        <if test="IOSMDM != null">  IOSMDM=#{IOSMDM,jdbcType=Integer}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:mdm_ios_command_dto)
            

}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_audit_log{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "LOG_CHANNEL", column = "LOG_CHANNEL"),
   Result(property = "LOG_CATALOG", column = "LOG_CATALOG"),
   Result(property = "LOG_OBJECT", column = "LOG_OBJECT"),
   Result(property = "OP", column = "OP"),
   Result(property = "OP_TIME", column = "OP_TIME"),
   Result(property = "OP_IP", column = "OP_IP"),
   Result(property = "OP_INFO", column = "OP_INFO"),
   Result(property = "OP_LEVEL", column = "OP_LEVEL"),
   Result(property = "AUDIT_ROLE", column = "AUDIT_ROLE"),
   Result(property = "OP_USER", column = "OP_USER"),
   Result(property = "EXT1", column = "EXT1")
)
@Select("""<script>
   SELECT * FROM sys_audit_log
</script>""")
fun GetListAll():ArrayList<sys_audit_log_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "LOG_CHANNEL", column = "LOG_CHANNEL"),
   Result(property = "LOG_CATALOG", column = "LOG_CATALOG"),
   Result(property = "LOG_OBJECT", column = "LOG_OBJECT"),
   Result(property = "OP", column = "OP"),
   Result(property = "OP_TIME", column = "OP_TIME"),
   Result(property = "OP_IP", column = "OP_IP"),
   Result(property = "OP_INFO", column = "OP_INFO"),
   Result(property = "OP_LEVEL", column = "OP_LEVEL"),
   Result(property = "AUDIT_ROLE", column = "AUDIT_ROLE"),
   Result(property = "OP_USER", column = "OP_USER"),
   Result(property = "EXT1", column = "EXT1")
)
@Select("""<script>
   SELECT * FROM sys_audit_log
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="LOG_CHANNEL!=null">
      LOG_CHANNEL=#{LOG_CHANNEL}
   </if> 
   <if test="LOG_CATALOG!=null">
      LOG_CATALOG=#{LOG_CATALOG}
   </if> 
   <if test="LOG_OBJECT!=null">
      LOG_OBJECT=#{LOG_OBJECT}
   </if> 
   <if test="OP!=null">
      OP=#{OP}
   </if> 
   <if test="OP_TIME!=null">
      OP_TIME=#{OP_TIME}
   </if> 
   <if test="OP_IP!=null">
      OP_IP=#{OP_IP}
   </if> 
   <if test="OP_INFO!=null">
      OP_INFO=#{OP_INFO}
   </if> 
   <if test="OP_LEVEL!=null">
      OP_LEVEL=#{OP_LEVEL}
   </if> 
   <if test="AUDIT_ROLE!=null">
      AUDIT_ROLE=#{AUDIT_ROLE}
   </if> 
   <if test="OP_USER!=null">
      OP_USER=#{OP_USER}
   </if> 
   <if test="EXT1!=null">
      EXT1=#{EXT1}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_audit_log_dto):ArrayList<sys_audit_log_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "LOG_CHANNEL", column = "LOG_CHANNEL"),
   Result(property = "LOG_CATALOG", column = "LOG_CATALOG"),
   Result(property = "LOG_OBJECT", column = "LOG_OBJECT"),
   Result(property = "OP", column = "OP"),
   Result(property = "OP_TIME", column = "OP_TIME"),
   Result(property = "OP_IP", column = "OP_IP"),
   Result(property = "OP_INFO", column = "OP_INFO"),
   Result(property = "OP_LEVEL", column = "OP_LEVEL"),
   Result(property = "AUDIT_ROLE", column = "AUDIT_ROLE"),
   Result(property = "OP_USER", column = "OP_USER"),
   Result(property = "EXT1", column = "EXT1")
)
@Select("""<script>
   SELECT * FROM sys_audit_log
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_audit_log_dto):sys_audit_log_dto?
                


@Insert("""<script>
    insert into sys_audit_log
    (ID,LOG_CHANNEL,LOG_CATALOG,LOG_OBJECT,OP,OP_TIME,OP_IP,OP_INFO,OP_LEVEL,AUDIT_ROLE,OP_USER,EXT1)
    values
    (#{ID},#{LOG_CHANNEL},#{LOG_CATALOG},#{LOG_OBJECT},#{OP},#{OP_TIME},#{OP_IP},#{OP_INFO},#{OP_LEVEL},#{AUDIT_ROLE},#{OP_USER},#{EXT1})
</script>""")
fun Insert(model:sys_audit_log_dto):Unit
                


@Insert("""<script>
    insert into sys_audit_log
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='LOG_CHANNEL!= null'> 
           LOG_CHANNEL,
        </if>
        <if test='LOG_CATALOG!= null'> 
           LOG_CATALOG,
        </if>
        <if test='LOG_OBJECT!= null'> 
           LOG_OBJECT,
        </if>
        <if test='OP!= null'> 
           OP,
        </if>
        <if test='OP_TIME!= null'> 
           OP_TIME,
        </if>
        <if test='OP_IP!= null'> 
           OP_IP,
        </if>
        <if test='OP_INFO!= null'> 
           OP_INFO,
        </if>
        <if test='OP_LEVEL!= null'> 
           OP_LEVEL,
        </if>
        <if test='AUDIT_ROLE!= null'> 
           AUDIT_ROLE,
        </if>
        <if test='OP_USER!= null'> 
           OP_USER,
        </if>
        <if test='EXT1!= null'> 
           EXT1
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='LOG_CHANNEL!= null'> 
           #{LOG_CHANNEL,jdbcType=varchar}，
        </if>
        <if test='LOG_CATALOG!= null'> 
           #{LOG_CATALOG,jdbcType=varchar}，
        </if>
        <if test='LOG_OBJECT!= null'> 
           #{LOG_OBJECT,jdbcType=varchar}，
        </if>
        <if test='OP!= null'> 
           #{OP,jdbcType=varchar}，
        </if>
        <if test='OP_TIME!= null'> 
           #{OP_TIME,jdbcType=datetime}，
        </if>
        <if test='OP_IP!= null'> 
           #{OP_IP,jdbcType=varchar}，
        </if>
        <if test='OP_INFO!= null'> 
           #{OP_INFO,jdbcType=text}，
        </if>
        <if test='OP_LEVEL!= null'> 
           #{OP_LEVEL,jdbcType=smallint}，
        </if>
        <if test='AUDIT_ROLE!= null'> 
           #{AUDIT_ROLE,jdbcType=smallint}，
        </if>
        <if test='OP_USER!= null'> 
           #{OP_USER,jdbcType=varchar}，
        </if>
        <if test='EXT1!= null'> 
           #{EXT1,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_audit_log_dto):Unit
                

}

        
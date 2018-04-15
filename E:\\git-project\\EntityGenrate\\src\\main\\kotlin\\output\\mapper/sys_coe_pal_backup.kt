

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_backup{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "BACKUPTIME", column = "BACKUPTIME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "REMARK", column = "REMARK"),
   Result(property = "STATE", column = "STATE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_backup
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_backup_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "BACKUPTIME", column = "BACKUPTIME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "REMARK", column = "REMARK"),
   Result(property = "STATE", column = "STATE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_backup
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="WSID!=null">
      WSID=#{WSID}
   </if> 
   <if test="BACKUPTIME!=null">
      BACKUPTIME=#{BACKUPTIME}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="REMARK!=null">
      REMARK=#{REMARK}
   </if> 
   <if test="STATE!=null">
      STATE=#{STATE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_backup_dto):ArrayList<sys_coe_pal_backup_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "BACKUPTIME", column = "BACKUPTIME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "REMARK", column = "REMARK"),
   Result(property = "STATE", column = "STATE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_backup
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_backup_dto):sys_coe_pal_backup_dto?
                


@Insert("""<script>
    insert into sys_coe_pal_backup
    (ID,WSID,BACKUPTIME,USERID,REMARK,STATE)
    values
    (#{ID},#{WSID},#{BACKUPTIME},#{USERID},#{REMARK},#{STATE})
</script>""")
fun Insert(model:sys_coe_pal_backup_dto):Unit
                


@Insert("""<script>
    insert into sys_coe_pal_backup
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='WSID!= null'> 
           WSID,
        </if>
        <if test='BACKUPTIME!= null'> 
           BACKUPTIME,
        </if>
        <if test='USERID!= null'> 
           USERID,
        </if>
        <if test='REMARK!= null'> 
           REMARK,
        </if>
        <if test='STATE!= null'> 
           STATE
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='WSID!= null'> 
           #{WSID,jdbcType=char}，
        </if>
        <if test='BACKUPTIME!= null'> 
           #{BACKUPTIME,jdbcType=datetime}，
        </if>
        <if test='USERID!= null'> 
           #{USERID,jdbcType=varchar}，
        </if>
        <if test='REMARK!= null'> 
           #{REMARK,jdbcType=varchar}，
        </if>
        <if test='STATE!= null'> 
           #{STATE,jdbcType=smallint}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_coe_pal_backup_dto):Unit
                


@Delete("DELETE FROM sys_coe_pal_backup WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_coe_pal_backup SET
        ID=#{ID,jdbcType=String},
        WSID=#{WSID,jdbcType=String},
        BACKUPTIME=#{BACKUPTIME,jdbcType=Timestamp},
        USERID=#{USERID,jdbcType=String},
        REMARK=#{REMARK,jdbcType=String},
        STATE=#{STATE,jdbcType=Integer}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_coe_pal_backup_dto)
        

@Update("""<script>
            UPDATE sys_coe_pal_backup SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="WSID != null">  WSID=#{WSID,jdbcType=String},</if>
        <if test="BACKUPTIME != null">  BACKUPTIME=#{BACKUPTIME,jdbcType=Timestamp},</if>
        <if test="USERID != null">  USERID=#{USERID,jdbcType=String},</if>
        <if test="REMARK != null">  REMARK=#{REMARK,jdbcType=String},</if>
        <if test="STATE != null">  STATE=#{STATE,jdbcType=Integer}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_coe_pal_backup_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_backup{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "BACKUPTIME", column = "BACKUPTIME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "REMARK", column = "REMARK"),
   Result(property = "STATE", column = "STATE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_backup
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_backup_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "BACKUPTIME", column = "BACKUPTIME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "REMARK", column = "REMARK"),
   Result(property = "STATE", column = "STATE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_backup
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="WSID!=null">
      WSID=#{WSID}
   </if> 
   <if test="BACKUPTIME!=null">
      BACKUPTIME=#{BACKUPTIME}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="REMARK!=null">
      REMARK=#{REMARK}
   </if> 
   <if test="STATE!=null">
      STATE=#{STATE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_backup_dto):ArrayList<sys_coe_pal_backup_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "BACKUPTIME", column = "BACKUPTIME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "REMARK", column = "REMARK"),
   Result(property = "STATE", column = "STATE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_backup
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_backup_dto):sys_coe_pal_backup_dto?
                


@Insert("""<script>
    insert into sys_coe_pal_backup
    (ID,WSID,BACKUPTIME,USERID,REMARK,STATE)
    values
    (#{ID},#{WSID},#{BACKUPTIME},#{USERID},#{REMARK},#{STATE})
</script>""")
fun Insert(model:sys_coe_pal_backup_dto):Unit
                


@Insert("""<script>
    insert into sys_coe_pal_backup
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='WSID!= null'> 
           WSID,
        </if>
        <if test='BACKUPTIME!= null'> 
           BACKUPTIME,
        </if>
        <if test='USERID!= null'> 
           USERID,
        </if>
        <if test='REMARK!= null'> 
           REMARK,
        </if>
        <if test='STATE!= null'> 
           STATE
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='WSID!= null'> 
           #{WSID,jdbcType=char}，
        </if>
        <if test='BACKUPTIME!= null'> 
           #{BACKUPTIME,jdbcType=datetime}，
        </if>
        <if test='USERID!= null'> 
           #{USERID,jdbcType=varchar}，
        </if>
        <if test='REMARK!= null'> 
           #{REMARK,jdbcType=varchar}，
        </if>
        <if test='STATE!= null'> 
           #{STATE,jdbcType=smallint}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_coe_pal_backup_dto):Unit
                


@Delete("DELETE FROM sys_coe_pal_backup WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_coe_pal_backup SET
        ID=#{ID,jdbcType=String},
        WSID=#{WSID,jdbcType=String},
        BACKUPTIME=#{BACKUPTIME,jdbcType=Timestamp},
        USERID=#{USERID,jdbcType=String},
        REMARK=#{REMARK,jdbcType=String},
        STATE=#{STATE,jdbcType=Integer}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_coe_pal_backup_dto)
        

@Update("""<script>
            UPDATE sys_coe_pal_backup SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="WSID != null">  WSID=#{WSID,jdbcType=String},</if>
        <if test="BACKUPTIME != null">  BACKUPTIME=#{BACKUPTIME,jdbcType=Timestamp},</if>
        <if test="USERID != null">  USERID=#{USERID,jdbcType=String},</if>
        <if test="REMARK != null">  REMARK=#{REMARK,jdbcType=String},</if>
        <if test="STATE != null">  STATE=#{STATE,jdbcType=Integer}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_coe_pal_backup_dto)
            

}

        
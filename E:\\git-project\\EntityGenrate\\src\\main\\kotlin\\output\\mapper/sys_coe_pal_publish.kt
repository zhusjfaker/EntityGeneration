

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_publish{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "AUDITORID", column = "AUDITORID"),
   Result(property = "PUBLISHDATE", column = "PUBLISHDATE"),
   Result(property = "PUBLISHDESC", column = "PUBLISHDESC"),
   Result(property = "PUBLISHN", column = "PUBLISHN"),
   Result(property = "PUBLISHC", column = "PUBLISHC"),
   Result(property = "PUBLISHS", column = "PUBLISHS"),
   Result(property = "TEAMID", column = "TEAMID")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_publish
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_publish_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "AUDITORID", column = "AUDITORID"),
   Result(property = "PUBLISHDATE", column = "PUBLISHDATE"),
   Result(property = "PUBLISHDESC", column = "PUBLISHDESC"),
   Result(property = "PUBLISHN", column = "PUBLISHN"),
   Result(property = "PUBLISHC", column = "PUBLISHC"),
   Result(property = "PUBLISHS", column = "PUBLISHS"),
   Result(property = "TEAMID", column = "TEAMID")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_publish
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="PROCESSINSTID!=null">
      PROCESSINSTID=#{PROCESSINSTID}
   </if> 
   <if test="WSID!=null">
      WSID=#{WSID}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="AUDITORID!=null">
      AUDITORID=#{AUDITORID}
   </if> 
   <if test="PUBLISHDATE!=null">
      PUBLISHDATE=#{PUBLISHDATE}
   </if> 
   <if test="PUBLISHDESC!=null">
      PUBLISHDESC=#{PUBLISHDESC}
   </if> 
   <if test="PUBLISHN!=null">
      PUBLISHN=#{PUBLISHN}
   </if> 
   <if test="PUBLISHC!=null">
      PUBLISHC=#{PUBLISHC}
   </if> 
   <if test="PUBLISHS!=null">
      PUBLISHS=#{PUBLISHS}
   </if> 
   <if test="TEAMID!=null">
      TEAMID=#{TEAMID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_publish_dto):ArrayList<sys_coe_pal_publish_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "AUDITORID", column = "AUDITORID"),
   Result(property = "PUBLISHDATE", column = "PUBLISHDATE"),
   Result(property = "PUBLISHDESC", column = "PUBLISHDESC"),
   Result(property = "PUBLISHN", column = "PUBLISHN"),
   Result(property = "PUBLISHC", column = "PUBLISHC"),
   Result(property = "PUBLISHS", column = "PUBLISHS"),
   Result(property = "TEAMID", column = "TEAMID")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_publish
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_publish_dto):sys_coe_pal_publish_dto?
                


@Insert("""<script>
    insert into sys_coe_pal_publish
    (ID,PROCESSINSTID,WSID,USERID,AUDITORID,PUBLISHDATE,PUBLISHDESC,PUBLISHN,PUBLISHC,PUBLISHS,TEAMID)
    values
    (#{ID},#{PROCESSINSTID},#{WSID},#{USERID},#{AUDITORID},#{PUBLISHDATE},#{PUBLISHDESC},#{PUBLISHN},#{PUBLISHC},#{PUBLISHS},#{TEAMID})
</script>""")
fun Insert(model:sys_coe_pal_publish_dto):Unit
                


@Insert("""<script>
    insert into sys_coe_pal_publish
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='PROCESSINSTID!= null'> 
           PROCESSINSTID,
        </if>
        <if test='WSID!= null'> 
           WSID,
        </if>
        <if test='USERID!= null'> 
           USERID,
        </if>
        <if test='AUDITORID!= null'> 
           AUDITORID,
        </if>
        <if test='PUBLISHDATE!= null'> 
           PUBLISHDATE,
        </if>
        <if test='PUBLISHDESC!= null'> 
           PUBLISHDESC,
        </if>
        <if test='PUBLISHN!= null'> 
           PUBLISHN,
        </if>
        <if test='PUBLISHC!= null'> 
           PUBLISHC,
        </if>
        <if test='PUBLISHS!= null'> 
           PUBLISHS,
        </if>
        <if test='TEAMID!= null'> 
           TEAMID
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='PROCESSINSTID!= null'> 
           #{PROCESSINSTID,jdbcType=varchar}，
        </if>
        <if test='WSID!= null'> 
           #{WSID,jdbcType=char}，
        </if>
        <if test='USERID!= null'> 
           #{USERID,jdbcType=varchar}，
        </if>
        <if test='AUDITORID!= null'> 
           #{AUDITORID,jdbcType=varchar}，
        </if>
        <if test='PUBLISHDATE!= null'> 
           #{PUBLISHDATE,jdbcType=datetime}，
        </if>
        <if test='PUBLISHDESC!= null'> 
           #{PUBLISHDESC,jdbcType=text}，
        </if>
        <if test='PUBLISHN!= null'> 
           #{PUBLISHN,jdbcType=decimal}，
        </if>
        <if test='PUBLISHC!= null'> 
           #{PUBLISHC,jdbcType=decimal}，
        </if>
        <if test='PUBLISHS!= null'> 
           #{PUBLISHS,jdbcType=decimal}，
        </if>
        <if test='TEAMID!= null'> 
           #{TEAMID,jdbcType=char}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_coe_pal_publish_dto):Unit
                


@Delete("DELETE FROM sys_coe_pal_publish WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_coe_pal_publish SET
        ID=#{ID,jdbcType=String},
        PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},
        WSID=#{WSID,jdbcType=String},
        USERID=#{USERID,jdbcType=String},
        AUDITORID=#{AUDITORID,jdbcType=String},
        PUBLISHDATE=#{PUBLISHDATE,jdbcType=Timestamp},
        PUBLISHDESC=#{PUBLISHDESC,jdbcType=String},
        PUBLISHN=#{PUBLISHN,jdbcType=BigDecimal},
        PUBLISHC=#{PUBLISHC,jdbcType=BigDecimal},
        PUBLISHS=#{PUBLISHS,jdbcType=BigDecimal},
        TEAMID=#{TEAMID,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_coe_pal_publish_dto)
        

@Update("""<script>
            UPDATE sys_coe_pal_publish SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="PROCESSINSTID != null">  PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},</if>
        <if test="WSID != null">  WSID=#{WSID,jdbcType=String},</if>
        <if test="USERID != null">  USERID=#{USERID,jdbcType=String},</if>
        <if test="AUDITORID != null">  AUDITORID=#{AUDITORID,jdbcType=String},</if>
        <if test="PUBLISHDATE != null">  PUBLISHDATE=#{PUBLISHDATE,jdbcType=Timestamp},</if>
        <if test="PUBLISHDESC != null">  PUBLISHDESC=#{PUBLISHDESC,jdbcType=String},</if>
        <if test="PUBLISHN != null">  PUBLISHN=#{PUBLISHN,jdbcType=BigDecimal},</if>
        <if test="PUBLISHC != null">  PUBLISHC=#{PUBLISHC,jdbcType=BigDecimal},</if>
        <if test="PUBLISHS != null">  PUBLISHS=#{PUBLISHS,jdbcType=BigDecimal},</if>
        <if test="TEAMID != null">  TEAMID=#{TEAMID,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_coe_pal_publish_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_publish{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "AUDITORID", column = "AUDITORID"),
   Result(property = "PUBLISHDATE", column = "PUBLISHDATE"),
   Result(property = "PUBLISHDESC", column = "PUBLISHDESC"),
   Result(property = "PUBLISHN", column = "PUBLISHN"),
   Result(property = "PUBLISHC", column = "PUBLISHC"),
   Result(property = "PUBLISHS", column = "PUBLISHS"),
   Result(property = "TEAMID", column = "TEAMID")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_publish
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_publish_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "AUDITORID", column = "AUDITORID"),
   Result(property = "PUBLISHDATE", column = "PUBLISHDATE"),
   Result(property = "PUBLISHDESC", column = "PUBLISHDESC"),
   Result(property = "PUBLISHN", column = "PUBLISHN"),
   Result(property = "PUBLISHC", column = "PUBLISHC"),
   Result(property = "PUBLISHS", column = "PUBLISHS"),
   Result(property = "TEAMID", column = "TEAMID")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_publish
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="PROCESSINSTID!=null">
      PROCESSINSTID=#{PROCESSINSTID}
   </if> 
   <if test="WSID!=null">
      WSID=#{WSID}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="AUDITORID!=null">
      AUDITORID=#{AUDITORID}
   </if> 
   <if test="PUBLISHDATE!=null">
      PUBLISHDATE=#{PUBLISHDATE}
   </if> 
   <if test="PUBLISHDESC!=null">
      PUBLISHDESC=#{PUBLISHDESC}
   </if> 
   <if test="PUBLISHN!=null">
      PUBLISHN=#{PUBLISHN}
   </if> 
   <if test="PUBLISHC!=null">
      PUBLISHC=#{PUBLISHC}
   </if> 
   <if test="PUBLISHS!=null">
      PUBLISHS=#{PUBLISHS}
   </if> 
   <if test="TEAMID!=null">
      TEAMID=#{TEAMID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_publish_dto):ArrayList<sys_coe_pal_publish_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "AUDITORID", column = "AUDITORID"),
   Result(property = "PUBLISHDATE", column = "PUBLISHDATE"),
   Result(property = "PUBLISHDESC", column = "PUBLISHDESC"),
   Result(property = "PUBLISHN", column = "PUBLISHN"),
   Result(property = "PUBLISHC", column = "PUBLISHC"),
   Result(property = "PUBLISHS", column = "PUBLISHS"),
   Result(property = "TEAMID", column = "TEAMID")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_publish
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_publish_dto):sys_coe_pal_publish_dto?
                


@Insert("""<script>
    insert into sys_coe_pal_publish
    (ID,PROCESSINSTID,WSID,USERID,AUDITORID,PUBLISHDATE,PUBLISHDESC,PUBLISHN,PUBLISHC,PUBLISHS,TEAMID)
    values
    (#{ID},#{PROCESSINSTID},#{WSID},#{USERID},#{AUDITORID},#{PUBLISHDATE},#{PUBLISHDESC},#{PUBLISHN},#{PUBLISHC},#{PUBLISHS},#{TEAMID})
</script>""")
fun Insert(model:sys_coe_pal_publish_dto):Unit
                


@Insert("""<script>
    insert into sys_coe_pal_publish
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='PROCESSINSTID!= null'> 
           PROCESSINSTID,
        </if>
        <if test='WSID!= null'> 
           WSID,
        </if>
        <if test='USERID!= null'> 
           USERID,
        </if>
        <if test='AUDITORID!= null'> 
           AUDITORID,
        </if>
        <if test='PUBLISHDATE!= null'> 
           PUBLISHDATE,
        </if>
        <if test='PUBLISHDESC!= null'> 
           PUBLISHDESC,
        </if>
        <if test='PUBLISHN!= null'> 
           PUBLISHN,
        </if>
        <if test='PUBLISHC!= null'> 
           PUBLISHC,
        </if>
        <if test='PUBLISHS!= null'> 
           PUBLISHS,
        </if>
        <if test='TEAMID!= null'> 
           TEAMID
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='PROCESSINSTID!= null'> 
           #{PROCESSINSTID,jdbcType=varchar}，
        </if>
        <if test='WSID!= null'> 
           #{WSID,jdbcType=char}，
        </if>
        <if test='USERID!= null'> 
           #{USERID,jdbcType=varchar}，
        </if>
        <if test='AUDITORID!= null'> 
           #{AUDITORID,jdbcType=varchar}，
        </if>
        <if test='PUBLISHDATE!= null'> 
           #{PUBLISHDATE,jdbcType=datetime}，
        </if>
        <if test='PUBLISHDESC!= null'> 
           #{PUBLISHDESC,jdbcType=text}，
        </if>
        <if test='PUBLISHN!= null'> 
           #{PUBLISHN,jdbcType=decimal}，
        </if>
        <if test='PUBLISHC!= null'> 
           #{PUBLISHC,jdbcType=decimal}，
        </if>
        <if test='PUBLISHS!= null'> 
           #{PUBLISHS,jdbcType=decimal}，
        </if>
        <if test='TEAMID!= null'> 
           #{TEAMID,jdbcType=char}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_coe_pal_publish_dto):Unit
                


@Delete("DELETE FROM sys_coe_pal_publish WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_coe_pal_publish SET
        ID=#{ID,jdbcType=String},
        PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},
        WSID=#{WSID,jdbcType=String},
        USERID=#{USERID,jdbcType=String},
        AUDITORID=#{AUDITORID,jdbcType=String},
        PUBLISHDATE=#{PUBLISHDATE,jdbcType=Timestamp},
        PUBLISHDESC=#{PUBLISHDESC,jdbcType=String},
        PUBLISHN=#{PUBLISHN,jdbcType=BigDecimal},
        PUBLISHC=#{PUBLISHC,jdbcType=BigDecimal},
        PUBLISHS=#{PUBLISHS,jdbcType=BigDecimal},
        TEAMID=#{TEAMID,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_coe_pal_publish_dto)
        

@Update("""<script>
            UPDATE sys_coe_pal_publish SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="PROCESSINSTID != null">  PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},</if>
        <if test="WSID != null">  WSID=#{WSID,jdbcType=String},</if>
        <if test="USERID != null">  USERID=#{USERID,jdbcType=String},</if>
        <if test="AUDITORID != null">  AUDITORID=#{AUDITORID,jdbcType=String},</if>
        <if test="PUBLISHDATE != null">  PUBLISHDATE=#{PUBLISHDATE,jdbcType=Timestamp},</if>
        <if test="PUBLISHDESC != null">  PUBLISHDESC=#{PUBLISHDESC,jdbcType=String},</if>
        <if test="PUBLISHN != null">  PUBLISHN=#{PUBLISHN,jdbcType=BigDecimal},</if>
        <if test="PUBLISHC != null">  PUBLISHC=#{PUBLISHC,jdbcType=BigDecimal},</if>
        <if test="PUBLISHS != null">  PUBLISHS=#{PUBLISHS,jdbcType=BigDecimal},</if>
        <if test="TEAMID != null">  TEAMID=#{TEAMID,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_coe_pal_publish_dto)
            

}

        
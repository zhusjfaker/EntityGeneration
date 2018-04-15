

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_comment{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PID", column = "PID"),
   Result(property = "STREAMID", column = "STREAMID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "TARGETTYPE", column = "TARGETTYPE"),
   Result(property = "TARGETID", column = "TARGETID"),
   Result(property = "TEAMID", column = "TEAMID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "USERCOMMENT", column = "USERCOMMENT"),
   Result(property = "COMMENTDATE", column = "COMMENTDATE"),
   Result(property = "INFOTYPE", column = "INFOTYPE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_comment
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_comment_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PID", column = "PID"),
   Result(property = "STREAMID", column = "STREAMID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "TARGETTYPE", column = "TARGETTYPE"),
   Result(property = "TARGETID", column = "TARGETID"),
   Result(property = "TEAMID", column = "TEAMID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "USERCOMMENT", column = "USERCOMMENT"),
   Result(property = "COMMENTDATE", column = "COMMENTDATE"),
   Result(property = "INFOTYPE", column = "INFOTYPE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_comment
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="PID!=null">
      PID=#{PID}
   </if> 
   <if test="STREAMID!=null">
      STREAMID=#{STREAMID}
   </if> 
   <if test="WSID!=null">
      WSID=#{WSID}
   </if> 
   <if test="TARGETTYPE!=null">
      TARGETTYPE=#{TARGETTYPE}
   </if> 
   <if test="TARGETID!=null">
      TARGETID=#{TARGETID}
   </if> 
   <if test="TEAMID!=null">
      TEAMID=#{TEAMID}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="USERCOMMENT!=null">
      USERCOMMENT=#{USERCOMMENT}
   </if> 
   <if test="COMMENTDATE!=null">
      COMMENTDATE=#{COMMENTDATE}
   </if> 
   <if test="INFOTYPE!=null">
      INFOTYPE=#{INFOTYPE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_comment_dto):ArrayList<sys_coe_pal_comment_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PID", column = "PID"),
   Result(property = "STREAMID", column = "STREAMID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "TARGETTYPE", column = "TARGETTYPE"),
   Result(property = "TARGETID", column = "TARGETID"),
   Result(property = "TEAMID", column = "TEAMID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "USERCOMMENT", column = "USERCOMMENT"),
   Result(property = "COMMENTDATE", column = "COMMENTDATE"),
   Result(property = "INFOTYPE", column = "INFOTYPE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_comment
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_comment_dto):sys_coe_pal_comment_dto?
                


@Insert("""<script>
    insert into sys_coe_pal_comment
    (ID,PID,STREAMID,WSID,TARGETTYPE,TARGETID,TEAMID,USERID,USERCOMMENT,COMMENTDATE,INFOTYPE)
    values
    (#{ID},#{PID},#{STREAMID},#{WSID},#{TARGETTYPE},#{TARGETID},#{TEAMID},#{USERID},#{USERCOMMENT},#{COMMENTDATE},#{INFOTYPE})
</script>""")
fun Insert(model:sys_coe_pal_comment_dto):Unit
                


@Insert("""<script>
    insert into sys_coe_pal_comment
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='PID!= null'> 
           PID,
        </if>
        <if test='STREAMID!= null'> 
           STREAMID,
        </if>
        <if test='WSID!= null'> 
           WSID,
        </if>
        <if test='TARGETTYPE!= null'> 
           TARGETTYPE,
        </if>
        <if test='TARGETID!= null'> 
           TARGETID,
        </if>
        <if test='TEAMID!= null'> 
           TEAMID,
        </if>
        <if test='USERID!= null'> 
           USERID,
        </if>
        <if test='USERCOMMENT!= null'> 
           USERCOMMENT,
        </if>
        <if test='COMMENTDATE!= null'> 
           COMMENTDATE,
        </if>
        <if test='INFOTYPE!= null'> 
           INFOTYPE
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='PID!= null'> 
           #{PID,jdbcType=char}，
        </if>
        <if test='STREAMID!= null'> 
           #{STREAMID,jdbcType=char}，
        </if>
        <if test='WSID!= null'> 
           #{WSID,jdbcType=char}，
        </if>
        <if test='TARGETTYPE!= null'> 
           #{TARGETTYPE,jdbcType=smallint}，
        </if>
        <if test='TARGETID!= null'> 
           #{TARGETID,jdbcType=char}，
        </if>
        <if test='TEAMID!= null'> 
           #{TEAMID,jdbcType=char}，
        </if>
        <if test='USERID!= null'> 
           #{USERID,jdbcType=varchar}，
        </if>
        <if test='USERCOMMENT!= null'> 
           #{USERCOMMENT,jdbcType=text}，
        </if>
        <if test='COMMENTDATE!= null'> 
           #{COMMENTDATE,jdbcType=datetime}，
        </if>
        <if test='INFOTYPE!= null'> 
           #{INFOTYPE,jdbcType=smallint}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_coe_pal_comment_dto):Unit
                


@Delete("DELETE FROM sys_coe_pal_comment WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_coe_pal_comment SET
        ID=#{ID,jdbcType=String},
        PID=#{PID,jdbcType=String},
        STREAMID=#{STREAMID,jdbcType=String},
        WSID=#{WSID,jdbcType=String},
        TARGETTYPE=#{TARGETTYPE,jdbcType=Integer},
        TARGETID=#{TARGETID,jdbcType=String},
        TEAMID=#{TEAMID,jdbcType=String},
        USERID=#{USERID,jdbcType=String},
        USERCOMMENT=#{USERCOMMENT,jdbcType=String},
        COMMENTDATE=#{COMMENTDATE,jdbcType=Timestamp},
        INFOTYPE=#{INFOTYPE,jdbcType=Integer}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_coe_pal_comment_dto)
        

@Update("""<script>
            UPDATE sys_coe_pal_comment SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="PID != null">  PID=#{PID,jdbcType=String},</if>
        <if test="STREAMID != null">  STREAMID=#{STREAMID,jdbcType=String},</if>
        <if test="WSID != null">  WSID=#{WSID,jdbcType=String},</if>
        <if test="TARGETTYPE != null">  TARGETTYPE=#{TARGETTYPE,jdbcType=Integer},</if>
        <if test="TARGETID != null">  TARGETID=#{TARGETID,jdbcType=String},</if>
        <if test="TEAMID != null">  TEAMID=#{TEAMID,jdbcType=String},</if>
        <if test="USERID != null">  USERID=#{USERID,jdbcType=String},</if>
        <if test="USERCOMMENT != null">  USERCOMMENT=#{USERCOMMENT,jdbcType=String},</if>
        <if test="COMMENTDATE != null">  COMMENTDATE=#{COMMENTDATE,jdbcType=Timestamp},</if>
        <if test="INFOTYPE != null">  INFOTYPE=#{INFOTYPE,jdbcType=Integer}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_coe_pal_comment_dto)
            

}

        
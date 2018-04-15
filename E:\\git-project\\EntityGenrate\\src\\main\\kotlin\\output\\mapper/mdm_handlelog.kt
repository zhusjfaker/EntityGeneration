

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface mdm_handlelog{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "HANDLETIME", column = "HANDLETIME"),
   Result(property = "HANDLETYPE", column = "HANDLETYPE"),
   Result(property = "COMMANDID", column = "COMMANDID")
)
@Select("""<script>
   SELECT * FROM mdm_handlelog
</script>""")
fun GetListAll():ArrayList<mdm_handlelog_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "HANDLETIME", column = "HANDLETIME"),
   Result(property = "HANDLETYPE", column = "HANDLETYPE"),
   Result(property = "COMMANDID", column = "COMMANDID")
)
@Select("""<script>
   SELECT * FROM mdm_handlelog
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="DEVICEID!=null">
      DEVICEID=#{DEVICEID}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="HANDLETIME!=null">
      HANDLETIME=#{HANDLETIME}
   </if> 
   <if test="HANDLETYPE!=null">
      HANDLETYPE=#{HANDLETYPE}
   </if> 
   <if test="COMMANDID!=null">
      COMMANDID=#{COMMANDID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:mdm_handlelog_dto):ArrayList<mdm_handlelog_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "HANDLETIME", column = "HANDLETIME"),
   Result(property = "HANDLETYPE", column = "HANDLETYPE"),
   Result(property = "COMMANDID", column = "COMMANDID")
)
@Select("""<script>
   SELECT * FROM mdm_handlelog
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:mdm_handlelog_dto):mdm_handlelog_dto?
                


@Insert("""<script>
    insert into mdm_handlelog
    (ID,DEVICEID,USERID,HANDLETIME,HANDLETYPE,COMMANDID)
    values
    (#{ID},#{DEVICEID},#{USERID},#{HANDLETIME},#{HANDLETYPE},#{COMMANDID})
</script>""")
fun Insert(model:mdm_handlelog_dto):Unit
                


@Insert("""<script>
    insert into mdm_handlelog
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='DEVICEID!= null'> 
           DEVICEID,
        </if>
        <if test='USERID!= null'> 
           USERID,
        </if>
        <if test='HANDLETIME!= null'> 
           HANDLETIME,
        </if>
        <if test='HANDLETYPE!= null'> 
           HANDLETYPE,
        </if>
        <if test='COMMANDID!= null'> 
           COMMANDID
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='DEVICEID!= null'> 
           #{DEVICEID,jdbcType=char}，
        </if>
        <if test='USERID!= null'> 
           #{USERID,jdbcType=varchar}，
        </if>
        <if test='HANDLETIME!= null'> 
           #{HANDLETIME,jdbcType=datetime}，
        </if>
        <if test='HANDLETYPE!= null'> 
           #{HANDLETYPE,jdbcType=smallint}，
        </if>
        <if test='COMMANDID!= null'> 
           #{COMMANDID,jdbcType=char}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:mdm_handlelog_dto):Unit
                


@Delete("DELETE FROM mdm_handlelog WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE mdm_handlelog SET
        ID=#{ID,jdbcType=String},
        DEVICEID=#{DEVICEID,jdbcType=String},
        USERID=#{USERID,jdbcType=String},
        HANDLETIME=#{HANDLETIME,jdbcType=Timestamp},
        HANDLETYPE=#{HANDLETYPE,jdbcType=Integer},
        COMMANDID=#{COMMANDID,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:mdm_handlelog_dto)
        

@Update("""<script>
            UPDATE mdm_handlelog SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="DEVICEID != null">  DEVICEID=#{DEVICEID,jdbcType=String},</if>
        <if test="USERID != null">  USERID=#{USERID,jdbcType=String},</if>
        <if test="HANDLETIME != null">  HANDLETIME=#{HANDLETIME,jdbcType=Timestamp},</if>
        <if test="HANDLETYPE != null">  HANDLETYPE=#{HANDLETYPE,jdbcType=Integer},</if>
        <if test="COMMANDID != null">  COMMANDID=#{COMMANDID,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:mdm_handlelog_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface mdm_handlelog{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "HANDLETIME", column = "HANDLETIME"),
   Result(property = "HANDLETYPE", column = "HANDLETYPE"),
   Result(property = "COMMANDID", column = "COMMANDID")
)
@Select("""<script>
   SELECT * FROM mdm_handlelog
</script>""")
fun GetListAll():ArrayList<mdm_handlelog_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "HANDLETIME", column = "HANDLETIME"),
   Result(property = "HANDLETYPE", column = "HANDLETYPE"),
   Result(property = "COMMANDID", column = "COMMANDID")
)
@Select("""<script>
   SELECT * FROM mdm_handlelog
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="DEVICEID!=null">
      DEVICEID=#{DEVICEID}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="HANDLETIME!=null">
      HANDLETIME=#{HANDLETIME}
   </if> 
   <if test="HANDLETYPE!=null">
      HANDLETYPE=#{HANDLETYPE}
   </if> 
   <if test="COMMANDID!=null">
      COMMANDID=#{COMMANDID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:mdm_handlelog_dto):ArrayList<mdm_handlelog_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "HANDLETIME", column = "HANDLETIME"),
   Result(property = "HANDLETYPE", column = "HANDLETYPE"),
   Result(property = "COMMANDID", column = "COMMANDID")
)
@Select("""<script>
   SELECT * FROM mdm_handlelog
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:mdm_handlelog_dto):mdm_handlelog_dto?
                


@Insert("""<script>
    insert into mdm_handlelog
    (ID,DEVICEID,USERID,HANDLETIME,HANDLETYPE,COMMANDID)
    values
    (#{ID},#{DEVICEID},#{USERID},#{HANDLETIME},#{HANDLETYPE},#{COMMANDID})
</script>""")
fun Insert(model:mdm_handlelog_dto):Unit
                


@Insert("""<script>
    insert into mdm_handlelog
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='DEVICEID!= null'> 
           DEVICEID,
        </if>
        <if test='USERID!= null'> 
           USERID,
        </if>
        <if test='HANDLETIME!= null'> 
           HANDLETIME,
        </if>
        <if test='HANDLETYPE!= null'> 
           HANDLETYPE,
        </if>
        <if test='COMMANDID!= null'> 
           COMMANDID
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='DEVICEID!= null'> 
           #{DEVICEID,jdbcType=char}，
        </if>
        <if test='USERID!= null'> 
           #{USERID,jdbcType=varchar}，
        </if>
        <if test='HANDLETIME!= null'> 
           #{HANDLETIME,jdbcType=datetime}，
        </if>
        <if test='HANDLETYPE!= null'> 
           #{HANDLETYPE,jdbcType=smallint}，
        </if>
        <if test='COMMANDID!= null'> 
           #{COMMANDID,jdbcType=char}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:mdm_handlelog_dto):Unit
                


@Delete("DELETE FROM mdm_handlelog WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE mdm_handlelog SET
        ID=#{ID,jdbcType=String},
        DEVICEID=#{DEVICEID,jdbcType=String},
        USERID=#{USERID,jdbcType=String},
        HANDLETIME=#{HANDLETIME,jdbcType=Timestamp},
        HANDLETYPE=#{HANDLETYPE,jdbcType=Integer},
        COMMANDID=#{COMMANDID,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:mdm_handlelog_dto)
        

@Update("""<script>
            UPDATE mdm_handlelog SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="DEVICEID != null">  DEVICEID=#{DEVICEID,jdbcType=String},</if>
        <if test="USERID != null">  USERID=#{USERID,jdbcType=String},</if>
        <if test="HANDLETIME != null">  HANDLETIME=#{HANDLETIME,jdbcType=Timestamp},</if>
        <if test="HANDLETYPE != null">  HANDLETYPE=#{HANDLETYPE,jdbcType=Integer},</if>
        <if test="COMMANDID != null">  COMMANDID=#{COMMANDID,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:mdm_handlelog_dto)
            

}

        
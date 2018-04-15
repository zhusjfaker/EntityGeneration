

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface mdm_warning{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "WARNTIME", column = "WARNTIME"),
   Result(property = "WARNTYPE", column = "WARNTYPE"),
   Result(property = "WARNMSG", column = "WARNMSG"),
   Result(property = "HANDLED", column = "HANDLED")
)
@Select("""<script>
   SELECT * FROM mdm_warning
</script>""")
fun GetListAll():ArrayList<mdm_warning_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "WARNTIME", column = "WARNTIME"),
   Result(property = "WARNTYPE", column = "WARNTYPE"),
   Result(property = "WARNMSG", column = "WARNMSG"),
   Result(property = "HANDLED", column = "HANDLED")
)
@Select("""<script>
   SELECT * FROM mdm_warning
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="DEVICEID!=null">
      DEVICEID=#{DEVICEID}
   </if> 
   <if test="WARNTIME!=null">
      WARNTIME=#{WARNTIME}
   </if> 
   <if test="WARNTYPE!=null">
      WARNTYPE=#{WARNTYPE}
   </if> 
   <if test="WARNMSG!=null">
      WARNMSG=#{WARNMSG}
   </if> 
   <if test="HANDLED!=null">
      HANDLED=#{HANDLED}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:mdm_warning_dto):ArrayList<mdm_warning_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "WARNTIME", column = "WARNTIME"),
   Result(property = "WARNTYPE", column = "WARNTYPE"),
   Result(property = "WARNMSG", column = "WARNMSG"),
   Result(property = "HANDLED", column = "HANDLED")
)
@Select("""<script>
   SELECT * FROM mdm_warning
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:mdm_warning_dto):mdm_warning_dto?
                


@Insert("""<script>
    insert into mdm_warning
    (ID,DEVICEID,WARNTIME,WARNTYPE,WARNMSG,HANDLED)
    values
    (#{ID},#{DEVICEID},#{WARNTIME},#{WARNTYPE},#{WARNMSG},#{HANDLED})
</script>""")
fun Insert(model:mdm_warning_dto):Unit
                


@Insert("""<script>
    insert into mdm_warning
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='DEVICEID!= null'> 
           DEVICEID,
        </if>
        <if test='WARNTIME!= null'> 
           WARNTIME,
        </if>
        <if test='WARNTYPE!= null'> 
           WARNTYPE,
        </if>
        <if test='WARNMSG!= null'> 
           WARNMSG,
        </if>
        <if test='HANDLED!= null'> 
           HANDLED
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='DEVICEID!= null'> 
           #{DEVICEID,jdbcType=char}，
        </if>
        <if test='WARNTIME!= null'> 
           #{WARNTIME,jdbcType=datetime}，
        </if>
        <if test='WARNTYPE!= null'> 
           #{WARNTYPE,jdbcType=smallint}，
        </if>
        <if test='WARNMSG!= null'> 
           #{WARNMSG,jdbcType=varchar}，
        </if>
        <if test='HANDLED!= null'> 
           #{HANDLED,jdbcType=smallint}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:mdm_warning_dto):Unit
                


@Delete("DELETE FROM mdm_warning WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE mdm_warning SET
        ID=#{ID,jdbcType=String},
        DEVICEID=#{DEVICEID,jdbcType=String},
        WARNTIME=#{WARNTIME,jdbcType=Timestamp},
        WARNTYPE=#{WARNTYPE,jdbcType=Integer},
        WARNMSG=#{WARNMSG,jdbcType=String},
        HANDLED=#{HANDLED,jdbcType=Integer}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:mdm_warning_dto)
        

@Update("""<script>
            UPDATE mdm_warning SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="DEVICEID != null">  DEVICEID=#{DEVICEID,jdbcType=String},</if>
        <if test="WARNTIME != null">  WARNTIME=#{WARNTIME,jdbcType=Timestamp},</if>
        <if test="WARNTYPE != null">  WARNTYPE=#{WARNTYPE,jdbcType=Integer},</if>
        <if test="WARNMSG != null">  WARNMSG=#{WARNMSG,jdbcType=String},</if>
        <if test="HANDLED != null">  HANDLED=#{HANDLED,jdbcType=Integer}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:mdm_warning_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface mdm_warning{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "WARNTIME", column = "WARNTIME"),
   Result(property = "WARNTYPE", column = "WARNTYPE"),
   Result(property = "WARNMSG", column = "WARNMSG"),
   Result(property = "HANDLED", column = "HANDLED")
)
@Select("""<script>
   SELECT * FROM mdm_warning
</script>""")
fun GetListAll():ArrayList<mdm_warning_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "WARNTIME", column = "WARNTIME"),
   Result(property = "WARNTYPE", column = "WARNTYPE"),
   Result(property = "WARNMSG", column = "WARNMSG"),
   Result(property = "HANDLED", column = "HANDLED")
)
@Select("""<script>
   SELECT * FROM mdm_warning
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="DEVICEID!=null">
      DEVICEID=#{DEVICEID}
   </if> 
   <if test="WARNTIME!=null">
      WARNTIME=#{WARNTIME}
   </if> 
   <if test="WARNTYPE!=null">
      WARNTYPE=#{WARNTYPE}
   </if> 
   <if test="WARNMSG!=null">
      WARNMSG=#{WARNMSG}
   </if> 
   <if test="HANDLED!=null">
      HANDLED=#{HANDLED}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:mdm_warning_dto):ArrayList<mdm_warning_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "WARNTIME", column = "WARNTIME"),
   Result(property = "WARNTYPE", column = "WARNTYPE"),
   Result(property = "WARNMSG", column = "WARNMSG"),
   Result(property = "HANDLED", column = "HANDLED")
)
@Select("""<script>
   SELECT * FROM mdm_warning
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:mdm_warning_dto):mdm_warning_dto?
                


@Insert("""<script>
    insert into mdm_warning
    (ID,DEVICEID,WARNTIME,WARNTYPE,WARNMSG,HANDLED)
    values
    (#{ID},#{DEVICEID},#{WARNTIME},#{WARNTYPE},#{WARNMSG},#{HANDLED})
</script>""")
fun Insert(model:mdm_warning_dto):Unit
                


@Insert("""<script>
    insert into mdm_warning
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='DEVICEID!= null'> 
           DEVICEID,
        </if>
        <if test='WARNTIME!= null'> 
           WARNTIME,
        </if>
        <if test='WARNTYPE!= null'> 
           WARNTYPE,
        </if>
        <if test='WARNMSG!= null'> 
           WARNMSG,
        </if>
        <if test='HANDLED!= null'> 
           HANDLED
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='DEVICEID!= null'> 
           #{DEVICEID,jdbcType=char}，
        </if>
        <if test='WARNTIME!= null'> 
           #{WARNTIME,jdbcType=datetime}，
        </if>
        <if test='WARNTYPE!= null'> 
           #{WARNTYPE,jdbcType=smallint}，
        </if>
        <if test='WARNMSG!= null'> 
           #{WARNMSG,jdbcType=varchar}，
        </if>
        <if test='HANDLED!= null'> 
           #{HANDLED,jdbcType=smallint}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:mdm_warning_dto):Unit
                


@Delete("DELETE FROM mdm_warning WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE mdm_warning SET
        ID=#{ID,jdbcType=String},
        DEVICEID=#{DEVICEID,jdbcType=String},
        WARNTIME=#{WARNTIME,jdbcType=Timestamp},
        WARNTYPE=#{WARNTYPE,jdbcType=Integer},
        WARNMSG=#{WARNMSG,jdbcType=String},
        HANDLED=#{HANDLED,jdbcType=Integer}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:mdm_warning_dto)
        

@Update("""<script>
            UPDATE mdm_warning SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="DEVICEID != null">  DEVICEID=#{DEVICEID,jdbcType=String},</if>
        <if test="WARNTIME != null">  WARNTIME=#{WARNTIME,jdbcType=Timestamp},</if>
        <if test="WARNTYPE != null">  WARNTYPE=#{WARNTYPE,jdbcType=Integer},</if>
        <if test="WARNMSG != null">  WARNMSG=#{WARNMSG,jdbcType=String},</if>
        <if test="HANDLED != null">  HANDLED=#{HANDLED,jdbcType=Integer}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:mdm_warning_dto)
            

}

        
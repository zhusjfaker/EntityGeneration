

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfh_formprint{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "PRINTTIME", column = "PRINTTIME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "USERNAME", column = "USERNAME"),
   Result(property = "IPADD", column = "IPADD")
)
@Select("""<script>
   SELECT * FROM wfh_formprint
</script>""")
fun GetListAll():ArrayList<wfh_formprint_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "PRINTTIME", column = "PRINTTIME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "USERNAME", column = "USERNAME"),
   Result(property = "IPADD", column = "IPADD")
)
@Select("""<script>
   SELECT * FROM wfh_formprint
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="PROCESSINSTID!=null">
      PROCESSINSTID=#{PROCESSINSTID}
   </if> 
   <if test="TASKINSTID!=null">
      TASKINSTID=#{TASKINSTID}
   </if> 
   <if test="PRINTTIME!=null">
      PRINTTIME=#{PRINTTIME}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="USERNAME!=null">
      USERNAME=#{USERNAME}
   </if> 
   <if test="IPADD!=null">
      IPADD=#{IPADD}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:wfh_formprint_dto):ArrayList<wfh_formprint_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "PRINTTIME", column = "PRINTTIME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "USERNAME", column = "USERNAME"),
   Result(property = "IPADD", column = "IPADD")
)
@Select("""<script>
   SELECT * FROM wfh_formprint
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:wfh_formprint_dto):wfh_formprint_dto?
                


@Insert("""<script>
    insert into wfh_formprint
    (ID,PROCESSINSTID,TASKINSTID,PRINTTIME,USERID,USERNAME,IPADD)
    values
    (#{ID},#{PROCESSINSTID},#{TASKINSTID},#{PRINTTIME},#{USERID},#{USERNAME},#{IPADD})
</script>""")
fun Insert(model:wfh_formprint_dto):Unit
                


@Insert("""<script>
    insert into wfh_formprint
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='PROCESSINSTID!= null'> 
           PROCESSINSTID,
        </if>
        <if test='TASKINSTID!= null'> 
           TASKINSTID,
        </if>
        <if test='PRINTTIME!= null'> 
           PRINTTIME,
        </if>
        <if test='USERID!= null'> 
           USERID,
        </if>
        <if test='USERNAME!= null'> 
           USERNAME,
        </if>
        <if test='IPADD!= null'> 
           IPADD
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='PROCESSINSTID!= null'> 
           #{PROCESSINSTID,jdbcType=char}，
        </if>
        <if test='TASKINSTID!= null'> 
           #{TASKINSTID,jdbcType=char}，
        </if>
        <if test='PRINTTIME!= null'> 
           #{PRINTTIME,jdbcType=datetime}，
        </if>
        <if test='USERID!= null'> 
           #{USERID,jdbcType=varchar}，
        </if>
        <if test='USERNAME!= null'> 
           #{USERNAME,jdbcType=varchar}，
        </if>
        <if test='IPADD!= null'> 
           #{IPADD,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:wfh_formprint_dto):Unit
                


@Delete("DELETE FROM wfh_formprint WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE wfh_formprint SET
        ID=#{ID,jdbcType=String},
        PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},
        TASKINSTID=#{TASKINSTID,jdbcType=String},
        PRINTTIME=#{PRINTTIME,jdbcType=Timestamp},
        USERID=#{USERID,jdbcType=String},
        USERNAME=#{USERNAME,jdbcType=String},
        IPADD=#{IPADD,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:wfh_formprint_dto)
        

@Update("""<script>
            UPDATE wfh_formprint SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="PROCESSINSTID != null">  PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},</if>
        <if test="TASKINSTID != null">  TASKINSTID=#{TASKINSTID,jdbcType=String},</if>
        <if test="PRINTTIME != null">  PRINTTIME=#{PRINTTIME,jdbcType=Timestamp},</if>
        <if test="USERID != null">  USERID=#{USERID,jdbcType=String},</if>
        <if test="USERNAME != null">  USERNAME=#{USERNAME,jdbcType=String},</if>
        <if test="IPADD != null">  IPADD=#{IPADD,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:wfh_formprint_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfh_formprint{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "PRINTTIME", column = "PRINTTIME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "USERNAME", column = "USERNAME"),
   Result(property = "IPADD", column = "IPADD")
)
@Select("""<script>
   SELECT * FROM wfh_formprint
</script>""")
fun GetListAll():ArrayList<wfh_formprint_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "PRINTTIME", column = "PRINTTIME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "USERNAME", column = "USERNAME"),
   Result(property = "IPADD", column = "IPADD")
)
@Select("""<script>
   SELECT * FROM wfh_formprint
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="PROCESSINSTID!=null">
      PROCESSINSTID=#{PROCESSINSTID}
   </if> 
   <if test="TASKINSTID!=null">
      TASKINSTID=#{TASKINSTID}
   </if> 
   <if test="PRINTTIME!=null">
      PRINTTIME=#{PRINTTIME}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="USERNAME!=null">
      USERNAME=#{USERNAME}
   </if> 
   <if test="IPADD!=null">
      IPADD=#{IPADD}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:wfh_formprint_dto):ArrayList<wfh_formprint_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "PRINTTIME", column = "PRINTTIME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "USERNAME", column = "USERNAME"),
   Result(property = "IPADD", column = "IPADD")
)
@Select("""<script>
   SELECT * FROM wfh_formprint
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:wfh_formprint_dto):wfh_formprint_dto?
                


@Insert("""<script>
    insert into wfh_formprint
    (ID,PROCESSINSTID,TASKINSTID,PRINTTIME,USERID,USERNAME,IPADD)
    values
    (#{ID},#{PROCESSINSTID},#{TASKINSTID},#{PRINTTIME},#{USERID},#{USERNAME},#{IPADD})
</script>""")
fun Insert(model:wfh_formprint_dto):Unit
                


@Insert("""<script>
    insert into wfh_formprint
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='PROCESSINSTID!= null'> 
           PROCESSINSTID,
        </if>
        <if test='TASKINSTID!= null'> 
           TASKINSTID,
        </if>
        <if test='PRINTTIME!= null'> 
           PRINTTIME,
        </if>
        <if test='USERID!= null'> 
           USERID,
        </if>
        <if test='USERNAME!= null'> 
           USERNAME,
        </if>
        <if test='IPADD!= null'> 
           IPADD
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='PROCESSINSTID!= null'> 
           #{PROCESSINSTID,jdbcType=char}，
        </if>
        <if test='TASKINSTID!= null'> 
           #{TASKINSTID,jdbcType=char}，
        </if>
        <if test='PRINTTIME!= null'> 
           #{PRINTTIME,jdbcType=datetime}，
        </if>
        <if test='USERID!= null'> 
           #{USERID,jdbcType=varchar}，
        </if>
        <if test='USERNAME!= null'> 
           #{USERNAME,jdbcType=varchar}，
        </if>
        <if test='IPADD!= null'> 
           #{IPADD,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:wfh_formprint_dto):Unit
                


@Delete("DELETE FROM wfh_formprint WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE wfh_formprint SET
        ID=#{ID,jdbcType=String},
        PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},
        TASKINSTID=#{TASKINSTID,jdbcType=String},
        PRINTTIME=#{PRINTTIME,jdbcType=Timestamp},
        USERID=#{USERID,jdbcType=String},
        USERNAME=#{USERNAME,jdbcType=String},
        IPADD=#{IPADD,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:wfh_formprint_dto)
        

@Update("""<script>
            UPDATE wfh_formprint SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="PROCESSINSTID != null">  PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},</if>
        <if test="TASKINSTID != null">  TASKINSTID=#{TASKINSTID,jdbcType=String},</if>
        <if test="PRINTTIME != null">  PRINTTIME=#{PRINTTIME,jdbcType=Timestamp},</if>
        <if test="USERID != null">  USERID=#{USERID,jdbcType=String},</if>
        <if test="USERNAME != null">  USERNAME=#{USERNAME,jdbcType=String},</if>
        <if test="IPADD != null">  IPADD=#{IPADD,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:wfh_formprint_dto)
            

}

        
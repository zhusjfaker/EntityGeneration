

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_pat_batchplan{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BATCHPLANNAME", column = "BATCHPLANNAME"),
   Result(property = "TESTCASEID", column = "TESTCASEID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "BATCHPLANSTATUS", column = "BATCHPLANSTATUS"),
   Result(property = "ENDSTYLE", column = "ENDSTYLE"),
   Result(property = "TESTUSER", column = "TESTUSER"),
   Result(property = "STARTTIME", column = "STARTTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID")
)
@Select("""<script>
   SELECT * FROM app_act_pat_batchplan
</script>""")
fun GetListAll():ArrayList<app_act_pat_batchplan_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BATCHPLANNAME", column = "BATCHPLANNAME"),
   Result(property = "TESTCASEID", column = "TESTCASEID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "BATCHPLANSTATUS", column = "BATCHPLANSTATUS"),
   Result(property = "ENDSTYLE", column = "ENDSTYLE"),
   Result(property = "TESTUSER", column = "TESTUSER"),
   Result(property = "STARTTIME", column = "STARTTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID")
)
@Select("""<script>
   SELECT * FROM app_act_pat_batchplan
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="BATCHPLANNAME!=null">
      BATCHPLANNAME=#{BATCHPLANNAME}
   </if> 
   <if test="TESTCASEID!=null">
      TESTCASEID=#{TESTCASEID}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   <if test="BATCHPLANSTATUS!=null">
      BATCHPLANSTATUS=#{BATCHPLANSTATUS}
   </if> 
   <if test="ENDSTYLE!=null">
      ENDSTYLE=#{ENDSTYLE}
   </if> 
   <if test="TESTUSER!=null">
      TESTUSER=#{TESTUSER}
   </if> 
   <if test="STARTTIME!=null">
      STARTTIME=#{STARTTIME}
   </if> 
   <if test="ENDTIME!=null">
      ENDTIME=#{ENDTIME}
   </if> 
   <if test="BATCHPLANID!=null">
      BATCHPLANID=#{BATCHPLANID}
   </if> 
   <if test="PROCESSDEFID!=null">
      PROCESSDEFID=#{PROCESSDEFID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_pat_batchplan_dto):ArrayList<app_act_pat_batchplan_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BATCHPLANNAME", column = "BATCHPLANNAME"),
   Result(property = "TESTCASEID", column = "TESTCASEID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "BATCHPLANSTATUS", column = "BATCHPLANSTATUS"),
   Result(property = "ENDSTYLE", column = "ENDSTYLE"),
   Result(property = "TESTUSER", column = "TESTUSER"),
   Result(property = "STARTTIME", column = "STARTTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID")
)
@Select("""<script>
   SELECT * FROM app_act_pat_batchplan
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_pat_batchplan_dto):app_act_pat_batchplan_dto?
                


@Insert("""<script>
    insert into app_act_pat_batchplan
    (ID,BATCHPLANNAME,TESTCASEID,CREATEUSER,CREATETIME,BATCHPLANSTATUS,ENDSTYLE,TESTUSER,STARTTIME,ENDTIME,BATCHPLANID,PROCESSDEFID)
    values
    (#{ID},#{BATCHPLANNAME},#{TESTCASEID},#{CREATEUSER},#{CREATETIME},#{BATCHPLANSTATUS},#{ENDSTYLE},#{TESTUSER},#{STARTTIME},#{ENDTIME},#{BATCHPLANID},#{PROCESSDEFID})
</script>""")
fun Insert(model:app_act_pat_batchplan_dto):Unit
                


@Insert("""<script>
    insert into app_act_pat_batchplan
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='BATCHPLANNAME!= null'> 
           BATCHPLANNAME,
        </if>
        <if test='TESTCASEID!= null'> 
           TESTCASEID,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='CREATETIME!= null'> 
           CREATETIME,
        </if>
        <if test='BATCHPLANSTATUS!= null'> 
           BATCHPLANSTATUS,
        </if>
        <if test='ENDSTYLE!= null'> 
           ENDSTYLE,
        </if>
        <if test='TESTUSER!= null'> 
           TESTUSER,
        </if>
        <if test='STARTTIME!= null'> 
           STARTTIME,
        </if>
        <if test='ENDTIME!= null'> 
           ENDTIME,
        </if>
        <if test='BATCHPLANID!= null'> 
           BATCHPLANID,
        </if>
        <if test='PROCESSDEFID!= null'> 
           PROCESSDEFID
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='BATCHPLANNAME!= null'> 
           #{BATCHPLANNAME,jdbcType=varchar}，
        </if>
        <if test='TESTCASEID!= null'> 
           #{TESTCASEID,jdbcType=char}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='CREATETIME!= null'> 
           #{CREATETIME,jdbcType=datetime}，
        </if>
        <if test='BATCHPLANSTATUS!= null'> 
           #{BATCHPLANSTATUS,jdbcType=smallint}，
        </if>
        <if test='ENDSTYLE!= null'> 
           #{ENDSTYLE,jdbcType=smallint}，
        </if>
        <if test='TESTUSER!= null'> 
           #{TESTUSER,jdbcType=varchar}，
        </if>
        <if test='STARTTIME!= null'> 
           #{STARTTIME,jdbcType=datetime}，
        </if>
        <if test='ENDTIME!= null'> 
           #{ENDTIME,jdbcType=datetime}，
        </if>
        <if test='BATCHPLANID!= null'> 
           #{BATCHPLANID,jdbcType=char}，
        </if>
        <if test='PROCESSDEFID!= null'> 
           #{PROCESSDEFID,jdbcType=char}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_pat_batchplan_dto):Unit
                


@Delete("DELETE FROM app_act_pat_batchplan WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE app_act_pat_batchplan SET
        ID=#{ID,jdbcType=String},
        BATCHPLANNAME=#{BATCHPLANNAME,jdbcType=String},
        TESTCASEID=#{TESTCASEID,jdbcType=String},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        CREATETIME=#{CREATETIME,jdbcType=Timestamp},
        BATCHPLANSTATUS=#{BATCHPLANSTATUS,jdbcType=Integer},
        ENDSTYLE=#{ENDSTYLE,jdbcType=Integer},
        TESTUSER=#{TESTUSER,jdbcType=String},
        STARTTIME=#{STARTTIME,jdbcType=Timestamp},
        ENDTIME=#{ENDTIME,jdbcType=Timestamp},
        BATCHPLANID=#{BATCHPLANID,jdbcType=String},
        PROCESSDEFID=#{PROCESSDEFID,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:app_act_pat_batchplan_dto)
        

@Update("""<script>
            UPDATE app_act_pat_batchplan SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="BATCHPLANNAME != null">  BATCHPLANNAME=#{BATCHPLANNAME,jdbcType=String},</if>
        <if test="TESTCASEID != null">  TESTCASEID=#{TESTCASEID,jdbcType=String},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="CREATETIME != null">  CREATETIME=#{CREATETIME,jdbcType=Timestamp},</if>
        <if test="BATCHPLANSTATUS != null">  BATCHPLANSTATUS=#{BATCHPLANSTATUS,jdbcType=Integer},</if>
        <if test="ENDSTYLE != null">  ENDSTYLE=#{ENDSTYLE,jdbcType=Integer},</if>
        <if test="TESTUSER != null">  TESTUSER=#{TESTUSER,jdbcType=String},</if>
        <if test="STARTTIME != null">  STARTTIME=#{STARTTIME,jdbcType=Timestamp},</if>
        <if test="ENDTIME != null">  ENDTIME=#{ENDTIME,jdbcType=Timestamp},</if>
        <if test="BATCHPLANID != null">  BATCHPLANID=#{BATCHPLANID,jdbcType=String},</if>
        <if test="PROCESSDEFID != null">  PROCESSDEFID=#{PROCESSDEFID,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:app_act_pat_batchplan_dto)
            

}

        
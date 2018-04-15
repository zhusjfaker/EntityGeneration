

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_pat_report{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "REPORTNAME", column = "REPORTNAME"),
   Result(property = "TESTCASEID", column = "TESTCASEID"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "DCINFO", column = "DCINFO"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID")
)
@Select("""<script>
   SELECT * FROM app_act_pat_report
</script>""")
fun GetListAll():ArrayList<app_act_pat_report_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "REPORTNAME", column = "REPORTNAME"),
   Result(property = "TESTCASEID", column = "TESTCASEID"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "DCINFO", column = "DCINFO"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID")
)
@Select("""<script>
   SELECT * FROM app_act_pat_report
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="REPORTNAME!=null">
      REPORTNAME=#{REPORTNAME}
   </if> 
   <if test="TESTCASEID!=null">
      TESTCASEID=#{TESTCASEID}
   </if> 
   <if test="BATCHPLANID!=null">
      BATCHPLANID=#{BATCHPLANID}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   <if test="DCINFO!=null">
      DCINFO=#{DCINFO}
   </if> 
   <if test="PROCESSDEFID!=null">
      PROCESSDEFID=#{PROCESSDEFID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_pat_report_dto):ArrayList<app_act_pat_report_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "REPORTNAME", column = "REPORTNAME"),
   Result(property = "TESTCASEID", column = "TESTCASEID"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "DCINFO", column = "DCINFO"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID")
)
@Select("""<script>
   SELECT * FROM app_act_pat_report
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_pat_report_dto):app_act_pat_report_dto?
                


@Insert("""<script>
    insert into app_act_pat_report
    (ID,REPORTNAME,TESTCASEID,BATCHPLANID,CREATEUSER,CREATETIME,DCINFO,PROCESSDEFID)
    values
    (#{ID},#{REPORTNAME},#{TESTCASEID},#{BATCHPLANID},#{CREATEUSER},#{CREATETIME},#{DCINFO},#{PROCESSDEFID})
</script>""")
fun Insert(model:app_act_pat_report_dto):Unit
                


@Insert("""<script>
    insert into app_act_pat_report
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='REPORTNAME!= null'> 
           REPORTNAME,
        </if>
        <if test='TESTCASEID!= null'> 
           TESTCASEID,
        </if>
        <if test='BATCHPLANID!= null'> 
           BATCHPLANID,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='CREATETIME!= null'> 
           CREATETIME,
        </if>
        <if test='DCINFO!= null'> 
           DCINFO,
        </if>
        <if test='PROCESSDEFID!= null'> 
           PROCESSDEFID
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='REPORTNAME!= null'> 
           #{REPORTNAME,jdbcType=varchar}，
        </if>
        <if test='TESTCASEID!= null'> 
           #{TESTCASEID,jdbcType=char}，
        </if>
        <if test='BATCHPLANID!= null'> 
           #{BATCHPLANID,jdbcType=char}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='CREATETIME!= null'> 
           #{CREATETIME,jdbcType=datetime}，
        </if>
        <if test='DCINFO!= null'> 
           #{DCINFO,jdbcType=varchar}，
        </if>
        <if test='PROCESSDEFID!= null'> 
           #{PROCESSDEFID,jdbcType=char}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_pat_report_dto):Unit
                


@Delete("DELETE FROM app_act_pat_report WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE app_act_pat_report SET
        ID=#{ID,jdbcType=String},
        REPORTNAME=#{REPORTNAME,jdbcType=String},
        TESTCASEID=#{TESTCASEID,jdbcType=String},
        BATCHPLANID=#{BATCHPLANID,jdbcType=String},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        CREATETIME=#{CREATETIME,jdbcType=Timestamp},
        DCINFO=#{DCINFO,jdbcType=String},
        PROCESSDEFID=#{PROCESSDEFID,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:app_act_pat_report_dto)
        

@Update("""<script>
            UPDATE app_act_pat_report SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="REPORTNAME != null">  REPORTNAME=#{REPORTNAME,jdbcType=String},</if>
        <if test="TESTCASEID != null">  TESTCASEID=#{TESTCASEID,jdbcType=String},</if>
        <if test="BATCHPLANID != null">  BATCHPLANID=#{BATCHPLANID,jdbcType=String},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="CREATETIME != null">  CREATETIME=#{CREATETIME,jdbcType=Timestamp},</if>
        <if test="DCINFO != null">  DCINFO=#{DCINFO,jdbcType=String},</if>
        <if test="PROCESSDEFID != null">  PROCESSDEFID=#{PROCESSDEFID,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:app_act_pat_report_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_pat_report{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "REPORTNAME", column = "REPORTNAME"),
   Result(property = "TESTCASEID", column = "TESTCASEID"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "DCINFO", column = "DCINFO"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID")
)
@Select("""<script>
   SELECT * FROM app_act_pat_report
</script>""")
fun GetListAll():ArrayList<app_act_pat_report_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "REPORTNAME", column = "REPORTNAME"),
   Result(property = "TESTCASEID", column = "TESTCASEID"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "DCINFO", column = "DCINFO"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID")
)
@Select("""<script>
   SELECT * FROM app_act_pat_report
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="REPORTNAME!=null">
      REPORTNAME=#{REPORTNAME}
   </if> 
   <if test="TESTCASEID!=null">
      TESTCASEID=#{TESTCASEID}
   </if> 
   <if test="BATCHPLANID!=null">
      BATCHPLANID=#{BATCHPLANID}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   <if test="DCINFO!=null">
      DCINFO=#{DCINFO}
   </if> 
   <if test="PROCESSDEFID!=null">
      PROCESSDEFID=#{PROCESSDEFID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_pat_report_dto):ArrayList<app_act_pat_report_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "REPORTNAME", column = "REPORTNAME"),
   Result(property = "TESTCASEID", column = "TESTCASEID"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "DCINFO", column = "DCINFO"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID")
)
@Select("""<script>
   SELECT * FROM app_act_pat_report
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_pat_report_dto):app_act_pat_report_dto?
                


@Insert("""<script>
    insert into app_act_pat_report
    (ID,REPORTNAME,TESTCASEID,BATCHPLANID,CREATEUSER,CREATETIME,DCINFO,PROCESSDEFID)
    values
    (#{ID},#{REPORTNAME},#{TESTCASEID},#{BATCHPLANID},#{CREATEUSER},#{CREATETIME},#{DCINFO},#{PROCESSDEFID})
</script>""")
fun Insert(model:app_act_pat_report_dto):Unit
                


@Insert("""<script>
    insert into app_act_pat_report
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='REPORTNAME!= null'> 
           REPORTNAME,
        </if>
        <if test='TESTCASEID!= null'> 
           TESTCASEID,
        </if>
        <if test='BATCHPLANID!= null'> 
           BATCHPLANID,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='CREATETIME!= null'> 
           CREATETIME,
        </if>
        <if test='DCINFO!= null'> 
           DCINFO,
        </if>
        <if test='PROCESSDEFID!= null'> 
           PROCESSDEFID
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='REPORTNAME!= null'> 
           #{REPORTNAME,jdbcType=varchar}，
        </if>
        <if test='TESTCASEID!= null'> 
           #{TESTCASEID,jdbcType=char}，
        </if>
        <if test='BATCHPLANID!= null'> 
           #{BATCHPLANID,jdbcType=char}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='CREATETIME!= null'> 
           #{CREATETIME,jdbcType=datetime}，
        </if>
        <if test='DCINFO!= null'> 
           #{DCINFO,jdbcType=varchar}，
        </if>
        <if test='PROCESSDEFID!= null'> 
           #{PROCESSDEFID,jdbcType=char}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_pat_report_dto):Unit
                


@Delete("DELETE FROM app_act_pat_report WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE app_act_pat_report SET
        ID=#{ID,jdbcType=String},
        REPORTNAME=#{REPORTNAME,jdbcType=String},
        TESTCASEID=#{TESTCASEID,jdbcType=String},
        BATCHPLANID=#{BATCHPLANID,jdbcType=String},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        CREATETIME=#{CREATETIME,jdbcType=Timestamp},
        DCINFO=#{DCINFO,jdbcType=String},
        PROCESSDEFID=#{PROCESSDEFID,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:app_act_pat_report_dto)
        

@Update("""<script>
            UPDATE app_act_pat_report SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="REPORTNAME != null">  REPORTNAME=#{REPORTNAME,jdbcType=String},</if>
        <if test="TESTCASEID != null">  TESTCASEID=#{TESTCASEID,jdbcType=String},</if>
        <if test="BATCHPLANID != null">  BATCHPLANID=#{BATCHPLANID,jdbcType=String},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="CREATETIME != null">  CREATETIME=#{CREATETIME,jdbcType=Timestamp},</if>
        <if test="DCINFO != null">  DCINFO=#{DCINFO,jdbcType=String},</if>
        <if test="PROCESSDEFID != null">  PROCESSDEFID=#{PROCESSDEFID,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:app_act_pat_report_dto)
            

}

        
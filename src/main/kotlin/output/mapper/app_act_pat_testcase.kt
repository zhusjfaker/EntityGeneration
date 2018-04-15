

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_pat_testcase{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TESTCASENAME", column = "TESTCASENAME"),
   Result(property = "TESTCASEDESC", column = "TESTCASEDESC"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "UPDATEUSER", column = "UPDATEUSER"),
   Result(property = "UPDATETIME", column = "UPDATETIME"),
   Result(property = "EXECUTEUSER", column = "EXECUTEUSER"),
   Result(property = "EXECUTETIME", column = "EXECUTETIME"),
   Result(property = "TESTCASESTATUS", column = "TESTCASESTATUS"),
   Result(property = "DCINFO", column = "DCINFO"),
   Result(property = "ATSTRATEGY", column = "ATSTRATEGY")
)
@Select("""<script>
   SELECT * FROM app_act_pat_testcase
</script>""")
fun GetListAll():ArrayList<app_act_pat_testcase_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TESTCASENAME", column = "TESTCASENAME"),
   Result(property = "TESTCASEDESC", column = "TESTCASEDESC"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "UPDATEUSER", column = "UPDATEUSER"),
   Result(property = "UPDATETIME", column = "UPDATETIME"),
   Result(property = "EXECUTEUSER", column = "EXECUTEUSER"),
   Result(property = "EXECUTETIME", column = "EXECUTETIME"),
   Result(property = "TESTCASESTATUS", column = "TESTCASESTATUS"),
   Result(property = "DCINFO", column = "DCINFO"),
   Result(property = "ATSTRATEGY", column = "ATSTRATEGY")
)
@Select("""<script>
   SELECT * FROM app_act_pat_testcase
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="TESTCASENAME!=null">
      TESTCASENAME=#{TESTCASENAME}
   </if> 
   <if test="TESTCASEDESC!=null">
      TESTCASEDESC=#{TESTCASEDESC}
   </if> 
   <if test="PROCESSDEFID!=null">
      PROCESSDEFID=#{PROCESSDEFID}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   <if test="UPDATEUSER!=null">
      UPDATEUSER=#{UPDATEUSER}
   </if> 
   <if test="UPDATETIME!=null">
      UPDATETIME=#{UPDATETIME}
   </if> 
   <if test="EXECUTEUSER!=null">
      EXECUTEUSER=#{EXECUTEUSER}
   </if> 
   <if test="EXECUTETIME!=null">
      EXECUTETIME=#{EXECUTETIME}
   </if> 
   <if test="TESTCASESTATUS!=null">
      TESTCASESTATUS=#{TESTCASESTATUS}
   </if> 
   <if test="DCINFO!=null">
      DCINFO=#{DCINFO}
   </if> 
   <if test="ATSTRATEGY!=null">
      ATSTRATEGY=#{ATSTRATEGY}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_pat_testcase_dto):ArrayList<app_act_pat_testcase_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TESTCASENAME", column = "TESTCASENAME"),
   Result(property = "TESTCASEDESC", column = "TESTCASEDESC"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "UPDATEUSER", column = "UPDATEUSER"),
   Result(property = "UPDATETIME", column = "UPDATETIME"),
   Result(property = "EXECUTEUSER", column = "EXECUTEUSER"),
   Result(property = "EXECUTETIME", column = "EXECUTETIME"),
   Result(property = "TESTCASESTATUS", column = "TESTCASESTATUS"),
   Result(property = "DCINFO", column = "DCINFO"),
   Result(property = "ATSTRATEGY", column = "ATSTRATEGY")
)
@Select("""<script>
   SELECT * FROM app_act_pat_testcase
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_pat_testcase_dto):app_act_pat_testcase_dto?
                


@Insert("""<script>
    insert into app_act_pat_testcase
    (ID,TESTCASENAME,TESTCASEDESC,PROCESSDEFID,CREATEUSER,CREATETIME,UPDATEUSER,UPDATETIME,EXECUTEUSER,EXECUTETIME,TESTCASESTATUS,DCINFO,ATSTRATEGY)
    values
    (#{ID},#{TESTCASENAME},#{TESTCASEDESC},#{PROCESSDEFID},#{CREATEUSER},#{CREATETIME},#{UPDATEUSER},#{UPDATETIME},#{EXECUTEUSER},#{EXECUTETIME},#{TESTCASESTATUS},#{DCINFO},#{ATSTRATEGY})
</script>""")
fun Insert(model:app_act_pat_testcase_dto):Unit
                


@Insert("""<script>
    insert into app_act_pat_testcase
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='TESTCASENAME!= null'> 
           TESTCASENAME,
        </if>
        <if test='TESTCASEDESC!= null'> 
           TESTCASEDESC,
        </if>
        <if test='PROCESSDEFID!= null'> 
           PROCESSDEFID,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='CREATETIME!= null'> 
           CREATETIME,
        </if>
        <if test='UPDATEUSER!= null'> 
           UPDATEUSER,
        </if>
        <if test='UPDATETIME!= null'> 
           UPDATETIME,
        </if>
        <if test='EXECUTEUSER!= null'> 
           EXECUTEUSER,
        </if>
        <if test='EXECUTETIME!= null'> 
           EXECUTETIME,
        </if>
        <if test='TESTCASESTATUS!= null'> 
           TESTCASESTATUS,
        </if>
        <if test='DCINFO!= null'> 
           DCINFO,
        </if>
        <if test='ATSTRATEGY!= null'> 
           ATSTRATEGY
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='TESTCASENAME!= null'> 
           #{TESTCASENAME,jdbcType=varchar}，
        </if>
        <if test='TESTCASEDESC!= null'> 
           #{TESTCASEDESC,jdbcType=varchar}，
        </if>
        <if test='PROCESSDEFID!= null'> 
           #{PROCESSDEFID,jdbcType=varchar}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='CREATETIME!= null'> 
           #{CREATETIME,jdbcType=datetime}，
        </if>
        <if test='UPDATEUSER!= null'> 
           #{UPDATEUSER,jdbcType=varchar}，
        </if>
        <if test='UPDATETIME!= null'> 
           #{UPDATETIME,jdbcType=datetime}，
        </if>
        <if test='EXECUTEUSER!= null'> 
           #{EXECUTEUSER,jdbcType=varchar}，
        </if>
        <if test='EXECUTETIME!= null'> 
           #{EXECUTETIME,jdbcType=datetime}，
        </if>
        <if test='TESTCASESTATUS!= null'> 
           #{TESTCASESTATUS,jdbcType=smallint}，
        </if>
        <if test='DCINFO!= null'> 
           #{DCINFO,jdbcType=varchar}，
        </if>
        <if test='ATSTRATEGY!= null'> 
           #{ATSTRATEGY,jdbcType=smallint}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_pat_testcase_dto):Unit
                


@Delete("DELETE FROM app_act_pat_testcase WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE app_act_pat_testcase SET
        ID=#{ID,jdbcType=String},
        TESTCASENAME=#{TESTCASENAME,jdbcType=String},
        TESTCASEDESC=#{TESTCASEDESC,jdbcType=String},
        PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        CREATETIME=#{CREATETIME,jdbcType=Timestamp},
        UPDATEUSER=#{UPDATEUSER,jdbcType=String},
        UPDATETIME=#{UPDATETIME,jdbcType=Timestamp},
        EXECUTEUSER=#{EXECUTEUSER,jdbcType=String},
        EXECUTETIME=#{EXECUTETIME,jdbcType=Timestamp},
        TESTCASESTATUS=#{TESTCASESTATUS,jdbcType=Integer},
        DCINFO=#{DCINFO,jdbcType=String},
        ATSTRATEGY=#{ATSTRATEGY,jdbcType=Integer}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:app_act_pat_testcase_dto)
        

@Update("""<script>
            UPDATE app_act_pat_testcase SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="TESTCASENAME != null">  TESTCASENAME=#{TESTCASENAME,jdbcType=String},</if>
        <if test="TESTCASEDESC != null">  TESTCASEDESC=#{TESTCASEDESC,jdbcType=String},</if>
        <if test="PROCESSDEFID != null">  PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="CREATETIME != null">  CREATETIME=#{CREATETIME,jdbcType=Timestamp},</if>
        <if test="UPDATEUSER != null">  UPDATEUSER=#{UPDATEUSER,jdbcType=String},</if>
        <if test="UPDATETIME != null">  UPDATETIME=#{UPDATETIME,jdbcType=Timestamp},</if>
        <if test="EXECUTEUSER != null">  EXECUTEUSER=#{EXECUTEUSER,jdbcType=String},</if>
        <if test="EXECUTETIME != null">  EXECUTETIME=#{EXECUTETIME,jdbcType=Timestamp},</if>
        <if test="TESTCASESTATUS != null">  TESTCASESTATUS=#{TESTCASESTATUS,jdbcType=Integer},</if>
        <if test="DCINFO != null">  DCINFO=#{DCINFO,jdbcType=String},</if>
        <if test="ATSTRATEGY != null">  ATSTRATEGY=#{ATSTRATEGY,jdbcType=Integer}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:app_act_pat_testcase_dto)
            

}

        
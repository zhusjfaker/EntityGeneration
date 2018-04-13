

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_pat_todo{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TODONAME", column = "TODONAME"),
   Result(property = "TESTCASEID", column = "TESTCASEID"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "PLANID", column = "PLANID"),
   Result(property = "PLANPATHID", column = "PLANPATHID"),
   Result(property = "STYLE", column = "STYLE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID")
)
@Select("""<script>
   SELECT * FROM app_act_pat_todo
</script>""")
fun GetListAll():ArrayList<app_act_pat_todo_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TODONAME", column = "TODONAME"),
   Result(property = "TESTCASEID", column = "TESTCASEID"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "PLANID", column = "PLANID"),
   Result(property = "PLANPATHID", column = "PLANPATHID"),
   Result(property = "STYLE", column = "STYLE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID")
)
@Select("""<script>
   SELECT * FROM app_act_pat_todo
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="TODONAME!=null">
      TODONAME=#{TODONAME}
   </if> 
   <if test="TESTCASEID!=null">
      TESTCASEID=#{TESTCASEID}
   </if> 
   <if test="BATCHPLANID!=null">
      BATCHPLANID=#{BATCHPLANID}
   </if> 
   <if test="PLANID!=null">
      PLANID=#{PLANID}
   </if> 
   <if test="PLANPATHID!=null">
      PLANPATHID=#{PLANPATHID}
   </if> 
   <if test="STYLE!=null">
      STYLE=#{STYLE}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   <if test="STATUS!=null">
      STATUS=#{STATUS}
   </if> 
   <if test="PROCESSDEFID!=null">
      PROCESSDEFID=#{PROCESSDEFID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_pat_todo_dto):ArrayList<app_act_pat_todo_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TODONAME", column = "TODONAME"),
   Result(property = "TESTCASEID", column = "TESTCASEID"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "PLANID", column = "PLANID"),
   Result(property = "PLANPATHID", column = "PLANPATHID"),
   Result(property = "STYLE", column = "STYLE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID")
)
@Select("""<script>
   SELECT * FROM app_act_pat_todo
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_pat_todo_dto):app_act_pat_todo_dto?
                


@Insert("""<script>
    insert into app_act_pat_todo
    (ID,TODONAME,TESTCASEID,BATCHPLANID,PLANID,PLANPATHID,STYLE,CREATEUSER,CREATETIME,STATUS,PROCESSDEFID)
    values
    (#{ID},#{TODONAME},#{TESTCASEID},#{BATCHPLANID},#{PLANID},#{PLANPATHID},#{STYLE},#{CREATEUSER},#{CREATETIME},#{STATUS},#{PROCESSDEFID})
</script>""")
fun Insert(model:app_act_pat_todo_dto):Unit
                


@Insert("""<script>
    insert into app_act_pat_todo
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='TODONAME!= null'> 
           TODONAME,
        </if>
        <if test='TESTCASEID!= null'> 
           TESTCASEID,
        </if>
        <if test='BATCHPLANID!= null'> 
           BATCHPLANID,
        </if>
        <if test='PLANID!= null'> 
           PLANID,
        </if>
        <if test='PLANPATHID!= null'> 
           PLANPATHID,
        </if>
        <if test='STYLE!= null'> 
           STYLE,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='CREATETIME!= null'> 
           CREATETIME,
        </if>
        <if test='STATUS!= null'> 
           STATUS,
        </if>
        <if test='PROCESSDEFID!= null'> 
           PROCESSDEFID
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='TODONAME!= null'> 
           #{TODONAME,jdbcType=varchar}，
        </if>
        <if test='TESTCASEID!= null'> 
           #{TESTCASEID,jdbcType=char}，
        </if>
        <if test='BATCHPLANID!= null'> 
           #{BATCHPLANID,jdbcType=char}，
        </if>
        <if test='PLANID!= null'> 
           #{PLANID,jdbcType=char}，
        </if>
        <if test='PLANPATHID!= null'> 
           #{PLANPATHID,jdbcType=char}，
        </if>
        <if test='STYLE!= null'> 
           #{STYLE,jdbcType=smallint}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='CREATETIME!= null'> 
           #{CREATETIME,jdbcType=datetime}，
        </if>
        <if test='STATUS!= null'> 
           #{STATUS,jdbcType=smallint}，
        </if>
        <if test='PROCESSDEFID!= null'> 
           #{PROCESSDEFID,jdbcType=char}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_pat_todo_dto):Unit
                

}

        
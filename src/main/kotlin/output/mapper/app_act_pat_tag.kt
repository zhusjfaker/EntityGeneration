

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_pat_tag{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TAGNAME", column = "TAGNAME"),
   Result(property = "TESTCASEID", column = "TESTCASEID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_pat_tag
</script>""")
fun GetListAll():ArrayList<app_act_pat_tag_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TAGNAME", column = "TAGNAME"),
   Result(property = "TESTCASEID", column = "TESTCASEID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_pat_tag
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="TAGNAME!=null">
      TAGNAME=#{TAGNAME}
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
   </where>
</script>""")
fun ConditionalQuery(model:app_act_pat_tag_dto):ArrayList<app_act_pat_tag_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TAGNAME", column = "TAGNAME"),
   Result(property = "TESTCASEID", column = "TESTCASEID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_pat_tag
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_pat_tag_dto):app_act_pat_tag_dto?
                


@Insert("""<script>
    insert into app_act_pat_tag
    (ID,TAGNAME,TESTCASEID,CREATEUSER,CREATETIME)
    values
    (#{ID},#{TAGNAME},#{TESTCASEID},#{CREATEUSER},#{CREATETIME})
</script>""")
fun Insert(model:app_act_pat_tag_dto):Unit
                


@Insert("""<script>
    insert into app_act_pat_tag
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='TAGNAME!= null'> 
           TAGNAME,
        </if>
        <if test='TESTCASEID!= null'> 
           TESTCASEID,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='CREATETIME!= null'> 
           CREATETIME
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='TAGNAME!= null'> 
           #{TAGNAME,jdbcType=varchar}，
        </if>
        <if test='TESTCASEID!= null'> 
           #{TESTCASEID,jdbcType=char}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='CREATETIME!= null'> 
           #{CREATETIME,jdbcType=datetime}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_pat_tag_dto):Unit
                


@Delete("DELETE FROM app_act_pat_tag WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE app_act_pat_tag SET
        ID=#{ID,jdbcType=String},
        TAGNAME=#{TAGNAME,jdbcType=String},
        TESTCASEID=#{TESTCASEID,jdbcType=String},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        CREATETIME=#{CREATETIME,jdbcType=Timestamp}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:app_act_pat_tag_dto)
        

@Update("""<script>
            UPDATE app_act_pat_tag SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="TAGNAME != null">  TAGNAME=#{TAGNAME,jdbcType=String},</if>
        <if test="TESTCASEID != null">  TESTCASEID=#{TESTCASEID,jdbcType=String},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="CREATETIME != null">  CREATETIME=#{CREATETIME,jdbcType=Timestamp}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:app_act_pat_tag_dto)
            

}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_pat_planremarks{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PLANID", column = "PLANID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "REMARKS", column = "REMARKS"),
   Result(property = "STYLE", column = "STYLE")
)
@Select("""<script>
   SELECT * FROM app_act_pat_planremarks
</script>""")
fun GetListAll():ArrayList<app_act_pat_planremarks_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PLANID", column = "PLANID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "REMARKS", column = "REMARKS"),
   Result(property = "STYLE", column = "STYLE")
)
@Select("""<script>
   SELECT * FROM app_act_pat_planremarks
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="PLANID!=null">
      PLANID=#{PLANID}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   <if test="REMARKS!=null">
      REMARKS=#{REMARKS}
   </if> 
   <if test="STYLE!=null">
      STYLE=#{STYLE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_pat_planremarks_dto):ArrayList<app_act_pat_planremarks_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PLANID", column = "PLANID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "REMARKS", column = "REMARKS"),
   Result(property = "STYLE", column = "STYLE")
)
@Select("""<script>
   SELECT * FROM app_act_pat_planremarks
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_pat_planremarks_dto):app_act_pat_planremarks_dto?
                


@Insert("""<script>
    insert into app_act_pat_planremarks
    (ID,PLANID,CREATEUSER,CREATETIME,REMARKS,STYLE)
    values
    (#{ID},#{PLANID},#{CREATEUSER},#{CREATETIME},#{REMARKS},#{STYLE})
</script>""")
fun Insert(model:app_act_pat_planremarks_dto):Unit
                


@Insert("""<script>
    insert into app_act_pat_planremarks
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='PLANID!= null'> 
           PLANID,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='CREATETIME!= null'> 
           CREATETIME,
        </if>
        <if test='REMARKS!= null'> 
           REMARKS,
        </if>
        <if test='STYLE!= null'> 
           STYLE
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='PLANID!= null'> 
           #{PLANID,jdbcType=char}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='CREATETIME!= null'> 
           #{CREATETIME,jdbcType=datetime}，
        </if>
        <if test='REMARKS!= null'> 
           #{REMARKS,jdbcType=varchar}，
        </if>
        <if test='STYLE!= null'> 
           #{STYLE,jdbcType=smallint}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_pat_planremarks_dto):Unit
                

}

        
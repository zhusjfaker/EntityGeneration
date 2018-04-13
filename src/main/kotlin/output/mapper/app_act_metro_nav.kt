

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_metro_nav{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "FUNCTIONID", column = "FUNCTIONID"),
   Result(property = "ORDERNO", column = "ORDERNO"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_metro_nav
</script>""")
fun GetListAll():ArrayList<app_act_metro_nav_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "FUNCTIONID", column = "FUNCTIONID"),
   Result(property = "ORDERNO", column = "ORDERNO"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_metro_nav
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="FUNCTIONID!=null">
      FUNCTIONID=#{FUNCTIONID}
   </if> 
   <if test="ORDERNO!=null">
      ORDERNO=#{ORDERNO}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_metro_nav_dto):ArrayList<app_act_metro_nav_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "FUNCTIONID", column = "FUNCTIONID"),
   Result(property = "ORDERNO", column = "ORDERNO"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_metro_nav
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_metro_nav_dto):app_act_metro_nav_dto?
                


@Insert("""<script>
    insert into app_act_metro_nav
    (ID,FUNCTIONID,ORDERNO,CREATEUSER,CREATETIME)
    values
    (#{ID},#{FUNCTIONID},#{ORDERNO},#{CREATEUSER},#{CREATETIME})
</script>""")
fun Insert(model:app_act_metro_nav_dto):Unit
                


@Insert("""<script>
    insert into app_act_metro_nav
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='FUNCTIONID!= null'> 
           FUNCTIONID,
        </if>
        <if test='ORDERNO!= null'> 
           ORDERNO,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
           CREATETIME
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='FUNCTIONID!= null'> 
           #{FUNCTIONID,jdbcType=char}，
        </if>
        <if test='ORDERNO!= null'> 
           #{ORDERNO,jdbcType=decimal}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
           #{CREATETIME,jdbcType=datetime}
    </trim>
</script>""")
fun InsertSelective(model:app_act_metro_nav_dto):Unit
                

}

        
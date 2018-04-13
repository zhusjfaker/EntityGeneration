

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_iweboffice_tem{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TYPEID", column = "TYPEID"),
   Result(property = "TEMPLATENAME", column = "TEMPLATENAME"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "ISPAUSE", column = "ISPAUSE")
)
@Select("""<script>
   SELECT * FROM app_act_iweboffice_tem
</script>""")
fun GetListAll():ArrayList<app_act_iweboffice_tem_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TYPEID", column = "TYPEID"),
   Result(property = "TEMPLATENAME", column = "TEMPLATENAME"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "ISPAUSE", column = "ISPAUSE")
)
@Select("""<script>
   SELECT * FROM app_act_iweboffice_tem
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="TYPEID!=null">
      TYPEID=#{TYPEID}
   </if> 
   <if test="TEMPLATENAME!=null">
      TEMPLATENAME=#{TEMPLATENAME}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   <if test="ISPAUSE!=null">
      ISPAUSE=#{ISPAUSE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_iweboffice_tem_dto):ArrayList<app_act_iweboffice_tem_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TYPEID", column = "TYPEID"),
   Result(property = "TEMPLATENAME", column = "TEMPLATENAME"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "ISPAUSE", column = "ISPAUSE")
)
@Select("""<script>
   SELECT * FROM app_act_iweboffice_tem
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_iweboffice_tem_dto):app_act_iweboffice_tem_dto?
                


@Insert("""<script>
    insert into app_act_iweboffice_tem
    (ID,TYPEID,TEMPLATENAME,CREATEUSER,CREATETIME,ISPAUSE)
    values
    (#{ID},#{TYPEID},#{TEMPLATENAME},#{CREATEUSER},#{CREATETIME},#{ISPAUSE})
</script>""")
fun Insert(model:app_act_iweboffice_tem_dto):Unit
                


@Insert("""<script>
    insert into app_act_iweboffice_tem
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='TYPEID!= null'> 
           TYPEID,
        </if>
        <if test='TEMPLATENAME!= null'> 
           TEMPLATENAME,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='CREATETIME!= null'> 
           CREATETIME,
        </if>
        <if test='ISPAUSE!= null'> 
           ISPAUSE
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=varchar}，
        <if test='TYPEID!= null'> 
           #{TYPEID,jdbcType=varchar}，
        </if>
        <if test='TEMPLATENAME!= null'> 
           #{TEMPLATENAME,jdbcType=varchar}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='CREATETIME!= null'> 
           #{CREATETIME,jdbcType=datetime}，
        </if>
        <if test='ISPAUSE!= null'> 
           #{ISPAUSE,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_iweboffice_tem_dto):Unit
                

}

        
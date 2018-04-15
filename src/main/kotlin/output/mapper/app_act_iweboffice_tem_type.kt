

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_iweboffice_tem_type{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TYPENAME", column = "TYPENAME"),
   Result(property = "TYPEDESC", column = "TYPEDESC"),
   Result(property = "POSTFIX", column = "POSTFIX"),
   Result(property = "ISPAUSE", column = "ISPAUSE")
)
@Select("""<script>
   SELECT * FROM app_act_iweboffice_tem_type
</script>""")
fun GetListAll():ArrayList<app_act_iweboffice_tem_type_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TYPENAME", column = "TYPENAME"),
   Result(property = "TYPEDESC", column = "TYPEDESC"),
   Result(property = "POSTFIX", column = "POSTFIX"),
   Result(property = "ISPAUSE", column = "ISPAUSE")
)
@Select("""<script>
   SELECT * FROM app_act_iweboffice_tem_type
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="TYPENAME!=null">
      TYPENAME=#{TYPENAME}
   </if> 
   <if test="TYPEDESC!=null">
      TYPEDESC=#{TYPEDESC}
   </if> 
   <if test="POSTFIX!=null">
      POSTFIX=#{POSTFIX}
   </if> 
   <if test="ISPAUSE!=null">
      ISPAUSE=#{ISPAUSE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_iweboffice_tem_type_dto):ArrayList<app_act_iweboffice_tem_type_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TYPENAME", column = "TYPENAME"),
   Result(property = "TYPEDESC", column = "TYPEDESC"),
   Result(property = "POSTFIX", column = "POSTFIX"),
   Result(property = "ISPAUSE", column = "ISPAUSE")
)
@Select("""<script>
   SELECT * FROM app_act_iweboffice_tem_type
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_iweboffice_tem_type_dto):app_act_iweboffice_tem_type_dto?
                


@Insert("""<script>
    insert into app_act_iweboffice_tem_type
    (ID,TYPENAME,TYPEDESC,POSTFIX,ISPAUSE)
    values
    (#{ID},#{TYPENAME},#{TYPEDESC},#{POSTFIX},#{ISPAUSE})
</script>""")
fun Insert(model:app_act_iweboffice_tem_type_dto):Unit
                


@Insert("""<script>
    insert into app_act_iweboffice_tem_type
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='TYPENAME!= null'> 
           TYPENAME,
        </if>
        <if test='TYPEDESC!= null'> 
           TYPEDESC,
        </if>
        <if test='POSTFIX!= null'> 
           POSTFIX,
        </if>
        <if test='ISPAUSE!= null'> 
           ISPAUSE
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=varchar}，
        <if test='TYPENAME!= null'> 
           #{TYPENAME,jdbcType=varchar}，
        </if>
        <if test='TYPEDESC!= null'> 
           #{TYPEDESC,jdbcType=varchar}，
        </if>
        <if test='POSTFIX!= null'> 
           #{POSTFIX,jdbcType=varchar}，
        </if>
        <if test='ISPAUSE!= null'> 
           #{ISPAUSE,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_iweboffice_tem_type_dto):Unit
                


@Delete("DELETE FROM app_act_iweboffice_tem_type WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE app_act_iweboffice_tem_type SET
        ID=#{ID,jdbcType=String},
        TYPENAME=#{TYPENAME,jdbcType=String},
        TYPEDESC=#{TYPEDESC,jdbcType=String},
        POSTFIX=#{POSTFIX,jdbcType=String},
        ISPAUSE=#{ISPAUSE,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:app_act_iweboffice_tem_type_dto)
        

@Update("""<script>
            UPDATE app_act_iweboffice_tem_type SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="TYPENAME != null">  TYPENAME=#{TYPENAME,jdbcType=String},</if>
        <if test="TYPEDESC != null">  TYPEDESC=#{TYPEDESC,jdbcType=String},</if>
        <if test="POSTFIX != null">  POSTFIX=#{POSTFIX,jdbcType=String},</if>
        <if test="ISPAUSE != null">  ISPAUSE=#{ISPAUSE,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:app_act_iweboffice_tem_type_dto)
            

}

        
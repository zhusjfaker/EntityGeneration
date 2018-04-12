

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
    insert into TStudent
    (ID,TYPENAME,TYPEDESC,POSTFIX,ISPAUSE)
    values
    (#{ID},#{TYPENAME},#{TYPEDESC},#{POSTFIX},#{ISPAUSE})
</script>""")
fun insert(model:app_act_iweboffice_tem_type_dto):Unit
                

}

        
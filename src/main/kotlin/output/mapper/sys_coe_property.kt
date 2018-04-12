

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_property{


@Results(
   Result(property = "PROPERTYKEY", column = "PROPERTYKEY"),
   Result(property = "PROPERTYVALUE", column = "PROPERTYVALUE")
)
@Select("""<script>
   SELECT * FROM sys_coe_property
</script>""")
fun GetListAll():ArrayList<sys_coe_property_dto>
        


@Results(
   Result(property = "PROPERTYKEY", column = "PROPERTYKEY"),
   Result(property = "PROPERTYVALUE", column = "PROPERTYVALUE")
)
@Select("""<script>
   SELECT * FROM sys_coe_property
   <where>
   <if test="PROPERTYKEY!=null">
      PROPERTYKEY=#{PROPERTYKEY}
   </if> 
   <if test="PROPERTYVALUE!=null">
      PROPERTYVALUE=#{PROPERTYVALUE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_property_dto):ArrayList<sys_coe_property_dto>
                


@Results(
   Result(property = "PROPERTYKEY", column = "PROPERTYKEY"),
   Result(property = "PROPERTYVALUE", column = "PROPERTYVALUE")
)
@Select("""<script>
   SELECT * FROM sys_coe_property
   <where>
   <if test="PROPERTYKEY!=null">
      PROPERTYKEY=#{PROPERTYKEY}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_property_dto):sys_coe_property_dto?
                


@Insert("""<script>
    insert into TStudent
    (PROPERTYKEY,PROPERTYVALUE)
    values
    (#{PROPERTYKEY},#{PROPERTYVALUE})
</script>""")
fun insert(model:sys_coe_property_dto):Unit
                

}

        
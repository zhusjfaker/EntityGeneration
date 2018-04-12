

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_property{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PLID", column = "PLID"),
   Result(property = "PROPERTYID", column = "PROPERTYID"),
   Result(property = "PROPERTYNAME", column = "PROPERTYNAME"),
   Result(property = "PROPERTYVALUE", column = "PROPERTYVALUE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_property
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_property_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PLID", column = "PLID"),
   Result(property = "PROPERTYID", column = "PROPERTYID"),
   Result(property = "PROPERTYNAME", column = "PROPERTYNAME"),
   Result(property = "PROPERTYVALUE", column = "PROPERTYVALUE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_property
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="PLID!=null">
      PLID=#{PLID}
   </if> 
   <if test="PROPERTYID!=null">
      PROPERTYID=#{PROPERTYID}
   </if> 
   <if test="PROPERTYNAME!=null">
      PROPERTYNAME=#{PROPERTYNAME}
   </if> 
   <if test="PROPERTYVALUE!=null">
      PROPERTYVALUE=#{PROPERTYVALUE}
   </if> 
   <if test="ORDERINDEX!=null">
      ORDERINDEX=#{ORDERINDEX}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_property_dto):ArrayList<sys_coe_pal_property_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PLID", column = "PLID"),
   Result(property = "PROPERTYID", column = "PROPERTYID"),
   Result(property = "PROPERTYNAME", column = "PROPERTYNAME"),
   Result(property = "PROPERTYVALUE", column = "PROPERTYVALUE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_property
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_property_dto):sys_coe_pal_property_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,PLID,PROPERTYID,PROPERTYNAME,PROPERTYVALUE,ORDERINDEX)
    values
    (#{ID},#{PLID},#{PROPERTYID},#{PROPERTYNAME},#{PROPERTYVALUE},#{ORDERINDEX})
</script>""")
fun insert(model:sys_coe_pal_property_dto):Unit
                

}

        
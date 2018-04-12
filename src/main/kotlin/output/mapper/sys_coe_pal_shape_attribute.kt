

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_shape_attribute{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "ATTRID", column = "ATTRID"),
   Result(property = "ATTRNAME", column = "ATTRNAME"),
   Result(property = "ATTRVALUE", column = "ATTRVALUE"),
   Result(property = "CATEGORY", column = "CATEGORY"),
   Result(property = "METHODID", column = "METHODID"),
   Result(property = "TYPE", column = "TYPE"),
   Result(property = "SHAPENAME", column = "SHAPENAME")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_shape_attribute
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_shape_attribute_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "ATTRID", column = "ATTRID"),
   Result(property = "ATTRNAME", column = "ATTRNAME"),
   Result(property = "ATTRVALUE", column = "ATTRVALUE"),
   Result(property = "CATEGORY", column = "CATEGORY"),
   Result(property = "METHODID", column = "METHODID"),
   Result(property = "TYPE", column = "TYPE"),
   Result(property = "SHAPENAME", column = "SHAPENAME")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_shape_attribute
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="WSID!=null">
      WSID=#{WSID}
   </if> 
   <if test="ATTRID!=null">
      ATTRID=#{ATTRID}
   </if> 
   <if test="ATTRNAME!=null">
      ATTRNAME=#{ATTRNAME}
   </if> 
   <if test="ATTRVALUE!=null">
      ATTRVALUE=#{ATTRVALUE}
   </if> 
   <if test="CATEGORY!=null">
      CATEGORY=#{CATEGORY}
   </if> 
   <if test="METHODID!=null">
      METHODID=#{METHODID}
   </if> 
   <if test="TYPE!=null">
      TYPE=#{TYPE}
   </if> 
   <if test="SHAPENAME!=null">
      SHAPENAME=#{SHAPENAME}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_shape_attribute_dto):ArrayList<sys_coe_pal_shape_attribute_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "ATTRID", column = "ATTRID"),
   Result(property = "ATTRNAME", column = "ATTRNAME"),
   Result(property = "ATTRVALUE", column = "ATTRVALUE"),
   Result(property = "CATEGORY", column = "CATEGORY"),
   Result(property = "METHODID", column = "METHODID"),
   Result(property = "TYPE", column = "TYPE"),
   Result(property = "SHAPENAME", column = "SHAPENAME")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_shape_attribute
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_shape_attribute_dto):sys_coe_pal_shape_attribute_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,WSID,ATTRID,ATTRNAME,ATTRVALUE,CATEGORY,METHODID,TYPE,SHAPENAME)
    values
    (#{ID},#{WSID},#{ATTRID},#{ATTRNAME},#{ATTRVALUE},#{CATEGORY},#{METHODID},#{TYPE},#{SHAPENAME})
</script>""")
fun insert(model:sys_coe_pal_shape_attribute_dto):Unit
                

}

        
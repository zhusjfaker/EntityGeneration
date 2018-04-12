

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_shape_copy{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SHAPEGROUPTID", column = "SHAPEGROUPTID"),
   Result(property = "SHAPENAME", column = "SHAPENAME"),
   Result(property = "SHAPECATEGORYNAME", column = "SHAPECATEGORYNAME"),
   Result(property = "PALREPOSITORYID", column = "PALREPOSITORYID"),
   Result(property = "ISDELETE", column = "ISDELETE"),
   Result(property = "SHAPETYPE", column = "SHAPETYPE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_shape_copy
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_shape_copy_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SHAPEGROUPTID", column = "SHAPEGROUPTID"),
   Result(property = "SHAPENAME", column = "SHAPENAME"),
   Result(property = "SHAPECATEGORYNAME", column = "SHAPECATEGORYNAME"),
   Result(property = "PALREPOSITORYID", column = "PALREPOSITORYID"),
   Result(property = "ISDELETE", column = "ISDELETE"),
   Result(property = "SHAPETYPE", column = "SHAPETYPE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_shape_copy
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="SHAPEGROUPTID!=null">
      SHAPEGROUPTID=#{SHAPEGROUPTID}
   </if> 
   <if test="SHAPENAME!=null">
      SHAPENAME=#{SHAPENAME}
   </if> 
   <if test="SHAPECATEGORYNAME!=null">
      SHAPECATEGORYNAME=#{SHAPECATEGORYNAME}
   </if> 
   <if test="PALREPOSITORYID!=null">
      PALREPOSITORYID=#{PALREPOSITORYID}
   </if> 
   <if test="ISDELETE!=null">
      ISDELETE=#{ISDELETE}
   </if> 
   <if test="SHAPETYPE!=null">
      SHAPETYPE=#{SHAPETYPE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_shape_copy_dto):ArrayList<sys_coe_pal_shape_copy_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SHAPEGROUPTID", column = "SHAPEGROUPTID"),
   Result(property = "SHAPENAME", column = "SHAPENAME"),
   Result(property = "SHAPECATEGORYNAME", column = "SHAPECATEGORYNAME"),
   Result(property = "PALREPOSITORYID", column = "PALREPOSITORYID"),
   Result(property = "ISDELETE", column = "ISDELETE"),
   Result(property = "SHAPETYPE", column = "SHAPETYPE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_shape_copy
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_shape_copy_dto):sys_coe_pal_shape_copy_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,SHAPEGROUPTID,SHAPENAME,SHAPECATEGORYNAME,PALREPOSITORYID,ISDELETE,SHAPETYPE)
    values
    (#{ID},#{SHAPEGROUPTID},#{SHAPENAME},#{SHAPECATEGORYNAME},#{PALREPOSITORYID},#{ISDELETE},#{SHAPETYPE})
</script>""")
fun insert(model:sys_coe_pal_shape_copy_dto):Unit
                

}

        
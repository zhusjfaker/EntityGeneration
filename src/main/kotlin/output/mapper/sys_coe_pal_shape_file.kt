

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_shape_file{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PALREPOSITORYID", column = "PALREPOSITORYID")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_shape_file
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_shape_file_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PALREPOSITORYID", column = "PALREPOSITORYID")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_shape_file
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="PALREPOSITORYID!=null">
      PALREPOSITORYID=#{PALREPOSITORYID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_shape_file_dto):ArrayList<sys_coe_pal_shape_file_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PALREPOSITORYID", column = "PALREPOSITORYID")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_shape_file
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_shape_file_dto):sys_coe_pal_shape_file_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,PALREPOSITORYID)
    values
    (#{ID},#{PALREPOSITORYID})
</script>""")
fun insert(model:sys_coe_pal_shape_file_dto):Unit
                

}

        
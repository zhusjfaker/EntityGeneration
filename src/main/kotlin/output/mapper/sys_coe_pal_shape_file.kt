

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
    insert into sys_coe_pal_shape_file
    (ID,PALREPOSITORYID)
    values
    (#{ID},#{PALREPOSITORYID})
</script>""")
fun Insert(model:sys_coe_pal_shape_file_dto):Unit
                


@Insert("""<script>
    insert into sys_coe_pal_shape_file
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='PALREPOSITORYID!= null'> 
           PALREPOSITORYID
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=varchar}，
        <if test='PALREPOSITORYID!= null'> 
           #{PALREPOSITORYID,jdbcType=char}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_coe_pal_shape_file_dto):Unit
                

}

        
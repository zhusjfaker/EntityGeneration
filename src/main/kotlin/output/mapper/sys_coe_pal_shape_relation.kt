

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_shape_relation{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "FILEID", column = "FILEID"),
   Result(property = "SHAPEID", column = "SHAPEID"),
   Result(property = "SHAPETEXT", column = "SHAPETEXT"),
   Result(property = "ATTRID", column = "ATTRID"),
   Result(property = "RELATIONFILEID", column = "RELATIONFILEID"),
   Result(property = "RELATIONSHAPEID", column = "RELATIONSHAPEID"),
   Result(property = "RELATIONSHAPETEXT", column = "RELATIONSHAPETEXT")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_shape_relation
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_shape_relation_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "FILEID", column = "FILEID"),
   Result(property = "SHAPEID", column = "SHAPEID"),
   Result(property = "SHAPETEXT", column = "SHAPETEXT"),
   Result(property = "ATTRID", column = "ATTRID"),
   Result(property = "RELATIONFILEID", column = "RELATIONFILEID"),
   Result(property = "RELATIONSHAPEID", column = "RELATIONSHAPEID"),
   Result(property = "RELATIONSHAPETEXT", column = "RELATIONSHAPETEXT")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_shape_relation
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="FILEID!=null">
      FILEID=#{FILEID}
   </if> 
   <if test="SHAPEID!=null">
      SHAPEID=#{SHAPEID}
   </if> 
   <if test="SHAPETEXT!=null">
      SHAPETEXT=#{SHAPETEXT}
   </if> 
   <if test="ATTRID!=null">
      ATTRID=#{ATTRID}
   </if> 
   <if test="RELATIONFILEID!=null">
      RELATIONFILEID=#{RELATIONFILEID}
   </if> 
   <if test="RELATIONSHAPEID!=null">
      RELATIONSHAPEID=#{RELATIONSHAPEID}
   </if> 
   <if test="RELATIONSHAPETEXT!=null">
      RELATIONSHAPETEXT=#{RELATIONSHAPETEXT}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_shape_relation_dto):ArrayList<sys_coe_pal_shape_relation_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "FILEID", column = "FILEID"),
   Result(property = "SHAPEID", column = "SHAPEID"),
   Result(property = "SHAPETEXT", column = "SHAPETEXT"),
   Result(property = "ATTRID", column = "ATTRID"),
   Result(property = "RELATIONFILEID", column = "RELATIONFILEID"),
   Result(property = "RELATIONSHAPEID", column = "RELATIONSHAPEID"),
   Result(property = "RELATIONSHAPETEXT", column = "RELATIONSHAPETEXT")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_shape_relation
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_shape_relation_dto):sys_coe_pal_shape_relation_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,FILEID,SHAPEID,SHAPETEXT,ATTRID,RELATIONFILEID,RELATIONSHAPEID,RELATIONSHAPETEXT)
    values
    (#{ID},#{FILEID},#{SHAPEID},#{SHAPETEXT},#{ATTRID},#{RELATIONFILEID},#{RELATIONSHAPEID},#{RELATIONSHAPETEXT})
</script>""")
fun insert(model:sys_coe_pal_shape_relation_dto):Unit
                

}

        
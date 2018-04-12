

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface vorgdept{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEPARTMENTNAME", column = "DEPARTMENTNAME"),
   Result(property = "UNITID", column = "UNITID"),
   Result(property = "PARENTDEPARTMENTID", column = "PARENTDEPARTMENTID"),
   Result(property = "DEPARTMENTNO", column = "DEPARTMENTNO"),
   Result(property = "LAYER", column = "LAYER"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "ADMINISTRATORS", column = "ADMINISTRATORS")
)
@Select("""<script>
   SELECT * FROM vorgdept
</script>""")
fun GetListAll():ArrayList<vorgdept_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEPARTMENTNAME", column = "DEPARTMENTNAME"),
   Result(property = "UNITID", column = "UNITID"),
   Result(property = "PARENTDEPARTMENTID", column = "PARENTDEPARTMENTID"),
   Result(property = "DEPARTMENTNO", column = "DEPARTMENTNO"),
   Result(property = "LAYER", column = "LAYER"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "ADMINISTRATORS", column = "ADMINISTRATORS")
)
@Select("""<script>
   SELECT * FROM vorgdept
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="DEPARTMENTNAME!=null">
      DEPARTMENTNAME=#{DEPARTMENTNAME}
   </if> 
   <if test="UNITID!=null">
      UNITID=#{UNITID}
   </if> 
   <if test="PARENTDEPARTMENTID!=null">
      PARENTDEPARTMENTID=#{PARENTDEPARTMENTID}
   </if> 
   <if test="DEPARTMENTNO!=null">
      DEPARTMENTNO=#{DEPARTMENTNO}
   </if> 
   <if test="LAYER!=null">
      LAYER=#{LAYER}
   </if> 
   <if test="ORDERINDEX!=null">
      ORDERINDEX=#{ORDERINDEX}
   </if> 
   <if test="EXT1!=null">
      EXT1=#{EXT1}
   </if> 
   <if test="EXT2!=null">
      EXT2=#{EXT2}
   </if> 
   <if test="EXT3!=null">
      EXT3=#{EXT3}
   </if> 
   <if test="EXT4!=null">
      EXT4=#{EXT4}
   </if> 
   <if test="EXT5!=null">
      EXT5=#{EXT5}
   </if> 
   <if test="ADMINISTRATORS!=null">
      ADMINISTRATORS=#{ADMINISTRATORS}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:vorgdept_dto):ArrayList<vorgdept_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEPARTMENTNAME", column = "DEPARTMENTNAME"),
   Result(property = "UNITID", column = "UNITID"),
   Result(property = "PARENTDEPARTMENTID", column = "PARENTDEPARTMENTID"),
   Result(property = "DEPARTMENTNO", column = "DEPARTMENTNO"),
   Result(property = "LAYER", column = "LAYER"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "ADMINISTRATORS", column = "ADMINISTRATORS")
)
@Select("""<script>
   SELECT * FROM vorgdept
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:vorgdept_dto):vorgdept_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,DEPARTMENTNAME,UNITID,PARENTDEPARTMENTID,DEPARTMENTNO,LAYER,ORDERINDEX,EXT1,EXT2,EXT3,EXT4,EXT5,ADMINISTRATORS)
    values
    (#{ID},#{DEPARTMENTNAME},#{UNITID},#{PARENTDEPARTMENTID},#{DEPARTMENTNO},#{LAYER},#{ORDERINDEX},#{EXT1},#{EXT2},#{EXT3},#{EXT4},#{EXT5},#{ADMINISTRATORS})
</script>""")
fun insert(model:vorgdept_dto):Unit
                

}

        
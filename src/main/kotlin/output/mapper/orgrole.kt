

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface orgrole{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ROLENAME", column = "ROLENAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "CATEGORYNAME", column = "CATEGORYNAME"),
   Result(property = "LOOKANDFEEL", column = "LOOKANDFEEL"),
   Result(property = "ROLENO", column = "ROLENO"),
   Result(property = "ROLEDESC", column = "ROLEDESC"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE")
)
@Select("""<script>
   SELECT * FROM orgrole
</script>""")
fun GetListAll():ArrayList<orgrole_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ROLENAME", column = "ROLENAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "CATEGORYNAME", column = "CATEGORYNAME"),
   Result(property = "LOOKANDFEEL", column = "LOOKANDFEEL"),
   Result(property = "ROLENO", column = "ROLENO"),
   Result(property = "ROLEDESC", column = "ROLEDESC"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE")
)
@Select("""<script>
   SELECT * FROM orgrole
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="ROLENAME!=null">
      ROLENAME=#{ROLENAME}
   </if> 
   <if test="ORDERINDEX!=null">
      ORDERINDEX=#{ORDERINDEX}
   </if> 
   <if test="CATEGORYNAME!=null">
      CATEGORYNAME=#{CATEGORYNAME}
   </if> 
   <if test="LOOKANDFEEL!=null">
      LOOKANDFEEL=#{LOOKANDFEEL}
   </if> 
   <if test="ROLENO!=null">
      ROLENO=#{ROLENO}
   </if> 
   <if test="ROLEDESC!=null">
      ROLEDESC=#{ROLEDESC}
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
   <if test="CREATEDATE!=null">
      CREATEDATE=#{CREATEDATE}
   </if> 
   <if test="UPDATEDATE!=null">
      UPDATEDATE=#{UPDATEDATE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:orgrole_dto):ArrayList<orgrole_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ROLENAME", column = "ROLENAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "CATEGORYNAME", column = "CATEGORYNAME"),
   Result(property = "LOOKANDFEEL", column = "LOOKANDFEEL"),
   Result(property = "ROLENO", column = "ROLENO"),
   Result(property = "ROLEDESC", column = "ROLEDESC"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE")
)
@Select("""<script>
   SELECT * FROM orgrole
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:orgrole_dto):orgrole_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,ROLENAME,ORDERINDEX,CATEGORYNAME,LOOKANDFEEL,ROLENO,ROLEDESC,EXT1,EXT2,EXT3,EXT4,EXT5,CREATEDATE,UPDATEDATE)
    values
    (#{ID},#{ROLENAME},#{ORDERINDEX},#{CATEGORYNAME},#{LOOKANDFEEL},#{ROLENO},#{ROLEDESC},#{EXT1},#{EXT2},#{EXT3},#{EXT4},#{EXT5},#{CREATEDATE},#{UPDATEDATE})
</script>""")
fun insert(model:orgrole_dto):Unit
                

}

        
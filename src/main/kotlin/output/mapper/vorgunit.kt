

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface vorgunit{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "RDEPTID", column = "RDEPTID"),
   Result(property = "UNITNAME", column = "UNITNAME"),
   Result(property = "ADMINISTRATORS", column = "ADMINISTRATORS"),
   Result(property = "UNITGROUP", column = "UNITGROUP"),
   Result(property = "UNITDESC", column = "UNITDESC"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5")
)
@Select("""<script>
   SELECT * FROM vorgunit
</script>""")
fun GetListAll():ArrayList<vorgunit_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "RDEPTID", column = "RDEPTID"),
   Result(property = "UNITNAME", column = "UNITNAME"),
   Result(property = "ADMINISTRATORS", column = "ADMINISTRATORS"),
   Result(property = "UNITGROUP", column = "UNITGROUP"),
   Result(property = "UNITDESC", column = "UNITDESC"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5")
)
@Select("""<script>
   SELECT * FROM vorgunit
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="RDEPTID!=null">
      RDEPTID=#{RDEPTID}
   </if> 
   <if test="UNITNAME!=null">
      UNITNAME=#{UNITNAME}
   </if> 
   <if test="ADMINISTRATORS!=null">
      ADMINISTRATORS=#{ADMINISTRATORS}
   </if> 
   <if test="UNITGROUP!=null">
      UNITGROUP=#{UNITGROUP}
   </if> 
   <if test="UNITDESC!=null">
      UNITDESC=#{UNITDESC}
   </if> 
   <if test="STATUS!=null">
      STATUS=#{STATUS}
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
   </where>
</script>""")
fun ConditionalQuery(model:vorgunit_dto):ArrayList<vorgunit_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "RDEPTID", column = "RDEPTID"),
   Result(property = "UNITNAME", column = "UNITNAME"),
   Result(property = "ADMINISTRATORS", column = "ADMINISTRATORS"),
   Result(property = "UNITGROUP", column = "UNITGROUP"),
   Result(property = "UNITDESC", column = "UNITDESC"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5")
)
@Select("""<script>
   SELECT * FROM vorgunit
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:vorgunit_dto):vorgunit_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,RDEPTID,UNITNAME,ADMINISTRATORS,UNITGROUP,UNITDESC,STATUS,EXT1,EXT2,EXT3,EXT4,EXT5)
    values
    (#{ID},#{RDEPTID},#{UNITNAME},#{ADMINISTRATORS},#{UNITGROUP},#{UNITDESC},#{STATUS},#{EXT1},#{EXT2},#{EXT3},#{EXT4},#{EXT5})
</script>""")
fun insert(model:vorgunit_dto):Unit
                

}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_function_access{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "CATEGORYTYPE", column = "CATEGORYTYPE"),
   Result(property = "ACCESSUSER", column = "ACCESSUSER"),
   Result(property = "ACCESSTIME", column = "ACCESSTIME"),
   Result(property = "RESOURCETYPE", column = "RESOURCETYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2")
)
@Select("""<script>
   SELECT * FROM sys_function_access
</script>""")
fun GetListAll():ArrayList<sys_function_access_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "CATEGORYTYPE", column = "CATEGORYTYPE"),
   Result(property = "ACCESSUSER", column = "ACCESSUSER"),
   Result(property = "ACCESSTIME", column = "ACCESSTIME"),
   Result(property = "RESOURCETYPE", column = "RESOURCETYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2")
)
@Select("""<script>
   SELECT * FROM sys_function_access
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="CATEGORYTYPE!=null">
      CATEGORYTYPE=#{CATEGORYTYPE}
   </if> 
   <if test="ACCESSUSER!=null">
      ACCESSUSER=#{ACCESSUSER}
   </if> 
   <if test="ACCESSTIME!=null">
      ACCESSTIME=#{ACCESSTIME}
   </if> 
   <if test="RESOURCETYPE!=null">
      RESOURCETYPE=#{RESOURCETYPE}
   </if> 
   <if test="RESOURCEID!=null">
      RESOURCEID=#{RESOURCEID}
   </if> 
   <if test="EXT1!=null">
      EXT1=#{EXT1}
   </if> 
   <if test="EXT2!=null">
      EXT2=#{EXT2}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_function_access_dto):ArrayList<sys_function_access_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "CATEGORYTYPE", column = "CATEGORYTYPE"),
   Result(property = "ACCESSUSER", column = "ACCESSUSER"),
   Result(property = "ACCESSTIME", column = "ACCESSTIME"),
   Result(property = "RESOURCETYPE", column = "RESOURCETYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2")
)
@Select("""<script>
   SELECT * FROM sys_function_access
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_function_access_dto):sys_function_access_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,CATEGORYTYPE,ACCESSUSER,ACCESSTIME,RESOURCETYPE,RESOURCEID,EXT1,EXT2)
    values
    (#{ID},#{CATEGORYTYPE},#{ACCESSUSER},#{ACCESSTIME},#{RESOURCETYPE},#{RESOURCEID},#{EXT1},#{EXT2})
</script>""")
fun insert(model:sys_function_access_dto):Unit
                

}

        
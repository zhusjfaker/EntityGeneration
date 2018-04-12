

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface mdm_ios_command{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "COMMAND", column = "COMMAND"),
   Result(property = "DEVICEUDID", column = "DEVICEUDID"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "UPDATETIME", column = "UPDATETIME"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "IOSMDM", column = "IOSMDM")
)
@Select("""<script>
   SELECT * FROM mdm_ios_command
</script>""")
fun GetListAll():ArrayList<mdm_ios_command_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "COMMAND", column = "COMMAND"),
   Result(property = "DEVICEUDID", column = "DEVICEUDID"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "UPDATETIME", column = "UPDATETIME"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "IOSMDM", column = "IOSMDM")
)
@Select("""<script>
   SELECT * FROM mdm_ios_command
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="COMMAND!=null">
      COMMAND=#{COMMAND}
   </if> 
   <if test="DEVICEUDID!=null">
      DEVICEUDID=#{DEVICEUDID}
   </if> 
   <if test="STATUS!=null">
      STATUS=#{STATUS}
   </if> 
   <if test="UPDATETIME!=null">
      UPDATETIME=#{UPDATETIME}
   </if> 
   <if test="EXT1!=null">
      EXT1=#{EXT1}
   </if> 
   <if test="EXT2!=null">
      EXT2=#{EXT2}
   </if> 
   <if test="IOSMDM!=null">
      IOSMDM=#{IOSMDM}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:mdm_ios_command_dto):ArrayList<mdm_ios_command_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "COMMAND", column = "COMMAND"),
   Result(property = "DEVICEUDID", column = "DEVICEUDID"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "UPDATETIME", column = "UPDATETIME"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "IOSMDM", column = "IOSMDM")
)
@Select("""<script>
   SELECT * FROM mdm_ios_command
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:mdm_ios_command_dto):mdm_ios_command_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,COMMAND,DEVICEUDID,STATUS,UPDATETIME,EXT1,EXT2,IOSMDM)
    values
    (#{ID},#{COMMAND},#{DEVICEUDID},#{STATUS},#{UPDATETIME},#{EXT1},#{EXT2},#{IOSMDM})
</script>""")
fun insert(model:mdm_ios_command_dto):Unit
                

}

        
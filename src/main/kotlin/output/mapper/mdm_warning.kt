

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface mdm_warning{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "WARNTIME", column = "WARNTIME"),
   Result(property = "WARNTYPE", column = "WARNTYPE"),
   Result(property = "WARNMSG", column = "WARNMSG"),
   Result(property = "HANDLED", column = "HANDLED")
)
@Select("""<script>
   SELECT * FROM mdm_warning
</script>""")
fun GetListAll():ArrayList<mdm_warning_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "WARNTIME", column = "WARNTIME"),
   Result(property = "WARNTYPE", column = "WARNTYPE"),
   Result(property = "WARNMSG", column = "WARNMSG"),
   Result(property = "HANDLED", column = "HANDLED")
)
@Select("""<script>
   SELECT * FROM mdm_warning
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="DEVICEID!=null">
      DEVICEID=#{DEVICEID}
   </if> 
   <if test="WARNTIME!=null">
      WARNTIME=#{WARNTIME}
   </if> 
   <if test="WARNTYPE!=null">
      WARNTYPE=#{WARNTYPE}
   </if> 
   <if test="WARNMSG!=null">
      WARNMSG=#{WARNMSG}
   </if> 
   <if test="HANDLED!=null">
      HANDLED=#{HANDLED}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:mdm_warning_dto):ArrayList<mdm_warning_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "WARNTIME", column = "WARNTIME"),
   Result(property = "WARNTYPE", column = "WARNTYPE"),
   Result(property = "WARNMSG", column = "WARNMSG"),
   Result(property = "HANDLED", column = "HANDLED")
)
@Select("""<script>
   SELECT * FROM mdm_warning
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:mdm_warning_dto):mdm_warning_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,DEVICEID,WARNTIME,WARNTYPE,WARNMSG,HANDLED)
    values
    (#{ID},#{DEVICEID},#{WARNTIME},#{WARNTYPE},#{WARNMSG},#{HANDLED})
</script>""")
fun insert(model:mdm_warning_dto):Unit
                

}

        
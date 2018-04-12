

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface mdm_handlelog{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "HANDLETIME", column = "HANDLETIME"),
   Result(property = "HANDLETYPE", column = "HANDLETYPE"),
   Result(property = "COMMANDID", column = "COMMANDID")
)
@Select("""<script>
   SELECT * FROM mdm_handlelog
</script>""")
fun GetListAll():ArrayList<mdm_handlelog_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "HANDLETIME", column = "HANDLETIME"),
   Result(property = "HANDLETYPE", column = "HANDLETYPE"),
   Result(property = "COMMANDID", column = "COMMANDID")
)
@Select("""<script>
   SELECT * FROM mdm_handlelog
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="DEVICEID!=null">
      DEVICEID=#{DEVICEID}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="HANDLETIME!=null">
      HANDLETIME=#{HANDLETIME}
   </if> 
   <if test="HANDLETYPE!=null">
      HANDLETYPE=#{HANDLETYPE}
   </if> 
   <if test="COMMANDID!=null">
      COMMANDID=#{COMMANDID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:mdm_handlelog_dto):ArrayList<mdm_handlelog_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "HANDLETIME", column = "HANDLETIME"),
   Result(property = "HANDLETYPE", column = "HANDLETYPE"),
   Result(property = "COMMANDID", column = "COMMANDID")
)
@Select("""<script>
   SELECT * FROM mdm_handlelog
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:mdm_handlelog_dto):mdm_handlelog_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,DEVICEID,USERID,HANDLETIME,HANDLETYPE,COMMANDID)
    values
    (#{ID},#{DEVICEID},#{USERID},#{HANDLETIME},#{HANDLETYPE},#{COMMANDID})
</script>""")
fun insert(model:mdm_handlelog_dto):Unit
                

}

        
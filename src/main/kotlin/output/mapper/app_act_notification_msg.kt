

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_notification_msg{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "REGISTERID", column = "REGISTERID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "OWNERID", column = "OWNERID"),
   Result(property = "TARGETID", column = "TARGETID"),
   Result(property = "NOTIFYCONTENT", column = "NOTIFYCONTENT"),
   Result(property = "NOTIFYLEVEL", column = "NOTIFYLEVEL"),
   Result(property = "ISCLOSE", column = "ISCLOSE"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "ISSTORE", column = "ISSTORE"),
   Result(property = "READTIME", column = "READTIME"),
   Result(property = "READED", column = "READED"),
   Result(property = "SOURCEID", column = "SOURCEID")
)
@Select("""<script>
   SELECT * FROM app_act_notification_msg
</script>""")
fun GetListAll():ArrayList<app_act_notification_msg_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "REGISTERID", column = "REGISTERID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "OWNERID", column = "OWNERID"),
   Result(property = "TARGETID", column = "TARGETID"),
   Result(property = "NOTIFYCONTENT", column = "NOTIFYCONTENT"),
   Result(property = "NOTIFYLEVEL", column = "NOTIFYLEVEL"),
   Result(property = "ISCLOSE", column = "ISCLOSE"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "ISSTORE", column = "ISSTORE"),
   Result(property = "READTIME", column = "READTIME"),
   Result(property = "READED", column = "READED"),
   Result(property = "SOURCEID", column = "SOURCEID")
)
@Select("""<script>
   SELECT * FROM app_act_notification_msg
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="REGISTERID!=null">
      REGISTERID=#{REGISTERID}
   </if> 
   <if test="APPID!=null">
      APPID=#{APPID}
   </if> 
   <if test="OWNERID!=null">
      OWNERID=#{OWNERID}
   </if> 
   <if test="TARGETID!=null">
      TARGETID=#{TARGETID}
   </if> 
   <if test="NOTIFYCONTENT!=null">
      NOTIFYCONTENT=#{NOTIFYCONTENT}
   </if> 
   <if test="NOTIFYLEVEL!=null">
      NOTIFYLEVEL=#{NOTIFYLEVEL}
   </if> 
   <if test="ISCLOSE!=null">
      ISCLOSE=#{ISCLOSE}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   <if test="ISSTORE!=null">
      ISSTORE=#{ISSTORE}
   </if> 
   <if test="READTIME!=null">
      READTIME=#{READTIME}
   </if> 
   <if test="READED!=null">
      READED=#{READED}
   </if> 
   <if test="SOURCEID!=null">
      SOURCEID=#{SOURCEID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_notification_msg_dto):ArrayList<app_act_notification_msg_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "REGISTERID", column = "REGISTERID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "OWNERID", column = "OWNERID"),
   Result(property = "TARGETID", column = "TARGETID"),
   Result(property = "NOTIFYCONTENT", column = "NOTIFYCONTENT"),
   Result(property = "NOTIFYLEVEL", column = "NOTIFYLEVEL"),
   Result(property = "ISCLOSE", column = "ISCLOSE"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "ISSTORE", column = "ISSTORE"),
   Result(property = "READTIME", column = "READTIME"),
   Result(property = "READED", column = "READED"),
   Result(property = "SOURCEID", column = "SOURCEID")
)
@Select("""<script>
   SELECT * FROM app_act_notification_msg
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_notification_msg_dto):app_act_notification_msg_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,REGISTERID,APPID,OWNERID,TARGETID,NOTIFYCONTENT,NOTIFYLEVEL,ISCLOSE,CREATETIME,ISSTORE,READTIME,READED,SOURCEID)
    values
    (#{ID},#{REGISTERID},#{APPID},#{OWNERID},#{TARGETID},#{NOTIFYCONTENT},#{NOTIFYLEVEL},#{ISCLOSE},#{CREATETIME},#{ISSTORE},#{READTIME},#{READED},#{SOURCEID})
</script>""")
fun insert(model:app_act_notification_msg_dto):Unit
                

}

        
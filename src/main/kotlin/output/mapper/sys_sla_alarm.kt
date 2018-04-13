

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_sla_alarm{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "INSTNAME", column = "INSTNAME"),
   Result(property = "ALARMNAME", column = "ALARMNAME"),
   Result(property = "EVENTTIME", column = "EVENTTIME"),
   Result(property = "ALARMLEVEL", column = "ALARMLEVEL"),
   Result(property = "METRICID", column = "METRICID"),
   Result(property = "TAKEVALUE", column = "TAKEVALUE"),
   Result(property = "TAKEDETAIL", column = "TAKEDETAIL"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "RESOURCEID", column = "RESOURCEID"),
   Result(property = "ISREAD", column = "ISREAD")
)
@Select("""<script>
   SELECT * FROM sys_sla_alarm
</script>""")
fun GetListAll():ArrayList<sys_sla_alarm_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "INSTNAME", column = "INSTNAME"),
   Result(property = "ALARMNAME", column = "ALARMNAME"),
   Result(property = "EVENTTIME", column = "EVENTTIME"),
   Result(property = "ALARMLEVEL", column = "ALARMLEVEL"),
   Result(property = "METRICID", column = "METRICID"),
   Result(property = "TAKEVALUE", column = "TAKEVALUE"),
   Result(property = "TAKEDETAIL", column = "TAKEDETAIL"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "RESOURCEID", column = "RESOURCEID"),
   Result(property = "ISREAD", column = "ISREAD")
)
@Select("""<script>
   SELECT * FROM sys_sla_alarm
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="INSTNAME!=null">
      INSTNAME=#{INSTNAME}
   </if> 
   <if test="ALARMNAME!=null">
      ALARMNAME=#{ALARMNAME}
   </if> 
   <if test="EVENTTIME!=null">
      EVENTTIME=#{EVENTTIME}
   </if> 
   <if test="ALARMLEVEL!=null">
      ALARMLEVEL=#{ALARMLEVEL}
   </if> 
   <if test="METRICID!=null">
      METRICID=#{METRICID}
   </if> 
   <if test="TAKEVALUE!=null">
      TAKEVALUE=#{TAKEVALUE}
   </if> 
   <if test="TAKEDETAIL!=null">
      TAKEDETAIL=#{TAKEDETAIL}
   </if> 
   <if test="APPID!=null">
      APPID=#{APPID}
   </if> 
   <if test="RESOURCEID!=null">
      RESOURCEID=#{RESOURCEID}
   </if> 
   <if test="ISREAD!=null">
      ISREAD=#{ISREAD}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_sla_alarm_dto):ArrayList<sys_sla_alarm_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "INSTNAME", column = "INSTNAME"),
   Result(property = "ALARMNAME", column = "ALARMNAME"),
   Result(property = "EVENTTIME", column = "EVENTTIME"),
   Result(property = "ALARMLEVEL", column = "ALARMLEVEL"),
   Result(property = "METRICID", column = "METRICID"),
   Result(property = "TAKEVALUE", column = "TAKEVALUE"),
   Result(property = "TAKEDETAIL", column = "TAKEDETAIL"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "RESOURCEID", column = "RESOURCEID"),
   Result(property = "ISREAD", column = "ISREAD")
)
@Select("""<script>
   SELECT * FROM sys_sla_alarm
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_sla_alarm_dto):sys_sla_alarm_dto?
                


@Insert("""<script>
    insert into sys_sla_alarm
    (ID,INSTNAME,ALARMNAME,EVENTTIME,ALARMLEVEL,METRICID,TAKEVALUE,TAKEDETAIL,APPID,RESOURCEID,ISREAD)
    values
    (#{ID},#{INSTNAME},#{ALARMNAME},#{EVENTTIME},#{ALARMLEVEL},#{METRICID},#{TAKEVALUE},#{TAKEDETAIL},#{APPID},#{RESOURCEID},#{ISREAD})
</script>""")
fun Insert(model:sys_sla_alarm_dto):Unit
                


@Insert("""<script>
    insert into sys_sla_alarm
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
           INSTNAME,
        <if test='ALARMNAME!= null'> 
           ALARMNAME,
        </if>
        <if test='EVENTTIME!= null'> 
           EVENTTIME,
        </if>
        <if test='ALARMLEVEL!= null'> 
           ALARMLEVEL,
        </if>
        <if test='METRICID!= null'> 
           METRICID,
        </if>
        <if test='TAKEVALUE!= null'> 
           TAKEVALUE,
        </if>
        <if test='TAKEDETAIL!= null'> 
           TAKEDETAIL,
        </if>
        <if test='APPID!= null'> 
           APPID,
        </if>
        <if test='RESOURCEID!= null'> 
           RESOURCEID,
        </if>
        <if test='ISREAD!= null'> 
           ISREAD
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
           #{INSTNAME,jdbcType=varchar}，
        <if test='ALARMNAME!= null'> 
           #{ALARMNAME,jdbcType=varchar}，
        </if>
        <if test='EVENTTIME!= null'> 
           #{EVENTTIME,jdbcType=datetime}，
        </if>
        <if test='ALARMLEVEL!= null'> 
           #{ALARMLEVEL,jdbcType=smallint}，
        </if>
        <if test='METRICID!= null'> 
           #{METRICID,jdbcType=varchar}，
        </if>
        <if test='TAKEVALUE!= null'> 
           #{TAKEVALUE,jdbcType=decimal}，
        </if>
        <if test='TAKEDETAIL!= null'> 
           #{TAKEDETAIL,jdbcType=text}，
        </if>
        <if test='APPID!= null'> 
           #{APPID,jdbcType=varchar}，
        </if>
        <if test='RESOURCEID!= null'> 
           #{RESOURCEID,jdbcType=varchar}，
        </if>
        <if test='ISREAD!= null'> 
           #{ISREAD,jdbcType=smallint}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_sla_alarm_dto):Unit
                

}

        
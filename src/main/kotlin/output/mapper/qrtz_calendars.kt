

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface qrtz_calendars{


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "CALENDAR_NAME", column = "CALENDAR_NAME"),
   Result(property = "CALENDAR", column = "CALENDAR")
)
@Select("""<script>
   SELECT * FROM qrtz_calendars
</script>""")
fun GetListAll():ArrayList<qrtz_calendars_dto>
        


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "CALENDAR_NAME", column = "CALENDAR_NAME"),
   Result(property = "CALENDAR", column = "CALENDAR")
)
@Select("""<script>
   SELECT * FROM qrtz_calendars
   <where>
   <if test="SCHED_NAME!=null">
      SCHED_NAME=#{SCHED_NAME}
   </if> 
   <if test="CALENDAR_NAME!=null">
      CALENDAR_NAME=#{CALENDAR_NAME}
   </if> 
   <if test="CALENDAR!=null">
      CALENDAR=#{CALENDAR}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:qrtz_calendars_dto):ArrayList<qrtz_calendars_dto>
                


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "CALENDAR_NAME", column = "CALENDAR_NAME"),
   Result(property = "CALENDAR", column = "CALENDAR")
)
@Select("""<script>
   SELECT * FROM qrtz_calendars
   <where>
   <if test="SCHED_NAME!=null">
      SCHED_NAME=#{SCHED_NAME}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:qrtz_calendars_dto):qrtz_calendars_dto?
                


@Insert("""<script>
    insert into qrtz_calendars
    (SCHED_NAME,CALENDAR_NAME,CALENDAR)
    values
    (#{SCHED_NAME},#{CALENDAR_NAME},#{CALENDAR})
</script>""")
fun Insert(model:qrtz_calendars_dto):Unit
                


@Insert("""<script>
    insert into qrtz_calendars
    <trim prefix="(" suffix=")" suffixOverrides="," >
           SCHED_NAME,
           CALENDAR_NAME,
           CALENDAR
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{SCHED_NAME,jdbcType=varchar}，
           #{CALENDAR_NAME,jdbcType=varchar}，
           #{CALENDAR,jdbcType=blob}
    </trim>
</script>""")
fun InsertSelective(model:qrtz_calendars_dto):Unit
                


@Delete("DELETE FROM qrtz_calendars WHERE SCHED_NAME=#{arg0}")
fun DeleteByPrimaryKey(SCHED_NAME:String)
        

@Update("""<script>
        UPDATE qrtz_calendars SET
        SCHED_NAME=#{SCHED_NAME,jdbcType=String},
        CALENDAR_NAME=#{CALENDAR_NAME,jdbcType=String},
        CALENDAR=#{CALENDAR,jdbcType=ByteArray}
        WHERE SCHED_NAME=#{SCHED_NAME,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:qrtz_calendars_dto)
        

@Update("""<script>
            UPDATE qrtz_calendars SET
            <if test="SCHED_NAME != null">  SCHED_NAME=#{SCHED_NAME,jdbcType=String},</if>
        <if test="CALENDAR_NAME != null">  CALENDAR_NAME=#{CALENDAR_NAME,jdbcType=String},</if>
        <if test="CALENDAR != null">  CALENDAR=#{CALENDAR,jdbcType=ByteArray}
              WHERE SCHED_NAME=#{SCHED_NAME,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:qrtz_calendars_dto)
            

}

        
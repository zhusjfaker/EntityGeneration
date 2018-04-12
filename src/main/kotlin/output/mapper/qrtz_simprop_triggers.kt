

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface qrtz_simprop_triggers{


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "TRIGGER_NAME", column = "TRIGGER_NAME"),
   Result(property = "TRIGGER_GROUP", column = "TRIGGER_GROUP"),
   Result(property = "STR_PROP_1", column = "STR_PROP_1"),
   Result(property = "STR_PROP_2", column = "STR_PROP_2"),
   Result(property = "STR_PROP_3", column = "STR_PROP_3"),
   Result(property = "INT_PROP_1", column = "INT_PROP_1"),
   Result(property = "INT_PROP_2", column = "INT_PROP_2"),
   Result(property = "LONG_PROP_1", column = "LONG_PROP_1"),
   Result(property = "LONG_PROP_2", column = "LONG_PROP_2"),
   Result(property = "DEC_PROP_1", column = "DEC_PROP_1"),
   Result(property = "DEC_PROP_2", column = "DEC_PROP_2"),
   Result(property = "BOOL_PROP_1", column = "BOOL_PROP_1"),
   Result(property = "BOOL_PROP_2", column = "BOOL_PROP_2")
)
@Select("""<script>
   SELECT * FROM qrtz_simprop_triggers
</script>""")
fun GetListAll():ArrayList<qrtz_simprop_triggers_dto>
        


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "TRIGGER_NAME", column = "TRIGGER_NAME"),
   Result(property = "TRIGGER_GROUP", column = "TRIGGER_GROUP"),
   Result(property = "STR_PROP_1", column = "STR_PROP_1"),
   Result(property = "STR_PROP_2", column = "STR_PROP_2"),
   Result(property = "STR_PROP_3", column = "STR_PROP_3"),
   Result(property = "INT_PROP_1", column = "INT_PROP_1"),
   Result(property = "INT_PROP_2", column = "INT_PROP_2"),
   Result(property = "LONG_PROP_1", column = "LONG_PROP_1"),
   Result(property = "LONG_PROP_2", column = "LONG_PROP_2"),
   Result(property = "DEC_PROP_1", column = "DEC_PROP_1"),
   Result(property = "DEC_PROP_2", column = "DEC_PROP_2"),
   Result(property = "BOOL_PROP_1", column = "BOOL_PROP_1"),
   Result(property = "BOOL_PROP_2", column = "BOOL_PROP_2")
)
@Select("""<script>
   SELECT * FROM qrtz_simprop_triggers
   <where>
   <if test="SCHED_NAME!=null">
      SCHED_NAME=#{SCHED_NAME}
   </if> 
   <if test="TRIGGER_NAME!=null">
      TRIGGER_NAME=#{TRIGGER_NAME}
   </if> 
   <if test="TRIGGER_GROUP!=null">
      TRIGGER_GROUP=#{TRIGGER_GROUP}
   </if> 
   <if test="STR_PROP_1!=null">
      STR_PROP_1=#{STR_PROP_1}
   </if> 
   <if test="STR_PROP_2!=null">
      STR_PROP_2=#{STR_PROP_2}
   </if> 
   <if test="STR_PROP_3!=null">
      STR_PROP_3=#{STR_PROP_3}
   </if> 
   <if test="INT_PROP_1!=null">
      INT_PROP_1=#{INT_PROP_1}
   </if> 
   <if test="INT_PROP_2!=null">
      INT_PROP_2=#{INT_PROP_2}
   </if> 
   <if test="LONG_PROP_1!=null">
      LONG_PROP_1=#{LONG_PROP_1}
   </if> 
   <if test="LONG_PROP_2!=null">
      LONG_PROP_2=#{LONG_PROP_2}
   </if> 
   <if test="DEC_PROP_1!=null">
      DEC_PROP_1=#{DEC_PROP_1}
   </if> 
   <if test="DEC_PROP_2!=null">
      DEC_PROP_2=#{DEC_PROP_2}
   </if> 
   <if test="BOOL_PROP_1!=null">
      BOOL_PROP_1=#{BOOL_PROP_1}
   </if> 
   <if test="BOOL_PROP_2!=null">
      BOOL_PROP_2=#{BOOL_PROP_2}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:qrtz_simprop_triggers_dto):ArrayList<qrtz_simprop_triggers_dto>
                


@Results(
   Result(property = "SCHED_NAME", column = "SCHED_NAME"),
   Result(property = "TRIGGER_NAME", column = "TRIGGER_NAME"),
   Result(property = "TRIGGER_GROUP", column = "TRIGGER_GROUP"),
   Result(property = "STR_PROP_1", column = "STR_PROP_1"),
   Result(property = "STR_PROP_2", column = "STR_PROP_2"),
   Result(property = "STR_PROP_3", column = "STR_PROP_3"),
   Result(property = "INT_PROP_1", column = "INT_PROP_1"),
   Result(property = "INT_PROP_2", column = "INT_PROP_2"),
   Result(property = "LONG_PROP_1", column = "LONG_PROP_1"),
   Result(property = "LONG_PROP_2", column = "LONG_PROP_2"),
   Result(property = "DEC_PROP_1", column = "DEC_PROP_1"),
   Result(property = "DEC_PROP_2", column = "DEC_PROP_2"),
   Result(property = "BOOL_PROP_1", column = "BOOL_PROP_1"),
   Result(property = "BOOL_PROP_2", column = "BOOL_PROP_2")
)
@Select("""<script>
   SELECT * FROM qrtz_simprop_triggers
   <where>
   <if test="SCHED_NAME!=null">
      SCHED_NAME=#{SCHED_NAME}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:qrtz_simprop_triggers_dto):qrtz_simprop_triggers_dto?
                


@Insert("""<script>
    insert into TStudent
    (SCHED_NAME,TRIGGER_NAME,TRIGGER_GROUP,STR_PROP_1,STR_PROP_2,STR_PROP_3,INT_PROP_1,INT_PROP_2,LONG_PROP_1,LONG_PROP_2,DEC_PROP_1,DEC_PROP_2,BOOL_PROP_1,BOOL_PROP_2)
    values
    (#{SCHED_NAME},#{TRIGGER_NAME},#{TRIGGER_GROUP},#{STR_PROP_1},#{STR_PROP_2},#{STR_PROP_3},#{INT_PROP_1},#{INT_PROP_2},#{LONG_PROP_1},#{LONG_PROP_2},#{DEC_PROP_1},#{DEC_PROP_2},#{BOOL_PROP_1},#{BOOL_PROP_2})
</script>""")
fun insert(model:qrtz_simprop_triggers_dto):Unit
                

}

        
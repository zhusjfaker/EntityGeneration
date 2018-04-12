

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_notification_cfg{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ISCLOSE", column = "ISCLOSE"),
   Result(property = "ISSTORE", column = "ISSTORE")
)
@Select("""<script>
   SELECT * FROM app_act_notification_cfg
</script>""")
fun GetListAll():ArrayList<app_act_notification_cfg_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ISCLOSE", column = "ISCLOSE"),
   Result(property = "ISSTORE", column = "ISSTORE")
)
@Select("""<script>
   SELECT * FROM app_act_notification_cfg
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="ISCLOSE!=null">
      ISCLOSE=#{ISCLOSE}
   </if> 
   <if test="ISSTORE!=null">
      ISSTORE=#{ISSTORE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_notification_cfg_dto):ArrayList<app_act_notification_cfg_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ISCLOSE", column = "ISCLOSE"),
   Result(property = "ISSTORE", column = "ISSTORE")
)
@Select("""<script>
   SELECT * FROM app_act_notification_cfg
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_notification_cfg_dto):app_act_notification_cfg_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,ISCLOSE,ISSTORE)
    values
    (#{ID},#{ISCLOSE},#{ISSTORE})
</script>""")
fun insert(model:app_act_notification_cfg_dto):Unit
                

}

        
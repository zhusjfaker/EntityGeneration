

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_rongim_token{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TOKEN", column = "TOKEN"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_rongim_token
</script>""")
fun GetListAll():ArrayList<app_act_rongim_token_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TOKEN", column = "TOKEN"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_rongim_token
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="TOKEN!=null">
      TOKEN=#{TOKEN}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_rongim_token_dto):ArrayList<app_act_rongim_token_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TOKEN", column = "TOKEN"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_rongim_token
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_rongim_token_dto):app_act_rongim_token_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,TOKEN,CREATETIME)
    values
    (#{ID},#{TOKEN},#{CREATETIME})
</script>""")
fun insert(model:app_act_rongim_token_dto):Unit
                

}

        
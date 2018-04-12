

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface mdm_hw_push{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "HUAWEITOKEN", column = "HUAWEITOKEN"),
   Result(property = "ISONLINE", column = "ISONLINE")
)
@Select("""<script>
   SELECT * FROM mdm_hw_push
</script>""")
fun GetListAll():ArrayList<mdm_hw_push_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "HUAWEITOKEN", column = "HUAWEITOKEN"),
   Result(property = "ISONLINE", column = "ISONLINE")
)
@Select("""<script>
   SELECT * FROM mdm_hw_push
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="HUAWEITOKEN!=null">
      HUAWEITOKEN=#{HUAWEITOKEN}
   </if> 
   <if test="ISONLINE!=null">
      ISONLINE=#{ISONLINE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:mdm_hw_push_dto):ArrayList<mdm_hw_push_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "HUAWEITOKEN", column = "HUAWEITOKEN"),
   Result(property = "ISONLINE", column = "ISONLINE")
)
@Select("""<script>
   SELECT * FROM mdm_hw_push
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:mdm_hw_push_dto):mdm_hw_push_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,HUAWEITOKEN,ISONLINE)
    values
    (#{ID},#{HUAWEITOKEN},#{ISONLINE})
</script>""")
fun insert(model:mdm_hw_push_dto):Unit
                

}

        
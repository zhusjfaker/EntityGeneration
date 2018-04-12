

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface oom{


@Results(
   Result(property = "ID", column = "ID")
)
@Select("""<script>
   SELECT * FROM oom
</script>""")
fun GetListAll():ArrayList<oom_dto>
        


@Results(
   Result(property = "ID", column = "ID")
)
@Select("""<script>
   SELECT * FROM oom
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:oom_dto):ArrayList<oom_dto>
                


@Results(
   Result(property = "ID", column = "ID")
)
@Select("""<script>
   SELECT * FROM oom
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:oom_dto):oom_dto?
                


@Insert("""<script>
    insert into TStudent
    ()
    values
    ()
</script>""")
@Options(keyProperty="ID",useGeneratedKeys=true)
fun insert(model:oom_dto):Long
                

}

        
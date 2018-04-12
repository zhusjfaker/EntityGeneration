

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface test{


@Results(
   Result(property = "id", column = "id"),
   Result(property = "ss2", column = "ss2")
)
@Select("""<script>
   SELECT * FROM test
</script>""")
fun GetListAll():ArrayList<test_dto>
        


@Results(
   Result(property = "id", column = "id"),
   Result(property = "ss2", column = "ss2")
)
@Select("""<script>
   SELECT * FROM test
   <where>
   <if test="id!=null">
      id=#{id}
   </if> 
   <if test="ss2!=null">
      ss2=#{ss2}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:test_dto):ArrayList<test_dto>
                


@Results(
   Result(property = "id", column = "id"),
   Result(property = "ss2", column = "ss2")
)
@Select("""<script>
   SELECT * FROM test
   <where>
   <if test="id!=null">
      id=#{id}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:test_dto):test_dto?
                


@Insert("""<script>
    insert into TStudent
    (id,ss2)
    values
    (#{id},#{ss2})
</script>""")
fun insert(model:test_dto):Unit
                

}

        


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
    insert into oom
    ()
    values
    ()
</script>""")
@Options(keyProperty="ID",useGeneratedKeys=true)
fun insert(model:oom_dto):Long
                


@Insert("""<script>
    insert into oom
    <trim prefix="(" suffix=")" suffixOverrides="," >
        
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
        
    </trim>
</script>""")
@Options(keyProperty="ID",useGeneratedKeys=true)
fun InsertSelective(model:oom_dto):Long
                


@Delete("DELETE FROM oom WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:Long)
        

@Update("""<script>
        UPDATE oom SET
        ID=#{ID,jdbcType=Long}
        WHERE ID=#{ID,jdbcType=Long}
        </script>""")
fun UpdateByPrimaryKey(model:oom_dto)
        

@Update("""<script>
            UPDATE oom SET
            <if test="ID != null">  ID=#{ID,jdbcType=Long}
              WHERE ID=#{ID,jdbcType=Long}
            </script>""")
fun UpdateByPrimaryKeySelective(model:oom_dto)
            

}

        
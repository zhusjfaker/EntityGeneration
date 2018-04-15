

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
    insert into test
    (id,ss2)
    values
    (#{id},#{ss2})
</script>""")
fun Insert(model:test_dto):Unit
                


@Insert("""<script>
    insert into test
    <trim prefix="(" suffix=")" suffixOverrides="," >
           id,
        <if test='ss2!= null'> 
           ss2
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{id,jdbcType=int}，
        <if test='ss2!= null'> 
           #{ss2,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:test_dto):Unit
                


@Delete("DELETE FROM test WHERE id=#{arg0}")
fun DeleteByPrimaryKey(id:Integer)
        

@Update("""<script>
        UPDATE test SET
        id=#{id,jdbcType=Integer},
        ss2=#{ss2,jdbcType=String}
        WHERE id=#{id,jdbcType=Integer}
        </script>""")
fun UpdateByPrimaryKey(model:test_dto)
        

@Update("""<script>
            UPDATE test SET
            <if test="id != null">  id=#{id,jdbcType=Integer},</if>
        <if test="ss2 != null">  ss2=#{ss2,jdbcType=String}
              WHERE id=#{id,jdbcType=Integer}
            </script>""")
fun UpdateByPrimaryKeySelective(model:test_dto)
            

}

        
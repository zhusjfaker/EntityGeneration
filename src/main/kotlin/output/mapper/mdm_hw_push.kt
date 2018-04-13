

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
    insert into mdm_hw_push
    (ID,HUAWEITOKEN,ISONLINE)
    values
    (#{ID},#{HUAWEITOKEN},#{ISONLINE})
</script>""")
fun Insert(model:mdm_hw_push_dto):Unit
                


@Insert("""<script>
    insert into mdm_hw_push
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='HUAWEITOKEN!= null'> 
           HUAWEITOKEN,
        </if>
        <if test='ISONLINE!= null'> 
           ISONLINE
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='HUAWEITOKEN!= null'> 
           #{HUAWEITOKEN,jdbcType=varchar}，
        </if>
        <if test='ISONLINE!= null'> 
           #{ISONLINE,jdbcType=smallint}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:mdm_hw_push_dto):Unit
                

}

        
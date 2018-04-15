

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_sequence{


@Results(
   Result(property = "SEQUENCENAME", column = "SEQUENCENAME"),
   Result(property = "SEQUENCEVALUE", column = "SEQUENCEVALUE"),
   Result(property = "CACHESTEP", column = "CACHESTEP")
)
@Select("""<script>
   SELECT * FROM sys_sequence
</script>""")
fun GetListAll():ArrayList<sys_sequence_dto>
        


@Results(
   Result(property = "SEQUENCENAME", column = "SEQUENCENAME"),
   Result(property = "SEQUENCEVALUE", column = "SEQUENCEVALUE"),
   Result(property = "CACHESTEP", column = "CACHESTEP")
)
@Select("""<script>
   SELECT * FROM sys_sequence
   <where>
   <if test="SEQUENCENAME!=null">
      SEQUENCENAME=#{SEQUENCENAME}
   </if> 
   <if test="SEQUENCEVALUE!=null">
      SEQUENCEVALUE=#{SEQUENCEVALUE}
   </if> 
   <if test="CACHESTEP!=null">
      CACHESTEP=#{CACHESTEP}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_sequence_dto):ArrayList<sys_sequence_dto>
                


@Results(
   Result(property = "SEQUENCENAME", column = "SEQUENCENAME"),
   Result(property = "SEQUENCEVALUE", column = "SEQUENCEVALUE"),
   Result(property = "CACHESTEP", column = "CACHESTEP")
)
@Select("""<script>
   SELECT * FROM sys_sequence
   <where>
   <if test="SEQUENCENAME!=null">
      SEQUENCENAME=#{SEQUENCENAME}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_sequence_dto):sys_sequence_dto?
                


@Insert("""<script>
    insert into sys_sequence
    (SEQUENCENAME,SEQUENCEVALUE,CACHESTEP)
    values
    (#{SEQUENCENAME},#{SEQUENCEVALUE},#{CACHESTEP})
</script>""")
fun Insert(model:sys_sequence_dto):Unit
                


@Insert("""<script>
    insert into sys_sequence
    <trim prefix="(" suffix=")" suffixOverrides="," >
           SEQUENCENAME,
        <if test='SEQUENCEVALUE!= null'> 
           SEQUENCEVALUE,
        </if>
        <if test='CACHESTEP!= null'> 
           CACHESTEP
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{SEQUENCENAME,jdbcType=varchar}，
        <if test='SEQUENCEVALUE!= null'> 
           #{SEQUENCEVALUE,jdbcType=decimal}，
        </if>
        <if test='CACHESTEP!= null'> 
           #{CACHESTEP,jdbcType=decimal}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_sequence_dto):Unit
                


@Delete("DELETE FROM sys_sequence WHERE SEQUENCENAME=#{arg0}")
fun DeleteByPrimaryKey(SEQUENCENAME:String)
        

@Update("""<script>
        UPDATE sys_sequence SET
        SEQUENCENAME=#{SEQUENCENAME,jdbcType=String},
        SEQUENCEVALUE=#{SEQUENCEVALUE,jdbcType=BigDecimal},
        CACHESTEP=#{CACHESTEP,jdbcType=BigDecimal}
        WHERE SEQUENCENAME=#{SEQUENCENAME,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_sequence_dto)
        

@Update("""<script>
            UPDATE sys_sequence SET
            <if test="SEQUENCENAME != null">  SEQUENCENAME=#{SEQUENCENAME,jdbcType=String},</if>
        <if test="SEQUENCEVALUE != null">  SEQUENCEVALUE=#{SEQUENCEVALUE,jdbcType=BigDecimal},</if>
        <if test="CACHESTEP != null">  CACHESTEP=#{CACHESTEP,jdbcType=BigDecimal}
              WHERE SEQUENCENAME=#{SEQUENCENAME,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_sequence_dto)
            

}

        
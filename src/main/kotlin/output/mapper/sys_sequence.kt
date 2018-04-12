

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
    insert into TStudent
    (SEQUENCENAME,SEQUENCEVALUE,CACHESTEP)
    values
    (#{SEQUENCENAME},#{SEQUENCEVALUE},#{CACHESTEP})
</script>""")
fun insert(model:sys_sequence_dto):Unit
                

}

        
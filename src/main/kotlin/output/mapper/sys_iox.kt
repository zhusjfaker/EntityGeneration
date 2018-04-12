

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_iox{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ADVANCETYPE", column = "ADVANCETYPE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM sys_iox
</script>""")
fun GetListAll():ArrayList<sys_iox_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ADVANCETYPE", column = "ADVANCETYPE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM sys_iox
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="ADVANCETYPE!=null">
      ADVANCETYPE=#{ADVANCETYPE}
   </if> 
   <if test="ORDERINDEX!=null">
      ORDERINDEX=#{ORDERINDEX}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_iox_dto):ArrayList<sys_iox_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ADVANCETYPE", column = "ADVANCETYPE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM sys_iox
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_iox_dto):sys_iox_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,ADVANCETYPE,ORDERINDEX)
    values
    (#{ID},#{ADVANCETYPE},#{ORDERINDEX})
</script>""")
fun insert(model:sys_iox_dto):Unit
                

}

        
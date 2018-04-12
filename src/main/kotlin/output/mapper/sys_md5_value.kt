

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_md5_value{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "V", column = "V")
)
@Select("""<script>
   SELECT * FROM sys_md5_value
</script>""")
fun GetListAll():ArrayList<sys_md5_value_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "V", column = "V")
)
@Select("""<script>
   SELECT * FROM sys_md5_value
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="V!=null">
      V=#{V}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_md5_value_dto):ArrayList<sys_md5_value_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "V", column = "V")
)
@Select("""<script>
   SELECT * FROM sys_md5_value
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_md5_value_dto):sys_md5_value_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,V)
    values
    (#{ID},#{V})
</script>""")
fun insert(model:sys_md5_value_dto):Unit
                

}

        
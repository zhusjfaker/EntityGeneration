

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_systemname{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SYSTEMNAME", column = "SYSTEMNAME"),
   Result(property = "ISDEFAULT", column = "ISDEFAULT")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_systemname
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_systemname_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SYSTEMNAME", column = "SYSTEMNAME"),
   Result(property = "ISDEFAULT", column = "ISDEFAULT")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_systemname
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="SYSTEMNAME!=null">
      SYSTEMNAME=#{SYSTEMNAME}
   </if> 
   <if test="ISDEFAULT!=null">
      ISDEFAULT=#{ISDEFAULT}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_systemname_dto):ArrayList<sys_coe_pal_systemname_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SYSTEMNAME", column = "SYSTEMNAME"),
   Result(property = "ISDEFAULT", column = "ISDEFAULT")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_systemname
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_systemname_dto):sys_coe_pal_systemname_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,SYSTEMNAME,ISDEFAULT)
    values
    (#{ID},#{SYSTEMNAME},#{ISDEFAULT})
</script>""")
fun insert(model:sys_coe_pal_systemname_dto):Unit
                

}

        
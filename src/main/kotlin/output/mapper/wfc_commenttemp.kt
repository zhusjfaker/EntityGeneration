

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfc_commenttemp{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "ACTIONNAME", column = "ACTIONNAME"),
   Result(property = "MSG", column = "MSG"),
   Result(property = "FILES", column = "FILES")
)
@Select("""<script>
   SELECT * FROM wfc_commenttemp
</script>""")
fun GetListAll():ArrayList<wfc_commenttemp_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "ACTIONNAME", column = "ACTIONNAME"),
   Result(property = "MSG", column = "MSG"),
   Result(property = "FILES", column = "FILES")
)
@Select("""<script>
   SELECT * FROM wfc_commenttemp
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="PROCESSINSTID!=null">
      PROCESSINSTID=#{PROCESSINSTID}
   </if> 
   <if test="TASKINSTID!=null">
      TASKINSTID=#{TASKINSTID}
   </if> 
   <if test="ACTIONNAME!=null">
      ACTIONNAME=#{ACTIONNAME}
   </if> 
   <if test="MSG!=null">
      MSG=#{MSG}
   </if> 
   <if test="FILES!=null">
      FILES=#{FILES}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:wfc_commenttemp_dto):ArrayList<wfc_commenttemp_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "ACTIONNAME", column = "ACTIONNAME"),
   Result(property = "MSG", column = "MSG"),
   Result(property = "FILES", column = "FILES")
)
@Select("""<script>
   SELECT * FROM wfc_commenttemp
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:wfc_commenttemp_dto):wfc_commenttemp_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,PROCESSINSTID,TASKINSTID,ACTIONNAME,MSG,FILES)
    values
    (#{ID},#{PROCESSINSTID},#{TASKINSTID},#{ACTIONNAME},#{MSG},#{FILES})
</script>""")
fun insert(model:wfc_commenttemp_dto):Unit
                

}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_publish_list{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PID", column = "PID"),
   Result(property = "PALREPOSITORYID", column = "PALREPOSITORYID"),
   Result(property = "ACTIONTYPE", column = "ACTIONTYPE"),
   Result(property = "PUBLISHDESC", column = "PUBLISHDESC")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_publish_list
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_publish_list_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PID", column = "PID"),
   Result(property = "PALREPOSITORYID", column = "PALREPOSITORYID"),
   Result(property = "ACTIONTYPE", column = "ACTIONTYPE"),
   Result(property = "PUBLISHDESC", column = "PUBLISHDESC")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_publish_list
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="PID!=null">
      PID=#{PID}
   </if> 
   <if test="PALREPOSITORYID!=null">
      PALREPOSITORYID=#{PALREPOSITORYID}
   </if> 
   <if test="ACTIONTYPE!=null">
      ACTIONTYPE=#{ACTIONTYPE}
   </if> 
   <if test="PUBLISHDESC!=null">
      PUBLISHDESC=#{PUBLISHDESC}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_publish_list_dto):ArrayList<sys_coe_pal_publish_list_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PID", column = "PID"),
   Result(property = "PALREPOSITORYID", column = "PALREPOSITORYID"),
   Result(property = "ACTIONTYPE", column = "ACTIONTYPE"),
   Result(property = "PUBLISHDESC", column = "PUBLISHDESC")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_publish_list
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_publish_list_dto):sys_coe_pal_publish_list_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,PID,PALREPOSITORYID,ACTIONTYPE,PUBLISHDESC)
    values
    (#{ID},#{PID},#{PALREPOSITORYID},#{ACTIONTYPE},#{PUBLISHDESC})
</script>""")
fun insert(model:sys_coe_pal_publish_list_dto):Unit
                

}

        
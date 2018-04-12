

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_repository_r_info{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "REMOVEUSER", column = "REMOVEUSER"),
   Result(property = "REMOVETIME", column = "REMOVETIME"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "RESOURCEID", column = "RESOURCEID"),
   Result(property = "REMOVETYPE", column = "REMOVETYPE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_repository_r_info
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_repository_r_info_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "REMOVEUSER", column = "REMOVEUSER"),
   Result(property = "REMOVETIME", column = "REMOVETIME"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "RESOURCEID", column = "RESOURCEID"),
   Result(property = "REMOVETYPE", column = "REMOVETYPE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_repository_r_info
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="REMOVEUSER!=null">
      REMOVEUSER=#{REMOVEUSER}
   </if> 
   <if test="REMOVETIME!=null">
      REMOVETIME=#{REMOVETIME}
   </if> 
   <if test="WSID!=null">
      WSID=#{WSID}
   </if> 
   <if test="RESOURCEID!=null">
      RESOURCEID=#{RESOURCEID}
   </if> 
   <if test="REMOVETYPE!=null">
      REMOVETYPE=#{REMOVETYPE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_repository_r_info_dto):ArrayList<sys_coe_pal_repository_r_info_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "REMOVEUSER", column = "REMOVEUSER"),
   Result(property = "REMOVETIME", column = "REMOVETIME"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "RESOURCEID", column = "RESOURCEID"),
   Result(property = "REMOVETYPE", column = "REMOVETYPE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_repository_r_info
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_repository_r_info_dto):sys_coe_pal_repository_r_info_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,REMOVEUSER,REMOVETIME,WSID,RESOURCEID,REMOVETYPE)
    values
    (#{ID},#{REMOVEUSER},#{REMOVETIME},#{WSID},#{RESOURCEID},#{REMOVETYPE})
</script>""")
fun insert(model:sys_coe_pal_repository_r_info_dto):Unit
                

}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_team_perm{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TEAMID", column = "TEAMID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "PERMTYPE", column = "PERMTYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID")
)
@Select("""<script>
   SELECT * FROM sys_coe_team_perm
</script>""")
fun GetListAll():ArrayList<sys_coe_team_perm_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TEAMID", column = "TEAMID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "PERMTYPE", column = "PERMTYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID")
)
@Select("""<script>
   SELECT * FROM sys_coe_team_perm
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="TEAMID!=null">
      TEAMID=#{TEAMID}
   </if> 
   <if test="WSID!=null">
      WSID=#{WSID}
   </if> 
   <if test="PERMTYPE!=null">
      PERMTYPE=#{PERMTYPE}
   </if> 
   <if test="RESOURCEID!=null">
      RESOURCEID=#{RESOURCEID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_team_perm_dto):ArrayList<sys_coe_team_perm_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TEAMID", column = "TEAMID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "PERMTYPE", column = "PERMTYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID")
)
@Select("""<script>
   SELECT * FROM sys_coe_team_perm
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_team_perm_dto):sys_coe_team_perm_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,TEAMID,WSID,PERMTYPE,RESOURCEID)
    values
    (#{ID},#{TEAMID},#{WSID},#{PERMTYPE},#{RESOURCEID})
</script>""")
fun insert(model:sys_coe_team_perm_dto):Unit
                

}

        
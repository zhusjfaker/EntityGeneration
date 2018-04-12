

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_usergroup_role{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "GROUPID", column = "GROUPID"),
   Result(property = "ROLEID", column = "ROLEID")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_usergroup_role
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_usergroup_role_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "GROUPID", column = "GROUPID"),
   Result(property = "ROLEID", column = "ROLEID")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_usergroup_role
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="GROUPID!=null">
      GROUPID=#{GROUPID}
   </if> 
   <if test="ROLEID!=null">
      ROLEID=#{ROLEID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_usergroup_role_dto):ArrayList<sys_coe_pal_usergroup_role_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "GROUPID", column = "GROUPID"),
   Result(property = "ROLEID", column = "ROLEID")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_usergroup_role
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_usergroup_role_dto):sys_coe_pal_usergroup_role_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,GROUPID,ROLEID)
    values
    (#{ID},#{GROUPID},#{ROLEID})
</script>""")
fun insert(model:sys_coe_pal_usergroup_role_dto):Unit
                

}

        


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
    insert into sys_coe_pal_usergroup_role
    (ID,GROUPID,ROLEID)
    values
    (#{ID},#{GROUPID},#{ROLEID})
</script>""")
fun Insert(model:sys_coe_pal_usergroup_role_dto):Unit
                


@Insert("""<script>
    insert into sys_coe_pal_usergroup_role
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='GROUPID!= null'> 
           GROUPID,
        </if>
        <if test='ROLEID!= null'> 
           ROLEID
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='GROUPID!= null'> 
           #{GROUPID,jdbcType=char}，
        </if>
        <if test='ROLEID!= null'> 
           #{ROLEID,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_coe_pal_usergroup_role_dto):Unit
                

}

        
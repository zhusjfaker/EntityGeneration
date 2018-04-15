

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
    insert into sys_coe_team_perm
    (ID,TEAMID,WSID,PERMTYPE,RESOURCEID)
    values
    (#{ID},#{TEAMID},#{WSID},#{PERMTYPE},#{RESOURCEID})
</script>""")
fun Insert(model:sys_coe_team_perm_dto):Unit
                


@Insert("""<script>
    insert into sys_coe_team_perm
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='TEAMID!= null'> 
           TEAMID,
        </if>
        <if test='WSID!= null'> 
           WSID,
        </if>
        <if test='PERMTYPE!= null'> 
           PERMTYPE,
        </if>
        <if test='RESOURCEID!= null'> 
           RESOURCEID
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='TEAMID!= null'> 
           #{TEAMID,jdbcType=char}，
        </if>
        <if test='WSID!= null'> 
           #{WSID,jdbcType=char}，
        </if>
        <if test='PERMTYPE!= null'> 
           #{PERMTYPE,jdbcType=smallint}，
        </if>
        <if test='RESOURCEID!= null'> 
           #{RESOURCEID,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_coe_team_perm_dto):Unit
                


@Delete("DELETE FROM sys_coe_team_perm WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_coe_team_perm SET
        ID=#{ID,jdbcType=String},
        TEAMID=#{TEAMID,jdbcType=String},
        WSID=#{WSID,jdbcType=String},
        PERMTYPE=#{PERMTYPE,jdbcType=Integer},
        RESOURCEID=#{RESOURCEID,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_coe_team_perm_dto)
        

@Update("""<script>
            UPDATE sys_coe_team_perm SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="TEAMID != null">  TEAMID=#{TEAMID,jdbcType=String},</if>
        <if test="WSID != null">  WSID=#{WSID,jdbcType=String},</if>
        <if test="PERMTYPE != null">  PERMTYPE=#{PERMTYPE,jdbcType=Integer},</if>
        <if test="RESOURCEID != null">  RESOURCEID=#{RESOURCEID,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_coe_team_perm_dto)
            

}

        
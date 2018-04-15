

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_usergroup_perm{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "GROUPID", column = "GROUPID"),
   Result(property = "PERMTYPE", column = "PERMTYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_usergroup_perm
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_usergroup_perm_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "GROUPID", column = "GROUPID"),
   Result(property = "PERMTYPE", column = "PERMTYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_usergroup_perm
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="GROUPID!=null">
      GROUPID=#{GROUPID}
   </if> 
   <if test="PERMTYPE!=null">
      PERMTYPE=#{PERMTYPE}
   </if> 
   <if test="RESOURCEID!=null">
      RESOURCEID=#{RESOURCEID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_usergroup_perm_dto):ArrayList<sys_coe_pal_usergroup_perm_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "GROUPID", column = "GROUPID"),
   Result(property = "PERMTYPE", column = "PERMTYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_usergroup_perm
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_usergroup_perm_dto):sys_coe_pal_usergroup_perm_dto?
                


@Insert("""<script>
    insert into sys_coe_pal_usergroup_perm
    (ID,GROUPID,PERMTYPE,RESOURCEID)
    values
    (#{ID},#{GROUPID},#{PERMTYPE},#{RESOURCEID})
</script>""")
fun Insert(model:sys_coe_pal_usergroup_perm_dto):Unit
                


@Insert("""<script>
    insert into sys_coe_pal_usergroup_perm
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='GROUPID!= null'> 
           GROUPID,
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
        <if test='GROUPID!= null'> 
           #{GROUPID,jdbcType=char}，
        </if>
        <if test='PERMTYPE!= null'> 
           #{PERMTYPE,jdbcType=smallint}，
        </if>
        <if test='RESOURCEID!= null'> 
           #{RESOURCEID,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_coe_pal_usergroup_perm_dto):Unit
                


@Delete("DELETE FROM sys_coe_pal_usergroup_perm WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_coe_pal_usergroup_perm SET
        ID=#{ID,jdbcType=String},
        GROUPID=#{GROUPID,jdbcType=String},
        PERMTYPE=#{PERMTYPE,jdbcType=Integer},
        RESOURCEID=#{RESOURCEID,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_coe_pal_usergroup_perm_dto)
        

@Update("""<script>
            UPDATE sys_coe_pal_usergroup_perm SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="GROUPID != null">  GROUPID=#{GROUPID,jdbcType=String},</if>
        <if test="PERMTYPE != null">  PERMTYPE=#{PERMTYPE,jdbcType=Integer},</if>
        <if test="RESOURCEID != null">  RESOURCEID=#{RESOURCEID,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_coe_pal_usergroup_perm_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_usergroup_perm{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "GROUPID", column = "GROUPID"),
   Result(property = "PERMTYPE", column = "PERMTYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_usergroup_perm
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_usergroup_perm_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "GROUPID", column = "GROUPID"),
   Result(property = "PERMTYPE", column = "PERMTYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_usergroup_perm
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="GROUPID!=null">
      GROUPID=#{GROUPID}
   </if> 
   <if test="PERMTYPE!=null">
      PERMTYPE=#{PERMTYPE}
   </if> 
   <if test="RESOURCEID!=null">
      RESOURCEID=#{RESOURCEID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_usergroup_perm_dto):ArrayList<sys_coe_pal_usergroup_perm_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "GROUPID", column = "GROUPID"),
   Result(property = "PERMTYPE", column = "PERMTYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_usergroup_perm
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_usergroup_perm_dto):sys_coe_pal_usergroup_perm_dto?
                


@Insert("""<script>
    insert into sys_coe_pal_usergroup_perm
    (ID,GROUPID,PERMTYPE,RESOURCEID)
    values
    (#{ID},#{GROUPID},#{PERMTYPE},#{RESOURCEID})
</script>""")
fun Insert(model:sys_coe_pal_usergroup_perm_dto):Unit
                


@Insert("""<script>
    insert into sys_coe_pal_usergroup_perm
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='GROUPID!= null'> 
           GROUPID,
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
        <if test='GROUPID!= null'> 
           #{GROUPID,jdbcType=char}，
        </if>
        <if test='PERMTYPE!= null'> 
           #{PERMTYPE,jdbcType=smallint}，
        </if>
        <if test='RESOURCEID!= null'> 
           #{RESOURCEID,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_coe_pal_usergroup_perm_dto):Unit
                


@Delete("DELETE FROM sys_coe_pal_usergroup_perm WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_coe_pal_usergroup_perm SET
        ID=#{ID,jdbcType=String},
        GROUPID=#{GROUPID,jdbcType=String},
        PERMTYPE=#{PERMTYPE,jdbcType=Integer},
        RESOURCEID=#{RESOURCEID,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_coe_pal_usergroup_perm_dto)
        

@Update("""<script>
            UPDATE sys_coe_pal_usergroup_perm SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="GROUPID != null">  GROUPID=#{GROUPID,jdbcType=String},</if>
        <if test="PERMTYPE != null">  PERMTYPE=#{PERMTYPE,jdbcType=Integer},</if>
        <if test="RESOURCEID != null">  RESOURCEID=#{RESOURCEID,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_coe_pal_usergroup_perm_dto)
            

}

        
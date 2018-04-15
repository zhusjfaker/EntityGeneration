

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_teammember_perm{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TEAMID", column = "TEAMID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "ACTIONTYPE", column = "ACTIONTYPE")
)
@Select("""<script>
   SELECT * FROM sys_coe_teammember_perm
</script>""")
fun GetListAll():ArrayList<sys_coe_teammember_perm_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TEAMID", column = "TEAMID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "ACTIONTYPE", column = "ACTIONTYPE")
)
@Select("""<script>
   SELECT * FROM sys_coe_teammember_perm
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="TEAMID!=null">
      TEAMID=#{TEAMID}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="ACTIONTYPE!=null">
      ACTIONTYPE=#{ACTIONTYPE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_teammember_perm_dto):ArrayList<sys_coe_teammember_perm_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TEAMID", column = "TEAMID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "ACTIONTYPE", column = "ACTIONTYPE")
)
@Select("""<script>
   SELECT * FROM sys_coe_teammember_perm
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_teammember_perm_dto):sys_coe_teammember_perm_dto?
                


@Insert("""<script>
    insert into sys_coe_teammember_perm
    (ID,TEAMID,USERID,ACTIONTYPE)
    values
    (#{ID},#{TEAMID},#{USERID},#{ACTIONTYPE})
</script>""")
fun Insert(model:sys_coe_teammember_perm_dto):Unit
                


@Insert("""<script>
    insert into sys_coe_teammember_perm
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='TEAMID!= null'> 
           TEAMID,
        </if>
        <if test='USERID!= null'> 
           USERID,
        </if>
        <if test='ACTIONTYPE!= null'> 
           ACTIONTYPE
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='TEAMID!= null'> 
           #{TEAMID,jdbcType=char}，
        </if>
        <if test='USERID!= null'> 
           #{USERID,jdbcType=varchar}，
        </if>
        <if test='ACTIONTYPE!= null'> 
           #{ACTIONTYPE,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_coe_teammember_perm_dto):Unit
                


@Delete("DELETE FROM sys_coe_teammember_perm WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_coe_teammember_perm SET
        ID=#{ID,jdbcType=String},
        TEAMID=#{TEAMID,jdbcType=String},
        USERID=#{USERID,jdbcType=String},
        ACTIONTYPE=#{ACTIONTYPE,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_coe_teammember_perm_dto)
        

@Update("""<script>
            UPDATE sys_coe_teammember_perm SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="TEAMID != null">  TEAMID=#{TEAMID,jdbcType=String},</if>
        <if test="USERID != null">  USERID=#{USERID,jdbcType=String},</if>
        <if test="ACTIONTYPE != null">  ACTIONTYPE=#{ACTIONTYPE,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_coe_teammember_perm_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_teammember_perm{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TEAMID", column = "TEAMID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "ACTIONTYPE", column = "ACTIONTYPE")
)
@Select("""<script>
   SELECT * FROM sys_coe_teammember_perm
</script>""")
fun GetListAll():ArrayList<sys_coe_teammember_perm_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TEAMID", column = "TEAMID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "ACTIONTYPE", column = "ACTIONTYPE")
)
@Select("""<script>
   SELECT * FROM sys_coe_teammember_perm
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="TEAMID!=null">
      TEAMID=#{TEAMID}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="ACTIONTYPE!=null">
      ACTIONTYPE=#{ACTIONTYPE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_teammember_perm_dto):ArrayList<sys_coe_teammember_perm_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TEAMID", column = "TEAMID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "ACTIONTYPE", column = "ACTIONTYPE")
)
@Select("""<script>
   SELECT * FROM sys_coe_teammember_perm
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_teammember_perm_dto):sys_coe_teammember_perm_dto?
                


@Insert("""<script>
    insert into sys_coe_teammember_perm
    (ID,TEAMID,USERID,ACTIONTYPE)
    values
    (#{ID},#{TEAMID},#{USERID},#{ACTIONTYPE})
</script>""")
fun Insert(model:sys_coe_teammember_perm_dto):Unit
                


@Insert("""<script>
    insert into sys_coe_teammember_perm
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='TEAMID!= null'> 
           TEAMID,
        </if>
        <if test='USERID!= null'> 
           USERID,
        </if>
        <if test='ACTIONTYPE!= null'> 
           ACTIONTYPE
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='TEAMID!= null'> 
           #{TEAMID,jdbcType=char}，
        </if>
        <if test='USERID!= null'> 
           #{USERID,jdbcType=varchar}，
        </if>
        <if test='ACTIONTYPE!= null'> 
           #{ACTIONTYPE,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_coe_teammember_perm_dto):Unit
                


@Delete("DELETE FROM sys_coe_teammember_perm WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_coe_teammember_perm SET
        ID=#{ID,jdbcType=String},
        TEAMID=#{TEAMID,jdbcType=String},
        USERID=#{USERID,jdbcType=String},
        ACTIONTYPE=#{ACTIONTYPE,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_coe_teammember_perm_dto)
        

@Update("""<script>
            UPDATE sys_coe_teammember_perm SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="TEAMID != null">  TEAMID=#{TEAMID,jdbcType=String},</if>
        <if test="USERID != null">  USERID=#{USERID,jdbcType=String},</if>
        <if test="ACTIONTYPE != null">  ACTIONTYPE=#{ACTIONTYPE,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_coe_teammember_perm_dto)
            

}

        
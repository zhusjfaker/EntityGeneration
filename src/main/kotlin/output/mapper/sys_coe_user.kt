

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_user{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "ISADMIN", column = "ISADMIN")
)
@Select("""<script>
   SELECT * FROM sys_coe_user
</script>""")
fun GetListAll():ArrayList<sys_coe_user_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "ISADMIN", column = "ISADMIN")
)
@Select("""<script>
   SELECT * FROM sys_coe_user
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="ISADMIN!=null">
      ISADMIN=#{ISADMIN}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_user_dto):ArrayList<sys_coe_user_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "ISADMIN", column = "ISADMIN")
)
@Select("""<script>
   SELECT * FROM sys_coe_user
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_user_dto):sys_coe_user_dto?
                


@Insert("""<script>
    insert into sys_coe_user
    (ID,USERID,ISADMIN)
    values
    (#{ID},#{USERID},#{ISADMIN})
</script>""")
fun Insert(model:sys_coe_user_dto):Unit
                


@Insert("""<script>
    insert into sys_coe_user
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='USERID!= null'> 
           USERID,
        </if>
        <if test='ISADMIN!= null'> 
           ISADMIN
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='USERID!= null'> 
           #{USERID,jdbcType=varchar}，
        </if>
        <if test='ISADMIN!= null'> 
           #{ISADMIN,jdbcType=smallint}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_coe_user_dto):Unit
                


@Delete("DELETE FROM sys_coe_user WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_coe_user SET
        ID=#{ID,jdbcType=String},
        USERID=#{USERID,jdbcType=String},
        ISADMIN=#{ISADMIN,jdbcType=Integer}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_coe_user_dto)
        

@Update("""<script>
            UPDATE sys_coe_user SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="USERID != null">  USERID=#{USERID,jdbcType=String},</if>
        <if test="ISADMIN != null">  ISADMIN=#{ISADMIN,jdbcType=Integer}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_coe_user_dto)
            

}

        
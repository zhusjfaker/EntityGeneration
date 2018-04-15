

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_userprofile{


@Results(
   Result(property = "USERID", column = "USERID"),
   Result(property = "PROFILEKEY", column = "PROFILEKEY"),
   Result(property = "PROFILEVALUE", column = "PROFILEVALUE")
)
@Select("""<script>
   SELECT * FROM sys_userprofile
</script>""")
fun GetListAll():ArrayList<sys_userprofile_dto>
        


@Results(
   Result(property = "USERID", column = "USERID"),
   Result(property = "PROFILEKEY", column = "PROFILEKEY"),
   Result(property = "PROFILEVALUE", column = "PROFILEVALUE")
)
@Select("""<script>
   SELECT * FROM sys_userprofile
   <where>
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="PROFILEKEY!=null">
      PROFILEKEY=#{PROFILEKEY}
   </if> 
   <if test="PROFILEVALUE!=null">
      PROFILEVALUE=#{PROFILEVALUE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_userprofile_dto):ArrayList<sys_userprofile_dto>
                


@Results(
   Result(property = "USERID", column = "USERID"),
   Result(property = "PROFILEKEY", column = "PROFILEKEY"),
   Result(property = "PROFILEVALUE", column = "PROFILEVALUE")
)
@Select("""<script>
   SELECT * FROM sys_userprofile
   <where>
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_userprofile_dto):sys_userprofile_dto?
                


@Insert("""<script>
    insert into sys_userprofile
    (USERID,PROFILEKEY,PROFILEVALUE)
    values
    (#{USERID},#{PROFILEKEY},#{PROFILEVALUE})
</script>""")
fun Insert(model:sys_userprofile_dto):Unit
                


@Insert("""<script>
    insert into sys_userprofile
    <trim prefix="(" suffix=")" suffixOverrides="," >
           USERID,
           PROFILEKEY,
        <if test='PROFILEVALUE!= null'> 
           PROFILEVALUE
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{USERID,jdbcType=varchar}，
           #{PROFILEKEY,jdbcType=varchar}，
        <if test='PROFILEVALUE!= null'> 
           #{PROFILEVALUE,jdbcType=text}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_userprofile_dto):Unit
                


@Delete("DELETE FROM sys_userprofile WHERE USERID=#{arg0}")
fun DeleteByPrimaryKey(USERID:String)
        

@Update("""<script>
        UPDATE sys_userprofile SET
        USERID=#{USERID,jdbcType=String},
        PROFILEKEY=#{PROFILEKEY,jdbcType=String},
        PROFILEVALUE=#{PROFILEVALUE,jdbcType=String}
        WHERE USERID=#{USERID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_userprofile_dto)
        

@Update("""<script>
            UPDATE sys_userprofile SET
            <if test="USERID != null">  USERID=#{USERID,jdbcType=String},</if>
        <if test="PROFILEKEY != null">  PROFILEKEY=#{PROFILEKEY,jdbcType=String},</if>
        <if test="PROFILEVALUE != null">  PROFILEVALUE=#{PROFILEVALUE,jdbcType=String}
              WHERE USERID=#{USERID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_userprofile_dto)
            

}

        
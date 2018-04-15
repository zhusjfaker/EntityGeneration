

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface orguser_pwd_cycle{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "PASSWORD", column = "PASSWORD"),
   Result(property = "LASTDATE", column = "LASTDATE"),
   Result(property = "IP", column = "IP")
)
@Select("""<script>
   SELECT * FROM orguser_pwd_cycle
</script>""")
fun GetListAll():ArrayList<orguser_pwd_cycle_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "PASSWORD", column = "PASSWORD"),
   Result(property = "LASTDATE", column = "LASTDATE"),
   Result(property = "IP", column = "IP")
)
@Select("""<script>
   SELECT * FROM orguser_pwd_cycle
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="PASSWORD!=null">
      PASSWORD=#{PASSWORD}
   </if> 
   <if test="LASTDATE!=null">
      LASTDATE=#{LASTDATE}
   </if> 
   <if test="IP!=null">
      IP=#{IP}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:orguser_pwd_cycle_dto):ArrayList<orguser_pwd_cycle_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "PASSWORD", column = "PASSWORD"),
   Result(property = "LASTDATE", column = "LASTDATE"),
   Result(property = "IP", column = "IP")
)
@Select("""<script>
   SELECT * FROM orguser_pwd_cycle
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:orguser_pwd_cycle_dto):orguser_pwd_cycle_dto?
                


@Insert("""<script>
    insert into orguser_pwd_cycle
    (ID,USERID,PASSWORD,LASTDATE,IP)
    values
    (#{ID},#{USERID},#{PASSWORD},#{LASTDATE},#{IP})
</script>""")
fun Insert(model:orguser_pwd_cycle_dto):Unit
                


@Insert("""<script>
    insert into orguser_pwd_cycle
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='USERID!= null'> 
           USERID,
        </if>
        <if test='PASSWORD!= null'> 
           PASSWORD,
        </if>
        <if test='LASTDATE!= null'> 
           LASTDATE,
        </if>
        <if test='IP!= null'> 
           IP
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='USERID!= null'> 
           #{USERID,jdbcType=varchar}，
        </if>
        <if test='PASSWORD!= null'> 
           #{PASSWORD,jdbcType=varchar}，
        </if>
        <if test='LASTDATE!= null'> 
           #{LASTDATE,jdbcType=datetime}，
        </if>
        <if test='IP!= null'> 
           #{IP,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:orguser_pwd_cycle_dto):Unit
                


@Delete("DELETE FROM orguser_pwd_cycle WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE orguser_pwd_cycle SET
        ID=#{ID,jdbcType=String},
        USERID=#{USERID,jdbcType=String},
        PASSWORD=#{PASSWORD,jdbcType=String},
        LASTDATE=#{LASTDATE,jdbcType=Timestamp},
        IP=#{IP,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:orguser_pwd_cycle_dto)
        

@Update("""<script>
            UPDATE orguser_pwd_cycle SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="USERID != null">  USERID=#{USERID,jdbcType=String},</if>
        <if test="PASSWORD != null">  PASSWORD=#{PASSWORD,jdbcType=String},</if>
        <if test="LASTDATE != null">  LASTDATE=#{LASTDATE,jdbcType=Timestamp},</if>
        <if test="IP != null">  IP=#{IP,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:orguser_pwd_cycle_dto)
            

}

        
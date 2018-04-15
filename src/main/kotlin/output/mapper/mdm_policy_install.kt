

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface mdm_policy_install{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "POLICYID", column = "POLICYID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "INSTALLVERSION", column = "INSTALLVERSION"),
   Result(property = "INSTALLTIME", column = "INSTALLTIME")
)
@Select("""<script>
   SELECT * FROM mdm_policy_install
</script>""")
fun GetListAll():ArrayList<mdm_policy_install_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "POLICYID", column = "POLICYID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "INSTALLVERSION", column = "INSTALLVERSION"),
   Result(property = "INSTALLTIME", column = "INSTALLTIME")
)
@Select("""<script>
   SELECT * FROM mdm_policy_install
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="POLICYID!=null">
      POLICYID=#{POLICYID}
   </if> 
   <if test="DEVICEID!=null">
      DEVICEID=#{DEVICEID}
   </if> 
   <if test="INSTALLVERSION!=null">
      INSTALLVERSION=#{INSTALLVERSION}
   </if> 
   <if test="INSTALLTIME!=null">
      INSTALLTIME=#{INSTALLTIME}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:mdm_policy_install_dto):ArrayList<mdm_policy_install_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "POLICYID", column = "POLICYID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "INSTALLVERSION", column = "INSTALLVERSION"),
   Result(property = "INSTALLTIME", column = "INSTALLTIME")
)
@Select("""<script>
   SELECT * FROM mdm_policy_install
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:mdm_policy_install_dto):mdm_policy_install_dto?
                


@Insert("""<script>
    insert into mdm_policy_install
    (ID,POLICYID,DEVICEID,INSTALLVERSION,INSTALLTIME)
    values
    (#{ID},#{POLICYID},#{DEVICEID},#{INSTALLVERSION},#{INSTALLTIME})
</script>""")
fun Insert(model:mdm_policy_install_dto):Unit
                


@Insert("""<script>
    insert into mdm_policy_install
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
           POLICYID,
           DEVICEID,
        <if test='INSTALLVERSION!= null'> 
           INSTALLVERSION,
        </if>
        <if test='INSTALLTIME!= null'> 
           INSTALLTIME
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
           #{POLICYID,jdbcType=char}，
           #{DEVICEID,jdbcType=char}，
        <if test='INSTALLVERSION!= null'> 
           #{INSTALLVERSION,jdbcType=decimal}，
        </if>
        <if test='INSTALLTIME!= null'> 
           #{INSTALLTIME,jdbcType=datetime}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:mdm_policy_install_dto):Unit
                


@Delete("DELETE FROM mdm_policy_install WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE mdm_policy_install SET
        ID=#{ID,jdbcType=String},
        POLICYID=#{POLICYID,jdbcType=String},
        DEVICEID=#{DEVICEID,jdbcType=String},
        INSTALLVERSION=#{INSTALLVERSION,jdbcType=BigDecimal},
        INSTALLTIME=#{INSTALLTIME,jdbcType=Timestamp}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:mdm_policy_install_dto)
        

@Update("""<script>
            UPDATE mdm_policy_install SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="POLICYID != null">  POLICYID=#{POLICYID,jdbcType=String},</if>
        <if test="DEVICEID != null">  DEVICEID=#{DEVICEID,jdbcType=String},</if>
        <if test="INSTALLVERSION != null">  INSTALLVERSION=#{INSTALLVERSION,jdbcType=BigDecimal},</if>
        <if test="INSTALLTIME != null">  INSTALLTIME=#{INSTALLTIME,jdbcType=Timestamp}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:mdm_policy_install_dto)
            

}

        
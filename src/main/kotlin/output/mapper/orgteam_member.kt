

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface orgteam_member{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TEAMID", column = "TEAMID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "MEMBERTYPE", column = "MEMBERTYPE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM orgteam_member
</script>""")
fun GetListAll():ArrayList<orgteam_member_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TEAMID", column = "TEAMID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "MEMBERTYPE", column = "MEMBERTYPE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM orgteam_member
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
   <if test="MEMBERTYPE!=null">
      MEMBERTYPE=#{MEMBERTYPE}
   </if> 
   <if test="ORDERINDEX!=null">
      ORDERINDEX=#{ORDERINDEX}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:orgteam_member_dto):ArrayList<orgteam_member_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TEAMID", column = "TEAMID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "MEMBERTYPE", column = "MEMBERTYPE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM orgteam_member
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:orgteam_member_dto):orgteam_member_dto?
                


@Insert("""<script>
    insert into orgteam_member
    (ID,TEAMID,USERID,MEMBERTYPE,ORDERINDEX)
    values
    (#{ID},#{TEAMID},#{USERID},#{MEMBERTYPE},#{ORDERINDEX})
</script>""")
fun Insert(model:orgteam_member_dto):Unit
                


@Insert("""<script>
    insert into orgteam_member
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
           TEAMID,
           USERID,
        <if test='MEMBERTYPE!= null'> 
           MEMBERTYPE,
        </if>
        <if test='ORDERINDEX!= null'> 
           ORDERINDEX
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=varchar}，
           #{TEAMID,jdbcType=varchar}，
           #{USERID,jdbcType=varchar}，
        <if test='MEMBERTYPE!= null'> 
           #{MEMBERTYPE,jdbcType=smallint}，
        </if>
        <if test='ORDERINDEX!= null'> 
           #{ORDERINDEX,jdbcType=decimal}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:orgteam_member_dto):Unit
                


@Delete("DELETE FROM orgteam_member WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE orgteam_member SET
        ID=#{ID,jdbcType=String},
        TEAMID=#{TEAMID,jdbcType=String},
        USERID=#{USERID,jdbcType=String},
        MEMBERTYPE=#{MEMBERTYPE,jdbcType=Integer},
        ORDERINDEX=#{ORDERINDEX,jdbcType=BigDecimal}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:orgteam_member_dto)
        

@Update("""<script>
            UPDATE orgteam_member SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="TEAMID != null">  TEAMID=#{TEAMID,jdbcType=String},</if>
        <if test="USERID != null">  USERID=#{USERID,jdbcType=String},</if>
        <if test="MEMBERTYPE != null">  MEMBERTYPE=#{MEMBERTYPE,jdbcType=Integer},</if>
        <if test="ORDERINDEX != null">  ORDERINDEX=#{ORDERINDEX,jdbcType=BigDecimal}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:orgteam_member_dto)
            

}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfh_urltoken{


@Results(
   Result(property = "TOKENID", column = "TOKENID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "AWSUID", column = "AWSUID"),
   Result(property = "TOKENSTATE", column = "TOKENSTATE"),
   Result(property = "MEMO", column = "MEMO")
)
@Select("""<script>
   SELECT * FROM wfh_urltoken
</script>""")
fun GetListAll():ArrayList<wfh_urltoken_dto>
        


@Results(
   Result(property = "TOKENID", column = "TOKENID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "AWSUID", column = "AWSUID"),
   Result(property = "TOKENSTATE", column = "TOKENSTATE"),
   Result(property = "MEMO", column = "MEMO")
)
@Select("""<script>
   SELECT * FROM wfh_urltoken
   <where>
   <if test="TOKENID!=null">
      TOKENID=#{TOKENID}
   </if> 
   <if test="PROCESSINSTID!=null">
      PROCESSINSTID=#{PROCESSINSTID}
   </if> 
   <if test="TASKINSTID!=null">
      TASKINSTID=#{TASKINSTID}
   </if> 
   <if test="AWSUID!=null">
      AWSUID=#{AWSUID}
   </if> 
   <if test="TOKENSTATE!=null">
      TOKENSTATE=#{TOKENSTATE}
   </if> 
   <if test="MEMO!=null">
      MEMO=#{MEMO}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:wfh_urltoken_dto):ArrayList<wfh_urltoken_dto>
                


@Results(
   Result(property = "TOKENID", column = "TOKENID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "AWSUID", column = "AWSUID"),
   Result(property = "TOKENSTATE", column = "TOKENSTATE"),
   Result(property = "MEMO", column = "MEMO")
)
@Select("""<script>
   SELECT * FROM wfh_urltoken
   <where>
   <if test="TOKENID!=null">
      TOKENID=#{TOKENID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:wfh_urltoken_dto):wfh_urltoken_dto?
                


@Insert("""<script>
    insert into wfh_urltoken
    (TOKENID,PROCESSINSTID,TASKINSTID,AWSUID,TOKENSTATE,MEMO)
    values
    (#{TOKENID},#{PROCESSINSTID},#{TASKINSTID},#{AWSUID},#{TOKENSTATE},#{MEMO})
</script>""")
fun Insert(model:wfh_urltoken_dto):Unit
                


@Insert("""<script>
    insert into wfh_urltoken
    <trim prefix="(" suffix=")" suffixOverrides="," >
           TOKENID,
        <if test='PROCESSINSTID!= null'> 
           PROCESSINSTID,
        </if>
        <if test='TASKINSTID!= null'> 
           TASKINSTID,
        </if>
        <if test='AWSUID!= null'> 
           AWSUID,
        </if>
        <if test='TOKENSTATE!= null'> 
           TOKENSTATE,
        </if>
        <if test='MEMO!= null'> 
           MEMO
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{TOKENID,jdbcType=varchar}，
        <if test='PROCESSINSTID!= null'> 
           #{PROCESSINSTID,jdbcType=char}，
        </if>
        <if test='TASKINSTID!= null'> 
           #{TASKINSTID,jdbcType=char}，
        </if>
        <if test='AWSUID!= null'> 
           #{AWSUID,jdbcType=varchar}，
        </if>
        <if test='TOKENSTATE!= null'> 
           #{TOKENSTATE,jdbcType=smallint}，
        </if>
        <if test='MEMO!= null'> 
           #{MEMO,jdbcType=text}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:wfh_urltoken_dto):Unit
                

}

        
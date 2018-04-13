

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_cms_data_reply{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DATAID", column = "DATAID"),
   Result(property = "REPLYER", column = "REPLYER"),
   Result(property = "REPLYTIME", column = "REPLYTIME"),
   Result(property = "REPLYCONTENT", column = "REPLYCONTENT"),
   Result(property = "ORGID", column = "ORGID"),
   Result(property = "REPLYERIP", column = "REPLYERIP")
)
@Select("""<script>
   SELECT * FROM app_act_cms_data_reply
</script>""")
fun GetListAll():ArrayList<app_act_cms_data_reply_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DATAID", column = "DATAID"),
   Result(property = "REPLYER", column = "REPLYER"),
   Result(property = "REPLYTIME", column = "REPLYTIME"),
   Result(property = "REPLYCONTENT", column = "REPLYCONTENT"),
   Result(property = "ORGID", column = "ORGID"),
   Result(property = "REPLYERIP", column = "REPLYERIP")
)
@Select("""<script>
   SELECT * FROM app_act_cms_data_reply
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="DATAID!=null">
      DATAID=#{DATAID}
   </if> 
   <if test="REPLYER!=null">
      REPLYER=#{REPLYER}
   </if> 
   <if test="REPLYTIME!=null">
      REPLYTIME=#{REPLYTIME}
   </if> 
   <if test="REPLYCONTENT!=null">
      REPLYCONTENT=#{REPLYCONTENT}
   </if> 
   <if test="ORGID!=null">
      ORGID=#{ORGID}
   </if> 
   <if test="REPLYERIP!=null">
      REPLYERIP=#{REPLYERIP}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_cms_data_reply_dto):ArrayList<app_act_cms_data_reply_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DATAID", column = "DATAID"),
   Result(property = "REPLYER", column = "REPLYER"),
   Result(property = "REPLYTIME", column = "REPLYTIME"),
   Result(property = "REPLYCONTENT", column = "REPLYCONTENT"),
   Result(property = "ORGID", column = "ORGID"),
   Result(property = "REPLYERIP", column = "REPLYERIP")
)
@Select("""<script>
   SELECT * FROM app_act_cms_data_reply
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_cms_data_reply_dto):app_act_cms_data_reply_dto?
                


@Insert("""<script>
    insert into app_act_cms_data_reply
    (ID,DATAID,REPLYER,REPLYTIME,REPLYCONTENT,ORGID,REPLYERIP)
    values
    (#{ID},#{DATAID},#{REPLYER},#{REPLYTIME},#{REPLYCONTENT},#{ORGID},#{REPLYERIP})
</script>""")
fun Insert(model:app_act_cms_data_reply_dto):Unit
                


@Insert("""<script>
    insert into app_act_cms_data_reply
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='DATAID!= null'> 
           DATAID,
        </if>
        <if test='REPLYER!= null'> 
           REPLYER,
        </if>
        <if test='REPLYTIME!= null'> 
           REPLYTIME,
        </if>
        <if test='REPLYCONTENT!= null'> 
           REPLYCONTENT,
        </if>
        <if test='ORGID!= null'> 
           ORGID,
        </if>
        <if test='REPLYERIP!= null'> 
           REPLYERIP
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='DATAID!= null'> 
           #{DATAID,jdbcType=char}，
        </if>
        <if test='REPLYER!= null'> 
           #{REPLYER,jdbcType=varchar}，
        </if>
        <if test='REPLYTIME!= null'> 
           #{REPLYTIME,jdbcType=datetime}，
        </if>
        <if test='REPLYCONTENT!= null'> 
           #{REPLYCONTENT,jdbcType=text}，
        </if>
        <if test='ORGID!= null'> 
           #{ORGID,jdbcType=varchar}，
        </if>
        <if test='REPLYERIP!= null'> 
           #{REPLYERIP,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_cms_data_reply_dto):Unit
                

}

        
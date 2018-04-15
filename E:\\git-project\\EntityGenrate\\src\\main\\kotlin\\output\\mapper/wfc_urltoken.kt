

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfc_urltoken{


@Results(
   Result(property = "TOKENID", column = "TOKENID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "AWSUID", column = "AWSUID"),
   Result(property = "TOKENSTATE", column = "TOKENSTATE"),
   Result(property = "ACCESSTIME", column = "ACCESSTIME"),
   Result(property = "MEMO", column = "MEMO")
)
@Select("""<script>
   SELECT * FROM wfc_urltoken
</script>""")
fun GetListAll():ArrayList<wfc_urltoken_dto>
        


@Results(
   Result(property = "TOKENID", column = "TOKENID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "AWSUID", column = "AWSUID"),
   Result(property = "TOKENSTATE", column = "TOKENSTATE"),
   Result(property = "ACCESSTIME", column = "ACCESSTIME"),
   Result(property = "MEMO", column = "MEMO")
)
@Select("""<script>
   SELECT * FROM wfc_urltoken
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
   <if test="ACCESSTIME!=null">
      ACCESSTIME=#{ACCESSTIME}
   </if> 
   <if test="MEMO!=null">
      MEMO=#{MEMO}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:wfc_urltoken_dto):ArrayList<wfc_urltoken_dto>
                


@Results(
   Result(property = "TOKENID", column = "TOKENID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "AWSUID", column = "AWSUID"),
   Result(property = "TOKENSTATE", column = "TOKENSTATE"),
   Result(property = "ACCESSTIME", column = "ACCESSTIME"),
   Result(property = "MEMO", column = "MEMO")
)
@Select("""<script>
   SELECT * FROM wfc_urltoken
   <where>
   <if test="TOKENID!=null">
      TOKENID=#{TOKENID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:wfc_urltoken_dto):wfc_urltoken_dto?
                


@Insert("""<script>
    insert into wfc_urltoken
    (TOKENID,PROCESSINSTID,TASKINSTID,AWSUID,TOKENSTATE,ACCESSTIME,MEMO)
    values
    (#{TOKENID},#{PROCESSINSTID},#{TASKINSTID},#{AWSUID},#{TOKENSTATE},#{ACCESSTIME},#{MEMO})
</script>""")
fun Insert(model:wfc_urltoken_dto):Unit
                


@Insert("""<script>
    insert into wfc_urltoken
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
        <if test='ACCESSTIME!= null'> 
           ACCESSTIME,
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
        <if test='ACCESSTIME!= null'> 
           #{ACCESSTIME,jdbcType=datetime}，
        </if>
        <if test='MEMO!= null'> 
           #{MEMO,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:wfc_urltoken_dto):Unit
                


@Delete("DELETE FROM wfc_urltoken WHERE TOKENID=#{arg0}")
fun DeleteByPrimaryKey(TOKENID:String)
        

@Update("""<script>
        UPDATE wfc_urltoken SET
        TOKENID=#{TOKENID,jdbcType=String},
        PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},
        TASKINSTID=#{TASKINSTID,jdbcType=String},
        AWSUID=#{AWSUID,jdbcType=String},
        TOKENSTATE=#{TOKENSTATE,jdbcType=Integer},
        ACCESSTIME=#{ACCESSTIME,jdbcType=Timestamp},
        MEMO=#{MEMO,jdbcType=String}
        WHERE TOKENID=#{TOKENID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:wfc_urltoken_dto)
        

@Update("""<script>
            UPDATE wfc_urltoken SET
            <if test="TOKENID != null">  TOKENID=#{TOKENID,jdbcType=String},</if>
        <if test="PROCESSINSTID != null">  PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},</if>
        <if test="TASKINSTID != null">  TASKINSTID=#{TASKINSTID,jdbcType=String},</if>
        <if test="AWSUID != null">  AWSUID=#{AWSUID,jdbcType=String},</if>
        <if test="TOKENSTATE != null">  TOKENSTATE=#{TOKENSTATE,jdbcType=Integer},</if>
        <if test="ACCESSTIME != null">  ACCESSTIME=#{ACCESSTIME,jdbcType=Timestamp},</if>
        <if test="MEMO != null">  MEMO=#{MEMO,jdbcType=String}
              WHERE TOKENID=#{TOKENID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:wfc_urltoken_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfc_urltoken{


@Results(
   Result(property = "TOKENID", column = "TOKENID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "AWSUID", column = "AWSUID"),
   Result(property = "TOKENSTATE", column = "TOKENSTATE"),
   Result(property = "ACCESSTIME", column = "ACCESSTIME"),
   Result(property = "MEMO", column = "MEMO")
)
@Select("""<script>
   SELECT * FROM wfc_urltoken
</script>""")
fun GetListAll():ArrayList<wfc_urltoken_dto>
        


@Results(
   Result(property = "TOKENID", column = "TOKENID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "AWSUID", column = "AWSUID"),
   Result(property = "TOKENSTATE", column = "TOKENSTATE"),
   Result(property = "ACCESSTIME", column = "ACCESSTIME"),
   Result(property = "MEMO", column = "MEMO")
)
@Select("""<script>
   SELECT * FROM wfc_urltoken
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
   <if test="ACCESSTIME!=null">
      ACCESSTIME=#{ACCESSTIME}
   </if> 
   <if test="MEMO!=null">
      MEMO=#{MEMO}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:wfc_urltoken_dto):ArrayList<wfc_urltoken_dto>
                


@Results(
   Result(property = "TOKENID", column = "TOKENID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "AWSUID", column = "AWSUID"),
   Result(property = "TOKENSTATE", column = "TOKENSTATE"),
   Result(property = "ACCESSTIME", column = "ACCESSTIME"),
   Result(property = "MEMO", column = "MEMO")
)
@Select("""<script>
   SELECT * FROM wfc_urltoken
   <where>
   <if test="TOKENID!=null">
      TOKENID=#{TOKENID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:wfc_urltoken_dto):wfc_urltoken_dto?
                


@Insert("""<script>
    insert into wfc_urltoken
    (TOKENID,PROCESSINSTID,TASKINSTID,AWSUID,TOKENSTATE,ACCESSTIME,MEMO)
    values
    (#{TOKENID},#{PROCESSINSTID},#{TASKINSTID},#{AWSUID},#{TOKENSTATE},#{ACCESSTIME},#{MEMO})
</script>""")
fun Insert(model:wfc_urltoken_dto):Unit
                


@Insert("""<script>
    insert into wfc_urltoken
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
        <if test='ACCESSTIME!= null'> 
           ACCESSTIME,
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
        <if test='ACCESSTIME!= null'> 
           #{ACCESSTIME,jdbcType=datetime}，
        </if>
        <if test='MEMO!= null'> 
           #{MEMO,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:wfc_urltoken_dto):Unit
                


@Delete("DELETE FROM wfc_urltoken WHERE TOKENID=#{arg0}")
fun DeleteByPrimaryKey(TOKENID:String)
        

@Update("""<script>
        UPDATE wfc_urltoken SET
        TOKENID=#{TOKENID,jdbcType=String},
        PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},
        TASKINSTID=#{TASKINSTID,jdbcType=String},
        AWSUID=#{AWSUID,jdbcType=String},
        TOKENSTATE=#{TOKENSTATE,jdbcType=Integer},
        ACCESSTIME=#{ACCESSTIME,jdbcType=Timestamp},
        MEMO=#{MEMO,jdbcType=String}
        WHERE TOKENID=#{TOKENID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:wfc_urltoken_dto)
        

@Update("""<script>
            UPDATE wfc_urltoken SET
            <if test="TOKENID != null">  TOKENID=#{TOKENID,jdbcType=String},</if>
        <if test="PROCESSINSTID != null">  PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},</if>
        <if test="TASKINSTID != null">  TASKINSTID=#{TASKINSTID,jdbcType=String},</if>
        <if test="AWSUID != null">  AWSUID=#{AWSUID,jdbcType=String},</if>
        <if test="TOKENSTATE != null">  TOKENSTATE=#{TOKENSTATE,jdbcType=Integer},</if>
        <if test="ACCESSTIME != null">  ACCESSTIME=#{ACCESSTIME,jdbcType=Timestamp},</if>
        <if test="MEMO != null">  MEMO=#{MEMO,jdbcType=String}
              WHERE TOKENID=#{TOKENID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:wfc_urltoken_dto)
            

}

        
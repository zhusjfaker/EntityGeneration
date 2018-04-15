

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_rongim_token{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TOKEN", column = "TOKEN"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_rongim_token
</script>""")
fun GetListAll():ArrayList<app_act_rongim_token_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TOKEN", column = "TOKEN"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_rongim_token
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="TOKEN!=null">
      TOKEN=#{TOKEN}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_rongim_token_dto):ArrayList<app_act_rongim_token_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TOKEN", column = "TOKEN"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_rongim_token
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_rongim_token_dto):app_act_rongim_token_dto?
                


@Insert("""<script>
    insert into app_act_rongim_token
    (ID,TOKEN,CREATETIME)
    values
    (#{ID},#{TOKEN},#{CREATETIME})
</script>""")
fun Insert(model:app_act_rongim_token_dto):Unit
                


@Insert("""<script>
    insert into app_act_rongim_token
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='TOKEN!= null'> 
           TOKEN,
        </if>
        <if test='CREATETIME!= null'> 
           CREATETIME
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=varchar}，
        <if test='TOKEN!= null'> 
           #{TOKEN,jdbcType=varchar}，
        </if>
        <if test='CREATETIME!= null'> 
           #{CREATETIME,jdbcType=datetime}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_rongim_token_dto):Unit
                


@Delete("DELETE FROM app_act_rongim_token WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE app_act_rongim_token SET
        ID=#{ID,jdbcType=String},
        TOKEN=#{TOKEN,jdbcType=String},
        CREATETIME=#{CREATETIME,jdbcType=Timestamp}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:app_act_rongim_token_dto)
        

@Update("""<script>
            UPDATE app_act_rongim_token SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="TOKEN != null">  TOKEN=#{TOKEN,jdbcType=String},</if>
        <if test="CREATETIME != null">  CREATETIME=#{CREATETIME,jdbcType=Timestamp}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:app_act_rongim_token_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_rongim_token{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TOKEN", column = "TOKEN"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_rongim_token
</script>""")
fun GetListAll():ArrayList<app_act_rongim_token_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TOKEN", column = "TOKEN"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_rongim_token
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="TOKEN!=null">
      TOKEN=#{TOKEN}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_rongim_token_dto):ArrayList<app_act_rongim_token_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TOKEN", column = "TOKEN"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_rongim_token
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_rongim_token_dto):app_act_rongim_token_dto?
                


@Insert("""<script>
    insert into app_act_rongim_token
    (ID,TOKEN,CREATETIME)
    values
    (#{ID},#{TOKEN},#{CREATETIME})
</script>""")
fun Insert(model:app_act_rongim_token_dto):Unit
                


@Insert("""<script>
    insert into app_act_rongim_token
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='TOKEN!= null'> 
           TOKEN,
        </if>
        <if test='CREATETIME!= null'> 
           CREATETIME
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=varchar}，
        <if test='TOKEN!= null'> 
           #{TOKEN,jdbcType=varchar}，
        </if>
        <if test='CREATETIME!= null'> 
           #{CREATETIME,jdbcType=datetime}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_rongim_token_dto):Unit
                


@Delete("DELETE FROM app_act_rongim_token WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE app_act_rongim_token SET
        ID=#{ID,jdbcType=String},
        TOKEN=#{TOKEN,jdbcType=String},
        CREATETIME=#{CREATETIME,jdbcType=Timestamp}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:app_act_rongim_token_dto)
        

@Update("""<script>
            UPDATE app_act_rongim_token SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="TOKEN != null">  TOKEN=#{TOKEN,jdbcType=String},</if>
        <if test="CREATETIME != null">  CREATETIME=#{CREATETIME,jdbcType=Timestamp}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:app_act_rongim_token_dto)
            

}

        
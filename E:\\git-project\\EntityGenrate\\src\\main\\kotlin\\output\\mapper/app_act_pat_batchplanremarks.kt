

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_pat_batchplanremarks{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "REMARKS", column = "REMARKS"),
   Result(property = "STYLE", column = "STYLE")
)
@Select("""<script>
   SELECT * FROM app_act_pat_batchplanremarks
</script>""")
fun GetListAll():ArrayList<app_act_pat_batchplanremarks_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "REMARKS", column = "REMARKS"),
   Result(property = "STYLE", column = "STYLE")
)
@Select("""<script>
   SELECT * FROM app_act_pat_batchplanremarks
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="BATCHPLANID!=null">
      BATCHPLANID=#{BATCHPLANID}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   <if test="REMARKS!=null">
      REMARKS=#{REMARKS}
   </if> 
   <if test="STYLE!=null">
      STYLE=#{STYLE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_pat_batchplanremarks_dto):ArrayList<app_act_pat_batchplanremarks_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "REMARKS", column = "REMARKS"),
   Result(property = "STYLE", column = "STYLE")
)
@Select("""<script>
   SELECT * FROM app_act_pat_batchplanremarks
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_pat_batchplanremarks_dto):app_act_pat_batchplanremarks_dto?
                


@Insert("""<script>
    insert into app_act_pat_batchplanremarks
    (ID,BATCHPLANID,CREATEUSER,CREATETIME,REMARKS,STYLE)
    values
    (#{ID},#{BATCHPLANID},#{CREATEUSER},#{CREATETIME},#{REMARKS},#{STYLE})
</script>""")
fun Insert(model:app_act_pat_batchplanremarks_dto):Unit
                


@Insert("""<script>
    insert into app_act_pat_batchplanremarks
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='BATCHPLANID!= null'> 
           BATCHPLANID,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='CREATETIME!= null'> 
           CREATETIME,
        </if>
        <if test='REMARKS!= null'> 
           REMARKS,
        </if>
        <if test='STYLE!= null'> 
           STYLE
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='BATCHPLANID!= null'> 
           #{BATCHPLANID,jdbcType=char}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='CREATETIME!= null'> 
           #{CREATETIME,jdbcType=datetime}，
        </if>
        <if test='REMARKS!= null'> 
           #{REMARKS,jdbcType=varchar}，
        </if>
        <if test='STYLE!= null'> 
           #{STYLE,jdbcType=smallint}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_pat_batchplanremarks_dto):Unit
                


@Delete("DELETE FROM app_act_pat_batchplanremarks WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE app_act_pat_batchplanremarks SET
        ID=#{ID,jdbcType=String},
        BATCHPLANID=#{BATCHPLANID,jdbcType=String},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        CREATETIME=#{CREATETIME,jdbcType=Timestamp},
        REMARKS=#{REMARKS,jdbcType=String},
        STYLE=#{STYLE,jdbcType=Integer}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:app_act_pat_batchplanremarks_dto)
        

@Update("""<script>
            UPDATE app_act_pat_batchplanremarks SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="BATCHPLANID != null">  BATCHPLANID=#{BATCHPLANID,jdbcType=String},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="CREATETIME != null">  CREATETIME=#{CREATETIME,jdbcType=Timestamp},</if>
        <if test="REMARKS != null">  REMARKS=#{REMARKS,jdbcType=String},</if>
        <if test="STYLE != null">  STYLE=#{STYLE,jdbcType=Integer}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:app_act_pat_batchplanremarks_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_pat_batchplanremarks{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "REMARKS", column = "REMARKS"),
   Result(property = "STYLE", column = "STYLE")
)
@Select("""<script>
   SELECT * FROM app_act_pat_batchplanremarks
</script>""")
fun GetListAll():ArrayList<app_act_pat_batchplanremarks_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "REMARKS", column = "REMARKS"),
   Result(property = "STYLE", column = "STYLE")
)
@Select("""<script>
   SELECT * FROM app_act_pat_batchplanremarks
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="BATCHPLANID!=null">
      BATCHPLANID=#{BATCHPLANID}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   <if test="REMARKS!=null">
      REMARKS=#{REMARKS}
   </if> 
   <if test="STYLE!=null">
      STYLE=#{STYLE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_pat_batchplanremarks_dto):ArrayList<app_act_pat_batchplanremarks_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "REMARKS", column = "REMARKS"),
   Result(property = "STYLE", column = "STYLE")
)
@Select("""<script>
   SELECT * FROM app_act_pat_batchplanremarks
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_pat_batchplanremarks_dto):app_act_pat_batchplanremarks_dto?
                


@Insert("""<script>
    insert into app_act_pat_batchplanremarks
    (ID,BATCHPLANID,CREATEUSER,CREATETIME,REMARKS,STYLE)
    values
    (#{ID},#{BATCHPLANID},#{CREATEUSER},#{CREATETIME},#{REMARKS},#{STYLE})
</script>""")
fun Insert(model:app_act_pat_batchplanremarks_dto):Unit
                


@Insert("""<script>
    insert into app_act_pat_batchplanremarks
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='BATCHPLANID!= null'> 
           BATCHPLANID,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='CREATETIME!= null'> 
           CREATETIME,
        </if>
        <if test='REMARKS!= null'> 
           REMARKS,
        </if>
        <if test='STYLE!= null'> 
           STYLE
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='BATCHPLANID!= null'> 
           #{BATCHPLANID,jdbcType=char}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='CREATETIME!= null'> 
           #{CREATETIME,jdbcType=datetime}，
        </if>
        <if test='REMARKS!= null'> 
           #{REMARKS,jdbcType=varchar}，
        </if>
        <if test='STYLE!= null'> 
           #{STYLE,jdbcType=smallint}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_pat_batchplanremarks_dto):Unit
                


@Delete("DELETE FROM app_act_pat_batchplanremarks WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE app_act_pat_batchplanremarks SET
        ID=#{ID,jdbcType=String},
        BATCHPLANID=#{BATCHPLANID,jdbcType=String},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        CREATETIME=#{CREATETIME,jdbcType=Timestamp},
        REMARKS=#{REMARKS,jdbcType=String},
        STYLE=#{STYLE,jdbcType=Integer}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:app_act_pat_batchplanremarks_dto)
        

@Update("""<script>
            UPDATE app_act_pat_batchplanremarks SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="BATCHPLANID != null">  BATCHPLANID=#{BATCHPLANID,jdbcType=String},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="CREATETIME != null">  CREATETIME=#{CREATETIME,jdbcType=Timestamp},</if>
        <if test="REMARKS != null">  REMARKS=#{REMARKS,jdbcType=String},</if>
        <if test="STYLE != null">  STYLE=#{STYLE,jdbcType=Integer}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:app_act_pat_batchplanremarks_dto)
            

}

        
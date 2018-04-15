

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_act_comments_lib{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ORGID", column = "ORGID"),
   Result(property = "BINDID", column = "BINDID"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE"),
   Result(property = "UPDATEUSER", column = "UPDATEUSER"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ISEND", column = "ISEND"),
   Result(property = "MSG", column = "MSG"),
   Result(property = "MENUS", column = "MENUS"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "ISACTIVE", column = "ISACTIVE")
)
@Select("""<script>
   SELECT * FROM bo_act_comments_lib
</script>""")
fun GetListAll():ArrayList<bo_act_comments_lib_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ORGID", column = "ORGID"),
   Result(property = "BINDID", column = "BINDID"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE"),
   Result(property = "UPDATEUSER", column = "UPDATEUSER"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ISEND", column = "ISEND"),
   Result(property = "MSG", column = "MSG"),
   Result(property = "MENUS", column = "MENUS"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "ISACTIVE", column = "ISACTIVE")
)
@Select("""<script>
   SELECT * FROM bo_act_comments_lib
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="ORGID!=null">
      ORGID=#{ORGID}
   </if> 
   <if test="BINDID!=null">
      BINDID=#{BINDID}
   </if> 
   <if test="CREATEDATE!=null">
      CREATEDATE=#{CREATEDATE}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="UPDATEDATE!=null">
      UPDATEDATE=#{UPDATEDATE}
   </if> 
   <if test="UPDATEUSER!=null">
      UPDATEUSER=#{UPDATEUSER}
   </if> 
   <if test="PROCESSDEFID!=null">
      PROCESSDEFID=#{PROCESSDEFID}
   </if> 
   <if test="ISEND!=null">
      ISEND=#{ISEND}
   </if> 
   <if test="MSG!=null">
      MSG=#{MSG}
   </if> 
   <if test="MENUS!=null">
      MENUS=#{MENUS}
   </if> 
   <if test="ORDERINDEX!=null">
      ORDERINDEX=#{ORDERINDEX}
   </if> 
   <if test="ISACTIVE!=null">
      ISACTIVE=#{ISACTIVE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:bo_act_comments_lib_dto):ArrayList<bo_act_comments_lib_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ORGID", column = "ORGID"),
   Result(property = "BINDID", column = "BINDID"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE"),
   Result(property = "UPDATEUSER", column = "UPDATEUSER"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ISEND", column = "ISEND"),
   Result(property = "MSG", column = "MSG"),
   Result(property = "MENUS", column = "MENUS"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "ISACTIVE", column = "ISACTIVE")
)
@Select("""<script>
   SELECT * FROM bo_act_comments_lib
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:bo_act_comments_lib_dto):bo_act_comments_lib_dto?
                


@Insert("""<script>
    insert into bo_act_comments_lib
    (ID,ORGID,BINDID,CREATEDATE,CREATEUSER,UPDATEDATE,UPDATEUSER,PROCESSDEFID,ISEND,MSG,MENUS,ORDERINDEX,ISACTIVE)
    values
    (#{ID},#{ORGID},#{BINDID},#{CREATEDATE},#{CREATEUSER},#{UPDATEDATE},#{UPDATEUSER},#{PROCESSDEFID},#{ISEND},#{MSG},#{MENUS},#{ORDERINDEX},#{ISACTIVE})
</script>""")
fun Insert(model:bo_act_comments_lib_dto):Unit
                


@Insert("""<script>
    insert into bo_act_comments_lib
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='ORGID!= null'> 
           ORGID,
        </if>
        <if test='BINDID!= null'> 
           BINDID,
        </if>
        <if test='CREATEDATE!= null'> 
           CREATEDATE,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='UPDATEDATE!= null'> 
           UPDATEDATE,
        </if>
        <if test='UPDATEUSER!= null'> 
           UPDATEUSER,
        </if>
        <if test='PROCESSDEFID!= null'> 
           PROCESSDEFID,
        </if>
           ISEND,
        <if test='MSG!= null'> 
           MSG,
        </if>
        <if test='MENUS!= null'> 
           MENUS,
        </if>
        <if test='ORDERINDEX!= null'> 
           ORDERINDEX,
        </if>
        <if test='ISACTIVE!= null'> 
           ISACTIVE
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='ORGID!= null'> 
           #{ORGID,jdbcType=varchar}，
        </if>
        <if test='BINDID!= null'> 
           #{BINDID,jdbcType=char}，
        </if>
        <if test='CREATEDATE!= null'> 
           #{CREATEDATE,jdbcType=timestamp}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='UPDATEDATE!= null'> 
           #{UPDATEDATE,jdbcType=timestamp}，
        </if>
        <if test='UPDATEUSER!= null'> 
           #{UPDATEUSER,jdbcType=varchar}，
        </if>
        <if test='PROCESSDEFID!= null'> 
           #{PROCESSDEFID,jdbcType=char}，
        </if>
           #{ISEND,jdbcType=smallint}，
        <if test='MSG!= null'> 
           #{MSG,jdbcType=text}，
        </if>
        <if test='MENUS!= null'> 
           #{MENUS,jdbcType=text}，
        </if>
        <if test='ORDERINDEX!= null'> 
           #{ORDERINDEX,jdbcType=decimal}，
        </if>
        <if test='ISACTIVE!= null'> 
           #{ISACTIVE,jdbcType=decimal}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:bo_act_comments_lib_dto):Unit
                


@Delete("DELETE FROM bo_act_comments_lib WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE bo_act_comments_lib SET
        ID=#{ID,jdbcType=String},
        ORGID=#{ORGID,jdbcType=String},
        BINDID=#{BINDID,jdbcType=String},
        CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp},
        UPDATEUSER=#{UPDATEUSER,jdbcType=String},
        PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},
        ISEND=#{ISEND,jdbcType=Integer},
        MSG=#{MSG,jdbcType=String},
        MENUS=#{MENUS,jdbcType=String},
        ORDERINDEX=#{ORDERINDEX,jdbcType=BigDecimal},
        ISACTIVE=#{ISACTIVE,jdbcType=BigDecimal}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:bo_act_comments_lib_dto)
        

@Update("""<script>
            UPDATE bo_act_comments_lib SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="ORGID != null">  ORGID=#{ORGID,jdbcType=String},</if>
        <if test="BINDID != null">  BINDID=#{BINDID,jdbcType=String},</if>
        <if test="CREATEDATE != null">  CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="UPDATEDATE != null">  UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp},</if>
        <if test="UPDATEUSER != null">  UPDATEUSER=#{UPDATEUSER,jdbcType=String},</if>
        <if test="PROCESSDEFID != null">  PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},</if>
        <if test="ISEND != null">  ISEND=#{ISEND,jdbcType=Integer},</if>
        <if test="MSG != null">  MSG=#{MSG,jdbcType=String},</if>
        <if test="MENUS != null">  MENUS=#{MENUS,jdbcType=String},</if>
        <if test="ORDERINDEX != null">  ORDERINDEX=#{ORDERINDEX,jdbcType=BigDecimal},</if>
        <if test="ISACTIVE != null">  ISACTIVE=#{ISACTIVE,jdbcType=BigDecimal}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:bo_act_comments_lib_dto)
            

}

        
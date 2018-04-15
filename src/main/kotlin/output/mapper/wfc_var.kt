

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfc_var{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "VARSCOPE", column = "VARSCOPE"),
   Result(property = "VARNAME", column = "VARNAME"),
   Result(property = "VALUETYPE", column = "VALUETYPE"),
   Result(property = "TEXTVALUE", column = "TEXTVALUE"),
   Result(property = "LONGVALUE", column = "LONGVALUE"),
   Result(property = "DOUBLEVALUE", column = "DOUBLEVALUE"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "UPDATETIME", column = "UPDATETIME")
)
@Select("""<script>
   SELECT * FROM wfc_var
</script>""")
fun GetListAll():ArrayList<wfc_var_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "VARSCOPE", column = "VARSCOPE"),
   Result(property = "VARNAME", column = "VARNAME"),
   Result(property = "VALUETYPE", column = "VALUETYPE"),
   Result(property = "TEXTVALUE", column = "TEXTVALUE"),
   Result(property = "LONGVALUE", column = "LONGVALUE"),
   Result(property = "DOUBLEVALUE", column = "DOUBLEVALUE"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "UPDATETIME", column = "UPDATETIME")
)
@Select("""<script>
   SELECT * FROM wfc_var
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="PROCESSINSTID!=null">
      PROCESSINSTID=#{PROCESSINSTID}
   </if> 
   <if test="VARSCOPE!=null">
      VARSCOPE=#{VARSCOPE}
   </if> 
   <if test="VARNAME!=null">
      VARNAME=#{VARNAME}
   </if> 
   <if test="VALUETYPE!=null">
      VALUETYPE=#{VALUETYPE}
   </if> 
   <if test="TEXTVALUE!=null">
      TEXTVALUE=#{TEXTVALUE}
   </if> 
   <if test="LONGVALUE!=null">
      LONGVALUE=#{LONGVALUE}
   </if> 
   <if test="DOUBLEVALUE!=null">
      DOUBLEVALUE=#{DOUBLEVALUE}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   <if test="UPDATETIME!=null">
      UPDATETIME=#{UPDATETIME}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:wfc_var_dto):ArrayList<wfc_var_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "VARSCOPE", column = "VARSCOPE"),
   Result(property = "VARNAME", column = "VARNAME"),
   Result(property = "VALUETYPE", column = "VALUETYPE"),
   Result(property = "TEXTVALUE", column = "TEXTVALUE"),
   Result(property = "LONGVALUE", column = "LONGVALUE"),
   Result(property = "DOUBLEVALUE", column = "DOUBLEVALUE"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "UPDATETIME", column = "UPDATETIME")
)
@Select("""<script>
   SELECT * FROM wfc_var
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:wfc_var_dto):wfc_var_dto?
                


@Insert("""<script>
    insert into wfc_var
    (ID,PROCESSINSTID,VARSCOPE,VARNAME,VALUETYPE,TEXTVALUE,LONGVALUE,DOUBLEVALUE,CREATETIME,UPDATETIME)
    values
    (#{ID},#{PROCESSINSTID},#{VARSCOPE},#{VARNAME},#{VALUETYPE},#{TEXTVALUE},#{LONGVALUE},#{DOUBLEVALUE},#{CREATETIME},#{UPDATETIME})
</script>""")
fun Insert(model:wfc_var_dto):Unit
                


@Insert("""<script>
    insert into wfc_var
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='PROCESSINSTID!= null'> 
           PROCESSINSTID,
        </if>
        <if test='VARSCOPE!= null'> 
           VARSCOPE,
        </if>
        <if test='VARNAME!= null'> 
           VARNAME,
        </if>
        <if test='VALUETYPE!= null'> 
           VALUETYPE,
        </if>
        <if test='TEXTVALUE!= null'> 
           TEXTVALUE,
        </if>
        <if test='LONGVALUE!= null'> 
           LONGVALUE,
        </if>
        <if test='DOUBLEVALUE!= null'> 
           DOUBLEVALUE,
        </if>
        <if test='CREATETIME!= null'> 
           CREATETIME,
        </if>
        <if test='UPDATETIME!= null'> 
           UPDATETIME
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='PROCESSINSTID!= null'> 
           #{PROCESSINSTID,jdbcType=char}，
        </if>
        <if test='VARSCOPE!= null'> 
           #{VARSCOPE,jdbcType=varchar}，
        </if>
        <if test='VARNAME!= null'> 
           #{VARNAME,jdbcType=varchar}，
        </if>
        <if test='VALUETYPE!= null'> 
           #{VALUETYPE,jdbcType=varchar}，
        </if>
        <if test='TEXTVALUE!= null'> 
           #{TEXTVALUE,jdbcType=text}，
        </if>
        <if test='LONGVALUE!= null'> 
           #{LONGVALUE,jdbcType=decimal}，
        </if>
        <if test='DOUBLEVALUE!= null'> 
           #{DOUBLEVALUE,jdbcType=decimal}，
        </if>
        <if test='CREATETIME!= null'> 
           #{CREATETIME,jdbcType=datetime}，
        </if>
        <if test='UPDATETIME!= null'> 
           #{UPDATETIME,jdbcType=datetime}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:wfc_var_dto):Unit
                


@Delete("DELETE FROM wfc_var WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE wfc_var SET
        ID=#{ID,jdbcType=String},
        PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},
        VARSCOPE=#{VARSCOPE,jdbcType=String},
        VARNAME=#{VARNAME,jdbcType=String},
        VALUETYPE=#{VALUETYPE,jdbcType=String},
        TEXTVALUE=#{TEXTVALUE,jdbcType=String},
        LONGVALUE=#{LONGVALUE,jdbcType=BigDecimal},
        DOUBLEVALUE=#{DOUBLEVALUE,jdbcType=BigDecimal},
        CREATETIME=#{CREATETIME,jdbcType=Timestamp},
        UPDATETIME=#{UPDATETIME,jdbcType=Timestamp}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:wfc_var_dto)
        

@Update("""<script>
            UPDATE wfc_var SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="PROCESSINSTID != null">  PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},</if>
        <if test="VARSCOPE != null">  VARSCOPE=#{VARSCOPE,jdbcType=String},</if>
        <if test="VARNAME != null">  VARNAME=#{VARNAME,jdbcType=String},</if>
        <if test="VALUETYPE != null">  VALUETYPE=#{VALUETYPE,jdbcType=String},</if>
        <if test="TEXTVALUE != null">  TEXTVALUE=#{TEXTVALUE,jdbcType=String},</if>
        <if test="LONGVALUE != null">  LONGVALUE=#{LONGVALUE,jdbcType=BigDecimal},</if>
        <if test="DOUBLEVALUE != null">  DOUBLEVALUE=#{DOUBLEVALUE,jdbcType=BigDecimal},</if>
        <if test="CREATETIME != null">  CREATETIME=#{CREATETIME,jdbcType=Timestamp},</if>
        <if test="UPDATETIME != null">  UPDATETIME=#{UPDATETIME,jdbcType=Timestamp}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:wfc_var_dto)
            

}

        
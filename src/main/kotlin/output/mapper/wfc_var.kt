

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
    insert into TStudent
    (ID,PROCESSINSTID,VARSCOPE,VARNAME,VALUETYPE,TEXTVALUE,LONGVALUE,DOUBLEVALUE,CREATETIME,UPDATETIME)
    values
    (#{ID},#{PROCESSINSTID},#{VARSCOPE},#{VARNAME},#{VALUETYPE},#{TEXTVALUE},#{LONGVALUE},#{DOUBLEVALUE},#{CREATETIME},#{UPDATETIME})
</script>""")
fun insert(model:wfc_var_dto):Unit
                

}

        
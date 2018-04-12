

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfc_sharedata_mapping{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PARENTINSTID", column = "PARENTINSTID"),
   Result(property = "PARENTBOID", column = "PARENTBOID"),
   Result(property = "SUBINSTID", column = "SUBINSTID"),
   Result(property = "SUBBOID", column = "SUBBOID")
)
@Select("""<script>
   SELECT * FROM wfc_sharedata_mapping
</script>""")
fun GetListAll():ArrayList<wfc_sharedata_mapping_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PARENTINSTID", column = "PARENTINSTID"),
   Result(property = "PARENTBOID", column = "PARENTBOID"),
   Result(property = "SUBINSTID", column = "SUBINSTID"),
   Result(property = "SUBBOID", column = "SUBBOID")
)
@Select("""<script>
   SELECT * FROM wfc_sharedata_mapping
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="PARENTINSTID!=null">
      PARENTINSTID=#{PARENTINSTID}
   </if> 
   <if test="PARENTBOID!=null">
      PARENTBOID=#{PARENTBOID}
   </if> 
   <if test="SUBINSTID!=null">
      SUBINSTID=#{SUBINSTID}
   </if> 
   <if test="SUBBOID!=null">
      SUBBOID=#{SUBBOID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:wfc_sharedata_mapping_dto):ArrayList<wfc_sharedata_mapping_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PARENTINSTID", column = "PARENTINSTID"),
   Result(property = "PARENTBOID", column = "PARENTBOID"),
   Result(property = "SUBINSTID", column = "SUBINSTID"),
   Result(property = "SUBBOID", column = "SUBBOID")
)
@Select("""<script>
   SELECT * FROM wfc_sharedata_mapping
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:wfc_sharedata_mapping_dto):wfc_sharedata_mapping_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,PARENTINSTID,PARENTBOID,SUBINSTID,SUBBOID)
    values
    (#{ID},#{PARENTINSTID},#{PARENTBOID},#{SUBINSTID},#{SUBBOID})
</script>""")
fun insert(model:wfc_sharedata_mapping_dto):Unit
                

}

        
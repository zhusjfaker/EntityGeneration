

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
    insert into wfc_sharedata_mapping
    (ID,PARENTINSTID,PARENTBOID,SUBINSTID,SUBBOID)
    values
    (#{ID},#{PARENTINSTID},#{PARENTBOID},#{SUBINSTID},#{SUBBOID})
</script>""")
fun Insert(model:wfc_sharedata_mapping_dto):Unit
                


@Insert("""<script>
    insert into wfc_sharedata_mapping
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='PARENTINSTID!= null'> 
           PARENTINSTID,
        </if>
        <if test='PARENTBOID!= null'> 
           PARENTBOID,
        </if>
        <if test='SUBINSTID!= null'> 
           SUBINSTID,
        </if>
        <if test='SUBBOID!= null'> 
           SUBBOID
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='PARENTINSTID!= null'> 
           #{PARENTINSTID,jdbcType=char}，
        </if>
        <if test='PARENTBOID!= null'> 
           #{PARENTBOID,jdbcType=char}，
        </if>
        <if test='SUBINSTID!= null'> 
           #{SUBINSTID,jdbcType=char}，
        </if>
        <if test='SUBBOID!= null'> 
           #{SUBBOID,jdbcType=char}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:wfc_sharedata_mapping_dto):Unit
                

}

        
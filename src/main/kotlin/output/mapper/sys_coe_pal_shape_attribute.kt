

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_shape_attribute{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "ATTRID", column = "ATTRID"),
   Result(property = "ATTRNAME", column = "ATTRNAME"),
   Result(property = "ATTRVALUE", column = "ATTRVALUE"),
   Result(property = "CATEGORY", column = "CATEGORY"),
   Result(property = "METHODID", column = "METHODID"),
   Result(property = "TYPE", column = "TYPE"),
   Result(property = "SHAPENAME", column = "SHAPENAME")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_shape_attribute
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_shape_attribute_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "ATTRID", column = "ATTRID"),
   Result(property = "ATTRNAME", column = "ATTRNAME"),
   Result(property = "ATTRVALUE", column = "ATTRVALUE"),
   Result(property = "CATEGORY", column = "CATEGORY"),
   Result(property = "METHODID", column = "METHODID"),
   Result(property = "TYPE", column = "TYPE"),
   Result(property = "SHAPENAME", column = "SHAPENAME")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_shape_attribute
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="WSID!=null">
      WSID=#{WSID}
   </if> 
   <if test="ATTRID!=null">
      ATTRID=#{ATTRID}
   </if> 
   <if test="ATTRNAME!=null">
      ATTRNAME=#{ATTRNAME}
   </if> 
   <if test="ATTRVALUE!=null">
      ATTRVALUE=#{ATTRVALUE}
   </if> 
   <if test="CATEGORY!=null">
      CATEGORY=#{CATEGORY}
   </if> 
   <if test="METHODID!=null">
      METHODID=#{METHODID}
   </if> 
   <if test="TYPE!=null">
      TYPE=#{TYPE}
   </if> 
   <if test="SHAPENAME!=null">
      SHAPENAME=#{SHAPENAME}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_shape_attribute_dto):ArrayList<sys_coe_pal_shape_attribute_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "ATTRID", column = "ATTRID"),
   Result(property = "ATTRNAME", column = "ATTRNAME"),
   Result(property = "ATTRVALUE", column = "ATTRVALUE"),
   Result(property = "CATEGORY", column = "CATEGORY"),
   Result(property = "METHODID", column = "METHODID"),
   Result(property = "TYPE", column = "TYPE"),
   Result(property = "SHAPENAME", column = "SHAPENAME")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_shape_attribute
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_shape_attribute_dto):sys_coe_pal_shape_attribute_dto?
                


@Insert("""<script>
    insert into sys_coe_pal_shape_attribute
    (ID,WSID,ATTRID,ATTRNAME,ATTRVALUE,CATEGORY,METHODID,TYPE,SHAPENAME)
    values
    (#{ID},#{WSID},#{ATTRID},#{ATTRNAME},#{ATTRVALUE},#{CATEGORY},#{METHODID},#{TYPE},#{SHAPENAME})
</script>""")
fun Insert(model:sys_coe_pal_shape_attribute_dto):Unit
                


@Insert("""<script>
    insert into sys_coe_pal_shape_attribute
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='WSID!= null'> 
           WSID,
        </if>
        <if test='ATTRID!= null'> 
           ATTRID,
        </if>
        <if test='ATTRNAME!= null'> 
           ATTRNAME,
        </if>
        <if test='ATTRVALUE!= null'> 
           ATTRVALUE,
        </if>
        <if test='CATEGORY!= null'> 
           CATEGORY,
        </if>
        <if test='METHODID!= null'> 
           METHODID,
        </if>
        <if test='TYPE!= null'> 
           TYPE,
        </if>
        <if test='SHAPENAME!= null'> 
           SHAPENAME
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=varchar}，
        <if test='WSID!= null'> 
           #{WSID,jdbcType=varchar}，
        </if>
        <if test='ATTRID!= null'> 
           #{ATTRID,jdbcType=varchar}，
        </if>
        <if test='ATTRNAME!= null'> 
           #{ATTRNAME,jdbcType=varchar}，
        </if>
        <if test='ATTRVALUE!= null'> 
           #{ATTRVALUE,jdbcType=varchar}，
        </if>
        <if test='CATEGORY!= null'> 
           #{CATEGORY,jdbcType=varchar}，
        </if>
        <if test='METHODID!= null'> 
           #{METHODID,jdbcType=varchar}，
        </if>
        <if test='TYPE!= null'> 
           #{TYPE,jdbcType=varchar}，
        </if>
        <if test='SHAPENAME!= null'> 
           #{SHAPENAME,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_coe_pal_shape_attribute_dto):Unit
                

}

        
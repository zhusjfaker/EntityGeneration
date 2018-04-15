

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_property{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PLID", column = "PLID"),
   Result(property = "PROPERTYID", column = "PROPERTYID"),
   Result(property = "PROPERTYNAME", column = "PROPERTYNAME"),
   Result(property = "PROPERTYVALUE", column = "PROPERTYVALUE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_property
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_property_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PLID", column = "PLID"),
   Result(property = "PROPERTYID", column = "PROPERTYID"),
   Result(property = "PROPERTYNAME", column = "PROPERTYNAME"),
   Result(property = "PROPERTYVALUE", column = "PROPERTYVALUE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_property
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="PLID!=null">
      PLID=#{PLID}
   </if> 
   <if test="PROPERTYID!=null">
      PROPERTYID=#{PROPERTYID}
   </if> 
   <if test="PROPERTYNAME!=null">
      PROPERTYNAME=#{PROPERTYNAME}
   </if> 
   <if test="PROPERTYVALUE!=null">
      PROPERTYVALUE=#{PROPERTYVALUE}
   </if> 
   <if test="ORDERINDEX!=null">
      ORDERINDEX=#{ORDERINDEX}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_property_dto):ArrayList<sys_coe_pal_property_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PLID", column = "PLID"),
   Result(property = "PROPERTYID", column = "PROPERTYID"),
   Result(property = "PROPERTYNAME", column = "PROPERTYNAME"),
   Result(property = "PROPERTYVALUE", column = "PROPERTYVALUE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_property
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_property_dto):sys_coe_pal_property_dto?
                


@Insert("""<script>
    insert into sys_coe_pal_property
    (ID,PLID,PROPERTYID,PROPERTYNAME,PROPERTYVALUE,ORDERINDEX)
    values
    (#{ID},#{PLID},#{PROPERTYID},#{PROPERTYNAME},#{PROPERTYVALUE},#{ORDERINDEX})
</script>""")
fun Insert(model:sys_coe_pal_property_dto):Unit
                


@Insert("""<script>
    insert into sys_coe_pal_property
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='PLID!= null'> 
           PLID,
        </if>
        <if test='PROPERTYID!= null'> 
           PROPERTYID,
        </if>
        <if test='PROPERTYNAME!= null'> 
           PROPERTYNAME,
        </if>
        <if test='PROPERTYVALUE!= null'> 
           PROPERTYVALUE,
        </if>
        <if test='ORDERINDEX!= null'> 
           ORDERINDEX
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='PLID!= null'> 
           #{PLID,jdbcType=char}，
        </if>
        <if test='PROPERTYID!= null'> 
           #{PROPERTYID,jdbcType=varchar}，
        </if>
        <if test='PROPERTYNAME!= null'> 
           #{PROPERTYNAME,jdbcType=varchar}，
        </if>
        <if test='PROPERTYVALUE!= null'> 
           #{PROPERTYVALUE,jdbcType=text}，
        </if>
        <if test='ORDERINDEX!= null'> 
           #{ORDERINDEX,jdbcType=smallint}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_coe_pal_property_dto):Unit
                


@Delete("DELETE FROM sys_coe_pal_property WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_coe_pal_property SET
        ID=#{ID,jdbcType=String},
        PLID=#{PLID,jdbcType=String},
        PROPERTYID=#{PROPERTYID,jdbcType=String},
        PROPERTYNAME=#{PROPERTYNAME,jdbcType=String},
        PROPERTYVALUE=#{PROPERTYVALUE,jdbcType=String},
        ORDERINDEX=#{ORDERINDEX,jdbcType=Integer}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_coe_pal_property_dto)
        

@Update("""<script>
            UPDATE sys_coe_pal_property SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="PLID != null">  PLID=#{PLID,jdbcType=String},</if>
        <if test="PROPERTYID != null">  PROPERTYID=#{PROPERTYID,jdbcType=String},</if>
        <if test="PROPERTYNAME != null">  PROPERTYNAME=#{PROPERTYNAME,jdbcType=String},</if>
        <if test="PROPERTYVALUE != null">  PROPERTYVALUE=#{PROPERTYVALUE,jdbcType=String},</if>
        <if test="ORDERINDEX != null">  ORDERINDEX=#{ORDERINDEX,jdbcType=Integer}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_coe_pal_property_dto)
            

}

        
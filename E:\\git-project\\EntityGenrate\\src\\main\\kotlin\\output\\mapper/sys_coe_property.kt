

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_property{


@Results(
   Result(property = "PROPERTYKEY", column = "PROPERTYKEY"),
   Result(property = "PROPERTYVALUE", column = "PROPERTYVALUE")
)
@Select("""<script>
   SELECT * FROM sys_coe_property
</script>""")
fun GetListAll():ArrayList<sys_coe_property_dto>
        


@Results(
   Result(property = "PROPERTYKEY", column = "PROPERTYKEY"),
   Result(property = "PROPERTYVALUE", column = "PROPERTYVALUE")
)
@Select("""<script>
   SELECT * FROM sys_coe_property
   <where>
   <if test="PROPERTYKEY!=null">
      PROPERTYKEY=#{PROPERTYKEY}
   </if> 
   <if test="PROPERTYVALUE!=null">
      PROPERTYVALUE=#{PROPERTYVALUE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_property_dto):ArrayList<sys_coe_property_dto>
                


@Results(
   Result(property = "PROPERTYKEY", column = "PROPERTYKEY"),
   Result(property = "PROPERTYVALUE", column = "PROPERTYVALUE")
)
@Select("""<script>
   SELECT * FROM sys_coe_property
   <where>
   <if test="PROPERTYKEY!=null">
      PROPERTYKEY=#{PROPERTYKEY}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_property_dto):sys_coe_property_dto?
                


@Insert("""<script>
    insert into sys_coe_property
    (PROPERTYKEY,PROPERTYVALUE)
    values
    (#{PROPERTYKEY},#{PROPERTYVALUE})
</script>""")
fun Insert(model:sys_coe_property_dto):Unit
                


@Insert("""<script>
    insert into sys_coe_property
    <trim prefix="(" suffix=")" suffixOverrides="," >
           PROPERTYKEY,
        <if test='PROPERTYVALUE!= null'> 
           PROPERTYVALUE
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{PROPERTYKEY,jdbcType=varchar}，
        <if test='PROPERTYVALUE!= null'> 
           #{PROPERTYVALUE,jdbcType=text}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_coe_property_dto):Unit
                


@Delete("DELETE FROM sys_coe_property WHERE PROPERTYKEY=#{arg0}")
fun DeleteByPrimaryKey(PROPERTYKEY:String)
        

@Update("""<script>
        UPDATE sys_coe_property SET
        PROPERTYKEY=#{PROPERTYKEY,jdbcType=String},
        PROPERTYVALUE=#{PROPERTYVALUE,jdbcType=String}
        WHERE PROPERTYKEY=#{PROPERTYKEY,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_coe_property_dto)
        

@Update("""<script>
            UPDATE sys_coe_property SET
            <if test="PROPERTYKEY != null">  PROPERTYKEY=#{PROPERTYKEY,jdbcType=String},</if>
        <if test="PROPERTYVALUE != null">  PROPERTYVALUE=#{PROPERTYVALUE,jdbcType=String}
              WHERE PROPERTYKEY=#{PROPERTYKEY,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_coe_property_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_property{


@Results(
   Result(property = "PROPERTYKEY", column = "PROPERTYKEY"),
   Result(property = "PROPERTYVALUE", column = "PROPERTYVALUE")
)
@Select("""<script>
   SELECT * FROM sys_coe_property
</script>""")
fun GetListAll():ArrayList<sys_coe_property_dto>
        


@Results(
   Result(property = "PROPERTYKEY", column = "PROPERTYKEY"),
   Result(property = "PROPERTYVALUE", column = "PROPERTYVALUE")
)
@Select("""<script>
   SELECT * FROM sys_coe_property
   <where>
   <if test="PROPERTYKEY!=null">
      PROPERTYKEY=#{PROPERTYKEY}
   </if> 
   <if test="PROPERTYVALUE!=null">
      PROPERTYVALUE=#{PROPERTYVALUE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_property_dto):ArrayList<sys_coe_property_dto>
                


@Results(
   Result(property = "PROPERTYKEY", column = "PROPERTYKEY"),
   Result(property = "PROPERTYVALUE", column = "PROPERTYVALUE")
)
@Select("""<script>
   SELECT * FROM sys_coe_property
   <where>
   <if test="PROPERTYKEY!=null">
      PROPERTYKEY=#{PROPERTYKEY}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_property_dto):sys_coe_property_dto?
                


@Insert("""<script>
    insert into sys_coe_property
    (PROPERTYKEY,PROPERTYVALUE)
    values
    (#{PROPERTYKEY},#{PROPERTYVALUE})
</script>""")
fun Insert(model:sys_coe_property_dto):Unit
                


@Insert("""<script>
    insert into sys_coe_property
    <trim prefix="(" suffix=")" suffixOverrides="," >
           PROPERTYKEY,
        <if test='PROPERTYVALUE!= null'> 
           PROPERTYVALUE
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{PROPERTYKEY,jdbcType=varchar}，
        <if test='PROPERTYVALUE!= null'> 
           #{PROPERTYVALUE,jdbcType=text}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_coe_property_dto):Unit
                


@Delete("DELETE FROM sys_coe_property WHERE PROPERTYKEY=#{arg0}")
fun DeleteByPrimaryKey(PROPERTYKEY:String)
        

@Update("""<script>
        UPDATE sys_coe_property SET
        PROPERTYKEY=#{PROPERTYKEY,jdbcType=String},
        PROPERTYVALUE=#{PROPERTYVALUE,jdbcType=String}
        WHERE PROPERTYKEY=#{PROPERTYKEY,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_coe_property_dto)
        

@Update("""<script>
            UPDATE sys_coe_property SET
            <if test="PROPERTYKEY != null">  PROPERTYKEY=#{PROPERTYKEY,jdbcType=String},</if>
        <if test="PROPERTYVALUE != null">  PROPERTYVALUE=#{PROPERTYVALUE,jdbcType=String}
              WHERE PROPERTYKEY=#{PROPERTYKEY,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_coe_property_dto)
            

}

        
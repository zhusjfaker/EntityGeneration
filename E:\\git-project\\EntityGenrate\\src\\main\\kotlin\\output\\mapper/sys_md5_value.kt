

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_md5_value{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "V", column = "V")
)
@Select("""<script>
   SELECT * FROM sys_md5_value
</script>""")
fun GetListAll():ArrayList<sys_md5_value_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "V", column = "V")
)
@Select("""<script>
   SELECT * FROM sys_md5_value
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="V!=null">
      V=#{V}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_md5_value_dto):ArrayList<sys_md5_value_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "V", column = "V")
)
@Select("""<script>
   SELECT * FROM sys_md5_value
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_md5_value_dto):sys_md5_value_dto?
                


@Insert("""<script>
    insert into sys_md5_value
    (ID,V)
    values
    (#{ID},#{V})
</script>""")
fun Insert(model:sys_md5_value_dto):Unit
                


@Insert("""<script>
    insert into sys_md5_value
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='V!= null'> 
           V
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=varchar}，
        <if test='V!= null'> 
           #{V,jdbcType=text}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_md5_value_dto):Unit
                


@Delete("DELETE FROM sys_md5_value WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_md5_value SET
        ID=#{ID,jdbcType=String},
        V=#{V,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_md5_value_dto)
        

@Update("""<script>
            UPDATE sys_md5_value SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="V != null">  V=#{V,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_md5_value_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_md5_value{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "V", column = "V")
)
@Select("""<script>
   SELECT * FROM sys_md5_value
</script>""")
fun GetListAll():ArrayList<sys_md5_value_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "V", column = "V")
)
@Select("""<script>
   SELECT * FROM sys_md5_value
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="V!=null">
      V=#{V}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_md5_value_dto):ArrayList<sys_md5_value_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "V", column = "V")
)
@Select("""<script>
   SELECT * FROM sys_md5_value
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_md5_value_dto):sys_md5_value_dto?
                


@Insert("""<script>
    insert into sys_md5_value
    (ID,V)
    values
    (#{ID},#{V})
</script>""")
fun Insert(model:sys_md5_value_dto):Unit
                


@Insert("""<script>
    insert into sys_md5_value
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='V!= null'> 
           V
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=varchar}，
        <if test='V!= null'> 
           #{V,jdbcType=text}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_md5_value_dto):Unit
                


@Delete("DELETE FROM sys_md5_value WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_md5_value SET
        ID=#{ID,jdbcType=String},
        V=#{V,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_md5_value_dto)
        

@Update("""<script>
            UPDATE sys_md5_value SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="V != null">  V=#{V,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_md5_value_dto)
            

}

        
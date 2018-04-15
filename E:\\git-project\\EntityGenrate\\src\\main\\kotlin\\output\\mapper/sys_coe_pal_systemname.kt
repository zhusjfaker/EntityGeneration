

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_systemname{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SYSTEMNAME", column = "SYSTEMNAME"),
   Result(property = "ISDEFAULT", column = "ISDEFAULT")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_systemname
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_systemname_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SYSTEMNAME", column = "SYSTEMNAME"),
   Result(property = "ISDEFAULT", column = "ISDEFAULT")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_systemname
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="SYSTEMNAME!=null">
      SYSTEMNAME=#{SYSTEMNAME}
   </if> 
   <if test="ISDEFAULT!=null">
      ISDEFAULT=#{ISDEFAULT}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_systemname_dto):ArrayList<sys_coe_pal_systemname_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SYSTEMNAME", column = "SYSTEMNAME"),
   Result(property = "ISDEFAULT", column = "ISDEFAULT")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_systemname
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_systemname_dto):sys_coe_pal_systemname_dto?
                


@Insert("""<script>
    insert into sys_coe_pal_systemname
    (ID,SYSTEMNAME,ISDEFAULT)
    values
    (#{ID},#{SYSTEMNAME},#{ISDEFAULT})
</script>""")
fun Insert(model:sys_coe_pal_systemname_dto):Unit
                


@Insert("""<script>
    insert into sys_coe_pal_systemname
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='SYSTEMNAME!= null'> 
           SYSTEMNAME,
        </if>
        <if test='ISDEFAULT!= null'> 
           ISDEFAULT
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='SYSTEMNAME!= null'> 
           #{SYSTEMNAME,jdbcType=varchar}，
        </if>
        <if test='ISDEFAULT!= null'> 
           #{ISDEFAULT,jdbcType=smallint}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_coe_pal_systemname_dto):Unit
                


@Delete("DELETE FROM sys_coe_pal_systemname WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_coe_pal_systemname SET
        ID=#{ID,jdbcType=String},
        SYSTEMNAME=#{SYSTEMNAME,jdbcType=String},
        ISDEFAULT=#{ISDEFAULT,jdbcType=Integer}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_coe_pal_systemname_dto)
        

@Update("""<script>
            UPDATE sys_coe_pal_systemname SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="SYSTEMNAME != null">  SYSTEMNAME=#{SYSTEMNAME,jdbcType=String},</if>
        <if test="ISDEFAULT != null">  ISDEFAULT=#{ISDEFAULT,jdbcType=Integer}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_coe_pal_systemname_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_systemname{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SYSTEMNAME", column = "SYSTEMNAME"),
   Result(property = "ISDEFAULT", column = "ISDEFAULT")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_systemname
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_systemname_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SYSTEMNAME", column = "SYSTEMNAME"),
   Result(property = "ISDEFAULT", column = "ISDEFAULT")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_systemname
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="SYSTEMNAME!=null">
      SYSTEMNAME=#{SYSTEMNAME}
   </if> 
   <if test="ISDEFAULT!=null">
      ISDEFAULT=#{ISDEFAULT}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_systemname_dto):ArrayList<sys_coe_pal_systemname_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SYSTEMNAME", column = "SYSTEMNAME"),
   Result(property = "ISDEFAULT", column = "ISDEFAULT")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_systemname
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_systemname_dto):sys_coe_pal_systemname_dto?
                


@Insert("""<script>
    insert into sys_coe_pal_systemname
    (ID,SYSTEMNAME,ISDEFAULT)
    values
    (#{ID},#{SYSTEMNAME},#{ISDEFAULT})
</script>""")
fun Insert(model:sys_coe_pal_systemname_dto):Unit
                


@Insert("""<script>
    insert into sys_coe_pal_systemname
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='SYSTEMNAME!= null'> 
           SYSTEMNAME,
        </if>
        <if test='ISDEFAULT!= null'> 
           ISDEFAULT
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='SYSTEMNAME!= null'> 
           #{SYSTEMNAME,jdbcType=varchar}，
        </if>
        <if test='ISDEFAULT!= null'> 
           #{ISDEFAULT,jdbcType=smallint}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_coe_pal_systemname_dto):Unit
                


@Delete("DELETE FROM sys_coe_pal_systemname WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_coe_pal_systemname SET
        ID=#{ID,jdbcType=String},
        SYSTEMNAME=#{SYSTEMNAME,jdbcType=String},
        ISDEFAULT=#{ISDEFAULT,jdbcType=Integer}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_coe_pal_systemname_dto)
        

@Update("""<script>
            UPDATE sys_coe_pal_systemname SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="SYSTEMNAME != null">  SYSTEMNAME=#{SYSTEMNAME,jdbcType=String},</if>
        <if test="ISDEFAULT != null">  ISDEFAULT=#{ISDEFAULT,jdbcType=Integer}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_coe_pal_systemname_dto)
            

}

        
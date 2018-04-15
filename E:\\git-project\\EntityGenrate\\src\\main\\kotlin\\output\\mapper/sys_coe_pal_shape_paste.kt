

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_shape_paste{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SHAPEGROUPTID", column = "SHAPEGROUPTID"),
   Result(property = "SHAPENAME", column = "SHAPENAME"),
   Result(property = "SHAPECATEGORYNAME", column = "SHAPECATEGORYNAME"),
   Result(property = "PALREPOSITORYID", column = "PALREPOSITORYID"),
   Result(property = "ISDELETE", column = "ISDELETE"),
   Result(property = "SHAPETYPE", column = "SHAPETYPE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_shape_paste
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_shape_paste_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SHAPEGROUPTID", column = "SHAPEGROUPTID"),
   Result(property = "SHAPENAME", column = "SHAPENAME"),
   Result(property = "SHAPECATEGORYNAME", column = "SHAPECATEGORYNAME"),
   Result(property = "PALREPOSITORYID", column = "PALREPOSITORYID"),
   Result(property = "ISDELETE", column = "ISDELETE"),
   Result(property = "SHAPETYPE", column = "SHAPETYPE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_shape_paste
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="SHAPEGROUPTID!=null">
      SHAPEGROUPTID=#{SHAPEGROUPTID}
   </if> 
   <if test="SHAPENAME!=null">
      SHAPENAME=#{SHAPENAME}
   </if> 
   <if test="SHAPECATEGORYNAME!=null">
      SHAPECATEGORYNAME=#{SHAPECATEGORYNAME}
   </if> 
   <if test="PALREPOSITORYID!=null">
      PALREPOSITORYID=#{PALREPOSITORYID}
   </if> 
   <if test="ISDELETE!=null">
      ISDELETE=#{ISDELETE}
   </if> 
   <if test="SHAPETYPE!=null">
      SHAPETYPE=#{SHAPETYPE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_shape_paste_dto):ArrayList<sys_coe_pal_shape_paste_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SHAPEGROUPTID", column = "SHAPEGROUPTID"),
   Result(property = "SHAPENAME", column = "SHAPENAME"),
   Result(property = "SHAPECATEGORYNAME", column = "SHAPECATEGORYNAME"),
   Result(property = "PALREPOSITORYID", column = "PALREPOSITORYID"),
   Result(property = "ISDELETE", column = "ISDELETE"),
   Result(property = "SHAPETYPE", column = "SHAPETYPE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_shape_paste
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_shape_paste_dto):sys_coe_pal_shape_paste_dto?
                


@Insert("""<script>
    insert into sys_coe_pal_shape_paste
    (ID,SHAPEGROUPTID,SHAPENAME,SHAPECATEGORYNAME,PALREPOSITORYID,ISDELETE,SHAPETYPE)
    values
    (#{ID},#{SHAPEGROUPTID},#{SHAPENAME},#{SHAPECATEGORYNAME},#{PALREPOSITORYID},#{ISDELETE},#{SHAPETYPE})
</script>""")
fun Insert(model:sys_coe_pal_shape_paste_dto):Unit
                


@Insert("""<script>
    insert into sys_coe_pal_shape_paste
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='SHAPEGROUPTID!= null'> 
           SHAPEGROUPTID,
        </if>
        <if test='SHAPENAME!= null'> 
           SHAPENAME,
        </if>
        <if test='SHAPECATEGORYNAME!= null'> 
           SHAPECATEGORYNAME,
        </if>
        <if test='PALREPOSITORYID!= null'> 
           PALREPOSITORYID,
        </if>
        <if test='ISDELETE!= null'> 
           ISDELETE,
        </if>
        <if test='SHAPETYPE!= null'> 
           SHAPETYPE
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=varchar}，
        <if test='SHAPEGROUPTID!= null'> 
           #{SHAPEGROUPTID,jdbcType=varchar}，
        </if>
        <if test='SHAPENAME!= null'> 
           #{SHAPENAME,jdbcType=varchar}，
        </if>
        <if test='SHAPECATEGORYNAME!= null'> 
           #{SHAPECATEGORYNAME,jdbcType=varchar}，
        </if>
        <if test='PALREPOSITORYID!= null'> 
           #{PALREPOSITORYID,jdbcType=char}，
        </if>
        <if test='ISDELETE!= null'> 
           #{ISDELETE,jdbcType=char}，
        </if>
        <if test='SHAPETYPE!= null'> 
           #{SHAPETYPE,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_coe_pal_shape_paste_dto):Unit
                


@Delete("DELETE FROM sys_coe_pal_shape_paste WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_coe_pal_shape_paste SET
        ID=#{ID,jdbcType=String},
        SHAPEGROUPTID=#{SHAPEGROUPTID,jdbcType=String},
        SHAPENAME=#{SHAPENAME,jdbcType=String},
        SHAPECATEGORYNAME=#{SHAPECATEGORYNAME,jdbcType=String},
        PALREPOSITORYID=#{PALREPOSITORYID,jdbcType=String},
        ISDELETE=#{ISDELETE,jdbcType=String},
        SHAPETYPE=#{SHAPETYPE,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_coe_pal_shape_paste_dto)
        

@Update("""<script>
            UPDATE sys_coe_pal_shape_paste SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="SHAPEGROUPTID != null">  SHAPEGROUPTID=#{SHAPEGROUPTID,jdbcType=String},</if>
        <if test="SHAPENAME != null">  SHAPENAME=#{SHAPENAME,jdbcType=String},</if>
        <if test="SHAPECATEGORYNAME != null">  SHAPECATEGORYNAME=#{SHAPECATEGORYNAME,jdbcType=String},</if>
        <if test="PALREPOSITORYID != null">  PALREPOSITORYID=#{PALREPOSITORYID,jdbcType=String},</if>
        <if test="ISDELETE != null">  ISDELETE=#{ISDELETE,jdbcType=String},</if>
        <if test="SHAPETYPE != null">  SHAPETYPE=#{SHAPETYPE,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_coe_pal_shape_paste_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_shape_paste{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SHAPEGROUPTID", column = "SHAPEGROUPTID"),
   Result(property = "SHAPENAME", column = "SHAPENAME"),
   Result(property = "SHAPECATEGORYNAME", column = "SHAPECATEGORYNAME"),
   Result(property = "PALREPOSITORYID", column = "PALREPOSITORYID"),
   Result(property = "ISDELETE", column = "ISDELETE"),
   Result(property = "SHAPETYPE", column = "SHAPETYPE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_shape_paste
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_shape_paste_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SHAPEGROUPTID", column = "SHAPEGROUPTID"),
   Result(property = "SHAPENAME", column = "SHAPENAME"),
   Result(property = "SHAPECATEGORYNAME", column = "SHAPECATEGORYNAME"),
   Result(property = "PALREPOSITORYID", column = "PALREPOSITORYID"),
   Result(property = "ISDELETE", column = "ISDELETE"),
   Result(property = "SHAPETYPE", column = "SHAPETYPE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_shape_paste
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="SHAPEGROUPTID!=null">
      SHAPEGROUPTID=#{SHAPEGROUPTID}
   </if> 
   <if test="SHAPENAME!=null">
      SHAPENAME=#{SHAPENAME}
   </if> 
   <if test="SHAPECATEGORYNAME!=null">
      SHAPECATEGORYNAME=#{SHAPECATEGORYNAME}
   </if> 
   <if test="PALREPOSITORYID!=null">
      PALREPOSITORYID=#{PALREPOSITORYID}
   </if> 
   <if test="ISDELETE!=null">
      ISDELETE=#{ISDELETE}
   </if> 
   <if test="SHAPETYPE!=null">
      SHAPETYPE=#{SHAPETYPE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_shape_paste_dto):ArrayList<sys_coe_pal_shape_paste_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SHAPEGROUPTID", column = "SHAPEGROUPTID"),
   Result(property = "SHAPENAME", column = "SHAPENAME"),
   Result(property = "SHAPECATEGORYNAME", column = "SHAPECATEGORYNAME"),
   Result(property = "PALREPOSITORYID", column = "PALREPOSITORYID"),
   Result(property = "ISDELETE", column = "ISDELETE"),
   Result(property = "SHAPETYPE", column = "SHAPETYPE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_shape_paste
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_shape_paste_dto):sys_coe_pal_shape_paste_dto?
                


@Insert("""<script>
    insert into sys_coe_pal_shape_paste
    (ID,SHAPEGROUPTID,SHAPENAME,SHAPECATEGORYNAME,PALREPOSITORYID,ISDELETE,SHAPETYPE)
    values
    (#{ID},#{SHAPEGROUPTID},#{SHAPENAME},#{SHAPECATEGORYNAME},#{PALREPOSITORYID},#{ISDELETE},#{SHAPETYPE})
</script>""")
fun Insert(model:sys_coe_pal_shape_paste_dto):Unit
                


@Insert("""<script>
    insert into sys_coe_pal_shape_paste
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='SHAPEGROUPTID!= null'> 
           SHAPEGROUPTID,
        </if>
        <if test='SHAPENAME!= null'> 
           SHAPENAME,
        </if>
        <if test='SHAPECATEGORYNAME!= null'> 
           SHAPECATEGORYNAME,
        </if>
        <if test='PALREPOSITORYID!= null'> 
           PALREPOSITORYID,
        </if>
        <if test='ISDELETE!= null'> 
           ISDELETE,
        </if>
        <if test='SHAPETYPE!= null'> 
           SHAPETYPE
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=varchar}，
        <if test='SHAPEGROUPTID!= null'> 
           #{SHAPEGROUPTID,jdbcType=varchar}，
        </if>
        <if test='SHAPENAME!= null'> 
           #{SHAPENAME,jdbcType=varchar}，
        </if>
        <if test='SHAPECATEGORYNAME!= null'> 
           #{SHAPECATEGORYNAME,jdbcType=varchar}，
        </if>
        <if test='PALREPOSITORYID!= null'> 
           #{PALREPOSITORYID,jdbcType=char}，
        </if>
        <if test='ISDELETE!= null'> 
           #{ISDELETE,jdbcType=char}，
        </if>
        <if test='SHAPETYPE!= null'> 
           #{SHAPETYPE,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_coe_pal_shape_paste_dto):Unit
                


@Delete("DELETE FROM sys_coe_pal_shape_paste WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_coe_pal_shape_paste SET
        ID=#{ID,jdbcType=String},
        SHAPEGROUPTID=#{SHAPEGROUPTID,jdbcType=String},
        SHAPENAME=#{SHAPENAME,jdbcType=String},
        SHAPECATEGORYNAME=#{SHAPECATEGORYNAME,jdbcType=String},
        PALREPOSITORYID=#{PALREPOSITORYID,jdbcType=String},
        ISDELETE=#{ISDELETE,jdbcType=String},
        SHAPETYPE=#{SHAPETYPE,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_coe_pal_shape_paste_dto)
        

@Update("""<script>
            UPDATE sys_coe_pal_shape_paste SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="SHAPEGROUPTID != null">  SHAPEGROUPTID=#{SHAPEGROUPTID,jdbcType=String},</if>
        <if test="SHAPENAME != null">  SHAPENAME=#{SHAPENAME,jdbcType=String},</if>
        <if test="SHAPECATEGORYNAME != null">  SHAPECATEGORYNAME=#{SHAPECATEGORYNAME,jdbcType=String},</if>
        <if test="PALREPOSITORYID != null">  PALREPOSITORYID=#{PALREPOSITORYID,jdbcType=String},</if>
        <if test="ISDELETE != null">  ISDELETE=#{ISDELETE,jdbcType=String},</if>
        <if test="SHAPETYPE != null">  SHAPETYPE=#{SHAPETYPE,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_coe_pal_shape_paste_dto)
            

}

        
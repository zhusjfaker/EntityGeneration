

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_shape_relation{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "FILEID", column = "FILEID"),
   Result(property = "SHAPEID", column = "SHAPEID"),
   Result(property = "SHAPETEXT", column = "SHAPETEXT"),
   Result(property = "ATTRID", column = "ATTRID"),
   Result(property = "RELATIONFILEID", column = "RELATIONFILEID"),
   Result(property = "RELATIONSHAPEID", column = "RELATIONSHAPEID"),
   Result(property = "RELATIONSHAPETEXT", column = "RELATIONSHAPETEXT")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_shape_relation
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_shape_relation_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "FILEID", column = "FILEID"),
   Result(property = "SHAPEID", column = "SHAPEID"),
   Result(property = "SHAPETEXT", column = "SHAPETEXT"),
   Result(property = "ATTRID", column = "ATTRID"),
   Result(property = "RELATIONFILEID", column = "RELATIONFILEID"),
   Result(property = "RELATIONSHAPEID", column = "RELATIONSHAPEID"),
   Result(property = "RELATIONSHAPETEXT", column = "RELATIONSHAPETEXT")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_shape_relation
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="FILEID!=null">
      FILEID=#{FILEID}
   </if> 
   <if test="SHAPEID!=null">
      SHAPEID=#{SHAPEID}
   </if> 
   <if test="SHAPETEXT!=null">
      SHAPETEXT=#{SHAPETEXT}
   </if> 
   <if test="ATTRID!=null">
      ATTRID=#{ATTRID}
   </if> 
   <if test="RELATIONFILEID!=null">
      RELATIONFILEID=#{RELATIONFILEID}
   </if> 
   <if test="RELATIONSHAPEID!=null">
      RELATIONSHAPEID=#{RELATIONSHAPEID}
   </if> 
   <if test="RELATIONSHAPETEXT!=null">
      RELATIONSHAPETEXT=#{RELATIONSHAPETEXT}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_shape_relation_dto):ArrayList<sys_coe_pal_shape_relation_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "FILEID", column = "FILEID"),
   Result(property = "SHAPEID", column = "SHAPEID"),
   Result(property = "SHAPETEXT", column = "SHAPETEXT"),
   Result(property = "ATTRID", column = "ATTRID"),
   Result(property = "RELATIONFILEID", column = "RELATIONFILEID"),
   Result(property = "RELATIONSHAPEID", column = "RELATIONSHAPEID"),
   Result(property = "RELATIONSHAPETEXT", column = "RELATIONSHAPETEXT")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_shape_relation
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_shape_relation_dto):sys_coe_pal_shape_relation_dto?
                


@Insert("""<script>
    insert into sys_coe_pal_shape_relation
    (ID,FILEID,SHAPEID,SHAPETEXT,ATTRID,RELATIONFILEID,RELATIONSHAPEID,RELATIONSHAPETEXT)
    values
    (#{ID},#{FILEID},#{SHAPEID},#{SHAPETEXT},#{ATTRID},#{RELATIONFILEID},#{RELATIONSHAPEID},#{RELATIONSHAPETEXT})
</script>""")
fun Insert(model:sys_coe_pal_shape_relation_dto):Unit
                


@Insert("""<script>
    insert into sys_coe_pal_shape_relation
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='FILEID!= null'> 
           FILEID,
        </if>
        <if test='SHAPEID!= null'> 
           SHAPEID,
        </if>
        <if test='SHAPETEXT!= null'> 
           SHAPETEXT,
        </if>
        <if test='ATTRID!= null'> 
           ATTRID,
        </if>
        <if test='RELATIONFILEID!= null'> 
           RELATIONFILEID,
        </if>
        <if test='RELATIONSHAPEID!= null'> 
           RELATIONSHAPEID,
        </if>
        <if test='RELATIONSHAPETEXT!= null'> 
           RELATIONSHAPETEXT
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='FILEID!= null'> 
           #{FILEID,jdbcType=varchar}，
        </if>
        <if test='SHAPEID!= null'> 
           #{SHAPEID,jdbcType=varchar}，
        </if>
        <if test='SHAPETEXT!= null'> 
           #{SHAPETEXT,jdbcType=varchar}，
        </if>
        <if test='ATTRID!= null'> 
           #{ATTRID,jdbcType=varchar}，
        </if>
        <if test='RELATIONFILEID!= null'> 
           #{RELATIONFILEID,jdbcType=varchar}，
        </if>
        <if test='RELATIONSHAPEID!= null'> 
           #{RELATIONSHAPEID,jdbcType=varchar}，
        </if>
        <if test='RELATIONSHAPETEXT!= null'> 
           #{RELATIONSHAPETEXT,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_coe_pal_shape_relation_dto):Unit
                


@Delete("DELETE FROM sys_coe_pal_shape_relation WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_coe_pal_shape_relation SET
        ID=#{ID,jdbcType=String},
        FILEID=#{FILEID,jdbcType=String},
        SHAPEID=#{SHAPEID,jdbcType=String},
        SHAPETEXT=#{SHAPETEXT,jdbcType=String},
        ATTRID=#{ATTRID,jdbcType=String},
        RELATIONFILEID=#{RELATIONFILEID,jdbcType=String},
        RELATIONSHAPEID=#{RELATIONSHAPEID,jdbcType=String},
        RELATIONSHAPETEXT=#{RELATIONSHAPETEXT,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_coe_pal_shape_relation_dto)
        

@Update("""<script>
            UPDATE sys_coe_pal_shape_relation SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="FILEID != null">  FILEID=#{FILEID,jdbcType=String},</if>
        <if test="SHAPEID != null">  SHAPEID=#{SHAPEID,jdbcType=String},</if>
        <if test="SHAPETEXT != null">  SHAPETEXT=#{SHAPETEXT,jdbcType=String},</if>
        <if test="ATTRID != null">  ATTRID=#{ATTRID,jdbcType=String},</if>
        <if test="RELATIONFILEID != null">  RELATIONFILEID=#{RELATIONFILEID,jdbcType=String},</if>
        <if test="RELATIONSHAPEID != null">  RELATIONSHAPEID=#{RELATIONSHAPEID,jdbcType=String},</if>
        <if test="RELATIONSHAPETEXT != null">  RELATIONSHAPETEXT=#{RELATIONSHAPETEXT,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_coe_pal_shape_relation_dto)
            

}

        
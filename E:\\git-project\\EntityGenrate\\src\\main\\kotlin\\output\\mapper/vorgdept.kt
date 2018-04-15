

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface vorgdept{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEPARTMENTNAME", column = "DEPARTMENTNAME"),
   Result(property = "UNITID", column = "UNITID"),
   Result(property = "PARENTDEPARTMENTID", column = "PARENTDEPARTMENTID"),
   Result(property = "DEPARTMENTNO", column = "DEPARTMENTNO"),
   Result(property = "LAYER", column = "LAYER"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "ADMINISTRATORS", column = "ADMINISTRATORS")
)
@Select("""<script>
   SELECT * FROM vorgdept
</script>""")
fun GetListAll():ArrayList<vorgdept_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEPARTMENTNAME", column = "DEPARTMENTNAME"),
   Result(property = "UNITID", column = "UNITID"),
   Result(property = "PARENTDEPARTMENTID", column = "PARENTDEPARTMENTID"),
   Result(property = "DEPARTMENTNO", column = "DEPARTMENTNO"),
   Result(property = "LAYER", column = "LAYER"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "ADMINISTRATORS", column = "ADMINISTRATORS")
)
@Select("""<script>
   SELECT * FROM vorgdept
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="DEPARTMENTNAME!=null">
      DEPARTMENTNAME=#{DEPARTMENTNAME}
   </if> 
   <if test="UNITID!=null">
      UNITID=#{UNITID}
   </if> 
   <if test="PARENTDEPARTMENTID!=null">
      PARENTDEPARTMENTID=#{PARENTDEPARTMENTID}
   </if> 
   <if test="DEPARTMENTNO!=null">
      DEPARTMENTNO=#{DEPARTMENTNO}
   </if> 
   <if test="LAYER!=null">
      LAYER=#{LAYER}
   </if> 
   <if test="ORDERINDEX!=null">
      ORDERINDEX=#{ORDERINDEX}
   </if> 
   <if test="EXT1!=null">
      EXT1=#{EXT1}
   </if> 
   <if test="EXT2!=null">
      EXT2=#{EXT2}
   </if> 
   <if test="EXT3!=null">
      EXT3=#{EXT3}
   </if> 
   <if test="EXT4!=null">
      EXT4=#{EXT4}
   </if> 
   <if test="EXT5!=null">
      EXT5=#{EXT5}
   </if> 
   <if test="ADMINISTRATORS!=null">
      ADMINISTRATORS=#{ADMINISTRATORS}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:vorgdept_dto):ArrayList<vorgdept_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEPARTMENTNAME", column = "DEPARTMENTNAME"),
   Result(property = "UNITID", column = "UNITID"),
   Result(property = "PARENTDEPARTMENTID", column = "PARENTDEPARTMENTID"),
   Result(property = "DEPARTMENTNO", column = "DEPARTMENTNO"),
   Result(property = "LAYER", column = "LAYER"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "ADMINISTRATORS", column = "ADMINISTRATORS")
)
@Select("""<script>
   SELECT * FROM vorgdept
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:vorgdept_dto):vorgdept_dto?
                


@Insert("""<script>
    insert into vorgdept
    (ID,DEPARTMENTNAME,UNITID,PARENTDEPARTMENTID,DEPARTMENTNO,LAYER,ORDERINDEX,EXT1,EXT2,EXT3,EXT4,EXT5,ADMINISTRATORS)
    values
    (#{ID},#{DEPARTMENTNAME},#{UNITID},#{PARENTDEPARTMENTID},#{DEPARTMENTNO},#{LAYER},#{ORDERINDEX},#{EXT1},#{EXT2},#{EXT3},#{EXT4},#{EXT5},#{ADMINISTRATORS})
</script>""")
fun Insert(model:vorgdept_dto):Unit
                


@Insert("""<script>
    insert into vorgdept
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='DEPARTMENTNAME!= null'> 
           DEPARTMENTNAME,
        </if>
        <if test='UNITID!= null'> 
           UNITID,
        </if>
        <if test='PARENTDEPARTMENTID!= null'> 
           PARENTDEPARTMENTID,
        </if>
        <if test='DEPARTMENTNO!= null'> 
           DEPARTMENTNO,
        </if>
        <if test='LAYER!= null'> 
           LAYER,
        </if>
        <if test='ORDERINDEX!= null'> 
           ORDERINDEX,
        </if>
        <if test='EXT1!= null'> 
           EXT1,
        </if>
        <if test='EXT2!= null'> 
           EXT2,
        </if>
        <if test='EXT3!= null'> 
           EXT3,
        </if>
        <if test='EXT4!= null'> 
           EXT4,
        </if>
        <if test='EXT5!= null'> 
           EXT5,
        </if>
        <if test='ADMINISTRATORS!= null'> 
           ADMINISTRATORS
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=varchar}，
        <if test='DEPARTMENTNAME!= null'> 
           #{DEPARTMENTNAME,jdbcType=varchar}，
        </if>
        <if test='UNITID!= null'> 
           #{UNITID,jdbcType=varchar}，
        </if>
        <if test='PARENTDEPARTMENTID!= null'> 
           #{PARENTDEPARTMENTID,jdbcType=varchar}，
        </if>
        <if test='DEPARTMENTNO!= null'> 
           #{DEPARTMENTNO,jdbcType=varchar}，
        </if>
        <if test='LAYER!= null'> 
           #{LAYER,jdbcType=smallint}，
        </if>
        <if test='ORDERINDEX!= null'> 
           #{ORDERINDEX,jdbcType=decimal}，
        </if>
        <if test='EXT1!= null'> 
           #{EXT1,jdbcType=varchar}，
        </if>
        <if test='EXT2!= null'> 
           #{EXT2,jdbcType=varchar}，
        </if>
        <if test='EXT3!= null'> 
           #{EXT3,jdbcType=varchar}，
        </if>
        <if test='EXT4!= null'> 
           #{EXT4,jdbcType=varchar}，
        </if>
        <if test='EXT5!= null'> 
           #{EXT5,jdbcType=varchar}，
        </if>
        <if test='ADMINISTRATORS!= null'> 
           #{ADMINISTRATORS,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:vorgdept_dto):Unit
                


@Delete("DELETE FROM vorgdept WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE vorgdept SET
        ID=#{ID,jdbcType=String},
        DEPARTMENTNAME=#{DEPARTMENTNAME,jdbcType=String},
        UNITID=#{UNITID,jdbcType=String},
        PARENTDEPARTMENTID=#{PARENTDEPARTMENTID,jdbcType=String},
        DEPARTMENTNO=#{DEPARTMENTNO,jdbcType=String},
        LAYER=#{LAYER,jdbcType=Integer},
        ORDERINDEX=#{ORDERINDEX,jdbcType=BigDecimal},
        EXT1=#{EXT1,jdbcType=String},
        EXT2=#{EXT2,jdbcType=String},
        EXT3=#{EXT3,jdbcType=String},
        EXT4=#{EXT4,jdbcType=String},
        EXT5=#{EXT5,jdbcType=String},
        ADMINISTRATORS=#{ADMINISTRATORS,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:vorgdept_dto)
        

@Update("""<script>
            UPDATE vorgdept SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="DEPARTMENTNAME != null">  DEPARTMENTNAME=#{DEPARTMENTNAME,jdbcType=String},</if>
        <if test="UNITID != null">  UNITID=#{UNITID,jdbcType=String},</if>
        <if test="PARENTDEPARTMENTID != null">  PARENTDEPARTMENTID=#{PARENTDEPARTMENTID,jdbcType=String},</if>
        <if test="DEPARTMENTNO != null">  DEPARTMENTNO=#{DEPARTMENTNO,jdbcType=String},</if>
        <if test="LAYER != null">  LAYER=#{LAYER,jdbcType=Integer},</if>
        <if test="ORDERINDEX != null">  ORDERINDEX=#{ORDERINDEX,jdbcType=BigDecimal},</if>
        <if test="EXT1 != null">  EXT1=#{EXT1,jdbcType=String},</if>
        <if test="EXT2 != null">  EXT2=#{EXT2,jdbcType=String},</if>
        <if test="EXT3 != null">  EXT3=#{EXT3,jdbcType=String},</if>
        <if test="EXT4 != null">  EXT4=#{EXT4,jdbcType=String},</if>
        <if test="EXT5 != null">  EXT5=#{EXT5,jdbcType=String},</if>
        <if test="ADMINISTRATORS != null">  ADMINISTRATORS=#{ADMINISTRATORS,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:vorgdept_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface vorgdept{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEPARTMENTNAME", column = "DEPARTMENTNAME"),
   Result(property = "UNITID", column = "UNITID"),
   Result(property = "PARENTDEPARTMENTID", column = "PARENTDEPARTMENTID"),
   Result(property = "DEPARTMENTNO", column = "DEPARTMENTNO"),
   Result(property = "LAYER", column = "LAYER"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "ADMINISTRATORS", column = "ADMINISTRATORS")
)
@Select("""<script>
   SELECT * FROM vorgdept
</script>""")
fun GetListAll():ArrayList<vorgdept_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEPARTMENTNAME", column = "DEPARTMENTNAME"),
   Result(property = "UNITID", column = "UNITID"),
   Result(property = "PARENTDEPARTMENTID", column = "PARENTDEPARTMENTID"),
   Result(property = "DEPARTMENTNO", column = "DEPARTMENTNO"),
   Result(property = "LAYER", column = "LAYER"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "ADMINISTRATORS", column = "ADMINISTRATORS")
)
@Select("""<script>
   SELECT * FROM vorgdept
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="DEPARTMENTNAME!=null">
      DEPARTMENTNAME=#{DEPARTMENTNAME}
   </if> 
   <if test="UNITID!=null">
      UNITID=#{UNITID}
   </if> 
   <if test="PARENTDEPARTMENTID!=null">
      PARENTDEPARTMENTID=#{PARENTDEPARTMENTID}
   </if> 
   <if test="DEPARTMENTNO!=null">
      DEPARTMENTNO=#{DEPARTMENTNO}
   </if> 
   <if test="LAYER!=null">
      LAYER=#{LAYER}
   </if> 
   <if test="ORDERINDEX!=null">
      ORDERINDEX=#{ORDERINDEX}
   </if> 
   <if test="EXT1!=null">
      EXT1=#{EXT1}
   </if> 
   <if test="EXT2!=null">
      EXT2=#{EXT2}
   </if> 
   <if test="EXT3!=null">
      EXT3=#{EXT3}
   </if> 
   <if test="EXT4!=null">
      EXT4=#{EXT4}
   </if> 
   <if test="EXT5!=null">
      EXT5=#{EXT5}
   </if> 
   <if test="ADMINISTRATORS!=null">
      ADMINISTRATORS=#{ADMINISTRATORS}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:vorgdept_dto):ArrayList<vorgdept_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEPARTMENTNAME", column = "DEPARTMENTNAME"),
   Result(property = "UNITID", column = "UNITID"),
   Result(property = "PARENTDEPARTMENTID", column = "PARENTDEPARTMENTID"),
   Result(property = "DEPARTMENTNO", column = "DEPARTMENTNO"),
   Result(property = "LAYER", column = "LAYER"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "ADMINISTRATORS", column = "ADMINISTRATORS")
)
@Select("""<script>
   SELECT * FROM vorgdept
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:vorgdept_dto):vorgdept_dto?
                


@Insert("""<script>
    insert into vorgdept
    (ID,DEPARTMENTNAME,UNITID,PARENTDEPARTMENTID,DEPARTMENTNO,LAYER,ORDERINDEX,EXT1,EXT2,EXT3,EXT4,EXT5,ADMINISTRATORS)
    values
    (#{ID},#{DEPARTMENTNAME},#{UNITID},#{PARENTDEPARTMENTID},#{DEPARTMENTNO},#{LAYER},#{ORDERINDEX},#{EXT1},#{EXT2},#{EXT3},#{EXT4},#{EXT5},#{ADMINISTRATORS})
</script>""")
fun Insert(model:vorgdept_dto):Unit
                


@Insert("""<script>
    insert into vorgdept
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='DEPARTMENTNAME!= null'> 
           DEPARTMENTNAME,
        </if>
        <if test='UNITID!= null'> 
           UNITID,
        </if>
        <if test='PARENTDEPARTMENTID!= null'> 
           PARENTDEPARTMENTID,
        </if>
        <if test='DEPARTMENTNO!= null'> 
           DEPARTMENTNO,
        </if>
        <if test='LAYER!= null'> 
           LAYER,
        </if>
        <if test='ORDERINDEX!= null'> 
           ORDERINDEX,
        </if>
        <if test='EXT1!= null'> 
           EXT1,
        </if>
        <if test='EXT2!= null'> 
           EXT2,
        </if>
        <if test='EXT3!= null'> 
           EXT3,
        </if>
        <if test='EXT4!= null'> 
           EXT4,
        </if>
        <if test='EXT5!= null'> 
           EXT5,
        </if>
        <if test='ADMINISTRATORS!= null'> 
           ADMINISTRATORS
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=varchar}，
        <if test='DEPARTMENTNAME!= null'> 
           #{DEPARTMENTNAME,jdbcType=varchar}，
        </if>
        <if test='UNITID!= null'> 
           #{UNITID,jdbcType=varchar}，
        </if>
        <if test='PARENTDEPARTMENTID!= null'> 
           #{PARENTDEPARTMENTID,jdbcType=varchar}，
        </if>
        <if test='DEPARTMENTNO!= null'> 
           #{DEPARTMENTNO,jdbcType=varchar}，
        </if>
        <if test='LAYER!= null'> 
           #{LAYER,jdbcType=smallint}，
        </if>
        <if test='ORDERINDEX!= null'> 
           #{ORDERINDEX,jdbcType=decimal}，
        </if>
        <if test='EXT1!= null'> 
           #{EXT1,jdbcType=varchar}，
        </if>
        <if test='EXT2!= null'> 
           #{EXT2,jdbcType=varchar}，
        </if>
        <if test='EXT3!= null'> 
           #{EXT3,jdbcType=varchar}，
        </if>
        <if test='EXT4!= null'> 
           #{EXT4,jdbcType=varchar}，
        </if>
        <if test='EXT5!= null'> 
           #{EXT5,jdbcType=varchar}，
        </if>
        <if test='ADMINISTRATORS!= null'> 
           #{ADMINISTRATORS,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:vorgdept_dto):Unit
                


@Delete("DELETE FROM vorgdept WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE vorgdept SET
        ID=#{ID,jdbcType=String},
        DEPARTMENTNAME=#{DEPARTMENTNAME,jdbcType=String},
        UNITID=#{UNITID,jdbcType=String},
        PARENTDEPARTMENTID=#{PARENTDEPARTMENTID,jdbcType=String},
        DEPARTMENTNO=#{DEPARTMENTNO,jdbcType=String},
        LAYER=#{LAYER,jdbcType=Integer},
        ORDERINDEX=#{ORDERINDEX,jdbcType=BigDecimal},
        EXT1=#{EXT1,jdbcType=String},
        EXT2=#{EXT2,jdbcType=String},
        EXT3=#{EXT3,jdbcType=String},
        EXT4=#{EXT4,jdbcType=String},
        EXT5=#{EXT5,jdbcType=String},
        ADMINISTRATORS=#{ADMINISTRATORS,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:vorgdept_dto)
        

@Update("""<script>
            UPDATE vorgdept SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="DEPARTMENTNAME != null">  DEPARTMENTNAME=#{DEPARTMENTNAME,jdbcType=String},</if>
        <if test="UNITID != null">  UNITID=#{UNITID,jdbcType=String},</if>
        <if test="PARENTDEPARTMENTID != null">  PARENTDEPARTMENTID=#{PARENTDEPARTMENTID,jdbcType=String},</if>
        <if test="DEPARTMENTNO != null">  DEPARTMENTNO=#{DEPARTMENTNO,jdbcType=String},</if>
        <if test="LAYER != null">  LAYER=#{LAYER,jdbcType=Integer},</if>
        <if test="ORDERINDEX != null">  ORDERINDEX=#{ORDERINDEX,jdbcType=BigDecimal},</if>
        <if test="EXT1 != null">  EXT1=#{EXT1,jdbcType=String},</if>
        <if test="EXT2 != null">  EXT2=#{EXT2,jdbcType=String},</if>
        <if test="EXT3 != null">  EXT3=#{EXT3,jdbcType=String},</if>
        <if test="EXT4 != null">  EXT4=#{EXT4,jdbcType=String},</if>
        <if test="EXT5 != null">  EXT5=#{EXT5,jdbcType=String},</if>
        <if test="ADMINISTRATORS != null">  ADMINISTRATORS=#{ADMINISTRATORS,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:vorgdept_dto)
            

}

        
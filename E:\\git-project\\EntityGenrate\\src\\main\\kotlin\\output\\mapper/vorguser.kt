

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface vorguser{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "DEPARTMENTID", column = "DEPARTMENTID"),
   Result(property = "ROLEID", column = "ROLEID"),
   Result(property = "ISMANAGER", column = "ISMANAGER"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5")
)
@Select("""<script>
   SELECT * FROM vorguser
</script>""")
fun GetListAll():ArrayList<vorguser_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "DEPARTMENTID", column = "DEPARTMENTID"),
   Result(property = "ROLEID", column = "ROLEID"),
   Result(property = "ISMANAGER", column = "ISMANAGER"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5")
)
@Select("""<script>
   SELECT * FROM vorguser
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="DEPARTMENTID!=null">
      DEPARTMENTID=#{DEPARTMENTID}
   </if> 
   <if test="ROLEID!=null">
      ROLEID=#{ROLEID}
   </if> 
   <if test="ISMANAGER!=null">
      ISMANAGER=#{ISMANAGER}
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
   </where>
</script>""")
fun ConditionalQuery(model:vorguser_dto):ArrayList<vorguser_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "DEPARTMENTID", column = "DEPARTMENTID"),
   Result(property = "ROLEID", column = "ROLEID"),
   Result(property = "ISMANAGER", column = "ISMANAGER"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5")
)
@Select("""<script>
   SELECT * FROM vorguser
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:vorguser_dto):vorguser_dto?
                


@Insert("""<script>
    insert into vorguser
    (ID,USERID,DEPARTMENTID,ROLEID,ISMANAGER,ORDERINDEX,EXT1,EXT2,EXT3,EXT4,EXT5)
    values
    (#{ID},#{USERID},#{DEPARTMENTID},#{ROLEID},#{ISMANAGER},#{ORDERINDEX},#{EXT1},#{EXT2},#{EXT3},#{EXT4},#{EXT5})
</script>""")
fun Insert(model:vorguser_dto):Unit
                


@Insert("""<script>
    insert into vorguser
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='USERID!= null'> 
           USERID,
        </if>
        <if test='DEPARTMENTID!= null'> 
           DEPARTMENTID,
        </if>
        <if test='ROLEID!= null'> 
           ROLEID,
        </if>
        <if test='ISMANAGER!= null'> 
           ISMANAGER,
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
           EXT5
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=varchar}，
        <if test='USERID!= null'> 
           #{USERID,jdbcType=varchar}，
        </if>
        <if test='DEPARTMENTID!= null'> 
           #{DEPARTMENTID,jdbcType=varchar}，
        </if>
        <if test='ROLEID!= null'> 
           #{ROLEID,jdbcType=varchar}，
        </if>
        <if test='ISMANAGER!= null'> 
           #{ISMANAGER,jdbcType=smallint}，
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
           #{EXT5,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:vorguser_dto):Unit
                


@Delete("DELETE FROM vorguser WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE vorguser SET
        ID=#{ID,jdbcType=String},
        USERID=#{USERID,jdbcType=String},
        DEPARTMENTID=#{DEPARTMENTID,jdbcType=String},
        ROLEID=#{ROLEID,jdbcType=String},
        ISMANAGER=#{ISMANAGER,jdbcType=Integer},
        ORDERINDEX=#{ORDERINDEX,jdbcType=BigDecimal},
        EXT1=#{EXT1,jdbcType=String},
        EXT2=#{EXT2,jdbcType=String},
        EXT3=#{EXT3,jdbcType=String},
        EXT4=#{EXT4,jdbcType=String},
        EXT5=#{EXT5,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:vorguser_dto)
        

@Update("""<script>
            UPDATE vorguser SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="USERID != null">  USERID=#{USERID,jdbcType=String},</if>
        <if test="DEPARTMENTID != null">  DEPARTMENTID=#{DEPARTMENTID,jdbcType=String},</if>
        <if test="ROLEID != null">  ROLEID=#{ROLEID,jdbcType=String},</if>
        <if test="ISMANAGER != null">  ISMANAGER=#{ISMANAGER,jdbcType=Integer},</if>
        <if test="ORDERINDEX != null">  ORDERINDEX=#{ORDERINDEX,jdbcType=BigDecimal},</if>
        <if test="EXT1 != null">  EXT1=#{EXT1,jdbcType=String},</if>
        <if test="EXT2 != null">  EXT2=#{EXT2,jdbcType=String},</if>
        <if test="EXT3 != null">  EXT3=#{EXT3,jdbcType=String},</if>
        <if test="EXT4 != null">  EXT4=#{EXT4,jdbcType=String},</if>
        <if test="EXT5 != null">  EXT5=#{EXT5,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:vorguser_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface vorguser{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "DEPARTMENTID", column = "DEPARTMENTID"),
   Result(property = "ROLEID", column = "ROLEID"),
   Result(property = "ISMANAGER", column = "ISMANAGER"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5")
)
@Select("""<script>
   SELECT * FROM vorguser
</script>""")
fun GetListAll():ArrayList<vorguser_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "DEPARTMENTID", column = "DEPARTMENTID"),
   Result(property = "ROLEID", column = "ROLEID"),
   Result(property = "ISMANAGER", column = "ISMANAGER"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5")
)
@Select("""<script>
   SELECT * FROM vorguser
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="DEPARTMENTID!=null">
      DEPARTMENTID=#{DEPARTMENTID}
   </if> 
   <if test="ROLEID!=null">
      ROLEID=#{ROLEID}
   </if> 
   <if test="ISMANAGER!=null">
      ISMANAGER=#{ISMANAGER}
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
   </where>
</script>""")
fun ConditionalQuery(model:vorguser_dto):ArrayList<vorguser_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "DEPARTMENTID", column = "DEPARTMENTID"),
   Result(property = "ROLEID", column = "ROLEID"),
   Result(property = "ISMANAGER", column = "ISMANAGER"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5")
)
@Select("""<script>
   SELECT * FROM vorguser
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:vorguser_dto):vorguser_dto?
                


@Insert("""<script>
    insert into vorguser
    (ID,USERID,DEPARTMENTID,ROLEID,ISMANAGER,ORDERINDEX,EXT1,EXT2,EXT3,EXT4,EXT5)
    values
    (#{ID},#{USERID},#{DEPARTMENTID},#{ROLEID},#{ISMANAGER},#{ORDERINDEX},#{EXT1},#{EXT2},#{EXT3},#{EXT4},#{EXT5})
</script>""")
fun Insert(model:vorguser_dto):Unit
                


@Insert("""<script>
    insert into vorguser
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='USERID!= null'> 
           USERID,
        </if>
        <if test='DEPARTMENTID!= null'> 
           DEPARTMENTID,
        </if>
        <if test='ROLEID!= null'> 
           ROLEID,
        </if>
        <if test='ISMANAGER!= null'> 
           ISMANAGER,
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
           EXT5
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=varchar}，
        <if test='USERID!= null'> 
           #{USERID,jdbcType=varchar}，
        </if>
        <if test='DEPARTMENTID!= null'> 
           #{DEPARTMENTID,jdbcType=varchar}，
        </if>
        <if test='ROLEID!= null'> 
           #{ROLEID,jdbcType=varchar}，
        </if>
        <if test='ISMANAGER!= null'> 
           #{ISMANAGER,jdbcType=smallint}，
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
           #{EXT5,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:vorguser_dto):Unit
                


@Delete("DELETE FROM vorguser WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE vorguser SET
        ID=#{ID,jdbcType=String},
        USERID=#{USERID,jdbcType=String},
        DEPARTMENTID=#{DEPARTMENTID,jdbcType=String},
        ROLEID=#{ROLEID,jdbcType=String},
        ISMANAGER=#{ISMANAGER,jdbcType=Integer},
        ORDERINDEX=#{ORDERINDEX,jdbcType=BigDecimal},
        EXT1=#{EXT1,jdbcType=String},
        EXT2=#{EXT2,jdbcType=String},
        EXT3=#{EXT3,jdbcType=String},
        EXT4=#{EXT4,jdbcType=String},
        EXT5=#{EXT5,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:vorguser_dto)
        

@Update("""<script>
            UPDATE vorguser SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="USERID != null">  USERID=#{USERID,jdbcType=String},</if>
        <if test="DEPARTMENTID != null">  DEPARTMENTID=#{DEPARTMENTID,jdbcType=String},</if>
        <if test="ROLEID != null">  ROLEID=#{ROLEID,jdbcType=String},</if>
        <if test="ISMANAGER != null">  ISMANAGER=#{ISMANAGER,jdbcType=Integer},</if>
        <if test="ORDERINDEX != null">  ORDERINDEX=#{ORDERINDEX,jdbcType=BigDecimal},</if>
        <if test="EXT1 != null">  EXT1=#{EXT1,jdbcType=String},</if>
        <if test="EXT2 != null">  EXT2=#{EXT2,jdbcType=String},</if>
        <if test="EXT3 != null">  EXT3=#{EXT3,jdbcType=String},</if>
        <if test="EXT4 != null">  EXT4=#{EXT4,jdbcType=String},</if>
        <if test="EXT5 != null">  EXT5=#{EXT5,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:vorguser_dto)
            

}

        
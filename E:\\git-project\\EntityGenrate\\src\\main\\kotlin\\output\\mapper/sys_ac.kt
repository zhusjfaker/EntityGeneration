

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_ac{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "RESOURCETYPE", column = "RESOURCETYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID"),
   Result(property = "ASSIGNMENTTYPE", column = "ASSIGNMENTTYPE"),
   Result(property = "ASSIGNMENTID", column = "ASSIGNMENTID"),
   Result(property = "ACCESSMODE", column = "ACCESSMODE")
)
@Select("""<script>
   SELECT * FROM sys_ac
</script>""")
fun GetListAll():ArrayList<sys_ac_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "RESOURCETYPE", column = "RESOURCETYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID"),
   Result(property = "ASSIGNMENTTYPE", column = "ASSIGNMENTTYPE"),
   Result(property = "ASSIGNMENTID", column = "ASSIGNMENTID"),
   Result(property = "ACCESSMODE", column = "ACCESSMODE")
)
@Select("""<script>
   SELECT * FROM sys_ac
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="RESOURCETYPE!=null">
      RESOURCETYPE=#{RESOURCETYPE}
   </if> 
   <if test="RESOURCEID!=null">
      RESOURCEID=#{RESOURCEID}
   </if> 
   <if test="ASSIGNMENTTYPE!=null">
      ASSIGNMENTTYPE=#{ASSIGNMENTTYPE}
   </if> 
   <if test="ASSIGNMENTID!=null">
      ASSIGNMENTID=#{ASSIGNMENTID}
   </if> 
   <if test="ACCESSMODE!=null">
      ACCESSMODE=#{ACCESSMODE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_ac_dto):ArrayList<sys_ac_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "RESOURCETYPE", column = "RESOURCETYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID"),
   Result(property = "ASSIGNMENTTYPE", column = "ASSIGNMENTTYPE"),
   Result(property = "ASSIGNMENTID", column = "ASSIGNMENTID"),
   Result(property = "ACCESSMODE", column = "ACCESSMODE")
)
@Select("""<script>
   SELECT * FROM sys_ac
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_ac_dto):sys_ac_dto?
                


@Insert("""<script>
    insert into sys_ac
    (ID,RESOURCETYPE,RESOURCEID,ASSIGNMENTTYPE,ASSIGNMENTID,ACCESSMODE)
    values
    (#{ID},#{RESOURCETYPE},#{RESOURCEID},#{ASSIGNMENTTYPE},#{ASSIGNMENTID},#{ACCESSMODE})
</script>""")
fun Insert(model:sys_ac_dto):Unit
                


@Insert("""<script>
    insert into sys_ac
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='RESOURCETYPE!= null'> 
           RESOURCETYPE,
        </if>
        <if test='RESOURCEID!= null'> 
           RESOURCEID,
        </if>
        <if test='ASSIGNMENTTYPE!= null'> 
           ASSIGNMENTTYPE,
        </if>
        <if test='ASSIGNMENTID!= null'> 
           ASSIGNMENTID,
        </if>
        <if test='ACCESSMODE!= null'> 
           ACCESSMODE
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=varchar}，
        <if test='RESOURCETYPE!= null'> 
           #{RESOURCETYPE,jdbcType=varchar}，
        </if>
        <if test='RESOURCEID!= null'> 
           #{RESOURCEID,jdbcType=varchar}，
        </if>
        <if test='ASSIGNMENTTYPE!= null'> 
           #{ASSIGNMENTTYPE,jdbcType=varchar}，
        </if>
        <if test='ASSIGNMENTID!= null'> 
           #{ASSIGNMENTID,jdbcType=varchar}，
        </if>
        <if test='ACCESSMODE!= null'> 
           #{ACCESSMODE,jdbcType=smallint}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_ac_dto):Unit
                


@Delete("DELETE FROM sys_ac WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_ac SET
        ID=#{ID,jdbcType=String},
        RESOURCETYPE=#{RESOURCETYPE,jdbcType=String},
        RESOURCEID=#{RESOURCEID,jdbcType=String},
        ASSIGNMENTTYPE=#{ASSIGNMENTTYPE,jdbcType=String},
        ASSIGNMENTID=#{ASSIGNMENTID,jdbcType=String},
        ACCESSMODE=#{ACCESSMODE,jdbcType=Integer}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_ac_dto)
        

@Update("""<script>
            UPDATE sys_ac SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="RESOURCETYPE != null">  RESOURCETYPE=#{RESOURCETYPE,jdbcType=String},</if>
        <if test="RESOURCEID != null">  RESOURCEID=#{RESOURCEID,jdbcType=String},</if>
        <if test="ASSIGNMENTTYPE != null">  ASSIGNMENTTYPE=#{ASSIGNMENTTYPE,jdbcType=String},</if>
        <if test="ASSIGNMENTID != null">  ASSIGNMENTID=#{ASSIGNMENTID,jdbcType=String},</if>
        <if test="ACCESSMODE != null">  ACCESSMODE=#{ACCESSMODE,jdbcType=Integer}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_ac_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_ac{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "RESOURCETYPE", column = "RESOURCETYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID"),
   Result(property = "ASSIGNMENTTYPE", column = "ASSIGNMENTTYPE"),
   Result(property = "ASSIGNMENTID", column = "ASSIGNMENTID"),
   Result(property = "ACCESSMODE", column = "ACCESSMODE")
)
@Select("""<script>
   SELECT * FROM sys_ac
</script>""")
fun GetListAll():ArrayList<sys_ac_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "RESOURCETYPE", column = "RESOURCETYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID"),
   Result(property = "ASSIGNMENTTYPE", column = "ASSIGNMENTTYPE"),
   Result(property = "ASSIGNMENTID", column = "ASSIGNMENTID"),
   Result(property = "ACCESSMODE", column = "ACCESSMODE")
)
@Select("""<script>
   SELECT * FROM sys_ac
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="RESOURCETYPE!=null">
      RESOURCETYPE=#{RESOURCETYPE}
   </if> 
   <if test="RESOURCEID!=null">
      RESOURCEID=#{RESOURCEID}
   </if> 
   <if test="ASSIGNMENTTYPE!=null">
      ASSIGNMENTTYPE=#{ASSIGNMENTTYPE}
   </if> 
   <if test="ASSIGNMENTID!=null">
      ASSIGNMENTID=#{ASSIGNMENTID}
   </if> 
   <if test="ACCESSMODE!=null">
      ACCESSMODE=#{ACCESSMODE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_ac_dto):ArrayList<sys_ac_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "RESOURCETYPE", column = "RESOURCETYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID"),
   Result(property = "ASSIGNMENTTYPE", column = "ASSIGNMENTTYPE"),
   Result(property = "ASSIGNMENTID", column = "ASSIGNMENTID"),
   Result(property = "ACCESSMODE", column = "ACCESSMODE")
)
@Select("""<script>
   SELECT * FROM sys_ac
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_ac_dto):sys_ac_dto?
                


@Insert("""<script>
    insert into sys_ac
    (ID,RESOURCETYPE,RESOURCEID,ASSIGNMENTTYPE,ASSIGNMENTID,ACCESSMODE)
    values
    (#{ID},#{RESOURCETYPE},#{RESOURCEID},#{ASSIGNMENTTYPE},#{ASSIGNMENTID},#{ACCESSMODE})
</script>""")
fun Insert(model:sys_ac_dto):Unit
                


@Insert("""<script>
    insert into sys_ac
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='RESOURCETYPE!= null'> 
           RESOURCETYPE,
        </if>
        <if test='RESOURCEID!= null'> 
           RESOURCEID,
        </if>
        <if test='ASSIGNMENTTYPE!= null'> 
           ASSIGNMENTTYPE,
        </if>
        <if test='ASSIGNMENTID!= null'> 
           ASSIGNMENTID,
        </if>
        <if test='ACCESSMODE!= null'> 
           ACCESSMODE
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=varchar}，
        <if test='RESOURCETYPE!= null'> 
           #{RESOURCETYPE,jdbcType=varchar}，
        </if>
        <if test='RESOURCEID!= null'> 
           #{RESOURCEID,jdbcType=varchar}，
        </if>
        <if test='ASSIGNMENTTYPE!= null'> 
           #{ASSIGNMENTTYPE,jdbcType=varchar}，
        </if>
        <if test='ASSIGNMENTID!= null'> 
           #{ASSIGNMENTID,jdbcType=varchar}，
        </if>
        <if test='ACCESSMODE!= null'> 
           #{ACCESSMODE,jdbcType=smallint}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_ac_dto):Unit
                


@Delete("DELETE FROM sys_ac WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_ac SET
        ID=#{ID,jdbcType=String},
        RESOURCETYPE=#{RESOURCETYPE,jdbcType=String},
        RESOURCEID=#{RESOURCEID,jdbcType=String},
        ASSIGNMENTTYPE=#{ASSIGNMENTTYPE,jdbcType=String},
        ASSIGNMENTID=#{ASSIGNMENTID,jdbcType=String},
        ACCESSMODE=#{ACCESSMODE,jdbcType=Integer}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_ac_dto)
        

@Update("""<script>
            UPDATE sys_ac SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="RESOURCETYPE != null">  RESOURCETYPE=#{RESOURCETYPE,jdbcType=String},</if>
        <if test="RESOURCEID != null">  RESOURCEID=#{RESOURCEID,jdbcType=String},</if>
        <if test="ASSIGNMENTTYPE != null">  ASSIGNMENTTYPE=#{ASSIGNMENTTYPE,jdbcType=String},</if>
        <if test="ASSIGNMENTID != null">  ASSIGNMENTID=#{ASSIGNMENTID,jdbcType=String},</if>
        <if test="ACCESSMODE != null">  ACCESSMODE=#{ACCESSMODE,jdbcType=Integer}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_ac_dto)
            

}

        
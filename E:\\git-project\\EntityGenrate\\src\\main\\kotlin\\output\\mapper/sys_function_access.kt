

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_function_access{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "CATEGORYTYPE", column = "CATEGORYTYPE"),
   Result(property = "ACCESSUSER", column = "ACCESSUSER"),
   Result(property = "ACCESSTIME", column = "ACCESSTIME"),
   Result(property = "RESOURCETYPE", column = "RESOURCETYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2")
)
@Select("""<script>
   SELECT * FROM sys_function_access
</script>""")
fun GetListAll():ArrayList<sys_function_access_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "CATEGORYTYPE", column = "CATEGORYTYPE"),
   Result(property = "ACCESSUSER", column = "ACCESSUSER"),
   Result(property = "ACCESSTIME", column = "ACCESSTIME"),
   Result(property = "RESOURCETYPE", column = "RESOURCETYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2")
)
@Select("""<script>
   SELECT * FROM sys_function_access
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="CATEGORYTYPE!=null">
      CATEGORYTYPE=#{CATEGORYTYPE}
   </if> 
   <if test="ACCESSUSER!=null">
      ACCESSUSER=#{ACCESSUSER}
   </if> 
   <if test="ACCESSTIME!=null">
      ACCESSTIME=#{ACCESSTIME}
   </if> 
   <if test="RESOURCETYPE!=null">
      RESOURCETYPE=#{RESOURCETYPE}
   </if> 
   <if test="RESOURCEID!=null">
      RESOURCEID=#{RESOURCEID}
   </if> 
   <if test="EXT1!=null">
      EXT1=#{EXT1}
   </if> 
   <if test="EXT2!=null">
      EXT2=#{EXT2}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_function_access_dto):ArrayList<sys_function_access_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "CATEGORYTYPE", column = "CATEGORYTYPE"),
   Result(property = "ACCESSUSER", column = "ACCESSUSER"),
   Result(property = "ACCESSTIME", column = "ACCESSTIME"),
   Result(property = "RESOURCETYPE", column = "RESOURCETYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2")
)
@Select("""<script>
   SELECT * FROM sys_function_access
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_function_access_dto):sys_function_access_dto?
                


@Insert("""<script>
    insert into sys_function_access
    (ID,CATEGORYTYPE,ACCESSUSER,ACCESSTIME,RESOURCETYPE,RESOURCEID,EXT1,EXT2)
    values
    (#{ID},#{CATEGORYTYPE},#{ACCESSUSER},#{ACCESSTIME},#{RESOURCETYPE},#{RESOURCEID},#{EXT1},#{EXT2})
</script>""")
fun Insert(model:sys_function_access_dto):Unit
                


@Insert("""<script>
    insert into sys_function_access
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='CATEGORYTYPE!= null'> 
           CATEGORYTYPE,
        </if>
        <if test='ACCESSUSER!= null'> 
           ACCESSUSER,
        </if>
        <if test='ACCESSTIME!= null'> 
           ACCESSTIME,
        </if>
        <if test='RESOURCETYPE!= null'> 
           RESOURCETYPE,
        </if>
        <if test='RESOURCEID!= null'> 
           RESOURCEID,
        </if>
        <if test='EXT1!= null'> 
           EXT1,
        </if>
        <if test='EXT2!= null'> 
           EXT2
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='CATEGORYTYPE!= null'> 
           #{CATEGORYTYPE,jdbcType=smallint}，
        </if>
        <if test='ACCESSUSER!= null'> 
           #{ACCESSUSER,jdbcType=varchar}，
        </if>
        <if test='ACCESSTIME!= null'> 
           #{ACCESSTIME,jdbcType=datetime}，
        </if>
        <if test='RESOURCETYPE!= null'> 
           #{RESOURCETYPE,jdbcType=smallint}，
        </if>
        <if test='RESOURCEID!= null'> 
           #{RESOURCEID,jdbcType=varchar}，
        </if>
        <if test='EXT1!= null'> 
           #{EXT1,jdbcType=varchar}，
        </if>
        <if test='EXT2!= null'> 
           #{EXT2,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_function_access_dto):Unit
                


@Delete("DELETE FROM sys_function_access WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_function_access SET
        ID=#{ID,jdbcType=String},
        CATEGORYTYPE=#{CATEGORYTYPE,jdbcType=Integer},
        ACCESSUSER=#{ACCESSUSER,jdbcType=String},
        ACCESSTIME=#{ACCESSTIME,jdbcType=Timestamp},
        RESOURCETYPE=#{RESOURCETYPE,jdbcType=Integer},
        RESOURCEID=#{RESOURCEID,jdbcType=String},
        EXT1=#{EXT1,jdbcType=String},
        EXT2=#{EXT2,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_function_access_dto)
        

@Update("""<script>
            UPDATE sys_function_access SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="CATEGORYTYPE != null">  CATEGORYTYPE=#{CATEGORYTYPE,jdbcType=Integer},</if>
        <if test="ACCESSUSER != null">  ACCESSUSER=#{ACCESSUSER,jdbcType=String},</if>
        <if test="ACCESSTIME != null">  ACCESSTIME=#{ACCESSTIME,jdbcType=Timestamp},</if>
        <if test="RESOURCETYPE != null">  RESOURCETYPE=#{RESOURCETYPE,jdbcType=Integer},</if>
        <if test="RESOURCEID != null">  RESOURCEID=#{RESOURCEID,jdbcType=String},</if>
        <if test="EXT1 != null">  EXT1=#{EXT1,jdbcType=String},</if>
        <if test="EXT2 != null">  EXT2=#{EXT2,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_function_access_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_function_access{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "CATEGORYTYPE", column = "CATEGORYTYPE"),
   Result(property = "ACCESSUSER", column = "ACCESSUSER"),
   Result(property = "ACCESSTIME", column = "ACCESSTIME"),
   Result(property = "RESOURCETYPE", column = "RESOURCETYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2")
)
@Select("""<script>
   SELECT * FROM sys_function_access
</script>""")
fun GetListAll():ArrayList<sys_function_access_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "CATEGORYTYPE", column = "CATEGORYTYPE"),
   Result(property = "ACCESSUSER", column = "ACCESSUSER"),
   Result(property = "ACCESSTIME", column = "ACCESSTIME"),
   Result(property = "RESOURCETYPE", column = "RESOURCETYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2")
)
@Select("""<script>
   SELECT * FROM sys_function_access
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="CATEGORYTYPE!=null">
      CATEGORYTYPE=#{CATEGORYTYPE}
   </if> 
   <if test="ACCESSUSER!=null">
      ACCESSUSER=#{ACCESSUSER}
   </if> 
   <if test="ACCESSTIME!=null">
      ACCESSTIME=#{ACCESSTIME}
   </if> 
   <if test="RESOURCETYPE!=null">
      RESOURCETYPE=#{RESOURCETYPE}
   </if> 
   <if test="RESOURCEID!=null">
      RESOURCEID=#{RESOURCEID}
   </if> 
   <if test="EXT1!=null">
      EXT1=#{EXT1}
   </if> 
   <if test="EXT2!=null">
      EXT2=#{EXT2}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_function_access_dto):ArrayList<sys_function_access_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "CATEGORYTYPE", column = "CATEGORYTYPE"),
   Result(property = "ACCESSUSER", column = "ACCESSUSER"),
   Result(property = "ACCESSTIME", column = "ACCESSTIME"),
   Result(property = "RESOURCETYPE", column = "RESOURCETYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2")
)
@Select("""<script>
   SELECT * FROM sys_function_access
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_function_access_dto):sys_function_access_dto?
                


@Insert("""<script>
    insert into sys_function_access
    (ID,CATEGORYTYPE,ACCESSUSER,ACCESSTIME,RESOURCETYPE,RESOURCEID,EXT1,EXT2)
    values
    (#{ID},#{CATEGORYTYPE},#{ACCESSUSER},#{ACCESSTIME},#{RESOURCETYPE},#{RESOURCEID},#{EXT1},#{EXT2})
</script>""")
fun Insert(model:sys_function_access_dto):Unit
                


@Insert("""<script>
    insert into sys_function_access
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='CATEGORYTYPE!= null'> 
           CATEGORYTYPE,
        </if>
        <if test='ACCESSUSER!= null'> 
           ACCESSUSER,
        </if>
        <if test='ACCESSTIME!= null'> 
           ACCESSTIME,
        </if>
        <if test='RESOURCETYPE!= null'> 
           RESOURCETYPE,
        </if>
        <if test='RESOURCEID!= null'> 
           RESOURCEID,
        </if>
        <if test='EXT1!= null'> 
           EXT1,
        </if>
        <if test='EXT2!= null'> 
           EXT2
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='CATEGORYTYPE!= null'> 
           #{CATEGORYTYPE,jdbcType=smallint}，
        </if>
        <if test='ACCESSUSER!= null'> 
           #{ACCESSUSER,jdbcType=varchar}，
        </if>
        <if test='ACCESSTIME!= null'> 
           #{ACCESSTIME,jdbcType=datetime}，
        </if>
        <if test='RESOURCETYPE!= null'> 
           #{RESOURCETYPE,jdbcType=smallint}，
        </if>
        <if test='RESOURCEID!= null'> 
           #{RESOURCEID,jdbcType=varchar}，
        </if>
        <if test='EXT1!= null'> 
           #{EXT1,jdbcType=varchar}，
        </if>
        <if test='EXT2!= null'> 
           #{EXT2,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_function_access_dto):Unit
                


@Delete("DELETE FROM sys_function_access WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_function_access SET
        ID=#{ID,jdbcType=String},
        CATEGORYTYPE=#{CATEGORYTYPE,jdbcType=Integer},
        ACCESSUSER=#{ACCESSUSER,jdbcType=String},
        ACCESSTIME=#{ACCESSTIME,jdbcType=Timestamp},
        RESOURCETYPE=#{RESOURCETYPE,jdbcType=Integer},
        RESOURCEID=#{RESOURCEID,jdbcType=String},
        EXT1=#{EXT1,jdbcType=String},
        EXT2=#{EXT2,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_function_access_dto)
        

@Update("""<script>
            UPDATE sys_function_access SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="CATEGORYTYPE != null">  CATEGORYTYPE=#{CATEGORYTYPE,jdbcType=Integer},</if>
        <if test="ACCESSUSER != null">  ACCESSUSER=#{ACCESSUSER,jdbcType=String},</if>
        <if test="ACCESSTIME != null">  ACCESSTIME=#{ACCESSTIME,jdbcType=Timestamp},</if>
        <if test="RESOURCETYPE != null">  RESOURCETYPE=#{RESOURCETYPE,jdbcType=Integer},</if>
        <if test="RESOURCEID != null">  RESOURCEID=#{RESOURCEID,jdbcType=String},</if>
        <if test="EXT1 != null">  EXT1=#{EXT1,jdbcType=String},</if>
        <if test="EXT2 != null">  EXT2=#{EXT2,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_function_access_dto)
            

}

        
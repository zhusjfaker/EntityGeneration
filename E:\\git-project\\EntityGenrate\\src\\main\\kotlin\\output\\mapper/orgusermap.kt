

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface orgusermap{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "DEPARTMENTID", column = "DEPARTMENTID"),
   Result(property = "ROLEID", column = "ROLEID"),
   Result(property = "ISMANAGER", column = "ISMANAGER"),
   Result(property = "ISSHOW", column = "ISSHOW")
)
@Select("""<script>
   SELECT * FROM orgusermap
</script>""")
fun GetListAll():ArrayList<orgusermap_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "DEPARTMENTID", column = "DEPARTMENTID"),
   Result(property = "ROLEID", column = "ROLEID"),
   Result(property = "ISMANAGER", column = "ISMANAGER"),
   Result(property = "ISSHOW", column = "ISSHOW")
)
@Select("""<script>
   SELECT * FROM orgusermap
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
   <if test="ISSHOW!=null">
      ISSHOW=#{ISSHOW}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:orgusermap_dto):ArrayList<orgusermap_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "DEPARTMENTID", column = "DEPARTMENTID"),
   Result(property = "ROLEID", column = "ROLEID"),
   Result(property = "ISMANAGER", column = "ISMANAGER"),
   Result(property = "ISSHOW", column = "ISSHOW")
)
@Select("""<script>
   SELECT * FROM orgusermap
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:orgusermap_dto):orgusermap_dto?
                


@Insert("""<script>
    insert into orgusermap
    (ID,USERID,DEPARTMENTID,ROLEID,ISMANAGER,ISSHOW)
    values
    (#{ID},#{USERID},#{DEPARTMENTID},#{ROLEID},#{ISMANAGER},#{ISSHOW})
</script>""")
fun Insert(model:orgusermap_dto):Unit
                


@Insert("""<script>
    insert into orgusermap
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
           USERID,
        <if test='DEPARTMENTID!= null'> 
           DEPARTMENTID,
        </if>
        <if test='ROLEID!= null'> 
           ROLEID,
        </if>
        <if test='ISMANAGER!= null'> 
           ISMANAGER,
        </if>
        <if test='ISSHOW!= null'> 
           ISSHOW
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=varchar}，
           #{USERID,jdbcType=varchar}，
        <if test='DEPARTMENTID!= null'> 
           #{DEPARTMENTID,jdbcType=varchar}，
        </if>
        <if test='ROLEID!= null'> 
           #{ROLEID,jdbcType=varchar}，
        </if>
        <if test='ISMANAGER!= null'> 
           #{ISMANAGER,jdbcType=smallint}，
        </if>
        <if test='ISSHOW!= null'> 
           #{ISSHOW,jdbcType=smallint}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:orgusermap_dto):Unit
                


@Delete("DELETE FROM orgusermap WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE orgusermap SET
        ID=#{ID,jdbcType=String},
        USERID=#{USERID,jdbcType=String},
        DEPARTMENTID=#{DEPARTMENTID,jdbcType=String},
        ROLEID=#{ROLEID,jdbcType=String},
        ISMANAGER=#{ISMANAGER,jdbcType=Integer},
        ISSHOW=#{ISSHOW,jdbcType=Integer}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:orgusermap_dto)
        

@Update("""<script>
            UPDATE orgusermap SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="USERID != null">  USERID=#{USERID,jdbcType=String},</if>
        <if test="DEPARTMENTID != null">  DEPARTMENTID=#{DEPARTMENTID,jdbcType=String},</if>
        <if test="ROLEID != null">  ROLEID=#{ROLEID,jdbcType=String},</if>
        <if test="ISMANAGER != null">  ISMANAGER=#{ISMANAGER,jdbcType=Integer},</if>
        <if test="ISSHOW != null">  ISSHOW=#{ISSHOW,jdbcType=Integer}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:orgusermap_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface orgusermap{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "DEPARTMENTID", column = "DEPARTMENTID"),
   Result(property = "ROLEID", column = "ROLEID"),
   Result(property = "ISMANAGER", column = "ISMANAGER"),
   Result(property = "ISSHOW", column = "ISSHOW")
)
@Select("""<script>
   SELECT * FROM orgusermap
</script>""")
fun GetListAll():ArrayList<orgusermap_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "DEPARTMENTID", column = "DEPARTMENTID"),
   Result(property = "ROLEID", column = "ROLEID"),
   Result(property = "ISMANAGER", column = "ISMANAGER"),
   Result(property = "ISSHOW", column = "ISSHOW")
)
@Select("""<script>
   SELECT * FROM orgusermap
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
   <if test="ISSHOW!=null">
      ISSHOW=#{ISSHOW}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:orgusermap_dto):ArrayList<orgusermap_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "DEPARTMENTID", column = "DEPARTMENTID"),
   Result(property = "ROLEID", column = "ROLEID"),
   Result(property = "ISMANAGER", column = "ISMANAGER"),
   Result(property = "ISSHOW", column = "ISSHOW")
)
@Select("""<script>
   SELECT * FROM orgusermap
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:orgusermap_dto):orgusermap_dto?
                


@Insert("""<script>
    insert into orgusermap
    (ID,USERID,DEPARTMENTID,ROLEID,ISMANAGER,ISSHOW)
    values
    (#{ID},#{USERID},#{DEPARTMENTID},#{ROLEID},#{ISMANAGER},#{ISSHOW})
</script>""")
fun Insert(model:orgusermap_dto):Unit
                


@Insert("""<script>
    insert into orgusermap
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
           USERID,
        <if test='DEPARTMENTID!= null'> 
           DEPARTMENTID,
        </if>
        <if test='ROLEID!= null'> 
           ROLEID,
        </if>
        <if test='ISMANAGER!= null'> 
           ISMANAGER,
        </if>
        <if test='ISSHOW!= null'> 
           ISSHOW
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=varchar}，
           #{USERID,jdbcType=varchar}，
        <if test='DEPARTMENTID!= null'> 
           #{DEPARTMENTID,jdbcType=varchar}，
        </if>
        <if test='ROLEID!= null'> 
           #{ROLEID,jdbcType=varchar}，
        </if>
        <if test='ISMANAGER!= null'> 
           #{ISMANAGER,jdbcType=smallint}，
        </if>
        <if test='ISSHOW!= null'> 
           #{ISSHOW,jdbcType=smallint}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:orgusermap_dto):Unit
                


@Delete("DELETE FROM orgusermap WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE orgusermap SET
        ID=#{ID,jdbcType=String},
        USERID=#{USERID,jdbcType=String},
        DEPARTMENTID=#{DEPARTMENTID,jdbcType=String},
        ROLEID=#{ROLEID,jdbcType=String},
        ISMANAGER=#{ISMANAGER,jdbcType=Integer},
        ISSHOW=#{ISSHOW,jdbcType=Integer}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:orgusermap_dto)
        

@Update("""<script>
            UPDATE orgusermap SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="USERID != null">  USERID=#{USERID,jdbcType=String},</if>
        <if test="DEPARTMENTID != null">  DEPARTMENTID=#{DEPARTMENTID,jdbcType=String},</if>
        <if test="ROLEID != null">  ROLEID=#{ROLEID,jdbcType=String},</if>
        <if test="ISMANAGER != null">  ISMANAGER=#{ISMANAGER,jdbcType=Integer},</if>
        <if test="ISSHOW != null">  ISSHOW=#{ISSHOW,jdbcType=Integer}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:orgusermap_dto)
            

}

        
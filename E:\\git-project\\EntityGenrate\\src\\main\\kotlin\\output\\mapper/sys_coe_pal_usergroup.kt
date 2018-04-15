

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_usergroup{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "GROUPCODE", column = "GROUPCODE"),
   Result(property = "CATEGORY", column = "CATEGORY"),
   Result(property = "GROUPNAME", column = "GROUPNAME"),
   Result(property = "GROUPDESC", column = "GROUPDESC"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATEDATE", column = "CREATEDATE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_usergroup
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_usergroup_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "GROUPCODE", column = "GROUPCODE"),
   Result(property = "CATEGORY", column = "CATEGORY"),
   Result(property = "GROUPNAME", column = "GROUPNAME"),
   Result(property = "GROUPDESC", column = "GROUPDESC"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATEDATE", column = "CREATEDATE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_usergroup
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="WSID!=null">
      WSID=#{WSID}
   </if> 
   <if test="GROUPCODE!=null">
      GROUPCODE=#{GROUPCODE}
   </if> 
   <if test="CATEGORY!=null">
      CATEGORY=#{CATEGORY}
   </if> 
   <if test="GROUPNAME!=null">
      GROUPNAME=#{GROUPNAME}
   </if> 
   <if test="GROUPDESC!=null">
      GROUPDESC=#{GROUPDESC}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="CREATEDATE!=null">
      CREATEDATE=#{CREATEDATE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_usergroup_dto):ArrayList<sys_coe_pal_usergroup_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "GROUPCODE", column = "GROUPCODE"),
   Result(property = "CATEGORY", column = "CATEGORY"),
   Result(property = "GROUPNAME", column = "GROUPNAME"),
   Result(property = "GROUPDESC", column = "GROUPDESC"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATEDATE", column = "CREATEDATE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_usergroup
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_usergroup_dto):sys_coe_pal_usergroup_dto?
                


@Insert("""<script>
    insert into sys_coe_pal_usergroup
    (ID,WSID,GROUPCODE,CATEGORY,GROUPNAME,GROUPDESC,CREATEUSER,CREATEDATE)
    values
    (#{ID},#{WSID},#{GROUPCODE},#{CATEGORY},#{GROUPNAME},#{GROUPDESC},#{CREATEUSER},#{CREATEDATE})
</script>""")
fun Insert(model:sys_coe_pal_usergroup_dto):Unit
                


@Insert("""<script>
    insert into sys_coe_pal_usergroup
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='WSID!= null'> 
           WSID,
        </if>
        <if test='GROUPCODE!= null'> 
           GROUPCODE,
        </if>
        <if test='CATEGORY!= null'> 
           CATEGORY,
        </if>
        <if test='GROUPNAME!= null'> 
           GROUPNAME,
        </if>
        <if test='GROUPDESC!= null'> 
           GROUPDESC,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='CREATEDATE!= null'> 
           CREATEDATE
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='WSID!= null'> 
           #{WSID,jdbcType=char}，
        </if>
        <if test='GROUPCODE!= null'> 
           #{GROUPCODE,jdbcType=varchar}，
        </if>
        <if test='CATEGORY!= null'> 
           #{CATEGORY,jdbcType=varchar}，
        </if>
        <if test='GROUPNAME!= null'> 
           #{GROUPNAME,jdbcType=varchar}，
        </if>
        <if test='GROUPDESC!= null'> 
           #{GROUPDESC,jdbcType=varchar}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='CREATEDATE!= null'> 
           #{CREATEDATE,jdbcType=datetime}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_coe_pal_usergroup_dto):Unit
                


@Delete("DELETE FROM sys_coe_pal_usergroup WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_coe_pal_usergroup SET
        ID=#{ID,jdbcType=String},
        WSID=#{WSID,jdbcType=String},
        GROUPCODE=#{GROUPCODE,jdbcType=String},
        CATEGORY=#{CATEGORY,jdbcType=String},
        GROUPNAME=#{GROUPNAME,jdbcType=String},
        GROUPDESC=#{GROUPDESC,jdbcType=String},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        CREATEDATE=#{CREATEDATE,jdbcType=Timestamp}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_coe_pal_usergroup_dto)
        

@Update("""<script>
            UPDATE sys_coe_pal_usergroup SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="WSID != null">  WSID=#{WSID,jdbcType=String},</if>
        <if test="GROUPCODE != null">  GROUPCODE=#{GROUPCODE,jdbcType=String},</if>
        <if test="CATEGORY != null">  CATEGORY=#{CATEGORY,jdbcType=String},</if>
        <if test="GROUPNAME != null">  GROUPNAME=#{GROUPNAME,jdbcType=String},</if>
        <if test="GROUPDESC != null">  GROUPDESC=#{GROUPDESC,jdbcType=String},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="CREATEDATE != null">  CREATEDATE=#{CREATEDATE,jdbcType=Timestamp}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_coe_pal_usergroup_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_usergroup{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "GROUPCODE", column = "GROUPCODE"),
   Result(property = "CATEGORY", column = "CATEGORY"),
   Result(property = "GROUPNAME", column = "GROUPNAME"),
   Result(property = "GROUPDESC", column = "GROUPDESC"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATEDATE", column = "CREATEDATE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_usergroup
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_usergroup_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "GROUPCODE", column = "GROUPCODE"),
   Result(property = "CATEGORY", column = "CATEGORY"),
   Result(property = "GROUPNAME", column = "GROUPNAME"),
   Result(property = "GROUPDESC", column = "GROUPDESC"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATEDATE", column = "CREATEDATE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_usergroup
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="WSID!=null">
      WSID=#{WSID}
   </if> 
   <if test="GROUPCODE!=null">
      GROUPCODE=#{GROUPCODE}
   </if> 
   <if test="CATEGORY!=null">
      CATEGORY=#{CATEGORY}
   </if> 
   <if test="GROUPNAME!=null">
      GROUPNAME=#{GROUPNAME}
   </if> 
   <if test="GROUPDESC!=null">
      GROUPDESC=#{GROUPDESC}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="CREATEDATE!=null">
      CREATEDATE=#{CREATEDATE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_usergroup_dto):ArrayList<sys_coe_pal_usergroup_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "GROUPCODE", column = "GROUPCODE"),
   Result(property = "CATEGORY", column = "CATEGORY"),
   Result(property = "GROUPNAME", column = "GROUPNAME"),
   Result(property = "GROUPDESC", column = "GROUPDESC"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATEDATE", column = "CREATEDATE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_usergroup
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_usergroup_dto):sys_coe_pal_usergroup_dto?
                


@Insert("""<script>
    insert into sys_coe_pal_usergroup
    (ID,WSID,GROUPCODE,CATEGORY,GROUPNAME,GROUPDESC,CREATEUSER,CREATEDATE)
    values
    (#{ID},#{WSID},#{GROUPCODE},#{CATEGORY},#{GROUPNAME},#{GROUPDESC},#{CREATEUSER},#{CREATEDATE})
</script>""")
fun Insert(model:sys_coe_pal_usergroup_dto):Unit
                


@Insert("""<script>
    insert into sys_coe_pal_usergroup
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='WSID!= null'> 
           WSID,
        </if>
        <if test='GROUPCODE!= null'> 
           GROUPCODE,
        </if>
        <if test='CATEGORY!= null'> 
           CATEGORY,
        </if>
        <if test='GROUPNAME!= null'> 
           GROUPNAME,
        </if>
        <if test='GROUPDESC!= null'> 
           GROUPDESC,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='CREATEDATE!= null'> 
           CREATEDATE
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='WSID!= null'> 
           #{WSID,jdbcType=char}，
        </if>
        <if test='GROUPCODE!= null'> 
           #{GROUPCODE,jdbcType=varchar}，
        </if>
        <if test='CATEGORY!= null'> 
           #{CATEGORY,jdbcType=varchar}，
        </if>
        <if test='GROUPNAME!= null'> 
           #{GROUPNAME,jdbcType=varchar}，
        </if>
        <if test='GROUPDESC!= null'> 
           #{GROUPDESC,jdbcType=varchar}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='CREATEDATE!= null'> 
           #{CREATEDATE,jdbcType=datetime}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_coe_pal_usergroup_dto):Unit
                


@Delete("DELETE FROM sys_coe_pal_usergroup WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_coe_pal_usergroup SET
        ID=#{ID,jdbcType=String},
        WSID=#{WSID,jdbcType=String},
        GROUPCODE=#{GROUPCODE,jdbcType=String},
        CATEGORY=#{CATEGORY,jdbcType=String},
        GROUPNAME=#{GROUPNAME,jdbcType=String},
        GROUPDESC=#{GROUPDESC,jdbcType=String},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        CREATEDATE=#{CREATEDATE,jdbcType=Timestamp}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_coe_pal_usergroup_dto)
        

@Update("""<script>
            UPDATE sys_coe_pal_usergroup SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="WSID != null">  WSID=#{WSID,jdbcType=String},</if>
        <if test="GROUPCODE != null">  GROUPCODE=#{GROUPCODE,jdbcType=String},</if>
        <if test="CATEGORY != null">  CATEGORY=#{CATEGORY,jdbcType=String},</if>
        <if test="GROUPNAME != null">  GROUPNAME=#{GROUPNAME,jdbcType=String},</if>
        <if test="GROUPDESC != null">  GROUPDESC=#{GROUPDESC,jdbcType=String},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="CREATEDATE != null">  CREATEDATE=#{CREATEDATE,jdbcType=Timestamp}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_coe_pal_usergroup_dto)
            

}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_permissionassn{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ASSIGNMENTTYPE", column = "ASSIGNMENTTYPE"),
   Result(property = "ASSIGNMENTID", column = "ASSIGNMENTID"),
   Result(property = "PERMISSIONID", column = "PERMISSIONID")
)
@Select("""<script>
   SELECT * FROM sys_permissionassn
</script>""")
fun GetListAll():ArrayList<sys_permissionassn_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ASSIGNMENTTYPE", column = "ASSIGNMENTTYPE"),
   Result(property = "ASSIGNMENTID", column = "ASSIGNMENTID"),
   Result(property = "PERMISSIONID", column = "PERMISSIONID")
)
@Select("""<script>
   SELECT * FROM sys_permissionassn
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="ASSIGNMENTTYPE!=null">
      ASSIGNMENTTYPE=#{ASSIGNMENTTYPE}
   </if> 
   <if test="ASSIGNMENTID!=null">
      ASSIGNMENTID=#{ASSIGNMENTID}
   </if> 
   <if test="PERMISSIONID!=null">
      PERMISSIONID=#{PERMISSIONID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_permissionassn_dto):ArrayList<sys_permissionassn_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ASSIGNMENTTYPE", column = "ASSIGNMENTTYPE"),
   Result(property = "ASSIGNMENTID", column = "ASSIGNMENTID"),
   Result(property = "PERMISSIONID", column = "PERMISSIONID")
)
@Select("""<script>
   SELECT * FROM sys_permissionassn
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_permissionassn_dto):sys_permissionassn_dto?
                


@Insert("""<script>
    insert into sys_permissionassn
    (ID,ASSIGNMENTTYPE,ASSIGNMENTID,PERMISSIONID)
    values
    (#{ID},#{ASSIGNMENTTYPE},#{ASSIGNMENTID},#{PERMISSIONID})
</script>""")
fun Insert(model:sys_permissionassn_dto):Unit
                


@Insert("""<script>
    insert into sys_permissionassn
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
           ASSIGNMENTTYPE,
           ASSIGNMENTID,
           PERMISSIONID
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=varchar}，
           #{ASSIGNMENTTYPE,jdbcType=varchar}，
           #{ASSIGNMENTID,jdbcType=varchar}，
           #{PERMISSIONID,jdbcType=varchar}
    </trim>
</script>""")
fun InsertSelective(model:sys_permissionassn_dto):Unit
                


@Delete("DELETE FROM sys_permissionassn WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_permissionassn SET
        ID=#{ID,jdbcType=String},
        ASSIGNMENTTYPE=#{ASSIGNMENTTYPE,jdbcType=String},
        ASSIGNMENTID=#{ASSIGNMENTID,jdbcType=String},
        PERMISSIONID=#{PERMISSIONID,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_permissionassn_dto)
        

@Update("""<script>
            UPDATE sys_permissionassn SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="ASSIGNMENTTYPE != null">  ASSIGNMENTTYPE=#{ASSIGNMENTTYPE,jdbcType=String},</if>
        <if test="ASSIGNMENTID != null">  ASSIGNMENTID=#{ASSIGNMENTID,jdbcType=String},</if>
        <if test="PERMISSIONID != null">  PERMISSIONID=#{PERMISSIONID,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_permissionassn_dto)
            

}

        
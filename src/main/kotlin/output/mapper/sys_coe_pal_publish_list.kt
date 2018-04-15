

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_publish_list{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PID", column = "PID"),
   Result(property = "PALREPOSITORYID", column = "PALREPOSITORYID"),
   Result(property = "ACTIONTYPE", column = "ACTIONTYPE"),
   Result(property = "PUBLISHDESC", column = "PUBLISHDESC")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_publish_list
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_publish_list_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PID", column = "PID"),
   Result(property = "PALREPOSITORYID", column = "PALREPOSITORYID"),
   Result(property = "ACTIONTYPE", column = "ACTIONTYPE"),
   Result(property = "PUBLISHDESC", column = "PUBLISHDESC")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_publish_list
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="PID!=null">
      PID=#{PID}
   </if> 
   <if test="PALREPOSITORYID!=null">
      PALREPOSITORYID=#{PALREPOSITORYID}
   </if> 
   <if test="ACTIONTYPE!=null">
      ACTIONTYPE=#{ACTIONTYPE}
   </if> 
   <if test="PUBLISHDESC!=null">
      PUBLISHDESC=#{PUBLISHDESC}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_publish_list_dto):ArrayList<sys_coe_pal_publish_list_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PID", column = "PID"),
   Result(property = "PALREPOSITORYID", column = "PALREPOSITORYID"),
   Result(property = "ACTIONTYPE", column = "ACTIONTYPE"),
   Result(property = "PUBLISHDESC", column = "PUBLISHDESC")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_publish_list
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_publish_list_dto):sys_coe_pal_publish_list_dto?
                


@Insert("""<script>
    insert into sys_coe_pal_publish_list
    (ID,PID,PALREPOSITORYID,ACTIONTYPE,PUBLISHDESC)
    values
    (#{ID},#{PID},#{PALREPOSITORYID},#{ACTIONTYPE},#{PUBLISHDESC})
</script>""")
fun Insert(model:sys_coe_pal_publish_list_dto):Unit
                


@Insert("""<script>
    insert into sys_coe_pal_publish_list
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='PID!= null'> 
           PID,
        </if>
        <if test='PALREPOSITORYID!= null'> 
           PALREPOSITORYID,
        </if>
        <if test='ACTIONTYPE!= null'> 
           ACTIONTYPE,
        </if>
        <if test='PUBLISHDESC!= null'> 
           PUBLISHDESC
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='PID!= null'> 
           #{PID,jdbcType=char}，
        </if>
        <if test='PALREPOSITORYID!= null'> 
           #{PALREPOSITORYID,jdbcType=char}，
        </if>
        <if test='ACTIONTYPE!= null'> 
           #{ACTIONTYPE,jdbcType=char}，
        </if>
        <if test='PUBLISHDESC!= null'> 
           #{PUBLISHDESC,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_coe_pal_publish_list_dto):Unit
                


@Delete("DELETE FROM sys_coe_pal_publish_list WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_coe_pal_publish_list SET
        ID=#{ID,jdbcType=String},
        PID=#{PID,jdbcType=String},
        PALREPOSITORYID=#{PALREPOSITORYID,jdbcType=String},
        ACTIONTYPE=#{ACTIONTYPE,jdbcType=String},
        PUBLISHDESC=#{PUBLISHDESC,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_coe_pal_publish_list_dto)
        

@Update("""<script>
            UPDATE sys_coe_pal_publish_list SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="PID != null">  PID=#{PID,jdbcType=String},</if>
        <if test="PALREPOSITORYID != null">  PALREPOSITORYID=#{PALREPOSITORYID,jdbcType=String},</if>
        <if test="ACTIONTYPE != null">  ACTIONTYPE=#{ACTIONTYPE,jdbcType=String},</if>
        <if test="PUBLISHDESC != null">  PUBLISHDESC=#{PUBLISHDESC,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_coe_pal_publish_list_dto)
            

}

        
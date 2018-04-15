

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_repository_r_info{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "REMOVEUSER", column = "REMOVEUSER"),
   Result(property = "REMOVETIME", column = "REMOVETIME"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "RESOURCEID", column = "RESOURCEID"),
   Result(property = "REMOVETYPE", column = "REMOVETYPE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_repository_r_info
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_repository_r_info_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "REMOVEUSER", column = "REMOVEUSER"),
   Result(property = "REMOVETIME", column = "REMOVETIME"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "RESOURCEID", column = "RESOURCEID"),
   Result(property = "REMOVETYPE", column = "REMOVETYPE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_repository_r_info
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="REMOVEUSER!=null">
      REMOVEUSER=#{REMOVEUSER}
   </if> 
   <if test="REMOVETIME!=null">
      REMOVETIME=#{REMOVETIME}
   </if> 
   <if test="WSID!=null">
      WSID=#{WSID}
   </if> 
   <if test="RESOURCEID!=null">
      RESOURCEID=#{RESOURCEID}
   </if> 
   <if test="REMOVETYPE!=null">
      REMOVETYPE=#{REMOVETYPE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_repository_r_info_dto):ArrayList<sys_coe_pal_repository_r_info_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "REMOVEUSER", column = "REMOVEUSER"),
   Result(property = "REMOVETIME", column = "REMOVETIME"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "RESOURCEID", column = "RESOURCEID"),
   Result(property = "REMOVETYPE", column = "REMOVETYPE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_repository_r_info
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_repository_r_info_dto):sys_coe_pal_repository_r_info_dto?
                


@Insert("""<script>
    insert into sys_coe_pal_repository_r_info
    (ID,REMOVEUSER,REMOVETIME,WSID,RESOURCEID,REMOVETYPE)
    values
    (#{ID},#{REMOVEUSER},#{REMOVETIME},#{WSID},#{RESOURCEID},#{REMOVETYPE})
</script>""")
fun Insert(model:sys_coe_pal_repository_r_info_dto):Unit
                


@Insert("""<script>
    insert into sys_coe_pal_repository_r_info
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='REMOVEUSER!= null'> 
           REMOVEUSER,
        </if>
        <if test='REMOVETIME!= null'> 
           REMOVETIME,
        </if>
        <if test='WSID!= null'> 
           WSID,
        </if>
        <if test='RESOURCEID!= null'> 
           RESOURCEID,
        </if>
        <if test='REMOVETYPE!= null'> 
           REMOVETYPE
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='REMOVEUSER!= null'> 
           #{REMOVEUSER,jdbcType=varchar}，
        </if>
        <if test='REMOVETIME!= null'> 
           #{REMOVETIME,jdbcType=datetime}，
        </if>
        <if test='WSID!= null'> 
           #{WSID,jdbcType=varchar}，
        </if>
        <if test='RESOURCEID!= null'> 
           #{RESOURCEID,jdbcType=varchar}，
        </if>
        <if test='REMOVETYPE!= null'> 
           #{REMOVETYPE,jdbcType=smallint}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_coe_pal_repository_r_info_dto):Unit
                


@Delete("DELETE FROM sys_coe_pal_repository_r_info WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_coe_pal_repository_r_info SET
        ID=#{ID,jdbcType=String},
        REMOVEUSER=#{REMOVEUSER,jdbcType=String},
        REMOVETIME=#{REMOVETIME,jdbcType=Timestamp},
        WSID=#{WSID,jdbcType=String},
        RESOURCEID=#{RESOURCEID,jdbcType=String},
        REMOVETYPE=#{REMOVETYPE,jdbcType=Integer}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_coe_pal_repository_r_info_dto)
        

@Update("""<script>
            UPDATE sys_coe_pal_repository_r_info SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="REMOVEUSER != null">  REMOVEUSER=#{REMOVEUSER,jdbcType=String},</if>
        <if test="REMOVETIME != null">  REMOVETIME=#{REMOVETIME,jdbcType=Timestamp},</if>
        <if test="WSID != null">  WSID=#{WSID,jdbcType=String},</if>
        <if test="RESOURCEID != null">  RESOURCEID=#{RESOURCEID,jdbcType=String},</if>
        <if test="REMOVETYPE != null">  REMOVETYPE=#{REMOVETYPE,jdbcType=Integer}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_coe_pal_repository_r_info_dto)
            

}

        
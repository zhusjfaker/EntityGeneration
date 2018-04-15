

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_rongim_group{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "GROUPNAME", column = "GROUPNAME"),
   Result(property = "GROUPDESC", column = "GROUPDESC"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "UPDATETIME", column = "UPDATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_rongim_group
</script>""")
fun GetListAll():ArrayList<app_act_rongim_group_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "GROUPNAME", column = "GROUPNAME"),
   Result(property = "GROUPDESC", column = "GROUPDESC"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "UPDATETIME", column = "UPDATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_rongim_group
   <where>
   <if test="ID!=null">
      ID=#{ID}
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
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   <if test="UPDATETIME!=null">
      UPDATETIME=#{UPDATETIME}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_rongim_group_dto):ArrayList<app_act_rongim_group_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "GROUPNAME", column = "GROUPNAME"),
   Result(property = "GROUPDESC", column = "GROUPDESC"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "UPDATETIME", column = "UPDATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_rongim_group
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_rongim_group_dto):app_act_rongim_group_dto?
                


@Insert("""<script>
    insert into app_act_rongim_group
    (ID,GROUPNAME,GROUPDESC,CREATEUSER,CREATETIME,UPDATETIME)
    values
    (#{ID},#{GROUPNAME},#{GROUPDESC},#{CREATEUSER},#{CREATETIME},#{UPDATETIME})
</script>""")
fun Insert(model:app_act_rongim_group_dto):Unit
                


@Insert("""<script>
    insert into app_act_rongim_group
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='GROUPNAME!= null'> 
           GROUPNAME,
        </if>
        <if test='GROUPDESC!= null'> 
           GROUPDESC,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='CREATETIME!= null'> 
           CREATETIME,
        </if>
        <if test='UPDATETIME!= null'> 
           UPDATETIME
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='GROUPNAME!= null'> 
           #{GROUPNAME,jdbcType=varchar}，
        </if>
        <if test='GROUPDESC!= null'> 
           #{GROUPDESC,jdbcType=varchar}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='CREATETIME!= null'> 
           #{CREATETIME,jdbcType=datetime}，
        </if>
        <if test='UPDATETIME!= null'> 
           #{UPDATETIME,jdbcType=datetime}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_rongim_group_dto):Unit
                


@Delete("DELETE FROM app_act_rongim_group WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE app_act_rongim_group SET
        ID=#{ID,jdbcType=String},
        GROUPNAME=#{GROUPNAME,jdbcType=String},
        GROUPDESC=#{GROUPDESC,jdbcType=String},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        CREATETIME=#{CREATETIME,jdbcType=Timestamp},
        UPDATETIME=#{UPDATETIME,jdbcType=Timestamp}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:app_act_rongim_group_dto)
        

@Update("""<script>
            UPDATE app_act_rongim_group SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="GROUPNAME != null">  GROUPNAME=#{GROUPNAME,jdbcType=String},</if>
        <if test="GROUPDESC != null">  GROUPDESC=#{GROUPDESC,jdbcType=String},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="CREATETIME != null">  CREATETIME=#{CREATETIME,jdbcType=Timestamp},</if>
        <if test="UPDATETIME != null">  UPDATETIME=#{UPDATETIME,jdbcType=Timestamp}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:app_act_rongim_group_dto)
            

}

        
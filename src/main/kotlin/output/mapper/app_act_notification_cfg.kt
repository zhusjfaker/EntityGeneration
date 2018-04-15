

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_notification_cfg{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ISCLOSE", column = "ISCLOSE"),
   Result(property = "ISSTORE", column = "ISSTORE")
)
@Select("""<script>
   SELECT * FROM app_act_notification_cfg
</script>""")
fun GetListAll():ArrayList<app_act_notification_cfg_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ISCLOSE", column = "ISCLOSE"),
   Result(property = "ISSTORE", column = "ISSTORE")
)
@Select("""<script>
   SELECT * FROM app_act_notification_cfg
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="ISCLOSE!=null">
      ISCLOSE=#{ISCLOSE}
   </if> 
   <if test="ISSTORE!=null">
      ISSTORE=#{ISSTORE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_notification_cfg_dto):ArrayList<app_act_notification_cfg_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ISCLOSE", column = "ISCLOSE"),
   Result(property = "ISSTORE", column = "ISSTORE")
)
@Select("""<script>
   SELECT * FROM app_act_notification_cfg
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_notification_cfg_dto):app_act_notification_cfg_dto?
                


@Insert("""<script>
    insert into app_act_notification_cfg
    (ID,ISCLOSE,ISSTORE)
    values
    (#{ID},#{ISCLOSE},#{ISSTORE})
</script>""")
fun Insert(model:app_act_notification_cfg_dto):Unit
                


@Insert("""<script>
    insert into app_act_notification_cfg
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='ISCLOSE!= null'> 
           ISCLOSE,
        </if>
        <if test='ISSTORE!= null'> 
           ISSTORE
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='ISCLOSE!= null'> 
           #{ISCLOSE,jdbcType=char}，
        </if>
        <if test='ISSTORE!= null'> 
           #{ISSTORE,jdbcType=char}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_notification_cfg_dto):Unit
                


@Delete("DELETE FROM app_act_notification_cfg WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE app_act_notification_cfg SET
        ID=#{ID,jdbcType=String},
        ISCLOSE=#{ISCLOSE,jdbcType=String},
        ISSTORE=#{ISSTORE,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:app_act_notification_cfg_dto)
        

@Update("""<script>
            UPDATE app_act_notification_cfg SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="ISCLOSE != null">  ISCLOSE=#{ISCLOSE,jdbcType=String},</if>
        <if test="ISSTORE != null">  ISSTORE=#{ISSTORE,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:app_act_notification_cfg_dto)
            

}

        
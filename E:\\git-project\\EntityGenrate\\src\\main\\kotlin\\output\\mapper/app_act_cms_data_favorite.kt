

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_cms_data_favorite{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DATAID", column = "DATAID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_cms_data_favorite
</script>""")
fun GetListAll():ArrayList<app_act_cms_data_favorite_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DATAID", column = "DATAID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_cms_data_favorite
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="DATAID!=null">
      DATAID=#{DATAID}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_cms_data_favorite_dto):ArrayList<app_act_cms_data_favorite_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DATAID", column = "DATAID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_cms_data_favorite
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_cms_data_favorite_dto):app_act_cms_data_favorite_dto?
                


@Insert("""<script>
    insert into app_act_cms_data_favorite
    (ID,DATAID,CREATEUSER,CREATETIME)
    values
    (#{ID},#{DATAID},#{CREATEUSER},#{CREATETIME})
</script>""")
fun Insert(model:app_act_cms_data_favorite_dto):Unit
                


@Insert("""<script>
    insert into app_act_cms_data_favorite
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='DATAID!= null'> 
           DATAID,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='CREATETIME!= null'> 
           CREATETIME
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='DATAID!= null'> 
           #{DATAID,jdbcType=char}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='CREATETIME!= null'> 
           #{CREATETIME,jdbcType=datetime}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_cms_data_favorite_dto):Unit
                


@Delete("DELETE FROM app_act_cms_data_favorite WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE app_act_cms_data_favorite SET
        ID=#{ID,jdbcType=String},
        DATAID=#{DATAID,jdbcType=String},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        CREATETIME=#{CREATETIME,jdbcType=Timestamp}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:app_act_cms_data_favorite_dto)
        

@Update("""<script>
            UPDATE app_act_cms_data_favorite SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="DATAID != null">  DATAID=#{DATAID,jdbcType=String},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="CREATETIME != null">  CREATETIME=#{CREATETIME,jdbcType=Timestamp}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:app_act_cms_data_favorite_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_cms_data_favorite{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DATAID", column = "DATAID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_cms_data_favorite
</script>""")
fun GetListAll():ArrayList<app_act_cms_data_favorite_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DATAID", column = "DATAID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_cms_data_favorite
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="DATAID!=null">
      DATAID=#{DATAID}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_cms_data_favorite_dto):ArrayList<app_act_cms_data_favorite_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DATAID", column = "DATAID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_cms_data_favorite
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_cms_data_favorite_dto):app_act_cms_data_favorite_dto?
                


@Insert("""<script>
    insert into app_act_cms_data_favorite
    (ID,DATAID,CREATEUSER,CREATETIME)
    values
    (#{ID},#{DATAID},#{CREATEUSER},#{CREATETIME})
</script>""")
fun Insert(model:app_act_cms_data_favorite_dto):Unit
                


@Insert("""<script>
    insert into app_act_cms_data_favorite
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='DATAID!= null'> 
           DATAID,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='CREATETIME!= null'> 
           CREATETIME
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='DATAID!= null'> 
           #{DATAID,jdbcType=char}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='CREATETIME!= null'> 
           #{CREATETIME,jdbcType=datetime}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_cms_data_favorite_dto):Unit
                


@Delete("DELETE FROM app_act_cms_data_favorite WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE app_act_cms_data_favorite SET
        ID=#{ID,jdbcType=String},
        DATAID=#{DATAID,jdbcType=String},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        CREATETIME=#{CREATETIME,jdbcType=Timestamp}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:app_act_cms_data_favorite_dto)
        

@Update("""<script>
            UPDATE app_act_cms_data_favorite SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="DATAID != null">  DATAID=#{DATAID,jdbcType=String},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="CREATETIME != null">  CREATETIME=#{CREATETIME,jdbcType=Timestamp}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:app_act_cms_data_favorite_dto)
            

}

        
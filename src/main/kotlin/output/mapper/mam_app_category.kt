

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface mam_app_category{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "CATEGORY", column = "CATEGORY")
)
@Select("""<script>
   SELECT * FROM mam_app_category
</script>""")
fun GetListAll():ArrayList<mam_app_category_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "CATEGORY", column = "CATEGORY")
)
@Select("""<script>
   SELECT * FROM mam_app_category
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="APPID!=null">
      APPID=#{APPID}
   </if> 
   <if test="CATEGORY!=null">
      CATEGORY=#{CATEGORY}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:mam_app_category_dto):ArrayList<mam_app_category_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "CATEGORY", column = "CATEGORY")
)
@Select("""<script>
   SELECT * FROM mam_app_category
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:mam_app_category_dto):mam_app_category_dto?
                


@Insert("""<script>
    insert into mam_app_category
    (ID,APPID,CATEGORY)
    values
    (#{ID},#{APPID},#{CATEGORY})
</script>""")
fun Insert(model:mam_app_category_dto):Unit
                


@Insert("""<script>
    insert into mam_app_category
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
           APPID,
        <if test='CATEGORY!= null'> 
           CATEGORY
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
           #{APPID,jdbcType=varchar}，
        <if test='CATEGORY!= null'> 
           #{CATEGORY,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:mam_app_category_dto):Unit
                


@Delete("DELETE FROM mam_app_category WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE mam_app_category SET
        ID=#{ID,jdbcType=String},
        APPID=#{APPID,jdbcType=String},
        CATEGORY=#{CATEGORY,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:mam_app_category_dto)
        

@Update("""<script>
            UPDATE mam_app_category SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="APPID != null">  APPID=#{APPID,jdbcType=String},</if>
        <if test="CATEGORY != null">  CATEGORY=#{CATEGORY,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:mam_app_category_dto)
            

}

        
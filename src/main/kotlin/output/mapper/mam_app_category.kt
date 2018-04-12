

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
    insert into TStudent
    (ID,APPID,CATEGORY)
    values
    (#{ID},#{APPID},#{CATEGORY})
</script>""")
fun insert(model:mam_app_category_dto):Unit
                

}

        
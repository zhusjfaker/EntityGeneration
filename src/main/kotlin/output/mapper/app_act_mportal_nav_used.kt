

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_mportal_nav_used{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "NAME", column = "NAME"),
   Result(property = "URL", column = "URL"),
   Result(property = "TARGET", column = "TARGET"),
   Result(property = "ICON64", column = "ICON64"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "NAVID", column = "NAVID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "FUNNAVID", column = "FUNNAVID")
)
@Select("""<script>
   SELECT * FROM app_act_mportal_nav_used
</script>""")
fun GetListAll():ArrayList<app_act_mportal_nav_used_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "NAME", column = "NAME"),
   Result(property = "URL", column = "URL"),
   Result(property = "TARGET", column = "TARGET"),
   Result(property = "ICON64", column = "ICON64"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "NAVID", column = "NAVID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "FUNNAVID", column = "FUNNAVID")
)
@Select("""<script>
   SELECT * FROM app_act_mportal_nav_used
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="NAME!=null">
      NAME=#{NAME}
   </if> 
   <if test="URL!=null">
      URL=#{URL}
   </if> 
   <if test="TARGET!=null">
      TARGET=#{TARGET}
   </if> 
   <if test="ICON64!=null">
      ICON64=#{ICON64}
   </if> 
   <if test="APPID!=null">
      APPID=#{APPID}
   </if> 
   <if test="NAVID!=null">
      NAVID=#{NAVID}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="FUNNAVID!=null">
      FUNNAVID=#{FUNNAVID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_mportal_nav_used_dto):ArrayList<app_act_mportal_nav_used_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "NAME", column = "NAME"),
   Result(property = "URL", column = "URL"),
   Result(property = "TARGET", column = "TARGET"),
   Result(property = "ICON64", column = "ICON64"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "NAVID", column = "NAVID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "FUNNAVID", column = "FUNNAVID")
)
@Select("""<script>
   SELECT * FROM app_act_mportal_nav_used
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_mportal_nav_used_dto):app_act_mportal_nav_used_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,NAME,URL,TARGET,ICON64,APPID,NAVID,USERID,FUNNAVID)
    values
    (#{ID},#{NAME},#{URL},#{TARGET},#{ICON64},#{APPID},#{NAVID},#{USERID},#{FUNNAVID})
</script>""")
fun insert(model:app_act_mportal_nav_used_dto):Unit
                

}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_cms_navigation{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "NAVSITEOWNERID", column = "NAVSITEOWNERID"),
   Result(property = "NAVNAME", column = "NAVNAME"),
   Result(property = "SITEID", column = "SITEID"),
   Result(property = "NAVURL", column = "NAVURL"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "LINKTARGET", column = "LINKTARGET")
)
@Select("""<script>
   SELECT * FROM app_act_cms_navigation
</script>""")
fun GetListAll():ArrayList<app_act_cms_navigation_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "NAVSITEOWNERID", column = "NAVSITEOWNERID"),
   Result(property = "NAVNAME", column = "NAVNAME"),
   Result(property = "SITEID", column = "SITEID"),
   Result(property = "NAVURL", column = "NAVURL"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "LINKTARGET", column = "LINKTARGET")
)
@Select("""<script>
   SELECT * FROM app_act_cms_navigation
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="NAVSITEOWNERID!=null">
      NAVSITEOWNERID=#{NAVSITEOWNERID}
   </if> 
   <if test="NAVNAME!=null">
      NAVNAME=#{NAVNAME}
   </if> 
   <if test="SITEID!=null">
      SITEID=#{SITEID}
   </if> 
   <if test="NAVURL!=null">
      NAVURL=#{NAVURL}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="LINKTARGET!=null">
      LINKTARGET=#{LINKTARGET}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_cms_navigation_dto):ArrayList<app_act_cms_navigation_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "NAVSITEOWNERID", column = "NAVSITEOWNERID"),
   Result(property = "NAVNAME", column = "NAVNAME"),
   Result(property = "SITEID", column = "SITEID"),
   Result(property = "NAVURL", column = "NAVURL"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "LINKTARGET", column = "LINKTARGET")
)
@Select("""<script>
   SELECT * FROM app_act_cms_navigation
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_cms_navigation_dto):app_act_cms_navigation_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,NAVSITEOWNERID,NAVNAME,SITEID,NAVURL,CREATETIME,CREATEUSER,LINKTARGET)
    values
    (#{ID},#{NAVSITEOWNERID},#{NAVNAME},#{SITEID},#{NAVURL},#{CREATETIME},#{CREATEUSER},#{LINKTARGET})
</script>""")
fun insert(model:app_act_cms_navigation_dto):Unit
                

}

        


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
    insert into app_act_cms_navigation
    (ID,NAVSITEOWNERID,NAVNAME,SITEID,NAVURL,CREATETIME,CREATEUSER,LINKTARGET)
    values
    (#{ID},#{NAVSITEOWNERID},#{NAVNAME},#{SITEID},#{NAVURL},#{CREATETIME},#{CREATEUSER},#{LINKTARGET})
</script>""")
fun Insert(model:app_act_cms_navigation_dto):Unit
                


@Insert("""<script>
    insert into app_act_cms_navigation
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='NAVSITEOWNERID!= null'> 
           NAVSITEOWNERID,
        </if>
        <if test='NAVNAME!= null'> 
           NAVNAME,
        </if>
        <if test='SITEID!= null'> 
           SITEID,
        </if>
        <if test='NAVURL!= null'> 
           NAVURL,
        </if>
        <if test='CREATETIME!= null'> 
           CREATETIME,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='LINKTARGET!= null'> 
           LINKTARGET
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='NAVSITEOWNERID!= null'> 
           #{NAVSITEOWNERID,jdbcType=char}，
        </if>
        <if test='NAVNAME!= null'> 
           #{NAVNAME,jdbcType=varchar}，
        </if>
        <if test='SITEID!= null'> 
           #{SITEID,jdbcType=char}，
        </if>
        <if test='NAVURL!= null'> 
           #{NAVURL,jdbcType=varchar}，
        </if>
        <if test='CREATETIME!= null'> 
           #{CREATETIME,jdbcType=datetime}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='LINKTARGET!= null'> 
           #{LINKTARGET,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_cms_navigation_dto):Unit
                

}

        
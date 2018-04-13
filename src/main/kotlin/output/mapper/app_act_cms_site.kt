

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_cms_site{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SITENAME", column = "SITENAME"),
   Result(property = "SITEURL", column = "SITEURL"),
   Result(property = "SITEDESC", column = "SITEDESC"),
   Result(property = "SITESHOWBANNER", column = "SITESHOWBANNER"),
   Result(property = "SITEBANNERIMAGE", column = "SITEBANNERIMAGE"),
   Result(property = "USEFLAG", column = "USEFLAG"),
   Result(property = "SITETYPE", column = "SITETYPE"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "SHOWNAVFLAG", column = "SHOWNAVFLAG"),
   Result(property = "NAVFONTCOLOR", column = "NAVFONTCOLOR"),
   Result(property = "NAVBGCOLOR", column = "NAVBGCOLOR"),
   Result(property = "NAVHOVERFONTCOLOR", column = "NAVHOVERFONTCOLOR"),
   Result(property = "NAVHOVERBGCOLOR", column = "NAVHOVERBGCOLOR"),
   Result(property = "SITEBGIMAGE", column = "SITEBGIMAGE")
)
@Select("""<script>
   SELECT * FROM app_act_cms_site
</script>""")
fun GetListAll():ArrayList<app_act_cms_site_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SITENAME", column = "SITENAME"),
   Result(property = "SITEURL", column = "SITEURL"),
   Result(property = "SITEDESC", column = "SITEDESC"),
   Result(property = "SITESHOWBANNER", column = "SITESHOWBANNER"),
   Result(property = "SITEBANNERIMAGE", column = "SITEBANNERIMAGE"),
   Result(property = "USEFLAG", column = "USEFLAG"),
   Result(property = "SITETYPE", column = "SITETYPE"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "SHOWNAVFLAG", column = "SHOWNAVFLAG"),
   Result(property = "NAVFONTCOLOR", column = "NAVFONTCOLOR"),
   Result(property = "NAVBGCOLOR", column = "NAVBGCOLOR"),
   Result(property = "NAVHOVERFONTCOLOR", column = "NAVHOVERFONTCOLOR"),
   Result(property = "NAVHOVERBGCOLOR", column = "NAVHOVERBGCOLOR"),
   Result(property = "SITEBGIMAGE", column = "SITEBGIMAGE")
)
@Select("""<script>
   SELECT * FROM app_act_cms_site
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="SITENAME!=null">
      SITENAME=#{SITENAME}
   </if> 
   <if test="SITEURL!=null">
      SITEURL=#{SITEURL}
   </if> 
   <if test="SITEDESC!=null">
      SITEDESC=#{SITEDESC}
   </if> 
   <if test="SITESHOWBANNER!=null">
      SITESHOWBANNER=#{SITESHOWBANNER}
   </if> 
   <if test="SITEBANNERIMAGE!=null">
      SITEBANNERIMAGE=#{SITEBANNERIMAGE}
   </if> 
   <if test="USEFLAG!=null">
      USEFLAG=#{USEFLAG}
   </if> 
   <if test="SITETYPE!=null">
      SITETYPE=#{SITETYPE}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="SHOWNAVFLAG!=null">
      SHOWNAVFLAG=#{SHOWNAVFLAG}
   </if> 
   <if test="NAVFONTCOLOR!=null">
      NAVFONTCOLOR=#{NAVFONTCOLOR}
   </if> 
   <if test="NAVBGCOLOR!=null">
      NAVBGCOLOR=#{NAVBGCOLOR}
   </if> 
   <if test="NAVHOVERFONTCOLOR!=null">
      NAVHOVERFONTCOLOR=#{NAVHOVERFONTCOLOR}
   </if> 
   <if test="NAVHOVERBGCOLOR!=null">
      NAVHOVERBGCOLOR=#{NAVHOVERBGCOLOR}
   </if> 
   <if test="SITEBGIMAGE!=null">
      SITEBGIMAGE=#{SITEBGIMAGE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_cms_site_dto):ArrayList<app_act_cms_site_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SITENAME", column = "SITENAME"),
   Result(property = "SITEURL", column = "SITEURL"),
   Result(property = "SITEDESC", column = "SITEDESC"),
   Result(property = "SITESHOWBANNER", column = "SITESHOWBANNER"),
   Result(property = "SITEBANNERIMAGE", column = "SITEBANNERIMAGE"),
   Result(property = "USEFLAG", column = "USEFLAG"),
   Result(property = "SITETYPE", column = "SITETYPE"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "SHOWNAVFLAG", column = "SHOWNAVFLAG"),
   Result(property = "NAVFONTCOLOR", column = "NAVFONTCOLOR"),
   Result(property = "NAVBGCOLOR", column = "NAVBGCOLOR"),
   Result(property = "NAVHOVERFONTCOLOR", column = "NAVHOVERFONTCOLOR"),
   Result(property = "NAVHOVERBGCOLOR", column = "NAVHOVERBGCOLOR"),
   Result(property = "SITEBGIMAGE", column = "SITEBGIMAGE")
)
@Select("""<script>
   SELECT * FROM app_act_cms_site
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_cms_site_dto):app_act_cms_site_dto?
                


@Insert("""<script>
    insert into app_act_cms_site
    (ID,SITENAME,SITEURL,SITEDESC,SITESHOWBANNER,SITEBANNERIMAGE,USEFLAG,SITETYPE,CREATETIME,CREATEUSER,SHOWNAVFLAG,NAVFONTCOLOR,NAVBGCOLOR,NAVHOVERFONTCOLOR,NAVHOVERBGCOLOR,SITEBGIMAGE)
    values
    (#{ID},#{SITENAME},#{SITEURL},#{SITEDESC},#{SITESHOWBANNER},#{SITEBANNERIMAGE},#{USEFLAG},#{SITETYPE},#{CREATETIME},#{CREATEUSER},#{SHOWNAVFLAG},#{NAVFONTCOLOR},#{NAVBGCOLOR},#{NAVHOVERFONTCOLOR},#{NAVHOVERBGCOLOR},#{SITEBGIMAGE})
</script>""")
fun Insert(model:app_act_cms_site_dto):Unit
                


@Insert("""<script>
    insert into app_act_cms_site
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='SITENAME!= null'> 
           SITENAME,
        </if>
        <if test='SITEURL!= null'> 
           SITEURL,
        </if>
        <if test='SITEDESC!= null'> 
           SITEDESC,
        </if>
        <if test='SITESHOWBANNER!= null'> 
           SITESHOWBANNER,
        </if>
        <if test='SITEBANNERIMAGE!= null'> 
           SITEBANNERIMAGE,
        </if>
        <if test='USEFLAG!= null'> 
           USEFLAG,
        </if>
        <if test='SITETYPE!= null'> 
           SITETYPE,
        </if>
        <if test='CREATETIME!= null'> 
           CREATETIME,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='SHOWNAVFLAG!= null'> 
           SHOWNAVFLAG,
        </if>
        <if test='NAVFONTCOLOR!= null'> 
           NAVFONTCOLOR,
        </if>
        <if test='NAVBGCOLOR!= null'> 
           NAVBGCOLOR,
        </if>
        <if test='NAVHOVERFONTCOLOR!= null'> 
           NAVHOVERFONTCOLOR,
        </if>
        <if test='NAVHOVERBGCOLOR!= null'> 
           NAVHOVERBGCOLOR,
        </if>
        <if test='SITEBGIMAGE!= null'> 
           SITEBGIMAGE
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='SITENAME!= null'> 
           #{SITENAME,jdbcType=varchar}，
        </if>
        <if test='SITEURL!= null'> 
           #{SITEURL,jdbcType=varchar}，
        </if>
        <if test='SITEDESC!= null'> 
           #{SITEDESC,jdbcType=varchar}，
        </if>
        <if test='SITESHOWBANNER!= null'> 
           #{SITESHOWBANNER,jdbcType=char}，
        </if>
        <if test='SITEBANNERIMAGE!= null'> 
           #{SITEBANNERIMAGE,jdbcType=varchar}，
        </if>
        <if test='USEFLAG!= null'> 
           #{USEFLAG,jdbcType=char}，
        </if>
        <if test='SITETYPE!= null'> 
           #{SITETYPE,jdbcType=char}，
        </if>
        <if test='CREATETIME!= null'> 
           #{CREATETIME,jdbcType=datetime}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='SHOWNAVFLAG!= null'> 
           #{SHOWNAVFLAG,jdbcType=char}，
        </if>
        <if test='NAVFONTCOLOR!= null'> 
           #{NAVFONTCOLOR,jdbcType=varchar}，
        </if>
        <if test='NAVBGCOLOR!= null'> 
           #{NAVBGCOLOR,jdbcType=varchar}，
        </if>
        <if test='NAVHOVERFONTCOLOR!= null'> 
           #{NAVHOVERFONTCOLOR,jdbcType=varchar}，
        </if>
        <if test='NAVHOVERBGCOLOR!= null'> 
           #{NAVHOVERBGCOLOR,jdbcType=varchar}，
        </if>
        <if test='SITEBGIMAGE!= null'> 
           #{SITEBGIMAGE,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_cms_site_dto):Unit
                

}

        
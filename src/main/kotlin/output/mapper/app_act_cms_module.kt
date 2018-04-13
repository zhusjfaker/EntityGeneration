

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_cms_module{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "MODULENAME", column = "MODULENAME"),
   Result(property = "MODULETYPE", column = "MODULETYPE"),
   Result(property = "MODULEDESC", column = "MODULEDESC"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "SITEID", column = "SITEID"),
   Result(property = "USEFLAG", column = "USEFLAG"),
   Result(property = "MODULESORT", column = "MODULESORT"),
   Result(property = "PROCESSID", column = "PROCESSID"),
   Result(property = "QUICKADDUSERLIST", column = "QUICKADDUSERLIST"),
   Result(property = "PID", column = "PID"),
   Result(property = "CANVISTIOUTERNET", column = "CANVISTIOUTERNET"),
   Result(property = "CANUSEDEPUTY", column = "CANUSEDEPUTY"),
   Result(property = "NORMALFLAG", column = "NORMALFLAG"),
   Result(property = "CONTENTTYPE", column = "CONTENTTYPE"),
   Result(property = "TITLEPICTURE", column = "TITLEPICTURE"),
   Result(property = "SUBPAGE", column = "SUBPAGE"),
   Result(property = "DETAILPAGE", column = "DETAILPAGE"),
   Result(property = "MODULELINKURL", column = "MODULELINKURL"),
   Result(property = "LINKMODULEFLAG", column = "LINKMODULEFLAG"),
   Result(property = "NAVSHOWFLAG", column = "NAVSHOWFLAG"),
   Result(property = "SHOWTITLEPICFLAG", column = "SHOWTITLEPICFLAG")
)
@Select("""<script>
   SELECT * FROM app_act_cms_module
</script>""")
fun GetListAll():ArrayList<app_act_cms_module_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "MODULENAME", column = "MODULENAME"),
   Result(property = "MODULETYPE", column = "MODULETYPE"),
   Result(property = "MODULEDESC", column = "MODULEDESC"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "SITEID", column = "SITEID"),
   Result(property = "USEFLAG", column = "USEFLAG"),
   Result(property = "MODULESORT", column = "MODULESORT"),
   Result(property = "PROCESSID", column = "PROCESSID"),
   Result(property = "QUICKADDUSERLIST", column = "QUICKADDUSERLIST"),
   Result(property = "PID", column = "PID"),
   Result(property = "CANVISTIOUTERNET", column = "CANVISTIOUTERNET"),
   Result(property = "CANUSEDEPUTY", column = "CANUSEDEPUTY"),
   Result(property = "NORMALFLAG", column = "NORMALFLAG"),
   Result(property = "CONTENTTYPE", column = "CONTENTTYPE"),
   Result(property = "TITLEPICTURE", column = "TITLEPICTURE"),
   Result(property = "SUBPAGE", column = "SUBPAGE"),
   Result(property = "DETAILPAGE", column = "DETAILPAGE"),
   Result(property = "MODULELINKURL", column = "MODULELINKURL"),
   Result(property = "LINKMODULEFLAG", column = "LINKMODULEFLAG"),
   Result(property = "NAVSHOWFLAG", column = "NAVSHOWFLAG"),
   Result(property = "SHOWTITLEPICFLAG", column = "SHOWTITLEPICFLAG")
)
@Select("""<script>
   SELECT * FROM app_act_cms_module
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="MODULENAME!=null">
      MODULENAME=#{MODULENAME}
   </if> 
   <if test="MODULETYPE!=null">
      MODULETYPE=#{MODULETYPE}
   </if> 
   <if test="MODULEDESC!=null">
      MODULEDESC=#{MODULEDESC}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="SITEID!=null">
      SITEID=#{SITEID}
   </if> 
   <if test="USEFLAG!=null">
      USEFLAG=#{USEFLAG}
   </if> 
   <if test="MODULESORT!=null">
      MODULESORT=#{MODULESORT}
   </if> 
   <if test="PROCESSID!=null">
      PROCESSID=#{PROCESSID}
   </if> 
   <if test="QUICKADDUSERLIST!=null">
      QUICKADDUSERLIST=#{QUICKADDUSERLIST}
   </if> 
   <if test="PID!=null">
      PID=#{PID}
   </if> 
   <if test="CANVISTIOUTERNET!=null">
      CANVISTIOUTERNET=#{CANVISTIOUTERNET}
   </if> 
   <if test="CANUSEDEPUTY!=null">
      CANUSEDEPUTY=#{CANUSEDEPUTY}
   </if> 
   <if test="NORMALFLAG!=null">
      NORMALFLAG=#{NORMALFLAG}
   </if> 
   <if test="CONTENTTYPE!=null">
      CONTENTTYPE=#{CONTENTTYPE}
   </if> 
   <if test="TITLEPICTURE!=null">
      TITLEPICTURE=#{TITLEPICTURE}
   </if> 
   <if test="SUBPAGE!=null">
      SUBPAGE=#{SUBPAGE}
   </if> 
   <if test="DETAILPAGE!=null">
      DETAILPAGE=#{DETAILPAGE}
   </if> 
   <if test="MODULELINKURL!=null">
      MODULELINKURL=#{MODULELINKURL}
   </if> 
   <if test="LINKMODULEFLAG!=null">
      LINKMODULEFLAG=#{LINKMODULEFLAG}
   </if> 
   <if test="NAVSHOWFLAG!=null">
      NAVSHOWFLAG=#{NAVSHOWFLAG}
   </if> 
   <if test="SHOWTITLEPICFLAG!=null">
      SHOWTITLEPICFLAG=#{SHOWTITLEPICFLAG}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_cms_module_dto):ArrayList<app_act_cms_module_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "MODULENAME", column = "MODULENAME"),
   Result(property = "MODULETYPE", column = "MODULETYPE"),
   Result(property = "MODULEDESC", column = "MODULEDESC"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "SITEID", column = "SITEID"),
   Result(property = "USEFLAG", column = "USEFLAG"),
   Result(property = "MODULESORT", column = "MODULESORT"),
   Result(property = "PROCESSID", column = "PROCESSID"),
   Result(property = "QUICKADDUSERLIST", column = "QUICKADDUSERLIST"),
   Result(property = "PID", column = "PID"),
   Result(property = "CANVISTIOUTERNET", column = "CANVISTIOUTERNET"),
   Result(property = "CANUSEDEPUTY", column = "CANUSEDEPUTY"),
   Result(property = "NORMALFLAG", column = "NORMALFLAG"),
   Result(property = "CONTENTTYPE", column = "CONTENTTYPE"),
   Result(property = "TITLEPICTURE", column = "TITLEPICTURE"),
   Result(property = "SUBPAGE", column = "SUBPAGE"),
   Result(property = "DETAILPAGE", column = "DETAILPAGE"),
   Result(property = "MODULELINKURL", column = "MODULELINKURL"),
   Result(property = "LINKMODULEFLAG", column = "LINKMODULEFLAG"),
   Result(property = "NAVSHOWFLAG", column = "NAVSHOWFLAG"),
   Result(property = "SHOWTITLEPICFLAG", column = "SHOWTITLEPICFLAG")
)
@Select("""<script>
   SELECT * FROM app_act_cms_module
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_cms_module_dto):app_act_cms_module_dto?
                


@Insert("""<script>
    insert into app_act_cms_module
    (ID,MODULENAME,MODULETYPE,MODULEDESC,CREATEUSER,SITEID,USEFLAG,MODULESORT,PROCESSID,QUICKADDUSERLIST,PID,CANVISTIOUTERNET,CANUSEDEPUTY,NORMALFLAG,CONTENTTYPE,TITLEPICTURE,SUBPAGE,DETAILPAGE,MODULELINKURL,LINKMODULEFLAG,NAVSHOWFLAG,SHOWTITLEPICFLAG)
    values
    (#{ID},#{MODULENAME},#{MODULETYPE},#{MODULEDESC},#{CREATEUSER},#{SITEID},#{USEFLAG},#{MODULESORT},#{PROCESSID},#{QUICKADDUSERLIST},#{PID},#{CANVISTIOUTERNET},#{CANUSEDEPUTY},#{NORMALFLAG},#{CONTENTTYPE},#{TITLEPICTURE},#{SUBPAGE},#{DETAILPAGE},#{MODULELINKURL},#{LINKMODULEFLAG},#{NAVSHOWFLAG},#{SHOWTITLEPICFLAG})
</script>""")
fun Insert(model:app_act_cms_module_dto):Unit
                


@Insert("""<script>
    insert into app_act_cms_module
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='MODULENAME!= null'> 
           MODULENAME,
        </if>
        <if test='MODULETYPE!= null'> 
           MODULETYPE,
        </if>
        <if test='MODULEDESC!= null'> 
           MODULEDESC,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='SITEID!= null'> 
           SITEID,
        </if>
        <if test='USEFLAG!= null'> 
           USEFLAG,
        </if>
        <if test='MODULESORT!= null'> 
           MODULESORT,
        </if>
        <if test='PROCESSID!= null'> 
           PROCESSID,
        </if>
        <if test='QUICKADDUSERLIST!= null'> 
           QUICKADDUSERLIST,
        </if>
        <if test='PID!= null'> 
           PID,
        </if>
        <if test='CANVISTIOUTERNET!= null'> 
           CANVISTIOUTERNET,
        </if>
        <if test='CANUSEDEPUTY!= null'> 
           CANUSEDEPUTY,
        </if>
        <if test='NORMALFLAG!= null'> 
           NORMALFLAG,
        </if>
        <if test='CONTENTTYPE!= null'> 
           CONTENTTYPE,
        </if>
        <if test='TITLEPICTURE!= null'> 
           TITLEPICTURE,
        </if>
        <if test='SUBPAGE!= null'> 
           SUBPAGE,
        </if>
        <if test='DETAILPAGE!= null'> 
           DETAILPAGE,
        </if>
        <if test='MODULELINKURL!= null'> 
           MODULELINKURL,
        </if>
        <if test='LINKMODULEFLAG!= null'> 
           LINKMODULEFLAG,
        </if>
        <if test='NAVSHOWFLAG!= null'> 
           NAVSHOWFLAG,
        </if>
        <if test='SHOWTITLEPICFLAG!= null'> 
           SHOWTITLEPICFLAG
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='MODULENAME!= null'> 
           #{MODULENAME,jdbcType=varchar}，
        </if>
        <if test='MODULETYPE!= null'> 
           #{MODULETYPE,jdbcType=varchar}，
        </if>
        <if test='MODULEDESC!= null'> 
           #{MODULEDESC,jdbcType=varchar}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='SITEID!= null'> 
           #{SITEID,jdbcType=char}，
        </if>
        <if test='USEFLAG!= null'> 
           #{USEFLAG,jdbcType=char}，
        </if>
        <if test='MODULESORT!= null'> 
           #{MODULESORT,jdbcType=varchar}，
        </if>
        <if test='PROCESSID!= null'> 
           #{PROCESSID,jdbcType=char}，
        </if>
        <if test='QUICKADDUSERLIST!= null'> 
           #{QUICKADDUSERLIST,jdbcType=varchar}，
        </if>
        <if test='PID!= null'> 
           #{PID,jdbcType=varchar}，
        </if>
        <if test='CANVISTIOUTERNET!= null'> 
           #{CANVISTIOUTERNET,jdbcType=char}，
        </if>
        <if test='CANUSEDEPUTY!= null'> 
           #{CANUSEDEPUTY,jdbcType=char}，
        </if>
        <if test='NORMALFLAG!= null'> 
           #{NORMALFLAG,jdbcType=char}，
        </if>
        <if test='CONTENTTYPE!= null'> 
           #{CONTENTTYPE,jdbcType=char}，
        </if>
        <if test='TITLEPICTURE!= null'> 
           #{TITLEPICTURE,jdbcType=varchar}，
        </if>
        <if test='SUBPAGE!= null'> 
           #{SUBPAGE,jdbcType=varchar}，
        </if>
        <if test='DETAILPAGE!= null'> 
           #{DETAILPAGE,jdbcType=varchar}，
        </if>
        <if test='MODULELINKURL!= null'> 
           #{MODULELINKURL,jdbcType=varchar}，
        </if>
        <if test='LINKMODULEFLAG!= null'> 
           #{LINKMODULEFLAG,jdbcType=char}，
        </if>
        <if test='NAVSHOWFLAG!= null'> 
           #{NAVSHOWFLAG,jdbcType=char}，
        </if>
        <if test='SHOWTITLEPICFLAG!= null'> 
           #{SHOWTITLEPICFLAG,jdbcType=char}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_cms_module_dto):Unit
                

}

        
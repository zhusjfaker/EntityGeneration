

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
    insert into TStudent
    (ID,MODULENAME,MODULETYPE,MODULEDESC,CREATEUSER,SITEID,USEFLAG,MODULESORT,PROCESSID,QUICKADDUSERLIST,PID,CANVISTIOUTERNET,CANUSEDEPUTY,NORMALFLAG,CONTENTTYPE,TITLEPICTURE,SUBPAGE,DETAILPAGE,MODULELINKURL,LINKMODULEFLAG,NAVSHOWFLAG,SHOWTITLEPICFLAG)
    values
    (#{ID},#{MODULENAME},#{MODULETYPE},#{MODULEDESC},#{CREATEUSER},#{SITEID},#{USEFLAG},#{MODULESORT},#{PROCESSID},#{QUICKADDUSERLIST},#{PID},#{CANVISTIOUTERNET},#{CANUSEDEPUTY},#{NORMALFLAG},#{CONTENTTYPE},#{TITLEPICTURE},#{SUBPAGE},#{DETAILPAGE},#{MODULELINKURL},#{LINKMODULEFLAG},#{NAVSHOWFLAG},#{SHOWTITLEPICFLAG})
</script>""")
fun insert(model:app_act_cms_module_dto):Unit
                

}

        
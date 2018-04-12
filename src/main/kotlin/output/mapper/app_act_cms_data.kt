

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_cms_data{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "MODULEID", column = "MODULEID"),
   Result(property = "MSGTITLE", column = "MSGTITLE"),
   Result(property = "BOLDFLAG", column = "BOLDFLAG"),
   Result(property = "TITLECOLOR", column = "TITLECOLOR"),
   Result(property = "MSGTITLEPIC", column = "MSGTITLEPIC"),
   Result(property = "MSGSUMMARY", column = "MSGSUMMARY"),
   Result(property = "MSGCONTENT", column = "MSGCONTENT"),
   Result(property = "MSGTYPE", column = "MSGTYPE"),
   Result(property = "MSGSOURCE", column = "MSGSOURCE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "UPDATEUSER", column = "UPDATEUSER"),
   Result(property = "UPDATETIME", column = "UPDATETIME"),
   Result(property = "READFLAG", column = "READFLAG"),
   Result(property = "READNUM", column = "READNUM"),
   Result(property = "REPLYFLAG", column = "REPLYFLAG"),
   Result(property = "REPLYNUM", column = "REPLYNUM"),
   Result(property = "COPYFLAG", column = "COPYFLAG"),
   Result(property = "ZDFLAG", column = "ZDFLAG"),
   Result(property = "ZDFLAGNOW", column = "ZDFLAGNOW"),
   Result(property = "ZDBEGINTIME", column = "ZDBEGINTIME"),
   Result(property = "ZDENDTIME", column = "ZDENDTIME"),
   Result(property = "ISCLOSE", column = "ISCLOSE"),
   Result(property = "ATTACHMENTNAME", column = "ATTACHMENTNAME"),
   Result(property = "OUTERURL", column = "OUTERURL"),
   Result(property = "PIID", column = "PIID"),
   Result(property = "BOID", column = "BOID"),
   Result(property = "READSCOPEDESC", column = "READSCOPEDESC"),
   Result(property = "GJC", column = "GJC"),
   Result(property = "PLATFORMFLAG", column = "PLATFORMFLAG"),
   Result(property = "SUBMODULE", column = "SUBMODULE"),
   Result(property = "SUBTITLE", column = "SUBTITLE"),
   Result(property = "OVERLINE", column = "OVERLINE"),
   Result(property = "AUTHOR", column = "AUTHOR"),
   Result(property = "PHOTOGRAPHER", column = "PHOTOGRAPHER"),
   Result(property = "FILENAME", column = "FILENAME"),
   Result(property = "FILEDESC", column = "FILEDESC"),
   Result(property = "VIDEOFILE", column = "VIDEOFILE"),
   Result(property = "DELETEFLAG", column = "DELETEFLAG"),
   Result(property = "RELEASEDEPARTMENT", column = "RELEASEDEPARTMENT"),
   Result(property = "RELEASETIME", column = "RELEASETIME"),
   Result(property = "SORTTIME", column = "SORTTIME"),
   Result(property = "PLATFORMPIID", column = "PLATFORMPIID"),
   Result(property = "WORDCOUNT", column = "WORDCOUNT"),
   Result(property = "RECOMMENDFLAG", column = "RECOMMENDFLAG"),
   Result(property = "USEOUTERURL", column = "USEOUTERURL")
)
@Select("""<script>
   SELECT * FROM app_act_cms_data
</script>""")
fun GetListAll():ArrayList<app_act_cms_data_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "MODULEID", column = "MODULEID"),
   Result(property = "MSGTITLE", column = "MSGTITLE"),
   Result(property = "BOLDFLAG", column = "BOLDFLAG"),
   Result(property = "TITLECOLOR", column = "TITLECOLOR"),
   Result(property = "MSGTITLEPIC", column = "MSGTITLEPIC"),
   Result(property = "MSGSUMMARY", column = "MSGSUMMARY"),
   Result(property = "MSGCONTENT", column = "MSGCONTENT"),
   Result(property = "MSGTYPE", column = "MSGTYPE"),
   Result(property = "MSGSOURCE", column = "MSGSOURCE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "UPDATEUSER", column = "UPDATEUSER"),
   Result(property = "UPDATETIME", column = "UPDATETIME"),
   Result(property = "READFLAG", column = "READFLAG"),
   Result(property = "READNUM", column = "READNUM"),
   Result(property = "REPLYFLAG", column = "REPLYFLAG"),
   Result(property = "REPLYNUM", column = "REPLYNUM"),
   Result(property = "COPYFLAG", column = "COPYFLAG"),
   Result(property = "ZDFLAG", column = "ZDFLAG"),
   Result(property = "ZDFLAGNOW", column = "ZDFLAGNOW"),
   Result(property = "ZDBEGINTIME", column = "ZDBEGINTIME"),
   Result(property = "ZDENDTIME", column = "ZDENDTIME"),
   Result(property = "ISCLOSE", column = "ISCLOSE"),
   Result(property = "ATTACHMENTNAME", column = "ATTACHMENTNAME"),
   Result(property = "OUTERURL", column = "OUTERURL"),
   Result(property = "PIID", column = "PIID"),
   Result(property = "BOID", column = "BOID"),
   Result(property = "READSCOPEDESC", column = "READSCOPEDESC"),
   Result(property = "GJC", column = "GJC"),
   Result(property = "PLATFORMFLAG", column = "PLATFORMFLAG"),
   Result(property = "SUBMODULE", column = "SUBMODULE"),
   Result(property = "SUBTITLE", column = "SUBTITLE"),
   Result(property = "OVERLINE", column = "OVERLINE"),
   Result(property = "AUTHOR", column = "AUTHOR"),
   Result(property = "PHOTOGRAPHER", column = "PHOTOGRAPHER"),
   Result(property = "FILENAME", column = "FILENAME"),
   Result(property = "FILEDESC", column = "FILEDESC"),
   Result(property = "VIDEOFILE", column = "VIDEOFILE"),
   Result(property = "DELETEFLAG", column = "DELETEFLAG"),
   Result(property = "RELEASEDEPARTMENT", column = "RELEASEDEPARTMENT"),
   Result(property = "RELEASETIME", column = "RELEASETIME"),
   Result(property = "SORTTIME", column = "SORTTIME"),
   Result(property = "PLATFORMPIID", column = "PLATFORMPIID"),
   Result(property = "WORDCOUNT", column = "WORDCOUNT"),
   Result(property = "RECOMMENDFLAG", column = "RECOMMENDFLAG"),
   Result(property = "USEOUTERURL", column = "USEOUTERURL")
)
@Select("""<script>
   SELECT * FROM app_act_cms_data
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="MODULEID!=null">
      MODULEID=#{MODULEID}
   </if> 
   <if test="MSGTITLE!=null">
      MSGTITLE=#{MSGTITLE}
   </if> 
   <if test="BOLDFLAG!=null">
      BOLDFLAG=#{BOLDFLAG}
   </if> 
   <if test="TITLECOLOR!=null">
      TITLECOLOR=#{TITLECOLOR}
   </if> 
   <if test="MSGTITLEPIC!=null">
      MSGTITLEPIC=#{MSGTITLEPIC}
   </if> 
   <if test="MSGSUMMARY!=null">
      MSGSUMMARY=#{MSGSUMMARY}
   </if> 
   <if test="MSGCONTENT!=null">
      MSGCONTENT=#{MSGCONTENT}
   </if> 
   <if test="MSGTYPE!=null">
      MSGTYPE=#{MSGTYPE}
   </if> 
   <if test="MSGSOURCE!=null">
      MSGSOURCE=#{MSGSOURCE}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   <if test="UPDATEUSER!=null">
      UPDATEUSER=#{UPDATEUSER}
   </if> 
   <if test="UPDATETIME!=null">
      UPDATETIME=#{UPDATETIME}
   </if> 
   <if test="READFLAG!=null">
      READFLAG=#{READFLAG}
   </if> 
   <if test="READNUM!=null">
      READNUM=#{READNUM}
   </if> 
   <if test="REPLYFLAG!=null">
      REPLYFLAG=#{REPLYFLAG}
   </if> 
   <if test="REPLYNUM!=null">
      REPLYNUM=#{REPLYNUM}
   </if> 
   <if test="COPYFLAG!=null">
      COPYFLAG=#{COPYFLAG}
   </if> 
   <if test="ZDFLAG!=null">
      ZDFLAG=#{ZDFLAG}
   </if> 
   <if test="ZDFLAGNOW!=null">
      ZDFLAGNOW=#{ZDFLAGNOW}
   </if> 
   <if test="ZDBEGINTIME!=null">
      ZDBEGINTIME=#{ZDBEGINTIME}
   </if> 
   <if test="ZDENDTIME!=null">
      ZDENDTIME=#{ZDENDTIME}
   </if> 
   <if test="ISCLOSE!=null">
      ISCLOSE=#{ISCLOSE}
   </if> 
   <if test="ATTACHMENTNAME!=null">
      ATTACHMENTNAME=#{ATTACHMENTNAME}
   </if> 
   <if test="OUTERURL!=null">
      OUTERURL=#{OUTERURL}
   </if> 
   <if test="PIID!=null">
      PIID=#{PIID}
   </if> 
   <if test="BOID!=null">
      BOID=#{BOID}
   </if> 
   <if test="READSCOPEDESC!=null">
      READSCOPEDESC=#{READSCOPEDESC}
   </if> 
   <if test="GJC!=null">
      GJC=#{GJC}
   </if> 
   <if test="PLATFORMFLAG!=null">
      PLATFORMFLAG=#{PLATFORMFLAG}
   </if> 
   <if test="SUBMODULE!=null">
      SUBMODULE=#{SUBMODULE}
   </if> 
   <if test="SUBTITLE!=null">
      SUBTITLE=#{SUBTITLE}
   </if> 
   <if test="OVERLINE!=null">
      OVERLINE=#{OVERLINE}
   </if> 
   <if test="AUTHOR!=null">
      AUTHOR=#{AUTHOR}
   </if> 
   <if test="PHOTOGRAPHER!=null">
      PHOTOGRAPHER=#{PHOTOGRAPHER}
   </if> 
   <if test="FILENAME!=null">
      FILENAME=#{FILENAME}
   </if> 
   <if test="FILEDESC!=null">
      FILEDESC=#{FILEDESC}
   </if> 
   <if test="VIDEOFILE!=null">
      VIDEOFILE=#{VIDEOFILE}
   </if> 
   <if test="DELETEFLAG!=null">
      DELETEFLAG=#{DELETEFLAG}
   </if> 
   <if test="RELEASEDEPARTMENT!=null">
      RELEASEDEPARTMENT=#{RELEASEDEPARTMENT}
   </if> 
   <if test="RELEASETIME!=null">
      RELEASETIME=#{RELEASETIME}
   </if> 
   <if test="SORTTIME!=null">
      SORTTIME=#{SORTTIME}
   </if> 
   <if test="PLATFORMPIID!=null">
      PLATFORMPIID=#{PLATFORMPIID}
   </if> 
   <if test="WORDCOUNT!=null">
      WORDCOUNT=#{WORDCOUNT}
   </if> 
   <if test="RECOMMENDFLAG!=null">
      RECOMMENDFLAG=#{RECOMMENDFLAG}
   </if> 
   <if test="USEOUTERURL!=null">
      USEOUTERURL=#{USEOUTERURL}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_cms_data_dto):ArrayList<app_act_cms_data_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "MODULEID", column = "MODULEID"),
   Result(property = "MSGTITLE", column = "MSGTITLE"),
   Result(property = "BOLDFLAG", column = "BOLDFLAG"),
   Result(property = "TITLECOLOR", column = "TITLECOLOR"),
   Result(property = "MSGTITLEPIC", column = "MSGTITLEPIC"),
   Result(property = "MSGSUMMARY", column = "MSGSUMMARY"),
   Result(property = "MSGCONTENT", column = "MSGCONTENT"),
   Result(property = "MSGTYPE", column = "MSGTYPE"),
   Result(property = "MSGSOURCE", column = "MSGSOURCE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "UPDATEUSER", column = "UPDATEUSER"),
   Result(property = "UPDATETIME", column = "UPDATETIME"),
   Result(property = "READFLAG", column = "READFLAG"),
   Result(property = "READNUM", column = "READNUM"),
   Result(property = "REPLYFLAG", column = "REPLYFLAG"),
   Result(property = "REPLYNUM", column = "REPLYNUM"),
   Result(property = "COPYFLAG", column = "COPYFLAG"),
   Result(property = "ZDFLAG", column = "ZDFLAG"),
   Result(property = "ZDFLAGNOW", column = "ZDFLAGNOW"),
   Result(property = "ZDBEGINTIME", column = "ZDBEGINTIME"),
   Result(property = "ZDENDTIME", column = "ZDENDTIME"),
   Result(property = "ISCLOSE", column = "ISCLOSE"),
   Result(property = "ATTACHMENTNAME", column = "ATTACHMENTNAME"),
   Result(property = "OUTERURL", column = "OUTERURL"),
   Result(property = "PIID", column = "PIID"),
   Result(property = "BOID", column = "BOID"),
   Result(property = "READSCOPEDESC", column = "READSCOPEDESC"),
   Result(property = "GJC", column = "GJC"),
   Result(property = "PLATFORMFLAG", column = "PLATFORMFLAG"),
   Result(property = "SUBMODULE", column = "SUBMODULE"),
   Result(property = "SUBTITLE", column = "SUBTITLE"),
   Result(property = "OVERLINE", column = "OVERLINE"),
   Result(property = "AUTHOR", column = "AUTHOR"),
   Result(property = "PHOTOGRAPHER", column = "PHOTOGRAPHER"),
   Result(property = "FILENAME", column = "FILENAME"),
   Result(property = "FILEDESC", column = "FILEDESC"),
   Result(property = "VIDEOFILE", column = "VIDEOFILE"),
   Result(property = "DELETEFLAG", column = "DELETEFLAG"),
   Result(property = "RELEASEDEPARTMENT", column = "RELEASEDEPARTMENT"),
   Result(property = "RELEASETIME", column = "RELEASETIME"),
   Result(property = "SORTTIME", column = "SORTTIME"),
   Result(property = "PLATFORMPIID", column = "PLATFORMPIID"),
   Result(property = "WORDCOUNT", column = "WORDCOUNT"),
   Result(property = "RECOMMENDFLAG", column = "RECOMMENDFLAG"),
   Result(property = "USEOUTERURL", column = "USEOUTERURL")
)
@Select("""<script>
   SELECT * FROM app_act_cms_data
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_cms_data_dto):app_act_cms_data_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,MODULEID,MSGTITLE,BOLDFLAG,TITLECOLOR,MSGTITLEPIC,MSGSUMMARY,MSGCONTENT,MSGTYPE,MSGSOURCE,CREATEUSER,CREATETIME,UPDATEUSER,UPDATETIME,READFLAG,READNUM,REPLYFLAG,REPLYNUM,COPYFLAG,ZDFLAG,ZDFLAGNOW,ZDBEGINTIME,ZDENDTIME,ISCLOSE,ATTACHMENTNAME,OUTERURL,PIID,BOID,READSCOPEDESC,GJC,PLATFORMFLAG,SUBMODULE,SUBTITLE,OVERLINE,AUTHOR,PHOTOGRAPHER,FILENAME,FILEDESC,VIDEOFILE,DELETEFLAG,RELEASEDEPARTMENT,RELEASETIME,SORTTIME,PLATFORMPIID,WORDCOUNT,RECOMMENDFLAG,USEOUTERURL)
    values
    (#{ID},#{MODULEID},#{MSGTITLE},#{BOLDFLAG},#{TITLECOLOR},#{MSGTITLEPIC},#{MSGSUMMARY},#{MSGCONTENT},#{MSGTYPE},#{MSGSOURCE},#{CREATEUSER},#{CREATETIME},#{UPDATEUSER},#{UPDATETIME},#{READFLAG},#{READNUM},#{REPLYFLAG},#{REPLYNUM},#{COPYFLAG},#{ZDFLAG},#{ZDFLAGNOW},#{ZDBEGINTIME},#{ZDENDTIME},#{ISCLOSE},#{ATTACHMENTNAME},#{OUTERURL},#{PIID},#{BOID},#{READSCOPEDESC},#{GJC},#{PLATFORMFLAG},#{SUBMODULE},#{SUBTITLE},#{OVERLINE},#{AUTHOR},#{PHOTOGRAPHER},#{FILENAME},#{FILEDESC},#{VIDEOFILE},#{DELETEFLAG},#{RELEASEDEPARTMENT},#{RELEASETIME},#{SORTTIME},#{PLATFORMPIID},#{WORDCOUNT},#{RECOMMENDFLAG},#{USEOUTERURL})
</script>""")
fun insert(model:app_act_cms_data_dto):Unit
                

}

        
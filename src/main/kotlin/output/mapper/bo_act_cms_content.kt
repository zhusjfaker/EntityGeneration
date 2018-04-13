

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_act_cms_content{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ORGID", column = "ORGID"),
   Result(property = "BINDID", column = "BINDID"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE"),
   Result(property = "UPDATEUSER", column = "UPDATEUSER"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ISEND", column = "ISEND"),
   Result(property = "MSGTYPE", column = "MSGTYPE"),
   Result(property = "TITLE", column = "TITLE"),
   Result(property = "TITLECOLOR", column = "TITLECOLOR"),
   Result(property = "BOLDFLAG", column = "BOLDFLAG"),
   Result(property = "SUMMARY", column = "SUMMARY"),
   Result(property = "TITLEPIC", column = "TITLEPIC"),
   Result(property = "CONTENT", column = "CONTENT"),
   Result(property = "USEOUTERURL", column = "USEOUTERURL"),
   Result(property = "OUTURL", column = "OUTURL"),
   Result(property = "PICTURELIST", column = "PICTURELIST"),
   Result(property = "ATTACHMENT", column = "ATTACHMENT"),
   Result(property = "ZDFLAG", column = "ZDFLAG"),
   Result(property = "ZDENDTIME", column = "ZDENDTIME"),
   Result(property = "ZDBEGINTIME", column = "ZDBEGINTIME"),
   Result(property = "COPYFLAG", column = "COPYFLAG"),
   Result(property = "REPLYFLAG", column = "REPLYFLAG"),
   Result(property = "ISCLOSE", column = "ISCLOSE"),
   Result(property = "READFLAG", column = "READFLAG"),
   Result(property = "MODULEID", column = "MODULEID"),
   Result(property = "RELEASEDEPARTMENT", column = "RELEASEDEPARTMENT"),
   Result(property = "SOURCE", column = "SOURCE"),
   Result(property = "MESSAGEID", column = "MESSAGEID"),
   Result(property = "READSCOPE", column = "READSCOPE"),
   Result(property = "READSCOPEDESC", column = "READSCOPEDESC"),
   Result(property = "RELEASETIME", column = "RELEASETIME"),
   Result(property = "READNUM", column = "READNUM"),
   Result(property = "REPLYNUM", column = "REPLYNUM"),
   Result(property = "SUBMODULE", column = "SUBMODULE"),
   Result(property = "SUBTITLE", column = "SUBTITLE"),
   Result(property = "OVERLINE", column = "OVERLINE"),
   Result(property = "GJC", column = "GJC"),
   Result(property = "AUTHOR", column = "AUTHOR"),
   Result(property = "PHOTOGRAPHER", column = "PHOTOGRAPHER"),
   Result(property = "FILENAME", column = "FILENAME"),
   Result(property = "FILEPARAMS", column = "FILEPARAMS"),
   Result(property = "FILEDESC", column = "FILEDESC"),
   Result(property = "VIDEOFILE", column = "VIDEOFILE"),
   Result(property = "PLATFORM", column = "PLATFORM"),
   Result(property = "PLATFORMBINDID", column = "PLATFORMBINDID"),
   Result(property = "WORDCOUNT", column = "WORDCOUNT"),
   Result(property = "RECOMMENDFLAG", column = "RECOMMENDFLAG"),
   Result(property = "SORTTIME", column = "SORTTIME"),
   Result(property = "DELETEFLAG", column = "DELETEFLAG"),
   Result(property = "CANCHOOSEFLAG", column = "CANCHOOSEFLAG")
)
@Select("""<script>
   SELECT * FROM bo_act_cms_content
</script>""")
fun GetListAll():ArrayList<bo_act_cms_content_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ORGID", column = "ORGID"),
   Result(property = "BINDID", column = "BINDID"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE"),
   Result(property = "UPDATEUSER", column = "UPDATEUSER"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ISEND", column = "ISEND"),
   Result(property = "MSGTYPE", column = "MSGTYPE"),
   Result(property = "TITLE", column = "TITLE"),
   Result(property = "TITLECOLOR", column = "TITLECOLOR"),
   Result(property = "BOLDFLAG", column = "BOLDFLAG"),
   Result(property = "SUMMARY", column = "SUMMARY"),
   Result(property = "TITLEPIC", column = "TITLEPIC"),
   Result(property = "CONTENT", column = "CONTENT"),
   Result(property = "USEOUTERURL", column = "USEOUTERURL"),
   Result(property = "OUTURL", column = "OUTURL"),
   Result(property = "PICTURELIST", column = "PICTURELIST"),
   Result(property = "ATTACHMENT", column = "ATTACHMENT"),
   Result(property = "ZDFLAG", column = "ZDFLAG"),
   Result(property = "ZDENDTIME", column = "ZDENDTIME"),
   Result(property = "ZDBEGINTIME", column = "ZDBEGINTIME"),
   Result(property = "COPYFLAG", column = "COPYFLAG"),
   Result(property = "REPLYFLAG", column = "REPLYFLAG"),
   Result(property = "ISCLOSE", column = "ISCLOSE"),
   Result(property = "READFLAG", column = "READFLAG"),
   Result(property = "MODULEID", column = "MODULEID"),
   Result(property = "RELEASEDEPARTMENT", column = "RELEASEDEPARTMENT"),
   Result(property = "SOURCE", column = "SOURCE"),
   Result(property = "MESSAGEID", column = "MESSAGEID"),
   Result(property = "READSCOPE", column = "READSCOPE"),
   Result(property = "READSCOPEDESC", column = "READSCOPEDESC"),
   Result(property = "RELEASETIME", column = "RELEASETIME"),
   Result(property = "READNUM", column = "READNUM"),
   Result(property = "REPLYNUM", column = "REPLYNUM"),
   Result(property = "SUBMODULE", column = "SUBMODULE"),
   Result(property = "SUBTITLE", column = "SUBTITLE"),
   Result(property = "OVERLINE", column = "OVERLINE"),
   Result(property = "GJC", column = "GJC"),
   Result(property = "AUTHOR", column = "AUTHOR"),
   Result(property = "PHOTOGRAPHER", column = "PHOTOGRAPHER"),
   Result(property = "FILENAME", column = "FILENAME"),
   Result(property = "FILEPARAMS", column = "FILEPARAMS"),
   Result(property = "FILEDESC", column = "FILEDESC"),
   Result(property = "VIDEOFILE", column = "VIDEOFILE"),
   Result(property = "PLATFORM", column = "PLATFORM"),
   Result(property = "PLATFORMBINDID", column = "PLATFORMBINDID"),
   Result(property = "WORDCOUNT", column = "WORDCOUNT"),
   Result(property = "RECOMMENDFLAG", column = "RECOMMENDFLAG"),
   Result(property = "SORTTIME", column = "SORTTIME"),
   Result(property = "DELETEFLAG", column = "DELETEFLAG"),
   Result(property = "CANCHOOSEFLAG", column = "CANCHOOSEFLAG")
)
@Select("""<script>
   SELECT * FROM bo_act_cms_content
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="ORGID!=null">
      ORGID=#{ORGID}
   </if> 
   <if test="BINDID!=null">
      BINDID=#{BINDID}
   </if> 
   <if test="CREATEDATE!=null">
      CREATEDATE=#{CREATEDATE}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="UPDATEDATE!=null">
      UPDATEDATE=#{UPDATEDATE}
   </if> 
   <if test="UPDATEUSER!=null">
      UPDATEUSER=#{UPDATEUSER}
   </if> 
   <if test="PROCESSDEFID!=null">
      PROCESSDEFID=#{PROCESSDEFID}
   </if> 
   <if test="ISEND!=null">
      ISEND=#{ISEND}
   </if> 
   <if test="MSGTYPE!=null">
      MSGTYPE=#{MSGTYPE}
   </if> 
   <if test="TITLE!=null">
      TITLE=#{TITLE}
   </if> 
   <if test="TITLECOLOR!=null">
      TITLECOLOR=#{TITLECOLOR}
   </if> 
   <if test="BOLDFLAG!=null">
      BOLDFLAG=#{BOLDFLAG}
   </if> 
   <if test="SUMMARY!=null">
      SUMMARY=#{SUMMARY}
   </if> 
   <if test="TITLEPIC!=null">
      TITLEPIC=#{TITLEPIC}
   </if> 
   <if test="CONTENT!=null">
      CONTENT=#{CONTENT}
   </if> 
   <if test="USEOUTERURL!=null">
      USEOUTERURL=#{USEOUTERURL}
   </if> 
   <if test="OUTURL!=null">
      OUTURL=#{OUTURL}
   </if> 
   <if test="PICTURELIST!=null">
      PICTURELIST=#{PICTURELIST}
   </if> 
   <if test="ATTACHMENT!=null">
      ATTACHMENT=#{ATTACHMENT}
   </if> 
   <if test="ZDFLAG!=null">
      ZDFLAG=#{ZDFLAG}
   </if> 
   <if test="ZDENDTIME!=null">
      ZDENDTIME=#{ZDENDTIME}
   </if> 
   <if test="ZDBEGINTIME!=null">
      ZDBEGINTIME=#{ZDBEGINTIME}
   </if> 
   <if test="COPYFLAG!=null">
      COPYFLAG=#{COPYFLAG}
   </if> 
   <if test="REPLYFLAG!=null">
      REPLYFLAG=#{REPLYFLAG}
   </if> 
   <if test="ISCLOSE!=null">
      ISCLOSE=#{ISCLOSE}
   </if> 
   <if test="READFLAG!=null">
      READFLAG=#{READFLAG}
   </if> 
   <if test="MODULEID!=null">
      MODULEID=#{MODULEID}
   </if> 
   <if test="RELEASEDEPARTMENT!=null">
      RELEASEDEPARTMENT=#{RELEASEDEPARTMENT}
   </if> 
   <if test="SOURCE!=null">
      SOURCE=#{SOURCE}
   </if> 
   <if test="MESSAGEID!=null">
      MESSAGEID=#{MESSAGEID}
   </if> 
   <if test="READSCOPE!=null">
      READSCOPE=#{READSCOPE}
   </if> 
   <if test="READSCOPEDESC!=null">
      READSCOPEDESC=#{READSCOPEDESC}
   </if> 
   <if test="RELEASETIME!=null">
      RELEASETIME=#{RELEASETIME}
   </if> 
   <if test="READNUM!=null">
      READNUM=#{READNUM}
   </if> 
   <if test="REPLYNUM!=null">
      REPLYNUM=#{REPLYNUM}
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
   <if test="GJC!=null">
      GJC=#{GJC}
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
   <if test="FILEPARAMS!=null">
      FILEPARAMS=#{FILEPARAMS}
   </if> 
   <if test="FILEDESC!=null">
      FILEDESC=#{FILEDESC}
   </if> 
   <if test="VIDEOFILE!=null">
      VIDEOFILE=#{VIDEOFILE}
   </if> 
   <if test="PLATFORM!=null">
      PLATFORM=#{PLATFORM}
   </if> 
   <if test="PLATFORMBINDID!=null">
      PLATFORMBINDID=#{PLATFORMBINDID}
   </if> 
   <if test="WORDCOUNT!=null">
      WORDCOUNT=#{WORDCOUNT}
   </if> 
   <if test="RECOMMENDFLAG!=null">
      RECOMMENDFLAG=#{RECOMMENDFLAG}
   </if> 
   <if test="SORTTIME!=null">
      SORTTIME=#{SORTTIME}
   </if> 
   <if test="DELETEFLAG!=null">
      DELETEFLAG=#{DELETEFLAG}
   </if> 
   <if test="CANCHOOSEFLAG!=null">
      CANCHOOSEFLAG=#{CANCHOOSEFLAG}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:bo_act_cms_content_dto):ArrayList<bo_act_cms_content_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ORGID", column = "ORGID"),
   Result(property = "BINDID", column = "BINDID"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE"),
   Result(property = "UPDATEUSER", column = "UPDATEUSER"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ISEND", column = "ISEND"),
   Result(property = "MSGTYPE", column = "MSGTYPE"),
   Result(property = "TITLE", column = "TITLE"),
   Result(property = "TITLECOLOR", column = "TITLECOLOR"),
   Result(property = "BOLDFLAG", column = "BOLDFLAG"),
   Result(property = "SUMMARY", column = "SUMMARY"),
   Result(property = "TITLEPIC", column = "TITLEPIC"),
   Result(property = "CONTENT", column = "CONTENT"),
   Result(property = "USEOUTERURL", column = "USEOUTERURL"),
   Result(property = "OUTURL", column = "OUTURL"),
   Result(property = "PICTURELIST", column = "PICTURELIST"),
   Result(property = "ATTACHMENT", column = "ATTACHMENT"),
   Result(property = "ZDFLAG", column = "ZDFLAG"),
   Result(property = "ZDENDTIME", column = "ZDENDTIME"),
   Result(property = "ZDBEGINTIME", column = "ZDBEGINTIME"),
   Result(property = "COPYFLAG", column = "COPYFLAG"),
   Result(property = "REPLYFLAG", column = "REPLYFLAG"),
   Result(property = "ISCLOSE", column = "ISCLOSE"),
   Result(property = "READFLAG", column = "READFLAG"),
   Result(property = "MODULEID", column = "MODULEID"),
   Result(property = "RELEASEDEPARTMENT", column = "RELEASEDEPARTMENT"),
   Result(property = "SOURCE", column = "SOURCE"),
   Result(property = "MESSAGEID", column = "MESSAGEID"),
   Result(property = "READSCOPE", column = "READSCOPE"),
   Result(property = "READSCOPEDESC", column = "READSCOPEDESC"),
   Result(property = "RELEASETIME", column = "RELEASETIME"),
   Result(property = "READNUM", column = "READNUM"),
   Result(property = "REPLYNUM", column = "REPLYNUM"),
   Result(property = "SUBMODULE", column = "SUBMODULE"),
   Result(property = "SUBTITLE", column = "SUBTITLE"),
   Result(property = "OVERLINE", column = "OVERLINE"),
   Result(property = "GJC", column = "GJC"),
   Result(property = "AUTHOR", column = "AUTHOR"),
   Result(property = "PHOTOGRAPHER", column = "PHOTOGRAPHER"),
   Result(property = "FILENAME", column = "FILENAME"),
   Result(property = "FILEPARAMS", column = "FILEPARAMS"),
   Result(property = "FILEDESC", column = "FILEDESC"),
   Result(property = "VIDEOFILE", column = "VIDEOFILE"),
   Result(property = "PLATFORM", column = "PLATFORM"),
   Result(property = "PLATFORMBINDID", column = "PLATFORMBINDID"),
   Result(property = "WORDCOUNT", column = "WORDCOUNT"),
   Result(property = "RECOMMENDFLAG", column = "RECOMMENDFLAG"),
   Result(property = "SORTTIME", column = "SORTTIME"),
   Result(property = "DELETEFLAG", column = "DELETEFLAG"),
   Result(property = "CANCHOOSEFLAG", column = "CANCHOOSEFLAG")
)
@Select("""<script>
   SELECT * FROM bo_act_cms_content
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:bo_act_cms_content_dto):bo_act_cms_content_dto?
                


@Insert("""<script>
    insert into bo_act_cms_content
    (ID,ORGID,BINDID,CREATEDATE,CREATEUSER,UPDATEDATE,UPDATEUSER,PROCESSDEFID,ISEND,MSGTYPE,TITLE,TITLECOLOR,BOLDFLAG,SUMMARY,TITLEPIC,CONTENT,USEOUTERURL,OUTURL,PICTURELIST,ATTACHMENT,ZDFLAG,ZDENDTIME,ZDBEGINTIME,COPYFLAG,REPLYFLAG,ISCLOSE,READFLAG,MODULEID,RELEASEDEPARTMENT,SOURCE,MESSAGEID,READSCOPE,READSCOPEDESC,RELEASETIME,READNUM,REPLYNUM,SUBMODULE,SUBTITLE,OVERLINE,GJC,AUTHOR,PHOTOGRAPHER,FILENAME,FILEPARAMS,FILEDESC,VIDEOFILE,PLATFORM,PLATFORMBINDID,WORDCOUNT,RECOMMENDFLAG,SORTTIME,DELETEFLAG,CANCHOOSEFLAG)
    values
    (#{ID},#{ORGID},#{BINDID},#{CREATEDATE},#{CREATEUSER},#{UPDATEDATE},#{UPDATEUSER},#{PROCESSDEFID},#{ISEND},#{MSGTYPE},#{TITLE},#{TITLECOLOR},#{BOLDFLAG},#{SUMMARY},#{TITLEPIC},#{CONTENT},#{USEOUTERURL},#{OUTURL},#{PICTURELIST},#{ATTACHMENT},#{ZDFLAG},#{ZDENDTIME},#{ZDBEGINTIME},#{COPYFLAG},#{REPLYFLAG},#{ISCLOSE},#{READFLAG},#{MODULEID},#{RELEASEDEPARTMENT},#{SOURCE},#{MESSAGEID},#{READSCOPE},#{READSCOPEDESC},#{RELEASETIME},#{READNUM},#{REPLYNUM},#{SUBMODULE},#{SUBTITLE},#{OVERLINE},#{GJC},#{AUTHOR},#{PHOTOGRAPHER},#{FILENAME},#{FILEPARAMS},#{FILEDESC},#{VIDEOFILE},#{PLATFORM},#{PLATFORMBINDID},#{WORDCOUNT},#{RECOMMENDFLAG},#{SORTTIME},#{DELETEFLAG},#{CANCHOOSEFLAG})
</script>""")
fun Insert(model:bo_act_cms_content_dto):Unit
                


@Insert("""<script>
    insert into bo_act_cms_content
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='ORGID!= null'> 
           ORGID,
        </if>
        <if test='BINDID!= null'> 
           BINDID,
        </if>
        <if test='CREATEDATE!= null'> 
           CREATEDATE,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='UPDATEDATE!= null'> 
           UPDATEDATE,
        </if>
        <if test='UPDATEUSER!= null'> 
           UPDATEUSER,
        </if>
        <if test='PROCESSDEFID!= null'> 
           PROCESSDEFID,
        </if>
           ISEND,
        <if test='MSGTYPE!= null'> 
           MSGTYPE,
        </if>
        <if test='TITLE!= null'> 
           TITLE,
        </if>
        <if test='TITLECOLOR!= null'> 
           TITLECOLOR,
        </if>
        <if test='BOLDFLAG!= null'> 
           BOLDFLAG,
        </if>
        <if test='SUMMARY!= null'> 
           SUMMARY,
        </if>
        <if test='TITLEPIC!= null'> 
           TITLEPIC,
        </if>
        <if test='CONTENT!= null'> 
           CONTENT,
        </if>
        <if test='USEOUTERURL!= null'> 
           USEOUTERURL,
        </if>
        <if test='OUTURL!= null'> 
           OUTURL,
        </if>
        <if test='PICTURELIST!= null'> 
           PICTURELIST,
        </if>
        <if test='ATTACHMENT!= null'> 
           ATTACHMENT,
        </if>
        <if test='ZDFLAG!= null'> 
           ZDFLAG,
        </if>
        <if test='ZDENDTIME!= null'> 
           ZDENDTIME,
        </if>
        <if test='ZDBEGINTIME!= null'> 
           ZDBEGINTIME,
        </if>
        <if test='COPYFLAG!= null'> 
           COPYFLAG,
        </if>
        <if test='REPLYFLAG!= null'> 
           REPLYFLAG,
        </if>
        <if test='ISCLOSE!= null'> 
           ISCLOSE,
        </if>
        <if test='READFLAG!= null'> 
           READFLAG,
        </if>
        <if test='MODULEID!= null'> 
           MODULEID,
        </if>
        <if test='RELEASEDEPARTMENT!= null'> 
           RELEASEDEPARTMENT,
        </if>
        <if test='SOURCE!= null'> 
           SOURCE,
        </if>
        <if test='MESSAGEID!= null'> 
           MESSAGEID,
        </if>
        <if test='READSCOPE!= null'> 
           READSCOPE,
        </if>
        <if test='READSCOPEDESC!= null'> 
           READSCOPEDESC,
        </if>
        <if test='RELEASETIME!= null'> 
           RELEASETIME,
        </if>
        <if test='READNUM!= null'> 
           READNUM,
        </if>
        <if test='REPLYNUM!= null'> 
           REPLYNUM,
        </if>
        <if test='SUBMODULE!= null'> 
           SUBMODULE,
        </if>
        <if test='SUBTITLE!= null'> 
           SUBTITLE,
        </if>
        <if test='OVERLINE!= null'> 
           OVERLINE,
        </if>
        <if test='GJC!= null'> 
           GJC,
        </if>
        <if test='AUTHOR!= null'> 
           AUTHOR,
        </if>
        <if test='PHOTOGRAPHER!= null'> 
           PHOTOGRAPHER,
        </if>
        <if test='FILENAME!= null'> 
           FILENAME,
        </if>
        <if test='FILEPARAMS!= null'> 
           FILEPARAMS,
        </if>
        <if test='FILEDESC!= null'> 
           FILEDESC,
        </if>
        <if test='VIDEOFILE!= null'> 
           VIDEOFILE,
        </if>
        <if test='PLATFORM!= null'> 
           PLATFORM,
        </if>
        <if test='PLATFORMBINDID!= null'> 
           PLATFORMBINDID,
        </if>
        <if test='WORDCOUNT!= null'> 
           WORDCOUNT,
        </if>
        <if test='RECOMMENDFLAG!= null'> 
           RECOMMENDFLAG,
        </if>
        <if test='SORTTIME!= null'> 
           SORTTIME,
        </if>
        <if test='DELETEFLAG!= null'> 
           DELETEFLAG,
        </if>
        <if test='CANCHOOSEFLAG!= null'> 
           CANCHOOSEFLAG
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='ORGID!= null'> 
           #{ORGID,jdbcType=varchar}，
        </if>
        <if test='BINDID!= null'> 
           #{BINDID,jdbcType=char}，
        </if>
        <if test='CREATEDATE!= null'> 
           #{CREATEDATE,jdbcType=timestamp}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='UPDATEDATE!= null'> 
           #{UPDATEDATE,jdbcType=timestamp}，
        </if>
        <if test='UPDATEUSER!= null'> 
           #{UPDATEUSER,jdbcType=varchar}，
        </if>
        <if test='PROCESSDEFID!= null'> 
           #{PROCESSDEFID,jdbcType=char}，
        </if>
           #{ISEND,jdbcType=smallint}，
        <if test='MSGTYPE!= null'> 
           #{MSGTYPE,jdbcType=varchar}，
        </if>
        <if test='TITLE!= null'> 
           #{TITLE,jdbcType=varchar}，
        </if>
        <if test='TITLECOLOR!= null'> 
           #{TITLECOLOR,jdbcType=varchar}，
        </if>
        <if test='BOLDFLAG!= null'> 
           #{BOLDFLAG,jdbcType=varchar}，
        </if>
        <if test='SUMMARY!= null'> 
           #{SUMMARY,jdbcType=text}，
        </if>
        <if test='TITLEPIC!= null'> 
           #{TITLEPIC,jdbcType=text}，
        </if>
        <if test='CONTENT!= null'> 
           #{CONTENT,jdbcType=text}，
        </if>
        <if test='USEOUTERURL!= null'> 
           #{USEOUTERURL,jdbcType=varchar}，
        </if>
        <if test='OUTURL!= null'> 
           #{OUTURL,jdbcType=text}，
        </if>
        <if test='PICTURELIST!= null'> 
           #{PICTURELIST,jdbcType=text}，
        </if>
        <if test='ATTACHMENT!= null'> 
           #{ATTACHMENT,jdbcType=text}，
        </if>
        <if test='ZDFLAG!= null'> 
           #{ZDFLAG,jdbcType=varchar}，
        </if>
        <if test='ZDENDTIME!= null'> 
           #{ZDENDTIME,jdbcType=datetime}，
        </if>
        <if test='ZDBEGINTIME!= null'> 
           #{ZDBEGINTIME,jdbcType=datetime}，
        </if>
        <if test='COPYFLAG!= null'> 
           #{COPYFLAG,jdbcType=varchar}，
        </if>
        <if test='REPLYFLAG!= null'> 
           #{REPLYFLAG,jdbcType=varchar}，
        </if>
        <if test='ISCLOSE!= null'> 
           #{ISCLOSE,jdbcType=varchar}，
        </if>
        <if test='READFLAG!= null'> 
           #{READFLAG,jdbcType=varchar}，
        </if>
        <if test='MODULEID!= null'> 
           #{MODULEID,jdbcType=varchar}，
        </if>
        <if test='RELEASEDEPARTMENT!= null'> 
           #{RELEASEDEPARTMENT,jdbcType=text}，
        </if>
        <if test='SOURCE!= null'> 
           #{SOURCE,jdbcType=varchar}，
        </if>
        <if test='MESSAGEID!= null'> 
           #{MESSAGEID,jdbcType=varchar}，
        </if>
        <if test='READSCOPE!= null'> 
           #{READSCOPE,jdbcType=varchar}，
        </if>
        <if test='READSCOPEDESC!= null'> 
           #{READSCOPEDESC,jdbcType=varchar}，
        </if>
        <if test='RELEASETIME!= null'> 
           #{RELEASETIME,jdbcType=datetime}，
        </if>
        <if test='READNUM!= null'> 
           #{READNUM,jdbcType=decimal}，
        </if>
        <if test='REPLYNUM!= null'> 
           #{REPLYNUM,jdbcType=decimal}，
        </if>
        <if test='SUBMODULE!= null'> 
           #{SUBMODULE,jdbcType=varchar}，
        </if>
        <if test='SUBTITLE!= null'> 
           #{SUBTITLE,jdbcType=varchar}，
        </if>
        <if test='OVERLINE!= null'> 
           #{OVERLINE,jdbcType=varchar}，
        </if>
        <if test='GJC!= null'> 
           #{GJC,jdbcType=varchar}，
        </if>
        <if test='AUTHOR!= null'> 
           #{AUTHOR,jdbcType=varchar}，
        </if>
        <if test='PHOTOGRAPHER!= null'> 
           #{PHOTOGRAPHER,jdbcType=varchar}，
        </if>
        <if test='FILENAME!= null'> 
           #{FILENAME,jdbcType=text}，
        </if>
        <if test='FILEPARAMS!= null'> 
           #{FILEPARAMS,jdbcType=text}，
        </if>
        <if test='FILEDESC!= null'> 
           #{FILEDESC,jdbcType=text}，
        </if>
        <if test='VIDEOFILE!= null'> 
           #{VIDEOFILE,jdbcType=text}，
        </if>
        <if test='PLATFORM!= null'> 
           #{PLATFORM,jdbcType=varchar}，
        </if>
        <if test='PLATFORMBINDID!= null'> 
           #{PLATFORMBINDID,jdbcType=varchar}，
        </if>
        <if test='WORDCOUNT!= null'> 
           #{WORDCOUNT,jdbcType=varchar}，
        </if>
        <if test='RECOMMENDFLAG!= null'> 
           #{RECOMMENDFLAG,jdbcType=varchar}，
        </if>
        <if test='SORTTIME!= null'> 
           #{SORTTIME,jdbcType=datetime}，
        </if>
        <if test='DELETEFLAG!= null'> 
           #{DELETEFLAG,jdbcType=varchar}，
        </if>
        <if test='CANCHOOSEFLAG!= null'> 
           #{CANCHOOSEFLAG,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:bo_act_cms_content_dto):Unit
                

}

        
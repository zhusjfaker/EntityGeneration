

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
    insert into app_act_cms_data
    (ID,MODULEID,MSGTITLE,BOLDFLAG,TITLECOLOR,MSGTITLEPIC,MSGSUMMARY,MSGCONTENT,MSGTYPE,MSGSOURCE,CREATEUSER,CREATETIME,UPDATEUSER,UPDATETIME,READFLAG,READNUM,REPLYFLAG,REPLYNUM,COPYFLAG,ZDFLAG,ZDFLAGNOW,ZDBEGINTIME,ZDENDTIME,ISCLOSE,ATTACHMENTNAME,OUTERURL,PIID,BOID,READSCOPEDESC,GJC,PLATFORMFLAG,SUBMODULE,SUBTITLE,OVERLINE,AUTHOR,PHOTOGRAPHER,FILENAME,FILEDESC,VIDEOFILE,DELETEFLAG,RELEASEDEPARTMENT,RELEASETIME,SORTTIME,PLATFORMPIID,WORDCOUNT,RECOMMENDFLAG,USEOUTERURL)
    values
    (#{ID},#{MODULEID},#{MSGTITLE},#{BOLDFLAG},#{TITLECOLOR},#{MSGTITLEPIC},#{MSGSUMMARY},#{MSGCONTENT},#{MSGTYPE},#{MSGSOURCE},#{CREATEUSER},#{CREATETIME},#{UPDATEUSER},#{UPDATETIME},#{READFLAG},#{READNUM},#{REPLYFLAG},#{REPLYNUM},#{COPYFLAG},#{ZDFLAG},#{ZDFLAGNOW},#{ZDBEGINTIME},#{ZDENDTIME},#{ISCLOSE},#{ATTACHMENTNAME},#{OUTERURL},#{PIID},#{BOID},#{READSCOPEDESC},#{GJC},#{PLATFORMFLAG},#{SUBMODULE},#{SUBTITLE},#{OVERLINE},#{AUTHOR},#{PHOTOGRAPHER},#{FILENAME},#{FILEDESC},#{VIDEOFILE},#{DELETEFLAG},#{RELEASEDEPARTMENT},#{RELEASETIME},#{SORTTIME},#{PLATFORMPIID},#{WORDCOUNT},#{RECOMMENDFLAG},#{USEOUTERURL})
</script>""")
fun Insert(model:app_act_cms_data_dto):Unit
                


@Insert("""<script>
    insert into app_act_cms_data
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='MODULEID!= null'> 
           MODULEID,
        </if>
        <if test='MSGTITLE!= null'> 
           MSGTITLE,
        </if>
        <if test='BOLDFLAG!= null'> 
           BOLDFLAG,
        </if>
        <if test='TITLECOLOR!= null'> 
           TITLECOLOR,
        </if>
        <if test='MSGTITLEPIC!= null'> 
           MSGTITLEPIC,
        </if>
        <if test='MSGSUMMARY!= null'> 
           MSGSUMMARY,
        </if>
        <if test='MSGCONTENT!= null'> 
           MSGCONTENT,
        </if>
        <if test='MSGTYPE!= null'> 
           MSGTYPE,
        </if>
        <if test='MSGSOURCE!= null'> 
           MSGSOURCE,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='CREATETIME!= null'> 
           CREATETIME,
        </if>
        <if test='UPDATEUSER!= null'> 
           UPDATEUSER,
        </if>
        <if test='UPDATETIME!= null'> 
           UPDATETIME,
        </if>
        <if test='READFLAG!= null'> 
           READFLAG,
        </if>
        <if test='READNUM!= null'> 
           READNUM,
        </if>
        <if test='REPLYFLAG!= null'> 
           REPLYFLAG,
        </if>
        <if test='REPLYNUM!= null'> 
           REPLYNUM,
        </if>
        <if test='COPYFLAG!= null'> 
           COPYFLAG,
        </if>
        <if test='ZDFLAG!= null'> 
           ZDFLAG,
        </if>
        <if test='ZDFLAGNOW!= null'> 
           ZDFLAGNOW,
        </if>
        <if test='ZDBEGINTIME!= null'> 
           ZDBEGINTIME,
        </if>
        <if test='ZDENDTIME!= null'> 
           ZDENDTIME,
        </if>
        <if test='ISCLOSE!= null'> 
           ISCLOSE,
        </if>
        <if test='ATTACHMENTNAME!= null'> 
           ATTACHMENTNAME,
        </if>
        <if test='OUTERURL!= null'> 
           OUTERURL,
        </if>
        <if test='PIID!= null'> 
           PIID,
        </if>
        <if test='BOID!= null'> 
           BOID,
        </if>
        <if test='READSCOPEDESC!= null'> 
           READSCOPEDESC,
        </if>
        <if test='GJC!= null'> 
           GJC,
        </if>
        <if test='PLATFORMFLAG!= null'> 
           PLATFORMFLAG,
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
        <if test='AUTHOR!= null'> 
           AUTHOR,
        </if>
        <if test='PHOTOGRAPHER!= null'> 
           PHOTOGRAPHER,
        </if>
        <if test='FILENAME!= null'> 
           FILENAME,
        </if>
        <if test='FILEDESC!= null'> 
           FILEDESC,
        </if>
        <if test='VIDEOFILE!= null'> 
           VIDEOFILE,
        </if>
        <if test='DELETEFLAG!= null'> 
           DELETEFLAG,
        </if>
        <if test='RELEASEDEPARTMENT!= null'> 
           RELEASEDEPARTMENT,
        </if>
        <if test='RELEASETIME!= null'> 
           RELEASETIME,
        </if>
        <if test='SORTTIME!= null'> 
           SORTTIME,
        </if>
        <if test='PLATFORMPIID!= null'> 
           PLATFORMPIID,
        </if>
        <if test='WORDCOUNT!= null'> 
           WORDCOUNT,
        </if>
        <if test='RECOMMENDFLAG!= null'> 
           RECOMMENDFLAG,
        </if>
        <if test='USEOUTERURL!= null'> 
           USEOUTERURL
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='MODULEID!= null'> 
           #{MODULEID,jdbcType=char}，
        </if>
        <if test='MSGTITLE!= null'> 
           #{MSGTITLE,jdbcType=varchar}，
        </if>
        <if test='BOLDFLAG!= null'> 
           #{BOLDFLAG,jdbcType=char}，
        </if>
        <if test='TITLECOLOR!= null'> 
           #{TITLECOLOR,jdbcType=varchar}，
        </if>
        <if test='MSGTITLEPIC!= null'> 
           #{MSGTITLEPIC,jdbcType=varchar}，
        </if>
        <if test='MSGSUMMARY!= null'> 
           #{MSGSUMMARY,jdbcType=text}，
        </if>
        <if test='MSGCONTENT!= null'> 
           #{MSGCONTENT,jdbcType=text}，
        </if>
        <if test='MSGTYPE!= null'> 
           #{MSGTYPE,jdbcType=char}，
        </if>
        <if test='MSGSOURCE!= null'> 
           #{MSGSOURCE,jdbcType=varchar}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='CREATETIME!= null'> 
           #{CREATETIME,jdbcType=datetime}，
        </if>
        <if test='UPDATEUSER!= null'> 
           #{UPDATEUSER,jdbcType=varchar}，
        </if>
        <if test='UPDATETIME!= null'> 
           #{UPDATETIME,jdbcType=datetime}，
        </if>
        <if test='READFLAG!= null'> 
           #{READFLAG,jdbcType=char}，
        </if>
        <if test='READNUM!= null'> 
           #{READNUM,jdbcType=int}，
        </if>
        <if test='REPLYFLAG!= null'> 
           #{REPLYFLAG,jdbcType=char}，
        </if>
        <if test='REPLYNUM!= null'> 
           #{REPLYNUM,jdbcType=int}，
        </if>
        <if test='COPYFLAG!= null'> 
           #{COPYFLAG,jdbcType=char}，
        </if>
        <if test='ZDFLAG!= null'> 
           #{ZDFLAG,jdbcType=char}，
        </if>
        <if test='ZDFLAGNOW!= null'> 
           #{ZDFLAGNOW,jdbcType=char}，
        </if>
        <if test='ZDBEGINTIME!= null'> 
           #{ZDBEGINTIME,jdbcType=datetime}，
        </if>
        <if test='ZDENDTIME!= null'> 
           #{ZDENDTIME,jdbcType=datetime}，
        </if>
        <if test='ISCLOSE!= null'> 
           #{ISCLOSE,jdbcType=char}，
        </if>
        <if test='ATTACHMENTNAME!= null'> 
           #{ATTACHMENTNAME,jdbcType=varchar}，
        </if>
        <if test='OUTERURL!= null'> 
           #{OUTERURL,jdbcType=varchar}，
        </if>
        <if test='PIID!= null'> 
           #{PIID,jdbcType=char}，
        </if>
        <if test='BOID!= null'> 
           #{BOID,jdbcType=char}，
        </if>
        <if test='READSCOPEDESC!= null'> 
           #{READSCOPEDESC,jdbcType=varchar}，
        </if>
        <if test='GJC!= null'> 
           #{GJC,jdbcType=varchar}，
        </if>
        <if test='PLATFORMFLAG!= null'> 
           #{PLATFORMFLAG,jdbcType=char}，
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
        <if test='AUTHOR!= null'> 
           #{AUTHOR,jdbcType=varchar}，
        </if>
        <if test='PHOTOGRAPHER!= null'> 
           #{PHOTOGRAPHER,jdbcType=varchar}，
        </if>
        <if test='FILENAME!= null'> 
           #{FILENAME,jdbcType=varchar}，
        </if>
        <if test='FILEDESC!= null'> 
           #{FILEDESC,jdbcType=varchar}，
        </if>
        <if test='VIDEOFILE!= null'> 
           #{VIDEOFILE,jdbcType=varchar}，
        </if>
        <if test='DELETEFLAG!= null'> 
           #{DELETEFLAG,jdbcType=char}，
        </if>
        <if test='RELEASEDEPARTMENT!= null'> 
           #{RELEASEDEPARTMENT,jdbcType=varchar}，
        </if>
        <if test='RELEASETIME!= null'> 
           #{RELEASETIME,jdbcType=datetime}，
        </if>
        <if test='SORTTIME!= null'> 
           #{SORTTIME,jdbcType=datetime}，
        </if>
        <if test='PLATFORMPIID!= null'> 
           #{PLATFORMPIID,jdbcType=char}，
        </if>
        <if test='WORDCOUNT!= null'> 
           #{WORDCOUNT,jdbcType=varchar}，
        </if>
        <if test='RECOMMENDFLAG!= null'> 
           #{RECOMMENDFLAG,jdbcType=varchar}，
        </if>
        <if test='USEOUTERURL!= null'> 
           #{USEOUTERURL,jdbcType=char}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_cms_data_dto):Unit
                


@Delete("DELETE FROM app_act_cms_data WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE app_act_cms_data SET
        ID=#{ID,jdbcType=String},
        MODULEID=#{MODULEID,jdbcType=String},
        MSGTITLE=#{MSGTITLE,jdbcType=String},
        BOLDFLAG=#{BOLDFLAG,jdbcType=String},
        TITLECOLOR=#{TITLECOLOR,jdbcType=String},
        MSGTITLEPIC=#{MSGTITLEPIC,jdbcType=String},
        MSGSUMMARY=#{MSGSUMMARY,jdbcType=String},
        MSGCONTENT=#{MSGCONTENT,jdbcType=String},
        MSGTYPE=#{MSGTYPE,jdbcType=String},
        MSGSOURCE=#{MSGSOURCE,jdbcType=String},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        CREATETIME=#{CREATETIME,jdbcType=Timestamp},
        UPDATEUSER=#{UPDATEUSER,jdbcType=String},
        UPDATETIME=#{UPDATETIME,jdbcType=Timestamp},
        READFLAG=#{READFLAG,jdbcType=String},
        READNUM=#{READNUM,jdbcType=Integer},
        REPLYFLAG=#{REPLYFLAG,jdbcType=String},
        REPLYNUM=#{REPLYNUM,jdbcType=Integer},
        COPYFLAG=#{COPYFLAG,jdbcType=String},
        ZDFLAG=#{ZDFLAG,jdbcType=String},
        ZDFLAGNOW=#{ZDFLAGNOW,jdbcType=String},
        ZDBEGINTIME=#{ZDBEGINTIME,jdbcType=Timestamp},
        ZDENDTIME=#{ZDENDTIME,jdbcType=Timestamp},
        ISCLOSE=#{ISCLOSE,jdbcType=String},
        ATTACHMENTNAME=#{ATTACHMENTNAME,jdbcType=String},
        OUTERURL=#{OUTERURL,jdbcType=String},
        PIID=#{PIID,jdbcType=String},
        BOID=#{BOID,jdbcType=String},
        READSCOPEDESC=#{READSCOPEDESC,jdbcType=String},
        GJC=#{GJC,jdbcType=String},
        PLATFORMFLAG=#{PLATFORMFLAG,jdbcType=String},
        SUBMODULE=#{SUBMODULE,jdbcType=String},
        SUBTITLE=#{SUBTITLE,jdbcType=String},
        OVERLINE=#{OVERLINE,jdbcType=String},
        AUTHOR=#{AUTHOR,jdbcType=String},
        PHOTOGRAPHER=#{PHOTOGRAPHER,jdbcType=String},
        FILENAME=#{FILENAME,jdbcType=String},
        FILEDESC=#{FILEDESC,jdbcType=String},
        VIDEOFILE=#{VIDEOFILE,jdbcType=String},
        DELETEFLAG=#{DELETEFLAG,jdbcType=String},
        RELEASEDEPARTMENT=#{RELEASEDEPARTMENT,jdbcType=String},
        RELEASETIME=#{RELEASETIME,jdbcType=Timestamp},
        SORTTIME=#{SORTTIME,jdbcType=Timestamp},
        PLATFORMPIID=#{PLATFORMPIID,jdbcType=String},
        WORDCOUNT=#{WORDCOUNT,jdbcType=String},
        RECOMMENDFLAG=#{RECOMMENDFLAG,jdbcType=String},
        USEOUTERURL=#{USEOUTERURL,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:app_act_cms_data_dto)
        

@Update("""<script>
            UPDATE app_act_cms_data SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="MODULEID != null">  MODULEID=#{MODULEID,jdbcType=String},</if>
        <if test="MSGTITLE != null">  MSGTITLE=#{MSGTITLE,jdbcType=String},</if>
        <if test="BOLDFLAG != null">  BOLDFLAG=#{BOLDFLAG,jdbcType=String},</if>
        <if test="TITLECOLOR != null">  TITLECOLOR=#{TITLECOLOR,jdbcType=String},</if>
        <if test="MSGTITLEPIC != null">  MSGTITLEPIC=#{MSGTITLEPIC,jdbcType=String},</if>
        <if test="MSGSUMMARY != null">  MSGSUMMARY=#{MSGSUMMARY,jdbcType=String},</if>
        <if test="MSGCONTENT != null">  MSGCONTENT=#{MSGCONTENT,jdbcType=String},</if>
        <if test="MSGTYPE != null">  MSGTYPE=#{MSGTYPE,jdbcType=String},</if>
        <if test="MSGSOURCE != null">  MSGSOURCE=#{MSGSOURCE,jdbcType=String},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="CREATETIME != null">  CREATETIME=#{CREATETIME,jdbcType=Timestamp},</if>
        <if test="UPDATEUSER != null">  UPDATEUSER=#{UPDATEUSER,jdbcType=String},</if>
        <if test="UPDATETIME != null">  UPDATETIME=#{UPDATETIME,jdbcType=Timestamp},</if>
        <if test="READFLAG != null">  READFLAG=#{READFLAG,jdbcType=String},</if>
        <if test="READNUM != null">  READNUM=#{READNUM,jdbcType=Integer},</if>
        <if test="REPLYFLAG != null">  REPLYFLAG=#{REPLYFLAG,jdbcType=String},</if>
        <if test="REPLYNUM != null">  REPLYNUM=#{REPLYNUM,jdbcType=Integer},</if>
        <if test="COPYFLAG != null">  COPYFLAG=#{COPYFLAG,jdbcType=String},</if>
        <if test="ZDFLAG != null">  ZDFLAG=#{ZDFLAG,jdbcType=String},</if>
        <if test="ZDFLAGNOW != null">  ZDFLAGNOW=#{ZDFLAGNOW,jdbcType=String},</if>
        <if test="ZDBEGINTIME != null">  ZDBEGINTIME=#{ZDBEGINTIME,jdbcType=Timestamp},</if>
        <if test="ZDENDTIME != null">  ZDENDTIME=#{ZDENDTIME,jdbcType=Timestamp},</if>
        <if test="ISCLOSE != null">  ISCLOSE=#{ISCLOSE,jdbcType=String},</if>
        <if test="ATTACHMENTNAME != null">  ATTACHMENTNAME=#{ATTACHMENTNAME,jdbcType=String},</if>
        <if test="OUTERURL != null">  OUTERURL=#{OUTERURL,jdbcType=String},</if>
        <if test="PIID != null">  PIID=#{PIID,jdbcType=String},</if>
        <if test="BOID != null">  BOID=#{BOID,jdbcType=String},</if>
        <if test="READSCOPEDESC != null">  READSCOPEDESC=#{READSCOPEDESC,jdbcType=String},</if>
        <if test="GJC != null">  GJC=#{GJC,jdbcType=String},</if>
        <if test="PLATFORMFLAG != null">  PLATFORMFLAG=#{PLATFORMFLAG,jdbcType=String},</if>
        <if test="SUBMODULE != null">  SUBMODULE=#{SUBMODULE,jdbcType=String},</if>
        <if test="SUBTITLE != null">  SUBTITLE=#{SUBTITLE,jdbcType=String},</if>
        <if test="OVERLINE != null">  OVERLINE=#{OVERLINE,jdbcType=String},</if>
        <if test="AUTHOR != null">  AUTHOR=#{AUTHOR,jdbcType=String},</if>
        <if test="PHOTOGRAPHER != null">  PHOTOGRAPHER=#{PHOTOGRAPHER,jdbcType=String},</if>
        <if test="FILENAME != null">  FILENAME=#{FILENAME,jdbcType=String},</if>
        <if test="FILEDESC != null">  FILEDESC=#{FILEDESC,jdbcType=String},</if>
        <if test="VIDEOFILE != null">  VIDEOFILE=#{VIDEOFILE,jdbcType=String},</if>
        <if test="DELETEFLAG != null">  DELETEFLAG=#{DELETEFLAG,jdbcType=String},</if>
        <if test="RELEASEDEPARTMENT != null">  RELEASEDEPARTMENT=#{RELEASEDEPARTMENT,jdbcType=String},</if>
        <if test="RELEASETIME != null">  RELEASETIME=#{RELEASETIME,jdbcType=Timestamp},</if>
        <if test="SORTTIME != null">  SORTTIME=#{SORTTIME,jdbcType=Timestamp},</if>
        <if test="PLATFORMPIID != null">  PLATFORMPIID=#{PLATFORMPIID,jdbcType=String},</if>
        <if test="WORDCOUNT != null">  WORDCOUNT=#{WORDCOUNT,jdbcType=String},</if>
        <if test="RECOMMENDFLAG != null">  RECOMMENDFLAG=#{RECOMMENDFLAG,jdbcType=String},</if>
        <if test="USEOUTERURL != null">  USEOUTERURL=#{USEOUTERURL,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:app_act_cms_data_dto)
            

}

        

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
    insert into app_act_cms_data
    (ID,MODULEID,MSGTITLE,BOLDFLAG,TITLECOLOR,MSGTITLEPIC,MSGSUMMARY,MSGCONTENT,MSGTYPE,MSGSOURCE,CREATEUSER,CREATETIME,UPDATEUSER,UPDATETIME,READFLAG,READNUM,REPLYFLAG,REPLYNUM,COPYFLAG,ZDFLAG,ZDFLAGNOW,ZDBEGINTIME,ZDENDTIME,ISCLOSE,ATTACHMENTNAME,OUTERURL,PIID,BOID,READSCOPEDESC,GJC,PLATFORMFLAG,SUBMODULE,SUBTITLE,OVERLINE,AUTHOR,PHOTOGRAPHER,FILENAME,FILEDESC,VIDEOFILE,DELETEFLAG,RELEASEDEPARTMENT,RELEASETIME,SORTTIME,PLATFORMPIID,WORDCOUNT,RECOMMENDFLAG,USEOUTERURL)
    values
    (#{ID},#{MODULEID},#{MSGTITLE},#{BOLDFLAG},#{TITLECOLOR},#{MSGTITLEPIC},#{MSGSUMMARY},#{MSGCONTENT},#{MSGTYPE},#{MSGSOURCE},#{CREATEUSER},#{CREATETIME},#{UPDATEUSER},#{UPDATETIME},#{READFLAG},#{READNUM},#{REPLYFLAG},#{REPLYNUM},#{COPYFLAG},#{ZDFLAG},#{ZDFLAGNOW},#{ZDBEGINTIME},#{ZDENDTIME},#{ISCLOSE},#{ATTACHMENTNAME},#{OUTERURL},#{PIID},#{BOID},#{READSCOPEDESC},#{GJC},#{PLATFORMFLAG},#{SUBMODULE},#{SUBTITLE},#{OVERLINE},#{AUTHOR},#{PHOTOGRAPHER},#{FILENAME},#{FILEDESC},#{VIDEOFILE},#{DELETEFLAG},#{RELEASEDEPARTMENT},#{RELEASETIME},#{SORTTIME},#{PLATFORMPIID},#{WORDCOUNT},#{RECOMMENDFLAG},#{USEOUTERURL})
</script>""")
fun Insert(model:app_act_cms_data_dto):Unit
                


@Insert("""<script>
    insert into app_act_cms_data
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='MODULEID!= null'> 
           MODULEID,
        </if>
        <if test='MSGTITLE!= null'> 
           MSGTITLE,
        </if>
        <if test='BOLDFLAG!= null'> 
           BOLDFLAG,
        </if>
        <if test='TITLECOLOR!= null'> 
           TITLECOLOR,
        </if>
        <if test='MSGTITLEPIC!= null'> 
           MSGTITLEPIC,
        </if>
        <if test='MSGSUMMARY!= null'> 
           MSGSUMMARY,
        </if>
        <if test='MSGCONTENT!= null'> 
           MSGCONTENT,
        </if>
        <if test='MSGTYPE!= null'> 
           MSGTYPE,
        </if>
        <if test='MSGSOURCE!= null'> 
           MSGSOURCE,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='CREATETIME!= null'> 
           CREATETIME,
        </if>
        <if test='UPDATEUSER!= null'> 
           UPDATEUSER,
        </if>
        <if test='UPDATETIME!= null'> 
           UPDATETIME,
        </if>
        <if test='READFLAG!= null'> 
           READFLAG,
        </if>
        <if test='READNUM!= null'> 
           READNUM,
        </if>
        <if test='REPLYFLAG!= null'> 
           REPLYFLAG,
        </if>
        <if test='REPLYNUM!= null'> 
           REPLYNUM,
        </if>
        <if test='COPYFLAG!= null'> 
           COPYFLAG,
        </if>
        <if test='ZDFLAG!= null'> 
           ZDFLAG,
        </if>
        <if test='ZDFLAGNOW!= null'> 
           ZDFLAGNOW,
        </if>
        <if test='ZDBEGINTIME!= null'> 
           ZDBEGINTIME,
        </if>
        <if test='ZDENDTIME!= null'> 
           ZDENDTIME,
        </if>
        <if test='ISCLOSE!= null'> 
           ISCLOSE,
        </if>
        <if test='ATTACHMENTNAME!= null'> 
           ATTACHMENTNAME,
        </if>
        <if test='OUTERURL!= null'> 
           OUTERURL,
        </if>
        <if test='PIID!= null'> 
           PIID,
        </if>
        <if test='BOID!= null'> 
           BOID,
        </if>
        <if test='READSCOPEDESC!= null'> 
           READSCOPEDESC,
        </if>
        <if test='GJC!= null'> 
           GJC,
        </if>
        <if test='PLATFORMFLAG!= null'> 
           PLATFORMFLAG,
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
        <if test='AUTHOR!= null'> 
           AUTHOR,
        </if>
        <if test='PHOTOGRAPHER!= null'> 
           PHOTOGRAPHER,
        </if>
        <if test='FILENAME!= null'> 
           FILENAME,
        </if>
        <if test='FILEDESC!= null'> 
           FILEDESC,
        </if>
        <if test='VIDEOFILE!= null'> 
           VIDEOFILE,
        </if>
        <if test='DELETEFLAG!= null'> 
           DELETEFLAG,
        </if>
        <if test='RELEASEDEPARTMENT!= null'> 
           RELEASEDEPARTMENT,
        </if>
        <if test='RELEASETIME!= null'> 
           RELEASETIME,
        </if>
        <if test='SORTTIME!= null'> 
           SORTTIME,
        </if>
        <if test='PLATFORMPIID!= null'> 
           PLATFORMPIID,
        </if>
        <if test='WORDCOUNT!= null'> 
           WORDCOUNT,
        </if>
        <if test='RECOMMENDFLAG!= null'> 
           RECOMMENDFLAG,
        </if>
        <if test='USEOUTERURL!= null'> 
           USEOUTERURL
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='MODULEID!= null'> 
           #{MODULEID,jdbcType=char}，
        </if>
        <if test='MSGTITLE!= null'> 
           #{MSGTITLE,jdbcType=varchar}，
        </if>
        <if test='BOLDFLAG!= null'> 
           #{BOLDFLAG,jdbcType=char}，
        </if>
        <if test='TITLECOLOR!= null'> 
           #{TITLECOLOR,jdbcType=varchar}，
        </if>
        <if test='MSGTITLEPIC!= null'> 
           #{MSGTITLEPIC,jdbcType=varchar}，
        </if>
        <if test='MSGSUMMARY!= null'> 
           #{MSGSUMMARY,jdbcType=text}，
        </if>
        <if test='MSGCONTENT!= null'> 
           #{MSGCONTENT,jdbcType=text}，
        </if>
        <if test='MSGTYPE!= null'> 
           #{MSGTYPE,jdbcType=char}，
        </if>
        <if test='MSGSOURCE!= null'> 
           #{MSGSOURCE,jdbcType=varchar}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='CREATETIME!= null'> 
           #{CREATETIME,jdbcType=datetime}，
        </if>
        <if test='UPDATEUSER!= null'> 
           #{UPDATEUSER,jdbcType=varchar}，
        </if>
        <if test='UPDATETIME!= null'> 
           #{UPDATETIME,jdbcType=datetime}，
        </if>
        <if test='READFLAG!= null'> 
           #{READFLAG,jdbcType=char}，
        </if>
        <if test='READNUM!= null'> 
           #{READNUM,jdbcType=int}，
        </if>
        <if test='REPLYFLAG!= null'> 
           #{REPLYFLAG,jdbcType=char}，
        </if>
        <if test='REPLYNUM!= null'> 
           #{REPLYNUM,jdbcType=int}，
        </if>
        <if test='COPYFLAG!= null'> 
           #{COPYFLAG,jdbcType=char}，
        </if>
        <if test='ZDFLAG!= null'> 
           #{ZDFLAG,jdbcType=char}，
        </if>
        <if test='ZDFLAGNOW!= null'> 
           #{ZDFLAGNOW,jdbcType=char}，
        </if>
        <if test='ZDBEGINTIME!= null'> 
           #{ZDBEGINTIME,jdbcType=datetime}，
        </if>
        <if test='ZDENDTIME!= null'> 
           #{ZDENDTIME,jdbcType=datetime}，
        </if>
        <if test='ISCLOSE!= null'> 
           #{ISCLOSE,jdbcType=char}，
        </if>
        <if test='ATTACHMENTNAME!= null'> 
           #{ATTACHMENTNAME,jdbcType=varchar}，
        </if>
        <if test='OUTERURL!= null'> 
           #{OUTERURL,jdbcType=varchar}，
        </if>
        <if test='PIID!= null'> 
           #{PIID,jdbcType=char}，
        </if>
        <if test='BOID!= null'> 
           #{BOID,jdbcType=char}，
        </if>
        <if test='READSCOPEDESC!= null'> 
           #{READSCOPEDESC,jdbcType=varchar}，
        </if>
        <if test='GJC!= null'> 
           #{GJC,jdbcType=varchar}，
        </if>
        <if test='PLATFORMFLAG!= null'> 
           #{PLATFORMFLAG,jdbcType=char}，
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
        <if test='AUTHOR!= null'> 
           #{AUTHOR,jdbcType=varchar}，
        </if>
        <if test='PHOTOGRAPHER!= null'> 
           #{PHOTOGRAPHER,jdbcType=varchar}，
        </if>
        <if test='FILENAME!= null'> 
           #{FILENAME,jdbcType=varchar}，
        </if>
        <if test='FILEDESC!= null'> 
           #{FILEDESC,jdbcType=varchar}，
        </if>
        <if test='VIDEOFILE!= null'> 
           #{VIDEOFILE,jdbcType=varchar}，
        </if>
        <if test='DELETEFLAG!= null'> 
           #{DELETEFLAG,jdbcType=char}，
        </if>
        <if test='RELEASEDEPARTMENT!= null'> 
           #{RELEASEDEPARTMENT,jdbcType=varchar}，
        </if>
        <if test='RELEASETIME!= null'> 
           #{RELEASETIME,jdbcType=datetime}，
        </if>
        <if test='SORTTIME!= null'> 
           #{SORTTIME,jdbcType=datetime}，
        </if>
        <if test='PLATFORMPIID!= null'> 
           #{PLATFORMPIID,jdbcType=char}，
        </if>
        <if test='WORDCOUNT!= null'> 
           #{WORDCOUNT,jdbcType=varchar}，
        </if>
        <if test='RECOMMENDFLAG!= null'> 
           #{RECOMMENDFLAG,jdbcType=varchar}，
        </if>
        <if test='USEOUTERURL!= null'> 
           #{USEOUTERURL,jdbcType=char}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_cms_data_dto):Unit
                


@Delete("DELETE FROM app_act_cms_data WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE app_act_cms_data SET
        ID=#{ID,jdbcType=String},
        MODULEID=#{MODULEID,jdbcType=String},
        MSGTITLE=#{MSGTITLE,jdbcType=String},
        BOLDFLAG=#{BOLDFLAG,jdbcType=String},
        TITLECOLOR=#{TITLECOLOR,jdbcType=String},
        MSGTITLEPIC=#{MSGTITLEPIC,jdbcType=String},
        MSGSUMMARY=#{MSGSUMMARY,jdbcType=String},
        MSGCONTENT=#{MSGCONTENT,jdbcType=String},
        MSGTYPE=#{MSGTYPE,jdbcType=String},
        MSGSOURCE=#{MSGSOURCE,jdbcType=String},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        CREATETIME=#{CREATETIME,jdbcType=Timestamp},
        UPDATEUSER=#{UPDATEUSER,jdbcType=String},
        UPDATETIME=#{UPDATETIME,jdbcType=Timestamp},
        READFLAG=#{READFLAG,jdbcType=String},
        READNUM=#{READNUM,jdbcType=Integer},
        REPLYFLAG=#{REPLYFLAG,jdbcType=String},
        REPLYNUM=#{REPLYNUM,jdbcType=Integer},
        COPYFLAG=#{COPYFLAG,jdbcType=String},
        ZDFLAG=#{ZDFLAG,jdbcType=String},
        ZDFLAGNOW=#{ZDFLAGNOW,jdbcType=String},
        ZDBEGINTIME=#{ZDBEGINTIME,jdbcType=Timestamp},
        ZDENDTIME=#{ZDENDTIME,jdbcType=Timestamp},
        ISCLOSE=#{ISCLOSE,jdbcType=String},
        ATTACHMENTNAME=#{ATTACHMENTNAME,jdbcType=String},
        OUTERURL=#{OUTERURL,jdbcType=String},
        PIID=#{PIID,jdbcType=String},
        BOID=#{BOID,jdbcType=String},
        READSCOPEDESC=#{READSCOPEDESC,jdbcType=String},
        GJC=#{GJC,jdbcType=String},
        PLATFORMFLAG=#{PLATFORMFLAG,jdbcType=String},
        SUBMODULE=#{SUBMODULE,jdbcType=String},
        SUBTITLE=#{SUBTITLE,jdbcType=String},
        OVERLINE=#{OVERLINE,jdbcType=String},
        AUTHOR=#{AUTHOR,jdbcType=String},
        PHOTOGRAPHER=#{PHOTOGRAPHER,jdbcType=String},
        FILENAME=#{FILENAME,jdbcType=String},
        FILEDESC=#{FILEDESC,jdbcType=String},
        VIDEOFILE=#{VIDEOFILE,jdbcType=String},
        DELETEFLAG=#{DELETEFLAG,jdbcType=String},
        RELEASEDEPARTMENT=#{RELEASEDEPARTMENT,jdbcType=String},
        RELEASETIME=#{RELEASETIME,jdbcType=Timestamp},
        SORTTIME=#{SORTTIME,jdbcType=Timestamp},
        PLATFORMPIID=#{PLATFORMPIID,jdbcType=String},
        WORDCOUNT=#{WORDCOUNT,jdbcType=String},
        RECOMMENDFLAG=#{RECOMMENDFLAG,jdbcType=String},
        USEOUTERURL=#{USEOUTERURL,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:app_act_cms_data_dto)
        

@Update("""<script>
            UPDATE app_act_cms_data SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="MODULEID != null">  MODULEID=#{MODULEID,jdbcType=String},</if>
        <if test="MSGTITLE != null">  MSGTITLE=#{MSGTITLE,jdbcType=String},</if>
        <if test="BOLDFLAG != null">  BOLDFLAG=#{BOLDFLAG,jdbcType=String},</if>
        <if test="TITLECOLOR != null">  TITLECOLOR=#{TITLECOLOR,jdbcType=String},</if>
        <if test="MSGTITLEPIC != null">  MSGTITLEPIC=#{MSGTITLEPIC,jdbcType=String},</if>
        <if test="MSGSUMMARY != null">  MSGSUMMARY=#{MSGSUMMARY,jdbcType=String},</if>
        <if test="MSGCONTENT != null">  MSGCONTENT=#{MSGCONTENT,jdbcType=String},</if>
        <if test="MSGTYPE != null">  MSGTYPE=#{MSGTYPE,jdbcType=String},</if>
        <if test="MSGSOURCE != null">  MSGSOURCE=#{MSGSOURCE,jdbcType=String},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="CREATETIME != null">  CREATETIME=#{CREATETIME,jdbcType=Timestamp},</if>
        <if test="UPDATEUSER != null">  UPDATEUSER=#{UPDATEUSER,jdbcType=String},</if>
        <if test="UPDATETIME != null">  UPDATETIME=#{UPDATETIME,jdbcType=Timestamp},</if>
        <if test="READFLAG != null">  READFLAG=#{READFLAG,jdbcType=String},</if>
        <if test="READNUM != null">  READNUM=#{READNUM,jdbcType=Integer},</if>
        <if test="REPLYFLAG != null">  REPLYFLAG=#{REPLYFLAG,jdbcType=String},</if>
        <if test="REPLYNUM != null">  REPLYNUM=#{REPLYNUM,jdbcType=Integer},</if>
        <if test="COPYFLAG != null">  COPYFLAG=#{COPYFLAG,jdbcType=String},</if>
        <if test="ZDFLAG != null">  ZDFLAG=#{ZDFLAG,jdbcType=String},</if>
        <if test="ZDFLAGNOW != null">  ZDFLAGNOW=#{ZDFLAGNOW,jdbcType=String},</if>
        <if test="ZDBEGINTIME != null">  ZDBEGINTIME=#{ZDBEGINTIME,jdbcType=Timestamp},</if>
        <if test="ZDENDTIME != null">  ZDENDTIME=#{ZDENDTIME,jdbcType=Timestamp},</if>
        <if test="ISCLOSE != null">  ISCLOSE=#{ISCLOSE,jdbcType=String},</if>
        <if test="ATTACHMENTNAME != null">  ATTACHMENTNAME=#{ATTACHMENTNAME,jdbcType=String},</if>
        <if test="OUTERURL != null">  OUTERURL=#{OUTERURL,jdbcType=String},</if>
        <if test="PIID != null">  PIID=#{PIID,jdbcType=String},</if>
        <if test="BOID != null">  BOID=#{BOID,jdbcType=String},</if>
        <if test="READSCOPEDESC != null">  READSCOPEDESC=#{READSCOPEDESC,jdbcType=String},</if>
        <if test="GJC != null">  GJC=#{GJC,jdbcType=String},</if>
        <if test="PLATFORMFLAG != null">  PLATFORMFLAG=#{PLATFORMFLAG,jdbcType=String},</if>
        <if test="SUBMODULE != null">  SUBMODULE=#{SUBMODULE,jdbcType=String},</if>
        <if test="SUBTITLE != null">  SUBTITLE=#{SUBTITLE,jdbcType=String},</if>
        <if test="OVERLINE != null">  OVERLINE=#{OVERLINE,jdbcType=String},</if>
        <if test="AUTHOR != null">  AUTHOR=#{AUTHOR,jdbcType=String},</if>
        <if test="PHOTOGRAPHER != null">  PHOTOGRAPHER=#{PHOTOGRAPHER,jdbcType=String},</if>
        <if test="FILENAME != null">  FILENAME=#{FILENAME,jdbcType=String},</if>
        <if test="FILEDESC != null">  FILEDESC=#{FILEDESC,jdbcType=String},</if>
        <if test="VIDEOFILE != null">  VIDEOFILE=#{VIDEOFILE,jdbcType=String},</if>
        <if test="DELETEFLAG != null">  DELETEFLAG=#{DELETEFLAG,jdbcType=String},</if>
        <if test="RELEASEDEPARTMENT != null">  RELEASEDEPARTMENT=#{RELEASEDEPARTMENT,jdbcType=String},</if>
        <if test="RELEASETIME != null">  RELEASETIME=#{RELEASETIME,jdbcType=Timestamp},</if>
        <if test="SORTTIME != null">  SORTTIME=#{SORTTIME,jdbcType=Timestamp},</if>
        <if test="PLATFORMPIID != null">  PLATFORMPIID=#{PLATFORMPIID,jdbcType=String},</if>
        <if test="WORDCOUNT != null">  WORDCOUNT=#{WORDCOUNT,jdbcType=String},</if>
        <if test="RECOMMENDFLAG != null">  RECOMMENDFLAG=#{RECOMMENDFLAG,jdbcType=String},</if>
        <if test="USEOUTERURL != null">  USEOUTERURL=#{USEOUTERURL,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:app_act_cms_data_dto)
            

}

        
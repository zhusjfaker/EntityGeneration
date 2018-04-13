

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_repository{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "PLRID", column = "PLRID"),
   Result(property = "PLNO", column = "PLNO"),
   Result(property = "PLNAME", column = "PLNAME"),
   Result(property = "PLLEVEL", column = "PLLEVEL"),
   Result(property = "PLPARENTID", column = "PLPARENTID"),
   Result(property = "PLORDERINDEX", column = "PLORDERINDEX"),
   Result(property = "PLISBOTTOMLEVEL", column = "PLISBOTTOMLEVEL"),
   Result(property = "PLDESC", column = "PLDESC"),
   Result(property = "PLRD", column = "PLRD"),
   Result(property = "PLRP", column = "PLRP"),
   Result(property = "PM", column = "PM"),
   Result(property = "PLINPUT", column = "PLINPUT"),
   Result(property = "PLOUTPUT", column = "PLOUTPUT"),
   Result(property = "PLEXECTYPE", column = "PLEXECTYPE"),
   Result(property = "PLSYSTEMNAME", column = "PLSYSTEMNAME"),
   Result(property = "PLAWSPID", column = "PLAWSPID"),
   Result(property = "PLDIAGRAMURL", column = "PLDIAGRAMURL"),
   Result(property = "PLCOLOR", column = "PLCOLOR"),
   Result(property = "PLCATEGORY", column = "PLCATEGORY"),
   Result(property = "PLMETHODID", column = "PLMETHODID"),
   Result(property = "PLVER", column = "PLVER"),
   Result(property = "PLVERSIONID", column = "PLVERSIONID"),
   Result(property = "ISUSE", column = "ISUSE"),
   Result(property = "ISPUBLISH", column = "ISPUBLISH"),
   Result(property = "ISSYSTEMFILE", column = "ISSYSTEMFILE"),
   Result(property = "FILEPATH", column = "FILEPATH"),
   Result(property = "HISTORYMAXVERSION", column = "HISTORYMAXVERSION"),
   Result(property = "VIEWCOUNT", column = "VIEWCOUNT"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "MODIFYUSER", column = "MODIFYUSER"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "MODIFYDATE", column = "MODIFYDATE"),
   Result(property = "PLDUTYDEPT", column = "PLDUTYDEPT"),
   Result(property = "PLDUTYPERSON", column = "PLDUTYPERSON")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_repository
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_repository_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "PLRID", column = "PLRID"),
   Result(property = "PLNO", column = "PLNO"),
   Result(property = "PLNAME", column = "PLNAME"),
   Result(property = "PLLEVEL", column = "PLLEVEL"),
   Result(property = "PLPARENTID", column = "PLPARENTID"),
   Result(property = "PLORDERINDEX", column = "PLORDERINDEX"),
   Result(property = "PLISBOTTOMLEVEL", column = "PLISBOTTOMLEVEL"),
   Result(property = "PLDESC", column = "PLDESC"),
   Result(property = "PLRD", column = "PLRD"),
   Result(property = "PLRP", column = "PLRP"),
   Result(property = "PM", column = "PM"),
   Result(property = "PLINPUT", column = "PLINPUT"),
   Result(property = "PLOUTPUT", column = "PLOUTPUT"),
   Result(property = "PLEXECTYPE", column = "PLEXECTYPE"),
   Result(property = "PLSYSTEMNAME", column = "PLSYSTEMNAME"),
   Result(property = "PLAWSPID", column = "PLAWSPID"),
   Result(property = "PLDIAGRAMURL", column = "PLDIAGRAMURL"),
   Result(property = "PLCOLOR", column = "PLCOLOR"),
   Result(property = "PLCATEGORY", column = "PLCATEGORY"),
   Result(property = "PLMETHODID", column = "PLMETHODID"),
   Result(property = "PLVER", column = "PLVER"),
   Result(property = "PLVERSIONID", column = "PLVERSIONID"),
   Result(property = "ISUSE", column = "ISUSE"),
   Result(property = "ISPUBLISH", column = "ISPUBLISH"),
   Result(property = "ISSYSTEMFILE", column = "ISSYSTEMFILE"),
   Result(property = "FILEPATH", column = "FILEPATH"),
   Result(property = "HISTORYMAXVERSION", column = "HISTORYMAXVERSION"),
   Result(property = "VIEWCOUNT", column = "VIEWCOUNT"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "MODIFYUSER", column = "MODIFYUSER"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "MODIFYDATE", column = "MODIFYDATE"),
   Result(property = "PLDUTYDEPT", column = "PLDUTYDEPT"),
   Result(property = "PLDUTYPERSON", column = "PLDUTYPERSON")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_repository
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="WSID!=null">
      WSID=#{WSID}
   </if> 
   <if test="PLRID!=null">
      PLRID=#{PLRID}
   </if> 
   <if test="PLNO!=null">
      PLNO=#{PLNO}
   </if> 
   <if test="PLNAME!=null">
      PLNAME=#{PLNAME}
   </if> 
   <if test="PLLEVEL!=null">
      PLLEVEL=#{PLLEVEL}
   </if> 
   <if test="PLPARENTID!=null">
      PLPARENTID=#{PLPARENTID}
   </if> 
   <if test="PLORDERINDEX!=null">
      PLORDERINDEX=#{PLORDERINDEX}
   </if> 
   <if test="PLISBOTTOMLEVEL!=null">
      PLISBOTTOMLEVEL=#{PLISBOTTOMLEVEL}
   </if> 
   <if test="PLDESC!=null">
      PLDESC=#{PLDESC}
   </if> 
   <if test="PLRD!=null">
      PLRD=#{PLRD}
   </if> 
   <if test="PLRP!=null">
      PLRP=#{PLRP}
   </if> 
   <if test="PM!=null">
      PM=#{PM}
   </if> 
   <if test="PLINPUT!=null">
      PLINPUT=#{PLINPUT}
   </if> 
   <if test="PLOUTPUT!=null">
      PLOUTPUT=#{PLOUTPUT}
   </if> 
   <if test="PLEXECTYPE!=null">
      PLEXECTYPE=#{PLEXECTYPE}
   </if> 
   <if test="PLSYSTEMNAME!=null">
      PLSYSTEMNAME=#{PLSYSTEMNAME}
   </if> 
   <if test="PLAWSPID!=null">
      PLAWSPID=#{PLAWSPID}
   </if> 
   <if test="PLDIAGRAMURL!=null">
      PLDIAGRAMURL=#{PLDIAGRAMURL}
   </if> 
   <if test="PLCOLOR!=null">
      PLCOLOR=#{PLCOLOR}
   </if> 
   <if test="PLCATEGORY!=null">
      PLCATEGORY=#{PLCATEGORY}
   </if> 
   <if test="PLMETHODID!=null">
      PLMETHODID=#{PLMETHODID}
   </if> 
   <if test="PLVER!=null">
      PLVER=#{PLVER}
   </if> 
   <if test="PLVERSIONID!=null">
      PLVERSIONID=#{PLVERSIONID}
   </if> 
   <if test="ISUSE!=null">
      ISUSE=#{ISUSE}
   </if> 
   <if test="ISPUBLISH!=null">
      ISPUBLISH=#{ISPUBLISH}
   </if> 
   <if test="ISSYSTEMFILE!=null">
      ISSYSTEMFILE=#{ISSYSTEMFILE}
   </if> 
   <if test="FILEPATH!=null">
      FILEPATH=#{FILEPATH}
   </if> 
   <if test="HISTORYMAXVERSION!=null">
      HISTORYMAXVERSION=#{HISTORYMAXVERSION}
   </if> 
   <if test="VIEWCOUNT!=null">
      VIEWCOUNT=#{VIEWCOUNT}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="MODIFYUSER!=null">
      MODIFYUSER=#{MODIFYUSER}
   </if> 
   <if test="CREATEDATE!=null">
      CREATEDATE=#{CREATEDATE}
   </if> 
   <if test="MODIFYDATE!=null">
      MODIFYDATE=#{MODIFYDATE}
   </if> 
   <if test="PLDUTYDEPT!=null">
      PLDUTYDEPT=#{PLDUTYDEPT}
   </if> 
   <if test="PLDUTYPERSON!=null">
      PLDUTYPERSON=#{PLDUTYPERSON}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_repository_dto):ArrayList<sys_coe_pal_repository_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "PLRID", column = "PLRID"),
   Result(property = "PLNO", column = "PLNO"),
   Result(property = "PLNAME", column = "PLNAME"),
   Result(property = "PLLEVEL", column = "PLLEVEL"),
   Result(property = "PLPARENTID", column = "PLPARENTID"),
   Result(property = "PLORDERINDEX", column = "PLORDERINDEX"),
   Result(property = "PLISBOTTOMLEVEL", column = "PLISBOTTOMLEVEL"),
   Result(property = "PLDESC", column = "PLDESC"),
   Result(property = "PLRD", column = "PLRD"),
   Result(property = "PLRP", column = "PLRP"),
   Result(property = "PM", column = "PM"),
   Result(property = "PLINPUT", column = "PLINPUT"),
   Result(property = "PLOUTPUT", column = "PLOUTPUT"),
   Result(property = "PLEXECTYPE", column = "PLEXECTYPE"),
   Result(property = "PLSYSTEMNAME", column = "PLSYSTEMNAME"),
   Result(property = "PLAWSPID", column = "PLAWSPID"),
   Result(property = "PLDIAGRAMURL", column = "PLDIAGRAMURL"),
   Result(property = "PLCOLOR", column = "PLCOLOR"),
   Result(property = "PLCATEGORY", column = "PLCATEGORY"),
   Result(property = "PLMETHODID", column = "PLMETHODID"),
   Result(property = "PLVER", column = "PLVER"),
   Result(property = "PLVERSIONID", column = "PLVERSIONID"),
   Result(property = "ISUSE", column = "ISUSE"),
   Result(property = "ISPUBLISH", column = "ISPUBLISH"),
   Result(property = "ISSYSTEMFILE", column = "ISSYSTEMFILE"),
   Result(property = "FILEPATH", column = "FILEPATH"),
   Result(property = "HISTORYMAXVERSION", column = "HISTORYMAXVERSION"),
   Result(property = "VIEWCOUNT", column = "VIEWCOUNT"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "MODIFYUSER", column = "MODIFYUSER"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "MODIFYDATE", column = "MODIFYDATE"),
   Result(property = "PLDUTYDEPT", column = "PLDUTYDEPT"),
   Result(property = "PLDUTYPERSON", column = "PLDUTYPERSON")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_repository
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_repository_dto):sys_coe_pal_repository_dto?
                


@Insert("""<script>
    insert into sys_coe_pal_repository
    (ID,WSID,PLRID,PLNO,PLNAME,PLLEVEL,PLPARENTID,PLORDERINDEX,PLISBOTTOMLEVEL,PLDESC,PLRD,PLRP,PM,PLINPUT,PLOUTPUT,PLEXECTYPE,PLSYSTEMNAME,PLAWSPID,PLDIAGRAMURL,PLCOLOR,PLCATEGORY,PLMETHODID,PLVER,PLVERSIONID,ISUSE,ISPUBLISH,ISSYSTEMFILE,FILEPATH,HISTORYMAXVERSION,VIEWCOUNT,CREATEUSER,MODIFYUSER,CREATEDATE,MODIFYDATE,PLDUTYDEPT,PLDUTYPERSON)
    values
    (#{ID},#{WSID},#{PLRID},#{PLNO},#{PLNAME},#{PLLEVEL},#{PLPARENTID},#{PLORDERINDEX},#{PLISBOTTOMLEVEL},#{PLDESC},#{PLRD},#{PLRP},#{PM},#{PLINPUT},#{PLOUTPUT},#{PLEXECTYPE},#{PLSYSTEMNAME},#{PLAWSPID},#{PLDIAGRAMURL},#{PLCOLOR},#{PLCATEGORY},#{PLMETHODID},#{PLVER},#{PLVERSIONID},#{ISUSE},#{ISPUBLISH},#{ISSYSTEMFILE},#{FILEPATH},#{HISTORYMAXVERSION},#{VIEWCOUNT},#{CREATEUSER},#{MODIFYUSER},#{CREATEDATE},#{MODIFYDATE},#{PLDUTYDEPT},#{PLDUTYPERSON})
</script>""")
fun Insert(model:sys_coe_pal_repository_dto):Unit
                


@Insert("""<script>
    insert into sys_coe_pal_repository
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='WSID!= null'> 
           WSID,
        </if>
        <if test='PLRID!= null'> 
           PLRID,
        </if>
        <if test='PLNO!= null'> 
           PLNO,
        </if>
        <if test='PLNAME!= null'> 
           PLNAME,
        </if>
        <if test='PLLEVEL!= null'> 
           PLLEVEL,
        </if>
        <if test='PLPARENTID!= null'> 
           PLPARENTID,
        </if>
        <if test='PLORDERINDEX!= null'> 
           PLORDERINDEX,
        </if>
        <if test='PLISBOTTOMLEVEL!= null'> 
           PLISBOTTOMLEVEL,
        </if>
        <if test='PLDESC!= null'> 
           PLDESC,
        </if>
        <if test='PLRD!= null'> 
           PLRD,
        </if>
        <if test='PLRP!= null'> 
           PLRP,
        </if>
        <if test='PM!= null'> 
           PM,
        </if>
        <if test='PLINPUT!= null'> 
           PLINPUT,
        </if>
        <if test='PLOUTPUT!= null'> 
           PLOUTPUT,
        </if>
        <if test='PLEXECTYPE!= null'> 
           PLEXECTYPE,
        </if>
        <if test='PLSYSTEMNAME!= null'> 
           PLSYSTEMNAME,
        </if>
        <if test='PLAWSPID!= null'> 
           PLAWSPID,
        </if>
        <if test='PLDIAGRAMURL!= null'> 
           PLDIAGRAMURL,
        </if>
        <if test='PLCOLOR!= null'> 
           PLCOLOR,
        </if>
        <if test='PLCATEGORY!= null'> 
           PLCATEGORY,
        </if>
        <if test='PLMETHODID!= null'> 
           PLMETHODID,
        </if>
        <if test='PLVER!= null'> 
           PLVER,
        </if>
        <if test='PLVERSIONID!= null'> 
           PLVERSIONID,
        </if>
        <if test='ISUSE!= null'> 
           ISUSE,
        </if>
        <if test='ISPUBLISH!= null'> 
           ISPUBLISH,
        </if>
        <if test='ISSYSTEMFILE!= null'> 
           ISSYSTEMFILE,
        </if>
        <if test='FILEPATH!= null'> 
           FILEPATH,
        </if>
        <if test='HISTORYMAXVERSION!= null'> 
           HISTORYMAXVERSION,
        </if>
        <if test='VIEWCOUNT!= null'> 
           VIEWCOUNT,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='MODIFYUSER!= null'> 
           MODIFYUSER,
        </if>
        <if test='CREATEDATE!= null'> 
           CREATEDATE,
        </if>
        <if test='MODIFYDATE!= null'> 
           MODIFYDATE,
        </if>
        <if test='PLDUTYDEPT!= null'> 
           PLDUTYDEPT,
        </if>
        <if test='PLDUTYPERSON!= null'> 
           PLDUTYPERSON
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='WSID!= null'> 
           #{WSID,jdbcType=char}，
        </if>
        <if test='PLRID!= null'> 
           #{PLRID,jdbcType=char}，
        </if>
        <if test='PLNO!= null'> 
           #{PLNO,jdbcType=varchar}，
        </if>
        <if test='PLNAME!= null'> 
           #{PLNAME,jdbcType=varchar}，
        </if>
        <if test='PLLEVEL!= null'> 
           #{PLLEVEL,jdbcType=smallint}，
        </if>
        <if test='PLPARENTID!= null'> 
           #{PLPARENTID,jdbcType=varchar}，
        </if>
        <if test='PLORDERINDEX!= null'> 
           #{PLORDERINDEX,jdbcType=smallint}，
        </if>
        <if test='PLISBOTTOMLEVEL!= null'> 
           #{PLISBOTTOMLEVEL,jdbcType=smallint}，
        </if>
        <if test='PLDESC!= null'> 
           #{PLDESC,jdbcType=text}，
        </if>
        <if test='PLRD!= null'> 
           #{PLRD,jdbcType=varchar}，
        </if>
        <if test='PLRP!= null'> 
           #{PLRP,jdbcType=varchar}，
        </if>
        <if test='PM!= null'> 
           #{PM,jdbcType=varchar}，
        </if>
        <if test='PLINPUT!= null'> 
           #{PLINPUT,jdbcType=varchar}，
        </if>
        <if test='PLOUTPUT!= null'> 
           #{PLOUTPUT,jdbcType=varchar}，
        </if>
        <if test='PLEXECTYPE!= null'> 
           #{PLEXECTYPE,jdbcType=smallint}，
        </if>
        <if test='PLSYSTEMNAME!= null'> 
           #{PLSYSTEMNAME,jdbcType=varchar}，
        </if>
        <if test='PLAWSPID!= null'> 
           #{PLAWSPID,jdbcType=char}，
        </if>
        <if test='PLDIAGRAMURL!= null'> 
           #{PLDIAGRAMURL,jdbcType=varchar}，
        </if>
        <if test='PLCOLOR!= null'> 
           #{PLCOLOR,jdbcType=varchar}，
        </if>
        <if test='PLCATEGORY!= null'> 
           #{PLCATEGORY,jdbcType=varchar}，
        </if>
        <if test='PLMETHODID!= null'> 
           #{PLMETHODID,jdbcType=varchar}，
        </if>
        <if test='PLVER!= null'> 
           #{PLVER,jdbcType=smallint}，
        </if>
        <if test='PLVERSIONID!= null'> 
           #{PLVERSIONID,jdbcType=char}，
        </if>
        <if test='ISUSE!= null'> 
           #{ISUSE,jdbcType=smallint}，
        </if>
        <if test='ISPUBLISH!= null'> 
           #{ISPUBLISH,jdbcType=smallint}，
        </if>
        <if test='ISSYSTEMFILE!= null'> 
           #{ISSYSTEMFILE,jdbcType=smallint}，
        </if>
        <if test='FILEPATH!= null'> 
           #{FILEPATH,jdbcType=varchar}，
        </if>
        <if test='HISTORYMAXVERSION!= null'> 
           #{HISTORYMAXVERSION,jdbcType=decimal}，
        </if>
        <if test='VIEWCOUNT!= null'> 
           #{VIEWCOUNT,jdbcType=decimal}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='MODIFYUSER!= null'> 
           #{MODIFYUSER,jdbcType=varchar}，
        </if>
        <if test='CREATEDATE!= null'> 
           #{CREATEDATE,jdbcType=datetime}，
        </if>
        <if test='MODIFYDATE!= null'> 
           #{MODIFYDATE,jdbcType=datetime}，
        </if>
        <if test='PLDUTYDEPT!= null'> 
           #{PLDUTYDEPT,jdbcType=varchar}，
        </if>
        <if test='PLDUTYPERSON!= null'> 
           #{PLDUTYPERSON,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_coe_pal_repository_dto):Unit
                

}

        
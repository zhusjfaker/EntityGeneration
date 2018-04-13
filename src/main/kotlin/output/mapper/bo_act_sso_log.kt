

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_act_sso_log{


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
   Result(property = "OPTTYPE", column = "OPTTYPE"),
   Result(property = "OPTSTATE", column = "OPTSTATE"),
   Result(property = "SSOID", column = "SSOID"),
   Result(property = "SSONAME", column = "SSONAME"),
   Result(property = "OPTTIME", column = "OPTTIME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "USERNAME", column = "USERNAME"),
   Result(property = "OPTIP", column = "OPTIP"),
   Result(property = "DEPTID", column = "DEPTID"),
   Result(property = "DEPTNAME", column = "DEPTNAME"),
   Result(property = "COMPANYID", column = "COMPANYID"),
   Result(property = "COMPANYNAME", column = "COMPANYNAME")
)
@Select("""<script>
   SELECT * FROM bo_act_sso_log
</script>""")
fun GetListAll():ArrayList<bo_act_sso_log_dto>
        


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
   Result(property = "OPTTYPE", column = "OPTTYPE"),
   Result(property = "OPTSTATE", column = "OPTSTATE"),
   Result(property = "SSOID", column = "SSOID"),
   Result(property = "SSONAME", column = "SSONAME"),
   Result(property = "OPTTIME", column = "OPTTIME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "USERNAME", column = "USERNAME"),
   Result(property = "OPTIP", column = "OPTIP"),
   Result(property = "DEPTID", column = "DEPTID"),
   Result(property = "DEPTNAME", column = "DEPTNAME"),
   Result(property = "COMPANYID", column = "COMPANYID"),
   Result(property = "COMPANYNAME", column = "COMPANYNAME")
)
@Select("""<script>
   SELECT * FROM bo_act_sso_log
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
   <if test="OPTTYPE!=null">
      OPTTYPE=#{OPTTYPE}
   </if> 
   <if test="OPTSTATE!=null">
      OPTSTATE=#{OPTSTATE}
   </if> 
   <if test="SSOID!=null">
      SSOID=#{SSOID}
   </if> 
   <if test="SSONAME!=null">
      SSONAME=#{SSONAME}
   </if> 
   <if test="OPTTIME!=null">
      OPTTIME=#{OPTTIME}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="USERNAME!=null">
      USERNAME=#{USERNAME}
   </if> 
   <if test="OPTIP!=null">
      OPTIP=#{OPTIP}
   </if> 
   <if test="DEPTID!=null">
      DEPTID=#{DEPTID}
   </if> 
   <if test="DEPTNAME!=null">
      DEPTNAME=#{DEPTNAME}
   </if> 
   <if test="COMPANYID!=null">
      COMPANYID=#{COMPANYID}
   </if> 
   <if test="COMPANYNAME!=null">
      COMPANYNAME=#{COMPANYNAME}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:bo_act_sso_log_dto):ArrayList<bo_act_sso_log_dto>
                


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
   Result(property = "OPTTYPE", column = "OPTTYPE"),
   Result(property = "OPTSTATE", column = "OPTSTATE"),
   Result(property = "SSOID", column = "SSOID"),
   Result(property = "SSONAME", column = "SSONAME"),
   Result(property = "OPTTIME", column = "OPTTIME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "USERNAME", column = "USERNAME"),
   Result(property = "OPTIP", column = "OPTIP"),
   Result(property = "DEPTID", column = "DEPTID"),
   Result(property = "DEPTNAME", column = "DEPTNAME"),
   Result(property = "COMPANYID", column = "COMPANYID"),
   Result(property = "COMPANYNAME", column = "COMPANYNAME")
)
@Select("""<script>
   SELECT * FROM bo_act_sso_log
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:bo_act_sso_log_dto):bo_act_sso_log_dto?
                


@Insert("""<script>
    insert into bo_act_sso_log
    (ID,ORGID,BINDID,CREATEDATE,CREATEUSER,UPDATEDATE,UPDATEUSER,PROCESSDEFID,ISEND,OPTTYPE,OPTSTATE,SSOID,SSONAME,OPTTIME,USERID,USERNAME,OPTIP,DEPTID,DEPTNAME,COMPANYID,COMPANYNAME)
    values
    (#{ID},#{ORGID},#{BINDID},#{CREATEDATE},#{CREATEUSER},#{UPDATEDATE},#{UPDATEUSER},#{PROCESSDEFID},#{ISEND},#{OPTTYPE},#{OPTSTATE},#{SSOID},#{SSONAME},#{OPTTIME},#{USERID},#{USERNAME},#{OPTIP},#{DEPTID},#{DEPTNAME},#{COMPANYID},#{COMPANYNAME})
</script>""")
fun Insert(model:bo_act_sso_log_dto):Unit
                


@Insert("""<script>
    insert into bo_act_sso_log
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
        <if test='OPTTYPE!= null'> 
           OPTTYPE,
        </if>
        <if test='OPTSTATE!= null'> 
           OPTSTATE,
        </if>
        <if test='SSOID!= null'> 
           SSOID,
        </if>
        <if test='SSONAME!= null'> 
           SSONAME,
        </if>
        <if test='OPTTIME!= null'> 
           OPTTIME,
        </if>
        <if test='USERID!= null'> 
           USERID,
        </if>
        <if test='USERNAME!= null'> 
           USERNAME,
        </if>
        <if test='OPTIP!= null'> 
           OPTIP,
        </if>
        <if test='DEPTID!= null'> 
           DEPTID,
        </if>
        <if test='DEPTNAME!= null'> 
           DEPTNAME,
        </if>
        <if test='COMPANYID!= null'> 
           COMPANYID,
        </if>
        <if test='COMPANYNAME!= null'> 
           COMPANYNAME
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
        <if test='OPTTYPE!= null'> 
           #{OPTTYPE,jdbcType=varchar}，
        </if>
        <if test='OPTSTATE!= null'> 
           #{OPTSTATE,jdbcType=varchar}，
        </if>
        <if test='SSOID!= null'> 
           #{SSOID,jdbcType=varchar}，
        </if>
        <if test='SSONAME!= null'> 
           #{SSONAME,jdbcType=varchar}，
        </if>
        <if test='OPTTIME!= null'> 
           #{OPTTIME,jdbcType=datetime}，
        </if>
        <if test='USERID!= null'> 
           #{USERID,jdbcType=varchar}，
        </if>
        <if test='USERNAME!= null'> 
           #{USERNAME,jdbcType=varchar}，
        </if>
        <if test='OPTIP!= null'> 
           #{OPTIP,jdbcType=varchar}，
        </if>
        <if test='DEPTID!= null'> 
           #{DEPTID,jdbcType=varchar}，
        </if>
        <if test='DEPTNAME!= null'> 
           #{DEPTNAME,jdbcType=varchar}，
        </if>
        <if test='COMPANYID!= null'> 
           #{COMPANYID,jdbcType=varchar}，
        </if>
        <if test='COMPANYNAME!= null'> 
           #{COMPANYNAME,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:bo_act_sso_log_dto):Unit
                

}

        
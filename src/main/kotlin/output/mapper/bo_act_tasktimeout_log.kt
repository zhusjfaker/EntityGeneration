

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_act_tasktimeout_log{


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
   Result(property = "YEAR", column = "YEAR"),
   Result(property = "MONTH", column = "MONTH"),
   Result(property = "DAY", column = "DAY"),
   Result(property = "HM", column = "HM"),
   Result(property = "PINSTID", column = "PINSTID"),
   Result(property = "TINSTID", column = "TINSTID"),
   Result(property = "TASKTITLE", column = "TASKTITLE"),
   Result(property = "KPISCORE", column = "KPISCORE"),
   Result(property = "EXECMEMO", column = "EXECMEMO"),
   Result(property = "COMPANYID", column = "COMPANYID"),
   Result(property = "COMPANYNAME", column = "COMPANYNAME"),
   Result(property = "DEPTID", column = "DEPTID"),
   Result(property = "DEPTNAME", column = "DEPTNAME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "USERNAME", column = "USERNAME"),
   Result(property = "ROLEID", column = "ROLEID"),
   Result(property = "ROLENAME", column = "ROLENAME"),
   Result(property = "POLICYID", column = "POLICYID"),
   Result(property = "RECORDTIME", column = "RECORDTIME"),
   Result(property = "PDEFID", column = "PDEFID"),
   Result(property = "TDEFID", column = "TDEFID"),
   Result(property = "ACTIONTYPE", column = "ACTIONTYPE")
)
@Select("""<script>
   SELECT * FROM bo_act_tasktimeout_log
</script>""")
fun GetListAll():ArrayList<bo_act_tasktimeout_log_dto>
        


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
   Result(property = "YEAR", column = "YEAR"),
   Result(property = "MONTH", column = "MONTH"),
   Result(property = "DAY", column = "DAY"),
   Result(property = "HM", column = "HM"),
   Result(property = "PINSTID", column = "PINSTID"),
   Result(property = "TINSTID", column = "TINSTID"),
   Result(property = "TASKTITLE", column = "TASKTITLE"),
   Result(property = "KPISCORE", column = "KPISCORE"),
   Result(property = "EXECMEMO", column = "EXECMEMO"),
   Result(property = "COMPANYID", column = "COMPANYID"),
   Result(property = "COMPANYNAME", column = "COMPANYNAME"),
   Result(property = "DEPTID", column = "DEPTID"),
   Result(property = "DEPTNAME", column = "DEPTNAME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "USERNAME", column = "USERNAME"),
   Result(property = "ROLEID", column = "ROLEID"),
   Result(property = "ROLENAME", column = "ROLENAME"),
   Result(property = "POLICYID", column = "POLICYID"),
   Result(property = "RECORDTIME", column = "RECORDTIME"),
   Result(property = "PDEFID", column = "PDEFID"),
   Result(property = "TDEFID", column = "TDEFID"),
   Result(property = "ACTIONTYPE", column = "ACTIONTYPE")
)
@Select("""<script>
   SELECT * FROM bo_act_tasktimeout_log
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
   <if test="YEAR!=null">
      YEAR=#{YEAR}
   </if> 
   <if test="MONTH!=null">
      MONTH=#{MONTH}
   </if> 
   <if test="DAY!=null">
      DAY=#{DAY}
   </if> 
   <if test="HM!=null">
      HM=#{HM}
   </if> 
   <if test="PINSTID!=null">
      PINSTID=#{PINSTID}
   </if> 
   <if test="TINSTID!=null">
      TINSTID=#{TINSTID}
   </if> 
   <if test="TASKTITLE!=null">
      TASKTITLE=#{TASKTITLE}
   </if> 
   <if test="KPISCORE!=null">
      KPISCORE=#{KPISCORE}
   </if> 
   <if test="EXECMEMO!=null">
      EXECMEMO=#{EXECMEMO}
   </if> 
   <if test="COMPANYID!=null">
      COMPANYID=#{COMPANYID}
   </if> 
   <if test="COMPANYNAME!=null">
      COMPANYNAME=#{COMPANYNAME}
   </if> 
   <if test="DEPTID!=null">
      DEPTID=#{DEPTID}
   </if> 
   <if test="DEPTNAME!=null">
      DEPTNAME=#{DEPTNAME}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="USERNAME!=null">
      USERNAME=#{USERNAME}
   </if> 
   <if test="ROLEID!=null">
      ROLEID=#{ROLEID}
   </if> 
   <if test="ROLENAME!=null">
      ROLENAME=#{ROLENAME}
   </if> 
   <if test="POLICYID!=null">
      POLICYID=#{POLICYID}
   </if> 
   <if test="RECORDTIME!=null">
      RECORDTIME=#{RECORDTIME}
   </if> 
   <if test="PDEFID!=null">
      PDEFID=#{PDEFID}
   </if> 
   <if test="TDEFID!=null">
      TDEFID=#{TDEFID}
   </if> 
   <if test="ACTIONTYPE!=null">
      ACTIONTYPE=#{ACTIONTYPE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:bo_act_tasktimeout_log_dto):ArrayList<bo_act_tasktimeout_log_dto>
                


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
   Result(property = "YEAR", column = "YEAR"),
   Result(property = "MONTH", column = "MONTH"),
   Result(property = "DAY", column = "DAY"),
   Result(property = "HM", column = "HM"),
   Result(property = "PINSTID", column = "PINSTID"),
   Result(property = "TINSTID", column = "TINSTID"),
   Result(property = "TASKTITLE", column = "TASKTITLE"),
   Result(property = "KPISCORE", column = "KPISCORE"),
   Result(property = "EXECMEMO", column = "EXECMEMO"),
   Result(property = "COMPANYID", column = "COMPANYID"),
   Result(property = "COMPANYNAME", column = "COMPANYNAME"),
   Result(property = "DEPTID", column = "DEPTID"),
   Result(property = "DEPTNAME", column = "DEPTNAME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "USERNAME", column = "USERNAME"),
   Result(property = "ROLEID", column = "ROLEID"),
   Result(property = "ROLENAME", column = "ROLENAME"),
   Result(property = "POLICYID", column = "POLICYID"),
   Result(property = "RECORDTIME", column = "RECORDTIME"),
   Result(property = "PDEFID", column = "PDEFID"),
   Result(property = "TDEFID", column = "TDEFID"),
   Result(property = "ACTIONTYPE", column = "ACTIONTYPE")
)
@Select("""<script>
   SELECT * FROM bo_act_tasktimeout_log
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:bo_act_tasktimeout_log_dto):bo_act_tasktimeout_log_dto?
                


@Insert("""<script>
    insert into bo_act_tasktimeout_log
    (ID,ORGID,BINDID,CREATEDATE,CREATEUSER,UPDATEDATE,UPDATEUSER,PROCESSDEFID,ISEND,YEAR,MONTH,DAY,HM,PINSTID,TINSTID,TASKTITLE,KPISCORE,EXECMEMO,COMPANYID,COMPANYNAME,DEPTID,DEPTNAME,USERID,USERNAME,ROLEID,ROLENAME,POLICYID,RECORDTIME,PDEFID,TDEFID,ACTIONTYPE)
    values
    (#{ID},#{ORGID},#{BINDID},#{CREATEDATE},#{CREATEUSER},#{UPDATEDATE},#{UPDATEUSER},#{PROCESSDEFID},#{ISEND},#{YEAR},#{MONTH},#{DAY},#{HM},#{PINSTID},#{TINSTID},#{TASKTITLE},#{KPISCORE},#{EXECMEMO},#{COMPANYID},#{COMPANYNAME},#{DEPTID},#{DEPTNAME},#{USERID},#{USERNAME},#{ROLEID},#{ROLENAME},#{POLICYID},#{RECORDTIME},#{PDEFID},#{TDEFID},#{ACTIONTYPE})
</script>""")
fun Insert(model:bo_act_tasktimeout_log_dto):Unit
                


@Insert("""<script>
    insert into bo_act_tasktimeout_log
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
        <if test='YEAR!= null'> 
           YEAR,
        </if>
        <if test='MONTH!= null'> 
           MONTH,
        </if>
        <if test='DAY!= null'> 
           DAY,
        </if>
        <if test='HM!= null'> 
           HM,
        </if>
        <if test='PINSTID!= null'> 
           PINSTID,
        </if>
        <if test='TINSTID!= null'> 
           TINSTID,
        </if>
        <if test='TASKTITLE!= null'> 
           TASKTITLE,
        </if>
        <if test='KPISCORE!= null'> 
           KPISCORE,
        </if>
        <if test='EXECMEMO!= null'> 
           EXECMEMO,
        </if>
        <if test='COMPANYID!= null'> 
           COMPANYID,
        </if>
        <if test='COMPANYNAME!= null'> 
           COMPANYNAME,
        </if>
        <if test='DEPTID!= null'> 
           DEPTID,
        </if>
        <if test='DEPTNAME!= null'> 
           DEPTNAME,
        </if>
        <if test='USERID!= null'> 
           USERID,
        </if>
        <if test='USERNAME!= null'> 
           USERNAME,
        </if>
        <if test='ROLEID!= null'> 
           ROLEID,
        </if>
        <if test='ROLENAME!= null'> 
           ROLENAME,
        </if>
        <if test='POLICYID!= null'> 
           POLICYID,
        </if>
        <if test='RECORDTIME!= null'> 
           RECORDTIME,
        </if>
        <if test='PDEFID!= null'> 
           PDEFID,
        </if>
        <if test='TDEFID!= null'> 
           TDEFID,
        </if>
        <if test='ACTIONTYPE!= null'> 
           ACTIONTYPE
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
        <if test='YEAR!= null'> 
           #{YEAR,jdbcType=decimal}，
        </if>
        <if test='MONTH!= null'> 
           #{MONTH,jdbcType=decimal}，
        </if>
        <if test='DAY!= null'> 
           #{DAY,jdbcType=decimal}，
        </if>
        <if test='HM!= null'> 
           #{HM,jdbcType=varchar}，
        </if>
        <if test='PINSTID!= null'> 
           #{PINSTID,jdbcType=varchar}，
        </if>
        <if test='TINSTID!= null'> 
           #{TINSTID,jdbcType=varchar}，
        </if>
        <if test='TASKTITLE!= null'> 
           #{TASKTITLE,jdbcType=varchar}，
        </if>
        <if test='KPISCORE!= null'> 
           #{KPISCORE,jdbcType=decimal}，
        </if>
        <if test='EXECMEMO!= null'> 
           #{EXECMEMO,jdbcType=text}，
        </if>
        <if test='COMPANYID!= null'> 
           #{COMPANYID,jdbcType=varchar}，
        </if>
        <if test='COMPANYNAME!= null'> 
           #{COMPANYNAME,jdbcType=varchar}，
        </if>
        <if test='DEPTID!= null'> 
           #{DEPTID,jdbcType=varchar}，
        </if>
        <if test='DEPTNAME!= null'> 
           #{DEPTNAME,jdbcType=varchar}，
        </if>
        <if test='USERID!= null'> 
           #{USERID,jdbcType=varchar}，
        </if>
        <if test='USERNAME!= null'> 
           #{USERNAME,jdbcType=varchar}，
        </if>
        <if test='ROLEID!= null'> 
           #{ROLEID,jdbcType=varchar}，
        </if>
        <if test='ROLENAME!= null'> 
           #{ROLENAME,jdbcType=varchar}，
        </if>
        <if test='POLICYID!= null'> 
           #{POLICYID,jdbcType=varchar}，
        </if>
        <if test='RECORDTIME!= null'> 
           #{RECORDTIME,jdbcType=datetime}，
        </if>
        <if test='PDEFID!= null'> 
           #{PDEFID,jdbcType=varchar}，
        </if>
        <if test='TDEFID!= null'> 
           #{TDEFID,jdbcType=varchar}，
        </if>
        <if test='ACTIONTYPE!= null'> 
           #{ACTIONTYPE,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:bo_act_tasktimeout_log_dto):Unit
                

}

        
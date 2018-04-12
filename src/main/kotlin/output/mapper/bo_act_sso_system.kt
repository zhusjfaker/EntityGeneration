

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_act_sso_system{


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
   Result(property = "SSONAME", column = "SSONAME"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "ICON32", column = "ICON32"),
   Result(property = "ICON96", column = "ICON96"),
   Result(property = "LOGINURL", column = "LOGINURL"),
   Result(property = "SUBMITTYPE", column = "SUBMITTYPE"),
   Result(property = "LOGINTARGET", column = "LOGINTARGET"),
   Result(property = "ISACTIVE", column = "ISACTIVE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "ACCESSKEY", column = "ACCESSKEY"),
   Result(property = "SEC", column = "SEC")
)
@Select("""<script>
   SELECT * FROM bo_act_sso_system
</script>""")
fun GetListAll():ArrayList<bo_act_sso_system_dto>
        


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
   Result(property = "SSONAME", column = "SSONAME"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "ICON32", column = "ICON32"),
   Result(property = "ICON96", column = "ICON96"),
   Result(property = "LOGINURL", column = "LOGINURL"),
   Result(property = "SUBMITTYPE", column = "SUBMITTYPE"),
   Result(property = "LOGINTARGET", column = "LOGINTARGET"),
   Result(property = "ISACTIVE", column = "ISACTIVE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "ACCESSKEY", column = "ACCESSKEY"),
   Result(property = "SEC", column = "SEC")
)
@Select("""<script>
   SELECT * FROM bo_act_sso_system
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
   <if test="SSONAME!=null">
      SSONAME=#{SSONAME}
   </if> 
   <if test="MEMO!=null">
      MEMO=#{MEMO}
   </if> 
   <if test="ICON32!=null">
      ICON32=#{ICON32}
   </if> 
   <if test="ICON96!=null">
      ICON96=#{ICON96}
   </if> 
   <if test="LOGINURL!=null">
      LOGINURL=#{LOGINURL}
   </if> 
   <if test="SUBMITTYPE!=null">
      SUBMITTYPE=#{SUBMITTYPE}
   </if> 
   <if test="LOGINTARGET!=null">
      LOGINTARGET=#{LOGINTARGET}
   </if> 
   <if test="ISACTIVE!=null">
      ISACTIVE=#{ISACTIVE}
   </if> 
   <if test="ORDERINDEX!=null">
      ORDERINDEX=#{ORDERINDEX}
   </if> 
   <if test="ACCESSKEY!=null">
      ACCESSKEY=#{ACCESSKEY}
   </if> 
   <if test="SEC!=null">
      SEC=#{SEC}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:bo_act_sso_system_dto):ArrayList<bo_act_sso_system_dto>
                


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
   Result(property = "SSONAME", column = "SSONAME"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "ICON32", column = "ICON32"),
   Result(property = "ICON96", column = "ICON96"),
   Result(property = "LOGINURL", column = "LOGINURL"),
   Result(property = "SUBMITTYPE", column = "SUBMITTYPE"),
   Result(property = "LOGINTARGET", column = "LOGINTARGET"),
   Result(property = "ISACTIVE", column = "ISACTIVE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "ACCESSKEY", column = "ACCESSKEY"),
   Result(property = "SEC", column = "SEC")
)
@Select("""<script>
   SELECT * FROM bo_act_sso_system
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:bo_act_sso_system_dto):bo_act_sso_system_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,ORGID,BINDID,CREATEDATE,CREATEUSER,UPDATEDATE,UPDATEUSER,PROCESSDEFID,ISEND,SSONAME,MEMO,ICON32,ICON96,LOGINURL,SUBMITTYPE,LOGINTARGET,ISACTIVE,ORDERINDEX,ACCESSKEY,SEC)
    values
    (#{ID},#{ORGID},#{BINDID},#{CREATEDATE},#{CREATEUSER},#{UPDATEDATE},#{UPDATEUSER},#{PROCESSDEFID},#{ISEND},#{SSONAME},#{MEMO},#{ICON32},#{ICON96},#{LOGINURL},#{SUBMITTYPE},#{LOGINTARGET},#{ISACTIVE},#{ORDERINDEX},#{ACCESSKEY},#{SEC})
</script>""")
fun insert(model:bo_act_sso_system_dto):Unit
                

}

        
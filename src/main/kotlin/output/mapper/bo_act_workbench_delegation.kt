

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_act_workbench_delegation{


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
   Result(property = "APPLICANTUSER", column = "APPLICANTUSER"),
   Result(property = "USERNAME", column = "USERNAME"),
   Result(property = "USERCOMPANY", column = "USERCOMPANY"),
   Result(property = "USERDEPT", column = "USERDEPT"),
   Result(property = "DELEGATEUSER", column = "DELEGATEUSER"),
   Result(property = "SCOPETYPE", column = "SCOPETYPE"),
   Result(property = "SCOPE", column = "SCOPE"),
   Result(property = "BEGIN_TIME", column = "BEGIN_TIME"),
   Result(property = "END_TIME", column = "END_TIME"),
   Result(property = "DELEGATEREASON", column = "DELEGATEREASON")
)
@Select("""<script>
   SELECT * FROM bo_act_workbench_delegation
</script>""")
fun GetListAll():ArrayList<bo_act_workbench_delegation_dto>
        


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
   Result(property = "APPLICANTUSER", column = "APPLICANTUSER"),
   Result(property = "USERNAME", column = "USERNAME"),
   Result(property = "USERCOMPANY", column = "USERCOMPANY"),
   Result(property = "USERDEPT", column = "USERDEPT"),
   Result(property = "DELEGATEUSER", column = "DELEGATEUSER"),
   Result(property = "SCOPETYPE", column = "SCOPETYPE"),
   Result(property = "SCOPE", column = "SCOPE"),
   Result(property = "BEGIN_TIME", column = "BEGIN_TIME"),
   Result(property = "END_TIME", column = "END_TIME"),
   Result(property = "DELEGATEREASON", column = "DELEGATEREASON")
)
@Select("""<script>
   SELECT * FROM bo_act_workbench_delegation
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
   <if test="APPLICANTUSER!=null">
      APPLICANTUSER=#{APPLICANTUSER}
   </if> 
   <if test="USERNAME!=null">
      USERNAME=#{USERNAME}
   </if> 
   <if test="USERCOMPANY!=null">
      USERCOMPANY=#{USERCOMPANY}
   </if> 
   <if test="USERDEPT!=null">
      USERDEPT=#{USERDEPT}
   </if> 
   <if test="DELEGATEUSER!=null">
      DELEGATEUSER=#{DELEGATEUSER}
   </if> 
   <if test="SCOPETYPE!=null">
      SCOPETYPE=#{SCOPETYPE}
   </if> 
   <if test="SCOPE!=null">
      SCOPE=#{SCOPE}
   </if> 
   <if test="BEGIN_TIME!=null">
      BEGIN_TIME=#{BEGIN_TIME}
   </if> 
   <if test="END_TIME!=null">
      END_TIME=#{END_TIME}
   </if> 
   <if test="DELEGATEREASON!=null">
      DELEGATEREASON=#{DELEGATEREASON}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:bo_act_workbench_delegation_dto):ArrayList<bo_act_workbench_delegation_dto>
                


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
   Result(property = "APPLICANTUSER", column = "APPLICANTUSER"),
   Result(property = "USERNAME", column = "USERNAME"),
   Result(property = "USERCOMPANY", column = "USERCOMPANY"),
   Result(property = "USERDEPT", column = "USERDEPT"),
   Result(property = "DELEGATEUSER", column = "DELEGATEUSER"),
   Result(property = "SCOPETYPE", column = "SCOPETYPE"),
   Result(property = "SCOPE", column = "SCOPE"),
   Result(property = "BEGIN_TIME", column = "BEGIN_TIME"),
   Result(property = "END_TIME", column = "END_TIME"),
   Result(property = "DELEGATEREASON", column = "DELEGATEREASON")
)
@Select("""<script>
   SELECT * FROM bo_act_workbench_delegation
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:bo_act_workbench_delegation_dto):bo_act_workbench_delegation_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,ORGID,BINDID,CREATEDATE,CREATEUSER,UPDATEDATE,UPDATEUSER,PROCESSDEFID,ISEND,APPLICANTUSER,USERNAME,USERCOMPANY,USERDEPT,DELEGATEUSER,SCOPETYPE,SCOPE,BEGIN_TIME,END_TIME,DELEGATEREASON)
    values
    (#{ID},#{ORGID},#{BINDID},#{CREATEDATE},#{CREATEUSER},#{UPDATEDATE},#{UPDATEUSER},#{PROCESSDEFID},#{ISEND},#{APPLICANTUSER},#{USERNAME},#{USERCOMPANY},#{USERDEPT},#{DELEGATEUSER},#{SCOPETYPE},#{SCOPE},#{BEGIN_TIME},#{END_TIME},#{DELEGATEREASON})
</script>""")
fun insert(model:bo_act_workbench_delegation_dto):Unit
                

}

        
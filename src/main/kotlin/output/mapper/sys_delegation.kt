

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_delegation{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "APPLICANTUSER", column = "APPLICANTUSER"),
   Result(property = "DELEGATEUSER", column = "DELEGATEUSER"),
   Result(property = "SCOPETYPE", column = "SCOPETYPE"),
   Result(property = "DELEGATEREASON", column = "DELEGATEREASON"),
   Result(property = "BEGINTIME", column = "BEGINTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID")
)
@Select("""<script>
   SELECT * FROM sys_delegation
</script>""")
fun GetListAll():ArrayList<sys_delegation_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "APPLICANTUSER", column = "APPLICANTUSER"),
   Result(property = "DELEGATEUSER", column = "DELEGATEUSER"),
   Result(property = "SCOPETYPE", column = "SCOPETYPE"),
   Result(property = "DELEGATEREASON", column = "DELEGATEREASON"),
   Result(property = "BEGINTIME", column = "BEGINTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID")
)
@Select("""<script>
   SELECT * FROM sys_delegation
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="APPLICANTUSER!=null">
      APPLICANTUSER=#{APPLICANTUSER}
   </if> 
   <if test="DELEGATEUSER!=null">
      DELEGATEUSER=#{DELEGATEUSER}
   </if> 
   <if test="SCOPETYPE!=null">
      SCOPETYPE=#{SCOPETYPE}
   </if> 
   <if test="DELEGATEREASON!=null">
      DELEGATEREASON=#{DELEGATEREASON}
   </if> 
   <if test="BEGINTIME!=null">
      BEGINTIME=#{BEGINTIME}
   </if> 
   <if test="ENDTIME!=null">
      ENDTIME=#{ENDTIME}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   <if test="PROCESSINSTID!=null">
      PROCESSINSTID=#{PROCESSINSTID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_delegation_dto):ArrayList<sys_delegation_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "APPLICANTUSER", column = "APPLICANTUSER"),
   Result(property = "DELEGATEUSER", column = "DELEGATEUSER"),
   Result(property = "SCOPETYPE", column = "SCOPETYPE"),
   Result(property = "DELEGATEREASON", column = "DELEGATEREASON"),
   Result(property = "BEGINTIME", column = "BEGINTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID")
)
@Select("""<script>
   SELECT * FROM sys_delegation
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_delegation_dto):sys_delegation_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,APPLICANTUSER,DELEGATEUSER,SCOPETYPE,DELEGATEREASON,BEGINTIME,ENDTIME,CREATETIME,PROCESSINSTID)
    values
    (#{ID},#{APPLICANTUSER},#{DELEGATEUSER},#{SCOPETYPE},#{DELEGATEREASON},#{BEGINTIME},#{ENDTIME},#{CREATETIME},#{PROCESSINSTID})
</script>""")
fun insert(model:sys_delegation_dto):Unit
                

}

        
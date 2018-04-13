

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
    insert into sys_delegation
    (ID,APPLICANTUSER,DELEGATEUSER,SCOPETYPE,DELEGATEREASON,BEGINTIME,ENDTIME,CREATETIME,PROCESSINSTID)
    values
    (#{ID},#{APPLICANTUSER},#{DELEGATEUSER},#{SCOPETYPE},#{DELEGATEREASON},#{BEGINTIME},#{ENDTIME},#{CREATETIME},#{PROCESSINSTID})
</script>""")
fun Insert(model:sys_delegation_dto):Unit
                


@Insert("""<script>
    insert into sys_delegation
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='APPLICANTUSER!= null'> 
           APPLICANTUSER,
        </if>
        <if test='DELEGATEUSER!= null'> 
           DELEGATEUSER,
        </if>
        <if test='SCOPETYPE!= null'> 
           SCOPETYPE,
        </if>
        <if test='DELEGATEREASON!= null'> 
           DELEGATEREASON,
        </if>
        <if test='BEGINTIME!= null'> 
           BEGINTIME,
        </if>
        <if test='ENDTIME!= null'> 
           ENDTIME,
        </if>
        <if test='CREATETIME!= null'> 
           CREATETIME,
        </if>
        <if test='PROCESSINSTID!= null'> 
           PROCESSINSTID
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='APPLICANTUSER!= null'> 
           #{APPLICANTUSER,jdbcType=varchar}，
        </if>
        <if test='DELEGATEUSER!= null'> 
           #{DELEGATEUSER,jdbcType=varchar}，
        </if>
        <if test='SCOPETYPE!= null'> 
           #{SCOPETYPE,jdbcType=char}，
        </if>
        <if test='DELEGATEREASON!= null'> 
           #{DELEGATEREASON,jdbcType=varchar}，
        </if>
        <if test='BEGINTIME!= null'> 
           #{BEGINTIME,jdbcType=datetime}，
        </if>
        <if test='ENDTIME!= null'> 
           #{ENDTIME,jdbcType=datetime}，
        </if>
        <if test='CREATETIME!= null'> 
           #{CREATETIME,jdbcType=datetime}，
        </if>
        <if test='PROCESSINSTID!= null'> 
           #{PROCESSINSTID,jdbcType=char}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_delegation_dto):Unit
                

}

        
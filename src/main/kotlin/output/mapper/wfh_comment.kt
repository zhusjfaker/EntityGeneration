

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfh_comment{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "DEPTNAME", column = "DEPTNAME"),
   Result(property = "POSITIONNAME", column = "POSITIONNAME"),
   Result(property = "ACTIONNAME", column = "ACTIONNAME"),
   Result(property = "ACTIVITYNAME", column = "ACTIVITYNAME"),
   Result(property = "MSG", column = "MSG")
)
@Select("""<script>
   SELECT * FROM wfh_comment
</script>""")
fun GetListAll():ArrayList<wfh_comment_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "DEPTNAME", column = "DEPTNAME"),
   Result(property = "POSITIONNAME", column = "POSITIONNAME"),
   Result(property = "ACTIONNAME", column = "ACTIONNAME"),
   Result(property = "ACTIVITYNAME", column = "ACTIVITYNAME"),
   Result(property = "MSG", column = "MSG")
)
@Select("""<script>
   SELECT * FROM wfh_comment
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="PROCESSINSTID!=null">
      PROCESSINSTID=#{PROCESSINSTID}
   </if> 
   <if test="TASKINSTID!=null">
      TASKINSTID=#{TASKINSTID}
   </if> 
   <if test="CREATEDATE!=null">
      CREATEDATE=#{CREATEDATE}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="DEPTNAME!=null">
      DEPTNAME=#{DEPTNAME}
   </if> 
   <if test="POSITIONNAME!=null">
      POSITIONNAME=#{POSITIONNAME}
   </if> 
   <if test="ACTIONNAME!=null">
      ACTIONNAME=#{ACTIONNAME}
   </if> 
   <if test="ACTIVITYNAME!=null">
      ACTIVITYNAME=#{ACTIVITYNAME}
   </if> 
   <if test="MSG!=null">
      MSG=#{MSG}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:wfh_comment_dto):ArrayList<wfh_comment_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "DEPTNAME", column = "DEPTNAME"),
   Result(property = "POSITIONNAME", column = "POSITIONNAME"),
   Result(property = "ACTIONNAME", column = "ACTIONNAME"),
   Result(property = "ACTIVITYNAME", column = "ACTIVITYNAME"),
   Result(property = "MSG", column = "MSG")
)
@Select("""<script>
   SELECT * FROM wfh_comment
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:wfh_comment_dto):wfh_comment_dto?
                


@Insert("""<script>
    insert into wfh_comment
    (ID,PROCESSINSTID,TASKINSTID,CREATEDATE,CREATEUSER,DEPTNAME,POSITIONNAME,ACTIONNAME,ACTIVITYNAME,MSG)
    values
    (#{ID},#{PROCESSINSTID},#{TASKINSTID},#{CREATEDATE},#{CREATEUSER},#{DEPTNAME},#{POSITIONNAME},#{ACTIONNAME},#{ACTIVITYNAME},#{MSG})
</script>""")
fun Insert(model:wfh_comment_dto):Unit
                


@Insert("""<script>
    insert into wfh_comment
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='PROCESSINSTID!= null'> 
           PROCESSINSTID,
        </if>
        <if test='TASKINSTID!= null'> 
           TASKINSTID,
        </if>
        <if test='CREATEDATE!= null'> 
           CREATEDATE,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='DEPTNAME!= null'> 
           DEPTNAME,
        </if>
        <if test='POSITIONNAME!= null'> 
           POSITIONNAME,
        </if>
        <if test='ACTIONNAME!= null'> 
           ACTIONNAME,
        </if>
        <if test='ACTIVITYNAME!= null'> 
           ACTIVITYNAME,
        </if>
        <if test='MSG!= null'> 
           MSG
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='PROCESSINSTID!= null'> 
           #{PROCESSINSTID,jdbcType=char}，
        </if>
        <if test='TASKINSTID!= null'> 
           #{TASKINSTID,jdbcType=char}，
        </if>
        <if test='CREATEDATE!= null'> 
           #{CREATEDATE,jdbcType=datetime}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='DEPTNAME!= null'> 
           #{DEPTNAME,jdbcType=varchar}，
        </if>
        <if test='POSITIONNAME!= null'> 
           #{POSITIONNAME,jdbcType=varchar}，
        </if>
        <if test='ACTIONNAME!= null'> 
           #{ACTIONNAME,jdbcType=varchar}，
        </if>
        <if test='ACTIVITYNAME!= null'> 
           #{ACTIVITYNAME,jdbcType=varchar}，
        </if>
        <if test='MSG!= null'> 
           #{MSG,jdbcType=text}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:wfh_comment_dto):Unit
                

}

        
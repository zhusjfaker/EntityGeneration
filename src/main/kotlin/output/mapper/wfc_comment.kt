

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfc_comment{


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
   Result(property = "MSG", column = "MSG"),
   Result(property = "FILES", column = "FILES")
)
@Select("""<script>
   SELECT * FROM wfc_comment
</script>""")
fun GetListAll():ArrayList<wfc_comment_dto>
        


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
   Result(property = "MSG", column = "MSG"),
   Result(property = "FILES", column = "FILES")
)
@Select("""<script>
   SELECT * FROM wfc_comment
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
   <if test="FILES!=null">
      FILES=#{FILES}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:wfc_comment_dto):ArrayList<wfc_comment_dto>
                


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
   Result(property = "MSG", column = "MSG"),
   Result(property = "FILES", column = "FILES")
)
@Select("""<script>
   SELECT * FROM wfc_comment
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:wfc_comment_dto):wfc_comment_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,PROCESSINSTID,TASKINSTID,CREATEDATE,CREATEUSER,DEPTNAME,POSITIONNAME,ACTIONNAME,ACTIVITYNAME,MSG,FILES)
    values
    (#{ID},#{PROCESSINSTID},#{TASKINSTID},#{CREATEDATE},#{CREATEUSER},#{DEPTNAME},#{POSITIONNAME},#{ACTIONNAME},#{ACTIVITYNAME},#{MSG},#{FILES})
</script>""")
fun insert(model:wfc_comment_dto):Unit
                

}

        
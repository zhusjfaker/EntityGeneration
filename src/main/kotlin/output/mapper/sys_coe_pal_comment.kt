

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_comment{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PID", column = "PID"),
   Result(property = "STREAMID", column = "STREAMID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "TARGETTYPE", column = "TARGETTYPE"),
   Result(property = "TARGETID", column = "TARGETID"),
   Result(property = "TEAMID", column = "TEAMID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "USERCOMMENT", column = "USERCOMMENT"),
   Result(property = "COMMENTDATE", column = "COMMENTDATE"),
   Result(property = "INFOTYPE", column = "INFOTYPE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_comment
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_comment_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PID", column = "PID"),
   Result(property = "STREAMID", column = "STREAMID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "TARGETTYPE", column = "TARGETTYPE"),
   Result(property = "TARGETID", column = "TARGETID"),
   Result(property = "TEAMID", column = "TEAMID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "USERCOMMENT", column = "USERCOMMENT"),
   Result(property = "COMMENTDATE", column = "COMMENTDATE"),
   Result(property = "INFOTYPE", column = "INFOTYPE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_comment
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="PID!=null">
      PID=#{PID}
   </if> 
   <if test="STREAMID!=null">
      STREAMID=#{STREAMID}
   </if> 
   <if test="WSID!=null">
      WSID=#{WSID}
   </if> 
   <if test="TARGETTYPE!=null">
      TARGETTYPE=#{TARGETTYPE}
   </if> 
   <if test="TARGETID!=null">
      TARGETID=#{TARGETID}
   </if> 
   <if test="TEAMID!=null">
      TEAMID=#{TEAMID}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="USERCOMMENT!=null">
      USERCOMMENT=#{USERCOMMENT}
   </if> 
   <if test="COMMENTDATE!=null">
      COMMENTDATE=#{COMMENTDATE}
   </if> 
   <if test="INFOTYPE!=null">
      INFOTYPE=#{INFOTYPE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_comment_dto):ArrayList<sys_coe_pal_comment_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PID", column = "PID"),
   Result(property = "STREAMID", column = "STREAMID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "TARGETTYPE", column = "TARGETTYPE"),
   Result(property = "TARGETID", column = "TARGETID"),
   Result(property = "TEAMID", column = "TEAMID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "USERCOMMENT", column = "USERCOMMENT"),
   Result(property = "COMMENTDATE", column = "COMMENTDATE"),
   Result(property = "INFOTYPE", column = "INFOTYPE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_comment
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_comment_dto):sys_coe_pal_comment_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,PID,STREAMID,WSID,TARGETTYPE,TARGETID,TEAMID,USERID,USERCOMMENT,COMMENTDATE,INFOTYPE)
    values
    (#{ID},#{PID},#{STREAMID},#{WSID},#{TARGETTYPE},#{TARGETID},#{TEAMID},#{USERID},#{USERCOMMENT},#{COMMENTDATE},#{INFOTYPE})
</script>""")
fun insert(model:sys_coe_pal_comment_dto):Unit
                

}

        
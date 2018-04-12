

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_rongim_group_member{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "GROUPID", column = "GROUPID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "ISMANAGER", column = "ISMANAGER"),
   Result(property = "STOPNOTIFY", column = "STOPNOTIFY"),
   Result(property = "ISTOP", column = "ISTOP")
)
@Select("""<script>
   SELECT * FROM app_act_rongim_group_member
</script>""")
fun GetListAll():ArrayList<app_act_rongim_group_member_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "GROUPID", column = "GROUPID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "ISMANAGER", column = "ISMANAGER"),
   Result(property = "STOPNOTIFY", column = "STOPNOTIFY"),
   Result(property = "ISTOP", column = "ISTOP")
)
@Select("""<script>
   SELECT * FROM app_act_rongim_group_member
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="GROUPID!=null">
      GROUPID=#{GROUPID}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="ISMANAGER!=null">
      ISMANAGER=#{ISMANAGER}
   </if> 
   <if test="STOPNOTIFY!=null">
      STOPNOTIFY=#{STOPNOTIFY}
   </if> 
   <if test="ISTOP!=null">
      ISTOP=#{ISTOP}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_rongim_group_member_dto):ArrayList<app_act_rongim_group_member_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "GROUPID", column = "GROUPID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "ISMANAGER", column = "ISMANAGER"),
   Result(property = "STOPNOTIFY", column = "STOPNOTIFY"),
   Result(property = "ISTOP", column = "ISTOP")
)
@Select("""<script>
   SELECT * FROM app_act_rongim_group_member
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_rongim_group_member_dto):app_act_rongim_group_member_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,GROUPID,USERID,ISMANAGER,STOPNOTIFY,ISTOP)
    values
    (#{ID},#{GROUPID},#{USERID},#{ISMANAGER},#{STOPNOTIFY},#{ISTOP})
</script>""")
fun insert(model:app_act_rongim_group_member_dto):Unit
                

}

        
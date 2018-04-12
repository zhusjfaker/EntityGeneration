

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_rongim_group{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "GROUPNAME", column = "GROUPNAME"),
   Result(property = "GROUPDESC", column = "GROUPDESC"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "UPDATETIME", column = "UPDATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_rongim_group
</script>""")
fun GetListAll():ArrayList<app_act_rongim_group_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "GROUPNAME", column = "GROUPNAME"),
   Result(property = "GROUPDESC", column = "GROUPDESC"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "UPDATETIME", column = "UPDATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_rongim_group
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="GROUPNAME!=null">
      GROUPNAME=#{GROUPNAME}
   </if> 
   <if test="GROUPDESC!=null">
      GROUPDESC=#{GROUPDESC}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   <if test="UPDATETIME!=null">
      UPDATETIME=#{UPDATETIME}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_rongim_group_dto):ArrayList<app_act_rongim_group_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "GROUPNAME", column = "GROUPNAME"),
   Result(property = "GROUPDESC", column = "GROUPDESC"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "UPDATETIME", column = "UPDATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_rongim_group
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_rongim_group_dto):app_act_rongim_group_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,GROUPNAME,GROUPDESC,CREATEUSER,CREATETIME,UPDATETIME)
    values
    (#{ID},#{GROUPNAME},#{GROUPDESC},#{CREATEUSER},#{CREATETIME},#{UPDATETIME})
</script>""")
fun insert(model:app_act_rongim_group_dto):Unit
                

}

        
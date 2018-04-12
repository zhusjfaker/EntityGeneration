

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfh_formsnapshot{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ACTIVITYDEFID", column = "ACTIVITYDEFID"),
   Result(property = "AUTHORUID", column = "AUTHORUID"),
   Result(property = "AUTHORNAME", column = "AUTHORNAME"),
   Result(property = "RECORDTIME", column = "RECORDTIME"),
   Result(property = "FORMID", column = "FORMID"),
   Result(property = "VNAME", column = "VNAME")
)
@Select("""<script>
   SELECT * FROM wfh_formsnapshot
</script>""")
fun GetListAll():ArrayList<wfh_formsnapshot_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ACTIVITYDEFID", column = "ACTIVITYDEFID"),
   Result(property = "AUTHORUID", column = "AUTHORUID"),
   Result(property = "AUTHORNAME", column = "AUTHORNAME"),
   Result(property = "RECORDTIME", column = "RECORDTIME"),
   Result(property = "FORMID", column = "FORMID"),
   Result(property = "VNAME", column = "VNAME")
)
@Select("""<script>
   SELECT * FROM wfh_formsnapshot
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
   <if test="PROCESSDEFID!=null">
      PROCESSDEFID=#{PROCESSDEFID}
   </if> 
   <if test="ACTIVITYDEFID!=null">
      ACTIVITYDEFID=#{ACTIVITYDEFID}
   </if> 
   <if test="AUTHORUID!=null">
      AUTHORUID=#{AUTHORUID}
   </if> 
   <if test="AUTHORNAME!=null">
      AUTHORNAME=#{AUTHORNAME}
   </if> 
   <if test="RECORDTIME!=null">
      RECORDTIME=#{RECORDTIME}
   </if> 
   <if test="FORMID!=null">
      FORMID=#{FORMID}
   </if> 
   <if test="VNAME!=null">
      VNAME=#{VNAME}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:wfh_formsnapshot_dto):ArrayList<wfh_formsnapshot_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ACTIVITYDEFID", column = "ACTIVITYDEFID"),
   Result(property = "AUTHORUID", column = "AUTHORUID"),
   Result(property = "AUTHORNAME", column = "AUTHORNAME"),
   Result(property = "RECORDTIME", column = "RECORDTIME"),
   Result(property = "FORMID", column = "FORMID"),
   Result(property = "VNAME", column = "VNAME")
)
@Select("""<script>
   SELECT * FROM wfh_formsnapshot
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:wfh_formsnapshot_dto):wfh_formsnapshot_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,PROCESSINSTID,TASKINSTID,PROCESSDEFID,ACTIVITYDEFID,AUTHORUID,AUTHORNAME,RECORDTIME,FORMID,VNAME)
    values
    (#{ID},#{PROCESSINSTID},#{TASKINSTID},#{PROCESSDEFID},#{ACTIVITYDEFID},#{AUTHORUID},#{AUTHORNAME},#{RECORDTIME},#{FORMID},#{VNAME})
</script>""")
fun insert(model:wfh_formsnapshot_dto):Unit
                

}

        
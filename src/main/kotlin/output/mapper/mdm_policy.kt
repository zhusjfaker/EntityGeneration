

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface mdm_policy{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "NAME", column = "NAME"),
   Result(property = "DESCRIPTION", column = "DESCRIPTION"),
   Result(property = "FILE_NAME", column = "FILE_NAME"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "ALLOW_ROOT", column = "ALLOW_ROOT"),
   Result(property = "POLICYVERSION", column = "POLICYVERSION"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "UPDATETIME", column = "UPDATETIME")
)
@Select("""<script>
   SELECT * FROM mdm_policy
</script>""")
fun GetListAll():ArrayList<mdm_policy_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "NAME", column = "NAME"),
   Result(property = "DESCRIPTION", column = "DESCRIPTION"),
   Result(property = "FILE_NAME", column = "FILE_NAME"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "ALLOW_ROOT", column = "ALLOW_ROOT"),
   Result(property = "POLICYVERSION", column = "POLICYVERSION"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "UPDATETIME", column = "UPDATETIME")
)
@Select("""<script>
   SELECT * FROM mdm_policy
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="NAME!=null">
      NAME=#{NAME}
   </if> 
   <if test="DESCRIPTION!=null">
      DESCRIPTION=#{DESCRIPTION}
   </if> 
   <if test="FILE_NAME!=null">
      FILE_NAME=#{FILE_NAME}
   </if> 
   <if test="STATUS!=null">
      STATUS=#{STATUS}
   </if> 
   <if test="ALLOW_ROOT!=null">
      ALLOW_ROOT=#{ALLOW_ROOT}
   </if> 
   <if test="POLICYVERSION!=null">
      POLICYVERSION=#{POLICYVERSION}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   <if test="UPDATETIME!=null">
      UPDATETIME=#{UPDATETIME}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:mdm_policy_dto):ArrayList<mdm_policy_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "NAME", column = "NAME"),
   Result(property = "DESCRIPTION", column = "DESCRIPTION"),
   Result(property = "FILE_NAME", column = "FILE_NAME"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "ALLOW_ROOT", column = "ALLOW_ROOT"),
   Result(property = "POLICYVERSION", column = "POLICYVERSION"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "UPDATETIME", column = "UPDATETIME")
)
@Select("""<script>
   SELECT * FROM mdm_policy
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:mdm_policy_dto):mdm_policy_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,NAME,DESCRIPTION,FILE_NAME,STATUS,ALLOW_ROOT,POLICYVERSION,CREATETIME,UPDATETIME)
    values
    (#{ID},#{NAME},#{DESCRIPTION},#{FILE_NAME},#{STATUS},#{ALLOW_ROOT},#{POLICYVERSION},#{CREATETIME},#{UPDATETIME})
</script>""")
fun insert(model:mdm_policy_dto):Unit
                

}

        
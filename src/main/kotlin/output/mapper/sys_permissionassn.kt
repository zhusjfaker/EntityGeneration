

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_permissionassn{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ASSIGNMENTTYPE", column = "ASSIGNMENTTYPE"),
   Result(property = "ASSIGNMENTID", column = "ASSIGNMENTID"),
   Result(property = "PERMISSIONID", column = "PERMISSIONID")
)
@Select("""<script>
   SELECT * FROM sys_permissionassn
</script>""")
fun GetListAll():ArrayList<sys_permissionassn_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ASSIGNMENTTYPE", column = "ASSIGNMENTTYPE"),
   Result(property = "ASSIGNMENTID", column = "ASSIGNMENTID"),
   Result(property = "PERMISSIONID", column = "PERMISSIONID")
)
@Select("""<script>
   SELECT * FROM sys_permissionassn
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="ASSIGNMENTTYPE!=null">
      ASSIGNMENTTYPE=#{ASSIGNMENTTYPE}
   </if> 
   <if test="ASSIGNMENTID!=null">
      ASSIGNMENTID=#{ASSIGNMENTID}
   </if> 
   <if test="PERMISSIONID!=null">
      PERMISSIONID=#{PERMISSIONID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_permissionassn_dto):ArrayList<sys_permissionassn_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ASSIGNMENTTYPE", column = "ASSIGNMENTTYPE"),
   Result(property = "ASSIGNMENTID", column = "ASSIGNMENTID"),
   Result(property = "PERMISSIONID", column = "PERMISSIONID")
)
@Select("""<script>
   SELECT * FROM sys_permissionassn
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_permissionassn_dto):sys_permissionassn_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,ASSIGNMENTTYPE,ASSIGNMENTID,PERMISSIONID)
    values
    (#{ID},#{ASSIGNMENTTYPE},#{ASSIGNMENTID},#{PERMISSIONID})
</script>""")
fun insert(model:sys_permissionassn_dto):Unit
                

}

        
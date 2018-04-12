

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_permission{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "CATEGORYNAME", column = "CATEGORYNAME"),
   Result(property = "PERMISSIONNAME", column = "PERMISSIONNAME"),
   Result(property = "PERMISSIONDESC", column = "PERMISSIONDESC"),
   Result(property = "ISSYSTEM", column = "ISSYSTEM")
)
@Select("""<script>
   SELECT * FROM sys_permission
</script>""")
fun GetListAll():ArrayList<sys_permission_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "CATEGORYNAME", column = "CATEGORYNAME"),
   Result(property = "PERMISSIONNAME", column = "PERMISSIONNAME"),
   Result(property = "PERMISSIONDESC", column = "PERMISSIONDESC"),
   Result(property = "ISSYSTEM", column = "ISSYSTEM")
)
@Select("""<script>
   SELECT * FROM sys_permission
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="CATEGORYNAME!=null">
      CATEGORYNAME=#{CATEGORYNAME}
   </if> 
   <if test="PERMISSIONNAME!=null">
      PERMISSIONNAME=#{PERMISSIONNAME}
   </if> 
   <if test="PERMISSIONDESC!=null">
      PERMISSIONDESC=#{PERMISSIONDESC}
   </if> 
   <if test="ISSYSTEM!=null">
      ISSYSTEM=#{ISSYSTEM}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_permission_dto):ArrayList<sys_permission_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "CATEGORYNAME", column = "CATEGORYNAME"),
   Result(property = "PERMISSIONNAME", column = "PERMISSIONNAME"),
   Result(property = "PERMISSIONDESC", column = "PERMISSIONDESC"),
   Result(property = "ISSYSTEM", column = "ISSYSTEM")
)
@Select("""<script>
   SELECT * FROM sys_permission
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_permission_dto):sys_permission_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,CATEGORYNAME,PERMISSIONNAME,PERMISSIONDESC,ISSYSTEM)
    values
    (#{ID},#{CATEGORYNAME},#{PERMISSIONNAME},#{PERMISSIONDESC},#{ISSYSTEM})
</script>""")
fun insert(model:sys_permission_dto):Unit
                

}

        
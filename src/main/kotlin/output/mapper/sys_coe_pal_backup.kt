

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_backup{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "BACKUPTIME", column = "BACKUPTIME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "REMARK", column = "REMARK"),
   Result(property = "STATE", column = "STATE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_backup
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_backup_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "BACKUPTIME", column = "BACKUPTIME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "REMARK", column = "REMARK"),
   Result(property = "STATE", column = "STATE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_backup
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="WSID!=null">
      WSID=#{WSID}
   </if> 
   <if test="BACKUPTIME!=null">
      BACKUPTIME=#{BACKUPTIME}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="REMARK!=null">
      REMARK=#{REMARK}
   </if> 
   <if test="STATE!=null">
      STATE=#{STATE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_backup_dto):ArrayList<sys_coe_pal_backup_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "BACKUPTIME", column = "BACKUPTIME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "REMARK", column = "REMARK"),
   Result(property = "STATE", column = "STATE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_backup
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_backup_dto):sys_coe_pal_backup_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,WSID,BACKUPTIME,USERID,REMARK,STATE)
    values
    (#{ID},#{WSID},#{BACKUPTIME},#{USERID},#{REMARK},#{STATE})
</script>""")
fun insert(model:sys_coe_pal_backup_dto):Unit
                

}

        
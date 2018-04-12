

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_patch_bootstrap{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "CLASSNAME", column = "CLASSNAME"),
   Result(property = "PATCHNAME", column = "PATCHNAME"),
   Result(property = "PATCHDESC", column = "PATCHDESC"),
   Result(property = "PATCHDATE", column = "PATCHDATE"),
   Result(property = "BEGINTIME", column = "BEGINTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "PATCHSTATE", column = "PATCHSTATE"),
   Result(property = "ERRLOG", column = "ERRLOG"),
   Result(property = "INSTNAME", column = "INSTNAME")
)
@Select("""<script>
   SELECT * FROM sys_patch_bootstrap
</script>""")
fun GetListAll():ArrayList<sys_patch_bootstrap_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "CLASSNAME", column = "CLASSNAME"),
   Result(property = "PATCHNAME", column = "PATCHNAME"),
   Result(property = "PATCHDESC", column = "PATCHDESC"),
   Result(property = "PATCHDATE", column = "PATCHDATE"),
   Result(property = "BEGINTIME", column = "BEGINTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "PATCHSTATE", column = "PATCHSTATE"),
   Result(property = "ERRLOG", column = "ERRLOG"),
   Result(property = "INSTNAME", column = "INSTNAME")
)
@Select("""<script>
   SELECT * FROM sys_patch_bootstrap
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="CLASSNAME!=null">
      CLASSNAME=#{CLASSNAME}
   </if> 
   <if test="PATCHNAME!=null">
      PATCHNAME=#{PATCHNAME}
   </if> 
   <if test="PATCHDESC!=null">
      PATCHDESC=#{PATCHDESC}
   </if> 
   <if test="PATCHDATE!=null">
      PATCHDATE=#{PATCHDATE}
   </if> 
   <if test="BEGINTIME!=null">
      BEGINTIME=#{BEGINTIME}
   </if> 
   <if test="ENDTIME!=null">
      ENDTIME=#{ENDTIME}
   </if> 
   <if test="PATCHSTATE!=null">
      PATCHSTATE=#{PATCHSTATE}
   </if> 
   <if test="ERRLOG!=null">
      ERRLOG=#{ERRLOG}
   </if> 
   <if test="INSTNAME!=null">
      INSTNAME=#{INSTNAME}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_patch_bootstrap_dto):ArrayList<sys_patch_bootstrap_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "CLASSNAME", column = "CLASSNAME"),
   Result(property = "PATCHNAME", column = "PATCHNAME"),
   Result(property = "PATCHDESC", column = "PATCHDESC"),
   Result(property = "PATCHDATE", column = "PATCHDATE"),
   Result(property = "BEGINTIME", column = "BEGINTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "PATCHSTATE", column = "PATCHSTATE"),
   Result(property = "ERRLOG", column = "ERRLOG"),
   Result(property = "INSTNAME", column = "INSTNAME")
)
@Select("""<script>
   SELECT * FROM sys_patch_bootstrap
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_patch_bootstrap_dto):sys_patch_bootstrap_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,CLASSNAME,PATCHNAME,PATCHDESC,PATCHDATE,BEGINTIME,ENDTIME,PATCHSTATE,ERRLOG,INSTNAME)
    values
    (#{ID},#{CLASSNAME},#{PATCHNAME},#{PATCHDESC},#{PATCHDATE},#{BEGINTIME},#{ENDTIME},#{PATCHSTATE},#{ERRLOG},#{INSTNAME})
</script>""")
fun insert(model:sys_patch_bootstrap_dto):Unit
                

}

        
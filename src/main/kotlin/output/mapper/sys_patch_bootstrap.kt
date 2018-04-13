

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
    insert into sys_patch_bootstrap
    (ID,CLASSNAME,PATCHNAME,PATCHDESC,PATCHDATE,BEGINTIME,ENDTIME,PATCHSTATE,ERRLOG,INSTNAME)
    values
    (#{ID},#{CLASSNAME},#{PATCHNAME},#{PATCHDESC},#{PATCHDATE},#{BEGINTIME},#{ENDTIME},#{PATCHSTATE},#{ERRLOG},#{INSTNAME})
</script>""")
fun Insert(model:sys_patch_bootstrap_dto):Unit
                


@Insert("""<script>
    insert into sys_patch_bootstrap
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='CLASSNAME!= null'> 
           CLASSNAME,
        </if>
        <if test='PATCHNAME!= null'> 
           PATCHNAME,
        </if>
        <if test='PATCHDESC!= null'> 
           PATCHDESC,
        </if>
        <if test='PATCHDATE!= null'> 
           PATCHDATE,
        </if>
        <if test='BEGINTIME!= null'> 
           BEGINTIME,
        </if>
        <if test='ENDTIME!= null'> 
           ENDTIME,
        </if>
        <if test='PATCHSTATE!= null'> 
           PATCHSTATE,
        </if>
        <if test='ERRLOG!= null'> 
           ERRLOG,
        </if>
        <if test='INSTNAME!= null'> 
           INSTNAME
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='CLASSNAME!= null'> 
           #{CLASSNAME,jdbcType=varchar}，
        </if>
        <if test='PATCHNAME!= null'> 
           #{PATCHNAME,jdbcType=varchar}，
        </if>
        <if test='PATCHDESC!= null'> 
           #{PATCHDESC,jdbcType=varchar}，
        </if>
        <if test='PATCHDATE!= null'> 
           #{PATCHDATE,jdbcType=varchar}，
        </if>
        <if test='BEGINTIME!= null'> 
           #{BEGINTIME,jdbcType=datetime}，
        </if>
        <if test='ENDTIME!= null'> 
           #{ENDTIME,jdbcType=datetime}，
        </if>
        <if test='PATCHSTATE!= null'> 
           #{PATCHSTATE,jdbcType=smallint}，
        </if>
        <if test='ERRLOG!= null'> 
           #{ERRLOG,jdbcType=text}，
        </if>
        <if test='INSTNAME!= null'> 
           #{INSTNAME,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_patch_bootstrap_dto):Unit
                

}

        
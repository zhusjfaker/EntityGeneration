

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface mam_install{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "INSTALLTIME", column = "INSTALLTIME"),
   Result(property = "INSTALLVERSION", column = "INSTALLVERSION"),
   Result(property = "CURRENTVERSION", column = "CURRENTVERSION"),
   Result(property = "UNINSTALLED", column = "UNINSTALLED")
)
@Select("""<script>
   SELECT * FROM mam_install
</script>""")
fun GetListAll():ArrayList<mam_install_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "INSTALLTIME", column = "INSTALLTIME"),
   Result(property = "INSTALLVERSION", column = "INSTALLVERSION"),
   Result(property = "CURRENTVERSION", column = "CURRENTVERSION"),
   Result(property = "UNINSTALLED", column = "UNINSTALLED")
)
@Select("""<script>
   SELECT * FROM mam_install
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="APPID!=null">
      APPID=#{APPID}
   </if> 
   <if test="DEVICEID!=null">
      DEVICEID=#{DEVICEID}
   </if> 
   <if test="INSTALLTIME!=null">
      INSTALLTIME=#{INSTALLTIME}
   </if> 
   <if test="INSTALLVERSION!=null">
      INSTALLVERSION=#{INSTALLVERSION}
   </if> 
   <if test="CURRENTVERSION!=null">
      CURRENTVERSION=#{CURRENTVERSION}
   </if> 
   <if test="UNINSTALLED!=null">
      UNINSTALLED=#{UNINSTALLED}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:mam_install_dto):ArrayList<mam_install_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "DEVICEID", column = "DEVICEID"),
   Result(property = "INSTALLTIME", column = "INSTALLTIME"),
   Result(property = "INSTALLVERSION", column = "INSTALLVERSION"),
   Result(property = "CURRENTVERSION", column = "CURRENTVERSION"),
   Result(property = "UNINSTALLED", column = "UNINSTALLED")
)
@Select("""<script>
   SELECT * FROM mam_install
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:mam_install_dto):mam_install_dto?
                


@Insert("""<script>
    insert into mam_install
    (ID,APPID,DEVICEID,INSTALLTIME,INSTALLVERSION,CURRENTVERSION,UNINSTALLED)
    values
    (#{ID},#{APPID},#{DEVICEID},#{INSTALLTIME},#{INSTALLVERSION},#{CURRENTVERSION},#{UNINSTALLED})
</script>""")
fun Insert(model:mam_install_dto):Unit
                


@Insert("""<script>
    insert into mam_install
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='APPID!= null'> 
           APPID,
        </if>
        <if test='DEVICEID!= null'> 
           DEVICEID,
        </if>
        <if test='INSTALLTIME!= null'> 
           INSTALLTIME,
        </if>
        <if test='INSTALLVERSION!= null'> 
           INSTALLVERSION,
        </if>
        <if test='CURRENTVERSION!= null'> 
           CURRENTVERSION,
        </if>
        <if test='UNINSTALLED!= null'> 
           UNINSTALLED
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='APPID!= null'> 
           #{APPID,jdbcType=varchar}，
        </if>
        <if test='DEVICEID!= null'> 
           #{DEVICEID,jdbcType=char}，
        </if>
        <if test='INSTALLTIME!= null'> 
           #{INSTALLTIME,jdbcType=datetime}，
        </if>
        <if test='INSTALLVERSION!= null'> 
           #{INSTALLVERSION,jdbcType=varchar}，
        </if>
        <if test='CURRENTVERSION!= null'> 
           #{CURRENTVERSION,jdbcType=varchar}，
        </if>
        <if test='UNINSTALLED!= null'> 
           #{UNINSTALLED,jdbcType=smallint}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:mam_install_dto):Unit
                

}

        
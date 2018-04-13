

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfc_formfiles{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "BOID", column = "BOID"),
   Result(property = "BONAME", column = "BONAME"),
   Result(property = "BOFIELDNAME", column = "BOFIELDNAME"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "FILENAME", column = "FILENAME"),
   Result(property = "FILESIZE", column = "FILESIZE"),
   Result(property = "REMARK", column = "REMARK"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "SECURITYLEVEL", column = "SECURITYLEVEL")
)
@Select("""<script>
   SELECT * FROM wfc_formfiles
</script>""")
fun GetListAll():ArrayList<wfc_formfiles_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "BOID", column = "BOID"),
   Result(property = "BONAME", column = "BONAME"),
   Result(property = "BOFIELDNAME", column = "BOFIELDNAME"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "FILENAME", column = "FILENAME"),
   Result(property = "FILESIZE", column = "FILESIZE"),
   Result(property = "REMARK", column = "REMARK"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "SECURITYLEVEL", column = "SECURITYLEVEL")
)
@Select("""<script>
   SELECT * FROM wfc_formfiles
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="APPID!=null">
      APPID=#{APPID}
   </if> 
   <if test="PROCESSINSTID!=null">
      PROCESSINSTID=#{PROCESSINSTID}
   </if> 
   <if test="TASKINSTID!=null">
      TASKINSTID=#{TASKINSTID}
   </if> 
   <if test="BOID!=null">
      BOID=#{BOID}
   </if> 
   <if test="BONAME!=null">
      BONAME=#{BONAME}
   </if> 
   <if test="BOFIELDNAME!=null">
      BOFIELDNAME=#{BOFIELDNAME}
   </if> 
   <if test="CREATEDATE!=null">
      CREATEDATE=#{CREATEDATE}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="FILENAME!=null">
      FILENAME=#{FILENAME}
   </if> 
   <if test="FILESIZE!=null">
      FILESIZE=#{FILESIZE}
   </if> 
   <if test="REMARK!=null">
      REMARK=#{REMARK}
   </if> 
   <if test="EXT1!=null">
      EXT1=#{EXT1}
   </if> 
   <if test="SECURITYLEVEL!=null">
      SECURITYLEVEL=#{SECURITYLEVEL}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:wfc_formfiles_dto):ArrayList<wfc_formfiles_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "BOID", column = "BOID"),
   Result(property = "BONAME", column = "BONAME"),
   Result(property = "BOFIELDNAME", column = "BOFIELDNAME"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "FILENAME", column = "FILENAME"),
   Result(property = "FILESIZE", column = "FILESIZE"),
   Result(property = "REMARK", column = "REMARK"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "SECURITYLEVEL", column = "SECURITYLEVEL")
)
@Select("""<script>
   SELECT * FROM wfc_formfiles
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:wfc_formfiles_dto):wfc_formfiles_dto?
                


@Insert("""<script>
    insert into wfc_formfiles
    (ID,APPID,PROCESSINSTID,TASKINSTID,BOID,BONAME,BOFIELDNAME,CREATEDATE,CREATEUSER,FILENAME,FILESIZE,REMARK,EXT1,SECURITYLEVEL)
    values
    (#{ID},#{APPID},#{PROCESSINSTID},#{TASKINSTID},#{BOID},#{BONAME},#{BOFIELDNAME},#{CREATEDATE},#{CREATEUSER},#{FILENAME},#{FILESIZE},#{REMARK},#{EXT1},#{SECURITYLEVEL})
</script>""")
fun Insert(model:wfc_formfiles_dto):Unit
                


@Insert("""<script>
    insert into wfc_formfiles
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='APPID!= null'> 
           APPID,
        </if>
        <if test='PROCESSINSTID!= null'> 
           PROCESSINSTID,
        </if>
        <if test='TASKINSTID!= null'> 
           TASKINSTID,
        </if>
        <if test='BOID!= null'> 
           BOID,
        </if>
        <if test='BONAME!= null'> 
           BONAME,
        </if>
        <if test='BOFIELDNAME!= null'> 
           BOFIELDNAME,
        </if>
        <if test='CREATEDATE!= null'> 
           CREATEDATE,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='FILENAME!= null'> 
           FILENAME,
        </if>
        <if test='FILESIZE!= null'> 
           FILESIZE,
        </if>
        <if test='REMARK!= null'> 
           REMARK,
        </if>
        <if test='EXT1!= null'> 
           EXT1,
        </if>
        <if test='SECURITYLEVEL!= null'> 
           SECURITYLEVEL
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='APPID!= null'> 
           #{APPID,jdbcType=varchar}，
        </if>
        <if test='PROCESSINSTID!= null'> 
           #{PROCESSINSTID,jdbcType=char}，
        </if>
        <if test='TASKINSTID!= null'> 
           #{TASKINSTID,jdbcType=char}，
        </if>
        <if test='BOID!= null'> 
           #{BOID,jdbcType=char}，
        </if>
        <if test='BONAME!= null'> 
           #{BONAME,jdbcType=varchar}，
        </if>
        <if test='BOFIELDNAME!= null'> 
           #{BOFIELDNAME,jdbcType=varchar}，
        </if>
        <if test='CREATEDATE!= null'> 
           #{CREATEDATE,jdbcType=datetime}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='FILENAME!= null'> 
           #{FILENAME,jdbcType=text}，
        </if>
        <if test='FILESIZE!= null'> 
           #{FILESIZE,jdbcType=decimal}，
        </if>
        <if test='REMARK!= null'> 
           #{REMARK,jdbcType=varchar}，
        </if>
        <if test='EXT1!= null'> 
           #{EXT1,jdbcType=varchar}，
        </if>
        <if test='SECURITYLEVEL!= null'> 
           #{SECURITYLEVEL,jdbcType=smallint}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:wfc_formfiles_dto):Unit
                

}

        
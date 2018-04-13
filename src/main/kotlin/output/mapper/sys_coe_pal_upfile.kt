

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_upfile{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PALREPOSITORYID", column = "PALREPOSITORYID"),
   Result(property = "SHAPEID", column = "SHAPEID"),
   Result(property = "FILETYPE", column = "FILETYPE"),
   Result(property = "FILENAME", column = "FILENAME"),
   Result(property = "DOWNLOAD", column = "DOWNLOAD"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_upfile
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_upfile_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PALREPOSITORYID", column = "PALREPOSITORYID"),
   Result(property = "SHAPEID", column = "SHAPEID"),
   Result(property = "FILETYPE", column = "FILETYPE"),
   Result(property = "FILENAME", column = "FILENAME"),
   Result(property = "DOWNLOAD", column = "DOWNLOAD"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_upfile
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="PALREPOSITORYID!=null">
      PALREPOSITORYID=#{PALREPOSITORYID}
   </if> 
   <if test="SHAPEID!=null">
      SHAPEID=#{SHAPEID}
   </if> 
   <if test="FILETYPE!=null">
      FILETYPE=#{FILETYPE}
   </if> 
   <if test="FILENAME!=null">
      FILENAME=#{FILENAME}
   </if> 
   <if test="DOWNLOAD!=null">
      DOWNLOAD=#{DOWNLOAD}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_upfile_dto):ArrayList<sys_coe_pal_upfile_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PALREPOSITORYID", column = "PALREPOSITORYID"),
   Result(property = "SHAPEID", column = "SHAPEID"),
   Result(property = "FILETYPE", column = "FILETYPE"),
   Result(property = "FILENAME", column = "FILENAME"),
   Result(property = "DOWNLOAD", column = "DOWNLOAD"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_upfile
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_upfile_dto):sys_coe_pal_upfile_dto?
                


@Insert("""<script>
    insert into sys_coe_pal_upfile
    (ID,PALREPOSITORYID,SHAPEID,FILETYPE,FILENAME,DOWNLOAD,CREATEUSER,CREATETIME)
    values
    (#{ID},#{PALREPOSITORYID},#{SHAPEID},#{FILETYPE},#{FILENAME},#{DOWNLOAD},#{CREATEUSER},#{CREATETIME})
</script>""")
fun Insert(model:sys_coe_pal_upfile_dto):Unit
                


@Insert("""<script>
    insert into sys_coe_pal_upfile
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='PALREPOSITORYID!= null'> 
           PALREPOSITORYID,
        </if>
        <if test='SHAPEID!= null'> 
           SHAPEID,
        </if>
        <if test='FILETYPE!= null'> 
           FILETYPE,
        </if>
        <if test='FILENAME!= null'> 
           FILENAME,
        </if>
        <if test='DOWNLOAD!= null'> 
           DOWNLOAD,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='CREATETIME!= null'> 
           CREATETIME
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='PALREPOSITORYID!= null'> 
           #{PALREPOSITORYID,jdbcType=char}，
        </if>
        <if test='SHAPEID!= null'> 
           #{SHAPEID,jdbcType=varchar}，
        </if>
        <if test='FILETYPE!= null'> 
           #{FILETYPE,jdbcType=char}，
        </if>
        <if test='FILENAME!= null'> 
           #{FILENAME,jdbcType=varchar}，
        </if>
        <if test='DOWNLOAD!= null'> 
           #{DOWNLOAD,jdbcType=smallint}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='CREATETIME!= null'> 
           #{CREATETIME,jdbcType=datetime}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_coe_pal_upfile_dto):Unit
                

}

        


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
    insert into TStudent
    (ID,PALREPOSITORYID,SHAPEID,FILETYPE,FILENAME,DOWNLOAD,CREATEUSER,CREATETIME)
    values
    (#{ID},#{PALREPOSITORYID},#{SHAPEID},#{FILETYPE},#{FILENAME},#{DOWNLOAD},#{CREATEUSER},#{CREATETIME})
</script>""")
fun insert(model:sys_coe_pal_upfile_dto):Unit
                

}

        
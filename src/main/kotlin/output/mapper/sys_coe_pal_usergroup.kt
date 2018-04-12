

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_usergroup{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "GROUPCODE", column = "GROUPCODE"),
   Result(property = "CATEGORY", column = "CATEGORY"),
   Result(property = "GROUPNAME", column = "GROUPNAME"),
   Result(property = "GROUPDESC", column = "GROUPDESC"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATEDATE", column = "CREATEDATE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_usergroup
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_usergroup_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "GROUPCODE", column = "GROUPCODE"),
   Result(property = "CATEGORY", column = "CATEGORY"),
   Result(property = "GROUPNAME", column = "GROUPNAME"),
   Result(property = "GROUPDESC", column = "GROUPDESC"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATEDATE", column = "CREATEDATE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_usergroup
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="WSID!=null">
      WSID=#{WSID}
   </if> 
   <if test="GROUPCODE!=null">
      GROUPCODE=#{GROUPCODE}
   </if> 
   <if test="CATEGORY!=null">
      CATEGORY=#{CATEGORY}
   </if> 
   <if test="GROUPNAME!=null">
      GROUPNAME=#{GROUPNAME}
   </if> 
   <if test="GROUPDESC!=null">
      GROUPDESC=#{GROUPDESC}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="CREATEDATE!=null">
      CREATEDATE=#{CREATEDATE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_usergroup_dto):ArrayList<sys_coe_pal_usergroup_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "GROUPCODE", column = "GROUPCODE"),
   Result(property = "CATEGORY", column = "CATEGORY"),
   Result(property = "GROUPNAME", column = "GROUPNAME"),
   Result(property = "GROUPDESC", column = "GROUPDESC"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATEDATE", column = "CREATEDATE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_usergroup
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_usergroup_dto):sys_coe_pal_usergroup_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,WSID,GROUPCODE,CATEGORY,GROUPNAME,GROUPDESC,CREATEUSER,CREATEDATE)
    values
    (#{ID},#{WSID},#{GROUPCODE},#{CATEGORY},#{GROUPNAME},#{GROUPDESC},#{CREATEUSER},#{CREATEDATE})
</script>""")
fun insert(model:sys_coe_pal_usergroup_dto):Unit
                

}

        
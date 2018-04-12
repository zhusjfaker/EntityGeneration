

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_patch{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DOWNLOADID", column = "DOWNLOADID"),
   Result(property = "VERSIONID", column = "VERSIONID"),
   Result(property = "OPSTATE", column = "OPSTATE"),
   Result(property = "OPDATE", column = "OPDATE"),
   Result(property = "MD5DIGEST", column = "MD5DIGEST"),
   Result(property = "ISDEGRADE", column = "ISDEGRADE"),
   Result(property = "RELEASETYPE", column = "RELEASETYPE")
)
@Select("""<script>
   SELECT * FROM sys_patch
</script>""")
fun GetListAll():ArrayList<sys_patch_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DOWNLOADID", column = "DOWNLOADID"),
   Result(property = "VERSIONID", column = "VERSIONID"),
   Result(property = "OPSTATE", column = "OPSTATE"),
   Result(property = "OPDATE", column = "OPDATE"),
   Result(property = "MD5DIGEST", column = "MD5DIGEST"),
   Result(property = "ISDEGRADE", column = "ISDEGRADE"),
   Result(property = "RELEASETYPE", column = "RELEASETYPE")
)
@Select("""<script>
   SELECT * FROM sys_patch
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="DOWNLOADID!=null">
      DOWNLOADID=#{DOWNLOADID}
   </if> 
   <if test="VERSIONID!=null">
      VERSIONID=#{VERSIONID}
   </if> 
   <if test="OPSTATE!=null">
      OPSTATE=#{OPSTATE}
   </if> 
   <if test="OPDATE!=null">
      OPDATE=#{OPDATE}
   </if> 
   <if test="MD5DIGEST!=null">
      MD5DIGEST=#{MD5DIGEST}
   </if> 
   <if test="ISDEGRADE!=null">
      ISDEGRADE=#{ISDEGRADE}
   </if> 
   <if test="RELEASETYPE!=null">
      RELEASETYPE=#{RELEASETYPE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_patch_dto):ArrayList<sys_patch_dto>
                




@Insert("""<script>
    insert into TStudent
    (ID,DOWNLOADID,VERSIONID,OPSTATE,OPDATE,MD5DIGEST,ISDEGRADE,RELEASETYPE)
    values
    (#{ID},#{DOWNLOADID},#{VERSIONID},#{OPSTATE},#{OPDATE},#{MD5DIGEST},#{ISDEGRADE},#{RELEASETYPE})
</script>""")
fun insert(model:sys_patch_dto):Unit
                

}

        
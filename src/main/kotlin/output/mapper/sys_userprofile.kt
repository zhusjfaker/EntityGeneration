

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_userprofile{


@Results(
   Result(property = "USERID", column = "USERID"),
   Result(property = "PROFILEKEY", column = "PROFILEKEY"),
   Result(property = "PROFILEVALUE", column = "PROFILEVALUE")
)
@Select("""<script>
   SELECT * FROM sys_userprofile
</script>""")
fun GetListAll():ArrayList<sys_userprofile_dto>
        


@Results(
   Result(property = "USERID", column = "USERID"),
   Result(property = "PROFILEKEY", column = "PROFILEKEY"),
   Result(property = "PROFILEVALUE", column = "PROFILEVALUE")
)
@Select("""<script>
   SELECT * FROM sys_userprofile
   <where>
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="PROFILEKEY!=null">
      PROFILEKEY=#{PROFILEKEY}
   </if> 
   <if test="PROFILEVALUE!=null">
      PROFILEVALUE=#{PROFILEVALUE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_userprofile_dto):ArrayList<sys_userprofile_dto>
                


@Results(
   Result(property = "USERID", column = "USERID"),
   Result(property = "PROFILEKEY", column = "PROFILEKEY"),
   Result(property = "PROFILEVALUE", column = "PROFILEVALUE")
)
@Select("""<script>
   SELECT * FROM sys_userprofile
   <where>
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_userprofile_dto):sys_userprofile_dto?
                


@Insert("""<script>
    insert into TStudent
    (USERID,PROFILEKEY,PROFILEVALUE)
    values
    (#{USERID},#{PROFILEKEY},#{PROFILEVALUE})
</script>""")
fun insert(model:sys_userprofile_dto):Unit
                

}

        
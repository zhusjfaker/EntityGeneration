

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_user{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "ISADMIN", column = "ISADMIN")
)
@Select("""<script>
   SELECT * FROM sys_coe_user
</script>""")
fun GetListAll():ArrayList<sys_coe_user_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "ISADMIN", column = "ISADMIN")
)
@Select("""<script>
   SELECT * FROM sys_coe_user
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="ISADMIN!=null">
      ISADMIN=#{ISADMIN}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_user_dto):ArrayList<sys_coe_user_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "ISADMIN", column = "ISADMIN")
)
@Select("""<script>
   SELECT * FROM sys_coe_user
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_user_dto):sys_coe_user_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,USERID,ISADMIN)
    values
    (#{ID},#{USERID},#{ISADMIN})
</script>""")
fun insert(model:sys_coe_user_dto):Unit
                

}

        
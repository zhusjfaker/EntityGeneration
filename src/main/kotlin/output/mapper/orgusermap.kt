

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface orgusermap{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "DEPARTMENTID", column = "DEPARTMENTID"),
   Result(property = "ROLEID", column = "ROLEID"),
   Result(property = "ISMANAGER", column = "ISMANAGER"),
   Result(property = "ISSHOW", column = "ISSHOW")
)
@Select("""<script>
   SELECT * FROM orgusermap
</script>""")
fun GetListAll():ArrayList<orgusermap_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "DEPARTMENTID", column = "DEPARTMENTID"),
   Result(property = "ROLEID", column = "ROLEID"),
   Result(property = "ISMANAGER", column = "ISMANAGER"),
   Result(property = "ISSHOW", column = "ISSHOW")
)
@Select("""<script>
   SELECT * FROM orgusermap
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="DEPARTMENTID!=null">
      DEPARTMENTID=#{DEPARTMENTID}
   </if> 
   <if test="ROLEID!=null">
      ROLEID=#{ROLEID}
   </if> 
   <if test="ISMANAGER!=null">
      ISMANAGER=#{ISMANAGER}
   </if> 
   <if test="ISSHOW!=null">
      ISSHOW=#{ISSHOW}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:orgusermap_dto):ArrayList<orgusermap_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "DEPARTMENTID", column = "DEPARTMENTID"),
   Result(property = "ROLEID", column = "ROLEID"),
   Result(property = "ISMANAGER", column = "ISMANAGER"),
   Result(property = "ISSHOW", column = "ISSHOW")
)
@Select("""<script>
   SELECT * FROM orgusermap
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:orgusermap_dto):orgusermap_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,USERID,DEPARTMENTID,ROLEID,ISMANAGER,ISSHOW)
    values
    (#{ID},#{USERID},#{DEPARTMENTID},#{ROLEID},#{ISMANAGER},#{ISSHOW})
</script>""")
fun insert(model:orgusermap_dto):Unit
                

}

        
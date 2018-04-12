

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface orguser_pwd_cycle{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "PASSWORD", column = "PASSWORD"),
   Result(property = "LASTDATE", column = "LASTDATE"),
   Result(property = "IP", column = "IP")
)
@Select("""<script>
   SELECT * FROM orguser_pwd_cycle
</script>""")
fun GetListAll():ArrayList<orguser_pwd_cycle_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "PASSWORD", column = "PASSWORD"),
   Result(property = "LASTDATE", column = "LASTDATE"),
   Result(property = "IP", column = "IP")
)
@Select("""<script>
   SELECT * FROM orguser_pwd_cycle
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="PASSWORD!=null">
      PASSWORD=#{PASSWORD}
   </if> 
   <if test="LASTDATE!=null">
      LASTDATE=#{LASTDATE}
   </if> 
   <if test="IP!=null">
      IP=#{IP}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:orguser_pwd_cycle_dto):ArrayList<orguser_pwd_cycle_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "PASSWORD", column = "PASSWORD"),
   Result(property = "LASTDATE", column = "LASTDATE"),
   Result(property = "IP", column = "IP")
)
@Select("""<script>
   SELECT * FROM orguser_pwd_cycle
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:orguser_pwd_cycle_dto):orguser_pwd_cycle_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,USERID,PASSWORD,LASTDATE,IP)
    values
    (#{ID},#{USERID},#{PASSWORD},#{LASTDATE},#{IP})
</script>""")
fun insert(model:orguser_pwd_cycle_dto):Unit
                

}

        
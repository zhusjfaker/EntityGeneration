

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfh_formprint{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "PRINTTIME", column = "PRINTTIME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "USERNAME", column = "USERNAME"),
   Result(property = "IPADD", column = "IPADD")
)
@Select("""<script>
   SELECT * FROM wfh_formprint
</script>""")
fun GetListAll():ArrayList<wfh_formprint_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "PRINTTIME", column = "PRINTTIME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "USERNAME", column = "USERNAME"),
   Result(property = "IPADD", column = "IPADD")
)
@Select("""<script>
   SELECT * FROM wfh_formprint
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="PROCESSINSTID!=null">
      PROCESSINSTID=#{PROCESSINSTID}
   </if> 
   <if test="TASKINSTID!=null">
      TASKINSTID=#{TASKINSTID}
   </if> 
   <if test="PRINTTIME!=null">
      PRINTTIME=#{PRINTTIME}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="USERNAME!=null">
      USERNAME=#{USERNAME}
   </if> 
   <if test="IPADD!=null">
      IPADD=#{IPADD}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:wfh_formprint_dto):ArrayList<wfh_formprint_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "PRINTTIME", column = "PRINTTIME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "USERNAME", column = "USERNAME"),
   Result(property = "IPADD", column = "IPADD")
)
@Select("""<script>
   SELECT * FROM wfh_formprint
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:wfh_formprint_dto):wfh_formprint_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,PROCESSINSTID,TASKINSTID,PRINTTIME,USERID,USERNAME,IPADD)
    values
    (#{ID},#{PROCESSINSTID},#{TASKINSTID},#{PRINTTIME},#{USERID},#{USERNAME},#{IPADD})
</script>""")
fun insert(model:wfh_formprint_dto):Unit
                

}

        
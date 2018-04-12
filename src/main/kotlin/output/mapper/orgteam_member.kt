

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface orgteam_member{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TEAMID", column = "TEAMID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "MEMBERTYPE", column = "MEMBERTYPE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM orgteam_member
</script>""")
fun GetListAll():ArrayList<orgteam_member_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TEAMID", column = "TEAMID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "MEMBERTYPE", column = "MEMBERTYPE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM orgteam_member
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="TEAMID!=null">
      TEAMID=#{TEAMID}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="MEMBERTYPE!=null">
      MEMBERTYPE=#{MEMBERTYPE}
   </if> 
   <if test="ORDERINDEX!=null">
      ORDERINDEX=#{ORDERINDEX}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:orgteam_member_dto):ArrayList<orgteam_member_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TEAMID", column = "TEAMID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "MEMBERTYPE", column = "MEMBERTYPE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM orgteam_member
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:orgteam_member_dto):orgteam_member_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,TEAMID,USERID,MEMBERTYPE,ORDERINDEX)
    values
    (#{ID},#{TEAMID},#{USERID},#{MEMBERTYPE},#{ORDERINDEX})
</script>""")
fun insert(model:orgteam_member_dto):Unit
                

}

        
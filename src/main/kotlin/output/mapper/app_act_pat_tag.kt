

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_pat_tag{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TAGNAME", column = "TAGNAME"),
   Result(property = "TESTCASEID", column = "TESTCASEID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_pat_tag
</script>""")
fun GetListAll():ArrayList<app_act_pat_tag_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TAGNAME", column = "TAGNAME"),
   Result(property = "TESTCASEID", column = "TESTCASEID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_pat_tag
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="TAGNAME!=null">
      TAGNAME=#{TAGNAME}
   </if> 
   <if test="TESTCASEID!=null">
      TESTCASEID=#{TESTCASEID}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_pat_tag_dto):ArrayList<app_act_pat_tag_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TAGNAME", column = "TAGNAME"),
   Result(property = "TESTCASEID", column = "TESTCASEID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME")
)
@Select("""<script>
   SELECT * FROM app_act_pat_tag
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_pat_tag_dto):app_act_pat_tag_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,TAGNAME,TESTCASEID,CREATEUSER,CREATETIME)
    values
    (#{ID},#{TAGNAME},#{TESTCASEID},#{CREATEUSER},#{CREATETIME})
</script>""")
fun insert(model:app_act_pat_tag_dto):Unit
                

}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_pat_testcase{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TESTCASENAME", column = "TESTCASENAME"),
   Result(property = "TESTCASEDESC", column = "TESTCASEDESC"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "UPDATEUSER", column = "UPDATEUSER"),
   Result(property = "UPDATETIME", column = "UPDATETIME"),
   Result(property = "EXECUTEUSER", column = "EXECUTEUSER"),
   Result(property = "EXECUTETIME", column = "EXECUTETIME"),
   Result(property = "TESTCASESTATUS", column = "TESTCASESTATUS"),
   Result(property = "DCINFO", column = "DCINFO"),
   Result(property = "ATSTRATEGY", column = "ATSTRATEGY")
)
@Select("""<script>
   SELECT * FROM app_act_pat_testcase
</script>""")
fun GetListAll():ArrayList<app_act_pat_testcase_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TESTCASENAME", column = "TESTCASENAME"),
   Result(property = "TESTCASEDESC", column = "TESTCASEDESC"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "UPDATEUSER", column = "UPDATEUSER"),
   Result(property = "UPDATETIME", column = "UPDATETIME"),
   Result(property = "EXECUTEUSER", column = "EXECUTEUSER"),
   Result(property = "EXECUTETIME", column = "EXECUTETIME"),
   Result(property = "TESTCASESTATUS", column = "TESTCASESTATUS"),
   Result(property = "DCINFO", column = "DCINFO"),
   Result(property = "ATSTRATEGY", column = "ATSTRATEGY")
)
@Select("""<script>
   SELECT * FROM app_act_pat_testcase
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="TESTCASENAME!=null">
      TESTCASENAME=#{TESTCASENAME}
   </if> 
   <if test="TESTCASEDESC!=null">
      TESTCASEDESC=#{TESTCASEDESC}
   </if> 
   <if test="PROCESSDEFID!=null">
      PROCESSDEFID=#{PROCESSDEFID}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   <if test="UPDATEUSER!=null">
      UPDATEUSER=#{UPDATEUSER}
   </if> 
   <if test="UPDATETIME!=null">
      UPDATETIME=#{UPDATETIME}
   </if> 
   <if test="EXECUTEUSER!=null">
      EXECUTEUSER=#{EXECUTEUSER}
   </if> 
   <if test="EXECUTETIME!=null">
      EXECUTETIME=#{EXECUTETIME}
   </if> 
   <if test="TESTCASESTATUS!=null">
      TESTCASESTATUS=#{TESTCASESTATUS}
   </if> 
   <if test="DCINFO!=null">
      DCINFO=#{DCINFO}
   </if> 
   <if test="ATSTRATEGY!=null">
      ATSTRATEGY=#{ATSTRATEGY}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_pat_testcase_dto):ArrayList<app_act_pat_testcase_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TESTCASENAME", column = "TESTCASENAME"),
   Result(property = "TESTCASEDESC", column = "TESTCASEDESC"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "UPDATEUSER", column = "UPDATEUSER"),
   Result(property = "UPDATETIME", column = "UPDATETIME"),
   Result(property = "EXECUTEUSER", column = "EXECUTEUSER"),
   Result(property = "EXECUTETIME", column = "EXECUTETIME"),
   Result(property = "TESTCASESTATUS", column = "TESTCASESTATUS"),
   Result(property = "DCINFO", column = "DCINFO"),
   Result(property = "ATSTRATEGY", column = "ATSTRATEGY")
)
@Select("""<script>
   SELECT * FROM app_act_pat_testcase
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_pat_testcase_dto):app_act_pat_testcase_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,TESTCASENAME,TESTCASEDESC,PROCESSDEFID,CREATEUSER,CREATETIME,UPDATEUSER,UPDATETIME,EXECUTEUSER,EXECUTETIME,TESTCASESTATUS,DCINFO,ATSTRATEGY)
    values
    (#{ID},#{TESTCASENAME},#{TESTCASEDESC},#{PROCESSDEFID},#{CREATEUSER},#{CREATETIME},#{UPDATEUSER},#{UPDATETIME},#{EXECUTEUSER},#{EXECUTETIME},#{TESTCASESTATUS},#{DCINFO},#{ATSTRATEGY})
</script>""")
fun insert(model:app_act_pat_testcase_dto):Unit
                

}

        
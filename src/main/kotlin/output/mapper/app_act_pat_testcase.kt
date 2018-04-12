

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
        


}

        
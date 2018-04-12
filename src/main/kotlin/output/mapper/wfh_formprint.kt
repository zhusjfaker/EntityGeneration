

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
        


}

        
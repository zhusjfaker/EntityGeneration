

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_cms_data_reader{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DATAID", column = "DATAID"),
   Result(property = "READER", column = "READER"),
   Result(property = "ORGID", column = "ORGID"),
   Result(property = "READTIME", column = "READTIME"),
   Result(property = "READERIP", column = "READERIP")
)
@Select("""<script>
   SELECT * FROM app_act_cms_data_reader
</script>""")
fun GetListAll():ArrayList<app_act_cms_data_reader_dto>
        


}

        
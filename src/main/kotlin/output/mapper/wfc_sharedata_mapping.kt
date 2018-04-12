

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfc_sharedata_mapping{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PARENTINSTID", column = "PARENTINSTID"),
   Result(property = "PARENTBOID", column = "PARENTBOID"),
   Result(property = "SUBINSTID", column = "SUBINSTID"),
   Result(property = "SUBBOID", column = "SUBBOID")
)
@Select("""<script>
   SELECT * FROM wfc_sharedata_mapping
</script>""")
fun GetListAll():ArrayList<wfc_sharedata_mapping_dto>
        


}

        
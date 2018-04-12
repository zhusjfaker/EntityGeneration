

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_sla_dim_d{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "INSTNAME", column = "INSTNAME"),
   Result(property = "METRICID", column = "METRICID"),
   Result(property = "VAVG", column = "VAVG"),
   Result(property = "VMAX", column = "VMAX"),
   Result(property = "VMIN", column = "VMIN"),
   Result(property = "VCOUNT", column = "VCOUNT"),
   Result(property = "VTIME", column = "VTIME"),
   Result(property = "ISPROCESSING", column = "ISPROCESSING")
)
@Select("""<script>
   SELECT * FROM sys_sla_dim_d
</script>""")
fun GetListAll():ArrayList<sys_sla_dim_d_dto>
        


}

        
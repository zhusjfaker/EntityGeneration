

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_property{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PLID", column = "PLID"),
   Result(property = "PROPERTYID", column = "PROPERTYID"),
   Result(property = "PROPERTYNAME", column = "PROPERTYNAME"),
   Result(property = "PROPERTYVALUE", column = "PROPERTYVALUE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_property
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_property_dto>
        


}

        
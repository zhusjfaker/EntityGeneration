

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_property{


@Results(
   Result(property = "PROPERTYKEY", column = "PROPERTYKEY"),
   Result(property = "PROPERTYVALUE", column = "PROPERTYVALUE")
)
@Select("""<script>
   SELECT * FROM sys_coe_property
</script>""")
fun GetListAll():ArrayList<sys_coe_property_dto>
        


}

        
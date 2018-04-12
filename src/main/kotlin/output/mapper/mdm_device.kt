

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface mdm_device{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DEVICEMODEL", column = "DEVICEMODEL"),
   Result(property = "DEVICEBRAND", column = "DEVICEBRAND"),
   Result(property = "OSTYPE", column = "OSTYPE"),
   Result(property = "OSNAME", column = "OSNAME"),
   Result(property = "DEVICETYPE", column = "DEVICETYPE"),
   Result(property = "DEVICESTATUS", column = "DEVICESTATUS"),
   Result(property = "SECURITYSTATUS", column = "SECURITYSTATUS"),
   Result(property = "ROOTED", column = "ROOTED"),
   Result(property = "PHONENUMBER", column = "PHONENUMBER"),
   Result(property = "REGISTERTIME", column = "REGISTERTIME"),
   Result(property = "REGISTERUSERID", column = "REGISTERUSERID"),
   Result(property = "ASSETTYPE", column = "ASSETTYPE"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "LASTLOGINTIME", column = "LASTLOGINTIME"),
   Result(property = "UNREGISTERED", column = "UNREGISTERED")
)
@Select("""<script>
   SELECT * FROM mdm_device
</script>""")
fun GetListAll():ArrayList<mdm_device_dto>
        


}

        
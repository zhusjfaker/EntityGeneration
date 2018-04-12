
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class orgrole_dto(
       val ID :String,
       var ROLENAME :String,
       var ORDERINDEX :BigDecimal,
       var CATEGORYNAME :String,
       var LOOKANDFEEL :String? = null,
       var ROLENO :String? = null,
       var ROLEDESC :String? = null,
       var EXT1 :String? = null,
       var EXT2 :String? = null,
       var EXT3 :String? = null,
       var EXT4 :String? = null,
       var EXT5 :String? = null,
       var CREATEDATE :Timestamp? = null,
       var UPDATEDATE :Timestamp? = null
       
)
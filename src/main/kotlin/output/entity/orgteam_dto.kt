
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class orgteam_dto(
       val ID :String,
       var TEAMNAME :String,
       var ORDERINDEX :BigDecimal? = null,
       var TEAMTYPE :Integer? = null,
       var CLOSED :Integer? = null,
       var CREATEUSER :String? = null,
       var PARENTID :String? = null,
       var ISGROUP :Integer? = null,
       var TEAMDESC :String? = null,
       var EXT1 :String? = null,
       var EXT2 :String? = null,
       var EXT3 :String? = null,
       var EXT4 :String? = null,
       var EXT5 :String? = null,
       var CREATEDATE :Timestamp? = null,
       var UPDATEDATE :Timestamp? = null
       
)
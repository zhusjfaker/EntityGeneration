
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class vorgdept_dto(
       val ID :String,
       var DEPARTMENTNAME :String? = null,
       var UNITID :String? = null,
       var PARENTDEPARTMENTID :String? = null,
       var DEPARTMENTNO :String? = null,
       var LAYER :Integer? = null,
       var ORDERINDEX :BigDecimal? = null,
       var EXT1 :String? = null,
       var EXT2 :String? = null,
       var EXT3 :String? = null,
       var EXT4 :String? = null,
       var EXT5 :String? = null,
       var ADMINISTRATORS :String? = null
       
)
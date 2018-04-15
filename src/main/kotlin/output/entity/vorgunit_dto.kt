
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class vorgunit_dto(
       val ID :String,
       var RDEPTID :String? = null,
       var UNITNAME :String? = null,
       var ADMINISTRATORS :String? = null,
       var UNITGROUP :String? = null,
       var UNITDESC :String? = null,
       var STATUS :Integer? = null,
       var EXT1 :String? = null,
       var EXT2 :String? = null,
       var EXT3 :String? = null,
       var EXT4 :String? = null,
       var EXT5 :String? = null
       
)
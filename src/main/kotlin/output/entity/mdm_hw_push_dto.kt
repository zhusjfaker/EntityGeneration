
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class mdm_hw_push_dto(
       val ID :String,
       var HUAWEITOKEN :String? = null,
       var ISONLINE :Integer? = null
       
)
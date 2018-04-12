
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class mdm_warning_dto(
       val ID :String,
       var DEVICEID :String? = null,
       var WARNTIME :Timestamp? = null,
       var WARNTYPE :Integer? = null,
       var WARNMSG :String? = null,
       var HANDLED :Integer? = null
       
)

package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class mdm_handlelog_dto(
       val ID :String,
       var DEVICEID :String? = null,
       var USERID :String? = null,
       var HANDLETIME :Timestamp? = null,
       var HANDLETYPE :Integer? = null,
       var COMMANDID :String? = null
       
)
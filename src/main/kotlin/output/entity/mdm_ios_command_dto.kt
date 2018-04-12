
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class mdm_ios_command_dto(
       val ID :String,
       var COMMAND :String? = null,
       var DEVICEUDID :String? = null,
       var STATUS :Integer? = null,
       var UPDATETIME :Timestamp? = null,
       var EXT1 :String? = null,
       var EXT2 :String? = null,
       var IOSMDM :Integer? = null
       
)
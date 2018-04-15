
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class app_act_orgimp_log_dto(
       val ID :String,
       var OPTYPE :Integer? = null,
       var ORGTYPE :Integer? = null,
       var LOGFILE :String? = null,
       var XLSFILE :String? = null,
       var STARTTIME :Timestamp,
       var ENDTIME :Timestamp? = null,
       var STATUS :Integer? = null,
       var REMARK :String? = null,
       var OPTUSER :String? = null,
       var IP :String? = null,
       var LOGDOWNLOAD :String? = null
       
)
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class app_act_orgimp_log_dto(
       val ID :String,
       var OPTYPE :Integer? = null,
       var ORGTYPE :Integer? = null,
       var LOGFILE :String? = null,
       var XLSFILE :String? = null,
       var STARTTIME :Timestamp,
       var ENDTIME :Timestamp? = null,
       var STATUS :Integer? = null,
       var REMARK :String? = null,
       var OPTUSER :String? = null,
       var IP :String? = null,
       var LOGDOWNLOAD :String? = null
       
)
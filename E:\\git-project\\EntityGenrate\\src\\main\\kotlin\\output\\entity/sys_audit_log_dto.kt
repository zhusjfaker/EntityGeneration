
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class sys_audit_log_dto(
       val ID :String,
       var LOG_CHANNEL :String? = null,
       var LOG_CATALOG :String? = null,
       var LOG_OBJECT :String? = null,
       var OP :String? = null,
       var OP_TIME :Timestamp? = null,
       var OP_IP :String? = null,
       var OP_INFO :String? = null,
       var OP_LEVEL :Integer? = null,
       var AUDIT_ROLE :Integer? = null,
       var OP_USER :String? = null,
       var EXT1 :String? = null
       
)
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class sys_audit_log_dto(
       val ID :String,
       var LOG_CHANNEL :String? = null,
       var LOG_CATALOG :String? = null,
       var LOG_OBJECT :String? = null,
       var OP :String? = null,
       var OP_TIME :Timestamp? = null,
       var OP_IP :String? = null,
       var OP_INFO :String? = null,
       var OP_LEVEL :Integer? = null,
       var AUDIT_ROLE :Integer? = null,
       var OP_USER :String? = null,
       var EXT1 :String? = null
       
)
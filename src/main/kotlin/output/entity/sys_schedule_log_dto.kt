
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class sys_schedule_log_dto(
       val ID :BigDecimal,
       var SCHEDULE_ID :String? = null,
       var EXECUTE_TIME :Timestamp? = null,
       var END_TIME :Timestamp? = null,
       var STATUS :String? = null,
       var LOG_MEMO :String? = null,
       var EXECUTE_TYPE :String? = null,
       var LOG_TYPE :String? = null,
       var LOG_TIME :Timestamp? = null,
       var JOB_GROUP :String? = null
       
)
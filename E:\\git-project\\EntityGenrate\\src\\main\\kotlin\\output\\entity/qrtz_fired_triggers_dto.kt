
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class qrtz_fired_triggers_dto(
       val SCHED_NAME :String,
       val ENTRY_ID :String,
       var TRIGGER_NAME :String,
       var TRIGGER_GROUP :String,
       var INSTANCE_NAME :String,
       var FIRED_TIME :Long,
       var SCHED_TIME :Long,
       var PRIORITY :Integer,
       var STATE :String,
       var JOB_NAME :String? = null,
       var JOB_GROUP :String? = null,
       var IS_NONCONCURRENT :String? = null,
       var REQUESTS_RECOVERY :String? = null
       
)
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class qrtz_fired_triggers_dto(
       val SCHED_NAME :String,
       val ENTRY_ID :String,
       var TRIGGER_NAME :String,
       var TRIGGER_GROUP :String,
       var INSTANCE_NAME :String,
       var FIRED_TIME :Long,
       var SCHED_TIME :Long,
       var PRIORITY :Integer,
       var STATE :String,
       var JOB_NAME :String? = null,
       var JOB_GROUP :String? = null,
       var IS_NONCONCURRENT :String? = null,
       var REQUESTS_RECOVERY :String? = null
       
)
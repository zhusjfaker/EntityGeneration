
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class qrtz_triggers_dto(
       val SCHED_NAME :String,
       val TRIGGER_NAME :String,
       val TRIGGER_GROUP :String,
       var JOB_NAME :String,
       var JOB_GROUP :String,
       var DESCRIPTION :String? = null,
       var NEXT_FIRE_TIME :Long? = null,
       var PREV_FIRE_TIME :Long? = null,
       var PRIORITY :Integer? = null,
       var TRIGGER_STATE :String,
       var TRIGGER_TYPE :String,
       var START_TIME :Long,
       var END_TIME :Long? = null,
       var CALENDAR_NAME :String? = null,
       var MISFIRE_INSTR :Integer? = null,
       var JOB_DATA :ByteArray? = null
       
)
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class qrtz_triggers_dto(
       val SCHED_NAME :String,
       val TRIGGER_NAME :String,
       val TRIGGER_GROUP :String,
       var JOB_NAME :String,
       var JOB_GROUP :String,
       var DESCRIPTION :String? = null,
       var NEXT_FIRE_TIME :Long? = null,
       var PREV_FIRE_TIME :Long? = null,
       var PRIORITY :Integer? = null,
       var TRIGGER_STATE :String,
       var TRIGGER_TYPE :String,
       var START_TIME :Long,
       var END_TIME :Long? = null,
       var CALENDAR_NAME :String? = null,
       var MISFIRE_INSTR :Integer? = null,
       var JOB_DATA :ByteArray? = null
       
)
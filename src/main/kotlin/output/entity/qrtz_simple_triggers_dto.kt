
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class qrtz_simple_triggers_dto(
       val SCHED_NAME :String,
       val TRIGGER_NAME :String,
       val TRIGGER_GROUP :String,
       var REPEAT_COUNT :Long,
       var REPEAT_INTERVAL :Long,
       var TIMES_TRIGGERED :Long
       
)
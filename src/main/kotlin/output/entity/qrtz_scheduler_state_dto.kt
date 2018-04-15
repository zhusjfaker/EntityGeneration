
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class qrtz_scheduler_state_dto(
       val SCHED_NAME :String,
       val INSTANCE_NAME :String,
       var LAST_CHECKIN_TIME :Long,
       var CHECKIN_INTERVAL :Long
       
)
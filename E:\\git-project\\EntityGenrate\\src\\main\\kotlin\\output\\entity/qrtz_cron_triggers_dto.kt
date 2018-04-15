
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class qrtz_cron_triggers_dto(
       val SCHED_NAME :String,
       val TRIGGER_NAME :String,
       val TRIGGER_GROUP :String,
       var CRON_EXPRESSION :String,
       var TIME_ZONE_ID :String? = null
       
)
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class qrtz_cron_triggers_dto(
       val SCHED_NAME :String,
       val TRIGGER_NAME :String,
       val TRIGGER_GROUP :String,
       var CRON_EXPRESSION :String,
       var TIME_ZONE_ID :String? = null
       
)
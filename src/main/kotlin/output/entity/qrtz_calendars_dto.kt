
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class qrtz_calendars_dto(
       val SCHED_NAME :String,
       val CALENDAR_NAME :String,
       var CALENDAR :ByteArray
       
)
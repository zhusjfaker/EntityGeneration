
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class sys_sla_alarm_dto(
       val ID :String,
       var INSTNAME :String,
       var ALARMNAME :String? = null,
       var EVENTTIME :Timestamp? = null,
       var ALARMLEVEL :Integer? = null,
       var METRICID :String? = null,
       var TAKEVALUE :BigDecimal? = null,
       var TAKEDETAIL :String? = null,
       var APPID :String? = null,
       var RESOURCEID :String? = null,
       var ISREAD :Integer? = null
       
)
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class sys_sla_alarm_dto(
       val ID :String,
       var INSTNAME :String,
       var ALARMNAME :String? = null,
       var EVENTTIME :Timestamp? = null,
       var ALARMLEVEL :Integer? = null,
       var METRICID :String? = null,
       var TAKEVALUE :BigDecimal? = null,
       var TAKEDETAIL :String? = null,
       var APPID :String? = null,
       var RESOURCEID :String? = null,
       var ISREAD :Integer? = null
       
)

package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class bo_act_workcalendar_holiday_dto(
       val ID :String,
       var ORGID :String? = null,
       var BINDID :String? = null,
       var CREATEDATE :Timestamp? = null,
       var CREATEUSER :String? = null,
       var UPDATEDATE :Timestamp? = null,
       var UPDATEUSER :String? = null,
       var PROCESSDEFID :String? = null,
       var ISEND :Integer,
       var YEAR :BigDecimal? = null,
       var WCTYPE :String? = null,
       var WCNAME :String? = null,
       var AMSTARTTIME :Timestamp? = null,
       var AMENDTIME :Timestamp? = null,
       var PMSTARTTIME :Timestamp? = null,
       var PMENDTIME :Timestamp? = null,
       var BATCHBINIDID :String? = null
       
)
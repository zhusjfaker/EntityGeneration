
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class bo_act_workcalendar_dto(
       val ID :String,
       var ORGID :String? = null,
       var BINDID :String? = null,
       var CREATEDATE :Timestamp? = null,
       var CREATEUSER :String? = null,
       var UPDATEDATE :Timestamp? = null,
       var UPDATEUSER :String? = null,
       var PROCESSDEFID :String? = null,
       var ISEND :Integer,
       var WCKEY :String? = null,
       var WCNAME :String? = null,
       var WCTIMEZONE :String? = null,
       var WCEXTCLASS :String? = null,
       var MEMO :String? = null
       
)
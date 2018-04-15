
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class app_act_pat_plan_dto(
       val ID :String,
       var BATCHPLANID :String? = null,
       var PLANNAME :String? = null,
       var STARTUSER :String? = null,
       var STARTUSERDEPTID :String? = null,
       var STARTUSERROLEID :String? = null,
       var CREATETIME :Timestamp? = null,
       var CREATEUSER :String? = null,
       var PLANSTATUS :Integer? = null,
       var ENDSTYLE :Integer? = null,
       var STARTTIME :Timestamp? = null,
       var ENDTIME :Timestamp? = null,
       var PLANID :String? = null,
       var SEQNUMBER :BigDecimal? = null,
       var PROCESSINSTID :String? = null,
       var PROCESSDEFID :String? = null,
       var ROWINDEX :Integer? = null
       
)
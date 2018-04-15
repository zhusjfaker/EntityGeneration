
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class sys_session_dto(
       val SESSIONID :String,
       var ISSDK :Integer? = null,
       var USERID :String,
       var IP :String? = null,
       var STARTTIME :BigDecimal,
       var REFRESHTIME :BigDecimal? = null,
       var CLOSETIME :BigDecimal? = null,
       var DEVICETYPE :String? = null,
       var DEVICELANG :String? = null,
       var SESSIONSCOPE :String? = null,
       var INSTNAME :String? = null,
       var CLOSED :Integer? = null
       
)
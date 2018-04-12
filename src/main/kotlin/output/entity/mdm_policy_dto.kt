
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class mdm_policy_dto(
       val ID :String,
       var NAME :String? = null,
       var DESCRIPTION :String? = null,
       var FILE_NAME :String? = null,
       var STATUS :Integer? = null,
       var ALLOW_ROOT :Integer? = null,
       var POLICYVERSION :BigDecimal? = null,
       var CREATETIME :Timestamp? = null,
       var UPDATETIME :Timestamp? = null
       
)

package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class mdm_policy_install_dto(
       val ID :String,
       var POLICYID :String,
       var DEVICEID :String,
       var INSTALLVERSION :BigDecimal? = null,
       var INSTALLTIME :Timestamp? = null
       
)
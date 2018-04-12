
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class orgteam_member_dto(
       val ID :String,
       var TEAMID :String,
       var USERID :String,
       var MEMBERTYPE :Integer? = null,
       var ORDERINDEX :BigDecimal? = null
       
)
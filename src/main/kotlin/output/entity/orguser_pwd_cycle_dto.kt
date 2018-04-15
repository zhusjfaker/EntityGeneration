
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class orguser_pwd_cycle_dto(
       val ID :String,
       var USERID :String? = null,
       var PASSWORD :String? = null,
       var LASTDATE :Timestamp? = null,
       var IP :String? = null
       
)
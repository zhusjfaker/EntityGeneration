
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class wfh_formprint_dto(
       val ID :String,
       var PROCESSINSTID :String? = null,
       var TASKINSTID :String? = null,
       var PRINTTIME :Timestamp? = null,
       var USERID :String? = null,
       var USERNAME :String? = null,
       var IPADD :String? = null
       
)
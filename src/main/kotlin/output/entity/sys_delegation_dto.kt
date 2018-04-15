
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class sys_delegation_dto(
       val ID :String,
       var APPLICANTUSER :String? = null,
       var DELEGATEUSER :String? = null,
       var SCOPETYPE :String? = null,
       var DELEGATEREASON :String? = null,
       var BEGINTIME :Timestamp? = null,
       var ENDTIME :Timestamp? = null,
       var CREATETIME :Timestamp? = null,
       var PROCESSINSTID :String? = null
       
)
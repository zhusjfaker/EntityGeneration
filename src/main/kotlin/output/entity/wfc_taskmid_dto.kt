
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class wfc_taskmid_dto(
       val ID :String,
       var PROCESSINSTID :String? = null,
       var TASKINSTID :String? = null,
       var PROCESSDEFID :String? = null,
       var PROCESSDEFVERID :String? = null,
       var ACTIVITYDEFID :String? = null,
       var OWNER :String? = null,
       var OWNERDEPTID :String? = null,
       var TARGET :String? = null,
       var TARGETDEPTID :String? = null,
       var TARGETCOMPANYID :String? = null,
       var TARGETROLEID :String? = null,
       var DISPATCHSTATE :Integer? = null,
       var PRIORITY :Integer? = null,
       var DUETIME :Timestamp? = null,
       var ORDERINDEX :Integer? = null
       
)
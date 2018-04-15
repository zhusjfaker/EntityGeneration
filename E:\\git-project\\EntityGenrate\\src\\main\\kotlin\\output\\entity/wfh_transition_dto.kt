
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class wfh_transition_dto(
       val ID :String,
       var PROCESSINSTID :String? = null,
       var TASKINSTID :String? = null,
       var PROCESSDEFID :String? = null,
       var SOURCEDEFID :String? = null,
       var SOURCETYPE :String? = null,
       var SEQUENCEFLOWDEFID :String? = null,
       var TARGETDEFID :String? = null,
       var TARGETTYPE :String? = null,
       var ISACTIVE :Integer? = null,
       var CREATETIME :Timestamp? = null,
       var ENDTIME :Timestamp? = null
       
)
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class wfh_transition_dto(
       val ID :String,
       var PROCESSINSTID :String? = null,
       var TASKINSTID :String? = null,
       var PROCESSDEFID :String? = null,
       var SOURCEDEFID :String? = null,
       var SOURCETYPE :String? = null,
       var SEQUENCEFLOWDEFID :String? = null,
       var TARGETDEFID :String? = null,
       var TARGETTYPE :String? = null,
       var ISACTIVE :Integer? = null,
       var CREATETIME :Timestamp? = null,
       var ENDTIME :Timestamp? = null
       
)
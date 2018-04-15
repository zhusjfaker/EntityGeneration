
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class sys_patch_bootstrap_dto(
       val ID :String,
       var CLASSNAME :String? = null,
       var PATCHNAME :String? = null,
       var PATCHDESC :String? = null,
       var PATCHDATE :String? = null,
       var BEGINTIME :Timestamp? = null,
       var ENDTIME :Timestamp? = null,
       var PATCHSTATE :Integer? = null,
       var ERRLOG :String? = null,
       var INSTNAME :String? = null
       
)
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class sys_patch_bootstrap_dto(
       val ID :String,
       var CLASSNAME :String? = null,
       var PATCHNAME :String? = null,
       var PATCHDESC :String? = null,
       var PATCHDATE :String? = null,
       var BEGINTIME :Timestamp? = null,
       var ENDTIME :Timestamp? = null,
       var PATCHSTATE :Integer? = null,
       var ERRLOG :String? = null,
       var INSTNAME :String? = null
       
)
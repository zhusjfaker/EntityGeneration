
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class wfc_comment_dto(
       val ID :String,
       var PROCESSINSTID :String? = null,
       var TASKINSTID :String? = null,
       var CREATEDATE :Timestamp? = null,
       var CREATEUSER :String? = null,
       var DEPTNAME :String? = null,
       var POSITIONNAME :String? = null,
       var ACTIONNAME :String? = null,
       var ACTIVITYNAME :String? = null,
       var MSG :String? = null,
       var FILES :String? = null
       
)

package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class wfh_urltoken_dto(
       val TOKENID :String,
       var PROCESSINSTID :String? = null,
       var TASKINSTID :String? = null,
       var AWSUID :String? = null,
       var TOKENSTATE :Integer? = null,
       var MEMO :String? = null
       
)
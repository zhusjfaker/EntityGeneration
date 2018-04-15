
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class sys_dw_user_profile_dto(
       var ID :String? = null,
       var VIEWID :String? = null,
       var USERID :String? = null,
       var PROFILE_TYPE :Integer? = null,
       var PROFILE_VAL :String? = null,
       var WIDTH :String? = null,
       var ISDISPLAY :Integer? = null,
       var ORDERINDEX :Integer? = null,
       var PAGE :Integer? = null
       
)
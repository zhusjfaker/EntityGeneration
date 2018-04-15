
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class bo_act_sso_log_dto(
       val ID :String,
       var ORGID :String? = null,
       var BINDID :String? = null,
       var CREATEDATE :Timestamp? = null,
       var CREATEUSER :String? = null,
       var UPDATEDATE :Timestamp? = null,
       var UPDATEUSER :String? = null,
       var PROCESSDEFID :String? = null,
       var ISEND :Integer,
       var OPTTYPE :String? = null,
       var OPTSTATE :String? = null,
       var SSOID :String? = null,
       var SSONAME :String? = null,
       var OPTTIME :Timestamp? = null,
       var USERID :String? = null,
       var USERNAME :String? = null,
       var OPTIP :String? = null,
       var DEPTID :String? = null,
       var DEPTNAME :String? = null,
       var COMPANYID :String? = null,
       var COMPANYNAME :String? = null
       
)
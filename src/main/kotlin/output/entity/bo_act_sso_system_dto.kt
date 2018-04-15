
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class bo_act_sso_system_dto(
       val ID :String,
       var ORGID :String? = null,
       var BINDID :String? = null,
       var CREATEDATE :Timestamp? = null,
       var CREATEUSER :String? = null,
       var UPDATEDATE :Timestamp? = null,
       var UPDATEUSER :String? = null,
       var PROCESSDEFID :String? = null,
       var ISEND :Integer,
       var SSONAME :String? = null,
       var MEMO :String? = null,
       var ICON32 :String? = null,
       var ICON96 :String? = null,
       var LOGINURL :String? = null,
       var SUBMITTYPE :String? = null,
       var LOGINTARGET :String? = null,
       var ISACTIVE :BigDecimal? = null,
       var ORDERINDEX :BigDecimal? = null,
       var ACCESSKEY :String? = null,
       var SEC :String? = null
       
)
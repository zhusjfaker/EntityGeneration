
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class orguser_bak_dto(
       var ID :String,
       var USERNO :String? = null,
       var USERID :String,
       var USERNAME :String? = null,
       var ORDERINDEX :BigDecimal? = null,
       var PASSWORD :String,
       var CLOSED :Integer,
       var DEPARTMENTID :String? = null,
       var ROLEID :String? = null,
       var ISMANAGER :Integer? = null,
       var WORKCANLENDAR :String? = null,
       var POSITION_NO :String? = null,
       var POSITION_NAME :String? = null,
       var POSITION_LAYER :String? = null,
       var OFFICETEL :String? = null,
       var OFFICEFAX :String? = null,
       var MOBILE :String? = null,
       var EMAIL :String? = null,
       var USERIP :String? = null,
       var ISSINGLELOGIN :Integer? = null,
       var WORK_STATUS :String? = null,
       var SESSIONTIME :BigDecimal? = null,
       var OUTERID :String? = null,
       var WECHAT :String? = null,
       var EXT1 :String? = null,
       var EXT2 :String? = null,
       var EXT3 :String? = null,
       var EXT4 :String? = null,
       var EXT5 :String? = null,
       var REPORTTO :String? = null,
       var CLOSEDATE :Timestamp? = null,
       var CREATEDATE :Timestamp? = null,
       var UPDATEDATE :Timestamp? = null,
       var SECURITYLEVEL :Integer? = null
       
)
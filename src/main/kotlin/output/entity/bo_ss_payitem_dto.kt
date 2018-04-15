
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class bo_ss_payitem_dto(
       val ID :String,
       var ORGID :String? = null,
       var BINDID :String? = null,
       var CREATEDATE :Timestamp? = null,
       var CREATEUSER :String? = null,
       var UPDATEDATE :Timestamp? = null,
       var UPDATEUSER :String? = null,
       var PROCESSDEFID :String? = null,
       var ISEND :Integer,
       var COMID :String? = null,
       var BIZDATE :Timestamp? = null,
       var DPTID1 :String? = null,
       var UNITID :String? = null,
       var BUID :String? = null,
       var BILLTYPE :String? = null,
       var BIZTYPE :String? = null,
       var NO :String? = null,
       var BAMOUNT :BigDecimal? = null,
       var FAMOUNT :BigDecimal? = null,
       var MEMO :String? = null
       
)
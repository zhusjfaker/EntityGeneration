
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class bo_ss_whgoods_dto(
       val ID :String,
       var ORGID :String? = null,
       var BINDID :String? = null,
       var CREATEDATE :Timestamp? = null,
       var CREATEUSER :String? = null,
       var UPDATEDATE :Timestamp? = null,
       var UPDATEUSER :String? = null,
       var PROCESSDEFID :String? = null,
       var ISEND :Integer,
       var WHID :String? = null,
       var GOODSID :String? = null,
       var QUANTRA :BigDecimal? = null,
       var QUAN :BigDecimal? = null,
       var PRICE :BigDecimal? = null,
       var AMOUNT :BigDecimal? = null,
       var COMID :String? = null
       
)

package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class bo_act_dict_kv_item_dto(
       val ID :String,
       var ORGID :String? = null,
       var BINDID :String? = null,
       var CREATEDATE :Timestamp,
       var CREATEUSER :String? = null,
       var UPDATEDATE :Timestamp,
       var UPDATEUSER :String? = null,
       var PROCESSDEFID :String? = null,
       var ISEND :BigDecimal,
       var ITEMNO :String? = null,
       var CNNAME :String? = null,
       var ENNAME :String? = null,
       var BIG5NAME :String? = null,
       var EXTTEXT1 :String? = null,
       var EXTTEXT2 :String? = null,
       var EXTTEXT3 :String? = null,
       var EXTTEXT4 :String? = null,
       var EXTTEXT5 :String? = null,
       var EXTTEXT6 :String? = null,
       var EXTTEXT7 :String? = null,
       var EXTTEXT8 :String? = null,
       var EXTTEXT9 :String? = null,
       var EXTTEXT10 :String? = null,
       var EXTINT1 :BigDecimal? = null,
       var EXTINT2 :BigDecimal? = null,
       var EXTINT3 :BigDecimal? = null,
       var EXTINT4 :BigDecimal? = null,
       var EXTINT5 :BigDecimal? = null,
       var EXTDOUBLE1 :BigDecimal? = null,
       var EXTDOUBLE2 :BigDecimal? = null,
       var EXTDOUBLE3 :BigDecimal? = null,
       var EXTDATE1 :Timestamp? = null,
       var EXTDATE2 :Timestamp? = null,
       var ORDERINDEX :BigDecimal? = null,
       var ISACTIVE :BigDecimal? = null,
       var ISSYS :BigDecimal? = null,
       var DICTKEY :String? = null,
       var PNO :String? = null,
       var ISLEAF :BigDecimal? = null
       
)
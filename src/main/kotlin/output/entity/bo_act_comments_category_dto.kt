
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class bo_act_comments_category_dto(
       val ID :String,
       var ORGID :String? = null,
       var BINDID :String? = null,
       var CREATEDATE :Timestamp? = null,
       var CREATEUSER :String? = null,
       var UPDATEDATE :Timestamp? = null,
       var UPDATEUSER :String? = null,
       var PROCESSDEFID :String? = null,
       var ISEND :Integer,
       var NAME :String? = null,
       var ORDERINDEX :BigDecimal? = null,
       var ISACTIVE :BigDecimal? = null
       
)
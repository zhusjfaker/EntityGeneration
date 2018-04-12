
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class app_act_metro_nav_dto(
       val ID :String,
       var FUNCTIONID :String? = null,
       var ORDERNO :BigDecimal? = null,
       var CREATEUSER :String? = null,
       var CREATETIME :Timestamp
       
)
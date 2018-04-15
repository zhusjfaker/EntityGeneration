
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class qrtz_simprop_triggers_dto(
       val SCHED_NAME :String,
       val TRIGGER_NAME :String,
       val TRIGGER_GROUP :String,
       var STR_PROP_1 :String? = null,
       var STR_PROP_2 :String? = null,
       var STR_PROP_3 :String? = null,
       var INT_PROP_1 :Integer? = null,
       var INT_PROP_2 :Integer? = null,
       var LONG_PROP_1 :Long? = null,
       var LONG_PROP_2 :Long? = null,
       var DEC_PROP_1 :BigDecimal? = null,
       var DEC_PROP_2 :BigDecimal? = null,
       var BOOL_PROP_1 :String? = null,
       var BOOL_PROP_2 :String? = null
       
)
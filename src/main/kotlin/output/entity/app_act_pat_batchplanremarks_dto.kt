
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class app_act_pat_batchplanremarks_dto(
       val ID :String,
       var BATCHPLANID :String? = null,
       var CREATEUSER :String? = null,
       var CREATETIME :Timestamp? = null,
       var REMARKS :String? = null,
       var STYLE :Integer? = null
       
)

package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class app_act_mportal_nav_dto(
       val ID :String,
       var FUNCTIONID :String? = null,
       var ORDERNO :Integer? = null,
       var CREATEUSER :String? = null,
       var CREATETIME :Timestamp
       
)
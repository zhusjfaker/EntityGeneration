
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class app_act_iweboffice_tem_dto(
       val ID :String,
       var TYPEID :String? = null,
       var TEMPLATENAME :String? = null,
       var CREATEUSER :String? = null,
       var CREATETIME :Timestamp? = null,
       var ISPAUSE :String? = null
       
)
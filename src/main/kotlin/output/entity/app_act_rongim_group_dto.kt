
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class app_act_rongim_group_dto(
       val ID :String,
       var GROUPNAME :String? = null,
       var GROUPDESC :String? = null,
       var CREATEUSER :String? = null,
       var CREATETIME :Timestamp? = null,
       var UPDATETIME :Timestamp? = null
       
)
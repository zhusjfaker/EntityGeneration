
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class app_act_rongim_group_member_dto(
       val ID :String,
       var GROUPID :String? = null,
       var USERID :String? = null,
       var ISMANAGER :Integer? = null,
       var STOPNOTIFY :Integer? = null,
       var ISTOP :Integer? = null
       
)
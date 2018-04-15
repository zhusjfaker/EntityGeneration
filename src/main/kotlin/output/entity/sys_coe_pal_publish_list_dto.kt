
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class sys_coe_pal_publish_list_dto(
       val ID :String,
       var PID :String? = null,
       var PALREPOSITORYID :String? = null,
       var ACTIONTYPE :String? = null,
       var PUBLISHDESC :String? = null
       
)
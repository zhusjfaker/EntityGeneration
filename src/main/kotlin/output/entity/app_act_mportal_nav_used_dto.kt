
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class app_act_mportal_nav_used_dto(
       val ID :String,
       var NAME :String? = null,
       var URL :String? = null,
       var TARGET :String? = null,
       var ICON64 :String? = null,
       var APPID :String? = null,
       var NAVID :String? = null,
       var USERID :String? = null,
       var FUNNAVID :String? = null
       
)
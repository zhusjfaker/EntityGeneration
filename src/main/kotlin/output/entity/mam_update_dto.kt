
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class mam_update_dto(
       val ID :String,
       var APPID :String? = null,
       var DEVICEID :String? = null,
       var UPDATETIME :Timestamp? = null,
       var UPDATEVERSION :String? = null
       
)
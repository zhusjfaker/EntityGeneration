
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class mam_appuse_dto(
       val ID :String,
       var APPID :String? = null,
       var DEVICEID :String? = null,
       var USETIME :Timestamp? = null,
       var APPVERSION :String? = null
       
)
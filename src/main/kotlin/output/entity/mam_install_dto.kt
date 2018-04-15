
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class mam_install_dto(
       val ID :String,
       var APPID :String? = null,
       var DEVICEID :String? = null,
       var INSTALLTIME :Timestamp? = null,
       var INSTALLVERSION :String? = null,
       var CURRENTVERSION :String? = null,
       var UNINSTALLED :Integer? = null
       
)

package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class sys_permissionlist_dto(
       val ID :String,
       var PERMISSIONID :String,
       var RESOURCETYPE :String,
       var RESOURCEID :String,
       var ACCESSMODE :Integer,
       var EXT1 :String? = null
       
)
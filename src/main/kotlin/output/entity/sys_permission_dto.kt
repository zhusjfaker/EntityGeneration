
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class sys_permission_dto(
       val ID :String,
       var CATEGORYNAME :String? = null,
       var PERMISSIONNAME :String? = null,
       var PERMISSIONDESC :String? = null,
       var ISSYSTEM :Integer? = null
       
)

package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class orgusermap_dto(
       val ID :String,
       var USERID :String,
       var DEPARTMENTID :String? = null,
       var ROLEID :String? = null,
       var ISMANAGER :Integer? = null,
       var ISSHOW :Integer? = null
       
)
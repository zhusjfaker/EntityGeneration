
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class sys_userprofile_dto(
       val USERID :String,
       val PROFILEKEY :String,
       var PROFILEVALUE :String? = null
       
)
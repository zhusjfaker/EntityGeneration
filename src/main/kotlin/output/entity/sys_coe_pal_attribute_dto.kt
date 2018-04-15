
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class sys_coe_pal_attribute_dto(
       val ID :String,
       var WSID :String? = null,
       var ATTRID :String? = null,
       var ATTRNAME :String? = null,
       var ATTRVALUE :String? = null,
       var CATEGORY :String? = null,
       var METHODID :String? = null,
       var TYPE :String? = null,
       var ISDELETE :String? = null
       
)
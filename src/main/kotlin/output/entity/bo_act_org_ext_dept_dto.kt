
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class bo_act_org_ext_dept_dto(
       val ID :String,
       var ORGID :String? = null,
       var BINDID :String? = null,
       var CREATEDATE :Timestamp? = null,
       var CREATEUSER :String? = null,
       var UPDATEDATE :Timestamp? = null,
       var UPDATEUSER :String? = null,
       var PROCESSDEFID :String? = null,
       var ISEND :Integer,
       var DEPARTMENTID :String? = null
       
)
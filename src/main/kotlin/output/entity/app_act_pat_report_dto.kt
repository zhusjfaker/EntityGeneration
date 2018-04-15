
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class app_act_pat_report_dto(
       val ID :String,
       var REPORTNAME :String? = null,
       var TESTCASEID :String? = null,
       var BATCHPLANID :String? = null,
       var CREATEUSER :String? = null,
       var CREATETIME :Timestamp? = null,
       var DCINFO :String? = null,
       var PROCESSDEFID :String? = null
       
)
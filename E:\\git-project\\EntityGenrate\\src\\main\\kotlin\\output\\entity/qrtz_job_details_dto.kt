
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class qrtz_job_details_dto(
       val SCHED_NAME :String,
       val JOB_NAME :String,
       val JOB_GROUP :String,
       var DESCRIPTION :String? = null,
       var JOB_CLASS_NAME :String,
       var IS_DURABLE :String,
       var IS_NONCONCURRENT :String,
       var IS_UPDATE_DATA :String,
       var REQUESTS_RECOVERY :String,
       var JOB_DATA :ByteArray? = null
       
)
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class qrtz_job_details_dto(
       val SCHED_NAME :String,
       val JOB_NAME :String,
       val JOB_GROUP :String,
       var DESCRIPTION :String? = null,
       var JOB_CLASS_NAME :String,
       var IS_DURABLE :String,
       var IS_NONCONCURRENT :String,
       var IS_UPDATE_DATA :String,
       var REQUESTS_RECOVERY :String,
       var JOB_DATA :ByteArray? = null
       
)
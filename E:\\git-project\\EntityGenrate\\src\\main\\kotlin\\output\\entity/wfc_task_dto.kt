
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class wfc_task_dto(
       val ID :String,
       var PARENTTASKINSTID :String? = null,
       var SCOPEID :String? = null,
       var ACTIVITYTYPE :String? = null,
       var ACTIVITYDEFID :String? = null,
       var PROCESSINSTID :String? = null,
       var PROCESSDEFID :String? = null,
       var PROCESSDEFVERID :String? = null,
       var PROCESSGROUPID :String? = null,
       var DISPATCHID :String? = null,
       var TASKTITLE :String? = null,
       var TASKSTATE :Integer? = null,
       var CONTROLSTATE :String? = null,
       var PRIORITY :Integer? = null,
       var OWNER :String? = null,
       var TARGET :String? = null,
       var CLAIMTYPE :Integer? = null,
       var CLAIMRESOURCEID :String? = null,
       var DUETIME :Timestamp? = null,
       var BEGINTIME :Timestamp? = null,
       var BEGINENGINENODE :String? = null,
       var READTIME :Timestamp? = null,
       var OWNERDEPTID :String? = null,
       var TARGETDEPTID :String? = null,
       var TARGETCOMPANYID :String? = null,
       var TARGETROLEID :String? = null,
       var ISMONITOR :Integer? = null,
       var ISASYNC :Integer? = null,
       var EXCEPTIONERR :String? = null,
       var IOBD :String? = null,
       var IOR :String? = null,
       var IOS :String? = null,
       var IOC :String? = null,
       var EXT1 :String? = null,
       var EXT2 :String? = null,
       var EXT3 :String? = null,
       var REMINDTIMES :Integer? = null,
       var DELAYTIMES :BigDecimal? = null,
       var READSTATE :Integer? = null,
       var EXT4 :String? = null,
       var EXT5 :String? = null,
       var EXT6 :String? = null,
       var EXT7 :BigDecimal? = null,
       var EXT8 :BigDecimal? = null,
       var SECURITYLEVEL :Integer? = null
       
)
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class wfc_task_dto(
       val ID :String,
       var PARENTTASKINSTID :String? = null,
       var SCOPEID :String? = null,
       var ACTIVITYTYPE :String? = null,
       var ACTIVITYDEFID :String? = null,
       var PROCESSINSTID :String? = null,
       var PROCESSDEFID :String? = null,
       var PROCESSDEFVERID :String? = null,
       var PROCESSGROUPID :String? = null,
       var DISPATCHID :String? = null,
       var TASKTITLE :String? = null,
       var TASKSTATE :Integer? = null,
       var CONTROLSTATE :String? = null,
       var PRIORITY :Integer? = null,
       var OWNER :String? = null,
       var TARGET :String? = null,
       var CLAIMTYPE :Integer? = null,
       var CLAIMRESOURCEID :String? = null,
       var DUETIME :Timestamp? = null,
       var BEGINTIME :Timestamp? = null,
       var BEGINENGINENODE :String? = null,
       var READTIME :Timestamp? = null,
       var OWNERDEPTID :String? = null,
       var TARGETDEPTID :String? = null,
       var TARGETCOMPANYID :String? = null,
       var TARGETROLEID :String? = null,
       var ISMONITOR :Integer? = null,
       var ISASYNC :Integer? = null,
       var EXCEPTIONERR :String? = null,
       var IOBD :String? = null,
       var IOR :String? = null,
       var IOS :String? = null,
       var IOC :String? = null,
       var EXT1 :String? = null,
       var EXT2 :String? = null,
       var EXT3 :String? = null,
       var REMINDTIMES :Integer? = null,
       var DELAYTIMES :BigDecimal? = null,
       var READSTATE :Integer? = null,
       var EXT4 :String? = null,
       var EXT5 :String? = null,
       var EXT6 :String? = null,
       var EXT7 :BigDecimal? = null,
       var EXT8 :BigDecimal? = null,
       var SECURITYLEVEL :Integer? = null
       
)
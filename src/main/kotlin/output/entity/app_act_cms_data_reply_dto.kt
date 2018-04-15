
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class app_act_cms_data_reply_dto(
       val ID :String,
       var DATAID :String? = null,
       var REPLYER :String? = null,
       var REPLYTIME :Timestamp? = null,
       var REPLYCONTENT :String? = null,
       var ORGID :String? = null,
       var REPLYERIP :String? = null
       
)

package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class app_act_email_templete_dto(
       val ID :String,
       var TEMPLATENAME :String? = null,
       var EMAILTO :String? = null,
       var COPYTO :String? = null,
       var EMAIL_TITLE :String? = null,
       var EMAIL_CONTENT :String? = null,
       var TEMPLATETYPE :String? = null,
       var ISDEFAULT :Integer? = null,
       var EMAILFROM :String? = null,
       var FROMNAME :String? = null,
       var ISVALID :Integer? = null
       
)
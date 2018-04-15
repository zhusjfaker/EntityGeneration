
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class app_act_cms_data_dto(
       val ID :String,
       var MODULEID :String? = null,
       var MSGTITLE :String? = null,
       var BOLDFLAG :String? = null,
       var TITLECOLOR :String? = null,
       var MSGTITLEPIC :String? = null,
       var MSGSUMMARY :String? = null,
       var MSGCONTENT :String? = null,
       var MSGTYPE :String? = null,
       var MSGSOURCE :String? = null,
       var CREATEUSER :String? = null,
       var CREATETIME :Timestamp? = null,
       var UPDATEUSER :String? = null,
       var UPDATETIME :Timestamp? = null,
       var READFLAG :String? = null,
       var READNUM :Integer? = null,
       var REPLYFLAG :String? = null,
       var REPLYNUM :Integer? = null,
       var COPYFLAG :String? = null,
       var ZDFLAG :String? = null,
       var ZDFLAGNOW :String? = null,
       var ZDBEGINTIME :Timestamp? = null,
       var ZDENDTIME :Timestamp? = null,
       var ISCLOSE :String? = null,
       var ATTACHMENTNAME :String? = null,
       var OUTERURL :String? = null,
       var PIID :String? = null,
       var BOID :String? = null,
       var READSCOPEDESC :String? = null,
       var GJC :String? = null,
       var PLATFORMFLAG :String? = null,
       var SUBMODULE :String? = null,
       var SUBTITLE :String? = null,
       var OVERLINE :String? = null,
       var AUTHOR :String? = null,
       var PHOTOGRAPHER :String? = null,
       var FILENAME :String? = null,
       var FILEDESC :String? = null,
       var VIDEOFILE :String? = null,
       var DELETEFLAG :String? = null,
       var RELEASEDEPARTMENT :String? = null,
       var RELEASETIME :Timestamp? = null,
       var SORTTIME :Timestamp? = null,
       var PLATFORMPIID :String? = null,
       var WORDCOUNT :String? = null,
       var RECOMMENDFLAG :String? = null,
       var USEOUTERURL :String? = null
       
)
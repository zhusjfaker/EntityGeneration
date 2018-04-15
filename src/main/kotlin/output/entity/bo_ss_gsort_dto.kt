
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class bo_ss_gsort_dto(
       val ID :String,
       var ORGID :String? = null,
       var BINDID :String? = null,
       var CREATEDATE :Timestamp? = null,
       var CREATEUSER :String? = null,
       var UPDATEDATE :Timestamp? = null,
       var UPDATEUSER :String? = null,
       var PROCESSDEFID :String? = null,
       var ISEND :Integer,
       var GSCODE :String? = null,
       var GSNAME :String? = null,
       var UPCODE :String? = null,
       var ISEND1 :String? = null,
       var MEMO :String? = null,
       var GTYPE :String? = null,
       var PARENTID :String? = null,
       var STATUS1 :String? = null,
       var EXT1 :String? = null,
       var EXT2 :String? = null,
       var EXT3 :String? = null,
       var EXT4 :String? = null
       
)
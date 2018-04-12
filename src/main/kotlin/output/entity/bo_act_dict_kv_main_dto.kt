
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class bo_act_dict_kv_main_dto(
       val ID :String,
       var ORGID :String? = null,
       var BINDID :String? = null,
       var CREATEDATE :Timestamp,
       var CREATEUSER :String? = null,
       var UPDATEDATE :Timestamp,
       var UPDATEUSER :String? = null,
       var PROCESSDEFID :String? = null,
       var ISEND :BigDecimal,
       var DICTNAME :String? = null,
       var DICTKEY :String? = null,
       var APPID :String? = null,
       var ISCACHE :BigDecimal? = null,
       var ISSYS :BigDecimal? = null,
       var ISTREE :BigDecimal? = null,
       var MEMO :String? = null,
       var DICTMETA :String? = null,
       var DICTCATEGORY :String? = null,
       var COMPONENTSETTING :String? = null
       
)
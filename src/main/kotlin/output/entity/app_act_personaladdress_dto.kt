
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class app_act_personaladdress_dto(
       val ID :String,
       var USERID :String,
       var EMAIL :String? = null,
       var GROUPNAME :String? = null,
       var FAMILYNAME :String? = null,
       var SUFFIXNAME :String? = null,
       var FULLNAME :String? = null,
       var PY :String? = null,
       var PYINDEX :String? = null,
       var BCOMPANY :String? = null,
       var BWWW :String? = null,
       var BDEPT :String? = null,
       var BPOSITION :String? = null,
       var BADDRESS :String? = null,
       var BPOSTCODE :String? = null,
       var BCOUNTRY :String? = null,
       var BCITY :String? = null,
       var BTEL :String? = null,
       var BFAX :String? = null,
       var PPOSTCODE :String? = null,
       var PADDRESS :String? = null,
       var PTEL :String? = null,
       var PFAX :String? = null,
       var PMOB :String? = null,
       var PQQ :String? = null,
       var PWEIBO :String? = null,
       var PWEIXIN :String? = null,
       var PSKYPE :String? = null,
       var PLIKE :String? = null,
       var MEMO :String? = null,
       var CREATEUSER :String,
       var CREATETIME :Timestamp? = null,
       var UPDATETIME :Timestamp? = null,
       var SHARETO :String? = null
       
)
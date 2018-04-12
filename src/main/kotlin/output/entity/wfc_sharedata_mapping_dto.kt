
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class wfc_sharedata_mapping_dto(
       val ID :String,
       var PARENTINSTID :String? = null,
       var PARENTBOID :String? = null,
       var SUBINSTID :String? = null,
       var SUBBOID :String? = null
       
)

package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class sys_sequence_dto(
       val SEQUENCENAME :String,
       var SEQUENCEVALUE :BigDecimal? = null,
       var CACHESTEP :BigDecimal? = null
       
)
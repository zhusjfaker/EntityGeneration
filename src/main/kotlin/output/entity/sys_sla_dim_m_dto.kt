
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class sys_sla_dim_m_dto(
       val ID :String,
       var INSTNAME :String,
       var METRICID :String,
       var VAVG :BigDecimal? = null,
       var VMAX :BigDecimal? = null,
       var VMIN :BigDecimal? = null,
       var VCOUNT :BigDecimal? = null,
       var VTIME :String,
       var ISPROCESSING :Integer? = null
       
)
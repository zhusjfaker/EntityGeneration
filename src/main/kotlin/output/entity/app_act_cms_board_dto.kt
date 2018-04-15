
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class app_act_cms_board_dto(
       val ID :String,
       var SITEID :String? = null,
       var BOARDNAME :String? = null,
       var BOARDSORT :String? = null,
       var BOARDWIDTH :String? = null,
       var WIDGETHEIGHT :String? = null,
       var BOARDDESC :String? = null,
       var USEFLAG :String? = null,
       var SHOWTITLEBARFLAG :String? = null,
       var TITLEBARCOLOR :String? = null,
       var TITLEBARICON :String? = null,
       var TITLEBARBGIMAGE :String? = null,
       var BOARDTITLEBARBGFLAG :String? = null,
       var BOARDTITLEBARCONTENT :String? = null,
       var TITLEBARFONTCOLOR :String? = null,
       var TITLEBARFONTSIZE :String? = null
       
)
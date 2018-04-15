
package bpm6.entity

import java.lang.*
import java.math.*
import java.sql.*

data class app_act_cms_site_dto(
       val ID :String,
       var SITENAME :String? = null,
       var SITEURL :String? = null,
       var SITEDESC :String? = null,
       var SITESHOWBANNER :String? = null,
       var SITEBANNERIMAGE :String? = null,
       var USEFLAG :String? = null,
       var SITETYPE :String? = null,
       var CREATETIME :Timestamp? = null,
       var CREATEUSER :String? = null,
       var SHOWNAVFLAG :String? = null,
       var NAVFONTCOLOR :String? = null,
       var NAVBGCOLOR :String? = null,
       var NAVHOVERFONTCOLOR :String? = null,
       var NAVHOVERBGCOLOR :String? = null,
       var SITEBGIMAGE :String? = null
       
)
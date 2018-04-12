

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_cms_board{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "SITEID", column = "SITEID"),
   Result(property = "BOARDNAME", column = "BOARDNAME"),
   Result(property = "BOARDSORT", column = "BOARDSORT"),
   Result(property = "BOARDWIDTH", column = "BOARDWIDTH"),
   Result(property = "WIDGETHEIGHT", column = "WIDGETHEIGHT"),
   Result(property = "BOARDDESC", column = "BOARDDESC"),
   Result(property = "USEFLAG", column = "USEFLAG"),
   Result(property = "SHOWTITLEBARFLAG", column = "SHOWTITLEBARFLAG"),
   Result(property = "TITLEBARCOLOR", column = "TITLEBARCOLOR"),
   Result(property = "TITLEBARICON", column = "TITLEBARICON"),
   Result(property = "TITLEBARBGIMAGE", column = "TITLEBARBGIMAGE"),
   Result(property = "BOARDTITLEBARBGFLAG", column = "BOARDTITLEBARBGFLAG"),
   Result(property = "BOARDTITLEBARCONTENT", column = "BOARDTITLEBARCONTENT"),
   Result(property = "TITLEBARFONTCOLOR", column = "TITLEBARFONTCOLOR"),
   Result(property = "TITLEBARFONTSIZE", column = "TITLEBARFONTSIZE")
)
@Select("""<script>
   SELECT * FROM app_act_cms_board
</script>""")
fun GetListAll():ArrayList<app_act_cms_board_dto>
        


}

        
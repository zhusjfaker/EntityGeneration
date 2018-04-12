

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_cms_data{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "MODULEID", column = "MODULEID"),
   Result(property = "MSGTITLE", column = "MSGTITLE"),
   Result(property = "BOLDFLAG", column = "BOLDFLAG"),
   Result(property = "TITLECOLOR", column = "TITLECOLOR"),
   Result(property = "MSGTITLEPIC", column = "MSGTITLEPIC"),
   Result(property = "MSGSUMMARY", column = "MSGSUMMARY"),
   Result(property = "MSGCONTENT", column = "MSGCONTENT"),
   Result(property = "MSGTYPE", column = "MSGTYPE"),
   Result(property = "MSGSOURCE", column = "MSGSOURCE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "UPDATEUSER", column = "UPDATEUSER"),
   Result(property = "UPDATETIME", column = "UPDATETIME"),
   Result(property = "READFLAG", column = "READFLAG"),
   Result(property = "READNUM", column = "READNUM"),
   Result(property = "REPLYFLAG", column = "REPLYFLAG"),
   Result(property = "REPLYNUM", column = "REPLYNUM"),
   Result(property = "COPYFLAG", column = "COPYFLAG"),
   Result(property = "ZDFLAG", column = "ZDFLAG"),
   Result(property = "ZDFLAGNOW", column = "ZDFLAGNOW"),
   Result(property = "ZDBEGINTIME", column = "ZDBEGINTIME"),
   Result(property = "ZDENDTIME", column = "ZDENDTIME"),
   Result(property = "ISCLOSE", column = "ISCLOSE"),
   Result(property = "ATTACHMENTNAME", column = "ATTACHMENTNAME"),
   Result(property = "OUTERURL", column = "OUTERURL"),
   Result(property = "PIID", column = "PIID"),
   Result(property = "BOID", column = "BOID"),
   Result(property = "READSCOPEDESC", column = "READSCOPEDESC"),
   Result(property = "GJC", column = "GJC"),
   Result(property = "PLATFORMFLAG", column = "PLATFORMFLAG"),
   Result(property = "SUBMODULE", column = "SUBMODULE"),
   Result(property = "SUBTITLE", column = "SUBTITLE"),
   Result(property = "OVERLINE", column = "OVERLINE"),
   Result(property = "AUTHOR", column = "AUTHOR"),
   Result(property = "PHOTOGRAPHER", column = "PHOTOGRAPHER"),
   Result(property = "FILENAME", column = "FILENAME"),
   Result(property = "FILEDESC", column = "FILEDESC"),
   Result(property = "VIDEOFILE", column = "VIDEOFILE"),
   Result(property = "DELETEFLAG", column = "DELETEFLAG"),
   Result(property = "RELEASEDEPARTMENT", column = "RELEASEDEPARTMENT"),
   Result(property = "RELEASETIME", column = "RELEASETIME"),
   Result(property = "SORTTIME", column = "SORTTIME"),
   Result(property = "PLATFORMPIID", column = "PLATFORMPIID"),
   Result(property = "WORDCOUNT", column = "WORDCOUNT"),
   Result(property = "RECOMMENDFLAG", column = "RECOMMENDFLAG"),
   Result(property = "USEOUTERURL", column = "USEOUTERURL")
)
@Select("""<script>
   SELECT * FROM app_act_cms_data
</script>""")
fun GetListAll():ArrayList<app_act_cms_data_dto>
        


}

        
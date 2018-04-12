

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_act_cms_content_history{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ORGID", column = "ORGID"),
   Result(property = "BINDID", column = "BINDID"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE"),
   Result(property = "UPDATEUSER", column = "UPDATEUSER"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ISEND", column = "ISEND"),
   Result(property = "MSGTYPE", column = "MSGTYPE"),
   Result(property = "TITLE", column = "TITLE"),
   Result(property = "TITLECOLOR", column = "TITLECOLOR"),
   Result(property = "BOLDFLAG", column = "BOLDFLAG"),
   Result(property = "SUMMARY", column = "SUMMARY"),
   Result(property = "TITLEPIC", column = "TITLEPIC"),
   Result(property = "CONTENT", column = "CONTENT"),
   Result(property = "USEOUTERURL", column = "USEOUTERURL"),
   Result(property = "OUTURL", column = "OUTURL"),
   Result(property = "PICTURELIST", column = "PICTURELIST"),
   Result(property = "ATTACHMENT", column = "ATTACHMENT"),
   Result(property = "ZDFLAG", column = "ZDFLAG"),
   Result(property = "ZDENDTIME", column = "ZDENDTIME"),
   Result(property = "ZDBEGINTIME", column = "ZDBEGINTIME"),
   Result(property = "COPYFLAG", column = "COPYFLAG"),
   Result(property = "REPLYFLAG", column = "REPLYFLAG"),
   Result(property = "ISCLOSE", column = "ISCLOSE"),
   Result(property = "READFLAG", column = "READFLAG"),
   Result(property = "MODULEID", column = "MODULEID"),
   Result(property = "RELEASEDEPARTMENT", column = "RELEASEDEPARTMENT"),
   Result(property = "SOURCE", column = "SOURCE"),
   Result(property = "MESSAGEID", column = "MESSAGEID"),
   Result(property = "READSCOPE", column = "READSCOPE"),
   Result(property = "READSCOPEDESC", column = "READSCOPEDESC"),
   Result(property = "RELEASETIME", column = "RELEASETIME"),
   Result(property = "READNUM", column = "READNUM"),
   Result(property = "REPLYNUM", column = "REPLYNUM"),
   Result(property = "SUBMODULE", column = "SUBMODULE"),
   Result(property = "SUBTITLE", column = "SUBTITLE"),
   Result(property = "OVERLINE", column = "OVERLINE"),
   Result(property = "GJC", column = "GJC"),
   Result(property = "AUTHOR", column = "AUTHOR"),
   Result(property = "PHOTOGRAPHER", column = "PHOTOGRAPHER"),
   Result(property = "FILENAME", column = "FILENAME"),
   Result(property = "FILEPARAMS", column = "FILEPARAMS"),
   Result(property = "FILEDESC", column = "FILEDESC"),
   Result(property = "VIDEOFILE", column = "VIDEOFILE"),
   Result(property = "PLATFORM", column = "PLATFORM"),
   Result(property = "PLATFORMBINDID", column = "PLATFORMBINDID"),
   Result(property = "WORDCOUNT", column = "WORDCOUNT"),
   Result(property = "RECOMMENDFLAG", column = "RECOMMENDFLAG"),
   Result(property = "MAINBINDID", column = "MAINBINDID")
)
@Select("""<script>
   SELECT * FROM bo_act_cms_content_history
</script>""")
fun GetListAll():ArrayList<bo_act_cms_content_history_dto>
        


}

        
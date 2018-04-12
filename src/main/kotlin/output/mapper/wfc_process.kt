

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfc_process{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BUSINESSKEY", column = "BUSINESSKEY"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "PROCESSDEFVERID", column = "PROCESSDEFVERID"),
   Result(property = "CONTROLSTATE", column = "CONTROLSTATE"),
   Result(property = "PROCESSGROUPID", column = "PROCESSGROUPID"),
   Result(property = "PROCESSTITLE", column = "PROCESSTITLE"),
   Result(property = "STARTACTIVITYID", column = "STARTACTIVITYID"),
   Result(property = "STARTTASKINSTID", column = "STARTTASKINSTID"),
   Result(property = "STARTTIME", column = "STARTTIME"),
   Result(property = "PROCESSPROFILEID", column = "PROCESSPROFILEID"),
   Result(property = "PROCESSINSTTYPE", column = "PROCESSINSTTYPE"),
   Result(property = "PARENTPROCESSINSTID", column = "PARENTPROCESSINSTID"),
   Result(property = "PARENTTASKINSTID", column = "PARENTTASKINSTID"),
   Result(property = "SECURITYLAYER", column = "SECURITYLAYER"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "CREATEUSERORGID", column = "CREATEUSERORGID"),
   Result(property = "CREATEUSERDEPTID", column = "CREATEUSERDEPTID"),
   Result(property = "CREATEUSERROLEID", column = "CREATEUSERROLEID"),
   Result(property = "CREATEUSERLOCATION", column = "CREATEUSERLOCATION"),
   Result(property = "ENDACTIVITYID", column = "ENDACTIVITYID"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "ISPROCESS", column = "ISPROCESS"),
   Result(property = "ISSTART", column = "ISSTART"),
   Result(property = "ISEND", column = "ISEND"),
   Result(property = "ISASYNC", column = "ISASYNC"),
   Result(property = "ISEXCEPTION", column = "ISEXCEPTION"),
   Result(property = "ISOVERTIME", column = "ISOVERTIME"),
   Result(property = "ISEXISTSUBPROC", column = "ISEXISTSUBPROC"),
   Result(property = "COSTTTIME", column = "COSTTTIME"),
   Result(property = "EXPIRETIME", column = "EXPIRETIME"),
   Result(property = "REMARK", column = "REMARK"),
   Result(property = "IOBD", column = "IOBD"),
   Result(property = "IOR", column = "IOR"),
   Result(property = "IOS", column = "IOS"),
   Result(property = "IOC", column = "IOC"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "REMINDTIMES", column = "REMINDTIMES"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "EXT6", column = "EXT6"),
   Result(property = "EXT7", column = "EXT7"),
   Result(property = "EXT8", column = "EXT8")
)
@Select("""<script>
   SELECT * FROM wfc_process
</script>""")
fun GetListAll():ArrayList<wfc_process_dto>
        


}

        
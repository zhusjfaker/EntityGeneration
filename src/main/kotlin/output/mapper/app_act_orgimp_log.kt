

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_orgimp_log{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "OPTYPE", column = "OPTYPE"),
   Result(property = "ORGTYPE", column = "ORGTYPE"),
   Result(property = "LOGFILE", column = "LOGFILE"),
   Result(property = "XLSFILE", column = "XLSFILE"),
   Result(property = "STARTTIME", column = "STARTTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "REMARK", column = "REMARK"),
   Result(property = "OPTUSER", column = "OPTUSER"),
   Result(property = "IP", column = "IP"),
   Result(property = "LOGDOWNLOAD", column = "LOGDOWNLOAD")
)
@Select("""<script>
   SELECT * FROM app_act_orgimp_log
</script>""")
fun GetListAll():ArrayList<app_act_orgimp_log_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "OPTYPE", column = "OPTYPE"),
   Result(property = "ORGTYPE", column = "ORGTYPE"),
   Result(property = "LOGFILE", column = "LOGFILE"),
   Result(property = "XLSFILE", column = "XLSFILE"),
   Result(property = "STARTTIME", column = "STARTTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "REMARK", column = "REMARK"),
   Result(property = "OPTUSER", column = "OPTUSER"),
   Result(property = "IP", column = "IP"),
   Result(property = "LOGDOWNLOAD", column = "LOGDOWNLOAD")
)
@Select("""<script>
   SELECT * FROM app_act_orgimp_log
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="OPTYPE!=null">
      OPTYPE=#{OPTYPE}
   </if> 
   <if test="ORGTYPE!=null">
      ORGTYPE=#{ORGTYPE}
   </if> 
   <if test="LOGFILE!=null">
      LOGFILE=#{LOGFILE}
   </if> 
   <if test="XLSFILE!=null">
      XLSFILE=#{XLSFILE}
   </if> 
   <if test="STARTTIME!=null">
      STARTTIME=#{STARTTIME}
   </if> 
   <if test="ENDTIME!=null">
      ENDTIME=#{ENDTIME}
   </if> 
   <if test="STATUS!=null">
      STATUS=#{STATUS}
   </if> 
   <if test="REMARK!=null">
      REMARK=#{REMARK}
   </if> 
   <if test="OPTUSER!=null">
      OPTUSER=#{OPTUSER}
   </if> 
   <if test="IP!=null">
      IP=#{IP}
   </if> 
   <if test="LOGDOWNLOAD!=null">
      LOGDOWNLOAD=#{LOGDOWNLOAD}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_orgimp_log_dto):ArrayList<app_act_orgimp_log_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "OPTYPE", column = "OPTYPE"),
   Result(property = "ORGTYPE", column = "ORGTYPE"),
   Result(property = "LOGFILE", column = "LOGFILE"),
   Result(property = "XLSFILE", column = "XLSFILE"),
   Result(property = "STARTTIME", column = "STARTTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "REMARK", column = "REMARK"),
   Result(property = "OPTUSER", column = "OPTUSER"),
   Result(property = "IP", column = "IP"),
   Result(property = "LOGDOWNLOAD", column = "LOGDOWNLOAD")
)
@Select("""<script>
   SELECT * FROM app_act_orgimp_log
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_orgimp_log_dto):app_act_orgimp_log_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,OPTYPE,ORGTYPE,LOGFILE,XLSFILE,STARTTIME,ENDTIME,STATUS,REMARK,OPTUSER,IP,LOGDOWNLOAD)
    values
    (#{ID},#{OPTYPE},#{ORGTYPE},#{LOGFILE},#{XLSFILE},#{STARTTIME},#{ENDTIME},#{STATUS},#{REMARK},#{OPTUSER},#{IP},#{LOGDOWNLOAD})
</script>""")
fun insert(model:app_act_orgimp_log_dto):Unit
                

}

        
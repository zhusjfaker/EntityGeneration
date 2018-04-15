

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
    insert into app_act_orgimp_log
    (ID,OPTYPE,ORGTYPE,LOGFILE,XLSFILE,STARTTIME,ENDTIME,STATUS,REMARK,OPTUSER,IP,LOGDOWNLOAD)
    values
    (#{ID},#{OPTYPE},#{ORGTYPE},#{LOGFILE},#{XLSFILE},#{STARTTIME},#{ENDTIME},#{STATUS},#{REMARK},#{OPTUSER},#{IP},#{LOGDOWNLOAD})
</script>""")
fun Insert(model:app_act_orgimp_log_dto):Unit
                


@Insert("""<script>
    insert into app_act_orgimp_log
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='OPTYPE!= null'> 
           OPTYPE,
        </if>
        <if test='ORGTYPE!= null'> 
           ORGTYPE,
        </if>
        <if test='LOGFILE!= null'> 
           LOGFILE,
        </if>
        <if test='XLSFILE!= null'> 
           XLSFILE,
        </if>
           STARTTIME,
        <if test='ENDTIME!= null'> 
           ENDTIME,
        </if>
        <if test='STATUS!= null'> 
           STATUS,
        </if>
        <if test='REMARK!= null'> 
           REMARK,
        </if>
        <if test='OPTUSER!= null'> 
           OPTUSER,
        </if>
        <if test='IP!= null'> 
           IP,
        </if>
        <if test='LOGDOWNLOAD!= null'> 
           LOGDOWNLOAD
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=varchar}，
        <if test='OPTYPE!= null'> 
           #{OPTYPE,jdbcType=smallint}，
        </if>
        <if test='ORGTYPE!= null'> 
           #{ORGTYPE,jdbcType=smallint}，
        </if>
        <if test='LOGFILE!= null'> 
           #{LOGFILE,jdbcType=varchar}，
        </if>
        <if test='XLSFILE!= null'> 
           #{XLSFILE,jdbcType=varchar}，
        </if>
           #{STARTTIME,jdbcType=datetime}，
        <if test='ENDTIME!= null'> 
           #{ENDTIME,jdbcType=datetime}，
        </if>
        <if test='STATUS!= null'> 
           #{STATUS,jdbcType=smallint}，
        </if>
        <if test='REMARK!= null'> 
           #{REMARK,jdbcType=varchar}，
        </if>
        <if test='OPTUSER!= null'> 
           #{OPTUSER,jdbcType=varchar}，
        </if>
        <if test='IP!= null'> 
           #{IP,jdbcType=varchar}，
        </if>
        <if test='LOGDOWNLOAD!= null'> 
           #{LOGDOWNLOAD,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_orgimp_log_dto):Unit
                


@Delete("DELETE FROM app_act_orgimp_log WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE app_act_orgimp_log SET
        ID=#{ID,jdbcType=String},
        OPTYPE=#{OPTYPE,jdbcType=Integer},
        ORGTYPE=#{ORGTYPE,jdbcType=Integer},
        LOGFILE=#{LOGFILE,jdbcType=String},
        XLSFILE=#{XLSFILE,jdbcType=String},
        STARTTIME=#{STARTTIME,jdbcType=Timestamp},
        ENDTIME=#{ENDTIME,jdbcType=Timestamp},
        STATUS=#{STATUS,jdbcType=Integer},
        REMARK=#{REMARK,jdbcType=String},
        OPTUSER=#{OPTUSER,jdbcType=String},
        IP=#{IP,jdbcType=String},
        LOGDOWNLOAD=#{LOGDOWNLOAD,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:app_act_orgimp_log_dto)
        

@Update("""<script>
            UPDATE app_act_orgimp_log SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="OPTYPE != null">  OPTYPE=#{OPTYPE,jdbcType=Integer},</if>
        <if test="ORGTYPE != null">  ORGTYPE=#{ORGTYPE,jdbcType=Integer},</if>
        <if test="LOGFILE != null">  LOGFILE=#{LOGFILE,jdbcType=String},</if>
        <if test="XLSFILE != null">  XLSFILE=#{XLSFILE,jdbcType=String},</if>
        <if test="STARTTIME != null">  STARTTIME=#{STARTTIME,jdbcType=Timestamp},</if>
        <if test="ENDTIME != null">  ENDTIME=#{ENDTIME,jdbcType=Timestamp},</if>
        <if test="STATUS != null">  STATUS=#{STATUS,jdbcType=Integer},</if>
        <if test="REMARK != null">  REMARK=#{REMARK,jdbcType=String},</if>
        <if test="OPTUSER != null">  OPTUSER=#{OPTUSER,jdbcType=String},</if>
        <if test="IP != null">  IP=#{IP,jdbcType=String},</if>
        <if test="LOGDOWNLOAD != null">  LOGDOWNLOAD=#{LOGDOWNLOAD,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:app_act_orgimp_log_dto)
            

}

        
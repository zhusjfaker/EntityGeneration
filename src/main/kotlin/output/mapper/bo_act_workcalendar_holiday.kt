

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_act_workcalendar_holiday{


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
   Result(property = "YEAR", column = "YEAR"),
   Result(property = "WCTYPE", column = "WCTYPE"),
   Result(property = "WCNAME", column = "WCNAME"),
   Result(property = "AMSTARTTIME", column = "AMSTARTTIME"),
   Result(property = "AMENDTIME", column = "AMENDTIME"),
   Result(property = "PMSTARTTIME", column = "PMSTARTTIME"),
   Result(property = "PMENDTIME", column = "PMENDTIME"),
   Result(property = "BATCHBINIDID", column = "BATCHBINIDID")
)
@Select("""<script>
   SELECT * FROM bo_act_workcalendar_holiday
</script>""")
fun GetListAll():ArrayList<bo_act_workcalendar_holiday_dto>
        


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
   Result(property = "YEAR", column = "YEAR"),
   Result(property = "WCTYPE", column = "WCTYPE"),
   Result(property = "WCNAME", column = "WCNAME"),
   Result(property = "AMSTARTTIME", column = "AMSTARTTIME"),
   Result(property = "AMENDTIME", column = "AMENDTIME"),
   Result(property = "PMSTARTTIME", column = "PMSTARTTIME"),
   Result(property = "PMENDTIME", column = "PMENDTIME"),
   Result(property = "BATCHBINIDID", column = "BATCHBINIDID")
)
@Select("""<script>
   SELECT * FROM bo_act_workcalendar_holiday
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="ORGID!=null">
      ORGID=#{ORGID}
   </if> 
   <if test="BINDID!=null">
      BINDID=#{BINDID}
   </if> 
   <if test="CREATEDATE!=null">
      CREATEDATE=#{CREATEDATE}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="UPDATEDATE!=null">
      UPDATEDATE=#{UPDATEDATE}
   </if> 
   <if test="UPDATEUSER!=null">
      UPDATEUSER=#{UPDATEUSER}
   </if> 
   <if test="PROCESSDEFID!=null">
      PROCESSDEFID=#{PROCESSDEFID}
   </if> 
   <if test="ISEND!=null">
      ISEND=#{ISEND}
   </if> 
   <if test="YEAR!=null">
      YEAR=#{YEAR}
   </if> 
   <if test="WCTYPE!=null">
      WCTYPE=#{WCTYPE}
   </if> 
   <if test="WCNAME!=null">
      WCNAME=#{WCNAME}
   </if> 
   <if test="AMSTARTTIME!=null">
      AMSTARTTIME=#{AMSTARTTIME}
   </if> 
   <if test="AMENDTIME!=null">
      AMENDTIME=#{AMENDTIME}
   </if> 
   <if test="PMSTARTTIME!=null">
      PMSTARTTIME=#{PMSTARTTIME}
   </if> 
   <if test="PMENDTIME!=null">
      PMENDTIME=#{PMENDTIME}
   </if> 
   <if test="BATCHBINIDID!=null">
      BATCHBINIDID=#{BATCHBINIDID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:bo_act_workcalendar_holiday_dto):ArrayList<bo_act_workcalendar_holiday_dto>
                


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
   Result(property = "YEAR", column = "YEAR"),
   Result(property = "WCTYPE", column = "WCTYPE"),
   Result(property = "WCNAME", column = "WCNAME"),
   Result(property = "AMSTARTTIME", column = "AMSTARTTIME"),
   Result(property = "AMENDTIME", column = "AMENDTIME"),
   Result(property = "PMSTARTTIME", column = "PMSTARTTIME"),
   Result(property = "PMENDTIME", column = "PMENDTIME"),
   Result(property = "BATCHBINIDID", column = "BATCHBINIDID")
)
@Select("""<script>
   SELECT * FROM bo_act_workcalendar_holiday
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:bo_act_workcalendar_holiday_dto):bo_act_workcalendar_holiday_dto?
                


@Insert("""<script>
    insert into bo_act_workcalendar_holiday
    (ID,ORGID,BINDID,CREATEDATE,CREATEUSER,UPDATEDATE,UPDATEUSER,PROCESSDEFID,ISEND,YEAR,WCTYPE,WCNAME,AMSTARTTIME,AMENDTIME,PMSTARTTIME,PMENDTIME,BATCHBINIDID)
    values
    (#{ID},#{ORGID},#{BINDID},#{CREATEDATE},#{CREATEUSER},#{UPDATEDATE},#{UPDATEUSER},#{PROCESSDEFID},#{ISEND},#{YEAR},#{WCTYPE},#{WCNAME},#{AMSTARTTIME},#{AMENDTIME},#{PMSTARTTIME},#{PMENDTIME},#{BATCHBINIDID})
</script>""")
fun Insert(model:bo_act_workcalendar_holiday_dto):Unit
                


@Insert("""<script>
    insert into bo_act_workcalendar_holiday
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='ORGID!= null'> 
           ORGID,
        </if>
        <if test='BINDID!= null'> 
           BINDID,
        </if>
        <if test='CREATEDATE!= null'> 
           CREATEDATE,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='UPDATEDATE!= null'> 
           UPDATEDATE,
        </if>
        <if test='UPDATEUSER!= null'> 
           UPDATEUSER,
        </if>
        <if test='PROCESSDEFID!= null'> 
           PROCESSDEFID,
        </if>
           ISEND,
        <if test='YEAR!= null'> 
           YEAR,
        </if>
        <if test='WCTYPE!= null'> 
           WCTYPE,
        </if>
        <if test='WCNAME!= null'> 
           WCNAME,
        </if>
        <if test='AMSTARTTIME!= null'> 
           AMSTARTTIME,
        </if>
        <if test='AMENDTIME!= null'> 
           AMENDTIME,
        </if>
        <if test='PMSTARTTIME!= null'> 
           PMSTARTTIME,
        </if>
        <if test='PMENDTIME!= null'> 
           PMENDTIME,
        </if>
        <if test='BATCHBINIDID!= null'> 
           BATCHBINIDID
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='ORGID!= null'> 
           #{ORGID,jdbcType=varchar}，
        </if>
        <if test='BINDID!= null'> 
           #{BINDID,jdbcType=char}，
        </if>
        <if test='CREATEDATE!= null'> 
           #{CREATEDATE,jdbcType=timestamp}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='UPDATEDATE!= null'> 
           #{UPDATEDATE,jdbcType=timestamp}，
        </if>
        <if test='UPDATEUSER!= null'> 
           #{UPDATEUSER,jdbcType=varchar}，
        </if>
        <if test='PROCESSDEFID!= null'> 
           #{PROCESSDEFID,jdbcType=char}，
        </if>
           #{ISEND,jdbcType=smallint}，
        <if test='YEAR!= null'> 
           #{YEAR,jdbcType=decimal}，
        </if>
        <if test='WCTYPE!= null'> 
           #{WCTYPE,jdbcType=varchar}，
        </if>
        <if test='WCNAME!= null'> 
           #{WCNAME,jdbcType=varchar}，
        </if>
        <if test='AMSTARTTIME!= null'> 
           #{AMSTARTTIME,jdbcType=datetime}，
        </if>
        <if test='AMENDTIME!= null'> 
           #{AMENDTIME,jdbcType=datetime}，
        </if>
        <if test='PMSTARTTIME!= null'> 
           #{PMSTARTTIME,jdbcType=datetime}，
        </if>
        <if test='PMENDTIME!= null'> 
           #{PMENDTIME,jdbcType=datetime}，
        </if>
        <if test='BATCHBINIDID!= null'> 
           #{BATCHBINIDID,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:bo_act_workcalendar_holiday_dto):Unit
                


@Delete("DELETE FROM bo_act_workcalendar_holiday WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE bo_act_workcalendar_holiday SET
        ID=#{ID,jdbcType=String},
        ORGID=#{ORGID,jdbcType=String},
        BINDID=#{BINDID,jdbcType=String},
        CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp},
        UPDATEUSER=#{UPDATEUSER,jdbcType=String},
        PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},
        ISEND=#{ISEND,jdbcType=Integer},
        YEAR=#{YEAR,jdbcType=BigDecimal},
        WCTYPE=#{WCTYPE,jdbcType=String},
        WCNAME=#{WCNAME,jdbcType=String},
        AMSTARTTIME=#{AMSTARTTIME,jdbcType=Timestamp},
        AMENDTIME=#{AMENDTIME,jdbcType=Timestamp},
        PMSTARTTIME=#{PMSTARTTIME,jdbcType=Timestamp},
        PMENDTIME=#{PMENDTIME,jdbcType=Timestamp},
        BATCHBINIDID=#{BATCHBINIDID,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:bo_act_workcalendar_holiday_dto)
        

@Update("""<script>
            UPDATE bo_act_workcalendar_holiday SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="ORGID != null">  ORGID=#{ORGID,jdbcType=String},</if>
        <if test="BINDID != null">  BINDID=#{BINDID,jdbcType=String},</if>
        <if test="CREATEDATE != null">  CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="UPDATEDATE != null">  UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp},</if>
        <if test="UPDATEUSER != null">  UPDATEUSER=#{UPDATEUSER,jdbcType=String},</if>
        <if test="PROCESSDEFID != null">  PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},</if>
        <if test="ISEND != null">  ISEND=#{ISEND,jdbcType=Integer},</if>
        <if test="YEAR != null">  YEAR=#{YEAR,jdbcType=BigDecimal},</if>
        <if test="WCTYPE != null">  WCTYPE=#{WCTYPE,jdbcType=String},</if>
        <if test="WCNAME != null">  WCNAME=#{WCNAME,jdbcType=String},</if>
        <if test="AMSTARTTIME != null">  AMSTARTTIME=#{AMSTARTTIME,jdbcType=Timestamp},</if>
        <if test="AMENDTIME != null">  AMENDTIME=#{AMENDTIME,jdbcType=Timestamp},</if>
        <if test="PMSTARTTIME != null">  PMSTARTTIME=#{PMSTARTTIME,jdbcType=Timestamp},</if>
        <if test="PMENDTIME != null">  PMENDTIME=#{PMENDTIME,jdbcType=Timestamp},</if>
        <if test="BATCHBINIDID != null">  BATCHBINIDID=#{BATCHBINIDID,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:bo_act_workcalendar_holiday_dto)
            

}

        
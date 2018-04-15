

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_pat_plan{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "PLANNAME", column = "PLANNAME"),
   Result(property = "STARTUSER", column = "STARTUSER"),
   Result(property = "STARTUSERDEPTID", column = "STARTUSERDEPTID"),
   Result(property = "STARTUSERROLEID", column = "STARTUSERROLEID"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "PLANSTATUS", column = "PLANSTATUS"),
   Result(property = "ENDSTYLE", column = "ENDSTYLE"),
   Result(property = "STARTTIME", column = "STARTTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "PLANID", column = "PLANID"),
   Result(property = "SEQNUMBER", column = "SEQNUMBER"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ROWINDEX", column = "ROWINDEX")
)
@Select("""<script>
   SELECT * FROM app_act_pat_plan
</script>""")
fun GetListAll():ArrayList<app_act_pat_plan_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "PLANNAME", column = "PLANNAME"),
   Result(property = "STARTUSER", column = "STARTUSER"),
   Result(property = "STARTUSERDEPTID", column = "STARTUSERDEPTID"),
   Result(property = "STARTUSERROLEID", column = "STARTUSERROLEID"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "PLANSTATUS", column = "PLANSTATUS"),
   Result(property = "ENDSTYLE", column = "ENDSTYLE"),
   Result(property = "STARTTIME", column = "STARTTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "PLANID", column = "PLANID"),
   Result(property = "SEQNUMBER", column = "SEQNUMBER"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ROWINDEX", column = "ROWINDEX")
)
@Select("""<script>
   SELECT * FROM app_act_pat_plan
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="BATCHPLANID!=null">
      BATCHPLANID=#{BATCHPLANID}
   </if> 
   <if test="PLANNAME!=null">
      PLANNAME=#{PLANNAME}
   </if> 
   <if test="STARTUSER!=null">
      STARTUSER=#{STARTUSER}
   </if> 
   <if test="STARTUSERDEPTID!=null">
      STARTUSERDEPTID=#{STARTUSERDEPTID}
   </if> 
   <if test="STARTUSERROLEID!=null">
      STARTUSERROLEID=#{STARTUSERROLEID}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="PLANSTATUS!=null">
      PLANSTATUS=#{PLANSTATUS}
   </if> 
   <if test="ENDSTYLE!=null">
      ENDSTYLE=#{ENDSTYLE}
   </if> 
   <if test="STARTTIME!=null">
      STARTTIME=#{STARTTIME}
   </if> 
   <if test="ENDTIME!=null">
      ENDTIME=#{ENDTIME}
   </if> 
   <if test="PLANID!=null">
      PLANID=#{PLANID}
   </if> 
   <if test="SEQNUMBER!=null">
      SEQNUMBER=#{SEQNUMBER}
   </if> 
   <if test="PROCESSINSTID!=null">
      PROCESSINSTID=#{PROCESSINSTID}
   </if> 
   <if test="PROCESSDEFID!=null">
      PROCESSDEFID=#{PROCESSDEFID}
   </if> 
   <if test="ROWINDEX!=null">
      ROWINDEX=#{ROWINDEX}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_pat_plan_dto):ArrayList<app_act_pat_plan_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "PLANNAME", column = "PLANNAME"),
   Result(property = "STARTUSER", column = "STARTUSER"),
   Result(property = "STARTUSERDEPTID", column = "STARTUSERDEPTID"),
   Result(property = "STARTUSERROLEID", column = "STARTUSERROLEID"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "PLANSTATUS", column = "PLANSTATUS"),
   Result(property = "ENDSTYLE", column = "ENDSTYLE"),
   Result(property = "STARTTIME", column = "STARTTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "PLANID", column = "PLANID"),
   Result(property = "SEQNUMBER", column = "SEQNUMBER"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ROWINDEX", column = "ROWINDEX")
)
@Select("""<script>
   SELECT * FROM app_act_pat_plan
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_pat_plan_dto):app_act_pat_plan_dto?
                


@Insert("""<script>
    insert into app_act_pat_plan
    (ID,BATCHPLANID,PLANNAME,STARTUSER,STARTUSERDEPTID,STARTUSERROLEID,CREATETIME,CREATEUSER,PLANSTATUS,ENDSTYLE,STARTTIME,ENDTIME,PLANID,SEQNUMBER,PROCESSINSTID,PROCESSDEFID,ROWINDEX)
    values
    (#{ID},#{BATCHPLANID},#{PLANNAME},#{STARTUSER},#{STARTUSERDEPTID},#{STARTUSERROLEID},#{CREATETIME},#{CREATEUSER},#{PLANSTATUS},#{ENDSTYLE},#{STARTTIME},#{ENDTIME},#{PLANID},#{SEQNUMBER},#{PROCESSINSTID},#{PROCESSDEFID},#{ROWINDEX})
</script>""")
fun Insert(model:app_act_pat_plan_dto):Unit
                


@Insert("""<script>
    insert into app_act_pat_plan
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='BATCHPLANID!= null'> 
           BATCHPLANID,
        </if>
        <if test='PLANNAME!= null'> 
           PLANNAME,
        </if>
        <if test='STARTUSER!= null'> 
           STARTUSER,
        </if>
        <if test='STARTUSERDEPTID!= null'> 
           STARTUSERDEPTID,
        </if>
        <if test='STARTUSERROLEID!= null'> 
           STARTUSERROLEID,
        </if>
        <if test='CREATETIME!= null'> 
           CREATETIME,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='PLANSTATUS!= null'> 
           PLANSTATUS,
        </if>
        <if test='ENDSTYLE!= null'> 
           ENDSTYLE,
        </if>
        <if test='STARTTIME!= null'> 
           STARTTIME,
        </if>
        <if test='ENDTIME!= null'> 
           ENDTIME,
        </if>
        <if test='PLANID!= null'> 
           PLANID,
        </if>
        <if test='SEQNUMBER!= null'> 
           SEQNUMBER,
        </if>
        <if test='PROCESSINSTID!= null'> 
           PROCESSINSTID,
        </if>
        <if test='PROCESSDEFID!= null'> 
           PROCESSDEFID,
        </if>
        <if test='ROWINDEX!= null'> 
           ROWINDEX
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='BATCHPLANID!= null'> 
           #{BATCHPLANID,jdbcType=char}，
        </if>
        <if test='PLANNAME!= null'> 
           #{PLANNAME,jdbcType=varchar}，
        </if>
        <if test='STARTUSER!= null'> 
           #{STARTUSER,jdbcType=varchar}，
        </if>
        <if test='STARTUSERDEPTID!= null'> 
           #{STARTUSERDEPTID,jdbcType=varchar}，
        </if>
        <if test='STARTUSERROLEID!= null'> 
           #{STARTUSERROLEID,jdbcType=varchar}，
        </if>
        <if test='CREATETIME!= null'> 
           #{CREATETIME,jdbcType=datetime}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='PLANSTATUS!= null'> 
           #{PLANSTATUS,jdbcType=smallint}，
        </if>
        <if test='ENDSTYLE!= null'> 
           #{ENDSTYLE,jdbcType=smallint}，
        </if>
        <if test='STARTTIME!= null'> 
           #{STARTTIME,jdbcType=datetime}，
        </if>
        <if test='ENDTIME!= null'> 
           #{ENDTIME,jdbcType=datetime}，
        </if>
        <if test='PLANID!= null'> 
           #{PLANID,jdbcType=char}，
        </if>
        <if test='SEQNUMBER!= null'> 
           #{SEQNUMBER,jdbcType=decimal}，
        </if>
        <if test='PROCESSINSTID!= null'> 
           #{PROCESSINSTID,jdbcType=char}，
        </if>
        <if test='PROCESSDEFID!= null'> 
           #{PROCESSDEFID,jdbcType=char}，
        </if>
        <if test='ROWINDEX!= null'> 
           #{ROWINDEX,jdbcType=smallint}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_pat_plan_dto):Unit
                


@Delete("DELETE FROM app_act_pat_plan WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE app_act_pat_plan SET
        ID=#{ID,jdbcType=String},
        BATCHPLANID=#{BATCHPLANID,jdbcType=String},
        PLANNAME=#{PLANNAME,jdbcType=String},
        STARTUSER=#{STARTUSER,jdbcType=String},
        STARTUSERDEPTID=#{STARTUSERDEPTID,jdbcType=String},
        STARTUSERROLEID=#{STARTUSERROLEID,jdbcType=String},
        CREATETIME=#{CREATETIME,jdbcType=Timestamp},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        PLANSTATUS=#{PLANSTATUS,jdbcType=Integer},
        ENDSTYLE=#{ENDSTYLE,jdbcType=Integer},
        STARTTIME=#{STARTTIME,jdbcType=Timestamp},
        ENDTIME=#{ENDTIME,jdbcType=Timestamp},
        PLANID=#{PLANID,jdbcType=String},
        SEQNUMBER=#{SEQNUMBER,jdbcType=BigDecimal},
        PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},
        PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},
        ROWINDEX=#{ROWINDEX,jdbcType=Integer}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:app_act_pat_plan_dto)
        

@Update("""<script>
            UPDATE app_act_pat_plan SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="BATCHPLANID != null">  BATCHPLANID=#{BATCHPLANID,jdbcType=String},</if>
        <if test="PLANNAME != null">  PLANNAME=#{PLANNAME,jdbcType=String},</if>
        <if test="STARTUSER != null">  STARTUSER=#{STARTUSER,jdbcType=String},</if>
        <if test="STARTUSERDEPTID != null">  STARTUSERDEPTID=#{STARTUSERDEPTID,jdbcType=String},</if>
        <if test="STARTUSERROLEID != null">  STARTUSERROLEID=#{STARTUSERROLEID,jdbcType=String},</if>
        <if test="CREATETIME != null">  CREATETIME=#{CREATETIME,jdbcType=Timestamp},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="PLANSTATUS != null">  PLANSTATUS=#{PLANSTATUS,jdbcType=Integer},</if>
        <if test="ENDSTYLE != null">  ENDSTYLE=#{ENDSTYLE,jdbcType=Integer},</if>
        <if test="STARTTIME != null">  STARTTIME=#{STARTTIME,jdbcType=Timestamp},</if>
        <if test="ENDTIME != null">  ENDTIME=#{ENDTIME,jdbcType=Timestamp},</if>
        <if test="PLANID != null">  PLANID=#{PLANID,jdbcType=String},</if>
        <if test="SEQNUMBER != null">  SEQNUMBER=#{SEQNUMBER,jdbcType=BigDecimal},</if>
        <if test="PROCESSINSTID != null">  PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},</if>
        <if test="PROCESSDEFID != null">  PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},</if>
        <if test="ROWINDEX != null">  ROWINDEX=#{ROWINDEX,jdbcType=Integer}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:app_act_pat_plan_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_pat_plan{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "PLANNAME", column = "PLANNAME"),
   Result(property = "STARTUSER", column = "STARTUSER"),
   Result(property = "STARTUSERDEPTID", column = "STARTUSERDEPTID"),
   Result(property = "STARTUSERROLEID", column = "STARTUSERROLEID"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "PLANSTATUS", column = "PLANSTATUS"),
   Result(property = "ENDSTYLE", column = "ENDSTYLE"),
   Result(property = "STARTTIME", column = "STARTTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "PLANID", column = "PLANID"),
   Result(property = "SEQNUMBER", column = "SEQNUMBER"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ROWINDEX", column = "ROWINDEX")
)
@Select("""<script>
   SELECT * FROM app_act_pat_plan
</script>""")
fun GetListAll():ArrayList<app_act_pat_plan_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "PLANNAME", column = "PLANNAME"),
   Result(property = "STARTUSER", column = "STARTUSER"),
   Result(property = "STARTUSERDEPTID", column = "STARTUSERDEPTID"),
   Result(property = "STARTUSERROLEID", column = "STARTUSERROLEID"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "PLANSTATUS", column = "PLANSTATUS"),
   Result(property = "ENDSTYLE", column = "ENDSTYLE"),
   Result(property = "STARTTIME", column = "STARTTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "PLANID", column = "PLANID"),
   Result(property = "SEQNUMBER", column = "SEQNUMBER"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ROWINDEX", column = "ROWINDEX")
)
@Select("""<script>
   SELECT * FROM app_act_pat_plan
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="BATCHPLANID!=null">
      BATCHPLANID=#{BATCHPLANID}
   </if> 
   <if test="PLANNAME!=null">
      PLANNAME=#{PLANNAME}
   </if> 
   <if test="STARTUSER!=null">
      STARTUSER=#{STARTUSER}
   </if> 
   <if test="STARTUSERDEPTID!=null">
      STARTUSERDEPTID=#{STARTUSERDEPTID}
   </if> 
   <if test="STARTUSERROLEID!=null">
      STARTUSERROLEID=#{STARTUSERROLEID}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="PLANSTATUS!=null">
      PLANSTATUS=#{PLANSTATUS}
   </if> 
   <if test="ENDSTYLE!=null">
      ENDSTYLE=#{ENDSTYLE}
   </if> 
   <if test="STARTTIME!=null">
      STARTTIME=#{STARTTIME}
   </if> 
   <if test="ENDTIME!=null">
      ENDTIME=#{ENDTIME}
   </if> 
   <if test="PLANID!=null">
      PLANID=#{PLANID}
   </if> 
   <if test="SEQNUMBER!=null">
      SEQNUMBER=#{SEQNUMBER}
   </if> 
   <if test="PROCESSINSTID!=null">
      PROCESSINSTID=#{PROCESSINSTID}
   </if> 
   <if test="PROCESSDEFID!=null">
      PROCESSDEFID=#{PROCESSDEFID}
   </if> 
   <if test="ROWINDEX!=null">
      ROWINDEX=#{ROWINDEX}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_pat_plan_dto):ArrayList<app_act_pat_plan_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "BATCHPLANID", column = "BATCHPLANID"),
   Result(property = "PLANNAME", column = "PLANNAME"),
   Result(property = "STARTUSER", column = "STARTUSER"),
   Result(property = "STARTUSERDEPTID", column = "STARTUSERDEPTID"),
   Result(property = "STARTUSERROLEID", column = "STARTUSERROLEID"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "PLANSTATUS", column = "PLANSTATUS"),
   Result(property = "ENDSTYLE", column = "ENDSTYLE"),
   Result(property = "STARTTIME", column = "STARTTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "PLANID", column = "PLANID"),
   Result(property = "SEQNUMBER", column = "SEQNUMBER"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ROWINDEX", column = "ROWINDEX")
)
@Select("""<script>
   SELECT * FROM app_act_pat_plan
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_pat_plan_dto):app_act_pat_plan_dto?
                


@Insert("""<script>
    insert into app_act_pat_plan
    (ID,BATCHPLANID,PLANNAME,STARTUSER,STARTUSERDEPTID,STARTUSERROLEID,CREATETIME,CREATEUSER,PLANSTATUS,ENDSTYLE,STARTTIME,ENDTIME,PLANID,SEQNUMBER,PROCESSINSTID,PROCESSDEFID,ROWINDEX)
    values
    (#{ID},#{BATCHPLANID},#{PLANNAME},#{STARTUSER},#{STARTUSERDEPTID},#{STARTUSERROLEID},#{CREATETIME},#{CREATEUSER},#{PLANSTATUS},#{ENDSTYLE},#{STARTTIME},#{ENDTIME},#{PLANID},#{SEQNUMBER},#{PROCESSINSTID},#{PROCESSDEFID},#{ROWINDEX})
</script>""")
fun Insert(model:app_act_pat_plan_dto):Unit
                


@Insert("""<script>
    insert into app_act_pat_plan
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='BATCHPLANID!= null'> 
           BATCHPLANID,
        </if>
        <if test='PLANNAME!= null'> 
           PLANNAME,
        </if>
        <if test='STARTUSER!= null'> 
           STARTUSER,
        </if>
        <if test='STARTUSERDEPTID!= null'> 
           STARTUSERDEPTID,
        </if>
        <if test='STARTUSERROLEID!= null'> 
           STARTUSERROLEID,
        </if>
        <if test='CREATETIME!= null'> 
           CREATETIME,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='PLANSTATUS!= null'> 
           PLANSTATUS,
        </if>
        <if test='ENDSTYLE!= null'> 
           ENDSTYLE,
        </if>
        <if test='STARTTIME!= null'> 
           STARTTIME,
        </if>
        <if test='ENDTIME!= null'> 
           ENDTIME,
        </if>
        <if test='PLANID!= null'> 
           PLANID,
        </if>
        <if test='SEQNUMBER!= null'> 
           SEQNUMBER,
        </if>
        <if test='PROCESSINSTID!= null'> 
           PROCESSINSTID,
        </if>
        <if test='PROCESSDEFID!= null'> 
           PROCESSDEFID,
        </if>
        <if test='ROWINDEX!= null'> 
           ROWINDEX
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='BATCHPLANID!= null'> 
           #{BATCHPLANID,jdbcType=char}，
        </if>
        <if test='PLANNAME!= null'> 
           #{PLANNAME,jdbcType=varchar}，
        </if>
        <if test='STARTUSER!= null'> 
           #{STARTUSER,jdbcType=varchar}，
        </if>
        <if test='STARTUSERDEPTID!= null'> 
           #{STARTUSERDEPTID,jdbcType=varchar}，
        </if>
        <if test='STARTUSERROLEID!= null'> 
           #{STARTUSERROLEID,jdbcType=varchar}，
        </if>
        <if test='CREATETIME!= null'> 
           #{CREATETIME,jdbcType=datetime}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='PLANSTATUS!= null'> 
           #{PLANSTATUS,jdbcType=smallint}，
        </if>
        <if test='ENDSTYLE!= null'> 
           #{ENDSTYLE,jdbcType=smallint}，
        </if>
        <if test='STARTTIME!= null'> 
           #{STARTTIME,jdbcType=datetime}，
        </if>
        <if test='ENDTIME!= null'> 
           #{ENDTIME,jdbcType=datetime}，
        </if>
        <if test='PLANID!= null'> 
           #{PLANID,jdbcType=char}，
        </if>
        <if test='SEQNUMBER!= null'> 
           #{SEQNUMBER,jdbcType=decimal}，
        </if>
        <if test='PROCESSINSTID!= null'> 
           #{PROCESSINSTID,jdbcType=char}，
        </if>
        <if test='PROCESSDEFID!= null'> 
           #{PROCESSDEFID,jdbcType=char}，
        </if>
        <if test='ROWINDEX!= null'> 
           #{ROWINDEX,jdbcType=smallint}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_pat_plan_dto):Unit
                


@Delete("DELETE FROM app_act_pat_plan WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE app_act_pat_plan SET
        ID=#{ID,jdbcType=String},
        BATCHPLANID=#{BATCHPLANID,jdbcType=String},
        PLANNAME=#{PLANNAME,jdbcType=String},
        STARTUSER=#{STARTUSER,jdbcType=String},
        STARTUSERDEPTID=#{STARTUSERDEPTID,jdbcType=String},
        STARTUSERROLEID=#{STARTUSERROLEID,jdbcType=String},
        CREATETIME=#{CREATETIME,jdbcType=Timestamp},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        PLANSTATUS=#{PLANSTATUS,jdbcType=Integer},
        ENDSTYLE=#{ENDSTYLE,jdbcType=Integer},
        STARTTIME=#{STARTTIME,jdbcType=Timestamp},
        ENDTIME=#{ENDTIME,jdbcType=Timestamp},
        PLANID=#{PLANID,jdbcType=String},
        SEQNUMBER=#{SEQNUMBER,jdbcType=BigDecimal},
        PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},
        PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},
        ROWINDEX=#{ROWINDEX,jdbcType=Integer}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:app_act_pat_plan_dto)
        

@Update("""<script>
            UPDATE app_act_pat_plan SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="BATCHPLANID != null">  BATCHPLANID=#{BATCHPLANID,jdbcType=String},</if>
        <if test="PLANNAME != null">  PLANNAME=#{PLANNAME,jdbcType=String},</if>
        <if test="STARTUSER != null">  STARTUSER=#{STARTUSER,jdbcType=String},</if>
        <if test="STARTUSERDEPTID != null">  STARTUSERDEPTID=#{STARTUSERDEPTID,jdbcType=String},</if>
        <if test="STARTUSERROLEID != null">  STARTUSERROLEID=#{STARTUSERROLEID,jdbcType=String},</if>
        <if test="CREATETIME != null">  CREATETIME=#{CREATETIME,jdbcType=Timestamp},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="PLANSTATUS != null">  PLANSTATUS=#{PLANSTATUS,jdbcType=Integer},</if>
        <if test="ENDSTYLE != null">  ENDSTYLE=#{ENDSTYLE,jdbcType=Integer},</if>
        <if test="STARTTIME != null">  STARTTIME=#{STARTTIME,jdbcType=Timestamp},</if>
        <if test="ENDTIME != null">  ENDTIME=#{ENDTIME,jdbcType=Timestamp},</if>
        <if test="PLANID != null">  PLANID=#{PLANID,jdbcType=String},</if>
        <if test="SEQNUMBER != null">  SEQNUMBER=#{SEQNUMBER,jdbcType=BigDecimal},</if>
        <if test="PROCESSINSTID != null">  PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},</if>
        <if test="PROCESSDEFID != null">  PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},</if>
        <if test="ROWINDEX != null">  ROWINDEX=#{ROWINDEX,jdbcType=Integer}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:app_act_pat_plan_dto)
            

}

        
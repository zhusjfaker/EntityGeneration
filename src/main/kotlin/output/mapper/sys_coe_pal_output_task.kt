

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_output_task{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TEAMID", column = "TEAMID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "PROFILEID", column = "PROFILEID"),
   Result(property = "TASKNAME", column = "TASKNAME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "BEGINTIME", column = "BEGINTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "TASKSTATE", column = "TASKSTATE"),
   Result(property = "THREADID", column = "THREADID"),
   Result(property = "LANG", column = "LANG")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_output_task
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_output_task_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TEAMID", column = "TEAMID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "PROFILEID", column = "PROFILEID"),
   Result(property = "TASKNAME", column = "TASKNAME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "BEGINTIME", column = "BEGINTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "TASKSTATE", column = "TASKSTATE"),
   Result(property = "THREADID", column = "THREADID"),
   Result(property = "LANG", column = "LANG")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_output_task
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="TEAMID!=null">
      TEAMID=#{TEAMID}
   </if> 
   <if test="WSID!=null">
      WSID=#{WSID}
   </if> 
   <if test="PROFILEID!=null">
      PROFILEID=#{PROFILEID}
   </if> 
   <if test="TASKNAME!=null">
      TASKNAME=#{TASKNAME}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   <if test="BEGINTIME!=null">
      BEGINTIME=#{BEGINTIME}
   </if> 
   <if test="ENDTIME!=null">
      ENDTIME=#{ENDTIME}
   </if> 
   <if test="TASKSTATE!=null">
      TASKSTATE=#{TASKSTATE}
   </if> 
   <if test="THREADID!=null">
      THREADID=#{THREADID}
   </if> 
   <if test="LANG!=null">
      LANG=#{LANG}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_output_task_dto):ArrayList<sys_coe_pal_output_task_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TEAMID", column = "TEAMID"),
   Result(property = "WSID", column = "WSID"),
   Result(property = "PROFILEID", column = "PROFILEID"),
   Result(property = "TASKNAME", column = "TASKNAME"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "BEGINTIME", column = "BEGINTIME"),
   Result(property = "ENDTIME", column = "ENDTIME"),
   Result(property = "TASKSTATE", column = "TASKSTATE"),
   Result(property = "THREADID", column = "THREADID"),
   Result(property = "LANG", column = "LANG")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_output_task
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_output_task_dto):sys_coe_pal_output_task_dto?
                


@Insert("""<script>
    insert into sys_coe_pal_output_task
    (ID,TEAMID,WSID,PROFILEID,TASKNAME,USERID,CREATETIME,BEGINTIME,ENDTIME,TASKSTATE,THREADID,LANG)
    values
    (#{ID},#{TEAMID},#{WSID},#{PROFILEID},#{TASKNAME},#{USERID},#{CREATETIME},#{BEGINTIME},#{ENDTIME},#{TASKSTATE},#{THREADID},#{LANG})
</script>""")
fun Insert(model:sys_coe_pal_output_task_dto):Unit
                


@Insert("""<script>
    insert into sys_coe_pal_output_task
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='TEAMID!= null'> 
           TEAMID,
        </if>
        <if test='WSID!= null'> 
           WSID,
        </if>
        <if test='PROFILEID!= null'> 
           PROFILEID,
        </if>
        <if test='TASKNAME!= null'> 
           TASKNAME,
        </if>
        <if test='USERID!= null'> 
           USERID,
        </if>
        <if test='CREATETIME!= null'> 
           CREATETIME,
        </if>
        <if test='BEGINTIME!= null'> 
           BEGINTIME,
        </if>
        <if test='ENDTIME!= null'> 
           ENDTIME,
        </if>
        <if test='TASKSTATE!= null'> 
           TASKSTATE,
        </if>
        <if test='THREADID!= null'> 
           THREADID,
        </if>
        <if test='LANG!= null'> 
           LANG
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='TEAMID!= null'> 
           #{TEAMID,jdbcType=char}，
        </if>
        <if test='WSID!= null'> 
           #{WSID,jdbcType=char}，
        </if>
        <if test='PROFILEID!= null'> 
           #{PROFILEID,jdbcType=varchar}，
        </if>
        <if test='TASKNAME!= null'> 
           #{TASKNAME,jdbcType=varchar}，
        </if>
        <if test='USERID!= null'> 
           #{USERID,jdbcType=varchar}，
        </if>
        <if test='CREATETIME!= null'> 
           #{CREATETIME,jdbcType=datetime}，
        </if>
        <if test='BEGINTIME!= null'> 
           #{BEGINTIME,jdbcType=datetime}，
        </if>
        <if test='ENDTIME!= null'> 
           #{ENDTIME,jdbcType=datetime}，
        </if>
        <if test='TASKSTATE!= null'> 
           #{TASKSTATE,jdbcType=smallint}，
        </if>
        <if test='THREADID!= null'> 
           #{THREADID,jdbcType=varchar}，
        </if>
        <if test='LANG!= null'> 
           #{LANG,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_coe_pal_output_task_dto):Unit
                


@Delete("DELETE FROM sys_coe_pal_output_task WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_coe_pal_output_task SET
        ID=#{ID,jdbcType=String},
        TEAMID=#{TEAMID,jdbcType=String},
        WSID=#{WSID,jdbcType=String},
        PROFILEID=#{PROFILEID,jdbcType=String},
        TASKNAME=#{TASKNAME,jdbcType=String},
        USERID=#{USERID,jdbcType=String},
        CREATETIME=#{CREATETIME,jdbcType=Timestamp},
        BEGINTIME=#{BEGINTIME,jdbcType=Timestamp},
        ENDTIME=#{ENDTIME,jdbcType=Timestamp},
        TASKSTATE=#{TASKSTATE,jdbcType=Integer},
        THREADID=#{THREADID,jdbcType=String},
        LANG=#{LANG,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_coe_pal_output_task_dto)
        

@Update("""<script>
            UPDATE sys_coe_pal_output_task SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="TEAMID != null">  TEAMID=#{TEAMID,jdbcType=String},</if>
        <if test="WSID != null">  WSID=#{WSID,jdbcType=String},</if>
        <if test="PROFILEID != null">  PROFILEID=#{PROFILEID,jdbcType=String},</if>
        <if test="TASKNAME != null">  TASKNAME=#{TASKNAME,jdbcType=String},</if>
        <if test="USERID != null">  USERID=#{USERID,jdbcType=String},</if>
        <if test="CREATETIME != null">  CREATETIME=#{CREATETIME,jdbcType=Timestamp},</if>
        <if test="BEGINTIME != null">  BEGINTIME=#{BEGINTIME,jdbcType=Timestamp},</if>
        <if test="ENDTIME != null">  ENDTIME=#{ENDTIME,jdbcType=Timestamp},</if>
        <if test="TASKSTATE != null">  TASKSTATE=#{TASKSTATE,jdbcType=Integer},</if>
        <if test="THREADID != null">  THREADID=#{THREADID,jdbcType=String},</if>
        <if test="LANG != null">  LANG=#{LANG,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_coe_pal_output_task_dto)
            

}

        
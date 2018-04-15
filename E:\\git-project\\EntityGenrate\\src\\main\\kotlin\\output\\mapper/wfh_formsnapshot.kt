

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfh_formsnapshot{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ACTIVITYDEFID", column = "ACTIVITYDEFID"),
   Result(property = "AUTHORUID", column = "AUTHORUID"),
   Result(property = "AUTHORNAME", column = "AUTHORNAME"),
   Result(property = "RECORDTIME", column = "RECORDTIME"),
   Result(property = "FORMID", column = "FORMID"),
   Result(property = "VNAME", column = "VNAME")
)
@Select("""<script>
   SELECT * FROM wfh_formsnapshot
</script>""")
fun GetListAll():ArrayList<wfh_formsnapshot_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ACTIVITYDEFID", column = "ACTIVITYDEFID"),
   Result(property = "AUTHORUID", column = "AUTHORUID"),
   Result(property = "AUTHORNAME", column = "AUTHORNAME"),
   Result(property = "RECORDTIME", column = "RECORDTIME"),
   Result(property = "FORMID", column = "FORMID"),
   Result(property = "VNAME", column = "VNAME")
)
@Select("""<script>
   SELECT * FROM wfh_formsnapshot
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="PROCESSINSTID!=null">
      PROCESSINSTID=#{PROCESSINSTID}
   </if> 
   <if test="TASKINSTID!=null">
      TASKINSTID=#{TASKINSTID}
   </if> 
   <if test="PROCESSDEFID!=null">
      PROCESSDEFID=#{PROCESSDEFID}
   </if> 
   <if test="ACTIVITYDEFID!=null">
      ACTIVITYDEFID=#{ACTIVITYDEFID}
   </if> 
   <if test="AUTHORUID!=null">
      AUTHORUID=#{AUTHORUID}
   </if> 
   <if test="AUTHORNAME!=null">
      AUTHORNAME=#{AUTHORNAME}
   </if> 
   <if test="RECORDTIME!=null">
      RECORDTIME=#{RECORDTIME}
   </if> 
   <if test="FORMID!=null">
      FORMID=#{FORMID}
   </if> 
   <if test="VNAME!=null">
      VNAME=#{VNAME}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:wfh_formsnapshot_dto):ArrayList<wfh_formsnapshot_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ACTIVITYDEFID", column = "ACTIVITYDEFID"),
   Result(property = "AUTHORUID", column = "AUTHORUID"),
   Result(property = "AUTHORNAME", column = "AUTHORNAME"),
   Result(property = "RECORDTIME", column = "RECORDTIME"),
   Result(property = "FORMID", column = "FORMID"),
   Result(property = "VNAME", column = "VNAME")
)
@Select("""<script>
   SELECT * FROM wfh_formsnapshot
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:wfh_formsnapshot_dto):wfh_formsnapshot_dto?
                


@Insert("""<script>
    insert into wfh_formsnapshot
    (ID,PROCESSINSTID,TASKINSTID,PROCESSDEFID,ACTIVITYDEFID,AUTHORUID,AUTHORNAME,RECORDTIME,FORMID,VNAME)
    values
    (#{ID},#{PROCESSINSTID},#{TASKINSTID},#{PROCESSDEFID},#{ACTIVITYDEFID},#{AUTHORUID},#{AUTHORNAME},#{RECORDTIME},#{FORMID},#{VNAME})
</script>""")
fun Insert(model:wfh_formsnapshot_dto):Unit
                


@Insert("""<script>
    insert into wfh_formsnapshot
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='PROCESSINSTID!= null'> 
           PROCESSINSTID,
        </if>
        <if test='TASKINSTID!= null'> 
           TASKINSTID,
        </if>
        <if test='PROCESSDEFID!= null'> 
           PROCESSDEFID,
        </if>
        <if test='ACTIVITYDEFID!= null'> 
           ACTIVITYDEFID,
        </if>
        <if test='AUTHORUID!= null'> 
           AUTHORUID,
        </if>
        <if test='AUTHORNAME!= null'> 
           AUTHORNAME,
        </if>
        <if test='RECORDTIME!= null'> 
           RECORDTIME,
        </if>
        <if test='FORMID!= null'> 
           FORMID,
        </if>
        <if test='VNAME!= null'> 
           VNAME
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='PROCESSINSTID!= null'> 
           #{PROCESSINSTID,jdbcType=char}，
        </if>
        <if test='TASKINSTID!= null'> 
           #{TASKINSTID,jdbcType=char}，
        </if>
        <if test='PROCESSDEFID!= null'> 
           #{PROCESSDEFID,jdbcType=char}，
        </if>
        <if test='ACTIVITYDEFID!= null'> 
           #{ACTIVITYDEFID,jdbcType=char}，
        </if>
        <if test='AUTHORUID!= null'> 
           #{AUTHORUID,jdbcType=varchar}，
        </if>
        <if test='AUTHORNAME!= null'> 
           #{AUTHORNAME,jdbcType=varchar}，
        </if>
        <if test='RECORDTIME!= null'> 
           #{RECORDTIME,jdbcType=datetime}，
        </if>
        <if test='FORMID!= null'> 
           #{FORMID,jdbcType=char}，
        </if>
        <if test='VNAME!= null'> 
           #{VNAME,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:wfh_formsnapshot_dto):Unit
                


@Delete("DELETE FROM wfh_formsnapshot WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE wfh_formsnapshot SET
        ID=#{ID,jdbcType=String},
        PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},
        TASKINSTID=#{TASKINSTID,jdbcType=String},
        PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},
        ACTIVITYDEFID=#{ACTIVITYDEFID,jdbcType=String},
        AUTHORUID=#{AUTHORUID,jdbcType=String},
        AUTHORNAME=#{AUTHORNAME,jdbcType=String},
        RECORDTIME=#{RECORDTIME,jdbcType=Timestamp},
        FORMID=#{FORMID,jdbcType=String},
        VNAME=#{VNAME,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:wfh_formsnapshot_dto)
        

@Update("""<script>
            UPDATE wfh_formsnapshot SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="PROCESSINSTID != null">  PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},</if>
        <if test="TASKINSTID != null">  TASKINSTID=#{TASKINSTID,jdbcType=String},</if>
        <if test="PROCESSDEFID != null">  PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},</if>
        <if test="ACTIVITYDEFID != null">  ACTIVITYDEFID=#{ACTIVITYDEFID,jdbcType=String},</if>
        <if test="AUTHORUID != null">  AUTHORUID=#{AUTHORUID,jdbcType=String},</if>
        <if test="AUTHORNAME != null">  AUTHORNAME=#{AUTHORNAME,jdbcType=String},</if>
        <if test="RECORDTIME != null">  RECORDTIME=#{RECORDTIME,jdbcType=Timestamp},</if>
        <if test="FORMID != null">  FORMID=#{FORMID,jdbcType=String},</if>
        <if test="VNAME != null">  VNAME=#{VNAME,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:wfh_formsnapshot_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfh_formsnapshot{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ACTIVITYDEFID", column = "ACTIVITYDEFID"),
   Result(property = "AUTHORUID", column = "AUTHORUID"),
   Result(property = "AUTHORNAME", column = "AUTHORNAME"),
   Result(property = "RECORDTIME", column = "RECORDTIME"),
   Result(property = "FORMID", column = "FORMID"),
   Result(property = "VNAME", column = "VNAME")
)
@Select("""<script>
   SELECT * FROM wfh_formsnapshot
</script>""")
fun GetListAll():ArrayList<wfh_formsnapshot_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ACTIVITYDEFID", column = "ACTIVITYDEFID"),
   Result(property = "AUTHORUID", column = "AUTHORUID"),
   Result(property = "AUTHORNAME", column = "AUTHORNAME"),
   Result(property = "RECORDTIME", column = "RECORDTIME"),
   Result(property = "FORMID", column = "FORMID"),
   Result(property = "VNAME", column = "VNAME")
)
@Select("""<script>
   SELECT * FROM wfh_formsnapshot
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="PROCESSINSTID!=null">
      PROCESSINSTID=#{PROCESSINSTID}
   </if> 
   <if test="TASKINSTID!=null">
      TASKINSTID=#{TASKINSTID}
   </if> 
   <if test="PROCESSDEFID!=null">
      PROCESSDEFID=#{PROCESSDEFID}
   </if> 
   <if test="ACTIVITYDEFID!=null">
      ACTIVITYDEFID=#{ACTIVITYDEFID}
   </if> 
   <if test="AUTHORUID!=null">
      AUTHORUID=#{AUTHORUID}
   </if> 
   <if test="AUTHORNAME!=null">
      AUTHORNAME=#{AUTHORNAME}
   </if> 
   <if test="RECORDTIME!=null">
      RECORDTIME=#{RECORDTIME}
   </if> 
   <if test="FORMID!=null">
      FORMID=#{FORMID}
   </if> 
   <if test="VNAME!=null">
      VNAME=#{VNAME}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:wfh_formsnapshot_dto):ArrayList<wfh_formsnapshot_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ACTIVITYDEFID", column = "ACTIVITYDEFID"),
   Result(property = "AUTHORUID", column = "AUTHORUID"),
   Result(property = "AUTHORNAME", column = "AUTHORNAME"),
   Result(property = "RECORDTIME", column = "RECORDTIME"),
   Result(property = "FORMID", column = "FORMID"),
   Result(property = "VNAME", column = "VNAME")
)
@Select("""<script>
   SELECT * FROM wfh_formsnapshot
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:wfh_formsnapshot_dto):wfh_formsnapshot_dto?
                


@Insert("""<script>
    insert into wfh_formsnapshot
    (ID,PROCESSINSTID,TASKINSTID,PROCESSDEFID,ACTIVITYDEFID,AUTHORUID,AUTHORNAME,RECORDTIME,FORMID,VNAME)
    values
    (#{ID},#{PROCESSINSTID},#{TASKINSTID},#{PROCESSDEFID},#{ACTIVITYDEFID},#{AUTHORUID},#{AUTHORNAME},#{RECORDTIME},#{FORMID},#{VNAME})
</script>""")
fun Insert(model:wfh_formsnapshot_dto):Unit
                


@Insert("""<script>
    insert into wfh_formsnapshot
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='PROCESSINSTID!= null'> 
           PROCESSINSTID,
        </if>
        <if test='TASKINSTID!= null'> 
           TASKINSTID,
        </if>
        <if test='PROCESSDEFID!= null'> 
           PROCESSDEFID,
        </if>
        <if test='ACTIVITYDEFID!= null'> 
           ACTIVITYDEFID,
        </if>
        <if test='AUTHORUID!= null'> 
           AUTHORUID,
        </if>
        <if test='AUTHORNAME!= null'> 
           AUTHORNAME,
        </if>
        <if test='RECORDTIME!= null'> 
           RECORDTIME,
        </if>
        <if test='FORMID!= null'> 
           FORMID,
        </if>
        <if test='VNAME!= null'> 
           VNAME
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='PROCESSINSTID!= null'> 
           #{PROCESSINSTID,jdbcType=char}，
        </if>
        <if test='TASKINSTID!= null'> 
           #{TASKINSTID,jdbcType=char}，
        </if>
        <if test='PROCESSDEFID!= null'> 
           #{PROCESSDEFID,jdbcType=char}，
        </if>
        <if test='ACTIVITYDEFID!= null'> 
           #{ACTIVITYDEFID,jdbcType=char}，
        </if>
        <if test='AUTHORUID!= null'> 
           #{AUTHORUID,jdbcType=varchar}，
        </if>
        <if test='AUTHORNAME!= null'> 
           #{AUTHORNAME,jdbcType=varchar}，
        </if>
        <if test='RECORDTIME!= null'> 
           #{RECORDTIME,jdbcType=datetime}，
        </if>
        <if test='FORMID!= null'> 
           #{FORMID,jdbcType=char}，
        </if>
        <if test='VNAME!= null'> 
           #{VNAME,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:wfh_formsnapshot_dto):Unit
                


@Delete("DELETE FROM wfh_formsnapshot WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE wfh_formsnapshot SET
        ID=#{ID,jdbcType=String},
        PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},
        TASKINSTID=#{TASKINSTID,jdbcType=String},
        PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},
        ACTIVITYDEFID=#{ACTIVITYDEFID,jdbcType=String},
        AUTHORUID=#{AUTHORUID,jdbcType=String},
        AUTHORNAME=#{AUTHORNAME,jdbcType=String},
        RECORDTIME=#{RECORDTIME,jdbcType=Timestamp},
        FORMID=#{FORMID,jdbcType=String},
        VNAME=#{VNAME,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:wfh_formsnapshot_dto)
        

@Update("""<script>
            UPDATE wfh_formsnapshot SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="PROCESSINSTID != null">  PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},</if>
        <if test="TASKINSTID != null">  TASKINSTID=#{TASKINSTID,jdbcType=String},</if>
        <if test="PROCESSDEFID != null">  PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},</if>
        <if test="ACTIVITYDEFID != null">  ACTIVITYDEFID=#{ACTIVITYDEFID,jdbcType=String},</if>
        <if test="AUTHORUID != null">  AUTHORUID=#{AUTHORUID,jdbcType=String},</if>
        <if test="AUTHORNAME != null">  AUTHORNAME=#{AUTHORNAME,jdbcType=String},</if>
        <if test="RECORDTIME != null">  RECORDTIME=#{RECORDTIME,jdbcType=Timestamp},</if>
        <if test="FORMID != null">  FORMID=#{FORMID,jdbcType=String},</if>
        <if test="VNAME != null">  VNAME=#{VNAME,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:wfh_formsnapshot_dto)
            

}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfc_taskmid{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "PROCESSDEFVERID", column = "PROCESSDEFVERID"),
   Result(property = "ACTIVITYDEFID", column = "ACTIVITYDEFID"),
   Result(property = "OWNER", column = "OWNER"),
   Result(property = "OWNERDEPTID", column = "OWNERDEPTID"),
   Result(property = "TARGET", column = "TARGET"),
   Result(property = "TARGETDEPTID", column = "TARGETDEPTID"),
   Result(property = "TARGETCOMPANYID", column = "TARGETCOMPANYID"),
   Result(property = "TARGETROLEID", column = "TARGETROLEID"),
   Result(property = "DISPATCHSTATE", column = "DISPATCHSTATE"),
   Result(property = "PRIORITY", column = "PRIORITY"),
   Result(property = "DUETIME", column = "DUETIME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM wfc_taskmid
</script>""")
fun GetListAll():ArrayList<wfc_taskmid_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "PROCESSDEFVERID", column = "PROCESSDEFVERID"),
   Result(property = "ACTIVITYDEFID", column = "ACTIVITYDEFID"),
   Result(property = "OWNER", column = "OWNER"),
   Result(property = "OWNERDEPTID", column = "OWNERDEPTID"),
   Result(property = "TARGET", column = "TARGET"),
   Result(property = "TARGETDEPTID", column = "TARGETDEPTID"),
   Result(property = "TARGETCOMPANYID", column = "TARGETCOMPANYID"),
   Result(property = "TARGETROLEID", column = "TARGETROLEID"),
   Result(property = "DISPATCHSTATE", column = "DISPATCHSTATE"),
   Result(property = "PRIORITY", column = "PRIORITY"),
   Result(property = "DUETIME", column = "DUETIME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM wfc_taskmid
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
   <if test="PROCESSDEFVERID!=null">
      PROCESSDEFVERID=#{PROCESSDEFVERID}
   </if> 
   <if test="ACTIVITYDEFID!=null">
      ACTIVITYDEFID=#{ACTIVITYDEFID}
   </if> 
   <if test="OWNER!=null">
      OWNER=#{OWNER}
   </if> 
   <if test="OWNERDEPTID!=null">
      OWNERDEPTID=#{OWNERDEPTID}
   </if> 
   <if test="TARGET!=null">
      TARGET=#{TARGET}
   </if> 
   <if test="TARGETDEPTID!=null">
      TARGETDEPTID=#{TARGETDEPTID}
   </if> 
   <if test="TARGETCOMPANYID!=null">
      TARGETCOMPANYID=#{TARGETCOMPANYID}
   </if> 
   <if test="TARGETROLEID!=null">
      TARGETROLEID=#{TARGETROLEID}
   </if> 
   <if test="DISPATCHSTATE!=null">
      DISPATCHSTATE=#{DISPATCHSTATE}
   </if> 
   <if test="PRIORITY!=null">
      PRIORITY=#{PRIORITY}
   </if> 
   <if test="DUETIME!=null">
      DUETIME=#{DUETIME}
   </if> 
   <if test="ORDERINDEX!=null">
      ORDERINDEX=#{ORDERINDEX}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:wfc_taskmid_dto):ArrayList<wfc_taskmid_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "PROCESSDEFVERID", column = "PROCESSDEFVERID"),
   Result(property = "ACTIVITYDEFID", column = "ACTIVITYDEFID"),
   Result(property = "OWNER", column = "OWNER"),
   Result(property = "OWNERDEPTID", column = "OWNERDEPTID"),
   Result(property = "TARGET", column = "TARGET"),
   Result(property = "TARGETDEPTID", column = "TARGETDEPTID"),
   Result(property = "TARGETCOMPANYID", column = "TARGETCOMPANYID"),
   Result(property = "TARGETROLEID", column = "TARGETROLEID"),
   Result(property = "DISPATCHSTATE", column = "DISPATCHSTATE"),
   Result(property = "PRIORITY", column = "PRIORITY"),
   Result(property = "DUETIME", column = "DUETIME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM wfc_taskmid
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:wfc_taskmid_dto):wfc_taskmid_dto?
                


@Insert("""<script>
    insert into wfc_taskmid
    (ID,PROCESSINSTID,TASKINSTID,PROCESSDEFID,PROCESSDEFVERID,ACTIVITYDEFID,OWNER,OWNERDEPTID,TARGET,TARGETDEPTID,TARGETCOMPANYID,TARGETROLEID,DISPATCHSTATE,PRIORITY,DUETIME,ORDERINDEX)
    values
    (#{ID},#{PROCESSINSTID},#{TASKINSTID},#{PROCESSDEFID},#{PROCESSDEFVERID},#{ACTIVITYDEFID},#{OWNER},#{OWNERDEPTID},#{TARGET},#{TARGETDEPTID},#{TARGETCOMPANYID},#{TARGETROLEID},#{DISPATCHSTATE},#{PRIORITY},#{DUETIME},#{ORDERINDEX})
</script>""")
fun Insert(model:wfc_taskmid_dto):Unit
                


@Insert("""<script>
    insert into wfc_taskmid
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
        <if test='PROCESSDEFVERID!= null'> 
           PROCESSDEFVERID,
        </if>
        <if test='ACTIVITYDEFID!= null'> 
           ACTIVITYDEFID,
        </if>
        <if test='OWNER!= null'> 
           OWNER,
        </if>
        <if test='OWNERDEPTID!= null'> 
           OWNERDEPTID,
        </if>
        <if test='TARGET!= null'> 
           TARGET,
        </if>
        <if test='TARGETDEPTID!= null'> 
           TARGETDEPTID,
        </if>
        <if test='TARGETCOMPANYID!= null'> 
           TARGETCOMPANYID,
        </if>
        <if test='TARGETROLEID!= null'> 
           TARGETROLEID,
        </if>
        <if test='DISPATCHSTATE!= null'> 
           DISPATCHSTATE,
        </if>
        <if test='PRIORITY!= null'> 
           PRIORITY,
        </if>
        <if test='DUETIME!= null'> 
           DUETIME,
        </if>
        <if test='ORDERINDEX!= null'> 
           ORDERINDEX
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
        <if test='PROCESSDEFVERID!= null'> 
           #{PROCESSDEFVERID,jdbcType=char}，
        </if>
        <if test='ACTIVITYDEFID!= null'> 
           #{ACTIVITYDEFID,jdbcType=char}，
        </if>
        <if test='OWNER!= null'> 
           #{OWNER,jdbcType=varchar}，
        </if>
        <if test='OWNERDEPTID!= null'> 
           #{OWNERDEPTID,jdbcType=varchar}，
        </if>
        <if test='TARGET!= null'> 
           #{TARGET,jdbcType=varchar}，
        </if>
        <if test='TARGETDEPTID!= null'> 
           #{TARGETDEPTID,jdbcType=varchar}，
        </if>
        <if test='TARGETCOMPANYID!= null'> 
           #{TARGETCOMPANYID,jdbcType=varchar}，
        </if>
        <if test='TARGETROLEID!= null'> 
           #{TARGETROLEID,jdbcType=varchar}，
        </if>
        <if test='DISPATCHSTATE!= null'> 
           #{DISPATCHSTATE,jdbcType=smallint}，
        </if>
        <if test='PRIORITY!= null'> 
           #{PRIORITY,jdbcType=smallint}，
        </if>
        <if test='DUETIME!= null'> 
           #{DUETIME,jdbcType=datetime}，
        </if>
        <if test='ORDERINDEX!= null'> 
           #{ORDERINDEX,jdbcType=smallint}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:wfc_taskmid_dto):Unit
                


@Delete("DELETE FROM wfc_taskmid WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE wfc_taskmid SET
        ID=#{ID,jdbcType=String},
        PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},
        TASKINSTID=#{TASKINSTID,jdbcType=String},
        PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},
        PROCESSDEFVERID=#{PROCESSDEFVERID,jdbcType=String},
        ACTIVITYDEFID=#{ACTIVITYDEFID,jdbcType=String},
        OWNER=#{OWNER,jdbcType=String},
        OWNERDEPTID=#{OWNERDEPTID,jdbcType=String},
        TARGET=#{TARGET,jdbcType=String},
        TARGETDEPTID=#{TARGETDEPTID,jdbcType=String},
        TARGETCOMPANYID=#{TARGETCOMPANYID,jdbcType=String},
        TARGETROLEID=#{TARGETROLEID,jdbcType=String},
        DISPATCHSTATE=#{DISPATCHSTATE,jdbcType=Integer},
        PRIORITY=#{PRIORITY,jdbcType=Integer},
        DUETIME=#{DUETIME,jdbcType=Timestamp},
        ORDERINDEX=#{ORDERINDEX,jdbcType=Integer}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:wfc_taskmid_dto)
        

@Update("""<script>
            UPDATE wfc_taskmid SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="PROCESSINSTID != null">  PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},</if>
        <if test="TASKINSTID != null">  TASKINSTID=#{TASKINSTID,jdbcType=String},</if>
        <if test="PROCESSDEFID != null">  PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},</if>
        <if test="PROCESSDEFVERID != null">  PROCESSDEFVERID=#{PROCESSDEFVERID,jdbcType=String},</if>
        <if test="ACTIVITYDEFID != null">  ACTIVITYDEFID=#{ACTIVITYDEFID,jdbcType=String},</if>
        <if test="OWNER != null">  OWNER=#{OWNER,jdbcType=String},</if>
        <if test="OWNERDEPTID != null">  OWNERDEPTID=#{OWNERDEPTID,jdbcType=String},</if>
        <if test="TARGET != null">  TARGET=#{TARGET,jdbcType=String},</if>
        <if test="TARGETDEPTID != null">  TARGETDEPTID=#{TARGETDEPTID,jdbcType=String},</if>
        <if test="TARGETCOMPANYID != null">  TARGETCOMPANYID=#{TARGETCOMPANYID,jdbcType=String},</if>
        <if test="TARGETROLEID != null">  TARGETROLEID=#{TARGETROLEID,jdbcType=String},</if>
        <if test="DISPATCHSTATE != null">  DISPATCHSTATE=#{DISPATCHSTATE,jdbcType=Integer},</if>
        <if test="PRIORITY != null">  PRIORITY=#{PRIORITY,jdbcType=Integer},</if>
        <if test="DUETIME != null">  DUETIME=#{DUETIME,jdbcType=Timestamp},</if>
        <if test="ORDERINDEX != null">  ORDERINDEX=#{ORDERINDEX,jdbcType=Integer}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:wfc_taskmid_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfc_taskmid{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "PROCESSDEFVERID", column = "PROCESSDEFVERID"),
   Result(property = "ACTIVITYDEFID", column = "ACTIVITYDEFID"),
   Result(property = "OWNER", column = "OWNER"),
   Result(property = "OWNERDEPTID", column = "OWNERDEPTID"),
   Result(property = "TARGET", column = "TARGET"),
   Result(property = "TARGETDEPTID", column = "TARGETDEPTID"),
   Result(property = "TARGETCOMPANYID", column = "TARGETCOMPANYID"),
   Result(property = "TARGETROLEID", column = "TARGETROLEID"),
   Result(property = "DISPATCHSTATE", column = "DISPATCHSTATE"),
   Result(property = "PRIORITY", column = "PRIORITY"),
   Result(property = "DUETIME", column = "DUETIME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM wfc_taskmid
</script>""")
fun GetListAll():ArrayList<wfc_taskmid_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "PROCESSDEFVERID", column = "PROCESSDEFVERID"),
   Result(property = "ACTIVITYDEFID", column = "ACTIVITYDEFID"),
   Result(property = "OWNER", column = "OWNER"),
   Result(property = "OWNERDEPTID", column = "OWNERDEPTID"),
   Result(property = "TARGET", column = "TARGET"),
   Result(property = "TARGETDEPTID", column = "TARGETDEPTID"),
   Result(property = "TARGETCOMPANYID", column = "TARGETCOMPANYID"),
   Result(property = "TARGETROLEID", column = "TARGETROLEID"),
   Result(property = "DISPATCHSTATE", column = "DISPATCHSTATE"),
   Result(property = "PRIORITY", column = "PRIORITY"),
   Result(property = "DUETIME", column = "DUETIME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM wfc_taskmid
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
   <if test="PROCESSDEFVERID!=null">
      PROCESSDEFVERID=#{PROCESSDEFVERID}
   </if> 
   <if test="ACTIVITYDEFID!=null">
      ACTIVITYDEFID=#{ACTIVITYDEFID}
   </if> 
   <if test="OWNER!=null">
      OWNER=#{OWNER}
   </if> 
   <if test="OWNERDEPTID!=null">
      OWNERDEPTID=#{OWNERDEPTID}
   </if> 
   <if test="TARGET!=null">
      TARGET=#{TARGET}
   </if> 
   <if test="TARGETDEPTID!=null">
      TARGETDEPTID=#{TARGETDEPTID}
   </if> 
   <if test="TARGETCOMPANYID!=null">
      TARGETCOMPANYID=#{TARGETCOMPANYID}
   </if> 
   <if test="TARGETROLEID!=null">
      TARGETROLEID=#{TARGETROLEID}
   </if> 
   <if test="DISPATCHSTATE!=null">
      DISPATCHSTATE=#{DISPATCHSTATE}
   </if> 
   <if test="PRIORITY!=null">
      PRIORITY=#{PRIORITY}
   </if> 
   <if test="DUETIME!=null">
      DUETIME=#{DUETIME}
   </if> 
   <if test="ORDERINDEX!=null">
      ORDERINDEX=#{ORDERINDEX}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:wfc_taskmid_dto):ArrayList<wfc_taskmid_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "PROCESSDEFVERID", column = "PROCESSDEFVERID"),
   Result(property = "ACTIVITYDEFID", column = "ACTIVITYDEFID"),
   Result(property = "OWNER", column = "OWNER"),
   Result(property = "OWNERDEPTID", column = "OWNERDEPTID"),
   Result(property = "TARGET", column = "TARGET"),
   Result(property = "TARGETDEPTID", column = "TARGETDEPTID"),
   Result(property = "TARGETCOMPANYID", column = "TARGETCOMPANYID"),
   Result(property = "TARGETROLEID", column = "TARGETROLEID"),
   Result(property = "DISPATCHSTATE", column = "DISPATCHSTATE"),
   Result(property = "PRIORITY", column = "PRIORITY"),
   Result(property = "DUETIME", column = "DUETIME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM wfc_taskmid
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:wfc_taskmid_dto):wfc_taskmid_dto?
                


@Insert("""<script>
    insert into wfc_taskmid
    (ID,PROCESSINSTID,TASKINSTID,PROCESSDEFID,PROCESSDEFVERID,ACTIVITYDEFID,OWNER,OWNERDEPTID,TARGET,TARGETDEPTID,TARGETCOMPANYID,TARGETROLEID,DISPATCHSTATE,PRIORITY,DUETIME,ORDERINDEX)
    values
    (#{ID},#{PROCESSINSTID},#{TASKINSTID},#{PROCESSDEFID},#{PROCESSDEFVERID},#{ACTIVITYDEFID},#{OWNER},#{OWNERDEPTID},#{TARGET},#{TARGETDEPTID},#{TARGETCOMPANYID},#{TARGETROLEID},#{DISPATCHSTATE},#{PRIORITY},#{DUETIME},#{ORDERINDEX})
</script>""")
fun Insert(model:wfc_taskmid_dto):Unit
                


@Insert("""<script>
    insert into wfc_taskmid
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
        <if test='PROCESSDEFVERID!= null'> 
           PROCESSDEFVERID,
        </if>
        <if test='ACTIVITYDEFID!= null'> 
           ACTIVITYDEFID,
        </if>
        <if test='OWNER!= null'> 
           OWNER,
        </if>
        <if test='OWNERDEPTID!= null'> 
           OWNERDEPTID,
        </if>
        <if test='TARGET!= null'> 
           TARGET,
        </if>
        <if test='TARGETDEPTID!= null'> 
           TARGETDEPTID,
        </if>
        <if test='TARGETCOMPANYID!= null'> 
           TARGETCOMPANYID,
        </if>
        <if test='TARGETROLEID!= null'> 
           TARGETROLEID,
        </if>
        <if test='DISPATCHSTATE!= null'> 
           DISPATCHSTATE,
        </if>
        <if test='PRIORITY!= null'> 
           PRIORITY,
        </if>
        <if test='DUETIME!= null'> 
           DUETIME,
        </if>
        <if test='ORDERINDEX!= null'> 
           ORDERINDEX
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
        <if test='PROCESSDEFVERID!= null'> 
           #{PROCESSDEFVERID,jdbcType=char}，
        </if>
        <if test='ACTIVITYDEFID!= null'> 
           #{ACTIVITYDEFID,jdbcType=char}，
        </if>
        <if test='OWNER!= null'> 
           #{OWNER,jdbcType=varchar}，
        </if>
        <if test='OWNERDEPTID!= null'> 
           #{OWNERDEPTID,jdbcType=varchar}，
        </if>
        <if test='TARGET!= null'> 
           #{TARGET,jdbcType=varchar}，
        </if>
        <if test='TARGETDEPTID!= null'> 
           #{TARGETDEPTID,jdbcType=varchar}，
        </if>
        <if test='TARGETCOMPANYID!= null'> 
           #{TARGETCOMPANYID,jdbcType=varchar}，
        </if>
        <if test='TARGETROLEID!= null'> 
           #{TARGETROLEID,jdbcType=varchar}，
        </if>
        <if test='DISPATCHSTATE!= null'> 
           #{DISPATCHSTATE,jdbcType=smallint}，
        </if>
        <if test='PRIORITY!= null'> 
           #{PRIORITY,jdbcType=smallint}，
        </if>
        <if test='DUETIME!= null'> 
           #{DUETIME,jdbcType=datetime}，
        </if>
        <if test='ORDERINDEX!= null'> 
           #{ORDERINDEX,jdbcType=smallint}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:wfc_taskmid_dto):Unit
                


@Delete("DELETE FROM wfc_taskmid WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE wfc_taskmid SET
        ID=#{ID,jdbcType=String},
        PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},
        TASKINSTID=#{TASKINSTID,jdbcType=String},
        PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},
        PROCESSDEFVERID=#{PROCESSDEFVERID,jdbcType=String},
        ACTIVITYDEFID=#{ACTIVITYDEFID,jdbcType=String},
        OWNER=#{OWNER,jdbcType=String},
        OWNERDEPTID=#{OWNERDEPTID,jdbcType=String},
        TARGET=#{TARGET,jdbcType=String},
        TARGETDEPTID=#{TARGETDEPTID,jdbcType=String},
        TARGETCOMPANYID=#{TARGETCOMPANYID,jdbcType=String},
        TARGETROLEID=#{TARGETROLEID,jdbcType=String},
        DISPATCHSTATE=#{DISPATCHSTATE,jdbcType=Integer},
        PRIORITY=#{PRIORITY,jdbcType=Integer},
        DUETIME=#{DUETIME,jdbcType=Timestamp},
        ORDERINDEX=#{ORDERINDEX,jdbcType=Integer}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:wfc_taskmid_dto)
        

@Update("""<script>
            UPDATE wfc_taskmid SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="PROCESSINSTID != null">  PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},</if>
        <if test="TASKINSTID != null">  TASKINSTID=#{TASKINSTID,jdbcType=String},</if>
        <if test="PROCESSDEFID != null">  PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},</if>
        <if test="PROCESSDEFVERID != null">  PROCESSDEFVERID=#{PROCESSDEFVERID,jdbcType=String},</if>
        <if test="ACTIVITYDEFID != null">  ACTIVITYDEFID=#{ACTIVITYDEFID,jdbcType=String},</if>
        <if test="OWNER != null">  OWNER=#{OWNER,jdbcType=String},</if>
        <if test="OWNERDEPTID != null">  OWNERDEPTID=#{OWNERDEPTID,jdbcType=String},</if>
        <if test="TARGET != null">  TARGET=#{TARGET,jdbcType=String},</if>
        <if test="TARGETDEPTID != null">  TARGETDEPTID=#{TARGETDEPTID,jdbcType=String},</if>
        <if test="TARGETCOMPANYID != null">  TARGETCOMPANYID=#{TARGETCOMPANYID,jdbcType=String},</if>
        <if test="TARGETROLEID != null">  TARGETROLEID=#{TARGETROLEID,jdbcType=String},</if>
        <if test="DISPATCHSTATE != null">  DISPATCHSTATE=#{DISPATCHSTATE,jdbcType=Integer},</if>
        <if test="PRIORITY != null">  PRIORITY=#{PRIORITY,jdbcType=Integer},</if>
        <if test="DUETIME != null">  DUETIME=#{DUETIME,jdbcType=Timestamp},</if>
        <if test="ORDERINDEX != null">  ORDERINDEX=#{ORDERINDEX,jdbcType=Integer}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:wfc_taskmid_dto)
            

}

        


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
    insert into TStudent
    (ID,PROCESSINSTID,TASKINSTID,PROCESSDEFID,PROCESSDEFVERID,ACTIVITYDEFID,OWNER,OWNERDEPTID,TARGET,TARGETDEPTID,TARGETCOMPANYID,TARGETROLEID,DISPATCHSTATE,PRIORITY,DUETIME,ORDERINDEX)
    values
    (#{ID},#{PROCESSINSTID},#{TASKINSTID},#{PROCESSDEFID},#{PROCESSDEFVERID},#{ACTIVITYDEFID},#{OWNER},#{OWNERDEPTID},#{TARGET},#{TARGETDEPTID},#{TARGETCOMPANYID},#{TARGETROLEID},#{DISPATCHSTATE},#{PRIORITY},#{DUETIME},#{ORDERINDEX})
</script>""")
fun insert(model:wfc_taskmid_dto):Unit
                

}

        
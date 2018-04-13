

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_delegationscope{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PID", column = "PID"),
   Result(property = "RESOURCETYPE", column = "RESOURCETYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID")
)
@Select("""<script>
   SELECT * FROM sys_delegationscope
</script>""")
fun GetListAll():ArrayList<sys_delegationscope_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PID", column = "PID"),
   Result(property = "RESOURCETYPE", column = "RESOURCETYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID")
)
@Select("""<script>
   SELECT * FROM sys_delegationscope
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="PID!=null">
      PID=#{PID}
   </if> 
   <if test="RESOURCETYPE!=null">
      RESOURCETYPE=#{RESOURCETYPE}
   </if> 
   <if test="RESOURCEID!=null">
      RESOURCEID=#{RESOURCEID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_delegationscope_dto):ArrayList<sys_delegationscope_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PID", column = "PID"),
   Result(property = "RESOURCETYPE", column = "RESOURCETYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID")
)
@Select("""<script>
   SELECT * FROM sys_delegationscope
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_delegationscope_dto):sys_delegationscope_dto?
                


@Insert("""<script>
    insert into sys_delegationscope
    (ID,PID,RESOURCETYPE,RESOURCEID)
    values
    (#{ID},#{PID},#{RESOURCETYPE},#{RESOURCEID})
</script>""")
fun Insert(model:sys_delegationscope_dto):Unit
                


@Insert("""<script>
    insert into sys_delegationscope
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='PID!= null'> 
           PID,
        </if>
        <if test='RESOURCETYPE!= null'> 
           RESOURCETYPE,
        </if>
        <if test='RESOURCEID!= null'> 
           RESOURCEID
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='PID!= null'> 
           #{PID,jdbcType=char}，
        </if>
        <if test='RESOURCETYPE!= null'> 
           #{RESOURCETYPE,jdbcType=char}，
        </if>
        <if test='RESOURCEID!= null'> 
           #{RESOURCEID,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_delegationscope_dto):Unit
                

}

        
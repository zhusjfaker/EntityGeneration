

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_permissionlist{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PERMISSIONID", column = "PERMISSIONID"),
   Result(property = "RESOURCETYPE", column = "RESOURCETYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID"),
   Result(property = "ACCESSMODE", column = "ACCESSMODE"),
   Result(property = "EXT1", column = "EXT1")
)
@Select("""<script>
   SELECT * FROM sys_permissionlist
</script>""")
fun GetListAll():ArrayList<sys_permissionlist_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PERMISSIONID", column = "PERMISSIONID"),
   Result(property = "RESOURCETYPE", column = "RESOURCETYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID"),
   Result(property = "ACCESSMODE", column = "ACCESSMODE"),
   Result(property = "EXT1", column = "EXT1")
)
@Select("""<script>
   SELECT * FROM sys_permissionlist
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="PERMISSIONID!=null">
      PERMISSIONID=#{PERMISSIONID}
   </if> 
   <if test="RESOURCETYPE!=null">
      RESOURCETYPE=#{RESOURCETYPE}
   </if> 
   <if test="RESOURCEID!=null">
      RESOURCEID=#{RESOURCEID}
   </if> 
   <if test="ACCESSMODE!=null">
      ACCESSMODE=#{ACCESSMODE}
   </if> 
   <if test="EXT1!=null">
      EXT1=#{EXT1}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_permissionlist_dto):ArrayList<sys_permissionlist_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PERMISSIONID", column = "PERMISSIONID"),
   Result(property = "RESOURCETYPE", column = "RESOURCETYPE"),
   Result(property = "RESOURCEID", column = "RESOURCEID"),
   Result(property = "ACCESSMODE", column = "ACCESSMODE"),
   Result(property = "EXT1", column = "EXT1")
)
@Select("""<script>
   SELECT * FROM sys_permissionlist
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_permissionlist_dto):sys_permissionlist_dto?
                


@Insert("""<script>
    insert into sys_permissionlist
    (ID,PERMISSIONID,RESOURCETYPE,RESOURCEID,ACCESSMODE,EXT1)
    values
    (#{ID},#{PERMISSIONID},#{RESOURCETYPE},#{RESOURCEID},#{ACCESSMODE},#{EXT1})
</script>""")
fun Insert(model:sys_permissionlist_dto):Unit
                


@Insert("""<script>
    insert into sys_permissionlist
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
           PERMISSIONID,
           RESOURCETYPE,
           RESOURCEID,
           ACCESSMODE,
        <if test='EXT1!= null'> 
           EXT1
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=varchar}，
           #{PERMISSIONID,jdbcType=varchar}，
           #{RESOURCETYPE,jdbcType=varchar}，
           #{RESOURCEID,jdbcType=varchar}，
           #{ACCESSMODE,jdbcType=smallint}，
        <if test='EXT1!= null'> 
           #{EXT1,jdbcType=text}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_permissionlist_dto):Unit
                

}

        
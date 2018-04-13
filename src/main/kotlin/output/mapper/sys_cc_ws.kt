

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_cc_ws{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "NAME", column = "NAME"),
   Result(property = "XMT", column = "XMT"),
   Result(property = "STATE", column = "STATE"),
   Result(property = "PUBLISHDATE", column = "PUBLISHDATE"),
   Result(property = "PUBLISHER", column = "PUBLISHER"),
   Result(property = "DESCRIPTION", column = "DESCRIPTION"),
   Result(property = "WEBSERVER", column = "WEBSERVER"),
   Result(property = "ADDRESS", column = "ADDRESS")
)
@Select("""<script>
   SELECT * FROM sys_cc_ws
</script>""")
fun GetListAll():ArrayList<sys_cc_ws_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "NAME", column = "NAME"),
   Result(property = "XMT", column = "XMT"),
   Result(property = "STATE", column = "STATE"),
   Result(property = "PUBLISHDATE", column = "PUBLISHDATE"),
   Result(property = "PUBLISHER", column = "PUBLISHER"),
   Result(property = "DESCRIPTION", column = "DESCRIPTION"),
   Result(property = "WEBSERVER", column = "WEBSERVER"),
   Result(property = "ADDRESS", column = "ADDRESS")
)
@Select("""<script>
   SELECT * FROM sys_cc_ws
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="NAME!=null">
      NAME=#{NAME}
   </if> 
   <if test="XMT!=null">
      XMT=#{XMT}
   </if> 
   <if test="STATE!=null">
      STATE=#{STATE}
   </if> 
   <if test="PUBLISHDATE!=null">
      PUBLISHDATE=#{PUBLISHDATE}
   </if> 
   <if test="PUBLISHER!=null">
      PUBLISHER=#{PUBLISHER}
   </if> 
   <if test="DESCRIPTION!=null">
      DESCRIPTION=#{DESCRIPTION}
   </if> 
   <if test="WEBSERVER!=null">
      WEBSERVER=#{WEBSERVER}
   </if> 
   <if test="ADDRESS!=null">
      ADDRESS=#{ADDRESS}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_cc_ws_dto):ArrayList<sys_cc_ws_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "NAME", column = "NAME"),
   Result(property = "XMT", column = "XMT"),
   Result(property = "STATE", column = "STATE"),
   Result(property = "PUBLISHDATE", column = "PUBLISHDATE"),
   Result(property = "PUBLISHER", column = "PUBLISHER"),
   Result(property = "DESCRIPTION", column = "DESCRIPTION"),
   Result(property = "WEBSERVER", column = "WEBSERVER"),
   Result(property = "ADDRESS", column = "ADDRESS")
)
@Select("""<script>
   SELECT * FROM sys_cc_ws
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_cc_ws_dto):sys_cc_ws_dto?
                


@Insert("""<script>
    insert into sys_cc_ws
    (ID,NAME,XMT,STATE,PUBLISHDATE,PUBLISHER,DESCRIPTION,WEBSERVER,ADDRESS)
    values
    (#{ID},#{NAME},#{XMT},#{STATE},#{PUBLISHDATE},#{PUBLISHER},#{DESCRIPTION},#{WEBSERVER},#{ADDRESS})
</script>""")
fun Insert(model:sys_cc_ws_dto):Unit
                


@Insert("""<script>
    insert into sys_cc_ws
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='NAME!= null'> 
           NAME,
        </if>
        <if test='XMT!= null'> 
           XMT,
        </if>
        <if test='STATE!= null'> 
           STATE,
        </if>
           PUBLISHDATE,
        <if test='PUBLISHER!= null'> 
           PUBLISHER,
        </if>
        <if test='DESCRIPTION!= null'> 
           DESCRIPTION,
        </if>
        <if test='WEBSERVER!= null'> 
           WEBSERVER,
        </if>
        <if test='ADDRESS!= null'> 
           ADDRESS
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=decimal}，
        <if test='NAME!= null'> 
           #{NAME,jdbcType=text}，
        </if>
        <if test='XMT!= null'> 
           #{XMT,jdbcType=text}，
        </if>
        <if test='STATE!= null'> 
           #{STATE,jdbcType=decimal}，
        </if>
           #{PUBLISHDATE,jdbcType=datetime}，
        <if test='PUBLISHER!= null'> 
           #{PUBLISHER,jdbcType=varchar}，
        </if>
        <if test='DESCRIPTION!= null'> 
           #{DESCRIPTION,jdbcType=text}，
        </if>
        <if test='WEBSERVER!= null'> 
           #{WEBSERVER,jdbcType=text}，
        </if>
        <if test='ADDRESS!= null'> 
           #{ADDRESS,jdbcType=text}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_cc_ws_dto):Unit
                

}

        


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
                


@Delete("DELETE FROM sys_cc_ws WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:BigDecimal)
        

@Update("""<script>
        UPDATE sys_cc_ws SET
        ID=#{ID,jdbcType=BigDecimal},
        NAME=#{NAME,jdbcType=String},
        XMT=#{XMT,jdbcType=String},
        STATE=#{STATE,jdbcType=BigDecimal},
        PUBLISHDATE=#{PUBLISHDATE,jdbcType=Timestamp},
        PUBLISHER=#{PUBLISHER,jdbcType=String},
        DESCRIPTION=#{DESCRIPTION,jdbcType=String},
        WEBSERVER=#{WEBSERVER,jdbcType=String},
        ADDRESS=#{ADDRESS,jdbcType=String}
        WHERE ID=#{ID,jdbcType=BigDecimal}
        </script>""")
fun UpdateByPrimaryKey(model:sys_cc_ws_dto)
        

@Update("""<script>
            UPDATE sys_cc_ws SET
            <if test="ID != null">  ID=#{ID,jdbcType=BigDecimal},</if>
        <if test="NAME != null">  NAME=#{NAME,jdbcType=String},</if>
        <if test="XMT != null">  XMT=#{XMT,jdbcType=String},</if>
        <if test="STATE != null">  STATE=#{STATE,jdbcType=BigDecimal},</if>
        <if test="PUBLISHDATE != null">  PUBLISHDATE=#{PUBLISHDATE,jdbcType=Timestamp},</if>
        <if test="PUBLISHER != null">  PUBLISHER=#{PUBLISHER,jdbcType=String},</if>
        <if test="DESCRIPTION != null">  DESCRIPTION=#{DESCRIPTION,jdbcType=String},</if>
        <if test="WEBSERVER != null">  WEBSERVER=#{WEBSERVER,jdbcType=String},</if>
        <if test="ADDRESS != null">  ADDRESS=#{ADDRESS,jdbcType=String}
              WHERE ID=#{ID,jdbcType=BigDecimal}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_cc_ws_dto)
            

}

        

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
                


@Delete("DELETE FROM sys_cc_ws WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:BigDecimal)
        

@Update("""<script>
        UPDATE sys_cc_ws SET
        ID=#{ID,jdbcType=BigDecimal},
        NAME=#{NAME,jdbcType=String},
        XMT=#{XMT,jdbcType=String},
        STATE=#{STATE,jdbcType=BigDecimal},
        PUBLISHDATE=#{PUBLISHDATE,jdbcType=Timestamp},
        PUBLISHER=#{PUBLISHER,jdbcType=String},
        DESCRIPTION=#{DESCRIPTION,jdbcType=String},
        WEBSERVER=#{WEBSERVER,jdbcType=String},
        ADDRESS=#{ADDRESS,jdbcType=String}
        WHERE ID=#{ID,jdbcType=BigDecimal}
        </script>""")
fun UpdateByPrimaryKey(model:sys_cc_ws_dto)
        

@Update("""<script>
            UPDATE sys_cc_ws SET
            <if test="ID != null">  ID=#{ID,jdbcType=BigDecimal},</if>
        <if test="NAME != null">  NAME=#{NAME,jdbcType=String},</if>
        <if test="XMT != null">  XMT=#{XMT,jdbcType=String},</if>
        <if test="STATE != null">  STATE=#{STATE,jdbcType=BigDecimal},</if>
        <if test="PUBLISHDATE != null">  PUBLISHDATE=#{PUBLISHDATE,jdbcType=Timestamp},</if>
        <if test="PUBLISHER != null">  PUBLISHER=#{PUBLISHER,jdbcType=String},</if>
        <if test="DESCRIPTION != null">  DESCRIPTION=#{DESCRIPTION,jdbcType=String},</if>
        <if test="WEBSERVER != null">  WEBSERVER=#{WEBSERVER,jdbcType=String},</if>
        <if test="ADDRESS != null">  ADDRESS=#{ADDRESS,jdbcType=String}
              WHERE ID=#{ID,jdbcType=BigDecimal}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_cc_ws_dto)
            

}

        
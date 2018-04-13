

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_sla_dim_h{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "INSTNAME", column = "INSTNAME"),
   Result(property = "METRICID", column = "METRICID"),
   Result(property = "VAVG", column = "VAVG"),
   Result(property = "VMAX", column = "VMAX"),
   Result(property = "VMIN", column = "VMIN"),
   Result(property = "VCOUNT", column = "VCOUNT"),
   Result(property = "VTIME", column = "VTIME"),
   Result(property = "ISPROCESSING", column = "ISPROCESSING")
)
@Select("""<script>
   SELECT * FROM sys_sla_dim_h
</script>""")
fun GetListAll():ArrayList<sys_sla_dim_h_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "INSTNAME", column = "INSTNAME"),
   Result(property = "METRICID", column = "METRICID"),
   Result(property = "VAVG", column = "VAVG"),
   Result(property = "VMAX", column = "VMAX"),
   Result(property = "VMIN", column = "VMIN"),
   Result(property = "VCOUNT", column = "VCOUNT"),
   Result(property = "VTIME", column = "VTIME"),
   Result(property = "ISPROCESSING", column = "ISPROCESSING")
)
@Select("""<script>
   SELECT * FROM sys_sla_dim_h
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="INSTNAME!=null">
      INSTNAME=#{INSTNAME}
   </if> 
   <if test="METRICID!=null">
      METRICID=#{METRICID}
   </if> 
   <if test="VAVG!=null">
      VAVG=#{VAVG}
   </if> 
   <if test="VMAX!=null">
      VMAX=#{VMAX}
   </if> 
   <if test="VMIN!=null">
      VMIN=#{VMIN}
   </if> 
   <if test="VCOUNT!=null">
      VCOUNT=#{VCOUNT}
   </if> 
   <if test="VTIME!=null">
      VTIME=#{VTIME}
   </if> 
   <if test="ISPROCESSING!=null">
      ISPROCESSING=#{ISPROCESSING}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_sla_dim_h_dto):ArrayList<sys_sla_dim_h_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "INSTNAME", column = "INSTNAME"),
   Result(property = "METRICID", column = "METRICID"),
   Result(property = "VAVG", column = "VAVG"),
   Result(property = "VMAX", column = "VMAX"),
   Result(property = "VMIN", column = "VMIN"),
   Result(property = "VCOUNT", column = "VCOUNT"),
   Result(property = "VTIME", column = "VTIME"),
   Result(property = "ISPROCESSING", column = "ISPROCESSING")
)
@Select("""<script>
   SELECT * FROM sys_sla_dim_h
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_sla_dim_h_dto):sys_sla_dim_h_dto?
                


@Insert("""<script>
    insert into sys_sla_dim_h
    (ID,INSTNAME,METRICID,VAVG,VMAX,VMIN,VCOUNT,VTIME,ISPROCESSING)
    values
    (#{ID},#{INSTNAME},#{METRICID},#{VAVG},#{VMAX},#{VMIN},#{VCOUNT},#{VTIME},#{ISPROCESSING})
</script>""")
fun Insert(model:sys_sla_dim_h_dto):Unit
                


@Insert("""<script>
    insert into sys_sla_dim_h
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
           INSTNAME,
           METRICID,
        <if test='VAVG!= null'> 
           VAVG,
        </if>
        <if test='VMAX!= null'> 
           VMAX,
        </if>
        <if test='VMIN!= null'> 
           VMIN,
        </if>
        <if test='VCOUNT!= null'> 
           VCOUNT,
        </if>
           VTIME,
        <if test='ISPROCESSING!= null'> 
           ISPROCESSING
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
           #{INSTNAME,jdbcType=varchar}，
           #{METRICID,jdbcType=varchar}，
        <if test='VAVG!= null'> 
           #{VAVG,jdbcType=decimal}，
        </if>
        <if test='VMAX!= null'> 
           #{VMAX,jdbcType=decimal}，
        </if>
        <if test='VMIN!= null'> 
           #{VMIN,jdbcType=decimal}，
        </if>
        <if test='VCOUNT!= null'> 
           #{VCOUNT,jdbcType=decimal}，
        </if>
           #{VTIME,jdbcType=char}，
        <if test='ISPROCESSING!= null'> 
           #{ISPROCESSING,jdbcType=smallint}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_sla_dim_h_dto):Unit
                

}

        
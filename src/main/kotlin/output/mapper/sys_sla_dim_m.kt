

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_sla_dim_m{


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
   SELECT * FROM sys_sla_dim_m
</script>""")
fun GetListAll():ArrayList<sys_sla_dim_m_dto>
        


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
   SELECT * FROM sys_sla_dim_m
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
fun ConditionalQuery(model:sys_sla_dim_m_dto):ArrayList<sys_sla_dim_m_dto>
                


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
   SELECT * FROM sys_sla_dim_m
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_sla_dim_m_dto):sys_sla_dim_m_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,INSTNAME,METRICID,VAVG,VMAX,VMIN,VCOUNT,VTIME,ISPROCESSING)
    values
    (#{ID},#{INSTNAME},#{METRICID},#{VAVG},#{VMAX},#{VMIN},#{VCOUNT},#{VTIME},#{ISPROCESSING})
</script>""")
fun insert(model:sys_sla_dim_m_dto):Unit
                

}

        
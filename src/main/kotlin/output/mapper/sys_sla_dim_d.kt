

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_sla_dim_d{


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
   SELECT * FROM sys_sla_dim_d
</script>""")
fun GetListAll():ArrayList<sys_sla_dim_d_dto>
        


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
   SELECT * FROM sys_sla_dim_d
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
fun ConditionalQuery(model:sys_sla_dim_d_dto):ArrayList<sys_sla_dim_d_dto>
                


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
   SELECT * FROM sys_sla_dim_d
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_sla_dim_d_dto):sys_sla_dim_d_dto?
                


@Insert("""<script>
    insert into sys_sla_dim_d
    (ID,INSTNAME,METRICID,VAVG,VMAX,VMIN,VCOUNT,VTIME,ISPROCESSING)
    values
    (#{ID},#{INSTNAME},#{METRICID},#{VAVG},#{VMAX},#{VMIN},#{VCOUNT},#{VTIME},#{ISPROCESSING})
</script>""")
fun Insert(model:sys_sla_dim_d_dto):Unit
                


@Insert("""<script>
    insert into sys_sla_dim_d
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
fun InsertSelective(model:sys_sla_dim_d_dto):Unit
                


@Delete("DELETE FROM sys_sla_dim_d WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_sla_dim_d SET
        ID=#{ID,jdbcType=String},
        INSTNAME=#{INSTNAME,jdbcType=String},
        METRICID=#{METRICID,jdbcType=String},
        VAVG=#{VAVG,jdbcType=BigDecimal},
        VMAX=#{VMAX,jdbcType=BigDecimal},
        VMIN=#{VMIN,jdbcType=BigDecimal},
        VCOUNT=#{VCOUNT,jdbcType=BigDecimal},
        VTIME=#{VTIME,jdbcType=String},
        ISPROCESSING=#{ISPROCESSING,jdbcType=Integer}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_sla_dim_d_dto)
        

@Update("""<script>
            UPDATE sys_sla_dim_d SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="INSTNAME != null">  INSTNAME=#{INSTNAME,jdbcType=String},</if>
        <if test="METRICID != null">  METRICID=#{METRICID,jdbcType=String},</if>
        <if test="VAVG != null">  VAVG=#{VAVG,jdbcType=BigDecimal},</if>
        <if test="VMAX != null">  VMAX=#{VMAX,jdbcType=BigDecimal},</if>
        <if test="VMIN != null">  VMIN=#{VMIN,jdbcType=BigDecimal},</if>
        <if test="VCOUNT != null">  VCOUNT=#{VCOUNT,jdbcType=BigDecimal},</if>
        <if test="VTIME != null">  VTIME=#{VTIME,jdbcType=String},</if>
        <if test="ISPROCESSING != null">  ISPROCESSING=#{ISPROCESSING,jdbcType=Integer}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_sla_dim_d_dto)
            

}

        
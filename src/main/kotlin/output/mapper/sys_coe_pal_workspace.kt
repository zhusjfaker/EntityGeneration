

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_coe_pal_workspace{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSNAME", column = "WSNAME"),
   Result(property = "WSDM", column = "WSDM"),
   Result(property = "WSADMIN", column = "WSADMIN"),
   Result(property = "WSDESC", column = "WSDESC"),
   Result(property = "WSSTATE", column = "WSSTATE"),
   Result(property = "WSORGTYPE", column = "WSORGTYPE"),
   Result(property = "WSTCTYPE", column = "WSTCTYPE"),
   Result(property = "WSBGURL", column = "WSBGURL"),
   Result(property = "WSORDERINDEX", column = "WSORDERINDEX"),
   Result(property = "WSVER", column = "WSVER"),
   Result(property = "WSVERSIONUUID", column = "WSVERSIONUUID"),
   Result(property = "ISUSE", column = "ISUSE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_workspace
</script>""")
fun GetListAll():ArrayList<sys_coe_pal_workspace_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSNAME", column = "WSNAME"),
   Result(property = "WSDM", column = "WSDM"),
   Result(property = "WSADMIN", column = "WSADMIN"),
   Result(property = "WSDESC", column = "WSDESC"),
   Result(property = "WSSTATE", column = "WSSTATE"),
   Result(property = "WSORGTYPE", column = "WSORGTYPE"),
   Result(property = "WSTCTYPE", column = "WSTCTYPE"),
   Result(property = "WSBGURL", column = "WSBGURL"),
   Result(property = "WSORDERINDEX", column = "WSORDERINDEX"),
   Result(property = "WSVER", column = "WSVER"),
   Result(property = "WSVERSIONUUID", column = "WSVERSIONUUID"),
   Result(property = "ISUSE", column = "ISUSE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_workspace
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="WSNAME!=null">
      WSNAME=#{WSNAME}
   </if> 
   <if test="WSDM!=null">
      WSDM=#{WSDM}
   </if> 
   <if test="WSADMIN!=null">
      WSADMIN=#{WSADMIN}
   </if> 
   <if test="WSDESC!=null">
      WSDESC=#{WSDESC}
   </if> 
   <if test="WSSTATE!=null">
      WSSTATE=#{WSSTATE}
   </if> 
   <if test="WSORGTYPE!=null">
      WSORGTYPE=#{WSORGTYPE}
   </if> 
   <if test="WSTCTYPE!=null">
      WSTCTYPE=#{WSTCTYPE}
   </if> 
   <if test="WSBGURL!=null">
      WSBGURL=#{WSBGURL}
   </if> 
   <if test="WSORDERINDEX!=null">
      WSORDERINDEX=#{WSORDERINDEX}
   </if> 
   <if test="WSVER!=null">
      WSVER=#{WSVER}
   </if> 
   <if test="WSVERSIONUUID!=null">
      WSVERSIONUUID=#{WSVERSIONUUID}
   </if> 
   <if test="ISUSE!=null">
      ISUSE=#{ISUSE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_coe_pal_workspace_dto):ArrayList<sys_coe_pal_workspace_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WSNAME", column = "WSNAME"),
   Result(property = "WSDM", column = "WSDM"),
   Result(property = "WSADMIN", column = "WSADMIN"),
   Result(property = "WSDESC", column = "WSDESC"),
   Result(property = "WSSTATE", column = "WSSTATE"),
   Result(property = "WSORGTYPE", column = "WSORGTYPE"),
   Result(property = "WSTCTYPE", column = "WSTCTYPE"),
   Result(property = "WSBGURL", column = "WSBGURL"),
   Result(property = "WSORDERINDEX", column = "WSORDERINDEX"),
   Result(property = "WSVER", column = "WSVER"),
   Result(property = "WSVERSIONUUID", column = "WSVERSIONUUID"),
   Result(property = "ISUSE", column = "ISUSE")
)
@Select("""<script>
   SELECT * FROM sys_coe_pal_workspace
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_coe_pal_workspace_dto):sys_coe_pal_workspace_dto?
                


@Insert("""<script>
    insert into sys_coe_pal_workspace
    (ID,WSNAME,WSDM,WSADMIN,WSDESC,WSSTATE,WSORGTYPE,WSTCTYPE,WSBGURL,WSORDERINDEX,WSVER,WSVERSIONUUID,ISUSE)
    values
    (#{ID},#{WSNAME},#{WSDM},#{WSADMIN},#{WSDESC},#{WSSTATE},#{WSORGTYPE},#{WSTCTYPE},#{WSBGURL},#{WSORDERINDEX},#{WSVER},#{WSVERSIONUUID},#{ISUSE})
</script>""")
fun Insert(model:sys_coe_pal_workspace_dto):Unit
                


@Insert("""<script>
    insert into sys_coe_pal_workspace
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='WSNAME!= null'> 
           WSNAME,
        </if>
        <if test='WSDM!= null'> 
           WSDM,
        </if>
        <if test='WSADMIN!= null'> 
           WSADMIN,
        </if>
        <if test='WSDESC!= null'> 
           WSDESC,
        </if>
        <if test='WSSTATE!= null'> 
           WSSTATE,
        </if>
        <if test='WSORGTYPE!= null'> 
           WSORGTYPE,
        </if>
        <if test='WSTCTYPE!= null'> 
           WSTCTYPE,
        </if>
        <if test='WSBGURL!= null'> 
           WSBGURL,
        </if>
        <if test='WSORDERINDEX!= null'> 
           WSORDERINDEX,
        </if>
        <if test='WSVER!= null'> 
           WSVER,
        </if>
        <if test='WSVERSIONUUID!= null'> 
           WSVERSIONUUID,
        </if>
        <if test='ISUSE!= null'> 
           ISUSE
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='WSNAME!= null'> 
           #{WSNAME,jdbcType=varchar}，
        </if>
        <if test='WSDM!= null'> 
           #{WSDM,jdbcType=varchar}，
        </if>
        <if test='WSADMIN!= null'> 
           #{WSADMIN,jdbcType=varchar}，
        </if>
        <if test='WSDESC!= null'> 
           #{WSDESC,jdbcType=varchar}，
        </if>
        <if test='WSSTATE!= null'> 
           #{WSSTATE,jdbcType=smallint}，
        </if>
        <if test='WSORGTYPE!= null'> 
           #{WSORGTYPE,jdbcType=smallint}，
        </if>
        <if test='WSTCTYPE!= null'> 
           #{WSTCTYPE,jdbcType=smallint}，
        </if>
        <if test='WSBGURL!= null'> 
           #{WSBGURL,jdbcType=varchar}，
        </if>
        <if test='WSORDERINDEX!= null'> 
           #{WSORDERINDEX,jdbcType=smallint}，
        </if>
        <if test='WSVER!= null'> 
           #{WSVER,jdbcType=smallint}，
        </if>
        <if test='WSVERSIONUUID!= null'> 
           #{WSVERSIONUUID,jdbcType=char}，
        </if>
        <if test='ISUSE!= null'> 
           #{ISUSE,jdbcType=smallint}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_coe_pal_workspace_dto):Unit
                

}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_userportal{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "PORTALID", column = "PORTALID"),
   Result(property = "PORTLETID", column = "PORTLETID"),
   Result(property = "PORTLETTITLE", column = "PORTLETTITLE"),
   Result(property = "PORTLETHEIGHT", column = "PORTLETHEIGHT"),
   Result(property = "LINKURL", column = "LINKURL"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "POOLNAME", column = "POOLNAME"),
   Result(property = "PROFILEDATA", column = "PROFILEDATA")
)
@Select("""<script>
   SELECT * FROM sys_userportal
</script>""")
fun GetListAll():ArrayList<sys_userportal_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "PORTALID", column = "PORTALID"),
   Result(property = "PORTLETID", column = "PORTLETID"),
   Result(property = "PORTLETTITLE", column = "PORTLETTITLE"),
   Result(property = "PORTLETHEIGHT", column = "PORTLETHEIGHT"),
   Result(property = "LINKURL", column = "LINKURL"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "POOLNAME", column = "POOLNAME"),
   Result(property = "PROFILEDATA", column = "PROFILEDATA")
)
@Select("""<script>
   SELECT * FROM sys_userportal
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="PORTALID!=null">
      PORTALID=#{PORTALID}
   </if> 
   <if test="PORTLETID!=null">
      PORTLETID=#{PORTLETID}
   </if> 
   <if test="PORTLETTITLE!=null">
      PORTLETTITLE=#{PORTLETTITLE}
   </if> 
   <if test="PORTLETHEIGHT!=null">
      PORTLETHEIGHT=#{PORTLETHEIGHT}
   </if> 
   <if test="LINKURL!=null">
      LINKURL=#{LINKURL}
   </if> 
   <if test="ORDERINDEX!=null">
      ORDERINDEX=#{ORDERINDEX}
   </if> 
   <if test="POOLNAME!=null">
      POOLNAME=#{POOLNAME}
   </if> 
   <if test="PROFILEDATA!=null">
      PROFILEDATA=#{PROFILEDATA}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_userportal_dto):ArrayList<sys_userportal_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "PORTALID", column = "PORTALID"),
   Result(property = "PORTLETID", column = "PORTLETID"),
   Result(property = "PORTLETTITLE", column = "PORTLETTITLE"),
   Result(property = "PORTLETHEIGHT", column = "PORTLETHEIGHT"),
   Result(property = "LINKURL", column = "LINKURL"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "POOLNAME", column = "POOLNAME"),
   Result(property = "PROFILEDATA", column = "PROFILEDATA")
)
@Select("""<script>
   SELECT * FROM sys_userportal
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_userportal_dto):sys_userportal_dto?
                


@Insert("""<script>
    insert into sys_userportal
    (ID,USERID,PORTALID,PORTLETID,PORTLETTITLE,PORTLETHEIGHT,LINKURL,ORDERINDEX,POOLNAME,PROFILEDATA)
    values
    (#{ID},#{USERID},#{PORTALID},#{PORTLETID},#{PORTLETTITLE},#{PORTLETHEIGHT},#{LINKURL},#{ORDERINDEX},#{POOLNAME},#{PROFILEDATA})
</script>""")
fun Insert(model:sys_userportal_dto):Unit
                


@Insert("""<script>
    insert into sys_userportal
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='USERID!= null'> 
           USERID,
        </if>
        <if test='PORTALID!= null'> 
           PORTALID,
        </if>
        <if test='PORTLETID!= null'> 
           PORTLETID,
        </if>
        <if test='PORTLETTITLE!= null'> 
           PORTLETTITLE,
        </if>
        <if test='PORTLETHEIGHT!= null'> 
           PORTLETHEIGHT,
        </if>
        <if test='LINKURL!= null'> 
           LINKURL,
        </if>
        <if test='ORDERINDEX!= null'> 
           ORDERINDEX,
        </if>
        <if test='POOLNAME!= null'> 
           POOLNAME,
        </if>
        <if test='PROFILEDATA!= null'> 
           PROFILEDATA
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=varchar}，
        <if test='USERID!= null'> 
           #{USERID,jdbcType=varchar}，
        </if>
        <if test='PORTALID!= null'> 
           #{PORTALID,jdbcType=varchar}，
        </if>
        <if test='PORTLETID!= null'> 
           #{PORTLETID,jdbcType=varchar}，
        </if>
        <if test='PORTLETTITLE!= null'> 
           #{PORTLETTITLE,jdbcType=varchar}，
        </if>
        <if test='PORTLETHEIGHT!= null'> 
           #{PORTLETHEIGHT,jdbcType=varchar}，
        </if>
        <if test='LINKURL!= null'> 
           #{LINKURL,jdbcType=varchar}，
        </if>
        <if test='ORDERINDEX!= null'> 
           #{ORDERINDEX,jdbcType=smallint}，
        </if>
        <if test='POOLNAME!= null'> 
           #{POOLNAME,jdbcType=varchar}，
        </if>
        <if test='PROFILEDATA!= null'> 
           #{PROFILEDATA,jdbcType=text}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_userportal_dto):Unit
                

}

        


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
    insert into TStudent
    (ID,WSNAME,WSDM,WSADMIN,WSDESC,WSSTATE,WSORGTYPE,WSTCTYPE,WSBGURL,WSORDERINDEX,WSVER,WSVERSIONUUID,ISUSE)
    values
    (#{ID},#{WSNAME},#{WSDM},#{WSADMIN},#{WSDESC},#{WSSTATE},#{WSORGTYPE},#{WSTCTYPE},#{WSBGURL},#{WSORDERINDEX},#{WSVER},#{WSVERSIONUUID},#{ISUSE})
</script>""")
fun insert(model:sys_coe_pal_workspace_dto):Unit
                

}

        
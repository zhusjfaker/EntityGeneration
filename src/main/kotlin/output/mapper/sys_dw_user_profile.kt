

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_dw_user_profile{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "VIEWID", column = "VIEWID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "PROFILE_TYPE", column = "PROFILE_TYPE"),
   Result(property = "PROFILE_VAL", column = "PROFILE_VAL"),
   Result(property = "WIDTH", column = "WIDTH"),
   Result(property = "ISDISPLAY", column = "ISDISPLAY"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "PAGE", column = "PAGE")
)
@Select("""<script>
   SELECT * FROM sys_dw_user_profile
</script>""")
fun GetListAll():ArrayList<sys_dw_user_profile_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "VIEWID", column = "VIEWID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "PROFILE_TYPE", column = "PROFILE_TYPE"),
   Result(property = "PROFILE_VAL", column = "PROFILE_VAL"),
   Result(property = "WIDTH", column = "WIDTH"),
   Result(property = "ISDISPLAY", column = "ISDISPLAY"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "PAGE", column = "PAGE")
)
@Select("""<script>
   SELECT * FROM sys_dw_user_profile
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="VIEWID!=null">
      VIEWID=#{VIEWID}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="PROFILE_TYPE!=null">
      PROFILE_TYPE=#{PROFILE_TYPE}
   </if> 
   <if test="PROFILE_VAL!=null">
      PROFILE_VAL=#{PROFILE_VAL}
   </if> 
   <if test="WIDTH!=null">
      WIDTH=#{WIDTH}
   </if> 
   <if test="ISDISPLAY!=null">
      ISDISPLAY=#{ISDISPLAY}
   </if> 
   <if test="ORDERINDEX!=null">
      ORDERINDEX=#{ORDERINDEX}
   </if> 
   <if test="PAGE!=null">
      PAGE=#{PAGE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_dw_user_profile_dto):ArrayList<sys_dw_user_profile_dto>
                




@Insert("""<script>
    insert into TStudent
    (ID,VIEWID,USERID,PROFILE_TYPE,PROFILE_VAL,WIDTH,ISDISPLAY,ORDERINDEX,PAGE)
    values
    (#{ID},#{VIEWID},#{USERID},#{PROFILE_TYPE},#{PROFILE_VAL},#{WIDTH},#{ISDISPLAY},#{ORDERINDEX},#{PAGE})
</script>""")
fun insert(model:sys_dw_user_profile_dto):Unit
                

}

        
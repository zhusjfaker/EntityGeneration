

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfc_commenttemp{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "ACTIONNAME", column = "ACTIONNAME"),
   Result(property = "MSG", column = "MSG"),
   Result(property = "FILES", column = "FILES")
)
@Select("""<script>
   SELECT * FROM wfc_commenttemp
</script>""")
fun GetListAll():ArrayList<wfc_commenttemp_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "ACTIONNAME", column = "ACTIONNAME"),
   Result(property = "MSG", column = "MSG"),
   Result(property = "FILES", column = "FILES")
)
@Select("""<script>
   SELECT * FROM wfc_commenttemp
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="PROCESSINSTID!=null">
      PROCESSINSTID=#{PROCESSINSTID}
   </if> 
   <if test="TASKINSTID!=null">
      TASKINSTID=#{TASKINSTID}
   </if> 
   <if test="ACTIONNAME!=null">
      ACTIONNAME=#{ACTIONNAME}
   </if> 
   <if test="MSG!=null">
      MSG=#{MSG}
   </if> 
   <if test="FILES!=null">
      FILES=#{FILES}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:wfc_commenttemp_dto):ArrayList<wfc_commenttemp_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "ACTIONNAME", column = "ACTIONNAME"),
   Result(property = "MSG", column = "MSG"),
   Result(property = "FILES", column = "FILES")
)
@Select("""<script>
   SELECT * FROM wfc_commenttemp
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:wfc_commenttemp_dto):wfc_commenttemp_dto?
                


@Insert("""<script>
    insert into wfc_commenttemp
    (ID,PROCESSINSTID,TASKINSTID,ACTIONNAME,MSG,FILES)
    values
    (#{ID},#{PROCESSINSTID},#{TASKINSTID},#{ACTIONNAME},#{MSG},#{FILES})
</script>""")
fun Insert(model:wfc_commenttemp_dto):Unit
                


@Insert("""<script>
    insert into wfc_commenttemp
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='PROCESSINSTID!= null'> 
           PROCESSINSTID,
        </if>
        <if test='TASKINSTID!= null'> 
           TASKINSTID,
        </if>
        <if test='ACTIONNAME!= null'> 
           ACTIONNAME,
        </if>
        <if test='MSG!= null'> 
           MSG,
        </if>
        <if test='FILES!= null'> 
           FILES
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='PROCESSINSTID!= null'> 
           #{PROCESSINSTID,jdbcType=char}，
        </if>
        <if test='TASKINSTID!= null'> 
           #{TASKINSTID,jdbcType=char}，
        </if>
        <if test='ACTIONNAME!= null'> 
           #{ACTIONNAME,jdbcType=varchar}，
        </if>
        <if test='MSG!= null'> 
           #{MSG,jdbcType=text}，
        </if>
        <if test='FILES!= null'> 
           #{FILES,jdbcType=text}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:wfc_commenttemp_dto):Unit
                


@Delete("DELETE FROM wfc_commenttemp WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE wfc_commenttemp SET
        ID=#{ID,jdbcType=String},
        PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},
        TASKINSTID=#{TASKINSTID,jdbcType=String},
        ACTIONNAME=#{ACTIONNAME,jdbcType=String},
        MSG=#{MSG,jdbcType=String},
        FILES=#{FILES,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:wfc_commenttemp_dto)
        

@Update("""<script>
            UPDATE wfc_commenttemp SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="PROCESSINSTID != null">  PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},</if>
        <if test="TASKINSTID != null">  TASKINSTID=#{TASKINSTID,jdbcType=String},</if>
        <if test="ACTIONNAME != null">  ACTIONNAME=#{ACTIONNAME,jdbcType=String},</if>
        <if test="MSG != null">  MSG=#{MSG,jdbcType=String},</if>
        <if test="FILES != null">  FILES=#{FILES,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:wfc_commenttemp_dto)
            

}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_email_templete{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TEMPLATENAME", column = "TEMPLATENAME"),
   Result(property = "EMAILTO", column = "EMAILTO"),
   Result(property = "COPYTO", column = "COPYTO"),
   Result(property = "EMAIL_TITLE", column = "EMAIL_TITLE"),
   Result(property = "EMAIL_CONTENT", column = "EMAIL_CONTENT"),
   Result(property = "TEMPLATETYPE", column = "TEMPLATETYPE"),
   Result(property = "ISDEFAULT", column = "ISDEFAULT"),
   Result(property = "EMAILFROM", column = "EMAILFROM"),
   Result(property = "FROMNAME", column = "FROMNAME"),
   Result(property = "ISVALID", column = "ISVALID")
)
@Select("""<script>
   SELECT * FROM app_act_email_templete
</script>""")
fun GetListAll():ArrayList<app_act_email_templete_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TEMPLATENAME", column = "TEMPLATENAME"),
   Result(property = "EMAILTO", column = "EMAILTO"),
   Result(property = "COPYTO", column = "COPYTO"),
   Result(property = "EMAIL_TITLE", column = "EMAIL_TITLE"),
   Result(property = "EMAIL_CONTENT", column = "EMAIL_CONTENT"),
   Result(property = "TEMPLATETYPE", column = "TEMPLATETYPE"),
   Result(property = "ISDEFAULT", column = "ISDEFAULT"),
   Result(property = "EMAILFROM", column = "EMAILFROM"),
   Result(property = "FROMNAME", column = "FROMNAME"),
   Result(property = "ISVALID", column = "ISVALID")
)
@Select("""<script>
   SELECT * FROM app_act_email_templete
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="TEMPLATENAME!=null">
      TEMPLATENAME=#{TEMPLATENAME}
   </if> 
   <if test="EMAILTO!=null">
      EMAILTO=#{EMAILTO}
   </if> 
   <if test="COPYTO!=null">
      COPYTO=#{COPYTO}
   </if> 
   <if test="EMAIL_TITLE!=null">
      EMAIL_TITLE=#{EMAIL_TITLE}
   </if> 
   <if test="EMAIL_CONTENT!=null">
      EMAIL_CONTENT=#{EMAIL_CONTENT}
   </if> 
   <if test="TEMPLATETYPE!=null">
      TEMPLATETYPE=#{TEMPLATETYPE}
   </if> 
   <if test="ISDEFAULT!=null">
      ISDEFAULT=#{ISDEFAULT}
   </if> 
   <if test="EMAILFROM!=null">
      EMAILFROM=#{EMAILFROM}
   </if> 
   <if test="FROMNAME!=null">
      FROMNAME=#{FROMNAME}
   </if> 
   <if test="ISVALID!=null">
      ISVALID=#{ISVALID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_email_templete_dto):ArrayList<app_act_email_templete_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TEMPLATENAME", column = "TEMPLATENAME"),
   Result(property = "EMAILTO", column = "EMAILTO"),
   Result(property = "COPYTO", column = "COPYTO"),
   Result(property = "EMAIL_TITLE", column = "EMAIL_TITLE"),
   Result(property = "EMAIL_CONTENT", column = "EMAIL_CONTENT"),
   Result(property = "TEMPLATETYPE", column = "TEMPLATETYPE"),
   Result(property = "ISDEFAULT", column = "ISDEFAULT"),
   Result(property = "EMAILFROM", column = "EMAILFROM"),
   Result(property = "FROMNAME", column = "FROMNAME"),
   Result(property = "ISVALID", column = "ISVALID")
)
@Select("""<script>
   SELECT * FROM app_act_email_templete
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_email_templete_dto):app_act_email_templete_dto?
                


@Insert("""<script>
    insert into app_act_email_templete
    (ID,TEMPLATENAME,EMAILTO,COPYTO,EMAIL_TITLE,EMAIL_CONTENT,TEMPLATETYPE,ISDEFAULT,EMAILFROM,FROMNAME,ISVALID)
    values
    (#{ID},#{TEMPLATENAME},#{EMAILTO},#{COPYTO},#{EMAIL_TITLE},#{EMAIL_CONTENT},#{TEMPLATETYPE},#{ISDEFAULT},#{EMAILFROM},#{FROMNAME},#{ISVALID})
</script>""")
fun Insert(model:app_act_email_templete_dto):Unit
                


@Insert("""<script>
    insert into app_act_email_templete
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='TEMPLATENAME!= null'> 
           TEMPLATENAME,
        </if>
        <if test='EMAILTO!= null'> 
           EMAILTO,
        </if>
        <if test='COPYTO!= null'> 
           COPYTO,
        </if>
        <if test='EMAIL_TITLE!= null'> 
           EMAIL_TITLE,
        </if>
        <if test='EMAIL_CONTENT!= null'> 
           EMAIL_CONTENT,
        </if>
        <if test='TEMPLATETYPE!= null'> 
           TEMPLATETYPE,
        </if>
        <if test='ISDEFAULT!= null'> 
           ISDEFAULT,
        </if>
        <if test='EMAILFROM!= null'> 
           EMAILFROM,
        </if>
        <if test='FROMNAME!= null'> 
           FROMNAME,
        </if>
        <if test='ISVALID!= null'> 
           ISVALID
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=varchar}，
        <if test='TEMPLATENAME!= null'> 
           #{TEMPLATENAME,jdbcType=varchar}，
        </if>
        <if test='EMAILTO!= null'> 
           #{EMAILTO,jdbcType=varchar}，
        </if>
        <if test='COPYTO!= null'> 
           #{COPYTO,jdbcType=varchar}，
        </if>
        <if test='EMAIL_TITLE!= null'> 
           #{EMAIL_TITLE,jdbcType=varchar}，
        </if>
        <if test='EMAIL_CONTENT!= null'> 
           #{EMAIL_CONTENT,jdbcType=text}，
        </if>
        <if test='TEMPLATETYPE!= null'> 
           #{TEMPLATETYPE,jdbcType=varchar}，
        </if>
        <if test='ISDEFAULT!= null'> 
           #{ISDEFAULT,jdbcType=int}，
        </if>
        <if test='EMAILFROM!= null'> 
           #{EMAILFROM,jdbcType=varchar}，
        </if>
        <if test='FROMNAME!= null'> 
           #{FROMNAME,jdbcType=varchar}，
        </if>
        <if test='ISVALID!= null'> 
           #{ISVALID,jdbcType=int}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_email_templete_dto):Unit
                

}

        
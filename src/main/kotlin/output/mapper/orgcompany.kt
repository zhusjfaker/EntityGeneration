

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface orgcompany{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "COMPANYNO", column = "COMPANYNO"),
   Result(property = "COMPANYNAME", column = "COMPANYNAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "WORKCANLENDAR", column = "WORKCANLENDAR"),
   Result(property = "COMPANYTYPE", column = "COMPANYTYPE"),
   Result(property = "COMPANYDESC", column = "COMPANYDESC"),
   Result(property = "LOOKANDFEEL", column = "LOOKANDFEEL"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "CLOSED", column = "CLOSED"),
   Result(property = "CLOSEDATE", column = "CLOSEDATE"),
   Result(property = "BEGINDATE", column = "BEGINDATE"),
   Result(property = "ENDDATE", column = "ENDDATE"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE")
)
@Select("""<script>
   SELECT * FROM orgcompany
</script>""")
fun GetListAll():ArrayList<orgcompany_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "COMPANYNO", column = "COMPANYNO"),
   Result(property = "COMPANYNAME", column = "COMPANYNAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "WORKCANLENDAR", column = "WORKCANLENDAR"),
   Result(property = "COMPANYTYPE", column = "COMPANYTYPE"),
   Result(property = "COMPANYDESC", column = "COMPANYDESC"),
   Result(property = "LOOKANDFEEL", column = "LOOKANDFEEL"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "CLOSED", column = "CLOSED"),
   Result(property = "CLOSEDATE", column = "CLOSEDATE"),
   Result(property = "BEGINDATE", column = "BEGINDATE"),
   Result(property = "ENDDATE", column = "ENDDATE"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE")
)
@Select("""<script>
   SELECT * FROM orgcompany
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="COMPANYNO!=null">
      COMPANYNO=#{COMPANYNO}
   </if> 
   <if test="COMPANYNAME!=null">
      COMPANYNAME=#{COMPANYNAME}
   </if> 
   <if test="ORDERINDEX!=null">
      ORDERINDEX=#{ORDERINDEX}
   </if> 
   <if test="WORKCANLENDAR!=null">
      WORKCANLENDAR=#{WORKCANLENDAR}
   </if> 
   <if test="COMPANYTYPE!=null">
      COMPANYTYPE=#{COMPANYTYPE}
   </if> 
   <if test="COMPANYDESC!=null">
      COMPANYDESC=#{COMPANYDESC}
   </if> 
   <if test="LOOKANDFEEL!=null">
      LOOKANDFEEL=#{LOOKANDFEEL}
   </if> 
   <if test="EXT1!=null">
      EXT1=#{EXT1}
   </if> 
   <if test="EXT2!=null">
      EXT2=#{EXT2}
   </if> 
   <if test="EXT3!=null">
      EXT3=#{EXT3}
   </if> 
   <if test="EXT4!=null">
      EXT4=#{EXT4}
   </if> 
   <if test="EXT5!=null">
      EXT5=#{EXT5}
   </if> 
   <if test="CLOSED!=null">
      CLOSED=#{CLOSED}
   </if> 
   <if test="CLOSEDATE!=null">
      CLOSEDATE=#{CLOSEDATE}
   </if> 
   <if test="BEGINDATE!=null">
      BEGINDATE=#{BEGINDATE}
   </if> 
   <if test="ENDDATE!=null">
      ENDDATE=#{ENDDATE}
   </if> 
   <if test="CREATEDATE!=null">
      CREATEDATE=#{CREATEDATE}
   </if> 
   <if test="UPDATEDATE!=null">
      UPDATEDATE=#{UPDATEDATE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:orgcompany_dto):ArrayList<orgcompany_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "COMPANYNO", column = "COMPANYNO"),
   Result(property = "COMPANYNAME", column = "COMPANYNAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "WORKCANLENDAR", column = "WORKCANLENDAR"),
   Result(property = "COMPANYTYPE", column = "COMPANYTYPE"),
   Result(property = "COMPANYDESC", column = "COMPANYDESC"),
   Result(property = "LOOKANDFEEL", column = "LOOKANDFEEL"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "CLOSED", column = "CLOSED"),
   Result(property = "CLOSEDATE", column = "CLOSEDATE"),
   Result(property = "BEGINDATE", column = "BEGINDATE"),
   Result(property = "ENDDATE", column = "ENDDATE"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE")
)
@Select("""<script>
   SELECT * FROM orgcompany
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:orgcompany_dto):orgcompany_dto?
                


@Insert("""<script>
    insert into orgcompany
    (ID,COMPANYNO,COMPANYNAME,ORDERINDEX,WORKCANLENDAR,COMPANYTYPE,COMPANYDESC,LOOKANDFEEL,EXT1,EXT2,EXT3,EXT4,EXT5,CLOSED,CLOSEDATE,BEGINDATE,ENDDATE,CREATEDATE,UPDATEDATE)
    values
    (#{ID},#{COMPANYNO},#{COMPANYNAME},#{ORDERINDEX},#{WORKCANLENDAR},#{COMPANYTYPE},#{COMPANYDESC},#{LOOKANDFEEL},#{EXT1},#{EXT2},#{EXT3},#{EXT4},#{EXT5},#{CLOSED},#{CLOSEDATE},#{BEGINDATE},#{ENDDATE},#{CREATEDATE},#{UPDATEDATE})
</script>""")
fun Insert(model:orgcompany_dto):Unit
                


@Insert("""<script>
    insert into orgcompany
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='COMPANYNO!= null'> 
           COMPANYNO,
        </if>
           COMPANYNAME,
           ORDERINDEX,
        <if test='WORKCANLENDAR!= null'> 
           WORKCANLENDAR,
        </if>
        <if test='COMPANYTYPE!= null'> 
           COMPANYTYPE,
        </if>
        <if test='COMPANYDESC!= null'> 
           COMPANYDESC,
        </if>
        <if test='LOOKANDFEEL!= null'> 
           LOOKANDFEEL,
        </if>
        <if test='EXT1!= null'> 
           EXT1,
        </if>
        <if test='EXT2!= null'> 
           EXT2,
        </if>
        <if test='EXT3!= null'> 
           EXT3,
        </if>
        <if test='EXT4!= null'> 
           EXT4,
        </if>
        <if test='EXT5!= null'> 
           EXT5,
        </if>
        <if test='CLOSED!= null'> 
           CLOSED,
        </if>
        <if test='CLOSEDATE!= null'> 
           CLOSEDATE,
        </if>
        <if test='BEGINDATE!= null'> 
           BEGINDATE,
        </if>
        <if test='ENDDATE!= null'> 
           ENDDATE,
        </if>
        <if test='CREATEDATE!= null'> 
           CREATEDATE,
        </if>
        <if test='UPDATEDATE!= null'> 
           UPDATEDATE
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=varchar}，
        <if test='COMPANYNO!= null'> 
           #{COMPANYNO,jdbcType=varchar}，
        </if>
           #{COMPANYNAME,jdbcType=varchar}，
           #{ORDERINDEX,jdbcType=decimal}，
        <if test='WORKCANLENDAR!= null'> 
           #{WORKCANLENDAR,jdbcType=varchar}，
        </if>
        <if test='COMPANYTYPE!= null'> 
           #{COMPANYTYPE,jdbcType=varchar}，
        </if>
        <if test='COMPANYDESC!= null'> 
           #{COMPANYDESC,jdbcType=varchar}，
        </if>
        <if test='LOOKANDFEEL!= null'> 
           #{LOOKANDFEEL,jdbcType=varchar}，
        </if>
        <if test='EXT1!= null'> 
           #{EXT1,jdbcType=varchar}，
        </if>
        <if test='EXT2!= null'> 
           #{EXT2,jdbcType=varchar}，
        </if>
        <if test='EXT3!= null'> 
           #{EXT3,jdbcType=varchar}，
        </if>
        <if test='EXT4!= null'> 
           #{EXT4,jdbcType=varchar}，
        </if>
        <if test='EXT5!= null'> 
           #{EXT5,jdbcType=varchar}，
        </if>
        <if test='CLOSED!= null'> 
           #{CLOSED,jdbcType=smallint}，
        </if>
        <if test='CLOSEDATE!= null'> 
           #{CLOSEDATE,jdbcType=datetime}，
        </if>
        <if test='BEGINDATE!= null'> 
           #{BEGINDATE,jdbcType=datetime}，
        </if>
        <if test='ENDDATE!= null'> 
           #{ENDDATE,jdbcType=datetime}，
        </if>
        <if test='CREATEDATE!= null'> 
           #{CREATEDATE,jdbcType=datetime}，
        </if>
        <if test='UPDATEDATE!= null'> 
           #{UPDATEDATE,jdbcType=datetime}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:orgcompany_dto):Unit
                

}

        
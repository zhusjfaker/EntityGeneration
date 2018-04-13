

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface orgteam{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TEAMNAME", column = "TEAMNAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "TEAMTYPE", column = "TEAMTYPE"),
   Result(property = "CLOSED", column = "CLOSED"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "PARENTID", column = "PARENTID"),
   Result(property = "ISGROUP", column = "ISGROUP"),
   Result(property = "TEAMDESC", column = "TEAMDESC"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE")
)
@Select("""<script>
   SELECT * FROM orgteam
</script>""")
fun GetListAll():ArrayList<orgteam_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TEAMNAME", column = "TEAMNAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "TEAMTYPE", column = "TEAMTYPE"),
   Result(property = "CLOSED", column = "CLOSED"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "PARENTID", column = "PARENTID"),
   Result(property = "ISGROUP", column = "ISGROUP"),
   Result(property = "TEAMDESC", column = "TEAMDESC"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE")
)
@Select("""<script>
   SELECT * FROM orgteam
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="TEAMNAME!=null">
      TEAMNAME=#{TEAMNAME}
   </if> 
   <if test="ORDERINDEX!=null">
      ORDERINDEX=#{ORDERINDEX}
   </if> 
   <if test="TEAMTYPE!=null">
      TEAMTYPE=#{TEAMTYPE}
   </if> 
   <if test="CLOSED!=null">
      CLOSED=#{CLOSED}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="PARENTID!=null">
      PARENTID=#{PARENTID}
   </if> 
   <if test="ISGROUP!=null">
      ISGROUP=#{ISGROUP}
   </if> 
   <if test="TEAMDESC!=null">
      TEAMDESC=#{TEAMDESC}
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
   <if test="CREATEDATE!=null">
      CREATEDATE=#{CREATEDATE}
   </if> 
   <if test="UPDATEDATE!=null">
      UPDATEDATE=#{UPDATEDATE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:orgteam_dto):ArrayList<orgteam_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "TEAMNAME", column = "TEAMNAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "TEAMTYPE", column = "TEAMTYPE"),
   Result(property = "CLOSED", column = "CLOSED"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "PARENTID", column = "PARENTID"),
   Result(property = "ISGROUP", column = "ISGROUP"),
   Result(property = "TEAMDESC", column = "TEAMDESC"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE")
)
@Select("""<script>
   SELECT * FROM orgteam
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:orgteam_dto):orgteam_dto?
                


@Insert("""<script>
    insert into orgteam
    (ID,TEAMNAME,ORDERINDEX,TEAMTYPE,CLOSED,CREATEUSER,PARENTID,ISGROUP,TEAMDESC,EXT1,EXT2,EXT3,EXT4,EXT5,CREATEDATE,UPDATEDATE)
    values
    (#{ID},#{TEAMNAME},#{ORDERINDEX},#{TEAMTYPE},#{CLOSED},#{CREATEUSER},#{PARENTID},#{ISGROUP},#{TEAMDESC},#{EXT1},#{EXT2},#{EXT3},#{EXT4},#{EXT5},#{CREATEDATE},#{UPDATEDATE})
</script>""")
fun Insert(model:orgteam_dto):Unit
                


@Insert("""<script>
    insert into orgteam
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
           TEAMNAME,
        <if test='ORDERINDEX!= null'> 
           ORDERINDEX,
        </if>
        <if test='TEAMTYPE!= null'> 
           TEAMTYPE,
        </if>
        <if test='CLOSED!= null'> 
           CLOSED,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='PARENTID!= null'> 
           PARENTID,
        </if>
        <if test='ISGROUP!= null'> 
           ISGROUP,
        </if>
        <if test='TEAMDESC!= null'> 
           TEAMDESC,
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
        <if test='CREATEDATE!= null'> 
           CREATEDATE,
        </if>
        <if test='UPDATEDATE!= null'> 
           UPDATEDATE
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=varchar}，
           #{TEAMNAME,jdbcType=varchar}，
        <if test='ORDERINDEX!= null'> 
           #{ORDERINDEX,jdbcType=decimal}，
        </if>
        <if test='TEAMTYPE!= null'> 
           #{TEAMTYPE,jdbcType=smallint}，
        </if>
        <if test='CLOSED!= null'> 
           #{CLOSED,jdbcType=smallint}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='PARENTID!= null'> 
           #{PARENTID,jdbcType=varchar}，
        </if>
        <if test='ISGROUP!= null'> 
           #{ISGROUP,jdbcType=smallint}，
        </if>
        <if test='TEAMDESC!= null'> 
           #{TEAMDESC,jdbcType=varchar}，
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
        <if test='CREATEDATE!= null'> 
           #{CREATEDATE,jdbcType=datetime}，
        </if>
        <if test='UPDATEDATE!= null'> 
           #{UPDATEDATE,jdbcType=datetime}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:orgteam_dto):Unit
                

}

        
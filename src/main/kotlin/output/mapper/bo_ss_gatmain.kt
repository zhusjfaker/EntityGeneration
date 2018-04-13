

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_ss_gatmain{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ORGID", column = "ORGID"),
   Result(property = "BINDID", column = "BINDID"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE"),
   Result(property = "UPDATEUSER", column = "UPDATEUSER"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ISEND", column = "ISEND"),
   Result(property = "UNITID", column = "UNITID"),
   Result(property = "UCODE", column = "UCODE"),
   Result(property = "UNAME", column = "UNAME"),
   Result(property = "CURAMOUNT", column = "CURAMOUNT")
)
@Select("""<script>
   SELECT * FROM bo_ss_gatmain
</script>""")
fun GetListAll():ArrayList<bo_ss_gatmain_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ORGID", column = "ORGID"),
   Result(property = "BINDID", column = "BINDID"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE"),
   Result(property = "UPDATEUSER", column = "UPDATEUSER"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ISEND", column = "ISEND"),
   Result(property = "UNITID", column = "UNITID"),
   Result(property = "UCODE", column = "UCODE"),
   Result(property = "UNAME", column = "UNAME"),
   Result(property = "CURAMOUNT", column = "CURAMOUNT")
)
@Select("""<script>
   SELECT * FROM bo_ss_gatmain
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="ORGID!=null">
      ORGID=#{ORGID}
   </if> 
   <if test="BINDID!=null">
      BINDID=#{BINDID}
   </if> 
   <if test="CREATEDATE!=null">
      CREATEDATE=#{CREATEDATE}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="UPDATEDATE!=null">
      UPDATEDATE=#{UPDATEDATE}
   </if> 
   <if test="UPDATEUSER!=null">
      UPDATEUSER=#{UPDATEUSER}
   </if> 
   <if test="PROCESSDEFID!=null">
      PROCESSDEFID=#{PROCESSDEFID}
   </if> 
   <if test="ISEND!=null">
      ISEND=#{ISEND}
   </if> 
   <if test="UNITID!=null">
      UNITID=#{UNITID}
   </if> 
   <if test="UCODE!=null">
      UCODE=#{UCODE}
   </if> 
   <if test="UNAME!=null">
      UNAME=#{UNAME}
   </if> 
   <if test="CURAMOUNT!=null">
      CURAMOUNT=#{CURAMOUNT}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:bo_ss_gatmain_dto):ArrayList<bo_ss_gatmain_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ORGID", column = "ORGID"),
   Result(property = "BINDID", column = "BINDID"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE"),
   Result(property = "UPDATEUSER", column = "UPDATEUSER"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ISEND", column = "ISEND"),
   Result(property = "UNITID", column = "UNITID"),
   Result(property = "UCODE", column = "UCODE"),
   Result(property = "UNAME", column = "UNAME"),
   Result(property = "CURAMOUNT", column = "CURAMOUNT")
)
@Select("""<script>
   SELECT * FROM bo_ss_gatmain
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:bo_ss_gatmain_dto):bo_ss_gatmain_dto?
                


@Insert("""<script>
    insert into bo_ss_gatmain
    (ID,ORGID,BINDID,CREATEDATE,CREATEUSER,UPDATEDATE,UPDATEUSER,PROCESSDEFID,ISEND,UNITID,UCODE,UNAME,CURAMOUNT)
    values
    (#{ID},#{ORGID},#{BINDID},#{CREATEDATE},#{CREATEUSER},#{UPDATEDATE},#{UPDATEUSER},#{PROCESSDEFID},#{ISEND},#{UNITID},#{UCODE},#{UNAME},#{CURAMOUNT})
</script>""")
fun Insert(model:bo_ss_gatmain_dto):Unit
                


@Insert("""<script>
    insert into bo_ss_gatmain
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='ORGID!= null'> 
           ORGID,
        </if>
        <if test='BINDID!= null'> 
           BINDID,
        </if>
        <if test='CREATEDATE!= null'> 
           CREATEDATE,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='UPDATEDATE!= null'> 
           UPDATEDATE,
        </if>
        <if test='UPDATEUSER!= null'> 
           UPDATEUSER,
        </if>
        <if test='PROCESSDEFID!= null'> 
           PROCESSDEFID,
        </if>
           ISEND,
        <if test='UNITID!= null'> 
           UNITID,
        </if>
        <if test='UCODE!= null'> 
           UCODE,
        </if>
        <if test='UNAME!= null'> 
           UNAME,
        </if>
        <if test='CURAMOUNT!= null'> 
           CURAMOUNT
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='ORGID!= null'> 
           #{ORGID,jdbcType=varchar}，
        </if>
        <if test='BINDID!= null'> 
           #{BINDID,jdbcType=char}，
        </if>
        <if test='CREATEDATE!= null'> 
           #{CREATEDATE,jdbcType=timestamp}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='UPDATEDATE!= null'> 
           #{UPDATEDATE,jdbcType=timestamp}，
        </if>
        <if test='UPDATEUSER!= null'> 
           #{UPDATEUSER,jdbcType=varchar}，
        </if>
        <if test='PROCESSDEFID!= null'> 
           #{PROCESSDEFID,jdbcType=char}，
        </if>
           #{ISEND,jdbcType=smallint}，
        <if test='UNITID!= null'> 
           #{UNITID,jdbcType=varchar}，
        </if>
        <if test='UCODE!= null'> 
           #{UCODE,jdbcType=varchar}，
        </if>
        <if test='UNAME!= null'> 
           #{UNAME,jdbcType=varchar}，
        </if>
        <if test='CURAMOUNT!= null'> 
           #{CURAMOUNT,jdbcType=decimal}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:bo_ss_gatmain_dto):Unit
                

}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_ss_paymain{


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
   SELECT * FROM bo_ss_paymain
</script>""")
fun GetListAll():ArrayList<bo_ss_paymain_dto>
        


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
   SELECT * FROM bo_ss_paymain
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
fun ConditionalQuery(model:bo_ss_paymain_dto):ArrayList<bo_ss_paymain_dto>
                


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
   SELECT * FROM bo_ss_paymain
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:bo_ss_paymain_dto):bo_ss_paymain_dto?
                


@Insert("""<script>
    insert into bo_ss_paymain
    (ID,ORGID,BINDID,CREATEDATE,CREATEUSER,UPDATEDATE,UPDATEUSER,PROCESSDEFID,ISEND,UNITID,UCODE,UNAME,CURAMOUNT)
    values
    (#{ID},#{ORGID},#{BINDID},#{CREATEDATE},#{CREATEUSER},#{UPDATEDATE},#{UPDATEUSER},#{PROCESSDEFID},#{ISEND},#{UNITID},#{UCODE},#{UNAME},#{CURAMOUNT})
</script>""")
fun Insert(model:bo_ss_paymain_dto):Unit
                


@Insert("""<script>
    insert into bo_ss_paymain
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
fun InsertSelective(model:bo_ss_paymain_dto):Unit
                


@Delete("DELETE FROM bo_ss_paymain WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE bo_ss_paymain SET
        ID=#{ID,jdbcType=String},
        ORGID=#{ORGID,jdbcType=String},
        BINDID=#{BINDID,jdbcType=String},
        CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp},
        UPDATEUSER=#{UPDATEUSER,jdbcType=String},
        PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},
        ISEND=#{ISEND,jdbcType=Integer},
        UNITID=#{UNITID,jdbcType=String},
        UCODE=#{UCODE,jdbcType=String},
        UNAME=#{UNAME,jdbcType=String},
        CURAMOUNT=#{CURAMOUNT,jdbcType=BigDecimal}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:bo_ss_paymain_dto)
        

@Update("""<script>
            UPDATE bo_ss_paymain SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="ORGID != null">  ORGID=#{ORGID,jdbcType=String},</if>
        <if test="BINDID != null">  BINDID=#{BINDID,jdbcType=String},</if>
        <if test="CREATEDATE != null">  CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="UPDATEDATE != null">  UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp},</if>
        <if test="UPDATEUSER != null">  UPDATEUSER=#{UPDATEUSER,jdbcType=String},</if>
        <if test="PROCESSDEFID != null">  PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},</if>
        <if test="ISEND != null">  ISEND=#{ISEND,jdbcType=Integer},</if>
        <if test="UNITID != null">  UNITID=#{UNITID,jdbcType=String},</if>
        <if test="UCODE != null">  UCODE=#{UCODE,jdbcType=String},</if>
        <if test="UNAME != null">  UNAME=#{UNAME,jdbcType=String},</if>
        <if test="CURAMOUNT != null">  CURAMOUNT=#{CURAMOUNT,jdbcType=BigDecimal}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:bo_ss_paymain_dto)
            

}

        
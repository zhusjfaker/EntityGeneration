

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_act_fin_fee_hk_apply{


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
   Result(property = "HKNO", column = "HKNO"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "PAYDATE", column = "PAYDATE"),
   Result(property = "APPLYDATE", column = "APPLYDATE"),
   Result(property = "JKNO", column = "JKNO"),
   Result(property = "JKAMOUNT", column = "JKAMOUNT"),
   Result(property = "JKBALANCE", column = "JKBALANCE"),
   Result(property = "APPLYUID", column = "APPLYUID"),
   Result(property = "APPLYUSER", column = "APPLYUSER"),
   Result(property = "APPLYDEPTID", column = "APPLYDEPTID"),
   Result(property = "APPLYDEPT", column = "APPLYDEPT"),
   Result(property = "PAYTYPE", column = "PAYTYPE"),
   Result(property = "AMOUNT", column = "AMOUNT"),
   Result(property = "AMOUNTBIG", column = "AMOUNTBIG"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "CURRENCY", column = "CURRENCY"),
   Result(property = "RATE", column = "RATE")
)
@Select("""<script>
   SELECT * FROM bo_act_fin_fee_hk_apply
</script>""")
fun GetListAll():ArrayList<bo_act_fin_fee_hk_apply_dto>
        


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
   Result(property = "HKNO", column = "HKNO"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "PAYDATE", column = "PAYDATE"),
   Result(property = "APPLYDATE", column = "APPLYDATE"),
   Result(property = "JKNO", column = "JKNO"),
   Result(property = "JKAMOUNT", column = "JKAMOUNT"),
   Result(property = "JKBALANCE", column = "JKBALANCE"),
   Result(property = "APPLYUID", column = "APPLYUID"),
   Result(property = "APPLYUSER", column = "APPLYUSER"),
   Result(property = "APPLYDEPTID", column = "APPLYDEPTID"),
   Result(property = "APPLYDEPT", column = "APPLYDEPT"),
   Result(property = "PAYTYPE", column = "PAYTYPE"),
   Result(property = "AMOUNT", column = "AMOUNT"),
   Result(property = "AMOUNTBIG", column = "AMOUNTBIG"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "CURRENCY", column = "CURRENCY"),
   Result(property = "RATE", column = "RATE")
)
@Select("""<script>
   SELECT * FROM bo_act_fin_fee_hk_apply
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
   <if test="HKNO!=null">
      HKNO=#{HKNO}
   </if> 
   <if test="STATUS!=null">
      STATUS=#{STATUS}
   </if> 
   <if test="PAYDATE!=null">
      PAYDATE=#{PAYDATE}
   </if> 
   <if test="APPLYDATE!=null">
      APPLYDATE=#{APPLYDATE}
   </if> 
   <if test="JKNO!=null">
      JKNO=#{JKNO}
   </if> 
   <if test="JKAMOUNT!=null">
      JKAMOUNT=#{JKAMOUNT}
   </if> 
   <if test="JKBALANCE!=null">
      JKBALANCE=#{JKBALANCE}
   </if> 
   <if test="APPLYUID!=null">
      APPLYUID=#{APPLYUID}
   </if> 
   <if test="APPLYUSER!=null">
      APPLYUSER=#{APPLYUSER}
   </if> 
   <if test="APPLYDEPTID!=null">
      APPLYDEPTID=#{APPLYDEPTID}
   </if> 
   <if test="APPLYDEPT!=null">
      APPLYDEPT=#{APPLYDEPT}
   </if> 
   <if test="PAYTYPE!=null">
      PAYTYPE=#{PAYTYPE}
   </if> 
   <if test="AMOUNT!=null">
      AMOUNT=#{AMOUNT}
   </if> 
   <if test="AMOUNTBIG!=null">
      AMOUNTBIG=#{AMOUNTBIG}
   </if> 
   <if test="MEMO!=null">
      MEMO=#{MEMO}
   </if> 
   <if test="CURRENCY!=null">
      CURRENCY=#{CURRENCY}
   </if> 
   <if test="RATE!=null">
      RATE=#{RATE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:bo_act_fin_fee_hk_apply_dto):ArrayList<bo_act_fin_fee_hk_apply_dto>
                


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
   Result(property = "HKNO", column = "HKNO"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "PAYDATE", column = "PAYDATE"),
   Result(property = "APPLYDATE", column = "APPLYDATE"),
   Result(property = "JKNO", column = "JKNO"),
   Result(property = "JKAMOUNT", column = "JKAMOUNT"),
   Result(property = "JKBALANCE", column = "JKBALANCE"),
   Result(property = "APPLYUID", column = "APPLYUID"),
   Result(property = "APPLYUSER", column = "APPLYUSER"),
   Result(property = "APPLYDEPTID", column = "APPLYDEPTID"),
   Result(property = "APPLYDEPT", column = "APPLYDEPT"),
   Result(property = "PAYTYPE", column = "PAYTYPE"),
   Result(property = "AMOUNT", column = "AMOUNT"),
   Result(property = "AMOUNTBIG", column = "AMOUNTBIG"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "CURRENCY", column = "CURRENCY"),
   Result(property = "RATE", column = "RATE")
)
@Select("""<script>
   SELECT * FROM bo_act_fin_fee_hk_apply
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:bo_act_fin_fee_hk_apply_dto):bo_act_fin_fee_hk_apply_dto?
                


@Insert("""<script>
    insert into bo_act_fin_fee_hk_apply
    (ID,ORGID,BINDID,CREATEDATE,CREATEUSER,UPDATEDATE,UPDATEUSER,PROCESSDEFID,ISEND,HKNO,STATUS,PAYDATE,APPLYDATE,JKNO,JKAMOUNT,JKBALANCE,APPLYUID,APPLYUSER,APPLYDEPTID,APPLYDEPT,PAYTYPE,AMOUNT,AMOUNTBIG,MEMO,CURRENCY,RATE)
    values
    (#{ID},#{ORGID},#{BINDID},#{CREATEDATE},#{CREATEUSER},#{UPDATEDATE},#{UPDATEUSER},#{PROCESSDEFID},#{ISEND},#{HKNO},#{STATUS},#{PAYDATE},#{APPLYDATE},#{JKNO},#{JKAMOUNT},#{JKBALANCE},#{APPLYUID},#{APPLYUSER},#{APPLYDEPTID},#{APPLYDEPT},#{PAYTYPE},#{AMOUNT},#{AMOUNTBIG},#{MEMO},#{CURRENCY},#{RATE})
</script>""")
fun Insert(model:bo_act_fin_fee_hk_apply_dto):Unit
                


@Insert("""<script>
    insert into bo_act_fin_fee_hk_apply
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
        <if test='HKNO!= null'> 
           HKNO,
        </if>
        <if test='STATUS!= null'> 
           STATUS,
        </if>
        <if test='PAYDATE!= null'> 
           PAYDATE,
        </if>
        <if test='APPLYDATE!= null'> 
           APPLYDATE,
        </if>
        <if test='JKNO!= null'> 
           JKNO,
        </if>
        <if test='JKAMOUNT!= null'> 
           JKAMOUNT,
        </if>
        <if test='JKBALANCE!= null'> 
           JKBALANCE,
        </if>
        <if test='APPLYUID!= null'> 
           APPLYUID,
        </if>
        <if test='APPLYUSER!= null'> 
           APPLYUSER,
        </if>
        <if test='APPLYDEPTID!= null'> 
           APPLYDEPTID,
        </if>
        <if test='APPLYDEPT!= null'> 
           APPLYDEPT,
        </if>
        <if test='PAYTYPE!= null'> 
           PAYTYPE,
        </if>
        <if test='AMOUNT!= null'> 
           AMOUNT,
        </if>
        <if test='AMOUNTBIG!= null'> 
           AMOUNTBIG,
        </if>
        <if test='MEMO!= null'> 
           MEMO,
        </if>
        <if test='CURRENCY!= null'> 
           CURRENCY,
        </if>
        <if test='RATE!= null'> 
           RATE
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
        <if test='HKNO!= null'> 
           #{HKNO,jdbcType=varchar}，
        </if>
        <if test='STATUS!= null'> 
           #{STATUS,jdbcType=decimal}，
        </if>
        <if test='PAYDATE!= null'> 
           #{PAYDATE,jdbcType=datetime}，
        </if>
        <if test='APPLYDATE!= null'> 
           #{APPLYDATE,jdbcType=datetime}，
        </if>
        <if test='JKNO!= null'> 
           #{JKNO,jdbcType=varchar}，
        </if>
        <if test='JKAMOUNT!= null'> 
           #{JKAMOUNT,jdbcType=decimal}，
        </if>
        <if test='JKBALANCE!= null'> 
           #{JKBALANCE,jdbcType=decimal}，
        </if>
        <if test='APPLYUID!= null'> 
           #{APPLYUID,jdbcType=varchar}，
        </if>
        <if test='APPLYUSER!= null'> 
           #{APPLYUSER,jdbcType=varchar}，
        </if>
        <if test='APPLYDEPTID!= null'> 
           #{APPLYDEPTID,jdbcType=varchar}，
        </if>
        <if test='APPLYDEPT!= null'> 
           #{APPLYDEPT,jdbcType=varchar}，
        </if>
        <if test='PAYTYPE!= null'> 
           #{PAYTYPE,jdbcType=varchar}，
        </if>
        <if test='AMOUNT!= null'> 
           #{AMOUNT,jdbcType=decimal}，
        </if>
        <if test='AMOUNTBIG!= null'> 
           #{AMOUNTBIG,jdbcType=varchar}，
        </if>
        <if test='MEMO!= null'> 
           #{MEMO,jdbcType=text}，
        </if>
        <if test='CURRENCY!= null'> 
           #{CURRENCY,jdbcType=varchar}，
        </if>
        <if test='RATE!= null'> 
           #{RATE,jdbcType=decimal}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:bo_act_fin_fee_hk_apply_dto):Unit
                


@Delete("DELETE FROM bo_act_fin_fee_hk_apply WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE bo_act_fin_fee_hk_apply SET
        ID=#{ID,jdbcType=String},
        ORGID=#{ORGID,jdbcType=String},
        BINDID=#{BINDID,jdbcType=String},
        CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp},
        UPDATEUSER=#{UPDATEUSER,jdbcType=String},
        PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},
        ISEND=#{ISEND,jdbcType=Integer},
        HKNO=#{HKNO,jdbcType=String},
        STATUS=#{STATUS,jdbcType=BigDecimal},
        PAYDATE=#{PAYDATE,jdbcType=Timestamp},
        APPLYDATE=#{APPLYDATE,jdbcType=Timestamp},
        JKNO=#{JKNO,jdbcType=String},
        JKAMOUNT=#{JKAMOUNT,jdbcType=BigDecimal},
        JKBALANCE=#{JKBALANCE,jdbcType=BigDecimal},
        APPLYUID=#{APPLYUID,jdbcType=String},
        APPLYUSER=#{APPLYUSER,jdbcType=String},
        APPLYDEPTID=#{APPLYDEPTID,jdbcType=String},
        APPLYDEPT=#{APPLYDEPT,jdbcType=String},
        PAYTYPE=#{PAYTYPE,jdbcType=String},
        AMOUNT=#{AMOUNT,jdbcType=BigDecimal},
        AMOUNTBIG=#{AMOUNTBIG,jdbcType=String},
        MEMO=#{MEMO,jdbcType=String},
        CURRENCY=#{CURRENCY,jdbcType=String},
        RATE=#{RATE,jdbcType=BigDecimal}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:bo_act_fin_fee_hk_apply_dto)
        

@Update("""<script>
            UPDATE bo_act_fin_fee_hk_apply SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="ORGID != null">  ORGID=#{ORGID,jdbcType=String},</if>
        <if test="BINDID != null">  BINDID=#{BINDID,jdbcType=String},</if>
        <if test="CREATEDATE != null">  CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="UPDATEDATE != null">  UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp},</if>
        <if test="UPDATEUSER != null">  UPDATEUSER=#{UPDATEUSER,jdbcType=String},</if>
        <if test="PROCESSDEFID != null">  PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},</if>
        <if test="ISEND != null">  ISEND=#{ISEND,jdbcType=Integer},</if>
        <if test="HKNO != null">  HKNO=#{HKNO,jdbcType=String},</if>
        <if test="STATUS != null">  STATUS=#{STATUS,jdbcType=BigDecimal},</if>
        <if test="PAYDATE != null">  PAYDATE=#{PAYDATE,jdbcType=Timestamp},</if>
        <if test="APPLYDATE != null">  APPLYDATE=#{APPLYDATE,jdbcType=Timestamp},</if>
        <if test="JKNO != null">  JKNO=#{JKNO,jdbcType=String},</if>
        <if test="JKAMOUNT != null">  JKAMOUNT=#{JKAMOUNT,jdbcType=BigDecimal},</if>
        <if test="JKBALANCE != null">  JKBALANCE=#{JKBALANCE,jdbcType=BigDecimal},</if>
        <if test="APPLYUID != null">  APPLYUID=#{APPLYUID,jdbcType=String},</if>
        <if test="APPLYUSER != null">  APPLYUSER=#{APPLYUSER,jdbcType=String},</if>
        <if test="APPLYDEPTID != null">  APPLYDEPTID=#{APPLYDEPTID,jdbcType=String},</if>
        <if test="APPLYDEPT != null">  APPLYDEPT=#{APPLYDEPT,jdbcType=String},</if>
        <if test="PAYTYPE != null">  PAYTYPE=#{PAYTYPE,jdbcType=String},</if>
        <if test="AMOUNT != null">  AMOUNT=#{AMOUNT,jdbcType=BigDecimal},</if>
        <if test="AMOUNTBIG != null">  AMOUNTBIG=#{AMOUNTBIG,jdbcType=String},</if>
        <if test="MEMO != null">  MEMO=#{MEMO,jdbcType=String},</if>
        <if test="CURRENCY != null">  CURRENCY=#{CURRENCY,jdbcType=String},</if>
        <if test="RATE != null">  RATE=#{RATE,jdbcType=BigDecimal}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:bo_act_fin_fee_hk_apply_dto)
            

}

        
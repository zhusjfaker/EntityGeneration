

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
    insert into TStudent
    (ID,ORGID,BINDID,CREATEDATE,CREATEUSER,UPDATEDATE,UPDATEUSER,PROCESSDEFID,ISEND,HKNO,STATUS,PAYDATE,APPLYDATE,JKNO,JKAMOUNT,JKBALANCE,APPLYUID,APPLYUSER,APPLYDEPTID,APPLYDEPT,PAYTYPE,AMOUNT,AMOUNTBIG,MEMO,CURRENCY,RATE)
    values
    (#{ID},#{ORGID},#{BINDID},#{CREATEDATE},#{CREATEUSER},#{UPDATEDATE},#{UPDATEUSER},#{PROCESSDEFID},#{ISEND},#{HKNO},#{STATUS},#{PAYDATE},#{APPLYDATE},#{JKNO},#{JKAMOUNT},#{JKBALANCE},#{APPLYUID},#{APPLYUSER},#{APPLYDEPTID},#{APPLYDEPT},#{PAYTYPE},#{AMOUNT},#{AMOUNTBIG},#{MEMO},#{CURRENCY},#{RATE})
</script>""")
fun insert(model:bo_act_fin_fee_hk_apply_dto):Unit
                

}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_ss_client{


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
   Result(property = "CCODE", column = "CCODE"),
   Result(property = "CNAME", column = "CNAME"),
   Result(property = "OFFADDR", column = "OFFADDR"),
   Result(property = "REGADDR", column = "REGADDR"),
   Result(property = "STATUS1", column = "STATUS1"),
   Result(property = "BANK", column = "BANK"),
   Result(property = "ACCOUNT", column = "ACCOUNT"),
   Result(property = "TAXNO", column = "TAXNO"),
   Result(property = "CATTRIBUTE", column = "CATTRIBUTE"),
   Result(property = "CREDIT", column = "CREDIT"),
   Result(property = "LIMITRANGE", column = "LIMITRANGE"),
   Result(property = "REGFUND", column = "REGFUND"),
   Result(property = "POSTCODE", column = "POSTCODE"),
   Result(property = "TEL", column = "TEL"),
   Result(property = "FAX", column = "FAX"),
   Result(property = "WWW", column = "WWW"),
   Result(property = "REGDATE", column = "REGDATE"),
   Result(property = "GTYPE", column = "GTYPE"),
   Result(property = "RECDATE", column = "RECDATE"),
   Result(property = "BUID", column = "BUID"),
   Result(property = "BUNAME", column = "BUNAME"),
   Result(property = "MODDATE", column = "MODDATE"),
   Result(property = "MEMO", column = "MEMO")
)
@Select("""<script>
   SELECT * FROM bo_ss_client
</script>""")
fun GetListAll():ArrayList<bo_ss_client_dto>
        


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
   Result(property = "CCODE", column = "CCODE"),
   Result(property = "CNAME", column = "CNAME"),
   Result(property = "OFFADDR", column = "OFFADDR"),
   Result(property = "REGADDR", column = "REGADDR"),
   Result(property = "STATUS1", column = "STATUS1"),
   Result(property = "BANK", column = "BANK"),
   Result(property = "ACCOUNT", column = "ACCOUNT"),
   Result(property = "TAXNO", column = "TAXNO"),
   Result(property = "CATTRIBUTE", column = "CATTRIBUTE"),
   Result(property = "CREDIT", column = "CREDIT"),
   Result(property = "LIMITRANGE", column = "LIMITRANGE"),
   Result(property = "REGFUND", column = "REGFUND"),
   Result(property = "POSTCODE", column = "POSTCODE"),
   Result(property = "TEL", column = "TEL"),
   Result(property = "FAX", column = "FAX"),
   Result(property = "WWW", column = "WWW"),
   Result(property = "REGDATE", column = "REGDATE"),
   Result(property = "GTYPE", column = "GTYPE"),
   Result(property = "RECDATE", column = "RECDATE"),
   Result(property = "BUID", column = "BUID"),
   Result(property = "BUNAME", column = "BUNAME"),
   Result(property = "MODDATE", column = "MODDATE"),
   Result(property = "MEMO", column = "MEMO")
)
@Select("""<script>
   SELECT * FROM bo_ss_client
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
   <if test="CCODE!=null">
      CCODE=#{CCODE}
   </if> 
   <if test="CNAME!=null">
      CNAME=#{CNAME}
   </if> 
   <if test="OFFADDR!=null">
      OFFADDR=#{OFFADDR}
   </if> 
   <if test="REGADDR!=null">
      REGADDR=#{REGADDR}
   </if> 
   <if test="STATUS1!=null">
      STATUS1=#{STATUS1}
   </if> 
   <if test="BANK!=null">
      BANK=#{BANK}
   </if> 
   <if test="ACCOUNT!=null">
      ACCOUNT=#{ACCOUNT}
   </if> 
   <if test="TAXNO!=null">
      TAXNO=#{TAXNO}
   </if> 
   <if test="CATTRIBUTE!=null">
      CATTRIBUTE=#{CATTRIBUTE}
   </if> 
   <if test="CREDIT!=null">
      CREDIT=#{CREDIT}
   </if> 
   <if test="LIMITRANGE!=null">
      LIMITRANGE=#{LIMITRANGE}
   </if> 
   <if test="REGFUND!=null">
      REGFUND=#{REGFUND}
   </if> 
   <if test="POSTCODE!=null">
      POSTCODE=#{POSTCODE}
   </if> 
   <if test="TEL!=null">
      TEL=#{TEL}
   </if> 
   <if test="FAX!=null">
      FAX=#{FAX}
   </if> 
   <if test="WWW!=null">
      WWW=#{WWW}
   </if> 
   <if test="REGDATE!=null">
      REGDATE=#{REGDATE}
   </if> 
   <if test="GTYPE!=null">
      GTYPE=#{GTYPE}
   </if> 
   <if test="RECDATE!=null">
      RECDATE=#{RECDATE}
   </if> 
   <if test="BUID!=null">
      BUID=#{BUID}
   </if> 
   <if test="BUNAME!=null">
      BUNAME=#{BUNAME}
   </if> 
   <if test="MODDATE!=null">
      MODDATE=#{MODDATE}
   </if> 
   <if test="MEMO!=null">
      MEMO=#{MEMO}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:bo_ss_client_dto):ArrayList<bo_ss_client_dto>
                


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
   Result(property = "CCODE", column = "CCODE"),
   Result(property = "CNAME", column = "CNAME"),
   Result(property = "OFFADDR", column = "OFFADDR"),
   Result(property = "REGADDR", column = "REGADDR"),
   Result(property = "STATUS1", column = "STATUS1"),
   Result(property = "BANK", column = "BANK"),
   Result(property = "ACCOUNT", column = "ACCOUNT"),
   Result(property = "TAXNO", column = "TAXNO"),
   Result(property = "CATTRIBUTE", column = "CATTRIBUTE"),
   Result(property = "CREDIT", column = "CREDIT"),
   Result(property = "LIMITRANGE", column = "LIMITRANGE"),
   Result(property = "REGFUND", column = "REGFUND"),
   Result(property = "POSTCODE", column = "POSTCODE"),
   Result(property = "TEL", column = "TEL"),
   Result(property = "FAX", column = "FAX"),
   Result(property = "WWW", column = "WWW"),
   Result(property = "REGDATE", column = "REGDATE"),
   Result(property = "GTYPE", column = "GTYPE"),
   Result(property = "RECDATE", column = "RECDATE"),
   Result(property = "BUID", column = "BUID"),
   Result(property = "BUNAME", column = "BUNAME"),
   Result(property = "MODDATE", column = "MODDATE"),
   Result(property = "MEMO", column = "MEMO")
)
@Select("""<script>
   SELECT * FROM bo_ss_client
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:bo_ss_client_dto):bo_ss_client_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,ORGID,BINDID,CREATEDATE,CREATEUSER,UPDATEDATE,UPDATEUSER,PROCESSDEFID,ISEND,CCODE,CNAME,OFFADDR,REGADDR,STATUS1,BANK,ACCOUNT,TAXNO,CATTRIBUTE,CREDIT,LIMITRANGE,REGFUND,POSTCODE,TEL,FAX,WWW,REGDATE,GTYPE,RECDATE,BUID,BUNAME,MODDATE,MEMO)
    values
    (#{ID},#{ORGID},#{BINDID},#{CREATEDATE},#{CREATEUSER},#{UPDATEDATE},#{UPDATEUSER},#{PROCESSDEFID},#{ISEND},#{CCODE},#{CNAME},#{OFFADDR},#{REGADDR},#{STATUS1},#{BANK},#{ACCOUNT},#{TAXNO},#{CATTRIBUTE},#{CREDIT},#{LIMITRANGE},#{REGFUND},#{POSTCODE},#{TEL},#{FAX},#{WWW},#{REGDATE},#{GTYPE},#{RECDATE},#{BUID},#{BUNAME},#{MODDATE},#{MEMO})
</script>""")
fun insert(model:bo_ss_client_dto):Unit
                

}

        
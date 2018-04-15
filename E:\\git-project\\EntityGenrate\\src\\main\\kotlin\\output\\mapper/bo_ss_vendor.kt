

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_ss_vendor{


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
   Result(property = "VCODE", column = "VCODE"),
   Result(property = "VNAME", column = "VNAME"),
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
   SELECT * FROM bo_ss_vendor
</script>""")
fun GetListAll():ArrayList<bo_ss_vendor_dto>
        


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
   Result(property = "VCODE", column = "VCODE"),
   Result(property = "VNAME", column = "VNAME"),
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
   SELECT * FROM bo_ss_vendor
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
   <if test="VCODE!=null">
      VCODE=#{VCODE}
   </if> 
   <if test="VNAME!=null">
      VNAME=#{VNAME}
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
fun ConditionalQuery(model:bo_ss_vendor_dto):ArrayList<bo_ss_vendor_dto>
                


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
   Result(property = "VCODE", column = "VCODE"),
   Result(property = "VNAME", column = "VNAME"),
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
   SELECT * FROM bo_ss_vendor
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:bo_ss_vendor_dto):bo_ss_vendor_dto?
                


@Insert("""<script>
    insert into bo_ss_vendor
    (ID,ORGID,BINDID,CREATEDATE,CREATEUSER,UPDATEDATE,UPDATEUSER,PROCESSDEFID,ISEND,VCODE,VNAME,OFFADDR,REGADDR,STATUS1,BANK,ACCOUNT,TAXNO,CATTRIBUTE,CREDIT,LIMITRANGE,REGFUND,POSTCODE,TEL,FAX,WWW,REGDATE,GTYPE,RECDATE,BUID,BUNAME,MODDATE,MEMO)
    values
    (#{ID},#{ORGID},#{BINDID},#{CREATEDATE},#{CREATEUSER},#{UPDATEDATE},#{UPDATEUSER},#{PROCESSDEFID},#{ISEND},#{VCODE},#{VNAME},#{OFFADDR},#{REGADDR},#{STATUS1},#{BANK},#{ACCOUNT},#{TAXNO},#{CATTRIBUTE},#{CREDIT},#{LIMITRANGE},#{REGFUND},#{POSTCODE},#{TEL},#{FAX},#{WWW},#{REGDATE},#{GTYPE},#{RECDATE},#{BUID},#{BUNAME},#{MODDATE},#{MEMO})
</script>""")
fun Insert(model:bo_ss_vendor_dto):Unit
                


@Insert("""<script>
    insert into bo_ss_vendor
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
        <if test='VCODE!= null'> 
           VCODE,
        </if>
        <if test='VNAME!= null'> 
           VNAME,
        </if>
        <if test='OFFADDR!= null'> 
           OFFADDR,
        </if>
        <if test='REGADDR!= null'> 
           REGADDR,
        </if>
        <if test='STATUS1!= null'> 
           STATUS1,
        </if>
        <if test='BANK!= null'> 
           BANK,
        </if>
        <if test='ACCOUNT!= null'> 
           ACCOUNT,
        </if>
        <if test='TAXNO!= null'> 
           TAXNO,
        </if>
        <if test='CATTRIBUTE!= null'> 
           CATTRIBUTE,
        </if>
        <if test='CREDIT!= null'> 
           CREDIT,
        </if>
        <if test='LIMITRANGE!= null'> 
           LIMITRANGE,
        </if>
        <if test='REGFUND!= null'> 
           REGFUND,
        </if>
        <if test='POSTCODE!= null'> 
           POSTCODE,
        </if>
        <if test='TEL!= null'> 
           TEL,
        </if>
        <if test='FAX!= null'> 
           FAX,
        </if>
        <if test='WWW!= null'> 
           WWW,
        </if>
        <if test='REGDATE!= null'> 
           REGDATE,
        </if>
        <if test='GTYPE!= null'> 
           GTYPE,
        </if>
        <if test='RECDATE!= null'> 
           RECDATE,
        </if>
        <if test='BUID!= null'> 
           BUID,
        </if>
        <if test='BUNAME!= null'> 
           BUNAME,
        </if>
        <if test='MODDATE!= null'> 
           MODDATE,
        </if>
        <if test='MEMO!= null'> 
           MEMO
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
        <if test='VCODE!= null'> 
           #{VCODE,jdbcType=varchar}，
        </if>
        <if test='VNAME!= null'> 
           #{VNAME,jdbcType=varchar}，
        </if>
        <if test='OFFADDR!= null'> 
           #{OFFADDR,jdbcType=varchar}，
        </if>
        <if test='REGADDR!= null'> 
           #{REGADDR,jdbcType=varchar}，
        </if>
        <if test='STATUS1!= null'> 
           #{STATUS1,jdbcType=varchar}，
        </if>
        <if test='BANK!= null'> 
           #{BANK,jdbcType=varchar}，
        </if>
        <if test='ACCOUNT!= null'> 
           #{ACCOUNT,jdbcType=varchar}，
        </if>
        <if test='TAXNO!= null'> 
           #{TAXNO,jdbcType=varchar}，
        </if>
        <if test='CATTRIBUTE!= null'> 
           #{CATTRIBUTE,jdbcType=varchar}，
        </if>
        <if test='CREDIT!= null'> 
           #{CREDIT,jdbcType=varchar}，
        </if>
        <if test='LIMITRANGE!= null'> 
           #{LIMITRANGE,jdbcType=decimal}，
        </if>
        <if test='REGFUND!= null'> 
           #{REGFUND,jdbcType=decimal}，
        </if>
        <if test='POSTCODE!= null'> 
           #{POSTCODE,jdbcType=varchar}，
        </if>
        <if test='TEL!= null'> 
           #{TEL,jdbcType=varchar}，
        </if>
        <if test='FAX!= null'> 
           #{FAX,jdbcType=varchar}，
        </if>
        <if test='WWW!= null'> 
           #{WWW,jdbcType=varchar}，
        </if>
        <if test='REGDATE!= null'> 
           #{REGDATE,jdbcType=datetime}，
        </if>
        <if test='GTYPE!= null'> 
           #{GTYPE,jdbcType=varchar}，
        </if>
        <if test='RECDATE!= null'> 
           #{RECDATE,jdbcType=datetime}，
        </if>
        <if test='BUID!= null'> 
           #{BUID,jdbcType=varchar}，
        </if>
        <if test='BUNAME!= null'> 
           #{BUNAME,jdbcType=varchar}，
        </if>
        <if test='MODDATE!= null'> 
           #{MODDATE,jdbcType=datetime}，
        </if>
        <if test='MEMO!= null'> 
           #{MEMO,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:bo_ss_vendor_dto):Unit
                


@Delete("DELETE FROM bo_ss_vendor WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE bo_ss_vendor SET
        ID=#{ID,jdbcType=String},
        ORGID=#{ORGID,jdbcType=String},
        BINDID=#{BINDID,jdbcType=String},
        CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp},
        UPDATEUSER=#{UPDATEUSER,jdbcType=String},
        PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},
        ISEND=#{ISEND,jdbcType=Integer},
        VCODE=#{VCODE,jdbcType=String},
        VNAME=#{VNAME,jdbcType=String},
        OFFADDR=#{OFFADDR,jdbcType=String},
        REGADDR=#{REGADDR,jdbcType=String},
        STATUS1=#{STATUS1,jdbcType=String},
        BANK=#{BANK,jdbcType=String},
        ACCOUNT=#{ACCOUNT,jdbcType=String},
        TAXNO=#{TAXNO,jdbcType=String},
        CATTRIBUTE=#{CATTRIBUTE,jdbcType=String},
        CREDIT=#{CREDIT,jdbcType=String},
        LIMITRANGE=#{LIMITRANGE,jdbcType=BigDecimal},
        REGFUND=#{REGFUND,jdbcType=BigDecimal},
        POSTCODE=#{POSTCODE,jdbcType=String},
        TEL=#{TEL,jdbcType=String},
        FAX=#{FAX,jdbcType=String},
        WWW=#{WWW,jdbcType=String},
        REGDATE=#{REGDATE,jdbcType=Timestamp},
        GTYPE=#{GTYPE,jdbcType=String},
        RECDATE=#{RECDATE,jdbcType=Timestamp},
        BUID=#{BUID,jdbcType=String},
        BUNAME=#{BUNAME,jdbcType=String},
        MODDATE=#{MODDATE,jdbcType=Timestamp},
        MEMO=#{MEMO,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:bo_ss_vendor_dto)
        

@Update("""<script>
            UPDATE bo_ss_vendor SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="ORGID != null">  ORGID=#{ORGID,jdbcType=String},</if>
        <if test="BINDID != null">  BINDID=#{BINDID,jdbcType=String},</if>
        <if test="CREATEDATE != null">  CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="UPDATEDATE != null">  UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp},</if>
        <if test="UPDATEUSER != null">  UPDATEUSER=#{UPDATEUSER,jdbcType=String},</if>
        <if test="PROCESSDEFID != null">  PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},</if>
        <if test="ISEND != null">  ISEND=#{ISEND,jdbcType=Integer},</if>
        <if test="VCODE != null">  VCODE=#{VCODE,jdbcType=String},</if>
        <if test="VNAME != null">  VNAME=#{VNAME,jdbcType=String},</if>
        <if test="OFFADDR != null">  OFFADDR=#{OFFADDR,jdbcType=String},</if>
        <if test="REGADDR != null">  REGADDR=#{REGADDR,jdbcType=String},</if>
        <if test="STATUS1 != null">  STATUS1=#{STATUS1,jdbcType=String},</if>
        <if test="BANK != null">  BANK=#{BANK,jdbcType=String},</if>
        <if test="ACCOUNT != null">  ACCOUNT=#{ACCOUNT,jdbcType=String},</if>
        <if test="TAXNO != null">  TAXNO=#{TAXNO,jdbcType=String},</if>
        <if test="CATTRIBUTE != null">  CATTRIBUTE=#{CATTRIBUTE,jdbcType=String},</if>
        <if test="CREDIT != null">  CREDIT=#{CREDIT,jdbcType=String},</if>
        <if test="LIMITRANGE != null">  LIMITRANGE=#{LIMITRANGE,jdbcType=BigDecimal},</if>
        <if test="REGFUND != null">  REGFUND=#{REGFUND,jdbcType=BigDecimal},</if>
        <if test="POSTCODE != null">  POSTCODE=#{POSTCODE,jdbcType=String},</if>
        <if test="TEL != null">  TEL=#{TEL,jdbcType=String},</if>
        <if test="FAX != null">  FAX=#{FAX,jdbcType=String},</if>
        <if test="WWW != null">  WWW=#{WWW,jdbcType=String},</if>
        <if test="REGDATE != null">  REGDATE=#{REGDATE,jdbcType=Timestamp},</if>
        <if test="GTYPE != null">  GTYPE=#{GTYPE,jdbcType=String},</if>
        <if test="RECDATE != null">  RECDATE=#{RECDATE,jdbcType=Timestamp},</if>
        <if test="BUID != null">  BUID=#{BUID,jdbcType=String},</if>
        <if test="BUNAME != null">  BUNAME=#{BUNAME,jdbcType=String},</if>
        <if test="MODDATE != null">  MODDATE=#{MODDATE,jdbcType=Timestamp},</if>
        <if test="MEMO != null">  MEMO=#{MEMO,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:bo_ss_vendor_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_ss_vendor{


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
   Result(property = "VCODE", column = "VCODE"),
   Result(property = "VNAME", column = "VNAME"),
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
   SELECT * FROM bo_ss_vendor
</script>""")
fun GetListAll():ArrayList<bo_ss_vendor_dto>
        


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
   Result(property = "VCODE", column = "VCODE"),
   Result(property = "VNAME", column = "VNAME"),
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
   SELECT * FROM bo_ss_vendor
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
   <if test="VCODE!=null">
      VCODE=#{VCODE}
   </if> 
   <if test="VNAME!=null">
      VNAME=#{VNAME}
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
fun ConditionalQuery(model:bo_ss_vendor_dto):ArrayList<bo_ss_vendor_dto>
                


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
   Result(property = "VCODE", column = "VCODE"),
   Result(property = "VNAME", column = "VNAME"),
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
   SELECT * FROM bo_ss_vendor
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:bo_ss_vendor_dto):bo_ss_vendor_dto?
                


@Insert("""<script>
    insert into bo_ss_vendor
    (ID,ORGID,BINDID,CREATEDATE,CREATEUSER,UPDATEDATE,UPDATEUSER,PROCESSDEFID,ISEND,VCODE,VNAME,OFFADDR,REGADDR,STATUS1,BANK,ACCOUNT,TAXNO,CATTRIBUTE,CREDIT,LIMITRANGE,REGFUND,POSTCODE,TEL,FAX,WWW,REGDATE,GTYPE,RECDATE,BUID,BUNAME,MODDATE,MEMO)
    values
    (#{ID},#{ORGID},#{BINDID},#{CREATEDATE},#{CREATEUSER},#{UPDATEDATE},#{UPDATEUSER},#{PROCESSDEFID},#{ISEND},#{VCODE},#{VNAME},#{OFFADDR},#{REGADDR},#{STATUS1},#{BANK},#{ACCOUNT},#{TAXNO},#{CATTRIBUTE},#{CREDIT},#{LIMITRANGE},#{REGFUND},#{POSTCODE},#{TEL},#{FAX},#{WWW},#{REGDATE},#{GTYPE},#{RECDATE},#{BUID},#{BUNAME},#{MODDATE},#{MEMO})
</script>""")
fun Insert(model:bo_ss_vendor_dto):Unit
                


@Insert("""<script>
    insert into bo_ss_vendor
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
        <if test='VCODE!= null'> 
           VCODE,
        </if>
        <if test='VNAME!= null'> 
           VNAME,
        </if>
        <if test='OFFADDR!= null'> 
           OFFADDR,
        </if>
        <if test='REGADDR!= null'> 
           REGADDR,
        </if>
        <if test='STATUS1!= null'> 
           STATUS1,
        </if>
        <if test='BANK!= null'> 
           BANK,
        </if>
        <if test='ACCOUNT!= null'> 
           ACCOUNT,
        </if>
        <if test='TAXNO!= null'> 
           TAXNO,
        </if>
        <if test='CATTRIBUTE!= null'> 
           CATTRIBUTE,
        </if>
        <if test='CREDIT!= null'> 
           CREDIT,
        </if>
        <if test='LIMITRANGE!= null'> 
           LIMITRANGE,
        </if>
        <if test='REGFUND!= null'> 
           REGFUND,
        </if>
        <if test='POSTCODE!= null'> 
           POSTCODE,
        </if>
        <if test='TEL!= null'> 
           TEL,
        </if>
        <if test='FAX!= null'> 
           FAX,
        </if>
        <if test='WWW!= null'> 
           WWW,
        </if>
        <if test='REGDATE!= null'> 
           REGDATE,
        </if>
        <if test='GTYPE!= null'> 
           GTYPE,
        </if>
        <if test='RECDATE!= null'> 
           RECDATE,
        </if>
        <if test='BUID!= null'> 
           BUID,
        </if>
        <if test='BUNAME!= null'> 
           BUNAME,
        </if>
        <if test='MODDATE!= null'> 
           MODDATE,
        </if>
        <if test='MEMO!= null'> 
           MEMO
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
        <if test='VCODE!= null'> 
           #{VCODE,jdbcType=varchar}，
        </if>
        <if test='VNAME!= null'> 
           #{VNAME,jdbcType=varchar}，
        </if>
        <if test='OFFADDR!= null'> 
           #{OFFADDR,jdbcType=varchar}，
        </if>
        <if test='REGADDR!= null'> 
           #{REGADDR,jdbcType=varchar}，
        </if>
        <if test='STATUS1!= null'> 
           #{STATUS1,jdbcType=varchar}，
        </if>
        <if test='BANK!= null'> 
           #{BANK,jdbcType=varchar}，
        </if>
        <if test='ACCOUNT!= null'> 
           #{ACCOUNT,jdbcType=varchar}，
        </if>
        <if test='TAXNO!= null'> 
           #{TAXNO,jdbcType=varchar}，
        </if>
        <if test='CATTRIBUTE!= null'> 
           #{CATTRIBUTE,jdbcType=varchar}，
        </if>
        <if test='CREDIT!= null'> 
           #{CREDIT,jdbcType=varchar}，
        </if>
        <if test='LIMITRANGE!= null'> 
           #{LIMITRANGE,jdbcType=decimal}，
        </if>
        <if test='REGFUND!= null'> 
           #{REGFUND,jdbcType=decimal}，
        </if>
        <if test='POSTCODE!= null'> 
           #{POSTCODE,jdbcType=varchar}，
        </if>
        <if test='TEL!= null'> 
           #{TEL,jdbcType=varchar}，
        </if>
        <if test='FAX!= null'> 
           #{FAX,jdbcType=varchar}，
        </if>
        <if test='WWW!= null'> 
           #{WWW,jdbcType=varchar}，
        </if>
        <if test='REGDATE!= null'> 
           #{REGDATE,jdbcType=datetime}，
        </if>
        <if test='GTYPE!= null'> 
           #{GTYPE,jdbcType=varchar}，
        </if>
        <if test='RECDATE!= null'> 
           #{RECDATE,jdbcType=datetime}，
        </if>
        <if test='BUID!= null'> 
           #{BUID,jdbcType=varchar}，
        </if>
        <if test='BUNAME!= null'> 
           #{BUNAME,jdbcType=varchar}，
        </if>
        <if test='MODDATE!= null'> 
           #{MODDATE,jdbcType=datetime}，
        </if>
        <if test='MEMO!= null'> 
           #{MEMO,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:bo_ss_vendor_dto):Unit
                


@Delete("DELETE FROM bo_ss_vendor WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE bo_ss_vendor SET
        ID=#{ID,jdbcType=String},
        ORGID=#{ORGID,jdbcType=String},
        BINDID=#{BINDID,jdbcType=String},
        CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp},
        UPDATEUSER=#{UPDATEUSER,jdbcType=String},
        PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},
        ISEND=#{ISEND,jdbcType=Integer},
        VCODE=#{VCODE,jdbcType=String},
        VNAME=#{VNAME,jdbcType=String},
        OFFADDR=#{OFFADDR,jdbcType=String},
        REGADDR=#{REGADDR,jdbcType=String},
        STATUS1=#{STATUS1,jdbcType=String},
        BANK=#{BANK,jdbcType=String},
        ACCOUNT=#{ACCOUNT,jdbcType=String},
        TAXNO=#{TAXNO,jdbcType=String},
        CATTRIBUTE=#{CATTRIBUTE,jdbcType=String},
        CREDIT=#{CREDIT,jdbcType=String},
        LIMITRANGE=#{LIMITRANGE,jdbcType=BigDecimal},
        REGFUND=#{REGFUND,jdbcType=BigDecimal},
        POSTCODE=#{POSTCODE,jdbcType=String},
        TEL=#{TEL,jdbcType=String},
        FAX=#{FAX,jdbcType=String},
        WWW=#{WWW,jdbcType=String},
        REGDATE=#{REGDATE,jdbcType=Timestamp},
        GTYPE=#{GTYPE,jdbcType=String},
        RECDATE=#{RECDATE,jdbcType=Timestamp},
        BUID=#{BUID,jdbcType=String},
        BUNAME=#{BUNAME,jdbcType=String},
        MODDATE=#{MODDATE,jdbcType=Timestamp},
        MEMO=#{MEMO,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:bo_ss_vendor_dto)
        

@Update("""<script>
            UPDATE bo_ss_vendor SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="ORGID != null">  ORGID=#{ORGID,jdbcType=String},</if>
        <if test="BINDID != null">  BINDID=#{BINDID,jdbcType=String},</if>
        <if test="CREATEDATE != null">  CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="UPDATEDATE != null">  UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp},</if>
        <if test="UPDATEUSER != null">  UPDATEUSER=#{UPDATEUSER,jdbcType=String},</if>
        <if test="PROCESSDEFID != null">  PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},</if>
        <if test="ISEND != null">  ISEND=#{ISEND,jdbcType=Integer},</if>
        <if test="VCODE != null">  VCODE=#{VCODE,jdbcType=String},</if>
        <if test="VNAME != null">  VNAME=#{VNAME,jdbcType=String},</if>
        <if test="OFFADDR != null">  OFFADDR=#{OFFADDR,jdbcType=String},</if>
        <if test="REGADDR != null">  REGADDR=#{REGADDR,jdbcType=String},</if>
        <if test="STATUS1 != null">  STATUS1=#{STATUS1,jdbcType=String},</if>
        <if test="BANK != null">  BANK=#{BANK,jdbcType=String},</if>
        <if test="ACCOUNT != null">  ACCOUNT=#{ACCOUNT,jdbcType=String},</if>
        <if test="TAXNO != null">  TAXNO=#{TAXNO,jdbcType=String},</if>
        <if test="CATTRIBUTE != null">  CATTRIBUTE=#{CATTRIBUTE,jdbcType=String},</if>
        <if test="CREDIT != null">  CREDIT=#{CREDIT,jdbcType=String},</if>
        <if test="LIMITRANGE != null">  LIMITRANGE=#{LIMITRANGE,jdbcType=BigDecimal},</if>
        <if test="REGFUND != null">  REGFUND=#{REGFUND,jdbcType=BigDecimal},</if>
        <if test="POSTCODE != null">  POSTCODE=#{POSTCODE,jdbcType=String},</if>
        <if test="TEL != null">  TEL=#{TEL,jdbcType=String},</if>
        <if test="FAX != null">  FAX=#{FAX,jdbcType=String},</if>
        <if test="WWW != null">  WWW=#{WWW,jdbcType=String},</if>
        <if test="REGDATE != null">  REGDATE=#{REGDATE,jdbcType=Timestamp},</if>
        <if test="GTYPE != null">  GTYPE=#{GTYPE,jdbcType=String},</if>
        <if test="RECDATE != null">  RECDATE=#{RECDATE,jdbcType=Timestamp},</if>
        <if test="BUID != null">  BUID=#{BUID,jdbcType=String},</if>
        <if test="BUNAME != null">  BUNAME=#{BUNAME,jdbcType=String},</if>
        <if test="MODDATE != null">  MODDATE=#{MODDATE,jdbcType=Timestamp},</if>
        <if test="MEMO != null">  MEMO=#{MEMO,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:bo_ss_vendor_dto)
            

}

        
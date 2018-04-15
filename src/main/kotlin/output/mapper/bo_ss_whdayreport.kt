

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_ss_whdayreport{


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
   Result(property = "BIZDATE", column = "BIZDATE"),
   Result(property = "WHID", column = "WHID"),
   Result(property = "DPTID1", column = "DPTID1"),
   Result(property = "COMID", column = "COMID"),
   Result(property = "UNITID", column = "UNITID"),
   Result(property = "BUID", column = "BUID"),
   Result(property = "GOODSID", column = "GOODSID"),
   Result(property = "NO", column = "NO"),
   Result(property = "BILLTYPE", column = "BILLTYPE"),
   Result(property = "BIZTYPE", column = "BIZTYPE"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "QUANIN", column = "QUANIN"),
   Result(property = "QUANOUT", column = "QUANOUT"),
   Result(property = "PRICE", column = "PRICE"),
   Result(property = "AMOUNT", column = "AMOUNT"),
   Result(property = "BIZTYPEID", column = "BIZTYPEID")
)
@Select("""<script>
   SELECT * FROM bo_ss_whdayreport
</script>""")
fun GetListAll():ArrayList<bo_ss_whdayreport_dto>
        


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
   Result(property = "BIZDATE", column = "BIZDATE"),
   Result(property = "WHID", column = "WHID"),
   Result(property = "DPTID1", column = "DPTID1"),
   Result(property = "COMID", column = "COMID"),
   Result(property = "UNITID", column = "UNITID"),
   Result(property = "BUID", column = "BUID"),
   Result(property = "GOODSID", column = "GOODSID"),
   Result(property = "NO", column = "NO"),
   Result(property = "BILLTYPE", column = "BILLTYPE"),
   Result(property = "BIZTYPE", column = "BIZTYPE"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "QUANIN", column = "QUANIN"),
   Result(property = "QUANOUT", column = "QUANOUT"),
   Result(property = "PRICE", column = "PRICE"),
   Result(property = "AMOUNT", column = "AMOUNT"),
   Result(property = "BIZTYPEID", column = "BIZTYPEID")
)
@Select("""<script>
   SELECT * FROM bo_ss_whdayreport
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
   <if test="BIZDATE!=null">
      BIZDATE=#{BIZDATE}
   </if> 
   <if test="WHID!=null">
      WHID=#{WHID}
   </if> 
   <if test="DPTID1!=null">
      DPTID1=#{DPTID1}
   </if> 
   <if test="COMID!=null">
      COMID=#{COMID}
   </if> 
   <if test="UNITID!=null">
      UNITID=#{UNITID}
   </if> 
   <if test="BUID!=null">
      BUID=#{BUID}
   </if> 
   <if test="GOODSID!=null">
      GOODSID=#{GOODSID}
   </if> 
   <if test="NO!=null">
      NO=#{NO}
   </if> 
   <if test="BILLTYPE!=null">
      BILLTYPE=#{BILLTYPE}
   </if> 
   <if test="BIZTYPE!=null">
      BIZTYPE=#{BIZTYPE}
   </if> 
   <if test="MEMO!=null">
      MEMO=#{MEMO}
   </if> 
   <if test="QUANIN!=null">
      QUANIN=#{QUANIN}
   </if> 
   <if test="QUANOUT!=null">
      QUANOUT=#{QUANOUT}
   </if> 
   <if test="PRICE!=null">
      PRICE=#{PRICE}
   </if> 
   <if test="AMOUNT!=null">
      AMOUNT=#{AMOUNT}
   </if> 
   <if test="BIZTYPEID!=null">
      BIZTYPEID=#{BIZTYPEID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:bo_ss_whdayreport_dto):ArrayList<bo_ss_whdayreport_dto>
                


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
   Result(property = "BIZDATE", column = "BIZDATE"),
   Result(property = "WHID", column = "WHID"),
   Result(property = "DPTID1", column = "DPTID1"),
   Result(property = "COMID", column = "COMID"),
   Result(property = "UNITID", column = "UNITID"),
   Result(property = "BUID", column = "BUID"),
   Result(property = "GOODSID", column = "GOODSID"),
   Result(property = "NO", column = "NO"),
   Result(property = "BILLTYPE", column = "BILLTYPE"),
   Result(property = "BIZTYPE", column = "BIZTYPE"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "QUANIN", column = "QUANIN"),
   Result(property = "QUANOUT", column = "QUANOUT"),
   Result(property = "PRICE", column = "PRICE"),
   Result(property = "AMOUNT", column = "AMOUNT"),
   Result(property = "BIZTYPEID", column = "BIZTYPEID")
)
@Select("""<script>
   SELECT * FROM bo_ss_whdayreport
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:bo_ss_whdayreport_dto):bo_ss_whdayreport_dto?
                


@Insert("""<script>
    insert into bo_ss_whdayreport
    (ID,ORGID,BINDID,CREATEDATE,CREATEUSER,UPDATEDATE,UPDATEUSER,PROCESSDEFID,ISEND,BIZDATE,WHID,DPTID1,COMID,UNITID,BUID,GOODSID,NO,BILLTYPE,BIZTYPE,MEMO,QUANIN,QUANOUT,PRICE,AMOUNT,BIZTYPEID)
    values
    (#{ID},#{ORGID},#{BINDID},#{CREATEDATE},#{CREATEUSER},#{UPDATEDATE},#{UPDATEUSER},#{PROCESSDEFID},#{ISEND},#{BIZDATE},#{WHID},#{DPTID1},#{COMID},#{UNITID},#{BUID},#{GOODSID},#{NO},#{BILLTYPE},#{BIZTYPE},#{MEMO},#{QUANIN},#{QUANOUT},#{PRICE},#{AMOUNT},#{BIZTYPEID})
</script>""")
fun Insert(model:bo_ss_whdayreport_dto):Unit
                


@Insert("""<script>
    insert into bo_ss_whdayreport
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
        <if test='BIZDATE!= null'> 
           BIZDATE,
        </if>
        <if test='WHID!= null'> 
           WHID,
        </if>
        <if test='DPTID1!= null'> 
           DPTID1,
        </if>
        <if test='COMID!= null'> 
           COMID,
        </if>
        <if test='UNITID!= null'> 
           UNITID,
        </if>
        <if test='BUID!= null'> 
           BUID,
        </if>
        <if test='GOODSID!= null'> 
           GOODSID,
        </if>
        <if test='NO!= null'> 
           NO,
        </if>
        <if test='BILLTYPE!= null'> 
           BILLTYPE,
        </if>
        <if test='BIZTYPE!= null'> 
           BIZTYPE,
        </if>
        <if test='MEMO!= null'> 
           MEMO,
        </if>
        <if test='QUANIN!= null'> 
           QUANIN,
        </if>
        <if test='QUANOUT!= null'> 
           QUANOUT,
        </if>
        <if test='PRICE!= null'> 
           PRICE,
        </if>
        <if test='AMOUNT!= null'> 
           AMOUNT,
        </if>
        <if test='BIZTYPEID!= null'> 
           BIZTYPEID
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
        <if test='BIZDATE!= null'> 
           #{BIZDATE,jdbcType=datetime}，
        </if>
        <if test='WHID!= null'> 
           #{WHID,jdbcType=varchar}，
        </if>
        <if test='DPTID1!= null'> 
           #{DPTID1,jdbcType=varchar}，
        </if>
        <if test='COMID!= null'> 
           #{COMID,jdbcType=varchar}，
        </if>
        <if test='UNITID!= null'> 
           #{UNITID,jdbcType=varchar}，
        </if>
        <if test='BUID!= null'> 
           #{BUID,jdbcType=varchar}，
        </if>
        <if test='GOODSID!= null'> 
           #{GOODSID,jdbcType=varchar}，
        </if>
        <if test='NO!= null'> 
           #{NO,jdbcType=varchar}，
        </if>
        <if test='BILLTYPE!= null'> 
           #{BILLTYPE,jdbcType=varchar}，
        </if>
        <if test='BIZTYPE!= null'> 
           #{BIZTYPE,jdbcType=varchar}，
        </if>
        <if test='MEMO!= null'> 
           #{MEMO,jdbcType=varchar}，
        </if>
        <if test='QUANIN!= null'> 
           #{QUANIN,jdbcType=decimal}，
        </if>
        <if test='QUANOUT!= null'> 
           #{QUANOUT,jdbcType=decimal}，
        </if>
        <if test='PRICE!= null'> 
           #{PRICE,jdbcType=decimal}，
        </if>
        <if test='AMOUNT!= null'> 
           #{AMOUNT,jdbcType=decimal}，
        </if>
        <if test='BIZTYPEID!= null'> 
           #{BIZTYPEID,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:bo_ss_whdayreport_dto):Unit
                


@Delete("DELETE FROM bo_ss_whdayreport WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE bo_ss_whdayreport SET
        ID=#{ID,jdbcType=String},
        ORGID=#{ORGID,jdbcType=String},
        BINDID=#{BINDID,jdbcType=String},
        CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp},
        UPDATEUSER=#{UPDATEUSER,jdbcType=String},
        PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},
        ISEND=#{ISEND,jdbcType=Integer},
        BIZDATE=#{BIZDATE,jdbcType=Timestamp},
        WHID=#{WHID,jdbcType=String},
        DPTID1=#{DPTID1,jdbcType=String},
        COMID=#{COMID,jdbcType=String},
        UNITID=#{UNITID,jdbcType=String},
        BUID=#{BUID,jdbcType=String},
        GOODSID=#{GOODSID,jdbcType=String},
        NO=#{NO,jdbcType=String},
        BILLTYPE=#{BILLTYPE,jdbcType=String},
        BIZTYPE=#{BIZTYPE,jdbcType=String},
        MEMO=#{MEMO,jdbcType=String},
        QUANIN=#{QUANIN,jdbcType=BigDecimal},
        QUANOUT=#{QUANOUT,jdbcType=BigDecimal},
        PRICE=#{PRICE,jdbcType=BigDecimal},
        AMOUNT=#{AMOUNT,jdbcType=BigDecimal},
        BIZTYPEID=#{BIZTYPEID,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:bo_ss_whdayreport_dto)
        

@Update("""<script>
            UPDATE bo_ss_whdayreport SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="ORGID != null">  ORGID=#{ORGID,jdbcType=String},</if>
        <if test="BINDID != null">  BINDID=#{BINDID,jdbcType=String},</if>
        <if test="CREATEDATE != null">  CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="UPDATEDATE != null">  UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp},</if>
        <if test="UPDATEUSER != null">  UPDATEUSER=#{UPDATEUSER,jdbcType=String},</if>
        <if test="PROCESSDEFID != null">  PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},</if>
        <if test="ISEND != null">  ISEND=#{ISEND,jdbcType=Integer},</if>
        <if test="BIZDATE != null">  BIZDATE=#{BIZDATE,jdbcType=Timestamp},</if>
        <if test="WHID != null">  WHID=#{WHID,jdbcType=String},</if>
        <if test="DPTID1 != null">  DPTID1=#{DPTID1,jdbcType=String},</if>
        <if test="COMID != null">  COMID=#{COMID,jdbcType=String},</if>
        <if test="UNITID != null">  UNITID=#{UNITID,jdbcType=String},</if>
        <if test="BUID != null">  BUID=#{BUID,jdbcType=String},</if>
        <if test="GOODSID != null">  GOODSID=#{GOODSID,jdbcType=String},</if>
        <if test="NO != null">  NO=#{NO,jdbcType=String},</if>
        <if test="BILLTYPE != null">  BILLTYPE=#{BILLTYPE,jdbcType=String},</if>
        <if test="BIZTYPE != null">  BIZTYPE=#{BIZTYPE,jdbcType=String},</if>
        <if test="MEMO != null">  MEMO=#{MEMO,jdbcType=String},</if>
        <if test="QUANIN != null">  QUANIN=#{QUANIN,jdbcType=BigDecimal},</if>
        <if test="QUANOUT != null">  QUANOUT=#{QUANOUT,jdbcType=BigDecimal},</if>
        <if test="PRICE != null">  PRICE=#{PRICE,jdbcType=BigDecimal},</if>
        <if test="AMOUNT != null">  AMOUNT=#{AMOUNT,jdbcType=BigDecimal},</if>
        <if test="BIZTYPEID != null">  BIZTYPEID=#{BIZTYPEID,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:bo_ss_whdayreport_dto)
            

}

        
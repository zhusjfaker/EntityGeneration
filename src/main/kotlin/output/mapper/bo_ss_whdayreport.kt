

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
    insert into TStudent
    (ID,ORGID,BINDID,CREATEDATE,CREATEUSER,UPDATEDATE,UPDATEUSER,PROCESSDEFID,ISEND,BIZDATE,WHID,DPTID1,COMID,UNITID,BUID,GOODSID,NO,BILLTYPE,BIZTYPE,MEMO,QUANIN,QUANOUT,PRICE,AMOUNT,BIZTYPEID)
    values
    (#{ID},#{ORGID},#{BINDID},#{CREATEDATE},#{CREATEUSER},#{UPDATEDATE},#{UPDATEUSER},#{PROCESSDEFID},#{ISEND},#{BIZDATE},#{WHID},#{DPTID1},#{COMID},#{UNITID},#{BUID},#{GOODSID},#{NO},#{BILLTYPE},#{BIZTYPE},#{MEMO},#{QUANIN},#{QUANOUT},#{PRICE},#{AMOUNT},#{BIZTYPEID})
</script>""")
fun insert(model:bo_ss_whdayreport_dto):Unit
                

}

        
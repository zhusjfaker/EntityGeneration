

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_ss_gatitem{


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
   Result(property = "COMID", column = "COMID"),
   Result(property = "BIZDATE", column = "BIZDATE"),
   Result(property = "DPTID1", column = "DPTID1"),
   Result(property = "UNITID", column = "UNITID"),
   Result(property = "BUID", column = "BUID"),
   Result(property = "BILLTYPE", column = "BILLTYPE"),
   Result(property = "BIZTYPE", column = "BIZTYPE"),
   Result(property = "NO", column = "NO"),
   Result(property = "BAMOUNT", column = "BAMOUNT"),
   Result(property = "FAMOUNT", column = "FAMOUNT"),
   Result(property = "MEMO", column = "MEMO")
)
@Select("""<script>
   SELECT * FROM bo_ss_gatitem
</script>""")
fun GetListAll():ArrayList<bo_ss_gatitem_dto>
        


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
   Result(property = "COMID", column = "COMID"),
   Result(property = "BIZDATE", column = "BIZDATE"),
   Result(property = "DPTID1", column = "DPTID1"),
   Result(property = "UNITID", column = "UNITID"),
   Result(property = "BUID", column = "BUID"),
   Result(property = "BILLTYPE", column = "BILLTYPE"),
   Result(property = "BIZTYPE", column = "BIZTYPE"),
   Result(property = "NO", column = "NO"),
   Result(property = "BAMOUNT", column = "BAMOUNT"),
   Result(property = "FAMOUNT", column = "FAMOUNT"),
   Result(property = "MEMO", column = "MEMO")
)
@Select("""<script>
   SELECT * FROM bo_ss_gatitem
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
   <if test="COMID!=null">
      COMID=#{COMID}
   </if> 
   <if test="BIZDATE!=null">
      BIZDATE=#{BIZDATE}
   </if> 
   <if test="DPTID1!=null">
      DPTID1=#{DPTID1}
   </if> 
   <if test="UNITID!=null">
      UNITID=#{UNITID}
   </if> 
   <if test="BUID!=null">
      BUID=#{BUID}
   </if> 
   <if test="BILLTYPE!=null">
      BILLTYPE=#{BILLTYPE}
   </if> 
   <if test="BIZTYPE!=null">
      BIZTYPE=#{BIZTYPE}
   </if> 
   <if test="NO!=null">
      NO=#{NO}
   </if> 
   <if test="BAMOUNT!=null">
      BAMOUNT=#{BAMOUNT}
   </if> 
   <if test="FAMOUNT!=null">
      FAMOUNT=#{FAMOUNT}
   </if> 
   <if test="MEMO!=null">
      MEMO=#{MEMO}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:bo_ss_gatitem_dto):ArrayList<bo_ss_gatitem_dto>
                


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
   Result(property = "COMID", column = "COMID"),
   Result(property = "BIZDATE", column = "BIZDATE"),
   Result(property = "DPTID1", column = "DPTID1"),
   Result(property = "UNITID", column = "UNITID"),
   Result(property = "BUID", column = "BUID"),
   Result(property = "BILLTYPE", column = "BILLTYPE"),
   Result(property = "BIZTYPE", column = "BIZTYPE"),
   Result(property = "NO", column = "NO"),
   Result(property = "BAMOUNT", column = "BAMOUNT"),
   Result(property = "FAMOUNT", column = "FAMOUNT"),
   Result(property = "MEMO", column = "MEMO")
)
@Select("""<script>
   SELECT * FROM bo_ss_gatitem
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:bo_ss_gatitem_dto):bo_ss_gatitem_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,ORGID,BINDID,CREATEDATE,CREATEUSER,UPDATEDATE,UPDATEUSER,PROCESSDEFID,ISEND,COMID,BIZDATE,DPTID1,UNITID,BUID,BILLTYPE,BIZTYPE,NO,BAMOUNT,FAMOUNT,MEMO)
    values
    (#{ID},#{ORGID},#{BINDID},#{CREATEDATE},#{CREATEUSER},#{UPDATEDATE},#{UPDATEUSER},#{PROCESSDEFID},#{ISEND},#{COMID},#{BIZDATE},#{DPTID1},#{UNITID},#{BUID},#{BILLTYPE},#{BIZTYPE},#{NO},#{BAMOUNT},#{FAMOUNT},#{MEMO})
</script>""")
fun insert(model:bo_ss_gatitem_dto):Unit
                

}

        
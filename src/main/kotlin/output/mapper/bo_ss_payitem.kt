

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_ss_payitem{


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
   SELECT * FROM bo_ss_payitem
</script>""")
fun GetListAll():ArrayList<bo_ss_payitem_dto>
        


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
   SELECT * FROM bo_ss_payitem
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
fun ConditionalQuery(model:bo_ss_payitem_dto):ArrayList<bo_ss_payitem_dto>
                


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
   SELECT * FROM bo_ss_payitem
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:bo_ss_payitem_dto):bo_ss_payitem_dto?
                


@Insert("""<script>
    insert into bo_ss_payitem
    (ID,ORGID,BINDID,CREATEDATE,CREATEUSER,UPDATEDATE,UPDATEUSER,PROCESSDEFID,ISEND,COMID,BIZDATE,DPTID1,UNITID,BUID,BILLTYPE,BIZTYPE,NO,BAMOUNT,FAMOUNT,MEMO)
    values
    (#{ID},#{ORGID},#{BINDID},#{CREATEDATE},#{CREATEUSER},#{UPDATEDATE},#{UPDATEUSER},#{PROCESSDEFID},#{ISEND},#{COMID},#{BIZDATE},#{DPTID1},#{UNITID},#{BUID},#{BILLTYPE},#{BIZTYPE},#{NO},#{BAMOUNT},#{FAMOUNT},#{MEMO})
</script>""")
fun Insert(model:bo_ss_payitem_dto):Unit
                


@Insert("""<script>
    insert into bo_ss_payitem
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
        <if test='COMID!= null'> 
           COMID,
        </if>
        <if test='BIZDATE!= null'> 
           BIZDATE,
        </if>
        <if test='DPTID1!= null'> 
           DPTID1,
        </if>
        <if test='UNITID!= null'> 
           UNITID,
        </if>
        <if test='BUID!= null'> 
           BUID,
        </if>
        <if test='BILLTYPE!= null'> 
           BILLTYPE,
        </if>
        <if test='BIZTYPE!= null'> 
           BIZTYPE,
        </if>
        <if test='NO!= null'> 
           NO,
        </if>
        <if test='BAMOUNT!= null'> 
           BAMOUNT,
        </if>
        <if test='FAMOUNT!= null'> 
           FAMOUNT,
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
        <if test='COMID!= null'> 
           #{COMID,jdbcType=varchar}，
        </if>
        <if test='BIZDATE!= null'> 
           #{BIZDATE,jdbcType=datetime}，
        </if>
        <if test='DPTID1!= null'> 
           #{DPTID1,jdbcType=varchar}，
        </if>
        <if test='UNITID!= null'> 
           #{UNITID,jdbcType=varchar}，
        </if>
        <if test='BUID!= null'> 
           #{BUID,jdbcType=varchar}，
        </if>
        <if test='BILLTYPE!= null'> 
           #{BILLTYPE,jdbcType=varchar}，
        </if>
        <if test='BIZTYPE!= null'> 
           #{BIZTYPE,jdbcType=varchar}，
        </if>
        <if test='NO!= null'> 
           #{NO,jdbcType=varchar}，
        </if>
        <if test='BAMOUNT!= null'> 
           #{BAMOUNT,jdbcType=decimal}，
        </if>
        <if test='FAMOUNT!= null'> 
           #{FAMOUNT,jdbcType=decimal}，
        </if>
        <if test='MEMO!= null'> 
           #{MEMO,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:bo_ss_payitem_dto):Unit
                

}

        
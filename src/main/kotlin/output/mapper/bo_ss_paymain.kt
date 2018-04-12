

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
    insert into TStudent
    (ID,ORGID,BINDID,CREATEDATE,CREATEUSER,UPDATEDATE,UPDATEUSER,PROCESSDEFID,ISEND,UNITID,UCODE,UNAME,CURAMOUNT)
    values
    (#{ID},#{ORGID},#{BINDID},#{CREATEDATE},#{CREATEUSER},#{UPDATEDATE},#{UPDATEUSER},#{PROCESSDEFID},#{ISEND},#{UNITID},#{UCODE},#{UNAME},#{CURAMOUNT})
</script>""")
fun insert(model:bo_ss_paymain_dto):Unit
                

}

        


package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_ss_whgoods{


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
   Result(property = "WHID", column = "WHID"),
   Result(property = "GOODSID", column = "GOODSID"),
   Result(property = "QUANTRA", column = "QUANTRA"),
   Result(property = "QUAN", column = "QUAN"),
   Result(property = "PRICE", column = "PRICE"),
   Result(property = "AMOUNT", column = "AMOUNT"),
   Result(property = "COMID", column = "COMID")
)
@Select("""<script>
   SELECT * FROM bo_ss_whgoods
</script>""")
fun GetListAll():ArrayList<bo_ss_whgoods_dto>
        


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
   Result(property = "WHID", column = "WHID"),
   Result(property = "GOODSID", column = "GOODSID"),
   Result(property = "QUANTRA", column = "QUANTRA"),
   Result(property = "QUAN", column = "QUAN"),
   Result(property = "PRICE", column = "PRICE"),
   Result(property = "AMOUNT", column = "AMOUNT"),
   Result(property = "COMID", column = "COMID")
)
@Select("""<script>
   SELECT * FROM bo_ss_whgoods
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
   <if test="WHID!=null">
      WHID=#{WHID}
   </if> 
   <if test="GOODSID!=null">
      GOODSID=#{GOODSID}
   </if> 
   <if test="QUANTRA!=null">
      QUANTRA=#{QUANTRA}
   </if> 
   <if test="QUAN!=null">
      QUAN=#{QUAN}
   </if> 
   <if test="PRICE!=null">
      PRICE=#{PRICE}
   </if> 
   <if test="AMOUNT!=null">
      AMOUNT=#{AMOUNT}
   </if> 
   <if test="COMID!=null">
      COMID=#{COMID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:bo_ss_whgoods_dto):ArrayList<bo_ss_whgoods_dto>
                


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
   Result(property = "WHID", column = "WHID"),
   Result(property = "GOODSID", column = "GOODSID"),
   Result(property = "QUANTRA", column = "QUANTRA"),
   Result(property = "QUAN", column = "QUAN"),
   Result(property = "PRICE", column = "PRICE"),
   Result(property = "AMOUNT", column = "AMOUNT"),
   Result(property = "COMID", column = "COMID")
)
@Select("""<script>
   SELECT * FROM bo_ss_whgoods
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:bo_ss_whgoods_dto):bo_ss_whgoods_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,ORGID,BINDID,CREATEDATE,CREATEUSER,UPDATEDATE,UPDATEUSER,PROCESSDEFID,ISEND,WHID,GOODSID,QUANTRA,QUAN,PRICE,AMOUNT,COMID)
    values
    (#{ID},#{ORGID},#{BINDID},#{CREATEDATE},#{CREATEUSER},#{UPDATEDATE},#{UPDATEUSER},#{PROCESSDEFID},#{ISEND},#{WHID},#{GOODSID},#{QUANTRA},#{QUAN},#{PRICE},#{AMOUNT},#{COMID})
</script>""")
fun insert(model:bo_ss_whgoods_dto):Unit
                

}

        
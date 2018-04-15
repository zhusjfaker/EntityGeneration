

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
    insert into bo_ss_whgoods
    (ID,ORGID,BINDID,CREATEDATE,CREATEUSER,UPDATEDATE,UPDATEUSER,PROCESSDEFID,ISEND,WHID,GOODSID,QUANTRA,QUAN,PRICE,AMOUNT,COMID)
    values
    (#{ID},#{ORGID},#{BINDID},#{CREATEDATE},#{CREATEUSER},#{UPDATEDATE},#{UPDATEUSER},#{PROCESSDEFID},#{ISEND},#{WHID},#{GOODSID},#{QUANTRA},#{QUAN},#{PRICE},#{AMOUNT},#{COMID})
</script>""")
fun Insert(model:bo_ss_whgoods_dto):Unit
                


@Insert("""<script>
    insert into bo_ss_whgoods
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
        <if test='WHID!= null'> 
           WHID,
        </if>
        <if test='GOODSID!= null'> 
           GOODSID,
        </if>
        <if test='QUANTRA!= null'> 
           QUANTRA,
        </if>
        <if test='QUAN!= null'> 
           QUAN,
        </if>
        <if test='PRICE!= null'> 
           PRICE,
        </if>
        <if test='AMOUNT!= null'> 
           AMOUNT,
        </if>
        <if test='COMID!= null'> 
           COMID
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
        <if test='WHID!= null'> 
           #{WHID,jdbcType=varchar}，
        </if>
        <if test='GOODSID!= null'> 
           #{GOODSID,jdbcType=varchar}，
        </if>
        <if test='QUANTRA!= null'> 
           #{QUANTRA,jdbcType=decimal}，
        </if>
        <if test='QUAN!= null'> 
           #{QUAN,jdbcType=decimal}，
        </if>
        <if test='PRICE!= null'> 
           #{PRICE,jdbcType=decimal}，
        </if>
        <if test='AMOUNT!= null'> 
           #{AMOUNT,jdbcType=decimal}，
        </if>
        <if test='COMID!= null'> 
           #{COMID,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:bo_ss_whgoods_dto):Unit
                


@Delete("DELETE FROM bo_ss_whgoods WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE bo_ss_whgoods SET
        ID=#{ID,jdbcType=String},
        ORGID=#{ORGID,jdbcType=String},
        BINDID=#{BINDID,jdbcType=String},
        CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp},
        UPDATEUSER=#{UPDATEUSER,jdbcType=String},
        PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},
        ISEND=#{ISEND,jdbcType=Integer},
        WHID=#{WHID,jdbcType=String},
        GOODSID=#{GOODSID,jdbcType=String},
        QUANTRA=#{QUANTRA,jdbcType=BigDecimal},
        QUAN=#{QUAN,jdbcType=BigDecimal},
        PRICE=#{PRICE,jdbcType=BigDecimal},
        AMOUNT=#{AMOUNT,jdbcType=BigDecimal},
        COMID=#{COMID,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:bo_ss_whgoods_dto)
        

@Update("""<script>
            UPDATE bo_ss_whgoods SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="ORGID != null">  ORGID=#{ORGID,jdbcType=String},</if>
        <if test="BINDID != null">  BINDID=#{BINDID,jdbcType=String},</if>
        <if test="CREATEDATE != null">  CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="UPDATEDATE != null">  UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp},</if>
        <if test="UPDATEUSER != null">  UPDATEUSER=#{UPDATEUSER,jdbcType=String},</if>
        <if test="PROCESSDEFID != null">  PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},</if>
        <if test="ISEND != null">  ISEND=#{ISEND,jdbcType=Integer},</if>
        <if test="WHID != null">  WHID=#{WHID,jdbcType=String},</if>
        <if test="GOODSID != null">  GOODSID=#{GOODSID,jdbcType=String},</if>
        <if test="QUANTRA != null">  QUANTRA=#{QUANTRA,jdbcType=BigDecimal},</if>
        <if test="QUAN != null">  QUAN=#{QUAN,jdbcType=BigDecimal},</if>
        <if test="PRICE != null">  PRICE=#{PRICE,jdbcType=BigDecimal},</if>
        <if test="AMOUNT != null">  AMOUNT=#{AMOUNT,jdbcType=BigDecimal},</if>
        <if test="COMID != null">  COMID=#{COMID,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:bo_ss_whgoods_dto)
            

}

        
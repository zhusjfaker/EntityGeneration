

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_ss_warehouse{


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
   Result(property = "WHCODE", column = "WHCODE"),
   Result(property = "WHNAME", column = "WHNAME"),
   Result(property = "ADDR", column = "ADDR"),
   Result(property = "CAPACITY", column = "CAPACITY"),
   Result(property = "PRINCIPAL", column = "PRINCIPAL"),
   Result(property = "STOREMAN", column = "STOREMAN"),
   Result(property = "TEL", column = "TEL"),
   Result(property = "FAX", column = "FAX"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "UPCODE", column = "UPCODE"),
   Result(property = "ISEND1", column = "ISEND1"),
   Result(property = "PARENTID", column = "PARENTID"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "STATUS1", column = "STATUS1"),
   Result(property = "LOSESTORE", column = "LOSESTORE"),
   Result(property = "GTYPE", column = "GTYPE")
)
@Select("""<script>
   SELECT * FROM bo_ss_warehouse
</script>""")
fun GetListAll():ArrayList<bo_ss_warehouse_dto>
        


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
   Result(property = "WHCODE", column = "WHCODE"),
   Result(property = "WHNAME", column = "WHNAME"),
   Result(property = "ADDR", column = "ADDR"),
   Result(property = "CAPACITY", column = "CAPACITY"),
   Result(property = "PRINCIPAL", column = "PRINCIPAL"),
   Result(property = "STOREMAN", column = "STOREMAN"),
   Result(property = "TEL", column = "TEL"),
   Result(property = "FAX", column = "FAX"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "UPCODE", column = "UPCODE"),
   Result(property = "ISEND1", column = "ISEND1"),
   Result(property = "PARENTID", column = "PARENTID"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "STATUS1", column = "STATUS1"),
   Result(property = "LOSESTORE", column = "LOSESTORE"),
   Result(property = "GTYPE", column = "GTYPE")
)
@Select("""<script>
   SELECT * FROM bo_ss_warehouse
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
   <if test="WHCODE!=null">
      WHCODE=#{WHCODE}
   </if> 
   <if test="WHNAME!=null">
      WHNAME=#{WHNAME}
   </if> 
   <if test="ADDR!=null">
      ADDR=#{ADDR}
   </if> 
   <if test="CAPACITY!=null">
      CAPACITY=#{CAPACITY}
   </if> 
   <if test="PRINCIPAL!=null">
      PRINCIPAL=#{PRINCIPAL}
   </if> 
   <if test="STOREMAN!=null">
      STOREMAN=#{STOREMAN}
   </if> 
   <if test="TEL!=null">
      TEL=#{TEL}
   </if> 
   <if test="FAX!=null">
      FAX=#{FAX}
   </if> 
   <if test="MEMO!=null">
      MEMO=#{MEMO}
   </if> 
   <if test="UPCODE!=null">
      UPCODE=#{UPCODE}
   </if> 
   <if test="ISEND1!=null">
      ISEND1=#{ISEND1}
   </if> 
   <if test="PARENTID!=null">
      PARENTID=#{PARENTID}
   </if> 
   <if test="EXT1!=null">
      EXT1=#{EXT1}
   </if> 
   <if test="EXT2!=null">
      EXT2=#{EXT2}
   </if> 
   <if test="EXT3!=null">
      EXT3=#{EXT3}
   </if> 
   <if test="EXT4!=null">
      EXT4=#{EXT4}
   </if> 
   <if test="STATUS1!=null">
      STATUS1=#{STATUS1}
   </if> 
   <if test="LOSESTORE!=null">
      LOSESTORE=#{LOSESTORE}
   </if> 
   <if test="GTYPE!=null">
      GTYPE=#{GTYPE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:bo_ss_warehouse_dto):ArrayList<bo_ss_warehouse_dto>
                


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
   Result(property = "WHCODE", column = "WHCODE"),
   Result(property = "WHNAME", column = "WHNAME"),
   Result(property = "ADDR", column = "ADDR"),
   Result(property = "CAPACITY", column = "CAPACITY"),
   Result(property = "PRINCIPAL", column = "PRINCIPAL"),
   Result(property = "STOREMAN", column = "STOREMAN"),
   Result(property = "TEL", column = "TEL"),
   Result(property = "FAX", column = "FAX"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "UPCODE", column = "UPCODE"),
   Result(property = "ISEND1", column = "ISEND1"),
   Result(property = "PARENTID", column = "PARENTID"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "STATUS1", column = "STATUS1"),
   Result(property = "LOSESTORE", column = "LOSESTORE"),
   Result(property = "GTYPE", column = "GTYPE")
)
@Select("""<script>
   SELECT * FROM bo_ss_warehouse
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:bo_ss_warehouse_dto):bo_ss_warehouse_dto?
                


@Insert("""<script>
    insert into bo_ss_warehouse
    (ID,ORGID,BINDID,CREATEDATE,CREATEUSER,UPDATEDATE,UPDATEUSER,PROCESSDEFID,ISEND,WHCODE,WHNAME,ADDR,CAPACITY,PRINCIPAL,STOREMAN,TEL,FAX,MEMO,UPCODE,ISEND1,PARENTID,EXT1,EXT2,EXT3,EXT4,STATUS1,LOSESTORE,GTYPE)
    values
    (#{ID},#{ORGID},#{BINDID},#{CREATEDATE},#{CREATEUSER},#{UPDATEDATE},#{UPDATEUSER},#{PROCESSDEFID},#{ISEND},#{WHCODE},#{WHNAME},#{ADDR},#{CAPACITY},#{PRINCIPAL},#{STOREMAN},#{TEL},#{FAX},#{MEMO},#{UPCODE},#{ISEND1},#{PARENTID},#{EXT1},#{EXT2},#{EXT3},#{EXT4},#{STATUS1},#{LOSESTORE},#{GTYPE})
</script>""")
fun Insert(model:bo_ss_warehouse_dto):Unit
                


@Insert("""<script>
    insert into bo_ss_warehouse
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
        <if test='WHCODE!= null'> 
           WHCODE,
        </if>
        <if test='WHNAME!= null'> 
           WHNAME,
        </if>
        <if test='ADDR!= null'> 
           ADDR,
        </if>
        <if test='CAPACITY!= null'> 
           CAPACITY,
        </if>
        <if test='PRINCIPAL!= null'> 
           PRINCIPAL,
        </if>
        <if test='STOREMAN!= null'> 
           STOREMAN,
        </if>
        <if test='TEL!= null'> 
           TEL,
        </if>
        <if test='FAX!= null'> 
           FAX,
        </if>
        <if test='MEMO!= null'> 
           MEMO,
        </if>
        <if test='UPCODE!= null'> 
           UPCODE,
        </if>
        <if test='ISEND1!= null'> 
           ISEND1,
        </if>
        <if test='PARENTID!= null'> 
           PARENTID,
        </if>
        <if test='EXT1!= null'> 
           EXT1,
        </if>
        <if test='EXT2!= null'> 
           EXT2,
        </if>
        <if test='EXT3!= null'> 
           EXT3,
        </if>
        <if test='EXT4!= null'> 
           EXT4,
        </if>
        <if test='STATUS1!= null'> 
           STATUS1,
        </if>
        <if test='LOSESTORE!= null'> 
           LOSESTORE,
        </if>
        <if test='GTYPE!= null'> 
           GTYPE
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
        <if test='WHCODE!= null'> 
           #{WHCODE,jdbcType=varchar}，
        </if>
        <if test='WHNAME!= null'> 
           #{WHNAME,jdbcType=varchar}，
        </if>
        <if test='ADDR!= null'> 
           #{ADDR,jdbcType=varchar}，
        </if>
        <if test='CAPACITY!= null'> 
           #{CAPACITY,jdbcType=varchar}，
        </if>
        <if test='PRINCIPAL!= null'> 
           #{PRINCIPAL,jdbcType=varchar}，
        </if>
        <if test='STOREMAN!= null'> 
           #{STOREMAN,jdbcType=varchar}，
        </if>
        <if test='TEL!= null'> 
           #{TEL,jdbcType=varchar}，
        </if>
        <if test='FAX!= null'> 
           #{FAX,jdbcType=varchar}，
        </if>
        <if test='MEMO!= null'> 
           #{MEMO,jdbcType=varchar}，
        </if>
        <if test='UPCODE!= null'> 
           #{UPCODE,jdbcType=varchar}，
        </if>
        <if test='ISEND1!= null'> 
           #{ISEND1,jdbcType=varchar}，
        </if>
        <if test='PARENTID!= null'> 
           #{PARENTID,jdbcType=varchar}，
        </if>
        <if test='EXT1!= null'> 
           #{EXT1,jdbcType=varchar}，
        </if>
        <if test='EXT2!= null'> 
           #{EXT2,jdbcType=varchar}，
        </if>
        <if test='EXT3!= null'> 
           #{EXT3,jdbcType=varchar}，
        </if>
        <if test='EXT4!= null'> 
           #{EXT4,jdbcType=varchar}，
        </if>
        <if test='STATUS1!= null'> 
           #{STATUS1,jdbcType=varchar}，
        </if>
        <if test='LOSESTORE!= null'> 
           #{LOSESTORE,jdbcType=varchar}，
        </if>
        <if test='GTYPE!= null'> 
           #{GTYPE,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:bo_ss_warehouse_dto):Unit
                

}

        
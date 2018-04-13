

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_ss_goods{


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
   Result(property = "GSID", column = "GSID"),
   Result(property = "GSCODE", column = "GSCODE"),
   Result(property = "GSNAME", column = "GSNAME"),
   Result(property = "CODE", column = "CODE"),
   Result(property = "NAME", column = "NAME"),
   Result(property = "SPEC", column = "SPEC"),
   Result(property = "UNIT", column = "UNIT"),
   Result(property = "TAXRATE", column = "TAXRATE"),
   Result(property = "PRICE", column = "PRICE"),
   Result(property = "SPRICE", column = "SPRICE"),
   Result(property = "PADDR", column = "PADDR"),
   Result(property = "TRADEMARK", column = "TRADEMARK"),
   Result(property = "COLOR", column = "COLOR"),
   Result(property = "LAYER", column = "LAYER"),
   Result(property = "MATERIAL", column = "MATERIAL"),
   Result(property = "HIGHSTORAGE", column = "HIGHSTORAGE"),
   Result(property = "LOWSTORAGE", column = "LOWSTORAGE"),
   Result(property = "SAFESTORAGE", column = "SAFESTORAGE"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "STATUS1", column = "STATUS1"),
   Result(property = "ENCL", column = "ENCL"),
   Result(property = "VENDOR", column = "VENDOR"),
   Result(property = "PICTURE", column = "PICTURE"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "BARCODE", column = "BARCODE"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "EXT6", column = "EXT6"),
   Result(property = "EXT7", column = "EXT7"),
   Result(property = "EXT8", column = "EXT8"),
   Result(property = "GTYPE", column = "GTYPE"),
   Result(property = "COSTING", column = "COSTING")
)
@Select("""<script>
   SELECT * FROM bo_ss_goods
</script>""")
fun GetListAll():ArrayList<bo_ss_goods_dto>
        


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
   Result(property = "GSID", column = "GSID"),
   Result(property = "GSCODE", column = "GSCODE"),
   Result(property = "GSNAME", column = "GSNAME"),
   Result(property = "CODE", column = "CODE"),
   Result(property = "NAME", column = "NAME"),
   Result(property = "SPEC", column = "SPEC"),
   Result(property = "UNIT", column = "UNIT"),
   Result(property = "TAXRATE", column = "TAXRATE"),
   Result(property = "PRICE", column = "PRICE"),
   Result(property = "SPRICE", column = "SPRICE"),
   Result(property = "PADDR", column = "PADDR"),
   Result(property = "TRADEMARK", column = "TRADEMARK"),
   Result(property = "COLOR", column = "COLOR"),
   Result(property = "LAYER", column = "LAYER"),
   Result(property = "MATERIAL", column = "MATERIAL"),
   Result(property = "HIGHSTORAGE", column = "HIGHSTORAGE"),
   Result(property = "LOWSTORAGE", column = "LOWSTORAGE"),
   Result(property = "SAFESTORAGE", column = "SAFESTORAGE"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "STATUS1", column = "STATUS1"),
   Result(property = "ENCL", column = "ENCL"),
   Result(property = "VENDOR", column = "VENDOR"),
   Result(property = "PICTURE", column = "PICTURE"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "BARCODE", column = "BARCODE"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "EXT6", column = "EXT6"),
   Result(property = "EXT7", column = "EXT7"),
   Result(property = "EXT8", column = "EXT8"),
   Result(property = "GTYPE", column = "GTYPE"),
   Result(property = "COSTING", column = "COSTING")
)
@Select("""<script>
   SELECT * FROM bo_ss_goods
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
   <if test="GSID!=null">
      GSID=#{GSID}
   </if> 
   <if test="GSCODE!=null">
      GSCODE=#{GSCODE}
   </if> 
   <if test="GSNAME!=null">
      GSNAME=#{GSNAME}
   </if> 
   <if test="CODE!=null">
      CODE=#{CODE}
   </if> 
   <if test="NAME!=null">
      NAME=#{NAME}
   </if> 
   <if test="SPEC!=null">
      SPEC=#{SPEC}
   </if> 
   <if test="UNIT!=null">
      UNIT=#{UNIT}
   </if> 
   <if test="TAXRATE!=null">
      TAXRATE=#{TAXRATE}
   </if> 
   <if test="PRICE!=null">
      PRICE=#{PRICE}
   </if> 
   <if test="SPRICE!=null">
      SPRICE=#{SPRICE}
   </if> 
   <if test="PADDR!=null">
      PADDR=#{PADDR}
   </if> 
   <if test="TRADEMARK!=null">
      TRADEMARK=#{TRADEMARK}
   </if> 
   <if test="COLOR!=null">
      COLOR=#{COLOR}
   </if> 
   <if test="LAYER!=null">
      LAYER=#{LAYER}
   </if> 
   <if test="MATERIAL!=null">
      MATERIAL=#{MATERIAL}
   </if> 
   <if test="HIGHSTORAGE!=null">
      HIGHSTORAGE=#{HIGHSTORAGE}
   </if> 
   <if test="LOWSTORAGE!=null">
      LOWSTORAGE=#{LOWSTORAGE}
   </if> 
   <if test="SAFESTORAGE!=null">
      SAFESTORAGE=#{SAFESTORAGE}
   </if> 
   <if test="MEMO!=null">
      MEMO=#{MEMO}
   </if> 
   <if test="STATUS1!=null">
      STATUS1=#{STATUS1}
   </if> 
   <if test="ENCL!=null">
      ENCL=#{ENCL}
   </if> 
   <if test="VENDOR!=null">
      VENDOR=#{VENDOR}
   </if> 
   <if test="PICTURE!=null">
      PICTURE=#{PICTURE}
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
   <if test="BARCODE!=null">
      BARCODE=#{BARCODE}
   </if> 
   <if test="EXT5!=null">
      EXT5=#{EXT5}
   </if> 
   <if test="EXT6!=null">
      EXT6=#{EXT6}
   </if> 
   <if test="EXT7!=null">
      EXT7=#{EXT7}
   </if> 
   <if test="EXT8!=null">
      EXT8=#{EXT8}
   </if> 
   <if test="GTYPE!=null">
      GTYPE=#{GTYPE}
   </if> 
   <if test="COSTING!=null">
      COSTING=#{COSTING}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:bo_ss_goods_dto):ArrayList<bo_ss_goods_dto>
                


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
   Result(property = "GSID", column = "GSID"),
   Result(property = "GSCODE", column = "GSCODE"),
   Result(property = "GSNAME", column = "GSNAME"),
   Result(property = "CODE", column = "CODE"),
   Result(property = "NAME", column = "NAME"),
   Result(property = "SPEC", column = "SPEC"),
   Result(property = "UNIT", column = "UNIT"),
   Result(property = "TAXRATE", column = "TAXRATE"),
   Result(property = "PRICE", column = "PRICE"),
   Result(property = "SPRICE", column = "SPRICE"),
   Result(property = "PADDR", column = "PADDR"),
   Result(property = "TRADEMARK", column = "TRADEMARK"),
   Result(property = "COLOR", column = "COLOR"),
   Result(property = "LAYER", column = "LAYER"),
   Result(property = "MATERIAL", column = "MATERIAL"),
   Result(property = "HIGHSTORAGE", column = "HIGHSTORAGE"),
   Result(property = "LOWSTORAGE", column = "LOWSTORAGE"),
   Result(property = "SAFESTORAGE", column = "SAFESTORAGE"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "STATUS1", column = "STATUS1"),
   Result(property = "ENCL", column = "ENCL"),
   Result(property = "VENDOR", column = "VENDOR"),
   Result(property = "PICTURE", column = "PICTURE"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "BARCODE", column = "BARCODE"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "EXT6", column = "EXT6"),
   Result(property = "EXT7", column = "EXT7"),
   Result(property = "EXT8", column = "EXT8"),
   Result(property = "GTYPE", column = "GTYPE"),
   Result(property = "COSTING", column = "COSTING")
)
@Select("""<script>
   SELECT * FROM bo_ss_goods
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:bo_ss_goods_dto):bo_ss_goods_dto?
                


@Insert("""<script>
    insert into bo_ss_goods
    (ID,ORGID,BINDID,CREATEDATE,CREATEUSER,UPDATEDATE,UPDATEUSER,PROCESSDEFID,ISEND,GSID,GSCODE,GSNAME,CODE,NAME,SPEC,UNIT,TAXRATE,PRICE,SPRICE,PADDR,TRADEMARK,COLOR,LAYER,MATERIAL,HIGHSTORAGE,LOWSTORAGE,SAFESTORAGE,MEMO,STATUS1,ENCL,VENDOR,PICTURE,EXT1,EXT2,EXT3,EXT4,BARCODE,EXT5,EXT6,EXT7,EXT8,GTYPE,COSTING)
    values
    (#{ID},#{ORGID},#{BINDID},#{CREATEDATE},#{CREATEUSER},#{UPDATEDATE},#{UPDATEUSER},#{PROCESSDEFID},#{ISEND},#{GSID},#{GSCODE},#{GSNAME},#{CODE},#{NAME},#{SPEC},#{UNIT},#{TAXRATE},#{PRICE},#{SPRICE},#{PADDR},#{TRADEMARK},#{COLOR},#{LAYER},#{MATERIAL},#{HIGHSTORAGE},#{LOWSTORAGE},#{SAFESTORAGE},#{MEMO},#{STATUS1},#{ENCL},#{VENDOR},#{PICTURE},#{EXT1},#{EXT2},#{EXT3},#{EXT4},#{BARCODE},#{EXT5},#{EXT6},#{EXT7},#{EXT8},#{GTYPE},#{COSTING})
</script>""")
fun Insert(model:bo_ss_goods_dto):Unit
                


@Insert("""<script>
    insert into bo_ss_goods
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
        <if test='GSID!= null'> 
           GSID,
        </if>
        <if test='GSCODE!= null'> 
           GSCODE,
        </if>
        <if test='GSNAME!= null'> 
           GSNAME,
        </if>
        <if test='CODE!= null'> 
           CODE,
        </if>
        <if test='NAME!= null'> 
           NAME,
        </if>
        <if test='SPEC!= null'> 
           SPEC,
        </if>
        <if test='UNIT!= null'> 
           UNIT,
        </if>
        <if test='TAXRATE!= null'> 
           TAXRATE,
        </if>
        <if test='PRICE!= null'> 
           PRICE,
        </if>
        <if test='SPRICE!= null'> 
           SPRICE,
        </if>
        <if test='PADDR!= null'> 
           PADDR,
        </if>
        <if test='TRADEMARK!= null'> 
           TRADEMARK,
        </if>
        <if test='COLOR!= null'> 
           COLOR,
        </if>
        <if test='LAYER!= null'> 
           LAYER,
        </if>
        <if test='MATERIAL!= null'> 
           MATERIAL,
        </if>
        <if test='HIGHSTORAGE!= null'> 
           HIGHSTORAGE,
        </if>
        <if test='LOWSTORAGE!= null'> 
           LOWSTORAGE,
        </if>
        <if test='SAFESTORAGE!= null'> 
           SAFESTORAGE,
        </if>
        <if test='MEMO!= null'> 
           MEMO,
        </if>
        <if test='STATUS1!= null'> 
           STATUS1,
        </if>
        <if test='ENCL!= null'> 
           ENCL,
        </if>
        <if test='VENDOR!= null'> 
           VENDOR,
        </if>
        <if test='PICTURE!= null'> 
           PICTURE,
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
        <if test='BARCODE!= null'> 
           BARCODE,
        </if>
        <if test='EXT5!= null'> 
           EXT5,
        </if>
        <if test='EXT6!= null'> 
           EXT6,
        </if>
        <if test='EXT7!= null'> 
           EXT7,
        </if>
        <if test='EXT8!= null'> 
           EXT8,
        </if>
        <if test='GTYPE!= null'> 
           GTYPE,
        </if>
        <if test='COSTING!= null'> 
           COSTING
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
        <if test='GSID!= null'> 
           #{GSID,jdbcType=varchar}，
        </if>
        <if test='GSCODE!= null'> 
           #{GSCODE,jdbcType=varchar}，
        </if>
        <if test='GSNAME!= null'> 
           #{GSNAME,jdbcType=varchar}，
        </if>
        <if test='CODE!= null'> 
           #{CODE,jdbcType=varchar}，
        </if>
        <if test='NAME!= null'> 
           #{NAME,jdbcType=varchar}，
        </if>
        <if test='SPEC!= null'> 
           #{SPEC,jdbcType=varchar}，
        </if>
        <if test='UNIT!= null'> 
           #{UNIT,jdbcType=varchar}，
        </if>
        <if test='TAXRATE!= null'> 
           #{TAXRATE,jdbcType=decimal}，
        </if>
        <if test='PRICE!= null'> 
           #{PRICE,jdbcType=decimal}，
        </if>
        <if test='SPRICE!= null'> 
           #{SPRICE,jdbcType=decimal}，
        </if>
        <if test='PADDR!= null'> 
           #{PADDR,jdbcType=varchar}，
        </if>
        <if test='TRADEMARK!= null'> 
           #{TRADEMARK,jdbcType=varchar}，
        </if>
        <if test='COLOR!= null'> 
           #{COLOR,jdbcType=varchar}，
        </if>
        <if test='LAYER!= null'> 
           #{LAYER,jdbcType=varchar}，
        </if>
        <if test='MATERIAL!= null'> 
           #{MATERIAL,jdbcType=varchar}，
        </if>
        <if test='HIGHSTORAGE!= null'> 
           #{HIGHSTORAGE,jdbcType=decimal}，
        </if>
        <if test='LOWSTORAGE!= null'> 
           #{LOWSTORAGE,jdbcType=decimal}，
        </if>
        <if test='SAFESTORAGE!= null'> 
           #{SAFESTORAGE,jdbcType=decimal}，
        </if>
        <if test='MEMO!= null'> 
           #{MEMO,jdbcType=varchar}，
        </if>
        <if test='STATUS1!= null'> 
           #{STATUS1,jdbcType=varchar}，
        </if>
        <if test='ENCL!= null'> 
           #{ENCL,jdbcType=varchar}，
        </if>
        <if test='VENDOR!= null'> 
           #{VENDOR,jdbcType=varchar}，
        </if>
        <if test='PICTURE!= null'> 
           #{PICTURE,jdbcType=varchar}，
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
        <if test='BARCODE!= null'> 
           #{BARCODE,jdbcType=varchar}，
        </if>
        <if test='EXT5!= null'> 
           #{EXT5,jdbcType=varchar}，
        </if>
        <if test='EXT6!= null'> 
           #{EXT6,jdbcType=varchar}，
        </if>
        <if test='EXT7!= null'> 
           #{EXT7,jdbcType=varchar}，
        </if>
        <if test='EXT8!= null'> 
           #{EXT8,jdbcType=varchar}，
        </if>
        <if test='GTYPE!= null'> 
           #{GTYPE,jdbcType=varchar}，
        </if>
        <if test='COSTING!= null'> 
           #{COSTING,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:bo_ss_goods_dto):Unit
                

}

        
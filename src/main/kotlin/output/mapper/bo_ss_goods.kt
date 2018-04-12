

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
        


}

        
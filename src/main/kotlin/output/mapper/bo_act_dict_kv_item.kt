

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_act_dict_kv_item{


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
   Result(property = "ITEMNO", column = "ITEMNO"),
   Result(property = "CNNAME", column = "CNNAME"),
   Result(property = "ENNAME", column = "ENNAME"),
   Result(property = "BIG5NAME", column = "BIG5NAME"),
   Result(property = "EXTTEXT1", column = "EXTTEXT1"),
   Result(property = "EXTTEXT2", column = "EXTTEXT2"),
   Result(property = "EXTTEXT3", column = "EXTTEXT3"),
   Result(property = "EXTTEXT4", column = "EXTTEXT4"),
   Result(property = "EXTTEXT5", column = "EXTTEXT5"),
   Result(property = "EXTTEXT6", column = "EXTTEXT6"),
   Result(property = "EXTTEXT7", column = "EXTTEXT7"),
   Result(property = "EXTTEXT8", column = "EXTTEXT8"),
   Result(property = "EXTTEXT9", column = "EXTTEXT9"),
   Result(property = "EXTTEXT10", column = "EXTTEXT10"),
   Result(property = "EXTINT1", column = "EXTINT1"),
   Result(property = "EXTINT2", column = "EXTINT2"),
   Result(property = "EXTINT3", column = "EXTINT3"),
   Result(property = "EXTINT4", column = "EXTINT4"),
   Result(property = "EXTINT5", column = "EXTINT5"),
   Result(property = "EXTDOUBLE1", column = "EXTDOUBLE1"),
   Result(property = "EXTDOUBLE2", column = "EXTDOUBLE2"),
   Result(property = "EXTDOUBLE3", column = "EXTDOUBLE3"),
   Result(property = "EXTDATE1", column = "EXTDATE1"),
   Result(property = "EXTDATE2", column = "EXTDATE2"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "ISACTIVE", column = "ISACTIVE"),
   Result(property = "ISSYS", column = "ISSYS"),
   Result(property = "DICTKEY", column = "DICTKEY"),
   Result(property = "PNO", column = "PNO"),
   Result(property = "ISLEAF", column = "ISLEAF")
)
@Select("""<script>
   SELECT * FROM bo_act_dict_kv_item
</script>""")
fun GetListAll():ArrayList<bo_act_dict_kv_item_dto>
        


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
   Result(property = "ITEMNO", column = "ITEMNO"),
   Result(property = "CNNAME", column = "CNNAME"),
   Result(property = "ENNAME", column = "ENNAME"),
   Result(property = "BIG5NAME", column = "BIG5NAME"),
   Result(property = "EXTTEXT1", column = "EXTTEXT1"),
   Result(property = "EXTTEXT2", column = "EXTTEXT2"),
   Result(property = "EXTTEXT3", column = "EXTTEXT3"),
   Result(property = "EXTTEXT4", column = "EXTTEXT4"),
   Result(property = "EXTTEXT5", column = "EXTTEXT5"),
   Result(property = "EXTTEXT6", column = "EXTTEXT6"),
   Result(property = "EXTTEXT7", column = "EXTTEXT7"),
   Result(property = "EXTTEXT8", column = "EXTTEXT8"),
   Result(property = "EXTTEXT9", column = "EXTTEXT9"),
   Result(property = "EXTTEXT10", column = "EXTTEXT10"),
   Result(property = "EXTINT1", column = "EXTINT1"),
   Result(property = "EXTINT2", column = "EXTINT2"),
   Result(property = "EXTINT3", column = "EXTINT3"),
   Result(property = "EXTINT4", column = "EXTINT4"),
   Result(property = "EXTINT5", column = "EXTINT5"),
   Result(property = "EXTDOUBLE1", column = "EXTDOUBLE1"),
   Result(property = "EXTDOUBLE2", column = "EXTDOUBLE2"),
   Result(property = "EXTDOUBLE3", column = "EXTDOUBLE3"),
   Result(property = "EXTDATE1", column = "EXTDATE1"),
   Result(property = "EXTDATE2", column = "EXTDATE2"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "ISACTIVE", column = "ISACTIVE"),
   Result(property = "ISSYS", column = "ISSYS"),
   Result(property = "DICTKEY", column = "DICTKEY"),
   Result(property = "PNO", column = "PNO"),
   Result(property = "ISLEAF", column = "ISLEAF")
)
@Select("""<script>
   SELECT * FROM bo_act_dict_kv_item
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
   <if test="ITEMNO!=null">
      ITEMNO=#{ITEMNO}
   </if> 
   <if test="CNNAME!=null">
      CNNAME=#{CNNAME}
   </if> 
   <if test="ENNAME!=null">
      ENNAME=#{ENNAME}
   </if> 
   <if test="BIG5NAME!=null">
      BIG5NAME=#{BIG5NAME}
   </if> 
   <if test="EXTTEXT1!=null">
      EXTTEXT1=#{EXTTEXT1}
   </if> 
   <if test="EXTTEXT2!=null">
      EXTTEXT2=#{EXTTEXT2}
   </if> 
   <if test="EXTTEXT3!=null">
      EXTTEXT3=#{EXTTEXT3}
   </if> 
   <if test="EXTTEXT4!=null">
      EXTTEXT4=#{EXTTEXT4}
   </if> 
   <if test="EXTTEXT5!=null">
      EXTTEXT5=#{EXTTEXT5}
   </if> 
   <if test="EXTTEXT6!=null">
      EXTTEXT6=#{EXTTEXT6}
   </if> 
   <if test="EXTTEXT7!=null">
      EXTTEXT7=#{EXTTEXT7}
   </if> 
   <if test="EXTTEXT8!=null">
      EXTTEXT8=#{EXTTEXT8}
   </if> 
   <if test="EXTTEXT9!=null">
      EXTTEXT9=#{EXTTEXT9}
   </if> 
   <if test="EXTTEXT10!=null">
      EXTTEXT10=#{EXTTEXT10}
   </if> 
   <if test="EXTINT1!=null">
      EXTINT1=#{EXTINT1}
   </if> 
   <if test="EXTINT2!=null">
      EXTINT2=#{EXTINT2}
   </if> 
   <if test="EXTINT3!=null">
      EXTINT3=#{EXTINT3}
   </if> 
   <if test="EXTINT4!=null">
      EXTINT4=#{EXTINT4}
   </if> 
   <if test="EXTINT5!=null">
      EXTINT5=#{EXTINT5}
   </if> 
   <if test="EXTDOUBLE1!=null">
      EXTDOUBLE1=#{EXTDOUBLE1}
   </if> 
   <if test="EXTDOUBLE2!=null">
      EXTDOUBLE2=#{EXTDOUBLE2}
   </if> 
   <if test="EXTDOUBLE3!=null">
      EXTDOUBLE3=#{EXTDOUBLE3}
   </if> 
   <if test="EXTDATE1!=null">
      EXTDATE1=#{EXTDATE1}
   </if> 
   <if test="EXTDATE2!=null">
      EXTDATE2=#{EXTDATE2}
   </if> 
   <if test="ORDERINDEX!=null">
      ORDERINDEX=#{ORDERINDEX}
   </if> 
   <if test="ISACTIVE!=null">
      ISACTIVE=#{ISACTIVE}
   </if> 
   <if test="ISSYS!=null">
      ISSYS=#{ISSYS}
   </if> 
   <if test="DICTKEY!=null">
      DICTKEY=#{DICTKEY}
   </if> 
   <if test="PNO!=null">
      PNO=#{PNO}
   </if> 
   <if test="ISLEAF!=null">
      ISLEAF=#{ISLEAF}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:bo_act_dict_kv_item_dto):ArrayList<bo_act_dict_kv_item_dto>
                


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
   Result(property = "ITEMNO", column = "ITEMNO"),
   Result(property = "CNNAME", column = "CNNAME"),
   Result(property = "ENNAME", column = "ENNAME"),
   Result(property = "BIG5NAME", column = "BIG5NAME"),
   Result(property = "EXTTEXT1", column = "EXTTEXT1"),
   Result(property = "EXTTEXT2", column = "EXTTEXT2"),
   Result(property = "EXTTEXT3", column = "EXTTEXT3"),
   Result(property = "EXTTEXT4", column = "EXTTEXT4"),
   Result(property = "EXTTEXT5", column = "EXTTEXT5"),
   Result(property = "EXTTEXT6", column = "EXTTEXT6"),
   Result(property = "EXTTEXT7", column = "EXTTEXT7"),
   Result(property = "EXTTEXT8", column = "EXTTEXT8"),
   Result(property = "EXTTEXT9", column = "EXTTEXT9"),
   Result(property = "EXTTEXT10", column = "EXTTEXT10"),
   Result(property = "EXTINT1", column = "EXTINT1"),
   Result(property = "EXTINT2", column = "EXTINT2"),
   Result(property = "EXTINT3", column = "EXTINT3"),
   Result(property = "EXTINT4", column = "EXTINT4"),
   Result(property = "EXTINT5", column = "EXTINT5"),
   Result(property = "EXTDOUBLE1", column = "EXTDOUBLE1"),
   Result(property = "EXTDOUBLE2", column = "EXTDOUBLE2"),
   Result(property = "EXTDOUBLE3", column = "EXTDOUBLE3"),
   Result(property = "EXTDATE1", column = "EXTDATE1"),
   Result(property = "EXTDATE2", column = "EXTDATE2"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "ISACTIVE", column = "ISACTIVE"),
   Result(property = "ISSYS", column = "ISSYS"),
   Result(property = "DICTKEY", column = "DICTKEY"),
   Result(property = "PNO", column = "PNO"),
   Result(property = "ISLEAF", column = "ISLEAF")
)
@Select("""<script>
   SELECT * FROM bo_act_dict_kv_item
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:bo_act_dict_kv_item_dto):bo_act_dict_kv_item_dto?
                


@Insert("""<script>
    insert into bo_act_dict_kv_item
    (ID,ORGID,BINDID,CREATEDATE,CREATEUSER,UPDATEDATE,UPDATEUSER,PROCESSDEFID,ISEND,ITEMNO,CNNAME,ENNAME,BIG5NAME,EXTTEXT1,EXTTEXT2,EXTTEXT3,EXTTEXT4,EXTTEXT5,EXTTEXT6,EXTTEXT7,EXTTEXT8,EXTTEXT9,EXTTEXT10,EXTINT1,EXTINT2,EXTINT3,EXTINT4,EXTINT5,EXTDOUBLE1,EXTDOUBLE2,EXTDOUBLE3,EXTDATE1,EXTDATE2,ORDERINDEX,ISACTIVE,ISSYS,DICTKEY,PNO,ISLEAF)
    values
    (#{ID},#{ORGID},#{BINDID},#{CREATEDATE},#{CREATEUSER},#{UPDATEDATE},#{UPDATEUSER},#{PROCESSDEFID},#{ISEND},#{ITEMNO},#{CNNAME},#{ENNAME},#{BIG5NAME},#{EXTTEXT1},#{EXTTEXT2},#{EXTTEXT3},#{EXTTEXT4},#{EXTTEXT5},#{EXTTEXT6},#{EXTTEXT7},#{EXTTEXT8},#{EXTTEXT9},#{EXTTEXT10},#{EXTINT1},#{EXTINT2},#{EXTINT3},#{EXTINT4},#{EXTINT5},#{EXTDOUBLE1},#{EXTDOUBLE2},#{EXTDOUBLE3},#{EXTDATE1},#{EXTDATE2},#{ORDERINDEX},#{ISACTIVE},#{ISSYS},#{DICTKEY},#{PNO},#{ISLEAF})
</script>""")
fun Insert(model:bo_act_dict_kv_item_dto):Unit
                


@Insert("""<script>
    insert into bo_act_dict_kv_item
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='ORGID!= null'> 
           ORGID,
        </if>
        <if test='BINDID!= null'> 
           BINDID,
        </if>
           CREATEDATE,
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
           UPDATEDATE,
        <if test='UPDATEUSER!= null'> 
           UPDATEUSER,
        </if>
        <if test='PROCESSDEFID!= null'> 
           PROCESSDEFID,
        </if>
           ISEND,
        <if test='ITEMNO!= null'> 
           ITEMNO,
        </if>
        <if test='CNNAME!= null'> 
           CNNAME,
        </if>
        <if test='ENNAME!= null'> 
           ENNAME,
        </if>
        <if test='BIG5NAME!= null'> 
           BIG5NAME,
        </if>
        <if test='EXTTEXT1!= null'> 
           EXTTEXT1,
        </if>
        <if test='EXTTEXT2!= null'> 
           EXTTEXT2,
        </if>
        <if test='EXTTEXT3!= null'> 
           EXTTEXT3,
        </if>
        <if test='EXTTEXT4!= null'> 
           EXTTEXT4,
        </if>
        <if test='EXTTEXT5!= null'> 
           EXTTEXT5,
        </if>
        <if test='EXTTEXT6!= null'> 
           EXTTEXT6,
        </if>
        <if test='EXTTEXT7!= null'> 
           EXTTEXT7,
        </if>
        <if test='EXTTEXT8!= null'> 
           EXTTEXT8,
        </if>
        <if test='EXTTEXT9!= null'> 
           EXTTEXT9,
        </if>
        <if test='EXTTEXT10!= null'> 
           EXTTEXT10,
        </if>
        <if test='EXTINT1!= null'> 
           EXTINT1,
        </if>
        <if test='EXTINT2!= null'> 
           EXTINT2,
        </if>
        <if test='EXTINT3!= null'> 
           EXTINT3,
        </if>
        <if test='EXTINT4!= null'> 
           EXTINT4,
        </if>
        <if test='EXTINT5!= null'> 
           EXTINT5,
        </if>
        <if test='EXTDOUBLE1!= null'> 
           EXTDOUBLE1,
        </if>
        <if test='EXTDOUBLE2!= null'> 
           EXTDOUBLE2,
        </if>
        <if test='EXTDOUBLE3!= null'> 
           EXTDOUBLE3,
        </if>
        <if test='EXTDATE1!= null'> 
           EXTDATE1,
        </if>
        <if test='EXTDATE2!= null'> 
           EXTDATE2,
        </if>
        <if test='ORDERINDEX!= null'> 
           ORDERINDEX,
        </if>
        <if test='ISACTIVE!= null'> 
           ISACTIVE,
        </if>
        <if test='ISSYS!= null'> 
           ISSYS,
        </if>
        <if test='DICTKEY!= null'> 
           DICTKEY,
        </if>
        <if test='PNO!= null'> 
           PNO,
        </if>
        <if test='ISLEAF!= null'> 
           ISLEAF
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
           #{CREATEDATE,jdbcType=datetime}，
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
           #{UPDATEDATE,jdbcType=datetime}，
        <if test='UPDATEUSER!= null'> 
           #{UPDATEUSER,jdbcType=varchar}，
        </if>
        <if test='PROCESSDEFID!= null'> 
           #{PROCESSDEFID,jdbcType=char}，
        </if>
           #{ISEND,jdbcType=decimal}，
        <if test='ITEMNO!= null'> 
           #{ITEMNO,jdbcType=varchar}，
        </if>
        <if test='CNNAME!= null'> 
           #{CNNAME,jdbcType=text}，
        </if>
        <if test='ENNAME!= null'> 
           #{ENNAME,jdbcType=text}，
        </if>
        <if test='BIG5NAME!= null'> 
           #{BIG5NAME,jdbcType=text}，
        </if>
        <if test='EXTTEXT1!= null'> 
           #{EXTTEXT1,jdbcType=text}，
        </if>
        <if test='EXTTEXT2!= null'> 
           #{EXTTEXT2,jdbcType=text}，
        </if>
        <if test='EXTTEXT3!= null'> 
           #{EXTTEXT3,jdbcType=text}，
        </if>
        <if test='EXTTEXT4!= null'> 
           #{EXTTEXT4,jdbcType=text}，
        </if>
        <if test='EXTTEXT5!= null'> 
           #{EXTTEXT5,jdbcType=text}，
        </if>
        <if test='EXTTEXT6!= null'> 
           #{EXTTEXT6,jdbcType=varchar}，
        </if>
        <if test='EXTTEXT7!= null'> 
           #{EXTTEXT7,jdbcType=varchar}，
        </if>
        <if test='EXTTEXT8!= null'> 
           #{EXTTEXT8,jdbcType=varchar}，
        </if>
        <if test='EXTTEXT9!= null'> 
           #{EXTTEXT9,jdbcType=varchar}，
        </if>
        <if test='EXTTEXT10!= null'> 
           #{EXTTEXT10,jdbcType=varchar}，
        </if>
        <if test='EXTINT1!= null'> 
           #{EXTINT1,jdbcType=decimal}，
        </if>
        <if test='EXTINT2!= null'> 
           #{EXTINT2,jdbcType=decimal}，
        </if>
        <if test='EXTINT3!= null'> 
           #{EXTINT3,jdbcType=decimal}，
        </if>
        <if test='EXTINT4!= null'> 
           #{EXTINT4,jdbcType=decimal}，
        </if>
        <if test='EXTINT5!= null'> 
           #{EXTINT5,jdbcType=decimal}，
        </if>
        <if test='EXTDOUBLE1!= null'> 
           #{EXTDOUBLE1,jdbcType=decimal}，
        </if>
        <if test='EXTDOUBLE2!= null'> 
           #{EXTDOUBLE2,jdbcType=decimal}，
        </if>
        <if test='EXTDOUBLE3!= null'> 
           #{EXTDOUBLE3,jdbcType=decimal}，
        </if>
        <if test='EXTDATE1!= null'> 
           #{EXTDATE1,jdbcType=datetime}，
        </if>
        <if test='EXTDATE2!= null'> 
           #{EXTDATE2,jdbcType=datetime}，
        </if>
        <if test='ORDERINDEX!= null'> 
           #{ORDERINDEX,jdbcType=decimal}，
        </if>
        <if test='ISACTIVE!= null'> 
           #{ISACTIVE,jdbcType=decimal}，
        </if>
        <if test='ISSYS!= null'> 
           #{ISSYS,jdbcType=decimal}，
        </if>
        <if test='DICTKEY!= null'> 
           #{DICTKEY,jdbcType=varchar}，
        </if>
        <if test='PNO!= null'> 
           #{PNO,jdbcType=varchar}，
        </if>
        <if test='ISLEAF!= null'> 
           #{ISLEAF,jdbcType=decimal}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:bo_act_dict_kv_item_dto):Unit
                


@Delete("DELETE FROM bo_act_dict_kv_item WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE bo_act_dict_kv_item SET
        ID=#{ID,jdbcType=String},
        ORGID=#{ORGID,jdbcType=String},
        BINDID=#{BINDID,jdbcType=String},
        CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp},
        UPDATEUSER=#{UPDATEUSER,jdbcType=String},
        PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},
        ISEND=#{ISEND,jdbcType=BigDecimal},
        ITEMNO=#{ITEMNO,jdbcType=String},
        CNNAME=#{CNNAME,jdbcType=String},
        ENNAME=#{ENNAME,jdbcType=String},
        BIG5NAME=#{BIG5NAME,jdbcType=String},
        EXTTEXT1=#{EXTTEXT1,jdbcType=String},
        EXTTEXT2=#{EXTTEXT2,jdbcType=String},
        EXTTEXT3=#{EXTTEXT3,jdbcType=String},
        EXTTEXT4=#{EXTTEXT4,jdbcType=String},
        EXTTEXT5=#{EXTTEXT5,jdbcType=String},
        EXTTEXT6=#{EXTTEXT6,jdbcType=String},
        EXTTEXT7=#{EXTTEXT7,jdbcType=String},
        EXTTEXT8=#{EXTTEXT8,jdbcType=String},
        EXTTEXT9=#{EXTTEXT9,jdbcType=String},
        EXTTEXT10=#{EXTTEXT10,jdbcType=String},
        EXTINT1=#{EXTINT1,jdbcType=BigDecimal},
        EXTINT2=#{EXTINT2,jdbcType=BigDecimal},
        EXTINT3=#{EXTINT3,jdbcType=BigDecimal},
        EXTINT4=#{EXTINT4,jdbcType=BigDecimal},
        EXTINT5=#{EXTINT5,jdbcType=BigDecimal},
        EXTDOUBLE1=#{EXTDOUBLE1,jdbcType=BigDecimal},
        EXTDOUBLE2=#{EXTDOUBLE2,jdbcType=BigDecimal},
        EXTDOUBLE3=#{EXTDOUBLE3,jdbcType=BigDecimal},
        EXTDATE1=#{EXTDATE1,jdbcType=Timestamp},
        EXTDATE2=#{EXTDATE2,jdbcType=Timestamp},
        ORDERINDEX=#{ORDERINDEX,jdbcType=BigDecimal},
        ISACTIVE=#{ISACTIVE,jdbcType=BigDecimal},
        ISSYS=#{ISSYS,jdbcType=BigDecimal},
        DICTKEY=#{DICTKEY,jdbcType=String},
        PNO=#{PNO,jdbcType=String},
        ISLEAF=#{ISLEAF,jdbcType=BigDecimal}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:bo_act_dict_kv_item_dto)
        

@Update("""<script>
            UPDATE bo_act_dict_kv_item SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="ORGID != null">  ORGID=#{ORGID,jdbcType=String},</if>
        <if test="BINDID != null">  BINDID=#{BINDID,jdbcType=String},</if>
        <if test="CREATEDATE != null">  CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="UPDATEDATE != null">  UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp},</if>
        <if test="UPDATEUSER != null">  UPDATEUSER=#{UPDATEUSER,jdbcType=String},</if>
        <if test="PROCESSDEFID != null">  PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},</if>
        <if test="ISEND != null">  ISEND=#{ISEND,jdbcType=BigDecimal},</if>
        <if test="ITEMNO != null">  ITEMNO=#{ITEMNO,jdbcType=String},</if>
        <if test="CNNAME != null">  CNNAME=#{CNNAME,jdbcType=String},</if>
        <if test="ENNAME != null">  ENNAME=#{ENNAME,jdbcType=String},</if>
        <if test="BIG5NAME != null">  BIG5NAME=#{BIG5NAME,jdbcType=String},</if>
        <if test="EXTTEXT1 != null">  EXTTEXT1=#{EXTTEXT1,jdbcType=String},</if>
        <if test="EXTTEXT2 != null">  EXTTEXT2=#{EXTTEXT2,jdbcType=String},</if>
        <if test="EXTTEXT3 != null">  EXTTEXT3=#{EXTTEXT3,jdbcType=String},</if>
        <if test="EXTTEXT4 != null">  EXTTEXT4=#{EXTTEXT4,jdbcType=String},</if>
        <if test="EXTTEXT5 != null">  EXTTEXT5=#{EXTTEXT5,jdbcType=String},</if>
        <if test="EXTTEXT6 != null">  EXTTEXT6=#{EXTTEXT6,jdbcType=String},</if>
        <if test="EXTTEXT7 != null">  EXTTEXT7=#{EXTTEXT7,jdbcType=String},</if>
        <if test="EXTTEXT8 != null">  EXTTEXT8=#{EXTTEXT8,jdbcType=String},</if>
        <if test="EXTTEXT9 != null">  EXTTEXT9=#{EXTTEXT9,jdbcType=String},</if>
        <if test="EXTTEXT10 != null">  EXTTEXT10=#{EXTTEXT10,jdbcType=String},</if>
        <if test="EXTINT1 != null">  EXTINT1=#{EXTINT1,jdbcType=BigDecimal},</if>
        <if test="EXTINT2 != null">  EXTINT2=#{EXTINT2,jdbcType=BigDecimal},</if>
        <if test="EXTINT3 != null">  EXTINT3=#{EXTINT3,jdbcType=BigDecimal},</if>
        <if test="EXTINT4 != null">  EXTINT4=#{EXTINT4,jdbcType=BigDecimal},</if>
        <if test="EXTINT5 != null">  EXTINT5=#{EXTINT5,jdbcType=BigDecimal},</if>
        <if test="EXTDOUBLE1 != null">  EXTDOUBLE1=#{EXTDOUBLE1,jdbcType=BigDecimal},</if>
        <if test="EXTDOUBLE2 != null">  EXTDOUBLE2=#{EXTDOUBLE2,jdbcType=BigDecimal},</if>
        <if test="EXTDOUBLE3 != null">  EXTDOUBLE3=#{EXTDOUBLE3,jdbcType=BigDecimal},</if>
        <if test="EXTDATE1 != null">  EXTDATE1=#{EXTDATE1,jdbcType=Timestamp},</if>
        <if test="EXTDATE2 != null">  EXTDATE2=#{EXTDATE2,jdbcType=Timestamp},</if>
        <if test="ORDERINDEX != null">  ORDERINDEX=#{ORDERINDEX,jdbcType=BigDecimal},</if>
        <if test="ISACTIVE != null">  ISACTIVE=#{ISACTIVE,jdbcType=BigDecimal},</if>
        <if test="ISSYS != null">  ISSYS=#{ISSYS,jdbcType=BigDecimal},</if>
        <if test="DICTKEY != null">  DICTKEY=#{DICTKEY,jdbcType=String},</if>
        <if test="PNO != null">  PNO=#{PNO,jdbcType=String},</if>
        <if test="ISLEAF != null">  ISLEAF=#{ISLEAF,jdbcType=BigDecimal}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:bo_act_dict_kv_item_dto)
            

}

        
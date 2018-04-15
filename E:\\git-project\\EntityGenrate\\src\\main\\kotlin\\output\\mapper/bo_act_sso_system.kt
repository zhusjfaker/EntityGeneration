

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_act_sso_system{


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
   Result(property = "SSONAME", column = "SSONAME"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "ICON32", column = "ICON32"),
   Result(property = "ICON96", column = "ICON96"),
   Result(property = "LOGINURL", column = "LOGINURL"),
   Result(property = "SUBMITTYPE", column = "SUBMITTYPE"),
   Result(property = "LOGINTARGET", column = "LOGINTARGET"),
   Result(property = "ISACTIVE", column = "ISACTIVE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "ACCESSKEY", column = "ACCESSKEY"),
   Result(property = "SEC", column = "SEC")
)
@Select("""<script>
   SELECT * FROM bo_act_sso_system
</script>""")
fun GetListAll():ArrayList<bo_act_sso_system_dto>
        


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
   Result(property = "SSONAME", column = "SSONAME"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "ICON32", column = "ICON32"),
   Result(property = "ICON96", column = "ICON96"),
   Result(property = "LOGINURL", column = "LOGINURL"),
   Result(property = "SUBMITTYPE", column = "SUBMITTYPE"),
   Result(property = "LOGINTARGET", column = "LOGINTARGET"),
   Result(property = "ISACTIVE", column = "ISACTIVE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "ACCESSKEY", column = "ACCESSKEY"),
   Result(property = "SEC", column = "SEC")
)
@Select("""<script>
   SELECT * FROM bo_act_sso_system
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
   <if test="SSONAME!=null">
      SSONAME=#{SSONAME}
   </if> 
   <if test="MEMO!=null">
      MEMO=#{MEMO}
   </if> 
   <if test="ICON32!=null">
      ICON32=#{ICON32}
   </if> 
   <if test="ICON96!=null">
      ICON96=#{ICON96}
   </if> 
   <if test="LOGINURL!=null">
      LOGINURL=#{LOGINURL}
   </if> 
   <if test="SUBMITTYPE!=null">
      SUBMITTYPE=#{SUBMITTYPE}
   </if> 
   <if test="LOGINTARGET!=null">
      LOGINTARGET=#{LOGINTARGET}
   </if> 
   <if test="ISACTIVE!=null">
      ISACTIVE=#{ISACTIVE}
   </if> 
   <if test="ORDERINDEX!=null">
      ORDERINDEX=#{ORDERINDEX}
   </if> 
   <if test="ACCESSKEY!=null">
      ACCESSKEY=#{ACCESSKEY}
   </if> 
   <if test="SEC!=null">
      SEC=#{SEC}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:bo_act_sso_system_dto):ArrayList<bo_act_sso_system_dto>
                


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
   Result(property = "SSONAME", column = "SSONAME"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "ICON32", column = "ICON32"),
   Result(property = "ICON96", column = "ICON96"),
   Result(property = "LOGINURL", column = "LOGINURL"),
   Result(property = "SUBMITTYPE", column = "SUBMITTYPE"),
   Result(property = "LOGINTARGET", column = "LOGINTARGET"),
   Result(property = "ISACTIVE", column = "ISACTIVE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "ACCESSKEY", column = "ACCESSKEY"),
   Result(property = "SEC", column = "SEC")
)
@Select("""<script>
   SELECT * FROM bo_act_sso_system
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:bo_act_sso_system_dto):bo_act_sso_system_dto?
                


@Insert("""<script>
    insert into bo_act_sso_system
    (ID,ORGID,BINDID,CREATEDATE,CREATEUSER,UPDATEDATE,UPDATEUSER,PROCESSDEFID,ISEND,SSONAME,MEMO,ICON32,ICON96,LOGINURL,SUBMITTYPE,LOGINTARGET,ISACTIVE,ORDERINDEX,ACCESSKEY,SEC)
    values
    (#{ID},#{ORGID},#{BINDID},#{CREATEDATE},#{CREATEUSER},#{UPDATEDATE},#{UPDATEUSER},#{PROCESSDEFID},#{ISEND},#{SSONAME},#{MEMO},#{ICON32},#{ICON96},#{LOGINURL},#{SUBMITTYPE},#{LOGINTARGET},#{ISACTIVE},#{ORDERINDEX},#{ACCESSKEY},#{SEC})
</script>""")
fun Insert(model:bo_act_sso_system_dto):Unit
                


@Insert("""<script>
    insert into bo_act_sso_system
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
        <if test='SSONAME!= null'> 
           SSONAME,
        </if>
        <if test='MEMO!= null'> 
           MEMO,
        </if>
        <if test='ICON32!= null'> 
           ICON32,
        </if>
        <if test='ICON96!= null'> 
           ICON96,
        </if>
        <if test='LOGINURL!= null'> 
           LOGINURL,
        </if>
        <if test='SUBMITTYPE!= null'> 
           SUBMITTYPE,
        </if>
        <if test='LOGINTARGET!= null'> 
           LOGINTARGET,
        </if>
        <if test='ISACTIVE!= null'> 
           ISACTIVE,
        </if>
        <if test='ORDERINDEX!= null'> 
           ORDERINDEX,
        </if>
        <if test='ACCESSKEY!= null'> 
           ACCESSKEY,
        </if>
        <if test='SEC!= null'> 
           SEC
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
        <if test='SSONAME!= null'> 
           #{SSONAME,jdbcType=varchar}，
        </if>
        <if test='MEMO!= null'> 
           #{MEMO,jdbcType=varchar}，
        </if>
        <if test='ICON32!= null'> 
           #{ICON32,jdbcType=varchar}，
        </if>
        <if test='ICON96!= null'> 
           #{ICON96,jdbcType=varchar}，
        </if>
        <if test='LOGINURL!= null'> 
           #{LOGINURL,jdbcType=varchar}，
        </if>
        <if test='SUBMITTYPE!= null'> 
           #{SUBMITTYPE,jdbcType=varchar}，
        </if>
        <if test='LOGINTARGET!= null'> 
           #{LOGINTARGET,jdbcType=varchar}，
        </if>
        <if test='ISACTIVE!= null'> 
           #{ISACTIVE,jdbcType=decimal}，
        </if>
        <if test='ORDERINDEX!= null'> 
           #{ORDERINDEX,jdbcType=decimal}，
        </if>
        <if test='ACCESSKEY!= null'> 
           #{ACCESSKEY,jdbcType=varchar}，
        </if>
        <if test='SEC!= null'> 
           #{SEC,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:bo_act_sso_system_dto):Unit
                


@Delete("DELETE FROM bo_act_sso_system WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE bo_act_sso_system SET
        ID=#{ID,jdbcType=String},
        ORGID=#{ORGID,jdbcType=String},
        BINDID=#{BINDID,jdbcType=String},
        CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp},
        UPDATEUSER=#{UPDATEUSER,jdbcType=String},
        PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},
        ISEND=#{ISEND,jdbcType=Integer},
        SSONAME=#{SSONAME,jdbcType=String},
        MEMO=#{MEMO,jdbcType=String},
        ICON32=#{ICON32,jdbcType=String},
        ICON96=#{ICON96,jdbcType=String},
        LOGINURL=#{LOGINURL,jdbcType=String},
        SUBMITTYPE=#{SUBMITTYPE,jdbcType=String},
        LOGINTARGET=#{LOGINTARGET,jdbcType=String},
        ISACTIVE=#{ISACTIVE,jdbcType=BigDecimal},
        ORDERINDEX=#{ORDERINDEX,jdbcType=BigDecimal},
        ACCESSKEY=#{ACCESSKEY,jdbcType=String},
        SEC=#{SEC,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:bo_act_sso_system_dto)
        

@Update("""<script>
            UPDATE bo_act_sso_system SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="ORGID != null">  ORGID=#{ORGID,jdbcType=String},</if>
        <if test="BINDID != null">  BINDID=#{BINDID,jdbcType=String},</if>
        <if test="CREATEDATE != null">  CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="UPDATEDATE != null">  UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp},</if>
        <if test="UPDATEUSER != null">  UPDATEUSER=#{UPDATEUSER,jdbcType=String},</if>
        <if test="PROCESSDEFID != null">  PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},</if>
        <if test="ISEND != null">  ISEND=#{ISEND,jdbcType=Integer},</if>
        <if test="SSONAME != null">  SSONAME=#{SSONAME,jdbcType=String},</if>
        <if test="MEMO != null">  MEMO=#{MEMO,jdbcType=String},</if>
        <if test="ICON32 != null">  ICON32=#{ICON32,jdbcType=String},</if>
        <if test="ICON96 != null">  ICON96=#{ICON96,jdbcType=String},</if>
        <if test="LOGINURL != null">  LOGINURL=#{LOGINURL,jdbcType=String},</if>
        <if test="SUBMITTYPE != null">  SUBMITTYPE=#{SUBMITTYPE,jdbcType=String},</if>
        <if test="LOGINTARGET != null">  LOGINTARGET=#{LOGINTARGET,jdbcType=String},</if>
        <if test="ISACTIVE != null">  ISACTIVE=#{ISACTIVE,jdbcType=BigDecimal},</if>
        <if test="ORDERINDEX != null">  ORDERINDEX=#{ORDERINDEX,jdbcType=BigDecimal},</if>
        <if test="ACCESSKEY != null">  ACCESSKEY=#{ACCESSKEY,jdbcType=String},</if>
        <if test="SEC != null">  SEC=#{SEC,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:bo_act_sso_system_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_act_sso_system{


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
   Result(property = "SSONAME", column = "SSONAME"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "ICON32", column = "ICON32"),
   Result(property = "ICON96", column = "ICON96"),
   Result(property = "LOGINURL", column = "LOGINURL"),
   Result(property = "SUBMITTYPE", column = "SUBMITTYPE"),
   Result(property = "LOGINTARGET", column = "LOGINTARGET"),
   Result(property = "ISACTIVE", column = "ISACTIVE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "ACCESSKEY", column = "ACCESSKEY"),
   Result(property = "SEC", column = "SEC")
)
@Select("""<script>
   SELECT * FROM bo_act_sso_system
</script>""")
fun GetListAll():ArrayList<bo_act_sso_system_dto>
        


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
   Result(property = "SSONAME", column = "SSONAME"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "ICON32", column = "ICON32"),
   Result(property = "ICON96", column = "ICON96"),
   Result(property = "LOGINURL", column = "LOGINURL"),
   Result(property = "SUBMITTYPE", column = "SUBMITTYPE"),
   Result(property = "LOGINTARGET", column = "LOGINTARGET"),
   Result(property = "ISACTIVE", column = "ISACTIVE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "ACCESSKEY", column = "ACCESSKEY"),
   Result(property = "SEC", column = "SEC")
)
@Select("""<script>
   SELECT * FROM bo_act_sso_system
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
   <if test="SSONAME!=null">
      SSONAME=#{SSONAME}
   </if> 
   <if test="MEMO!=null">
      MEMO=#{MEMO}
   </if> 
   <if test="ICON32!=null">
      ICON32=#{ICON32}
   </if> 
   <if test="ICON96!=null">
      ICON96=#{ICON96}
   </if> 
   <if test="LOGINURL!=null">
      LOGINURL=#{LOGINURL}
   </if> 
   <if test="SUBMITTYPE!=null">
      SUBMITTYPE=#{SUBMITTYPE}
   </if> 
   <if test="LOGINTARGET!=null">
      LOGINTARGET=#{LOGINTARGET}
   </if> 
   <if test="ISACTIVE!=null">
      ISACTIVE=#{ISACTIVE}
   </if> 
   <if test="ORDERINDEX!=null">
      ORDERINDEX=#{ORDERINDEX}
   </if> 
   <if test="ACCESSKEY!=null">
      ACCESSKEY=#{ACCESSKEY}
   </if> 
   <if test="SEC!=null">
      SEC=#{SEC}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:bo_act_sso_system_dto):ArrayList<bo_act_sso_system_dto>
                


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
   Result(property = "SSONAME", column = "SSONAME"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "ICON32", column = "ICON32"),
   Result(property = "ICON96", column = "ICON96"),
   Result(property = "LOGINURL", column = "LOGINURL"),
   Result(property = "SUBMITTYPE", column = "SUBMITTYPE"),
   Result(property = "LOGINTARGET", column = "LOGINTARGET"),
   Result(property = "ISACTIVE", column = "ISACTIVE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "ACCESSKEY", column = "ACCESSKEY"),
   Result(property = "SEC", column = "SEC")
)
@Select("""<script>
   SELECT * FROM bo_act_sso_system
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:bo_act_sso_system_dto):bo_act_sso_system_dto?
                


@Insert("""<script>
    insert into bo_act_sso_system
    (ID,ORGID,BINDID,CREATEDATE,CREATEUSER,UPDATEDATE,UPDATEUSER,PROCESSDEFID,ISEND,SSONAME,MEMO,ICON32,ICON96,LOGINURL,SUBMITTYPE,LOGINTARGET,ISACTIVE,ORDERINDEX,ACCESSKEY,SEC)
    values
    (#{ID},#{ORGID},#{BINDID},#{CREATEDATE},#{CREATEUSER},#{UPDATEDATE},#{UPDATEUSER},#{PROCESSDEFID},#{ISEND},#{SSONAME},#{MEMO},#{ICON32},#{ICON96},#{LOGINURL},#{SUBMITTYPE},#{LOGINTARGET},#{ISACTIVE},#{ORDERINDEX},#{ACCESSKEY},#{SEC})
</script>""")
fun Insert(model:bo_act_sso_system_dto):Unit
                


@Insert("""<script>
    insert into bo_act_sso_system
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
        <if test='SSONAME!= null'> 
           SSONAME,
        </if>
        <if test='MEMO!= null'> 
           MEMO,
        </if>
        <if test='ICON32!= null'> 
           ICON32,
        </if>
        <if test='ICON96!= null'> 
           ICON96,
        </if>
        <if test='LOGINURL!= null'> 
           LOGINURL,
        </if>
        <if test='SUBMITTYPE!= null'> 
           SUBMITTYPE,
        </if>
        <if test='LOGINTARGET!= null'> 
           LOGINTARGET,
        </if>
        <if test='ISACTIVE!= null'> 
           ISACTIVE,
        </if>
        <if test='ORDERINDEX!= null'> 
           ORDERINDEX,
        </if>
        <if test='ACCESSKEY!= null'> 
           ACCESSKEY,
        </if>
        <if test='SEC!= null'> 
           SEC
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
        <if test='SSONAME!= null'> 
           #{SSONAME,jdbcType=varchar}，
        </if>
        <if test='MEMO!= null'> 
           #{MEMO,jdbcType=varchar}，
        </if>
        <if test='ICON32!= null'> 
           #{ICON32,jdbcType=varchar}，
        </if>
        <if test='ICON96!= null'> 
           #{ICON96,jdbcType=varchar}，
        </if>
        <if test='LOGINURL!= null'> 
           #{LOGINURL,jdbcType=varchar}，
        </if>
        <if test='SUBMITTYPE!= null'> 
           #{SUBMITTYPE,jdbcType=varchar}，
        </if>
        <if test='LOGINTARGET!= null'> 
           #{LOGINTARGET,jdbcType=varchar}，
        </if>
        <if test='ISACTIVE!= null'> 
           #{ISACTIVE,jdbcType=decimal}，
        </if>
        <if test='ORDERINDEX!= null'> 
           #{ORDERINDEX,jdbcType=decimal}，
        </if>
        <if test='ACCESSKEY!= null'> 
           #{ACCESSKEY,jdbcType=varchar}，
        </if>
        <if test='SEC!= null'> 
           #{SEC,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:bo_act_sso_system_dto):Unit
                


@Delete("DELETE FROM bo_act_sso_system WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE bo_act_sso_system SET
        ID=#{ID,jdbcType=String},
        ORGID=#{ORGID,jdbcType=String},
        BINDID=#{BINDID,jdbcType=String},
        CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp},
        UPDATEUSER=#{UPDATEUSER,jdbcType=String},
        PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},
        ISEND=#{ISEND,jdbcType=Integer},
        SSONAME=#{SSONAME,jdbcType=String},
        MEMO=#{MEMO,jdbcType=String},
        ICON32=#{ICON32,jdbcType=String},
        ICON96=#{ICON96,jdbcType=String},
        LOGINURL=#{LOGINURL,jdbcType=String},
        SUBMITTYPE=#{SUBMITTYPE,jdbcType=String},
        LOGINTARGET=#{LOGINTARGET,jdbcType=String},
        ISACTIVE=#{ISACTIVE,jdbcType=BigDecimal},
        ORDERINDEX=#{ORDERINDEX,jdbcType=BigDecimal},
        ACCESSKEY=#{ACCESSKEY,jdbcType=String},
        SEC=#{SEC,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:bo_act_sso_system_dto)
        

@Update("""<script>
            UPDATE bo_act_sso_system SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="ORGID != null">  ORGID=#{ORGID,jdbcType=String},</if>
        <if test="BINDID != null">  BINDID=#{BINDID,jdbcType=String},</if>
        <if test="CREATEDATE != null">  CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="UPDATEDATE != null">  UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp},</if>
        <if test="UPDATEUSER != null">  UPDATEUSER=#{UPDATEUSER,jdbcType=String},</if>
        <if test="PROCESSDEFID != null">  PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},</if>
        <if test="ISEND != null">  ISEND=#{ISEND,jdbcType=Integer},</if>
        <if test="SSONAME != null">  SSONAME=#{SSONAME,jdbcType=String},</if>
        <if test="MEMO != null">  MEMO=#{MEMO,jdbcType=String},</if>
        <if test="ICON32 != null">  ICON32=#{ICON32,jdbcType=String},</if>
        <if test="ICON96 != null">  ICON96=#{ICON96,jdbcType=String},</if>
        <if test="LOGINURL != null">  LOGINURL=#{LOGINURL,jdbcType=String},</if>
        <if test="SUBMITTYPE != null">  SUBMITTYPE=#{SUBMITTYPE,jdbcType=String},</if>
        <if test="LOGINTARGET != null">  LOGINTARGET=#{LOGINTARGET,jdbcType=String},</if>
        <if test="ISACTIVE != null">  ISACTIVE=#{ISACTIVE,jdbcType=BigDecimal},</if>
        <if test="ORDERINDEX != null">  ORDERINDEX=#{ORDERINDEX,jdbcType=BigDecimal},</if>
        <if test="ACCESSKEY != null">  ACCESSKEY=#{ACCESSKEY,jdbcType=String},</if>
        <if test="SEC != null">  SEC=#{SEC,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:bo_act_sso_system_dto)
            

}

        
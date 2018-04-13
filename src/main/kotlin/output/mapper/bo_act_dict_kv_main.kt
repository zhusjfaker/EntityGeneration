

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_act_dict_kv_main{


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
   Result(property = "DICTNAME", column = "DICTNAME"),
   Result(property = "DICTKEY", column = "DICTKEY"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "ISCACHE", column = "ISCACHE"),
   Result(property = "ISSYS", column = "ISSYS"),
   Result(property = "ISTREE", column = "ISTREE"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "DICTMETA", column = "DICTMETA"),
   Result(property = "DICTCATEGORY", column = "DICTCATEGORY"),
   Result(property = "COMPONENTSETTING", column = "COMPONENTSETTING")
)
@Select("""<script>
   SELECT * FROM bo_act_dict_kv_main
</script>""")
fun GetListAll():ArrayList<bo_act_dict_kv_main_dto>
        


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
   Result(property = "DICTNAME", column = "DICTNAME"),
   Result(property = "DICTKEY", column = "DICTKEY"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "ISCACHE", column = "ISCACHE"),
   Result(property = "ISSYS", column = "ISSYS"),
   Result(property = "ISTREE", column = "ISTREE"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "DICTMETA", column = "DICTMETA"),
   Result(property = "DICTCATEGORY", column = "DICTCATEGORY"),
   Result(property = "COMPONENTSETTING", column = "COMPONENTSETTING")
)
@Select("""<script>
   SELECT * FROM bo_act_dict_kv_main
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
   <if test="DICTNAME!=null">
      DICTNAME=#{DICTNAME}
   </if> 
   <if test="DICTKEY!=null">
      DICTKEY=#{DICTKEY}
   </if> 
   <if test="APPID!=null">
      APPID=#{APPID}
   </if> 
   <if test="ISCACHE!=null">
      ISCACHE=#{ISCACHE}
   </if> 
   <if test="ISSYS!=null">
      ISSYS=#{ISSYS}
   </if> 
   <if test="ISTREE!=null">
      ISTREE=#{ISTREE}
   </if> 
   <if test="MEMO!=null">
      MEMO=#{MEMO}
   </if> 
   <if test="DICTMETA!=null">
      DICTMETA=#{DICTMETA}
   </if> 
   <if test="DICTCATEGORY!=null">
      DICTCATEGORY=#{DICTCATEGORY}
   </if> 
   <if test="COMPONENTSETTING!=null">
      COMPONENTSETTING=#{COMPONENTSETTING}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:bo_act_dict_kv_main_dto):ArrayList<bo_act_dict_kv_main_dto>
                


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
   Result(property = "DICTNAME", column = "DICTNAME"),
   Result(property = "DICTKEY", column = "DICTKEY"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "ISCACHE", column = "ISCACHE"),
   Result(property = "ISSYS", column = "ISSYS"),
   Result(property = "ISTREE", column = "ISTREE"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "DICTMETA", column = "DICTMETA"),
   Result(property = "DICTCATEGORY", column = "DICTCATEGORY"),
   Result(property = "COMPONENTSETTING", column = "COMPONENTSETTING")
)
@Select("""<script>
   SELECT * FROM bo_act_dict_kv_main
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:bo_act_dict_kv_main_dto):bo_act_dict_kv_main_dto?
                


@Insert("""<script>
    insert into bo_act_dict_kv_main
    (ID,ORGID,BINDID,CREATEDATE,CREATEUSER,UPDATEDATE,UPDATEUSER,PROCESSDEFID,ISEND,DICTNAME,DICTKEY,APPID,ISCACHE,ISSYS,ISTREE,MEMO,DICTMETA,DICTCATEGORY,COMPONENTSETTING)
    values
    (#{ID},#{ORGID},#{BINDID},#{CREATEDATE},#{CREATEUSER},#{UPDATEDATE},#{UPDATEUSER},#{PROCESSDEFID},#{ISEND},#{DICTNAME},#{DICTKEY},#{APPID},#{ISCACHE},#{ISSYS},#{ISTREE},#{MEMO},#{DICTMETA},#{DICTCATEGORY},#{COMPONENTSETTING})
</script>""")
fun Insert(model:bo_act_dict_kv_main_dto):Unit
                


@Insert("""<script>
    insert into bo_act_dict_kv_main
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
        <if test='DICTNAME!= null'> 
           DICTNAME,
        </if>
        <if test='DICTKEY!= null'> 
           DICTKEY,
        </if>
        <if test='APPID!= null'> 
           APPID,
        </if>
        <if test='ISCACHE!= null'> 
           ISCACHE,
        </if>
        <if test='ISSYS!= null'> 
           ISSYS,
        </if>
        <if test='ISTREE!= null'> 
           ISTREE,
        </if>
        <if test='MEMO!= null'> 
           MEMO,
        </if>
        <if test='DICTMETA!= null'> 
           DICTMETA,
        </if>
        <if test='DICTCATEGORY!= null'> 
           DICTCATEGORY,
        </if>
        <if test='COMPONENTSETTING!= null'> 
           COMPONENTSETTING
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
        <if test='DICTNAME!= null'> 
           #{DICTNAME,jdbcType=varchar}，
        </if>
        <if test='DICTKEY!= null'> 
           #{DICTKEY,jdbcType=varchar}，
        </if>
        <if test='APPID!= null'> 
           #{APPID,jdbcType=varchar}，
        </if>
        <if test='ISCACHE!= null'> 
           #{ISCACHE,jdbcType=decimal}，
        </if>
        <if test='ISSYS!= null'> 
           #{ISSYS,jdbcType=decimal}，
        </if>
        <if test='ISTREE!= null'> 
           #{ISTREE,jdbcType=decimal}，
        </if>
        <if test='MEMO!= null'> 
           #{MEMO,jdbcType=varchar}，
        </if>
        <if test='DICTMETA!= null'> 
           #{DICTMETA,jdbcType=text}，
        </if>
        <if test='DICTCATEGORY!= null'> 
           #{DICTCATEGORY,jdbcType=text}，
        </if>
        <if test='COMPONENTSETTING!= null'> 
           #{COMPONENTSETTING,jdbcType=text}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:bo_act_dict_kv_main_dto):Unit
                

}

        
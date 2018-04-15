

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_personaladdress{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "EMAIL", column = "EMAIL"),
   Result(property = "GROUPNAME", column = "GROUPNAME"),
   Result(property = "FAMILYNAME", column = "FAMILYNAME"),
   Result(property = "SUFFIXNAME", column = "SUFFIXNAME"),
   Result(property = "FULLNAME", column = "FULLNAME"),
   Result(property = "PY", column = "PY"),
   Result(property = "PYINDEX", column = "PYINDEX"),
   Result(property = "BCOMPANY", column = "BCOMPANY"),
   Result(property = "BWWW", column = "BWWW"),
   Result(property = "BDEPT", column = "BDEPT"),
   Result(property = "BPOSITION", column = "BPOSITION"),
   Result(property = "BADDRESS", column = "BADDRESS"),
   Result(property = "BPOSTCODE", column = "BPOSTCODE"),
   Result(property = "BCOUNTRY", column = "BCOUNTRY"),
   Result(property = "BCITY", column = "BCITY"),
   Result(property = "BTEL", column = "BTEL"),
   Result(property = "BFAX", column = "BFAX"),
   Result(property = "PPOSTCODE", column = "PPOSTCODE"),
   Result(property = "PADDRESS", column = "PADDRESS"),
   Result(property = "PTEL", column = "PTEL"),
   Result(property = "PFAX", column = "PFAX"),
   Result(property = "PMOB", column = "PMOB"),
   Result(property = "PQQ", column = "PQQ"),
   Result(property = "PWEIBO", column = "PWEIBO"),
   Result(property = "PWEIXIN", column = "PWEIXIN"),
   Result(property = "PSKYPE", column = "PSKYPE"),
   Result(property = "PLIKE", column = "PLIKE"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "UPDATETIME", column = "UPDATETIME"),
   Result(property = "SHARETO", column = "SHARETO")
)
@Select("""<script>
   SELECT * FROM app_act_personaladdress
</script>""")
fun GetListAll():ArrayList<app_act_personaladdress_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "EMAIL", column = "EMAIL"),
   Result(property = "GROUPNAME", column = "GROUPNAME"),
   Result(property = "FAMILYNAME", column = "FAMILYNAME"),
   Result(property = "SUFFIXNAME", column = "SUFFIXNAME"),
   Result(property = "FULLNAME", column = "FULLNAME"),
   Result(property = "PY", column = "PY"),
   Result(property = "PYINDEX", column = "PYINDEX"),
   Result(property = "BCOMPANY", column = "BCOMPANY"),
   Result(property = "BWWW", column = "BWWW"),
   Result(property = "BDEPT", column = "BDEPT"),
   Result(property = "BPOSITION", column = "BPOSITION"),
   Result(property = "BADDRESS", column = "BADDRESS"),
   Result(property = "BPOSTCODE", column = "BPOSTCODE"),
   Result(property = "BCOUNTRY", column = "BCOUNTRY"),
   Result(property = "BCITY", column = "BCITY"),
   Result(property = "BTEL", column = "BTEL"),
   Result(property = "BFAX", column = "BFAX"),
   Result(property = "PPOSTCODE", column = "PPOSTCODE"),
   Result(property = "PADDRESS", column = "PADDRESS"),
   Result(property = "PTEL", column = "PTEL"),
   Result(property = "PFAX", column = "PFAX"),
   Result(property = "PMOB", column = "PMOB"),
   Result(property = "PQQ", column = "PQQ"),
   Result(property = "PWEIBO", column = "PWEIBO"),
   Result(property = "PWEIXIN", column = "PWEIXIN"),
   Result(property = "PSKYPE", column = "PSKYPE"),
   Result(property = "PLIKE", column = "PLIKE"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "UPDATETIME", column = "UPDATETIME"),
   Result(property = "SHARETO", column = "SHARETO")
)
@Select("""<script>
   SELECT * FROM app_act_personaladdress
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="EMAIL!=null">
      EMAIL=#{EMAIL}
   </if> 
   <if test="GROUPNAME!=null">
      GROUPNAME=#{GROUPNAME}
   </if> 
   <if test="FAMILYNAME!=null">
      FAMILYNAME=#{FAMILYNAME}
   </if> 
   <if test="SUFFIXNAME!=null">
      SUFFIXNAME=#{SUFFIXNAME}
   </if> 
   <if test="FULLNAME!=null">
      FULLNAME=#{FULLNAME}
   </if> 
   <if test="PY!=null">
      PY=#{PY}
   </if> 
   <if test="PYINDEX!=null">
      PYINDEX=#{PYINDEX}
   </if> 
   <if test="BCOMPANY!=null">
      BCOMPANY=#{BCOMPANY}
   </if> 
   <if test="BWWW!=null">
      BWWW=#{BWWW}
   </if> 
   <if test="BDEPT!=null">
      BDEPT=#{BDEPT}
   </if> 
   <if test="BPOSITION!=null">
      BPOSITION=#{BPOSITION}
   </if> 
   <if test="BADDRESS!=null">
      BADDRESS=#{BADDRESS}
   </if> 
   <if test="BPOSTCODE!=null">
      BPOSTCODE=#{BPOSTCODE}
   </if> 
   <if test="BCOUNTRY!=null">
      BCOUNTRY=#{BCOUNTRY}
   </if> 
   <if test="BCITY!=null">
      BCITY=#{BCITY}
   </if> 
   <if test="BTEL!=null">
      BTEL=#{BTEL}
   </if> 
   <if test="BFAX!=null">
      BFAX=#{BFAX}
   </if> 
   <if test="PPOSTCODE!=null">
      PPOSTCODE=#{PPOSTCODE}
   </if> 
   <if test="PADDRESS!=null">
      PADDRESS=#{PADDRESS}
   </if> 
   <if test="PTEL!=null">
      PTEL=#{PTEL}
   </if> 
   <if test="PFAX!=null">
      PFAX=#{PFAX}
   </if> 
   <if test="PMOB!=null">
      PMOB=#{PMOB}
   </if> 
   <if test="PQQ!=null">
      PQQ=#{PQQ}
   </if> 
   <if test="PWEIBO!=null">
      PWEIBO=#{PWEIBO}
   </if> 
   <if test="PWEIXIN!=null">
      PWEIXIN=#{PWEIXIN}
   </if> 
   <if test="PSKYPE!=null">
      PSKYPE=#{PSKYPE}
   </if> 
   <if test="PLIKE!=null">
      PLIKE=#{PLIKE}
   </if> 
   <if test="MEMO!=null">
      MEMO=#{MEMO}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   <if test="UPDATETIME!=null">
      UPDATETIME=#{UPDATETIME}
   </if> 
   <if test="SHARETO!=null">
      SHARETO=#{SHARETO}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_personaladdress_dto):ArrayList<app_act_personaladdress_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "EMAIL", column = "EMAIL"),
   Result(property = "GROUPNAME", column = "GROUPNAME"),
   Result(property = "FAMILYNAME", column = "FAMILYNAME"),
   Result(property = "SUFFIXNAME", column = "SUFFIXNAME"),
   Result(property = "FULLNAME", column = "FULLNAME"),
   Result(property = "PY", column = "PY"),
   Result(property = "PYINDEX", column = "PYINDEX"),
   Result(property = "BCOMPANY", column = "BCOMPANY"),
   Result(property = "BWWW", column = "BWWW"),
   Result(property = "BDEPT", column = "BDEPT"),
   Result(property = "BPOSITION", column = "BPOSITION"),
   Result(property = "BADDRESS", column = "BADDRESS"),
   Result(property = "BPOSTCODE", column = "BPOSTCODE"),
   Result(property = "BCOUNTRY", column = "BCOUNTRY"),
   Result(property = "BCITY", column = "BCITY"),
   Result(property = "BTEL", column = "BTEL"),
   Result(property = "BFAX", column = "BFAX"),
   Result(property = "PPOSTCODE", column = "PPOSTCODE"),
   Result(property = "PADDRESS", column = "PADDRESS"),
   Result(property = "PTEL", column = "PTEL"),
   Result(property = "PFAX", column = "PFAX"),
   Result(property = "PMOB", column = "PMOB"),
   Result(property = "PQQ", column = "PQQ"),
   Result(property = "PWEIBO", column = "PWEIBO"),
   Result(property = "PWEIXIN", column = "PWEIXIN"),
   Result(property = "PSKYPE", column = "PSKYPE"),
   Result(property = "PLIKE", column = "PLIKE"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "UPDATETIME", column = "UPDATETIME"),
   Result(property = "SHARETO", column = "SHARETO")
)
@Select("""<script>
   SELECT * FROM app_act_personaladdress
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_personaladdress_dto):app_act_personaladdress_dto?
                


@Insert("""<script>
    insert into app_act_personaladdress
    (ID,USERID,EMAIL,GROUPNAME,FAMILYNAME,SUFFIXNAME,FULLNAME,PY,PYINDEX,BCOMPANY,BWWW,BDEPT,BPOSITION,BADDRESS,BPOSTCODE,BCOUNTRY,BCITY,BTEL,BFAX,PPOSTCODE,PADDRESS,PTEL,PFAX,PMOB,PQQ,PWEIBO,PWEIXIN,PSKYPE,PLIKE,MEMO,CREATEUSER,CREATETIME,UPDATETIME,SHARETO)
    values
    (#{ID},#{USERID},#{EMAIL},#{GROUPNAME},#{FAMILYNAME},#{SUFFIXNAME},#{FULLNAME},#{PY},#{PYINDEX},#{BCOMPANY},#{BWWW},#{BDEPT},#{BPOSITION},#{BADDRESS},#{BPOSTCODE},#{BCOUNTRY},#{BCITY},#{BTEL},#{BFAX},#{PPOSTCODE},#{PADDRESS},#{PTEL},#{PFAX},#{PMOB},#{PQQ},#{PWEIBO},#{PWEIXIN},#{PSKYPE},#{PLIKE},#{MEMO},#{CREATEUSER},#{CREATETIME},#{UPDATETIME},#{SHARETO})
</script>""")
fun Insert(model:app_act_personaladdress_dto):Unit
                


@Insert("""<script>
    insert into app_act_personaladdress
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
           USERID,
        <if test='EMAIL!= null'> 
           EMAIL,
        </if>
        <if test='GROUPNAME!= null'> 
           GROUPNAME,
        </if>
        <if test='FAMILYNAME!= null'> 
           FAMILYNAME,
        </if>
        <if test='SUFFIXNAME!= null'> 
           SUFFIXNAME,
        </if>
        <if test='FULLNAME!= null'> 
           FULLNAME,
        </if>
        <if test='PY!= null'> 
           PY,
        </if>
        <if test='PYINDEX!= null'> 
           PYINDEX,
        </if>
        <if test='BCOMPANY!= null'> 
           BCOMPANY,
        </if>
        <if test='BWWW!= null'> 
           BWWW,
        </if>
        <if test='BDEPT!= null'> 
           BDEPT,
        </if>
        <if test='BPOSITION!= null'> 
           BPOSITION,
        </if>
        <if test='BADDRESS!= null'> 
           BADDRESS,
        </if>
        <if test='BPOSTCODE!= null'> 
           BPOSTCODE,
        </if>
        <if test='BCOUNTRY!= null'> 
           BCOUNTRY,
        </if>
        <if test='BCITY!= null'> 
           BCITY,
        </if>
        <if test='BTEL!= null'> 
           BTEL,
        </if>
        <if test='BFAX!= null'> 
           BFAX,
        </if>
        <if test='PPOSTCODE!= null'> 
           PPOSTCODE,
        </if>
        <if test='PADDRESS!= null'> 
           PADDRESS,
        </if>
        <if test='PTEL!= null'> 
           PTEL,
        </if>
        <if test='PFAX!= null'> 
           PFAX,
        </if>
        <if test='PMOB!= null'> 
           PMOB,
        </if>
        <if test='PQQ!= null'> 
           PQQ,
        </if>
        <if test='PWEIBO!= null'> 
           PWEIBO,
        </if>
        <if test='PWEIXIN!= null'> 
           PWEIXIN,
        </if>
        <if test='PSKYPE!= null'> 
           PSKYPE,
        </if>
        <if test='PLIKE!= null'> 
           PLIKE,
        </if>
        <if test='MEMO!= null'> 
           MEMO,
        </if>
           CREATEUSER,
        <if test='CREATETIME!= null'> 
           CREATETIME,
        </if>
        <if test='UPDATETIME!= null'> 
           UPDATETIME,
        </if>
        <if test='SHARETO!= null'> 
           SHARETO
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
           #{USERID,jdbcType=varchar}，
        <if test='EMAIL!= null'> 
           #{EMAIL,jdbcType=varchar}，
        </if>
        <if test='GROUPNAME!= null'> 
           #{GROUPNAME,jdbcType=varchar}，
        </if>
        <if test='FAMILYNAME!= null'> 
           #{FAMILYNAME,jdbcType=varchar}，
        </if>
        <if test='SUFFIXNAME!= null'> 
           #{SUFFIXNAME,jdbcType=varchar}，
        </if>
        <if test='FULLNAME!= null'> 
           #{FULLNAME,jdbcType=varchar}，
        </if>
        <if test='PY!= null'> 
           #{PY,jdbcType=varchar}，
        </if>
        <if test='PYINDEX!= null'> 
           #{PYINDEX,jdbcType=varchar}，
        </if>
        <if test='BCOMPANY!= null'> 
           #{BCOMPANY,jdbcType=varchar}，
        </if>
        <if test='BWWW!= null'> 
           #{BWWW,jdbcType=varchar}，
        </if>
        <if test='BDEPT!= null'> 
           #{BDEPT,jdbcType=varchar}，
        </if>
        <if test='BPOSITION!= null'> 
           #{BPOSITION,jdbcType=varchar}，
        </if>
        <if test='BADDRESS!= null'> 
           #{BADDRESS,jdbcType=varchar}，
        </if>
        <if test='BPOSTCODE!= null'> 
           #{BPOSTCODE,jdbcType=char}，
        </if>
        <if test='BCOUNTRY!= null'> 
           #{BCOUNTRY,jdbcType=varchar}，
        </if>
        <if test='BCITY!= null'> 
           #{BCITY,jdbcType=varchar}，
        </if>
        <if test='BTEL!= null'> 
           #{BTEL,jdbcType=varchar}，
        </if>
        <if test='BFAX!= null'> 
           #{BFAX,jdbcType=varchar}，
        </if>
        <if test='PPOSTCODE!= null'> 
           #{PPOSTCODE,jdbcType=char}，
        </if>
        <if test='PADDRESS!= null'> 
           #{PADDRESS,jdbcType=varchar}，
        </if>
        <if test='PTEL!= null'> 
           #{PTEL,jdbcType=varchar}，
        </if>
        <if test='PFAX!= null'> 
           #{PFAX,jdbcType=varchar}，
        </if>
        <if test='PMOB!= null'> 
           #{PMOB,jdbcType=varchar}，
        </if>
        <if test='PQQ!= null'> 
           #{PQQ,jdbcType=varchar}，
        </if>
        <if test='PWEIBO!= null'> 
           #{PWEIBO,jdbcType=varchar}，
        </if>
        <if test='PWEIXIN!= null'> 
           #{PWEIXIN,jdbcType=varchar}，
        </if>
        <if test='PSKYPE!= null'> 
           #{PSKYPE,jdbcType=varchar}，
        </if>
        <if test='PLIKE!= null'> 
           #{PLIKE,jdbcType=varchar}，
        </if>
        <if test='MEMO!= null'> 
           #{MEMO,jdbcType=text}，
        </if>
           #{CREATEUSER,jdbcType=varchar}，
        <if test='CREATETIME!= null'> 
           #{CREATETIME,jdbcType=datetime}，
        </if>
        <if test='UPDATETIME!= null'> 
           #{UPDATETIME,jdbcType=datetime}，
        </if>
        <if test='SHARETO!= null'> 
           #{SHARETO,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_personaladdress_dto):Unit
                


@Delete("DELETE FROM app_act_personaladdress WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE app_act_personaladdress SET
        ID=#{ID,jdbcType=String},
        USERID=#{USERID,jdbcType=String},
        EMAIL=#{EMAIL,jdbcType=String},
        GROUPNAME=#{GROUPNAME,jdbcType=String},
        FAMILYNAME=#{FAMILYNAME,jdbcType=String},
        SUFFIXNAME=#{SUFFIXNAME,jdbcType=String},
        FULLNAME=#{FULLNAME,jdbcType=String},
        PY=#{PY,jdbcType=String},
        PYINDEX=#{PYINDEX,jdbcType=String},
        BCOMPANY=#{BCOMPANY,jdbcType=String},
        BWWW=#{BWWW,jdbcType=String},
        BDEPT=#{BDEPT,jdbcType=String},
        BPOSITION=#{BPOSITION,jdbcType=String},
        BADDRESS=#{BADDRESS,jdbcType=String},
        BPOSTCODE=#{BPOSTCODE,jdbcType=String},
        BCOUNTRY=#{BCOUNTRY,jdbcType=String},
        BCITY=#{BCITY,jdbcType=String},
        BTEL=#{BTEL,jdbcType=String},
        BFAX=#{BFAX,jdbcType=String},
        PPOSTCODE=#{PPOSTCODE,jdbcType=String},
        PADDRESS=#{PADDRESS,jdbcType=String},
        PTEL=#{PTEL,jdbcType=String},
        PFAX=#{PFAX,jdbcType=String},
        PMOB=#{PMOB,jdbcType=String},
        PQQ=#{PQQ,jdbcType=String},
        PWEIBO=#{PWEIBO,jdbcType=String},
        PWEIXIN=#{PWEIXIN,jdbcType=String},
        PSKYPE=#{PSKYPE,jdbcType=String},
        PLIKE=#{PLIKE,jdbcType=String},
        MEMO=#{MEMO,jdbcType=String},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        CREATETIME=#{CREATETIME,jdbcType=Timestamp},
        UPDATETIME=#{UPDATETIME,jdbcType=Timestamp},
        SHARETO=#{SHARETO,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:app_act_personaladdress_dto)
        

@Update("""<script>
            UPDATE app_act_personaladdress SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="USERID != null">  USERID=#{USERID,jdbcType=String},</if>
        <if test="EMAIL != null">  EMAIL=#{EMAIL,jdbcType=String},</if>
        <if test="GROUPNAME != null">  GROUPNAME=#{GROUPNAME,jdbcType=String},</if>
        <if test="FAMILYNAME != null">  FAMILYNAME=#{FAMILYNAME,jdbcType=String},</if>
        <if test="SUFFIXNAME != null">  SUFFIXNAME=#{SUFFIXNAME,jdbcType=String},</if>
        <if test="FULLNAME != null">  FULLNAME=#{FULLNAME,jdbcType=String},</if>
        <if test="PY != null">  PY=#{PY,jdbcType=String},</if>
        <if test="PYINDEX != null">  PYINDEX=#{PYINDEX,jdbcType=String},</if>
        <if test="BCOMPANY != null">  BCOMPANY=#{BCOMPANY,jdbcType=String},</if>
        <if test="BWWW != null">  BWWW=#{BWWW,jdbcType=String},</if>
        <if test="BDEPT != null">  BDEPT=#{BDEPT,jdbcType=String},</if>
        <if test="BPOSITION != null">  BPOSITION=#{BPOSITION,jdbcType=String},</if>
        <if test="BADDRESS != null">  BADDRESS=#{BADDRESS,jdbcType=String},</if>
        <if test="BPOSTCODE != null">  BPOSTCODE=#{BPOSTCODE,jdbcType=String},</if>
        <if test="BCOUNTRY != null">  BCOUNTRY=#{BCOUNTRY,jdbcType=String},</if>
        <if test="BCITY != null">  BCITY=#{BCITY,jdbcType=String},</if>
        <if test="BTEL != null">  BTEL=#{BTEL,jdbcType=String},</if>
        <if test="BFAX != null">  BFAX=#{BFAX,jdbcType=String},</if>
        <if test="PPOSTCODE != null">  PPOSTCODE=#{PPOSTCODE,jdbcType=String},</if>
        <if test="PADDRESS != null">  PADDRESS=#{PADDRESS,jdbcType=String},</if>
        <if test="PTEL != null">  PTEL=#{PTEL,jdbcType=String},</if>
        <if test="PFAX != null">  PFAX=#{PFAX,jdbcType=String},</if>
        <if test="PMOB != null">  PMOB=#{PMOB,jdbcType=String},</if>
        <if test="PQQ != null">  PQQ=#{PQQ,jdbcType=String},</if>
        <if test="PWEIBO != null">  PWEIBO=#{PWEIBO,jdbcType=String},</if>
        <if test="PWEIXIN != null">  PWEIXIN=#{PWEIXIN,jdbcType=String},</if>
        <if test="PSKYPE != null">  PSKYPE=#{PSKYPE,jdbcType=String},</if>
        <if test="PLIKE != null">  PLIKE=#{PLIKE,jdbcType=String},</if>
        <if test="MEMO != null">  MEMO=#{MEMO,jdbcType=String},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="CREATETIME != null">  CREATETIME=#{CREATETIME,jdbcType=Timestamp},</if>
        <if test="UPDATETIME != null">  UPDATETIME=#{UPDATETIME,jdbcType=Timestamp},</if>
        <if test="SHARETO != null">  SHARETO=#{SHARETO,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:app_act_personaladdress_dto)
            

}

        
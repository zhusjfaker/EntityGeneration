

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_act_rong_talk{


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
   Result(property = "USERID", column = "USERID"),
   Result(property = "RECEIVEID", column = "RECEIVEID"),
   Result(property = "NAME", column = "NAME"),
   Result(property = "DIALOG", column = "DIALOG"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5")
)
@Select("""<script>
   SELECT * FROM bo_act_rong_talk
</script>""")
fun GetListAll():ArrayList<bo_act_rong_talk_dto>
        


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
   Result(property = "USERID", column = "USERID"),
   Result(property = "RECEIVEID", column = "RECEIVEID"),
   Result(property = "NAME", column = "NAME"),
   Result(property = "DIALOG", column = "DIALOG"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5")
)
@Select("""<script>
   SELECT * FROM bo_act_rong_talk
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
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="RECEIVEID!=null">
      RECEIVEID=#{RECEIVEID}
   </if> 
   <if test="NAME!=null">
      NAME=#{NAME}
   </if> 
   <if test="DIALOG!=null">
      DIALOG=#{DIALOG}
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
   <if test="EXT5!=null">
      EXT5=#{EXT5}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:bo_act_rong_talk_dto):ArrayList<bo_act_rong_talk_dto>
                


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
   Result(property = "USERID", column = "USERID"),
   Result(property = "RECEIVEID", column = "RECEIVEID"),
   Result(property = "NAME", column = "NAME"),
   Result(property = "DIALOG", column = "DIALOG"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5")
)
@Select("""<script>
   SELECT * FROM bo_act_rong_talk
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:bo_act_rong_talk_dto):bo_act_rong_talk_dto?
                


@Insert("""<script>
    insert into bo_act_rong_talk
    (ID,ORGID,BINDID,CREATEDATE,CREATEUSER,UPDATEDATE,UPDATEUSER,PROCESSDEFID,ISEND,USERID,RECEIVEID,NAME,DIALOG,EXT1,EXT2,EXT3,EXT4,EXT5)
    values
    (#{ID},#{ORGID},#{BINDID},#{CREATEDATE},#{CREATEUSER},#{UPDATEDATE},#{UPDATEUSER},#{PROCESSDEFID},#{ISEND},#{USERID},#{RECEIVEID},#{NAME},#{DIALOG},#{EXT1},#{EXT2},#{EXT3},#{EXT4},#{EXT5})
</script>""")
fun Insert(model:bo_act_rong_talk_dto):Unit
                


@Insert("""<script>
    insert into bo_act_rong_talk
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
        <if test='USERID!= null'> 
           USERID,
        </if>
        <if test='RECEIVEID!= null'> 
           RECEIVEID,
        </if>
        <if test='NAME!= null'> 
           NAME,
        </if>
        <if test='DIALOG!= null'> 
           DIALOG,
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
        <if test='EXT5!= null'> 
           EXT5
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
        <if test='USERID!= null'> 
           #{USERID,jdbcType=varchar}，
        </if>
        <if test='RECEIVEID!= null'> 
           #{RECEIVEID,jdbcType=varchar}，
        </if>
        <if test='NAME!= null'> 
           #{NAME,jdbcType=varchar}，
        </if>
        <if test='DIALOG!= null'> 
           #{DIALOG,jdbcType=text}，
        </if>
        <if test='EXT1!= null'> 
           #{EXT1,jdbcType=text}，
        </if>
        <if test='EXT2!= null'> 
           #{EXT2,jdbcType=text}，
        </if>
        <if test='EXT3!= null'> 
           #{EXT3,jdbcType=text}，
        </if>
        <if test='EXT4!= null'> 
           #{EXT4,jdbcType=text}，
        </if>
        <if test='EXT5!= null'> 
           #{EXT5,jdbcType=text}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:bo_act_rong_talk_dto):Unit
                


@Delete("DELETE FROM bo_act_rong_talk WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE bo_act_rong_talk SET
        ID=#{ID,jdbcType=String},
        ORGID=#{ORGID,jdbcType=String},
        BINDID=#{BINDID,jdbcType=String},
        CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp},
        UPDATEUSER=#{UPDATEUSER,jdbcType=String},
        PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},
        ISEND=#{ISEND,jdbcType=Integer},
        USERID=#{USERID,jdbcType=String},
        RECEIVEID=#{RECEIVEID,jdbcType=String},
        NAME=#{NAME,jdbcType=String},
        DIALOG=#{DIALOG,jdbcType=String},
        EXT1=#{EXT1,jdbcType=String},
        EXT2=#{EXT2,jdbcType=String},
        EXT3=#{EXT3,jdbcType=String},
        EXT4=#{EXT4,jdbcType=String},
        EXT5=#{EXT5,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:bo_act_rong_talk_dto)
        

@Update("""<script>
            UPDATE bo_act_rong_talk SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="ORGID != null">  ORGID=#{ORGID,jdbcType=String},</if>
        <if test="BINDID != null">  BINDID=#{BINDID,jdbcType=String},</if>
        <if test="CREATEDATE != null">  CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="UPDATEDATE != null">  UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp},</if>
        <if test="UPDATEUSER != null">  UPDATEUSER=#{UPDATEUSER,jdbcType=String},</if>
        <if test="PROCESSDEFID != null">  PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},</if>
        <if test="ISEND != null">  ISEND=#{ISEND,jdbcType=Integer},</if>
        <if test="USERID != null">  USERID=#{USERID,jdbcType=String},</if>
        <if test="RECEIVEID != null">  RECEIVEID=#{RECEIVEID,jdbcType=String},</if>
        <if test="NAME != null">  NAME=#{NAME,jdbcType=String},</if>
        <if test="DIALOG != null">  DIALOG=#{DIALOG,jdbcType=String},</if>
        <if test="EXT1 != null">  EXT1=#{EXT1,jdbcType=String},</if>
        <if test="EXT2 != null">  EXT2=#{EXT2,jdbcType=String},</if>
        <if test="EXT3 != null">  EXT3=#{EXT3,jdbcType=String},</if>
        <if test="EXT4 != null">  EXT4=#{EXT4,jdbcType=String},</if>
        <if test="EXT5 != null">  EXT5=#{EXT5,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:bo_act_rong_talk_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_act_rong_talk{


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
   Result(property = "USERID", column = "USERID"),
   Result(property = "RECEIVEID", column = "RECEIVEID"),
   Result(property = "NAME", column = "NAME"),
   Result(property = "DIALOG", column = "DIALOG"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5")
)
@Select("""<script>
   SELECT * FROM bo_act_rong_talk
</script>""")
fun GetListAll():ArrayList<bo_act_rong_talk_dto>
        


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
   Result(property = "USERID", column = "USERID"),
   Result(property = "RECEIVEID", column = "RECEIVEID"),
   Result(property = "NAME", column = "NAME"),
   Result(property = "DIALOG", column = "DIALOG"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5")
)
@Select("""<script>
   SELECT * FROM bo_act_rong_talk
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
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="RECEIVEID!=null">
      RECEIVEID=#{RECEIVEID}
   </if> 
   <if test="NAME!=null">
      NAME=#{NAME}
   </if> 
   <if test="DIALOG!=null">
      DIALOG=#{DIALOG}
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
   <if test="EXT5!=null">
      EXT5=#{EXT5}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:bo_act_rong_talk_dto):ArrayList<bo_act_rong_talk_dto>
                


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
   Result(property = "USERID", column = "USERID"),
   Result(property = "RECEIVEID", column = "RECEIVEID"),
   Result(property = "NAME", column = "NAME"),
   Result(property = "DIALOG", column = "DIALOG"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5")
)
@Select("""<script>
   SELECT * FROM bo_act_rong_talk
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:bo_act_rong_talk_dto):bo_act_rong_talk_dto?
                


@Insert("""<script>
    insert into bo_act_rong_talk
    (ID,ORGID,BINDID,CREATEDATE,CREATEUSER,UPDATEDATE,UPDATEUSER,PROCESSDEFID,ISEND,USERID,RECEIVEID,NAME,DIALOG,EXT1,EXT2,EXT3,EXT4,EXT5)
    values
    (#{ID},#{ORGID},#{BINDID},#{CREATEDATE},#{CREATEUSER},#{UPDATEDATE},#{UPDATEUSER},#{PROCESSDEFID},#{ISEND},#{USERID},#{RECEIVEID},#{NAME},#{DIALOG},#{EXT1},#{EXT2},#{EXT3},#{EXT4},#{EXT5})
</script>""")
fun Insert(model:bo_act_rong_talk_dto):Unit
                


@Insert("""<script>
    insert into bo_act_rong_talk
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
        <if test='USERID!= null'> 
           USERID,
        </if>
        <if test='RECEIVEID!= null'> 
           RECEIVEID,
        </if>
        <if test='NAME!= null'> 
           NAME,
        </if>
        <if test='DIALOG!= null'> 
           DIALOG,
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
        <if test='EXT5!= null'> 
           EXT5
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
        <if test='USERID!= null'> 
           #{USERID,jdbcType=varchar}，
        </if>
        <if test='RECEIVEID!= null'> 
           #{RECEIVEID,jdbcType=varchar}，
        </if>
        <if test='NAME!= null'> 
           #{NAME,jdbcType=varchar}，
        </if>
        <if test='DIALOG!= null'> 
           #{DIALOG,jdbcType=text}，
        </if>
        <if test='EXT1!= null'> 
           #{EXT1,jdbcType=text}，
        </if>
        <if test='EXT2!= null'> 
           #{EXT2,jdbcType=text}，
        </if>
        <if test='EXT3!= null'> 
           #{EXT3,jdbcType=text}，
        </if>
        <if test='EXT4!= null'> 
           #{EXT4,jdbcType=text}，
        </if>
        <if test='EXT5!= null'> 
           #{EXT5,jdbcType=text}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:bo_act_rong_talk_dto):Unit
                


@Delete("DELETE FROM bo_act_rong_talk WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE bo_act_rong_talk SET
        ID=#{ID,jdbcType=String},
        ORGID=#{ORGID,jdbcType=String},
        BINDID=#{BINDID,jdbcType=String},
        CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp},
        UPDATEUSER=#{UPDATEUSER,jdbcType=String},
        PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},
        ISEND=#{ISEND,jdbcType=Integer},
        USERID=#{USERID,jdbcType=String},
        RECEIVEID=#{RECEIVEID,jdbcType=String},
        NAME=#{NAME,jdbcType=String},
        DIALOG=#{DIALOG,jdbcType=String},
        EXT1=#{EXT1,jdbcType=String},
        EXT2=#{EXT2,jdbcType=String},
        EXT3=#{EXT3,jdbcType=String},
        EXT4=#{EXT4,jdbcType=String},
        EXT5=#{EXT5,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:bo_act_rong_talk_dto)
        

@Update("""<script>
            UPDATE bo_act_rong_talk SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="ORGID != null">  ORGID=#{ORGID,jdbcType=String},</if>
        <if test="BINDID != null">  BINDID=#{BINDID,jdbcType=String},</if>
        <if test="CREATEDATE != null">  CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="UPDATEDATE != null">  UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp},</if>
        <if test="UPDATEUSER != null">  UPDATEUSER=#{UPDATEUSER,jdbcType=String},</if>
        <if test="PROCESSDEFID != null">  PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},</if>
        <if test="ISEND != null">  ISEND=#{ISEND,jdbcType=Integer},</if>
        <if test="USERID != null">  USERID=#{USERID,jdbcType=String},</if>
        <if test="RECEIVEID != null">  RECEIVEID=#{RECEIVEID,jdbcType=String},</if>
        <if test="NAME != null">  NAME=#{NAME,jdbcType=String},</if>
        <if test="DIALOG != null">  DIALOG=#{DIALOG,jdbcType=String},</if>
        <if test="EXT1 != null">  EXT1=#{EXT1,jdbcType=String},</if>
        <if test="EXT2 != null">  EXT2=#{EXT2,jdbcType=String},</if>
        <if test="EXT3 != null">  EXT3=#{EXT3,jdbcType=String},</if>
        <if test="EXT4 != null">  EXT4=#{EXT4,jdbcType=String},</if>
        <if test="EXT5 != null">  EXT5=#{EXT5,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:bo_act_rong_talk_dto)
            

}

        
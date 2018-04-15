

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_ss_gsort{


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
   Result(property = "GSCODE", column = "GSCODE"),
   Result(property = "GSNAME", column = "GSNAME"),
   Result(property = "UPCODE", column = "UPCODE"),
   Result(property = "ISEND1", column = "ISEND1"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "GTYPE", column = "GTYPE"),
   Result(property = "PARENTID", column = "PARENTID"),
   Result(property = "STATUS1", column = "STATUS1"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4")
)
@Select("""<script>
   SELECT * FROM bo_ss_gsort
</script>""")
fun GetListAll():ArrayList<bo_ss_gsort_dto>
        


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
   Result(property = "GSCODE", column = "GSCODE"),
   Result(property = "GSNAME", column = "GSNAME"),
   Result(property = "UPCODE", column = "UPCODE"),
   Result(property = "ISEND1", column = "ISEND1"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "GTYPE", column = "GTYPE"),
   Result(property = "PARENTID", column = "PARENTID"),
   Result(property = "STATUS1", column = "STATUS1"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4")
)
@Select("""<script>
   SELECT * FROM bo_ss_gsort
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
   <if test="GSCODE!=null">
      GSCODE=#{GSCODE}
   </if> 
   <if test="GSNAME!=null">
      GSNAME=#{GSNAME}
   </if> 
   <if test="UPCODE!=null">
      UPCODE=#{UPCODE}
   </if> 
   <if test="ISEND1!=null">
      ISEND1=#{ISEND1}
   </if> 
   <if test="MEMO!=null">
      MEMO=#{MEMO}
   </if> 
   <if test="GTYPE!=null">
      GTYPE=#{GTYPE}
   </if> 
   <if test="PARENTID!=null">
      PARENTID=#{PARENTID}
   </if> 
   <if test="STATUS1!=null">
      STATUS1=#{STATUS1}
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
   </where>
</script>""")
fun ConditionalQuery(model:bo_ss_gsort_dto):ArrayList<bo_ss_gsort_dto>
                


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
   Result(property = "GSCODE", column = "GSCODE"),
   Result(property = "GSNAME", column = "GSNAME"),
   Result(property = "UPCODE", column = "UPCODE"),
   Result(property = "ISEND1", column = "ISEND1"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "GTYPE", column = "GTYPE"),
   Result(property = "PARENTID", column = "PARENTID"),
   Result(property = "STATUS1", column = "STATUS1"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4")
)
@Select("""<script>
   SELECT * FROM bo_ss_gsort
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:bo_ss_gsort_dto):bo_ss_gsort_dto?
                


@Insert("""<script>
    insert into bo_ss_gsort
    (ID,ORGID,BINDID,CREATEDATE,CREATEUSER,UPDATEDATE,UPDATEUSER,PROCESSDEFID,ISEND,GSCODE,GSNAME,UPCODE,ISEND1,MEMO,GTYPE,PARENTID,STATUS1,EXT1,EXT2,EXT3,EXT4)
    values
    (#{ID},#{ORGID},#{BINDID},#{CREATEDATE},#{CREATEUSER},#{UPDATEDATE},#{UPDATEUSER},#{PROCESSDEFID},#{ISEND},#{GSCODE},#{GSNAME},#{UPCODE},#{ISEND1},#{MEMO},#{GTYPE},#{PARENTID},#{STATUS1},#{EXT1},#{EXT2},#{EXT3},#{EXT4})
</script>""")
fun Insert(model:bo_ss_gsort_dto):Unit
                


@Insert("""<script>
    insert into bo_ss_gsort
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
        <if test='GSCODE!= null'> 
           GSCODE,
        </if>
        <if test='GSNAME!= null'> 
           GSNAME,
        </if>
        <if test='UPCODE!= null'> 
           UPCODE,
        </if>
        <if test='ISEND1!= null'> 
           ISEND1,
        </if>
        <if test='MEMO!= null'> 
           MEMO,
        </if>
        <if test='GTYPE!= null'> 
           GTYPE,
        </if>
        <if test='PARENTID!= null'> 
           PARENTID,
        </if>
        <if test='STATUS1!= null'> 
           STATUS1,
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
           EXT4
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
        <if test='GSCODE!= null'> 
           #{GSCODE,jdbcType=varchar}，
        </if>
        <if test='GSNAME!= null'> 
           #{GSNAME,jdbcType=varchar}，
        </if>
        <if test='UPCODE!= null'> 
           #{UPCODE,jdbcType=varchar}，
        </if>
        <if test='ISEND1!= null'> 
           #{ISEND1,jdbcType=varchar}，
        </if>
        <if test='MEMO!= null'> 
           #{MEMO,jdbcType=varchar}，
        </if>
        <if test='GTYPE!= null'> 
           #{GTYPE,jdbcType=varchar}，
        </if>
        <if test='PARENTID!= null'> 
           #{PARENTID,jdbcType=varchar}，
        </if>
        <if test='STATUS1!= null'> 
           #{STATUS1,jdbcType=varchar}，
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
           #{EXT4,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:bo_ss_gsort_dto):Unit
                


@Delete("DELETE FROM bo_ss_gsort WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE bo_ss_gsort SET
        ID=#{ID,jdbcType=String},
        ORGID=#{ORGID,jdbcType=String},
        BINDID=#{BINDID,jdbcType=String},
        CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp},
        UPDATEUSER=#{UPDATEUSER,jdbcType=String},
        PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},
        ISEND=#{ISEND,jdbcType=Integer},
        GSCODE=#{GSCODE,jdbcType=String},
        GSNAME=#{GSNAME,jdbcType=String},
        UPCODE=#{UPCODE,jdbcType=String},
        ISEND1=#{ISEND1,jdbcType=String},
        MEMO=#{MEMO,jdbcType=String},
        GTYPE=#{GTYPE,jdbcType=String},
        PARENTID=#{PARENTID,jdbcType=String},
        STATUS1=#{STATUS1,jdbcType=String},
        EXT1=#{EXT1,jdbcType=String},
        EXT2=#{EXT2,jdbcType=String},
        EXT3=#{EXT3,jdbcType=String},
        EXT4=#{EXT4,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:bo_ss_gsort_dto)
        

@Update("""<script>
            UPDATE bo_ss_gsort SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="ORGID != null">  ORGID=#{ORGID,jdbcType=String},</if>
        <if test="BINDID != null">  BINDID=#{BINDID,jdbcType=String},</if>
        <if test="CREATEDATE != null">  CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="UPDATEDATE != null">  UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp},</if>
        <if test="UPDATEUSER != null">  UPDATEUSER=#{UPDATEUSER,jdbcType=String},</if>
        <if test="PROCESSDEFID != null">  PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},</if>
        <if test="ISEND != null">  ISEND=#{ISEND,jdbcType=Integer},</if>
        <if test="GSCODE != null">  GSCODE=#{GSCODE,jdbcType=String},</if>
        <if test="GSNAME != null">  GSNAME=#{GSNAME,jdbcType=String},</if>
        <if test="UPCODE != null">  UPCODE=#{UPCODE,jdbcType=String},</if>
        <if test="ISEND1 != null">  ISEND1=#{ISEND1,jdbcType=String},</if>
        <if test="MEMO != null">  MEMO=#{MEMO,jdbcType=String},</if>
        <if test="GTYPE != null">  GTYPE=#{GTYPE,jdbcType=String},</if>
        <if test="PARENTID != null">  PARENTID=#{PARENTID,jdbcType=String},</if>
        <if test="STATUS1 != null">  STATUS1=#{STATUS1,jdbcType=String},</if>
        <if test="EXT1 != null">  EXT1=#{EXT1,jdbcType=String},</if>
        <if test="EXT2 != null">  EXT2=#{EXT2,jdbcType=String},</if>
        <if test="EXT3 != null">  EXT3=#{EXT3,jdbcType=String},</if>
        <if test="EXT4 != null">  EXT4=#{EXT4,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:bo_ss_gsort_dto)
            

}

        
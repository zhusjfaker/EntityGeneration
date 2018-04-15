

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_eu_ceshibt{


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
   Result(property = "APPLICANTUSER", column = "APPLICANTUSER"),
   Result(property = "USERNAME", column = "USERNAME"),
   Result(property = "USERDEPT", column = "USERDEPT"),
   Result(property = "SCOPETYPE", column = "SCOPETYPE"),
   Result(property = "SCOPE", column = "SCOPE"),
   Result(property = "BEGIN_TIME", column = "BEGIN_TIME"),
   Result(property = "END_TIME", column = "END_TIME")
)
@Select("""<script>
   SELECT * FROM bo_eu_ceshibt
</script>""")
fun GetListAll():ArrayList<bo_eu_ceshibt_dto>
        


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
   Result(property = "APPLICANTUSER", column = "APPLICANTUSER"),
   Result(property = "USERNAME", column = "USERNAME"),
   Result(property = "USERDEPT", column = "USERDEPT"),
   Result(property = "SCOPETYPE", column = "SCOPETYPE"),
   Result(property = "SCOPE", column = "SCOPE"),
   Result(property = "BEGIN_TIME", column = "BEGIN_TIME"),
   Result(property = "END_TIME", column = "END_TIME")
)
@Select("""<script>
   SELECT * FROM bo_eu_ceshibt
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
   <if test="APPLICANTUSER!=null">
      APPLICANTUSER=#{APPLICANTUSER}
   </if> 
   <if test="USERNAME!=null">
      USERNAME=#{USERNAME}
   </if> 
   <if test="USERDEPT!=null">
      USERDEPT=#{USERDEPT}
   </if> 
   <if test="SCOPETYPE!=null">
      SCOPETYPE=#{SCOPETYPE}
   </if> 
   <if test="SCOPE!=null">
      SCOPE=#{SCOPE}
   </if> 
   <if test="BEGIN_TIME!=null">
      BEGIN_TIME=#{BEGIN_TIME}
   </if> 
   <if test="END_TIME!=null">
      END_TIME=#{END_TIME}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:bo_eu_ceshibt_dto):ArrayList<bo_eu_ceshibt_dto>
                


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
   Result(property = "APPLICANTUSER", column = "APPLICANTUSER"),
   Result(property = "USERNAME", column = "USERNAME"),
   Result(property = "USERDEPT", column = "USERDEPT"),
   Result(property = "SCOPETYPE", column = "SCOPETYPE"),
   Result(property = "SCOPE", column = "SCOPE"),
   Result(property = "BEGIN_TIME", column = "BEGIN_TIME"),
   Result(property = "END_TIME", column = "END_TIME")
)
@Select("""<script>
   SELECT * FROM bo_eu_ceshibt
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:bo_eu_ceshibt_dto):bo_eu_ceshibt_dto?
                


@Insert("""<script>
    insert into bo_eu_ceshibt
    (ID,ORGID,BINDID,CREATEDATE,CREATEUSER,UPDATEDATE,UPDATEUSER,PROCESSDEFID,ISEND,APPLICANTUSER,USERNAME,USERDEPT,SCOPETYPE,SCOPE,BEGIN_TIME,END_TIME)
    values
    (#{ID},#{ORGID},#{BINDID},#{CREATEDATE},#{CREATEUSER},#{UPDATEDATE},#{UPDATEUSER},#{PROCESSDEFID},#{ISEND},#{APPLICANTUSER},#{USERNAME},#{USERDEPT},#{SCOPETYPE},#{SCOPE},#{BEGIN_TIME},#{END_TIME})
</script>""")
fun Insert(model:bo_eu_ceshibt_dto):Unit
                


@Insert("""<script>
    insert into bo_eu_ceshibt
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
        <if test='APPLICANTUSER!= null'> 
           APPLICANTUSER,
        </if>
        <if test='USERNAME!= null'> 
           USERNAME,
        </if>
        <if test='USERDEPT!= null'> 
           USERDEPT,
        </if>
        <if test='SCOPETYPE!= null'> 
           SCOPETYPE,
        </if>
        <if test='SCOPE!= null'> 
           SCOPE,
        </if>
        <if test='BEGIN_TIME!= null'> 
           BEGIN_TIME,
        </if>
        <if test='END_TIME!= null'> 
           END_TIME
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
        <if test='APPLICANTUSER!= null'> 
           #{APPLICANTUSER,jdbcType=varchar}，
        </if>
        <if test='USERNAME!= null'> 
           #{USERNAME,jdbcType=varchar}，
        </if>
        <if test='USERDEPT!= null'> 
           #{USERDEPT,jdbcType=varchar}，
        </if>
        <if test='SCOPETYPE!= null'> 
           #{SCOPETYPE,jdbcType=varchar}，
        </if>
        <if test='SCOPE!= null'> 
           #{SCOPE,jdbcType=varchar}，
        </if>
        <if test='BEGIN_TIME!= null'> 
           #{BEGIN_TIME,jdbcType=datetime}，
        </if>
        <if test='END_TIME!= null'> 
           #{END_TIME,jdbcType=datetime}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:bo_eu_ceshibt_dto):Unit
                


@Delete("DELETE FROM bo_eu_ceshibt WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE bo_eu_ceshibt SET
        ID=#{ID,jdbcType=String},
        ORGID=#{ORGID,jdbcType=String},
        BINDID=#{BINDID,jdbcType=String},
        CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp},
        UPDATEUSER=#{UPDATEUSER,jdbcType=String},
        PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},
        ISEND=#{ISEND,jdbcType=Integer},
        APPLICANTUSER=#{APPLICANTUSER,jdbcType=String},
        USERNAME=#{USERNAME,jdbcType=String},
        USERDEPT=#{USERDEPT,jdbcType=String},
        SCOPETYPE=#{SCOPETYPE,jdbcType=String},
        SCOPE=#{SCOPE,jdbcType=String},
        BEGIN_TIME=#{BEGIN_TIME,jdbcType=Timestamp},
        END_TIME=#{END_TIME,jdbcType=Timestamp}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:bo_eu_ceshibt_dto)
        

@Update("""<script>
            UPDATE bo_eu_ceshibt SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="ORGID != null">  ORGID=#{ORGID,jdbcType=String},</if>
        <if test="BINDID != null">  BINDID=#{BINDID,jdbcType=String},</if>
        <if test="CREATEDATE != null">  CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="UPDATEDATE != null">  UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp},</if>
        <if test="UPDATEUSER != null">  UPDATEUSER=#{UPDATEUSER,jdbcType=String},</if>
        <if test="PROCESSDEFID != null">  PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},</if>
        <if test="ISEND != null">  ISEND=#{ISEND,jdbcType=Integer},</if>
        <if test="APPLICANTUSER != null">  APPLICANTUSER=#{APPLICANTUSER,jdbcType=String},</if>
        <if test="USERNAME != null">  USERNAME=#{USERNAME,jdbcType=String},</if>
        <if test="USERDEPT != null">  USERDEPT=#{USERDEPT,jdbcType=String},</if>
        <if test="SCOPETYPE != null">  SCOPETYPE=#{SCOPETYPE,jdbcType=String},</if>
        <if test="SCOPE != null">  SCOPE=#{SCOPE,jdbcType=String},</if>
        <if test="BEGIN_TIME != null">  BEGIN_TIME=#{BEGIN_TIME,jdbcType=Timestamp},</if>
        <if test="END_TIME != null">  END_TIME=#{END_TIME,jdbcType=Timestamp}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:bo_eu_ceshibt_dto)
            

}

        
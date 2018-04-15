

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_act_workcalendar{


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
   Result(property = "WCKEY", column = "WCKEY"),
   Result(property = "WCNAME", column = "WCNAME"),
   Result(property = "WCTIMEZONE", column = "WCTIMEZONE"),
   Result(property = "WCEXTCLASS", column = "WCEXTCLASS"),
   Result(property = "MEMO", column = "MEMO")
)
@Select("""<script>
   SELECT * FROM bo_act_workcalendar
</script>""")
fun GetListAll():ArrayList<bo_act_workcalendar_dto>
        


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
   Result(property = "WCKEY", column = "WCKEY"),
   Result(property = "WCNAME", column = "WCNAME"),
   Result(property = "WCTIMEZONE", column = "WCTIMEZONE"),
   Result(property = "WCEXTCLASS", column = "WCEXTCLASS"),
   Result(property = "MEMO", column = "MEMO")
)
@Select("""<script>
   SELECT * FROM bo_act_workcalendar
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
   <if test="WCKEY!=null">
      WCKEY=#{WCKEY}
   </if> 
   <if test="WCNAME!=null">
      WCNAME=#{WCNAME}
   </if> 
   <if test="WCTIMEZONE!=null">
      WCTIMEZONE=#{WCTIMEZONE}
   </if> 
   <if test="WCEXTCLASS!=null">
      WCEXTCLASS=#{WCEXTCLASS}
   </if> 
   <if test="MEMO!=null">
      MEMO=#{MEMO}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:bo_act_workcalendar_dto):ArrayList<bo_act_workcalendar_dto>
                


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
   Result(property = "WCKEY", column = "WCKEY"),
   Result(property = "WCNAME", column = "WCNAME"),
   Result(property = "WCTIMEZONE", column = "WCTIMEZONE"),
   Result(property = "WCEXTCLASS", column = "WCEXTCLASS"),
   Result(property = "MEMO", column = "MEMO")
)
@Select("""<script>
   SELECT * FROM bo_act_workcalendar
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:bo_act_workcalendar_dto):bo_act_workcalendar_dto?
                


@Insert("""<script>
    insert into bo_act_workcalendar
    (ID,ORGID,BINDID,CREATEDATE,CREATEUSER,UPDATEDATE,UPDATEUSER,PROCESSDEFID,ISEND,WCKEY,WCNAME,WCTIMEZONE,WCEXTCLASS,MEMO)
    values
    (#{ID},#{ORGID},#{BINDID},#{CREATEDATE},#{CREATEUSER},#{UPDATEDATE},#{UPDATEUSER},#{PROCESSDEFID},#{ISEND},#{WCKEY},#{WCNAME},#{WCTIMEZONE},#{WCEXTCLASS},#{MEMO})
</script>""")
fun Insert(model:bo_act_workcalendar_dto):Unit
                


@Insert("""<script>
    insert into bo_act_workcalendar
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
        <if test='WCKEY!= null'> 
           WCKEY,
        </if>
        <if test='WCNAME!= null'> 
           WCNAME,
        </if>
        <if test='WCTIMEZONE!= null'> 
           WCTIMEZONE,
        </if>
        <if test='WCEXTCLASS!= null'> 
           WCEXTCLASS,
        </if>
        <if test='MEMO!= null'> 
           MEMO
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
        <if test='WCKEY!= null'> 
           #{WCKEY,jdbcType=varchar}，
        </if>
        <if test='WCNAME!= null'> 
           #{WCNAME,jdbcType=varchar}，
        </if>
        <if test='WCTIMEZONE!= null'> 
           #{WCTIMEZONE,jdbcType=varchar}，
        </if>
        <if test='WCEXTCLASS!= null'> 
           #{WCEXTCLASS,jdbcType=text}，
        </if>
        <if test='MEMO!= null'> 
           #{MEMO,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:bo_act_workcalendar_dto):Unit
                


@Delete("DELETE FROM bo_act_workcalendar WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE bo_act_workcalendar SET
        ID=#{ID,jdbcType=String},
        ORGID=#{ORGID,jdbcType=String},
        BINDID=#{BINDID,jdbcType=String},
        CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp},
        UPDATEUSER=#{UPDATEUSER,jdbcType=String},
        PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},
        ISEND=#{ISEND,jdbcType=Integer},
        WCKEY=#{WCKEY,jdbcType=String},
        WCNAME=#{WCNAME,jdbcType=String},
        WCTIMEZONE=#{WCTIMEZONE,jdbcType=String},
        WCEXTCLASS=#{WCEXTCLASS,jdbcType=String},
        MEMO=#{MEMO,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:bo_act_workcalendar_dto)
        

@Update("""<script>
            UPDATE bo_act_workcalendar SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="ORGID != null">  ORGID=#{ORGID,jdbcType=String},</if>
        <if test="BINDID != null">  BINDID=#{BINDID,jdbcType=String},</if>
        <if test="CREATEDATE != null">  CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="UPDATEDATE != null">  UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp},</if>
        <if test="UPDATEUSER != null">  UPDATEUSER=#{UPDATEUSER,jdbcType=String},</if>
        <if test="PROCESSDEFID != null">  PROCESSDEFID=#{PROCESSDEFID,jdbcType=String},</if>
        <if test="ISEND != null">  ISEND=#{ISEND,jdbcType=Integer},</if>
        <if test="WCKEY != null">  WCKEY=#{WCKEY,jdbcType=String},</if>
        <if test="WCNAME != null">  WCNAME=#{WCNAME,jdbcType=String},</if>
        <if test="WCTIMEZONE != null">  WCTIMEZONE=#{WCTIMEZONE,jdbcType=String},</if>
        <if test="WCEXTCLASS != null">  WCEXTCLASS=#{WCEXTCLASS,jdbcType=String},</if>
        <if test="MEMO != null">  MEMO=#{MEMO,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:bo_act_workcalendar_dto)
            

}

        
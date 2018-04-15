

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface orguser_bk{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERNO", column = "USERNO"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "USERNAME", column = "USERNAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "PASSWORD", column = "PASSWORD"),
   Result(property = "CLOSED", column = "CLOSED"),
   Result(property = "DEPARTMENTID", column = "DEPARTMENTID"),
   Result(property = "ROLEID", column = "ROLEID"),
   Result(property = "ISMANAGER", column = "ISMANAGER"),
   Result(property = "WORKCANLENDAR", column = "WORKCANLENDAR"),
   Result(property = "POSITION_NO", column = "POSITION_NO"),
   Result(property = "POSITION_NAME", column = "POSITION_NAME"),
   Result(property = "POSITION_LAYER", column = "POSITION_LAYER"),
   Result(property = "OFFICETEL", column = "OFFICETEL"),
   Result(property = "OFFICEFAX", column = "OFFICEFAX"),
   Result(property = "MOBILE", column = "MOBILE"),
   Result(property = "EMAIL", column = "EMAIL"),
   Result(property = "USERIP", column = "USERIP"),
   Result(property = "ISSINGLELOGIN", column = "ISSINGLELOGIN"),
   Result(property = "WORK_STATUS", column = "WORK_STATUS"),
   Result(property = "SESSIONTIME", column = "SESSIONTIME"),
   Result(property = "OUTERID", column = "OUTERID"),
   Result(property = "WECHAT", column = "WECHAT"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "REPORTTO", column = "REPORTTO"),
   Result(property = "CLOSEDATE", column = "CLOSEDATE"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE")
)
@Select("""<script>
   SELECT * FROM orguser_bk
</script>""")
fun GetListAll():ArrayList<orguser_bk_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERNO", column = "USERNO"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "USERNAME", column = "USERNAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "PASSWORD", column = "PASSWORD"),
   Result(property = "CLOSED", column = "CLOSED"),
   Result(property = "DEPARTMENTID", column = "DEPARTMENTID"),
   Result(property = "ROLEID", column = "ROLEID"),
   Result(property = "ISMANAGER", column = "ISMANAGER"),
   Result(property = "WORKCANLENDAR", column = "WORKCANLENDAR"),
   Result(property = "POSITION_NO", column = "POSITION_NO"),
   Result(property = "POSITION_NAME", column = "POSITION_NAME"),
   Result(property = "POSITION_LAYER", column = "POSITION_LAYER"),
   Result(property = "OFFICETEL", column = "OFFICETEL"),
   Result(property = "OFFICEFAX", column = "OFFICEFAX"),
   Result(property = "MOBILE", column = "MOBILE"),
   Result(property = "EMAIL", column = "EMAIL"),
   Result(property = "USERIP", column = "USERIP"),
   Result(property = "ISSINGLELOGIN", column = "ISSINGLELOGIN"),
   Result(property = "WORK_STATUS", column = "WORK_STATUS"),
   Result(property = "SESSIONTIME", column = "SESSIONTIME"),
   Result(property = "OUTERID", column = "OUTERID"),
   Result(property = "WECHAT", column = "WECHAT"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "REPORTTO", column = "REPORTTO"),
   Result(property = "CLOSEDATE", column = "CLOSEDATE"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE")
)
@Select("""<script>
   SELECT * FROM orguser_bk
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="USERNO!=null">
      USERNO=#{USERNO}
   </if> 
   <if test="USERID!=null">
      USERID=#{USERID}
   </if> 
   <if test="USERNAME!=null">
      USERNAME=#{USERNAME}
   </if> 
   <if test="ORDERINDEX!=null">
      ORDERINDEX=#{ORDERINDEX}
   </if> 
   <if test="PASSWORD!=null">
      PASSWORD=#{PASSWORD}
   </if> 
   <if test="CLOSED!=null">
      CLOSED=#{CLOSED}
   </if> 
   <if test="DEPARTMENTID!=null">
      DEPARTMENTID=#{DEPARTMENTID}
   </if> 
   <if test="ROLEID!=null">
      ROLEID=#{ROLEID}
   </if> 
   <if test="ISMANAGER!=null">
      ISMANAGER=#{ISMANAGER}
   </if> 
   <if test="WORKCANLENDAR!=null">
      WORKCANLENDAR=#{WORKCANLENDAR}
   </if> 
   <if test="POSITION_NO!=null">
      POSITION_NO=#{POSITION_NO}
   </if> 
   <if test="POSITION_NAME!=null">
      POSITION_NAME=#{POSITION_NAME}
   </if> 
   <if test="POSITION_LAYER!=null">
      POSITION_LAYER=#{POSITION_LAYER}
   </if> 
   <if test="OFFICETEL!=null">
      OFFICETEL=#{OFFICETEL}
   </if> 
   <if test="OFFICEFAX!=null">
      OFFICEFAX=#{OFFICEFAX}
   </if> 
   <if test="MOBILE!=null">
      MOBILE=#{MOBILE}
   </if> 
   <if test="EMAIL!=null">
      EMAIL=#{EMAIL}
   </if> 
   <if test="USERIP!=null">
      USERIP=#{USERIP}
   </if> 
   <if test="ISSINGLELOGIN!=null">
      ISSINGLELOGIN=#{ISSINGLELOGIN}
   </if> 
   <if test="WORK_STATUS!=null">
      WORK_STATUS=#{WORK_STATUS}
   </if> 
   <if test="SESSIONTIME!=null">
      SESSIONTIME=#{SESSIONTIME}
   </if> 
   <if test="OUTERID!=null">
      OUTERID=#{OUTERID}
   </if> 
   <if test="WECHAT!=null">
      WECHAT=#{WECHAT}
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
   <if test="REPORTTO!=null">
      REPORTTO=#{REPORTTO}
   </if> 
   <if test="CLOSEDATE!=null">
      CLOSEDATE=#{CLOSEDATE}
   </if> 
   <if test="CREATEDATE!=null">
      CREATEDATE=#{CREATEDATE}
   </if> 
   <if test="UPDATEDATE!=null">
      UPDATEDATE=#{UPDATEDATE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:orguser_bk_dto):ArrayList<orguser_bk_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "USERNO", column = "USERNO"),
   Result(property = "USERID", column = "USERID"),
   Result(property = "USERNAME", column = "USERNAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "PASSWORD", column = "PASSWORD"),
   Result(property = "CLOSED", column = "CLOSED"),
   Result(property = "DEPARTMENTID", column = "DEPARTMENTID"),
   Result(property = "ROLEID", column = "ROLEID"),
   Result(property = "ISMANAGER", column = "ISMANAGER"),
   Result(property = "WORKCANLENDAR", column = "WORKCANLENDAR"),
   Result(property = "POSITION_NO", column = "POSITION_NO"),
   Result(property = "POSITION_NAME", column = "POSITION_NAME"),
   Result(property = "POSITION_LAYER", column = "POSITION_LAYER"),
   Result(property = "OFFICETEL", column = "OFFICETEL"),
   Result(property = "OFFICEFAX", column = "OFFICEFAX"),
   Result(property = "MOBILE", column = "MOBILE"),
   Result(property = "EMAIL", column = "EMAIL"),
   Result(property = "USERIP", column = "USERIP"),
   Result(property = "ISSINGLELOGIN", column = "ISSINGLELOGIN"),
   Result(property = "WORK_STATUS", column = "WORK_STATUS"),
   Result(property = "SESSIONTIME", column = "SESSIONTIME"),
   Result(property = "OUTERID", column = "OUTERID"),
   Result(property = "WECHAT", column = "WECHAT"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "REPORTTO", column = "REPORTTO"),
   Result(property = "CLOSEDATE", column = "CLOSEDATE"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE")
)
@Select("""<script>
   SELECT * FROM orguser_bk
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:orguser_bk_dto):orguser_bk_dto?
                


@Insert("""<script>
    insert into orguser_bk
    (ID,USERNO,USERID,USERNAME,ORDERINDEX,PASSWORD,CLOSED,DEPARTMENTID,ROLEID,ISMANAGER,WORKCANLENDAR,POSITION_NO,POSITION_NAME,POSITION_LAYER,OFFICETEL,OFFICEFAX,MOBILE,EMAIL,USERIP,ISSINGLELOGIN,WORK_STATUS,SESSIONTIME,OUTERID,WECHAT,EXT1,EXT2,EXT3,EXT4,EXT5,REPORTTO,CLOSEDATE,CREATEDATE,UPDATEDATE)
    values
    (#{ID},#{USERNO},#{USERID},#{USERNAME},#{ORDERINDEX},#{PASSWORD},#{CLOSED},#{DEPARTMENTID},#{ROLEID},#{ISMANAGER},#{WORKCANLENDAR},#{POSITION_NO},#{POSITION_NAME},#{POSITION_LAYER},#{OFFICETEL},#{OFFICEFAX},#{MOBILE},#{EMAIL},#{USERIP},#{ISSINGLELOGIN},#{WORK_STATUS},#{SESSIONTIME},#{OUTERID},#{WECHAT},#{EXT1},#{EXT2},#{EXT3},#{EXT4},#{EXT5},#{REPORTTO},#{CLOSEDATE},#{CREATEDATE},#{UPDATEDATE})
</script>""")
fun Insert(model:orguser_bk_dto):Unit
                


@Insert("""<script>
    insert into orguser_bk
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='USERNO!= null'> 
           USERNO,
        </if>
           USERID,
        <if test='USERNAME!= null'> 
           USERNAME,
        </if>
        <if test='ORDERINDEX!= null'> 
           ORDERINDEX,
        </if>
           PASSWORD,
           CLOSED,
        <if test='DEPARTMENTID!= null'> 
           DEPARTMENTID,
        </if>
        <if test='ROLEID!= null'> 
           ROLEID,
        </if>
        <if test='ISMANAGER!= null'> 
           ISMANAGER,
        </if>
        <if test='WORKCANLENDAR!= null'> 
           WORKCANLENDAR,
        </if>
        <if test='POSITION_NO!= null'> 
           POSITION_NO,
        </if>
        <if test='POSITION_NAME!= null'> 
           POSITION_NAME,
        </if>
        <if test='POSITION_LAYER!= null'> 
           POSITION_LAYER,
        </if>
        <if test='OFFICETEL!= null'> 
           OFFICETEL,
        </if>
        <if test='OFFICEFAX!= null'> 
           OFFICEFAX,
        </if>
        <if test='MOBILE!= null'> 
           MOBILE,
        </if>
        <if test='EMAIL!= null'> 
           EMAIL,
        </if>
        <if test='USERIP!= null'> 
           USERIP,
        </if>
        <if test='ISSINGLELOGIN!= null'> 
           ISSINGLELOGIN,
        </if>
        <if test='WORK_STATUS!= null'> 
           WORK_STATUS,
        </if>
        <if test='SESSIONTIME!= null'> 
           SESSIONTIME,
        </if>
        <if test='OUTERID!= null'> 
           OUTERID,
        </if>
        <if test='WECHAT!= null'> 
           WECHAT,
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
           EXT5,
        </if>
        <if test='REPORTTO!= null'> 
           REPORTTO,
        </if>
        <if test='CLOSEDATE!= null'> 
           CLOSEDATE,
        </if>
        <if test='CREATEDATE!= null'> 
           CREATEDATE,
        </if>
        <if test='UPDATEDATE!= null'> 
           UPDATEDATE
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=varchar}，
        <if test='USERNO!= null'> 
           #{USERNO,jdbcType=varchar}，
        </if>
           #{USERID,jdbcType=varchar}，
        <if test='USERNAME!= null'> 
           #{USERNAME,jdbcType=varchar}，
        </if>
        <if test='ORDERINDEX!= null'> 
           #{ORDERINDEX,jdbcType=decimal}，
        </if>
           #{PASSWORD,jdbcType=varchar}，
           #{CLOSED,jdbcType=smallint}，
        <if test='DEPARTMENTID!= null'> 
           #{DEPARTMENTID,jdbcType=varchar}，
        </if>
        <if test='ROLEID!= null'> 
           #{ROLEID,jdbcType=varchar}，
        </if>
        <if test='ISMANAGER!= null'> 
           #{ISMANAGER,jdbcType=smallint}，
        </if>
        <if test='WORKCANLENDAR!= null'> 
           #{WORKCANLENDAR,jdbcType=varchar}，
        </if>
        <if test='POSITION_NO!= null'> 
           #{POSITION_NO,jdbcType=varchar}，
        </if>
        <if test='POSITION_NAME!= null'> 
           #{POSITION_NAME,jdbcType=varchar}，
        </if>
        <if test='POSITION_LAYER!= null'> 
           #{POSITION_LAYER,jdbcType=varchar}，
        </if>
        <if test='OFFICETEL!= null'> 
           #{OFFICETEL,jdbcType=varchar}，
        </if>
        <if test='OFFICEFAX!= null'> 
           #{OFFICEFAX,jdbcType=varchar}，
        </if>
        <if test='MOBILE!= null'> 
           #{MOBILE,jdbcType=varchar}，
        </if>
        <if test='EMAIL!= null'> 
           #{EMAIL,jdbcType=varchar}，
        </if>
        <if test='USERIP!= null'> 
           #{USERIP,jdbcType=varchar}，
        </if>
        <if test='ISSINGLELOGIN!= null'> 
           #{ISSINGLELOGIN,jdbcType=smallint}，
        </if>
        <if test='WORK_STATUS!= null'> 
           #{WORK_STATUS,jdbcType=varchar}，
        </if>
        <if test='SESSIONTIME!= null'> 
           #{SESSIONTIME,jdbcType=decimal}，
        </if>
        <if test='OUTERID!= null'> 
           #{OUTERID,jdbcType=text}，
        </if>
        <if test='WECHAT!= null'> 
           #{WECHAT,jdbcType=varchar}，
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
        <if test='EXT5!= null'> 
           #{EXT5,jdbcType=varchar}，
        </if>
        <if test='REPORTTO!= null'> 
           #{REPORTTO,jdbcType=varchar}，
        </if>
        <if test='CLOSEDATE!= null'> 
           #{CLOSEDATE,jdbcType=datetime}，
        </if>
        <if test='CREATEDATE!= null'> 
           #{CREATEDATE,jdbcType=datetime}，
        </if>
        <if test='UPDATEDATE!= null'> 
           #{UPDATEDATE,jdbcType=datetime}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:orguser_bk_dto):Unit
                


@Delete("DELETE FROM orguser_bk WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE orguser_bk SET
        ID=#{ID,jdbcType=String},
        USERNO=#{USERNO,jdbcType=String},
        USERID=#{USERID,jdbcType=String},
        USERNAME=#{USERNAME,jdbcType=String},
        ORDERINDEX=#{ORDERINDEX,jdbcType=BigDecimal},
        PASSWORD=#{PASSWORD,jdbcType=String},
        CLOSED=#{CLOSED,jdbcType=Integer},
        DEPARTMENTID=#{DEPARTMENTID,jdbcType=String},
        ROLEID=#{ROLEID,jdbcType=String},
        ISMANAGER=#{ISMANAGER,jdbcType=Integer},
        WORKCANLENDAR=#{WORKCANLENDAR,jdbcType=String},
        POSITION_NO=#{POSITION_NO,jdbcType=String},
        POSITION_NAME=#{POSITION_NAME,jdbcType=String},
        POSITION_LAYER=#{POSITION_LAYER,jdbcType=String},
        OFFICETEL=#{OFFICETEL,jdbcType=String},
        OFFICEFAX=#{OFFICEFAX,jdbcType=String},
        MOBILE=#{MOBILE,jdbcType=String},
        EMAIL=#{EMAIL,jdbcType=String},
        USERIP=#{USERIP,jdbcType=String},
        ISSINGLELOGIN=#{ISSINGLELOGIN,jdbcType=Integer},
        WORK_STATUS=#{WORK_STATUS,jdbcType=String},
        SESSIONTIME=#{SESSIONTIME,jdbcType=BigDecimal},
        OUTERID=#{OUTERID,jdbcType=String},
        WECHAT=#{WECHAT,jdbcType=String},
        EXT1=#{EXT1,jdbcType=String},
        EXT2=#{EXT2,jdbcType=String},
        EXT3=#{EXT3,jdbcType=String},
        EXT4=#{EXT4,jdbcType=String},
        EXT5=#{EXT5,jdbcType=String},
        REPORTTO=#{REPORTTO,jdbcType=String},
        CLOSEDATE=#{CLOSEDATE,jdbcType=Timestamp},
        CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},
        UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:orguser_bk_dto)
        

@Update("""<script>
            UPDATE orguser_bk SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="USERNO != null">  USERNO=#{USERNO,jdbcType=String},</if>
        <if test="USERID != null">  USERID=#{USERID,jdbcType=String},</if>
        <if test="USERNAME != null">  USERNAME=#{USERNAME,jdbcType=String},</if>
        <if test="ORDERINDEX != null">  ORDERINDEX=#{ORDERINDEX,jdbcType=BigDecimal},</if>
        <if test="PASSWORD != null">  PASSWORD=#{PASSWORD,jdbcType=String},</if>
        <if test="CLOSED != null">  CLOSED=#{CLOSED,jdbcType=Integer},</if>
        <if test="DEPARTMENTID != null">  DEPARTMENTID=#{DEPARTMENTID,jdbcType=String},</if>
        <if test="ROLEID != null">  ROLEID=#{ROLEID,jdbcType=String},</if>
        <if test="ISMANAGER != null">  ISMANAGER=#{ISMANAGER,jdbcType=Integer},</if>
        <if test="WORKCANLENDAR != null">  WORKCANLENDAR=#{WORKCANLENDAR,jdbcType=String},</if>
        <if test="POSITION_NO != null">  POSITION_NO=#{POSITION_NO,jdbcType=String},</if>
        <if test="POSITION_NAME != null">  POSITION_NAME=#{POSITION_NAME,jdbcType=String},</if>
        <if test="POSITION_LAYER != null">  POSITION_LAYER=#{POSITION_LAYER,jdbcType=String},</if>
        <if test="OFFICETEL != null">  OFFICETEL=#{OFFICETEL,jdbcType=String},</if>
        <if test="OFFICEFAX != null">  OFFICEFAX=#{OFFICEFAX,jdbcType=String},</if>
        <if test="MOBILE != null">  MOBILE=#{MOBILE,jdbcType=String},</if>
        <if test="EMAIL != null">  EMAIL=#{EMAIL,jdbcType=String},</if>
        <if test="USERIP != null">  USERIP=#{USERIP,jdbcType=String},</if>
        <if test="ISSINGLELOGIN != null">  ISSINGLELOGIN=#{ISSINGLELOGIN,jdbcType=Integer},</if>
        <if test="WORK_STATUS != null">  WORK_STATUS=#{WORK_STATUS,jdbcType=String},</if>
        <if test="SESSIONTIME != null">  SESSIONTIME=#{SESSIONTIME,jdbcType=BigDecimal},</if>
        <if test="OUTERID != null">  OUTERID=#{OUTERID,jdbcType=String},</if>
        <if test="WECHAT != null">  WECHAT=#{WECHAT,jdbcType=String},</if>
        <if test="EXT1 != null">  EXT1=#{EXT1,jdbcType=String},</if>
        <if test="EXT2 != null">  EXT2=#{EXT2,jdbcType=String},</if>
        <if test="EXT3 != null">  EXT3=#{EXT3,jdbcType=String},</if>
        <if test="EXT4 != null">  EXT4=#{EXT4,jdbcType=String},</if>
        <if test="EXT5 != null">  EXT5=#{EXT5,jdbcType=String},</if>
        <if test="REPORTTO != null">  REPORTTO=#{REPORTTO,jdbcType=String},</if>
        <if test="CLOSEDATE != null">  CLOSEDATE=#{CLOSEDATE,jdbcType=Timestamp},</if>
        <if test="CREATEDATE != null">  CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},</if>
        <if test="UPDATEDATE != null">  UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:orguser_bk_dto)
            

}

        
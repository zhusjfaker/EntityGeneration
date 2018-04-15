

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_notification_msg{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "REGISTERID", column = "REGISTERID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "OWNERID", column = "OWNERID"),
   Result(property = "TARGETID", column = "TARGETID"),
   Result(property = "NOTIFYCONTENT", column = "NOTIFYCONTENT"),
   Result(property = "NOTIFYLEVEL", column = "NOTIFYLEVEL"),
   Result(property = "ISCLOSE", column = "ISCLOSE"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "ISSTORE", column = "ISSTORE"),
   Result(property = "READTIME", column = "READTIME"),
   Result(property = "READED", column = "READED"),
   Result(property = "SOURCEID", column = "SOURCEID")
)
@Select("""<script>
   SELECT * FROM app_act_notification_msg
</script>""")
fun GetListAll():ArrayList<app_act_notification_msg_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "REGISTERID", column = "REGISTERID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "OWNERID", column = "OWNERID"),
   Result(property = "TARGETID", column = "TARGETID"),
   Result(property = "NOTIFYCONTENT", column = "NOTIFYCONTENT"),
   Result(property = "NOTIFYLEVEL", column = "NOTIFYLEVEL"),
   Result(property = "ISCLOSE", column = "ISCLOSE"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "ISSTORE", column = "ISSTORE"),
   Result(property = "READTIME", column = "READTIME"),
   Result(property = "READED", column = "READED"),
   Result(property = "SOURCEID", column = "SOURCEID")
)
@Select("""<script>
   SELECT * FROM app_act_notification_msg
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="REGISTERID!=null">
      REGISTERID=#{REGISTERID}
   </if> 
   <if test="APPID!=null">
      APPID=#{APPID}
   </if> 
   <if test="OWNERID!=null">
      OWNERID=#{OWNERID}
   </if> 
   <if test="TARGETID!=null">
      TARGETID=#{TARGETID}
   </if> 
   <if test="NOTIFYCONTENT!=null">
      NOTIFYCONTENT=#{NOTIFYCONTENT}
   </if> 
   <if test="NOTIFYLEVEL!=null">
      NOTIFYLEVEL=#{NOTIFYLEVEL}
   </if> 
   <if test="ISCLOSE!=null">
      ISCLOSE=#{ISCLOSE}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   <if test="ISSTORE!=null">
      ISSTORE=#{ISSTORE}
   </if> 
   <if test="READTIME!=null">
      READTIME=#{READTIME}
   </if> 
   <if test="READED!=null">
      READED=#{READED}
   </if> 
   <if test="SOURCEID!=null">
      SOURCEID=#{SOURCEID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_notification_msg_dto):ArrayList<app_act_notification_msg_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "REGISTERID", column = "REGISTERID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "OWNERID", column = "OWNERID"),
   Result(property = "TARGETID", column = "TARGETID"),
   Result(property = "NOTIFYCONTENT", column = "NOTIFYCONTENT"),
   Result(property = "NOTIFYLEVEL", column = "NOTIFYLEVEL"),
   Result(property = "ISCLOSE", column = "ISCLOSE"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "ISSTORE", column = "ISSTORE"),
   Result(property = "READTIME", column = "READTIME"),
   Result(property = "READED", column = "READED"),
   Result(property = "SOURCEID", column = "SOURCEID")
)
@Select("""<script>
   SELECT * FROM app_act_notification_msg
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_notification_msg_dto):app_act_notification_msg_dto?
                


@Insert("""<script>
    insert into app_act_notification_msg
    (ID,REGISTERID,APPID,OWNERID,TARGETID,NOTIFYCONTENT,NOTIFYLEVEL,ISCLOSE,CREATETIME,ISSTORE,READTIME,READED,SOURCEID)
    values
    (#{ID},#{REGISTERID},#{APPID},#{OWNERID},#{TARGETID},#{NOTIFYCONTENT},#{NOTIFYLEVEL},#{ISCLOSE},#{CREATETIME},#{ISSTORE},#{READTIME},#{READED},#{SOURCEID})
</script>""")
fun Insert(model:app_act_notification_msg_dto):Unit
                


@Insert("""<script>
    insert into app_act_notification_msg
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='REGISTERID!= null'> 
           REGISTERID,
        </if>
        <if test='APPID!= null'> 
           APPID,
        </if>
        <if test='OWNERID!= null'> 
           OWNERID,
        </if>
        <if test='TARGETID!= null'> 
           TARGETID,
        </if>
        <if test='NOTIFYCONTENT!= null'> 
           NOTIFYCONTENT,
        </if>
        <if test='NOTIFYLEVEL!= null'> 
           NOTIFYLEVEL,
        </if>
        <if test='ISCLOSE!= null'> 
           ISCLOSE,
        </if>
        <if test='CREATETIME!= null'> 
           CREATETIME,
        </if>
        <if test='ISSTORE!= null'> 
           ISSTORE,
        </if>
        <if test='READTIME!= null'> 
           READTIME,
        </if>
        <if test='READED!= null'> 
           READED,
        </if>
        <if test='SOURCEID!= null'> 
           SOURCEID
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='REGISTERID!= null'> 
           #{REGISTERID,jdbcType=varchar}，
        </if>
        <if test='APPID!= null'> 
           #{APPID,jdbcType=varchar}，
        </if>
        <if test='OWNERID!= null'> 
           #{OWNERID,jdbcType=varchar}，
        </if>
        <if test='TARGETID!= null'> 
           #{TARGETID,jdbcType=varchar}，
        </if>
        <if test='NOTIFYCONTENT!= null'> 
           #{NOTIFYCONTENT,jdbcType=text}，
        </if>
        <if test='NOTIFYLEVEL!= null'> 
           #{NOTIFYLEVEL,jdbcType=char}，
        </if>
        <if test='ISCLOSE!= null'> 
           #{ISCLOSE,jdbcType=char}，
        </if>
        <if test='CREATETIME!= null'> 
           #{CREATETIME,jdbcType=datetime}，
        </if>
        <if test='ISSTORE!= null'> 
           #{ISSTORE,jdbcType=char}，
        </if>
        <if test='READTIME!= null'> 
           #{READTIME,jdbcType=datetime}，
        </if>
        <if test='READED!= null'> 
           #{READED,jdbcType=char}，
        </if>
        <if test='SOURCEID!= null'> 
           #{SOURCEID,jdbcType=char}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_notification_msg_dto):Unit
                


@Delete("DELETE FROM app_act_notification_msg WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE app_act_notification_msg SET
        ID=#{ID,jdbcType=String},
        REGISTERID=#{REGISTERID,jdbcType=String},
        APPID=#{APPID,jdbcType=String},
        OWNERID=#{OWNERID,jdbcType=String},
        TARGETID=#{TARGETID,jdbcType=String},
        NOTIFYCONTENT=#{NOTIFYCONTENT,jdbcType=String},
        NOTIFYLEVEL=#{NOTIFYLEVEL,jdbcType=String},
        ISCLOSE=#{ISCLOSE,jdbcType=String},
        CREATETIME=#{CREATETIME,jdbcType=Timestamp},
        ISSTORE=#{ISSTORE,jdbcType=String},
        READTIME=#{READTIME,jdbcType=Timestamp},
        READED=#{READED,jdbcType=String},
        SOURCEID=#{SOURCEID,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:app_act_notification_msg_dto)
        

@Update("""<script>
            UPDATE app_act_notification_msg SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="REGISTERID != null">  REGISTERID=#{REGISTERID,jdbcType=String},</if>
        <if test="APPID != null">  APPID=#{APPID,jdbcType=String},</if>
        <if test="OWNERID != null">  OWNERID=#{OWNERID,jdbcType=String},</if>
        <if test="TARGETID != null">  TARGETID=#{TARGETID,jdbcType=String},</if>
        <if test="NOTIFYCONTENT != null">  NOTIFYCONTENT=#{NOTIFYCONTENT,jdbcType=String},</if>
        <if test="NOTIFYLEVEL != null">  NOTIFYLEVEL=#{NOTIFYLEVEL,jdbcType=String},</if>
        <if test="ISCLOSE != null">  ISCLOSE=#{ISCLOSE,jdbcType=String},</if>
        <if test="CREATETIME != null">  CREATETIME=#{CREATETIME,jdbcType=Timestamp},</if>
        <if test="ISSTORE != null">  ISSTORE=#{ISSTORE,jdbcType=String},</if>
        <if test="READTIME != null">  READTIME=#{READTIME,jdbcType=Timestamp},</if>
        <if test="READED != null">  READED=#{READED,jdbcType=String},</if>
        <if test="SOURCEID != null">  SOURCEID=#{SOURCEID,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:app_act_notification_msg_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_notification_msg{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "REGISTERID", column = "REGISTERID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "OWNERID", column = "OWNERID"),
   Result(property = "TARGETID", column = "TARGETID"),
   Result(property = "NOTIFYCONTENT", column = "NOTIFYCONTENT"),
   Result(property = "NOTIFYLEVEL", column = "NOTIFYLEVEL"),
   Result(property = "ISCLOSE", column = "ISCLOSE"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "ISSTORE", column = "ISSTORE"),
   Result(property = "READTIME", column = "READTIME"),
   Result(property = "READED", column = "READED"),
   Result(property = "SOURCEID", column = "SOURCEID")
)
@Select("""<script>
   SELECT * FROM app_act_notification_msg
</script>""")
fun GetListAll():ArrayList<app_act_notification_msg_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "REGISTERID", column = "REGISTERID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "OWNERID", column = "OWNERID"),
   Result(property = "TARGETID", column = "TARGETID"),
   Result(property = "NOTIFYCONTENT", column = "NOTIFYCONTENT"),
   Result(property = "NOTIFYLEVEL", column = "NOTIFYLEVEL"),
   Result(property = "ISCLOSE", column = "ISCLOSE"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "ISSTORE", column = "ISSTORE"),
   Result(property = "READTIME", column = "READTIME"),
   Result(property = "READED", column = "READED"),
   Result(property = "SOURCEID", column = "SOURCEID")
)
@Select("""<script>
   SELECT * FROM app_act_notification_msg
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="REGISTERID!=null">
      REGISTERID=#{REGISTERID}
   </if> 
   <if test="APPID!=null">
      APPID=#{APPID}
   </if> 
   <if test="OWNERID!=null">
      OWNERID=#{OWNERID}
   </if> 
   <if test="TARGETID!=null">
      TARGETID=#{TARGETID}
   </if> 
   <if test="NOTIFYCONTENT!=null">
      NOTIFYCONTENT=#{NOTIFYCONTENT}
   </if> 
   <if test="NOTIFYLEVEL!=null">
      NOTIFYLEVEL=#{NOTIFYLEVEL}
   </if> 
   <if test="ISCLOSE!=null">
      ISCLOSE=#{ISCLOSE}
   </if> 
   <if test="CREATETIME!=null">
      CREATETIME=#{CREATETIME}
   </if> 
   <if test="ISSTORE!=null">
      ISSTORE=#{ISSTORE}
   </if> 
   <if test="READTIME!=null">
      READTIME=#{READTIME}
   </if> 
   <if test="READED!=null">
      READED=#{READED}
   </if> 
   <if test="SOURCEID!=null">
      SOURCEID=#{SOURCEID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_notification_msg_dto):ArrayList<app_act_notification_msg_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "REGISTERID", column = "REGISTERID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "OWNERID", column = "OWNERID"),
   Result(property = "TARGETID", column = "TARGETID"),
   Result(property = "NOTIFYCONTENT", column = "NOTIFYCONTENT"),
   Result(property = "NOTIFYLEVEL", column = "NOTIFYLEVEL"),
   Result(property = "ISCLOSE", column = "ISCLOSE"),
   Result(property = "CREATETIME", column = "CREATETIME"),
   Result(property = "ISSTORE", column = "ISSTORE"),
   Result(property = "READTIME", column = "READTIME"),
   Result(property = "READED", column = "READED"),
   Result(property = "SOURCEID", column = "SOURCEID")
)
@Select("""<script>
   SELECT * FROM app_act_notification_msg
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_notification_msg_dto):app_act_notification_msg_dto?
                


@Insert("""<script>
    insert into app_act_notification_msg
    (ID,REGISTERID,APPID,OWNERID,TARGETID,NOTIFYCONTENT,NOTIFYLEVEL,ISCLOSE,CREATETIME,ISSTORE,READTIME,READED,SOURCEID)
    values
    (#{ID},#{REGISTERID},#{APPID},#{OWNERID},#{TARGETID},#{NOTIFYCONTENT},#{NOTIFYLEVEL},#{ISCLOSE},#{CREATETIME},#{ISSTORE},#{READTIME},#{READED},#{SOURCEID})
</script>""")
fun Insert(model:app_act_notification_msg_dto):Unit
                


@Insert("""<script>
    insert into app_act_notification_msg
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='REGISTERID!= null'> 
           REGISTERID,
        </if>
        <if test='APPID!= null'> 
           APPID,
        </if>
        <if test='OWNERID!= null'> 
           OWNERID,
        </if>
        <if test='TARGETID!= null'> 
           TARGETID,
        </if>
        <if test='NOTIFYCONTENT!= null'> 
           NOTIFYCONTENT,
        </if>
        <if test='NOTIFYLEVEL!= null'> 
           NOTIFYLEVEL,
        </if>
        <if test='ISCLOSE!= null'> 
           ISCLOSE,
        </if>
        <if test='CREATETIME!= null'> 
           CREATETIME,
        </if>
        <if test='ISSTORE!= null'> 
           ISSTORE,
        </if>
        <if test='READTIME!= null'> 
           READTIME,
        </if>
        <if test='READED!= null'> 
           READED,
        </if>
        <if test='SOURCEID!= null'> 
           SOURCEID
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='REGISTERID!= null'> 
           #{REGISTERID,jdbcType=varchar}，
        </if>
        <if test='APPID!= null'> 
           #{APPID,jdbcType=varchar}，
        </if>
        <if test='OWNERID!= null'> 
           #{OWNERID,jdbcType=varchar}，
        </if>
        <if test='TARGETID!= null'> 
           #{TARGETID,jdbcType=varchar}，
        </if>
        <if test='NOTIFYCONTENT!= null'> 
           #{NOTIFYCONTENT,jdbcType=text}，
        </if>
        <if test='NOTIFYLEVEL!= null'> 
           #{NOTIFYLEVEL,jdbcType=char}，
        </if>
        <if test='ISCLOSE!= null'> 
           #{ISCLOSE,jdbcType=char}，
        </if>
        <if test='CREATETIME!= null'> 
           #{CREATETIME,jdbcType=datetime}，
        </if>
        <if test='ISSTORE!= null'> 
           #{ISSTORE,jdbcType=char}，
        </if>
        <if test='READTIME!= null'> 
           #{READTIME,jdbcType=datetime}，
        </if>
        <if test='READED!= null'> 
           #{READED,jdbcType=char}，
        </if>
        <if test='SOURCEID!= null'> 
           #{SOURCEID,jdbcType=char}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_notification_msg_dto):Unit
                


@Delete("DELETE FROM app_act_notification_msg WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE app_act_notification_msg SET
        ID=#{ID,jdbcType=String},
        REGISTERID=#{REGISTERID,jdbcType=String},
        APPID=#{APPID,jdbcType=String},
        OWNERID=#{OWNERID,jdbcType=String},
        TARGETID=#{TARGETID,jdbcType=String},
        NOTIFYCONTENT=#{NOTIFYCONTENT,jdbcType=String},
        NOTIFYLEVEL=#{NOTIFYLEVEL,jdbcType=String},
        ISCLOSE=#{ISCLOSE,jdbcType=String},
        CREATETIME=#{CREATETIME,jdbcType=Timestamp},
        ISSTORE=#{ISSTORE,jdbcType=String},
        READTIME=#{READTIME,jdbcType=Timestamp},
        READED=#{READED,jdbcType=String},
        SOURCEID=#{SOURCEID,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:app_act_notification_msg_dto)
        

@Update("""<script>
            UPDATE app_act_notification_msg SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="REGISTERID != null">  REGISTERID=#{REGISTERID,jdbcType=String},</if>
        <if test="APPID != null">  APPID=#{APPID,jdbcType=String},</if>
        <if test="OWNERID != null">  OWNERID=#{OWNERID,jdbcType=String},</if>
        <if test="TARGETID != null">  TARGETID=#{TARGETID,jdbcType=String},</if>
        <if test="NOTIFYCONTENT != null">  NOTIFYCONTENT=#{NOTIFYCONTENT,jdbcType=String},</if>
        <if test="NOTIFYLEVEL != null">  NOTIFYLEVEL=#{NOTIFYLEVEL,jdbcType=String},</if>
        <if test="ISCLOSE != null">  ISCLOSE=#{ISCLOSE,jdbcType=String},</if>
        <if test="CREATETIME != null">  CREATETIME=#{CREATETIME,jdbcType=Timestamp},</if>
        <if test="ISSTORE != null">  ISSTORE=#{ISSTORE,jdbcType=String},</if>
        <if test="READTIME != null">  READTIME=#{READTIME,jdbcType=Timestamp},</if>
        <if test="READED != null">  READED=#{READED,jdbcType=String},</if>
        <if test="SOURCEID != null">  SOURCEID=#{SOURCEID,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:app_act_notification_msg_dto)
            

}

        
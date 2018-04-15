

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfc_comment{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "DEPTNAME", column = "DEPTNAME"),
   Result(property = "POSITIONNAME", column = "POSITIONNAME"),
   Result(property = "ACTIONNAME", column = "ACTIONNAME"),
   Result(property = "ACTIVITYNAME", column = "ACTIVITYNAME"),
   Result(property = "MSG", column = "MSG"),
   Result(property = "FILES", column = "FILES")
)
@Select("""<script>
   SELECT * FROM wfc_comment
</script>""")
fun GetListAll():ArrayList<wfc_comment_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "DEPTNAME", column = "DEPTNAME"),
   Result(property = "POSITIONNAME", column = "POSITIONNAME"),
   Result(property = "ACTIONNAME", column = "ACTIONNAME"),
   Result(property = "ACTIVITYNAME", column = "ACTIVITYNAME"),
   Result(property = "MSG", column = "MSG"),
   Result(property = "FILES", column = "FILES")
)
@Select("""<script>
   SELECT * FROM wfc_comment
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="PROCESSINSTID!=null">
      PROCESSINSTID=#{PROCESSINSTID}
   </if> 
   <if test="TASKINSTID!=null">
      TASKINSTID=#{TASKINSTID}
   </if> 
   <if test="CREATEDATE!=null">
      CREATEDATE=#{CREATEDATE}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="DEPTNAME!=null">
      DEPTNAME=#{DEPTNAME}
   </if> 
   <if test="POSITIONNAME!=null">
      POSITIONNAME=#{POSITIONNAME}
   </if> 
   <if test="ACTIONNAME!=null">
      ACTIONNAME=#{ACTIONNAME}
   </if> 
   <if test="ACTIVITYNAME!=null">
      ACTIVITYNAME=#{ACTIVITYNAME}
   </if> 
   <if test="MSG!=null">
      MSG=#{MSG}
   </if> 
   <if test="FILES!=null">
      FILES=#{FILES}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:wfc_comment_dto):ArrayList<wfc_comment_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "DEPTNAME", column = "DEPTNAME"),
   Result(property = "POSITIONNAME", column = "POSITIONNAME"),
   Result(property = "ACTIONNAME", column = "ACTIONNAME"),
   Result(property = "ACTIVITYNAME", column = "ACTIVITYNAME"),
   Result(property = "MSG", column = "MSG"),
   Result(property = "FILES", column = "FILES")
)
@Select("""<script>
   SELECT * FROM wfc_comment
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:wfc_comment_dto):wfc_comment_dto?
                


@Insert("""<script>
    insert into wfc_comment
    (ID,PROCESSINSTID,TASKINSTID,CREATEDATE,CREATEUSER,DEPTNAME,POSITIONNAME,ACTIONNAME,ACTIVITYNAME,MSG,FILES)
    values
    (#{ID},#{PROCESSINSTID},#{TASKINSTID},#{CREATEDATE},#{CREATEUSER},#{DEPTNAME},#{POSITIONNAME},#{ACTIONNAME},#{ACTIVITYNAME},#{MSG},#{FILES})
</script>""")
fun Insert(model:wfc_comment_dto):Unit
                


@Insert("""<script>
    insert into wfc_comment
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='PROCESSINSTID!= null'> 
           PROCESSINSTID,
        </if>
        <if test='TASKINSTID!= null'> 
           TASKINSTID,
        </if>
        <if test='CREATEDATE!= null'> 
           CREATEDATE,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='DEPTNAME!= null'> 
           DEPTNAME,
        </if>
        <if test='POSITIONNAME!= null'> 
           POSITIONNAME,
        </if>
        <if test='ACTIONNAME!= null'> 
           ACTIONNAME,
        </if>
        <if test='ACTIVITYNAME!= null'> 
           ACTIVITYNAME,
        </if>
        <if test='MSG!= null'> 
           MSG,
        </if>
        <if test='FILES!= null'> 
           FILES
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='PROCESSINSTID!= null'> 
           #{PROCESSINSTID,jdbcType=char}，
        </if>
        <if test='TASKINSTID!= null'> 
           #{TASKINSTID,jdbcType=char}，
        </if>
        <if test='CREATEDATE!= null'> 
           #{CREATEDATE,jdbcType=datetime}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='DEPTNAME!= null'> 
           #{DEPTNAME,jdbcType=varchar}，
        </if>
        <if test='POSITIONNAME!= null'> 
           #{POSITIONNAME,jdbcType=varchar}，
        </if>
        <if test='ACTIONNAME!= null'> 
           #{ACTIONNAME,jdbcType=varchar}，
        </if>
        <if test='ACTIVITYNAME!= null'> 
           #{ACTIVITYNAME,jdbcType=varchar}，
        </if>
        <if test='MSG!= null'> 
           #{MSG,jdbcType=text}，
        </if>
        <if test='FILES!= null'> 
           #{FILES,jdbcType=text}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:wfc_comment_dto):Unit
                


@Delete("DELETE FROM wfc_comment WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE wfc_comment SET
        ID=#{ID,jdbcType=String},
        PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},
        TASKINSTID=#{TASKINSTID,jdbcType=String},
        CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        DEPTNAME=#{DEPTNAME,jdbcType=String},
        POSITIONNAME=#{POSITIONNAME,jdbcType=String},
        ACTIONNAME=#{ACTIONNAME,jdbcType=String},
        ACTIVITYNAME=#{ACTIVITYNAME,jdbcType=String},
        MSG=#{MSG,jdbcType=String},
        FILES=#{FILES,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:wfc_comment_dto)
        

@Update("""<script>
            UPDATE wfc_comment SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="PROCESSINSTID != null">  PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},</if>
        <if test="TASKINSTID != null">  TASKINSTID=#{TASKINSTID,jdbcType=String},</if>
        <if test="CREATEDATE != null">  CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="DEPTNAME != null">  DEPTNAME=#{DEPTNAME,jdbcType=String},</if>
        <if test="POSITIONNAME != null">  POSITIONNAME=#{POSITIONNAME,jdbcType=String},</if>
        <if test="ACTIONNAME != null">  ACTIONNAME=#{ACTIONNAME,jdbcType=String},</if>
        <if test="ACTIVITYNAME != null">  ACTIVITYNAME=#{ACTIVITYNAME,jdbcType=String},</if>
        <if test="MSG != null">  MSG=#{MSG,jdbcType=String},</if>
        <if test="FILES != null">  FILES=#{FILES,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:wfc_comment_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface wfc_comment{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "DEPTNAME", column = "DEPTNAME"),
   Result(property = "POSITIONNAME", column = "POSITIONNAME"),
   Result(property = "ACTIONNAME", column = "ACTIONNAME"),
   Result(property = "ACTIVITYNAME", column = "ACTIVITYNAME"),
   Result(property = "MSG", column = "MSG"),
   Result(property = "FILES", column = "FILES")
)
@Select("""<script>
   SELECT * FROM wfc_comment
</script>""")
fun GetListAll():ArrayList<wfc_comment_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "DEPTNAME", column = "DEPTNAME"),
   Result(property = "POSITIONNAME", column = "POSITIONNAME"),
   Result(property = "ACTIONNAME", column = "ACTIONNAME"),
   Result(property = "ACTIVITYNAME", column = "ACTIVITYNAME"),
   Result(property = "MSG", column = "MSG"),
   Result(property = "FILES", column = "FILES")
)
@Select("""<script>
   SELECT * FROM wfc_comment
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="PROCESSINSTID!=null">
      PROCESSINSTID=#{PROCESSINSTID}
   </if> 
   <if test="TASKINSTID!=null">
      TASKINSTID=#{TASKINSTID}
   </if> 
   <if test="CREATEDATE!=null">
      CREATEDATE=#{CREATEDATE}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="DEPTNAME!=null">
      DEPTNAME=#{DEPTNAME}
   </if> 
   <if test="POSITIONNAME!=null">
      POSITIONNAME=#{POSITIONNAME}
   </if> 
   <if test="ACTIONNAME!=null">
      ACTIONNAME=#{ACTIONNAME}
   </if> 
   <if test="ACTIVITYNAME!=null">
      ACTIVITYNAME=#{ACTIVITYNAME}
   </if> 
   <if test="MSG!=null">
      MSG=#{MSG}
   </if> 
   <if test="FILES!=null">
      FILES=#{FILES}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:wfc_comment_dto):ArrayList<wfc_comment_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PROCESSINSTID", column = "PROCESSINSTID"),
   Result(property = "TASKINSTID", column = "TASKINSTID"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "DEPTNAME", column = "DEPTNAME"),
   Result(property = "POSITIONNAME", column = "POSITIONNAME"),
   Result(property = "ACTIONNAME", column = "ACTIONNAME"),
   Result(property = "ACTIVITYNAME", column = "ACTIVITYNAME"),
   Result(property = "MSG", column = "MSG"),
   Result(property = "FILES", column = "FILES")
)
@Select("""<script>
   SELECT * FROM wfc_comment
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:wfc_comment_dto):wfc_comment_dto?
                


@Insert("""<script>
    insert into wfc_comment
    (ID,PROCESSINSTID,TASKINSTID,CREATEDATE,CREATEUSER,DEPTNAME,POSITIONNAME,ACTIONNAME,ACTIVITYNAME,MSG,FILES)
    values
    (#{ID},#{PROCESSINSTID},#{TASKINSTID},#{CREATEDATE},#{CREATEUSER},#{DEPTNAME},#{POSITIONNAME},#{ACTIONNAME},#{ACTIVITYNAME},#{MSG},#{FILES})
</script>""")
fun Insert(model:wfc_comment_dto):Unit
                


@Insert("""<script>
    insert into wfc_comment
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='PROCESSINSTID!= null'> 
           PROCESSINSTID,
        </if>
        <if test='TASKINSTID!= null'> 
           TASKINSTID,
        </if>
        <if test='CREATEDATE!= null'> 
           CREATEDATE,
        </if>
        <if test='CREATEUSER!= null'> 
           CREATEUSER,
        </if>
        <if test='DEPTNAME!= null'> 
           DEPTNAME,
        </if>
        <if test='POSITIONNAME!= null'> 
           POSITIONNAME,
        </if>
        <if test='ACTIONNAME!= null'> 
           ACTIONNAME,
        </if>
        <if test='ACTIVITYNAME!= null'> 
           ACTIVITYNAME,
        </if>
        <if test='MSG!= null'> 
           MSG,
        </if>
        <if test='FILES!= null'> 
           FILES
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='PROCESSINSTID!= null'> 
           #{PROCESSINSTID,jdbcType=char}，
        </if>
        <if test='TASKINSTID!= null'> 
           #{TASKINSTID,jdbcType=char}，
        </if>
        <if test='CREATEDATE!= null'> 
           #{CREATEDATE,jdbcType=datetime}，
        </if>
        <if test='CREATEUSER!= null'> 
           #{CREATEUSER,jdbcType=varchar}，
        </if>
        <if test='DEPTNAME!= null'> 
           #{DEPTNAME,jdbcType=varchar}，
        </if>
        <if test='POSITIONNAME!= null'> 
           #{POSITIONNAME,jdbcType=varchar}，
        </if>
        <if test='ACTIONNAME!= null'> 
           #{ACTIONNAME,jdbcType=varchar}，
        </if>
        <if test='ACTIVITYNAME!= null'> 
           #{ACTIVITYNAME,jdbcType=varchar}，
        </if>
        <if test='MSG!= null'> 
           #{MSG,jdbcType=text}，
        </if>
        <if test='FILES!= null'> 
           #{FILES,jdbcType=text}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:wfc_comment_dto):Unit
                


@Delete("DELETE FROM wfc_comment WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE wfc_comment SET
        ID=#{ID,jdbcType=String},
        PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},
        TASKINSTID=#{TASKINSTID,jdbcType=String},
        CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},
        CREATEUSER=#{CREATEUSER,jdbcType=String},
        DEPTNAME=#{DEPTNAME,jdbcType=String},
        POSITIONNAME=#{POSITIONNAME,jdbcType=String},
        ACTIONNAME=#{ACTIONNAME,jdbcType=String},
        ACTIVITYNAME=#{ACTIVITYNAME,jdbcType=String},
        MSG=#{MSG,jdbcType=String},
        FILES=#{FILES,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:wfc_comment_dto)
        

@Update("""<script>
            UPDATE wfc_comment SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="PROCESSINSTID != null">  PROCESSINSTID=#{PROCESSINSTID,jdbcType=String},</if>
        <if test="TASKINSTID != null">  TASKINSTID=#{TASKINSTID,jdbcType=String},</if>
        <if test="CREATEDATE != null">  CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},</if>
        <if test="CREATEUSER != null">  CREATEUSER=#{CREATEUSER,jdbcType=String},</if>
        <if test="DEPTNAME != null">  DEPTNAME=#{DEPTNAME,jdbcType=String},</if>
        <if test="POSITIONNAME != null">  POSITIONNAME=#{POSITIONNAME,jdbcType=String},</if>
        <if test="ACTIONNAME != null">  ACTIONNAME=#{ACTIONNAME,jdbcType=String},</if>
        <if test="ACTIVITYNAME != null">  ACTIVITYNAME=#{ACTIVITYNAME,jdbcType=String},</if>
        <if test="MSG != null">  MSG=#{MSG,jdbcType=String},</if>
        <if test="FILES != null">  FILES=#{FILES,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:wfc_comment_dto)
            

}

        
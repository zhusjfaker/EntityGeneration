

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface mam_recommend_app{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "OSTYPE", column = "OSTYPE"),
   Result(property = "DEVICETYPE", column = "DEVICETYPE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM mam_recommend_app
</script>""")
fun GetListAll():ArrayList<mam_recommend_app_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "OSTYPE", column = "OSTYPE"),
   Result(property = "DEVICETYPE", column = "DEVICETYPE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM mam_recommend_app
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="APPID!=null">
      APPID=#{APPID}
   </if> 
   <if test="OSTYPE!=null">
      OSTYPE=#{OSTYPE}
   </if> 
   <if test="DEVICETYPE!=null">
      DEVICETYPE=#{DEVICETYPE}
   </if> 
   <if test="ORDERINDEX!=null">
      ORDERINDEX=#{ORDERINDEX}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:mam_recommend_app_dto):ArrayList<mam_recommend_app_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "APPID", column = "APPID"),
   Result(property = "OSTYPE", column = "OSTYPE"),
   Result(property = "DEVICETYPE", column = "DEVICETYPE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM mam_recommend_app
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:mam_recommend_app_dto):mam_recommend_app_dto?
                


@Insert("""<script>
    insert into mam_recommend_app
    (ID,APPID,OSTYPE,DEVICETYPE,ORDERINDEX)
    values
    (#{ID},#{APPID},#{OSTYPE},#{DEVICETYPE},#{ORDERINDEX})
</script>""")
fun Insert(model:mam_recommend_app_dto):Unit
                


@Insert("""<script>
    insert into mam_recommend_app
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='APPID!= null'> 
           APPID,
        </if>
        <if test='OSTYPE!= null'> 
           OSTYPE,
        </if>
        <if test='DEVICETYPE!= null'> 
           DEVICETYPE,
        </if>
        <if test='ORDERINDEX!= null'> 
           ORDERINDEX
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='APPID!= null'> 
           #{APPID,jdbcType=varchar}，
        </if>
        <if test='OSTYPE!= null'> 
           #{OSTYPE,jdbcType=smallint}，
        </if>
        <if test='DEVICETYPE!= null'> 
           #{DEVICETYPE,jdbcType=smallint}，
        </if>
        <if test='ORDERINDEX!= null'> 
           #{ORDERINDEX,jdbcType=smallint}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:mam_recommend_app_dto):Unit
                


@Delete("DELETE FROM mam_recommend_app WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE mam_recommend_app SET
        ID=#{ID,jdbcType=String},
        APPID=#{APPID,jdbcType=String},
        OSTYPE=#{OSTYPE,jdbcType=Integer},
        DEVICETYPE=#{DEVICETYPE,jdbcType=Integer},
        ORDERINDEX=#{ORDERINDEX,jdbcType=Integer}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:mam_recommend_app_dto)
        

@Update("""<script>
            UPDATE mam_recommend_app SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="APPID != null">  APPID=#{APPID,jdbcType=String},</if>
        <if test="OSTYPE != null">  OSTYPE=#{OSTYPE,jdbcType=Integer},</if>
        <if test="DEVICETYPE != null">  DEVICETYPE=#{DEVICETYPE,jdbcType=Integer},</if>
        <if test="ORDERINDEX != null">  ORDERINDEX=#{ORDERINDEX,jdbcType=Integer}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:mam_recommend_app_dto)
            

}

        
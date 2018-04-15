

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_cms_data_reader{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DATAID", column = "DATAID"),
   Result(property = "READER", column = "READER"),
   Result(property = "ORGID", column = "ORGID"),
   Result(property = "READTIME", column = "READTIME"),
   Result(property = "READERIP", column = "READERIP")
)
@Select("""<script>
   SELECT * FROM app_act_cms_data_reader
</script>""")
fun GetListAll():ArrayList<app_act_cms_data_reader_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DATAID", column = "DATAID"),
   Result(property = "READER", column = "READER"),
   Result(property = "ORGID", column = "ORGID"),
   Result(property = "READTIME", column = "READTIME"),
   Result(property = "READERIP", column = "READERIP")
)
@Select("""<script>
   SELECT * FROM app_act_cms_data_reader
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="DATAID!=null">
      DATAID=#{DATAID}
   </if> 
   <if test="READER!=null">
      READER=#{READER}
   </if> 
   <if test="ORGID!=null">
      ORGID=#{ORGID}
   </if> 
   <if test="READTIME!=null">
      READTIME=#{READTIME}
   </if> 
   <if test="READERIP!=null">
      READERIP=#{READERIP}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_cms_data_reader_dto):ArrayList<app_act_cms_data_reader_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DATAID", column = "DATAID"),
   Result(property = "READER", column = "READER"),
   Result(property = "ORGID", column = "ORGID"),
   Result(property = "READTIME", column = "READTIME"),
   Result(property = "READERIP", column = "READERIP")
)
@Select("""<script>
   SELECT * FROM app_act_cms_data_reader
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_cms_data_reader_dto):app_act_cms_data_reader_dto?
                


@Insert("""<script>
    insert into app_act_cms_data_reader
    (ID,DATAID,READER,ORGID,READTIME,READERIP)
    values
    (#{ID},#{DATAID},#{READER},#{ORGID},#{READTIME},#{READERIP})
</script>""")
fun Insert(model:app_act_cms_data_reader_dto):Unit
                


@Insert("""<script>
    insert into app_act_cms_data_reader
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='DATAID!= null'> 
           DATAID,
        </if>
        <if test='READER!= null'> 
           READER,
        </if>
        <if test='ORGID!= null'> 
           ORGID,
        </if>
        <if test='READTIME!= null'> 
           READTIME,
        </if>
        <if test='READERIP!= null'> 
           READERIP
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='DATAID!= null'> 
           #{DATAID,jdbcType=char}，
        </if>
        <if test='READER!= null'> 
           #{READER,jdbcType=varchar}，
        </if>
        <if test='ORGID!= null'> 
           #{ORGID,jdbcType=varchar}，
        </if>
        <if test='READTIME!= null'> 
           #{READTIME,jdbcType=datetime}，
        </if>
        <if test='READERIP!= null'> 
           #{READERIP,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_cms_data_reader_dto):Unit
                


@Delete("DELETE FROM app_act_cms_data_reader WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE app_act_cms_data_reader SET
        ID=#{ID,jdbcType=String},
        DATAID=#{DATAID,jdbcType=String},
        READER=#{READER,jdbcType=String},
        ORGID=#{ORGID,jdbcType=String},
        READTIME=#{READTIME,jdbcType=Timestamp},
        READERIP=#{READERIP,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:app_act_cms_data_reader_dto)
        

@Update("""<script>
            UPDATE app_act_cms_data_reader SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="DATAID != null">  DATAID=#{DATAID,jdbcType=String},</if>
        <if test="READER != null">  READER=#{READER,jdbcType=String},</if>
        <if test="ORGID != null">  ORGID=#{ORGID,jdbcType=String},</if>
        <if test="READTIME != null">  READTIME=#{READTIME,jdbcType=Timestamp},</if>
        <if test="READERIP != null">  READERIP=#{READERIP,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:app_act_cms_data_reader_dto)
            

}

        

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_cms_data_reader{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DATAID", column = "DATAID"),
   Result(property = "READER", column = "READER"),
   Result(property = "ORGID", column = "ORGID"),
   Result(property = "READTIME", column = "READTIME"),
   Result(property = "READERIP", column = "READERIP")
)
@Select("""<script>
   SELECT * FROM app_act_cms_data_reader
</script>""")
fun GetListAll():ArrayList<app_act_cms_data_reader_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DATAID", column = "DATAID"),
   Result(property = "READER", column = "READER"),
   Result(property = "ORGID", column = "ORGID"),
   Result(property = "READTIME", column = "READTIME"),
   Result(property = "READERIP", column = "READERIP")
)
@Select("""<script>
   SELECT * FROM app_act_cms_data_reader
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="DATAID!=null">
      DATAID=#{DATAID}
   </if> 
   <if test="READER!=null">
      READER=#{READER}
   </if> 
   <if test="ORGID!=null">
      ORGID=#{ORGID}
   </if> 
   <if test="READTIME!=null">
      READTIME=#{READTIME}
   </if> 
   <if test="READERIP!=null">
      READERIP=#{READERIP}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_cms_data_reader_dto):ArrayList<app_act_cms_data_reader_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "DATAID", column = "DATAID"),
   Result(property = "READER", column = "READER"),
   Result(property = "ORGID", column = "ORGID"),
   Result(property = "READTIME", column = "READTIME"),
   Result(property = "READERIP", column = "READERIP")
)
@Select("""<script>
   SELECT * FROM app_act_cms_data_reader
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_cms_data_reader_dto):app_act_cms_data_reader_dto?
                


@Insert("""<script>
    insert into app_act_cms_data_reader
    (ID,DATAID,READER,ORGID,READTIME,READERIP)
    values
    (#{ID},#{DATAID},#{READER},#{ORGID},#{READTIME},#{READERIP})
</script>""")
fun Insert(model:app_act_cms_data_reader_dto):Unit
                


@Insert("""<script>
    insert into app_act_cms_data_reader
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='DATAID!= null'> 
           DATAID,
        </if>
        <if test='READER!= null'> 
           READER,
        </if>
        <if test='ORGID!= null'> 
           ORGID,
        </if>
        <if test='READTIME!= null'> 
           READTIME,
        </if>
        <if test='READERIP!= null'> 
           READERIP
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='DATAID!= null'> 
           #{DATAID,jdbcType=char}，
        </if>
        <if test='READER!= null'> 
           #{READER,jdbcType=varchar}，
        </if>
        <if test='ORGID!= null'> 
           #{ORGID,jdbcType=varchar}，
        </if>
        <if test='READTIME!= null'> 
           #{READTIME,jdbcType=datetime}，
        </if>
        <if test='READERIP!= null'> 
           #{READERIP,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:app_act_cms_data_reader_dto):Unit
                


@Delete("DELETE FROM app_act_cms_data_reader WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE app_act_cms_data_reader SET
        ID=#{ID,jdbcType=String},
        DATAID=#{DATAID,jdbcType=String},
        READER=#{READER,jdbcType=String},
        ORGID=#{ORGID,jdbcType=String},
        READTIME=#{READTIME,jdbcType=Timestamp},
        READERIP=#{READERIP,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:app_act_cms_data_reader_dto)
        

@Update("""<script>
            UPDATE app_act_cms_data_reader SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="DATAID != null">  DATAID=#{DATAID,jdbcType=String},</if>
        <if test="READER != null">  READER=#{READER,jdbcType=String},</if>
        <if test="ORGID != null">  ORGID=#{ORGID,jdbcType=String},</if>
        <if test="READTIME != null">  READTIME=#{READTIME,jdbcType=Timestamp},</if>
        <if test="READERIP != null">  READERIP=#{READERIP,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:app_act_cms_data_reader_dto)
            

}

        
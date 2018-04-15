

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface orgrole_bk{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ROLENAME", column = "ROLENAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "CATEGORYNAME", column = "CATEGORYNAME"),
   Result(property = "LOOKANDFEEL", column = "LOOKANDFEEL"),
   Result(property = "ROLENO", column = "ROLENO"),
   Result(property = "ROLEDESC", column = "ROLEDESC"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE")
)
@Select("""<script>
   SELECT * FROM orgrole_bk
</script>""")
fun GetListAll():ArrayList<orgrole_bk_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ROLENAME", column = "ROLENAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "CATEGORYNAME", column = "CATEGORYNAME"),
   Result(property = "LOOKANDFEEL", column = "LOOKANDFEEL"),
   Result(property = "ROLENO", column = "ROLENO"),
   Result(property = "ROLEDESC", column = "ROLEDESC"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE")
)
@Select("""<script>
   SELECT * FROM orgrole_bk
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="ROLENAME!=null">
      ROLENAME=#{ROLENAME}
   </if> 
   <if test="ORDERINDEX!=null">
      ORDERINDEX=#{ORDERINDEX}
   </if> 
   <if test="CATEGORYNAME!=null">
      CATEGORYNAME=#{CATEGORYNAME}
   </if> 
   <if test="LOOKANDFEEL!=null">
      LOOKANDFEEL=#{LOOKANDFEEL}
   </if> 
   <if test="ROLENO!=null">
      ROLENO=#{ROLENO}
   </if> 
   <if test="ROLEDESC!=null">
      ROLEDESC=#{ROLEDESC}
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
   <if test="CREATEDATE!=null">
      CREATEDATE=#{CREATEDATE}
   </if> 
   <if test="UPDATEDATE!=null">
      UPDATEDATE=#{UPDATEDATE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:orgrole_bk_dto):ArrayList<orgrole_bk_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ROLENAME", column = "ROLENAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "CATEGORYNAME", column = "CATEGORYNAME"),
   Result(property = "LOOKANDFEEL", column = "LOOKANDFEEL"),
   Result(property = "ROLENO", column = "ROLENO"),
   Result(property = "ROLEDESC", column = "ROLEDESC"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE")
)
@Select("""<script>
   SELECT * FROM orgrole_bk
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:orgrole_bk_dto):orgrole_bk_dto?
                


@Insert("""<script>
    insert into orgrole_bk
    (ID,ROLENAME,ORDERINDEX,CATEGORYNAME,LOOKANDFEEL,ROLENO,ROLEDESC,EXT1,EXT2,EXT3,EXT4,EXT5,CREATEDATE,UPDATEDATE)
    values
    (#{ID},#{ROLENAME},#{ORDERINDEX},#{CATEGORYNAME},#{LOOKANDFEEL},#{ROLENO},#{ROLEDESC},#{EXT1},#{EXT2},#{EXT3},#{EXT4},#{EXT5},#{CREATEDATE},#{UPDATEDATE})
</script>""")
fun Insert(model:orgrole_bk_dto):Unit
                


@Insert("""<script>
    insert into orgrole_bk
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
           ROLENAME,
           ORDERINDEX,
           CATEGORYNAME,
        <if test='LOOKANDFEEL!= null'> 
           LOOKANDFEEL,
        </if>
        <if test='ROLENO!= null'> 
           ROLENO,
        </if>
        <if test='ROLEDESC!= null'> 
           ROLEDESC,
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
        <if test='CREATEDATE!= null'> 
           CREATEDATE,
        </if>
        <if test='UPDATEDATE!= null'> 
           UPDATEDATE
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=varchar}，
           #{ROLENAME,jdbcType=varchar}，
           #{ORDERINDEX,jdbcType=decimal}，
           #{CATEGORYNAME,jdbcType=varchar}，
        <if test='LOOKANDFEEL!= null'> 
           #{LOOKANDFEEL,jdbcType=varchar}，
        </if>
        <if test='ROLENO!= null'> 
           #{ROLENO,jdbcType=varchar}，
        </if>
        <if test='ROLEDESC!= null'> 
           #{ROLEDESC,jdbcType=varchar}，
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
        <if test='CREATEDATE!= null'> 
           #{CREATEDATE,jdbcType=datetime}，
        </if>
        <if test='UPDATEDATE!= null'> 
           #{UPDATEDATE,jdbcType=datetime}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:orgrole_bk_dto):Unit
                


@Delete("DELETE FROM orgrole_bk WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE orgrole_bk SET
        ID=#{ID,jdbcType=String},
        ROLENAME=#{ROLENAME,jdbcType=String},
        ORDERINDEX=#{ORDERINDEX,jdbcType=BigDecimal},
        CATEGORYNAME=#{CATEGORYNAME,jdbcType=String},
        LOOKANDFEEL=#{LOOKANDFEEL,jdbcType=String},
        ROLENO=#{ROLENO,jdbcType=String},
        ROLEDESC=#{ROLEDESC,jdbcType=String},
        EXT1=#{EXT1,jdbcType=String},
        EXT2=#{EXT2,jdbcType=String},
        EXT3=#{EXT3,jdbcType=String},
        EXT4=#{EXT4,jdbcType=String},
        EXT5=#{EXT5,jdbcType=String},
        CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},
        UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:orgrole_bk_dto)
        

@Update("""<script>
            UPDATE orgrole_bk SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="ROLENAME != null">  ROLENAME=#{ROLENAME,jdbcType=String},</if>
        <if test="ORDERINDEX != null">  ORDERINDEX=#{ORDERINDEX,jdbcType=BigDecimal},</if>
        <if test="CATEGORYNAME != null">  CATEGORYNAME=#{CATEGORYNAME,jdbcType=String},</if>
        <if test="LOOKANDFEEL != null">  LOOKANDFEEL=#{LOOKANDFEEL,jdbcType=String},</if>
        <if test="ROLENO != null">  ROLENO=#{ROLENO,jdbcType=String},</if>
        <if test="ROLEDESC != null">  ROLEDESC=#{ROLEDESC,jdbcType=String},</if>
        <if test="EXT1 != null">  EXT1=#{EXT1,jdbcType=String},</if>
        <if test="EXT2 != null">  EXT2=#{EXT2,jdbcType=String},</if>
        <if test="EXT3 != null">  EXT3=#{EXT3,jdbcType=String},</if>
        <if test="EXT4 != null">  EXT4=#{EXT4,jdbcType=String},</if>
        <if test="EXT5 != null">  EXT5=#{EXT5,jdbcType=String},</if>
        <if test="CREATEDATE != null">  CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},</if>
        <if test="UPDATEDATE != null">  UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:orgrole_bk_dto)
            

}

        
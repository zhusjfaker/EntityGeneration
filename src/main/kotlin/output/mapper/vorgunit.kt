

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface vorgunit{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "RDEPTID", column = "RDEPTID"),
   Result(property = "UNITNAME", column = "UNITNAME"),
   Result(property = "ADMINISTRATORS", column = "ADMINISTRATORS"),
   Result(property = "UNITGROUP", column = "UNITGROUP"),
   Result(property = "UNITDESC", column = "UNITDESC"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5")
)
@Select("""<script>
   SELECT * FROM vorgunit
</script>""")
fun GetListAll():ArrayList<vorgunit_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "RDEPTID", column = "RDEPTID"),
   Result(property = "UNITNAME", column = "UNITNAME"),
   Result(property = "ADMINISTRATORS", column = "ADMINISTRATORS"),
   Result(property = "UNITGROUP", column = "UNITGROUP"),
   Result(property = "UNITDESC", column = "UNITDESC"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5")
)
@Select("""<script>
   SELECT * FROM vorgunit
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="RDEPTID!=null">
      RDEPTID=#{RDEPTID}
   </if> 
   <if test="UNITNAME!=null">
      UNITNAME=#{UNITNAME}
   </if> 
   <if test="ADMINISTRATORS!=null">
      ADMINISTRATORS=#{ADMINISTRATORS}
   </if> 
   <if test="UNITGROUP!=null">
      UNITGROUP=#{UNITGROUP}
   </if> 
   <if test="UNITDESC!=null">
      UNITDESC=#{UNITDESC}
   </if> 
   <if test="STATUS!=null">
      STATUS=#{STATUS}
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
fun ConditionalQuery(model:vorgunit_dto):ArrayList<vorgunit_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "RDEPTID", column = "RDEPTID"),
   Result(property = "UNITNAME", column = "UNITNAME"),
   Result(property = "ADMINISTRATORS", column = "ADMINISTRATORS"),
   Result(property = "UNITGROUP", column = "UNITGROUP"),
   Result(property = "UNITDESC", column = "UNITDESC"),
   Result(property = "STATUS", column = "STATUS"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5")
)
@Select("""<script>
   SELECT * FROM vorgunit
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:vorgunit_dto):vorgunit_dto?
                


@Insert("""<script>
    insert into vorgunit
    (ID,RDEPTID,UNITNAME,ADMINISTRATORS,UNITGROUP,UNITDESC,STATUS,EXT1,EXT2,EXT3,EXT4,EXT5)
    values
    (#{ID},#{RDEPTID},#{UNITNAME},#{ADMINISTRATORS},#{UNITGROUP},#{UNITDESC},#{STATUS},#{EXT1},#{EXT2},#{EXT3},#{EXT4},#{EXT5})
</script>""")
fun Insert(model:vorgunit_dto):Unit
                


@Insert("""<script>
    insert into vorgunit
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='RDEPTID!= null'> 
           RDEPTID,
        </if>
        <if test='UNITNAME!= null'> 
           UNITNAME,
        </if>
        <if test='ADMINISTRATORS!= null'> 
           ADMINISTRATORS,
        </if>
        <if test='UNITGROUP!= null'> 
           UNITGROUP,
        </if>
        <if test='UNITDESC!= null'> 
           UNITDESC,
        </if>
        <if test='STATUS!= null'> 
           STATUS,
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
           #{ID,jdbcType=varchar}，
        <if test='RDEPTID!= null'> 
           #{RDEPTID,jdbcType=varchar}，
        </if>
        <if test='UNITNAME!= null'> 
           #{UNITNAME,jdbcType=varchar}，
        </if>
        <if test='ADMINISTRATORS!= null'> 
           #{ADMINISTRATORS,jdbcType=varchar}，
        </if>
        <if test='UNITGROUP!= null'> 
           #{UNITGROUP,jdbcType=varchar}，
        </if>
        <if test='UNITDESC!= null'> 
           #{UNITDESC,jdbcType=varchar}，
        </if>
        <if test='STATUS!= null'> 
           #{STATUS,jdbcType=smallint}，
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
           #{EXT5,jdbcType=varchar}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:vorgunit_dto):Unit
                


@Delete("DELETE FROM vorgunit WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE vorgunit SET
        ID=#{ID,jdbcType=String},
        RDEPTID=#{RDEPTID,jdbcType=String},
        UNITNAME=#{UNITNAME,jdbcType=String},
        ADMINISTRATORS=#{ADMINISTRATORS,jdbcType=String},
        UNITGROUP=#{UNITGROUP,jdbcType=String},
        UNITDESC=#{UNITDESC,jdbcType=String},
        STATUS=#{STATUS,jdbcType=Integer},
        EXT1=#{EXT1,jdbcType=String},
        EXT2=#{EXT2,jdbcType=String},
        EXT3=#{EXT3,jdbcType=String},
        EXT4=#{EXT4,jdbcType=String},
        EXT5=#{EXT5,jdbcType=String}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:vorgunit_dto)
        

@Update("""<script>
            UPDATE vorgunit SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="RDEPTID != null">  RDEPTID=#{RDEPTID,jdbcType=String},</if>
        <if test="UNITNAME != null">  UNITNAME=#{UNITNAME,jdbcType=String},</if>
        <if test="ADMINISTRATORS != null">  ADMINISTRATORS=#{ADMINISTRATORS,jdbcType=String},</if>
        <if test="UNITGROUP != null">  UNITGROUP=#{UNITGROUP,jdbcType=String},</if>
        <if test="UNITDESC != null">  UNITDESC=#{UNITDESC,jdbcType=String},</if>
        <if test="STATUS != null">  STATUS=#{STATUS,jdbcType=Integer},</if>
        <if test="EXT1 != null">  EXT1=#{EXT1,jdbcType=String},</if>
        <if test="EXT2 != null">  EXT2=#{EXT2,jdbcType=String},</if>
        <if test="EXT3 != null">  EXT3=#{EXT3,jdbcType=String},</if>
        <if test="EXT4 != null">  EXT4=#{EXT4,jdbcType=String},</if>
        <if test="EXT5 != null">  EXT5=#{EXT5,jdbcType=String}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:vorgunit_dto)
            

}

        
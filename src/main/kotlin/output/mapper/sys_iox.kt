

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface sys_iox{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ADVANCETYPE", column = "ADVANCETYPE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM sys_iox
</script>""")
fun GetListAll():ArrayList<sys_iox_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ADVANCETYPE", column = "ADVANCETYPE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM sys_iox
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="ADVANCETYPE!=null">
      ADVANCETYPE=#{ADVANCETYPE}
   </if> 
   <if test="ORDERINDEX!=null">
      ORDERINDEX=#{ORDERINDEX}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:sys_iox_dto):ArrayList<sys_iox_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ADVANCETYPE", column = "ADVANCETYPE"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX")
)
@Select("""<script>
   SELECT * FROM sys_iox
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:sys_iox_dto):sys_iox_dto?
                


@Insert("""<script>
    insert into sys_iox
    (ID,ADVANCETYPE,ORDERINDEX)
    values
    (#{ID},#{ADVANCETYPE},#{ORDERINDEX})
</script>""")
fun Insert(model:sys_iox_dto):Unit
                


@Insert("""<script>
    insert into sys_iox
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='ADVANCETYPE!= null'> 
           ADVANCETYPE,
        </if>
        <if test='ORDERINDEX!= null'> 
           ORDERINDEX
        </if>
    </trim>
    <trim prefix="values (" suffix=")" suffixOverrides="," >
           #{ID,jdbcType=char}，
        <if test='ADVANCETYPE!= null'> 
           #{ADVANCETYPE,jdbcType=varchar}，
        </if>
        <if test='ORDERINDEX!= null'> 
           #{ORDERINDEX,jdbcType=smallint}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:sys_iox_dto):Unit
                


@Delete("DELETE FROM sys_iox WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE sys_iox SET
        ID=#{ID,jdbcType=String},
        ADVANCETYPE=#{ADVANCETYPE,jdbcType=String},
        ORDERINDEX=#{ORDERINDEX,jdbcType=Integer}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:sys_iox_dto)
        

@Update("""<script>
            UPDATE sys_iox SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="ADVANCETYPE != null">  ADVANCETYPE=#{ADVANCETYPE,jdbcType=String},</if>
        <if test="ORDERINDEX != null">  ORDERINDEX=#{ORDERINDEX,jdbcType=Integer}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:sys_iox_dto)
            

}

        
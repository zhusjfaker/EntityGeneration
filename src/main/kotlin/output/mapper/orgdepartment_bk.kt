

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface orgdepartment_bk{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PARENTDEPARTMENTID", column = "PARENTDEPARTMENTID"),
   Result(property = "DEPARTMENTNAME", column = "DEPARTMENTNAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "DEPARTMENTDESC", column = "DEPARTMENTDESC"),
   Result(property = "DEPARTMENTNO", column = "DEPARTMENTNO"),
   Result(property = "LAYER", column = "LAYER"),
   Result(property = "ADMINISTRATORS", column = "ADMINISTRATORS"),
   Result(property = "DEPARTMENTZONE", column = "DEPARTMENTZONE"),
   Result(property = "COMPANYID", column = "COMPANYID"),
   Result(property = "OUTERID", column = "OUTERID"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "WORKCANLENDAR", column = "WORKCANLENDAR"),
   Result(property = "ISUNIT", column = "ISUNIT"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "DEPARTMENTTYPE", column = "DEPARTMENTTYPE"),
   Result(property = "CLOSED", column = "CLOSED"),
   Result(property = "CLOSEDATE", column = "CLOSEDATE"),
   Result(property = "BEGINDATE", column = "BEGINDATE"),
   Result(property = "ENDDATE", column = "ENDDATE"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE")
)
@Select("""<script>
   SELECT * FROM orgdepartment_bk
</script>""")
fun GetListAll():ArrayList<orgdepartment_bk_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PARENTDEPARTMENTID", column = "PARENTDEPARTMENTID"),
   Result(property = "DEPARTMENTNAME", column = "DEPARTMENTNAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "DEPARTMENTDESC", column = "DEPARTMENTDESC"),
   Result(property = "DEPARTMENTNO", column = "DEPARTMENTNO"),
   Result(property = "LAYER", column = "LAYER"),
   Result(property = "ADMINISTRATORS", column = "ADMINISTRATORS"),
   Result(property = "DEPARTMENTZONE", column = "DEPARTMENTZONE"),
   Result(property = "COMPANYID", column = "COMPANYID"),
   Result(property = "OUTERID", column = "OUTERID"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "WORKCANLENDAR", column = "WORKCANLENDAR"),
   Result(property = "ISUNIT", column = "ISUNIT"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "DEPARTMENTTYPE", column = "DEPARTMENTTYPE"),
   Result(property = "CLOSED", column = "CLOSED"),
   Result(property = "CLOSEDATE", column = "CLOSEDATE"),
   Result(property = "BEGINDATE", column = "BEGINDATE"),
   Result(property = "ENDDATE", column = "ENDDATE"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE")
)
@Select("""<script>
   SELECT * FROM orgdepartment_bk
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="PARENTDEPARTMENTID!=null">
      PARENTDEPARTMENTID=#{PARENTDEPARTMENTID}
   </if> 
   <if test="DEPARTMENTNAME!=null">
      DEPARTMENTNAME=#{DEPARTMENTNAME}
   </if> 
   <if test="ORDERINDEX!=null">
      ORDERINDEX=#{ORDERINDEX}
   </if> 
   <if test="DEPARTMENTDESC!=null">
      DEPARTMENTDESC=#{DEPARTMENTDESC}
   </if> 
   <if test="DEPARTMENTNO!=null">
      DEPARTMENTNO=#{DEPARTMENTNO}
   </if> 
   <if test="LAYER!=null">
      LAYER=#{LAYER}
   </if> 
   <if test="ADMINISTRATORS!=null">
      ADMINISTRATORS=#{ADMINISTRATORS}
   </if> 
   <if test="DEPARTMENTZONE!=null">
      DEPARTMENTZONE=#{DEPARTMENTZONE}
   </if> 
   <if test="COMPANYID!=null">
      COMPANYID=#{COMPANYID}
   </if> 
   <if test="OUTERID!=null">
      OUTERID=#{OUTERID}
   </if> 
   <if test="EXT1!=null">
      EXT1=#{EXT1}
   </if> 
   <if test="EXT2!=null">
      EXT2=#{EXT2}
   </if> 
   <if test="WORKCANLENDAR!=null">
      WORKCANLENDAR=#{WORKCANLENDAR}
   </if> 
   <if test="ISUNIT!=null">
      ISUNIT=#{ISUNIT}
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
   <if test="DEPARTMENTTYPE!=null">
      DEPARTMENTTYPE=#{DEPARTMENTTYPE}
   </if> 
   <if test="CLOSED!=null">
      CLOSED=#{CLOSED}
   </if> 
   <if test="CLOSEDATE!=null">
      CLOSEDATE=#{CLOSEDATE}
   </if> 
   <if test="BEGINDATE!=null">
      BEGINDATE=#{BEGINDATE}
   </if> 
   <if test="ENDDATE!=null">
      ENDDATE=#{ENDDATE}
   </if> 
   <if test="CREATEDATE!=null">
      CREATEDATE=#{CREATEDATE}
   </if> 
   <if test="UPDATEDATE!=null">
      UPDATEDATE=#{UPDATEDATE}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:orgdepartment_bk_dto):ArrayList<orgdepartment_bk_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "PARENTDEPARTMENTID", column = "PARENTDEPARTMENTID"),
   Result(property = "DEPARTMENTNAME", column = "DEPARTMENTNAME"),
   Result(property = "ORDERINDEX", column = "ORDERINDEX"),
   Result(property = "DEPARTMENTDESC", column = "DEPARTMENTDESC"),
   Result(property = "DEPARTMENTNO", column = "DEPARTMENTNO"),
   Result(property = "LAYER", column = "LAYER"),
   Result(property = "ADMINISTRATORS", column = "ADMINISTRATORS"),
   Result(property = "DEPARTMENTZONE", column = "DEPARTMENTZONE"),
   Result(property = "COMPANYID", column = "COMPANYID"),
   Result(property = "OUTERID", column = "OUTERID"),
   Result(property = "EXT1", column = "EXT1"),
   Result(property = "EXT2", column = "EXT2"),
   Result(property = "WORKCANLENDAR", column = "WORKCANLENDAR"),
   Result(property = "ISUNIT", column = "ISUNIT"),
   Result(property = "EXT3", column = "EXT3"),
   Result(property = "EXT4", column = "EXT4"),
   Result(property = "EXT5", column = "EXT5"),
   Result(property = "DEPARTMENTTYPE", column = "DEPARTMENTTYPE"),
   Result(property = "CLOSED", column = "CLOSED"),
   Result(property = "CLOSEDATE", column = "CLOSEDATE"),
   Result(property = "BEGINDATE", column = "BEGINDATE"),
   Result(property = "ENDDATE", column = "ENDDATE"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE")
)
@Select("""<script>
   SELECT * FROM orgdepartment_bk
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:orgdepartment_bk_dto):orgdepartment_bk_dto?
                


@Insert("""<script>
    insert into orgdepartment_bk
    (ID,PARENTDEPARTMENTID,DEPARTMENTNAME,ORDERINDEX,DEPARTMENTDESC,DEPARTMENTNO,LAYER,ADMINISTRATORS,DEPARTMENTZONE,COMPANYID,OUTERID,EXT1,EXT2,WORKCANLENDAR,ISUNIT,EXT3,EXT4,EXT5,DEPARTMENTTYPE,CLOSED,CLOSEDATE,BEGINDATE,ENDDATE,CREATEDATE,UPDATEDATE)
    values
    (#{ID},#{PARENTDEPARTMENTID},#{DEPARTMENTNAME},#{ORDERINDEX},#{DEPARTMENTDESC},#{DEPARTMENTNO},#{LAYER},#{ADMINISTRATORS},#{DEPARTMENTZONE},#{COMPANYID},#{OUTERID},#{EXT1},#{EXT2},#{WORKCANLENDAR},#{ISUNIT},#{EXT3},#{EXT4},#{EXT5},#{DEPARTMENTTYPE},#{CLOSED},#{CLOSEDATE},#{BEGINDATE},#{ENDDATE},#{CREATEDATE},#{UPDATEDATE})
</script>""")
fun Insert(model:orgdepartment_bk_dto):Unit
                


@Insert("""<script>
    insert into orgdepartment_bk
    <trim prefix="(" suffix=")" suffixOverrides="," >
           ID,
        <if test='PARENTDEPARTMENTID!= null'> 
           PARENTDEPARTMENTID,
        </if>
           DEPARTMENTNAME,
        <if test='ORDERINDEX!= null'> 
           ORDERINDEX,
        </if>
        <if test='DEPARTMENTDESC!= null'> 
           DEPARTMENTDESC,
        </if>
        <if test='DEPARTMENTNO!= null'> 
           DEPARTMENTNO,
        </if>
        <if test='LAYER!= null'> 
           LAYER,
        </if>
        <if test='ADMINISTRATORS!= null'> 
           ADMINISTRATORS,
        </if>
        <if test='DEPARTMENTZONE!= null'> 
           DEPARTMENTZONE,
        </if>
           COMPANYID,
        <if test='OUTERID!= null'> 
           OUTERID,
        </if>
        <if test='EXT1!= null'> 
           EXT1,
        </if>
        <if test='EXT2!= null'> 
           EXT2,
        </if>
        <if test='WORKCANLENDAR!= null'> 
           WORKCANLENDAR,
        </if>
        <if test='ISUNIT!= null'> 
           ISUNIT,
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
        <if test='DEPARTMENTTYPE!= null'> 
           DEPARTMENTTYPE,
        </if>
        <if test='CLOSED!= null'> 
           CLOSED,
        </if>
        <if test='CLOSEDATE!= null'> 
           CLOSEDATE,
        </if>
        <if test='BEGINDATE!= null'> 
           BEGINDATE,
        </if>
        <if test='ENDDATE!= null'> 
           ENDDATE,
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
        <if test='PARENTDEPARTMENTID!= null'> 
           #{PARENTDEPARTMENTID,jdbcType=varchar}，
        </if>
           #{DEPARTMENTNAME,jdbcType=varchar}，
        <if test='ORDERINDEX!= null'> 
           #{ORDERINDEX,jdbcType=decimal}，
        </if>
        <if test='DEPARTMENTDESC!= null'> 
           #{DEPARTMENTDESC,jdbcType=varchar}，
        </if>
        <if test='DEPARTMENTNO!= null'> 
           #{DEPARTMENTNO,jdbcType=varchar}，
        </if>
        <if test='LAYER!= null'> 
           #{LAYER,jdbcType=smallint}，
        </if>
        <if test='ADMINISTRATORS!= null'> 
           #{ADMINISTRATORS,jdbcType=varchar}，
        </if>
        <if test='DEPARTMENTZONE!= null'> 
           #{DEPARTMENTZONE,jdbcType=varchar}，
        </if>
           #{COMPANYID,jdbcType=varchar}，
        <if test='OUTERID!= null'> 
           #{OUTERID,jdbcType=text}，
        </if>
        <if test='EXT1!= null'> 
           #{EXT1,jdbcType=varchar}，
        </if>
        <if test='EXT2!= null'> 
           #{EXT2,jdbcType=varchar}，
        </if>
        <if test='WORKCANLENDAR!= null'> 
           #{WORKCANLENDAR,jdbcType=varchar}，
        </if>
        <if test='ISUNIT!= null'> 
           #{ISUNIT,jdbcType=smallint}，
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
        <if test='DEPARTMENTTYPE!= null'> 
           #{DEPARTMENTTYPE,jdbcType=varchar}，
        </if>
        <if test='CLOSED!= null'> 
           #{CLOSED,jdbcType=smallint}，
        </if>
        <if test='CLOSEDATE!= null'> 
           #{CLOSEDATE,jdbcType=datetime}，
        </if>
        <if test='BEGINDATE!= null'> 
           #{BEGINDATE,jdbcType=datetime}，
        </if>
        <if test='ENDDATE!= null'> 
           #{ENDDATE,jdbcType=datetime}，
        </if>
        <if test='CREATEDATE!= null'> 
           #{CREATEDATE,jdbcType=datetime}，
        </if>
        <if test='UPDATEDATE!= null'> 
           #{UPDATEDATE,jdbcType=datetime}
        </if>
    </trim>
</script>""")
fun InsertSelective(model:orgdepartment_bk_dto):Unit
                


@Delete("DELETE FROM orgdepartment_bk WHERE ID=#{arg0}")
fun DeleteByPrimaryKey(ID:String)
        

@Update("""<script>
        UPDATE orgdepartment_bk SET
        ID=#{ID,jdbcType=String},
        PARENTDEPARTMENTID=#{PARENTDEPARTMENTID,jdbcType=String},
        DEPARTMENTNAME=#{DEPARTMENTNAME,jdbcType=String},
        ORDERINDEX=#{ORDERINDEX,jdbcType=BigDecimal},
        DEPARTMENTDESC=#{DEPARTMENTDESC,jdbcType=String},
        DEPARTMENTNO=#{DEPARTMENTNO,jdbcType=String},
        LAYER=#{LAYER,jdbcType=Integer},
        ADMINISTRATORS=#{ADMINISTRATORS,jdbcType=String},
        DEPARTMENTZONE=#{DEPARTMENTZONE,jdbcType=String},
        COMPANYID=#{COMPANYID,jdbcType=String},
        OUTERID=#{OUTERID,jdbcType=String},
        EXT1=#{EXT1,jdbcType=String},
        EXT2=#{EXT2,jdbcType=String},
        WORKCANLENDAR=#{WORKCANLENDAR,jdbcType=String},
        ISUNIT=#{ISUNIT,jdbcType=Integer},
        EXT3=#{EXT3,jdbcType=String},
        EXT4=#{EXT4,jdbcType=String},
        EXT5=#{EXT5,jdbcType=String},
        DEPARTMENTTYPE=#{DEPARTMENTTYPE,jdbcType=String},
        CLOSED=#{CLOSED,jdbcType=Integer},
        CLOSEDATE=#{CLOSEDATE,jdbcType=Timestamp},
        BEGINDATE=#{BEGINDATE,jdbcType=Timestamp},
        ENDDATE=#{ENDDATE,jdbcType=Timestamp},
        CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},
        UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp}
        WHERE ID=#{ID,jdbcType=String}
        </script>""")
fun UpdateByPrimaryKey(model:orgdepartment_bk_dto)
        

@Update("""<script>
            UPDATE orgdepartment_bk SET
            <if test="ID != null">  ID=#{ID,jdbcType=String},</if>
        <if test="PARENTDEPARTMENTID != null">  PARENTDEPARTMENTID=#{PARENTDEPARTMENTID,jdbcType=String},</if>
        <if test="DEPARTMENTNAME != null">  DEPARTMENTNAME=#{DEPARTMENTNAME,jdbcType=String},</if>
        <if test="ORDERINDEX != null">  ORDERINDEX=#{ORDERINDEX,jdbcType=BigDecimal},</if>
        <if test="DEPARTMENTDESC != null">  DEPARTMENTDESC=#{DEPARTMENTDESC,jdbcType=String},</if>
        <if test="DEPARTMENTNO != null">  DEPARTMENTNO=#{DEPARTMENTNO,jdbcType=String},</if>
        <if test="LAYER != null">  LAYER=#{LAYER,jdbcType=Integer},</if>
        <if test="ADMINISTRATORS != null">  ADMINISTRATORS=#{ADMINISTRATORS,jdbcType=String},</if>
        <if test="DEPARTMENTZONE != null">  DEPARTMENTZONE=#{DEPARTMENTZONE,jdbcType=String},</if>
        <if test="COMPANYID != null">  COMPANYID=#{COMPANYID,jdbcType=String},</if>
        <if test="OUTERID != null">  OUTERID=#{OUTERID,jdbcType=String},</if>
        <if test="EXT1 != null">  EXT1=#{EXT1,jdbcType=String},</if>
        <if test="EXT2 != null">  EXT2=#{EXT2,jdbcType=String},</if>
        <if test="WORKCANLENDAR != null">  WORKCANLENDAR=#{WORKCANLENDAR,jdbcType=String},</if>
        <if test="ISUNIT != null">  ISUNIT=#{ISUNIT,jdbcType=Integer},</if>
        <if test="EXT3 != null">  EXT3=#{EXT3,jdbcType=String},</if>
        <if test="EXT4 != null">  EXT4=#{EXT4,jdbcType=String},</if>
        <if test="EXT5 != null">  EXT5=#{EXT5,jdbcType=String},</if>
        <if test="DEPARTMENTTYPE != null">  DEPARTMENTTYPE=#{DEPARTMENTTYPE,jdbcType=String},</if>
        <if test="CLOSED != null">  CLOSED=#{CLOSED,jdbcType=Integer},</if>
        <if test="CLOSEDATE != null">  CLOSEDATE=#{CLOSEDATE,jdbcType=Timestamp},</if>
        <if test="BEGINDATE != null">  BEGINDATE=#{BEGINDATE,jdbcType=Timestamp},</if>
        <if test="ENDDATE != null">  ENDDATE=#{ENDDATE,jdbcType=Timestamp},</if>
        <if test="CREATEDATE != null">  CREATEDATE=#{CREATEDATE,jdbcType=Timestamp},</if>
        <if test="UPDATEDATE != null">  UPDATEDATE=#{UPDATEDATE,jdbcType=Timestamp}
              WHERE ID=#{ID,jdbcType=String}
            </script>""")
fun UpdateByPrimaryKeySelective(model:orgdepartment_bk_dto)
            

}

        
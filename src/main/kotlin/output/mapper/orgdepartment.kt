

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface orgdepartment{


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
   SELECT * FROM orgdepartment
</script>""")
fun GetListAll():ArrayList<orgdepartment_dto>
        


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
   SELECT * FROM orgdepartment
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
fun ConditionalQuery(model:orgdepartment_dto):ArrayList<orgdepartment_dto>
                


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
   SELECT * FROM orgdepartment
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:orgdepartment_dto):orgdepartment_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,PARENTDEPARTMENTID,DEPARTMENTNAME,ORDERINDEX,DEPARTMENTDESC,DEPARTMENTNO,LAYER,ADMINISTRATORS,DEPARTMENTZONE,COMPANYID,OUTERID,EXT1,EXT2,WORKCANLENDAR,ISUNIT,EXT3,EXT4,EXT5,DEPARTMENTTYPE,CLOSED,CLOSEDATE,BEGINDATE,ENDDATE,CREATEDATE,UPDATEDATE)
    values
    (#{ID},#{PARENTDEPARTMENTID},#{DEPARTMENTNAME},#{ORDERINDEX},#{DEPARTMENTDESC},#{DEPARTMENTNO},#{LAYER},#{ADMINISTRATORS},#{DEPARTMENTZONE},#{COMPANYID},#{OUTERID},#{EXT1},#{EXT2},#{WORKCANLENDAR},#{ISUNIT},#{EXT3},#{EXT4},#{EXT5},#{DEPARTMENTTYPE},#{CLOSED},#{CLOSEDATE},#{BEGINDATE},#{ENDDATE},#{CREATEDATE},#{UPDATEDATE})
</script>""")
fun insert(model:orgdepartment_dto):Unit
                

}

        
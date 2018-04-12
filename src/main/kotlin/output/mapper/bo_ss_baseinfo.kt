

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface bo_ss_baseinfo{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ORGID", column = "ORGID"),
   Result(property = "BINDID", column = "BINDID"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE"),
   Result(property = "UPDATEUSER", column = "UPDATEUSER"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ISEND", column = "ISEND"),
   Result(property = "TYPE", column = "TYPE"),
   Result(property = "NAME", column = "NAME"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "GTYPE", column = "GTYPE"),
   Result(property = "SN", column = "SN"),
   Result(property = "TYPEID", column = "TYPEID"),
   Result(property = "CNNAME", column = "CNNAME"),
   Result(property = "ENNAME", column = "ENNAME"),
   Result(property = "BIG5NAME", column = "BIG5NAME")
)
@Select("""<script>
   SELECT * FROM bo_ss_baseinfo
</script>""")
fun GetListAll():ArrayList<bo_ss_baseinfo_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ORGID", column = "ORGID"),
   Result(property = "BINDID", column = "BINDID"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE"),
   Result(property = "UPDATEUSER", column = "UPDATEUSER"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ISEND", column = "ISEND"),
   Result(property = "TYPE", column = "TYPE"),
   Result(property = "NAME", column = "NAME"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "GTYPE", column = "GTYPE"),
   Result(property = "SN", column = "SN"),
   Result(property = "TYPEID", column = "TYPEID"),
   Result(property = "CNNAME", column = "CNNAME"),
   Result(property = "ENNAME", column = "ENNAME"),
   Result(property = "BIG5NAME", column = "BIG5NAME")
)
@Select("""<script>
   SELECT * FROM bo_ss_baseinfo
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="ORGID!=null">
      ORGID=#{ORGID}
   </if> 
   <if test="BINDID!=null">
      BINDID=#{BINDID}
   </if> 
   <if test="CREATEDATE!=null">
      CREATEDATE=#{CREATEDATE}
   </if> 
   <if test="CREATEUSER!=null">
      CREATEUSER=#{CREATEUSER}
   </if> 
   <if test="UPDATEDATE!=null">
      UPDATEDATE=#{UPDATEDATE}
   </if> 
   <if test="UPDATEUSER!=null">
      UPDATEUSER=#{UPDATEUSER}
   </if> 
   <if test="PROCESSDEFID!=null">
      PROCESSDEFID=#{PROCESSDEFID}
   </if> 
   <if test="ISEND!=null">
      ISEND=#{ISEND}
   </if> 
   <if test="TYPE!=null">
      TYPE=#{TYPE}
   </if> 
   <if test="NAME!=null">
      NAME=#{NAME}
   </if> 
   <if test="MEMO!=null">
      MEMO=#{MEMO}
   </if> 
   <if test="GTYPE!=null">
      GTYPE=#{GTYPE}
   </if> 
   <if test="SN!=null">
      SN=#{SN}
   </if> 
   <if test="TYPEID!=null">
      TYPEID=#{TYPEID}
   </if> 
   <if test="CNNAME!=null">
      CNNAME=#{CNNAME}
   </if> 
   <if test="ENNAME!=null">
      ENNAME=#{ENNAME}
   </if> 
   <if test="BIG5NAME!=null">
      BIG5NAME=#{BIG5NAME}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:bo_ss_baseinfo_dto):ArrayList<bo_ss_baseinfo_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "ORGID", column = "ORGID"),
   Result(property = "BINDID", column = "BINDID"),
   Result(property = "CREATEDATE", column = "CREATEDATE"),
   Result(property = "CREATEUSER", column = "CREATEUSER"),
   Result(property = "UPDATEDATE", column = "UPDATEDATE"),
   Result(property = "UPDATEUSER", column = "UPDATEUSER"),
   Result(property = "PROCESSDEFID", column = "PROCESSDEFID"),
   Result(property = "ISEND", column = "ISEND"),
   Result(property = "TYPE", column = "TYPE"),
   Result(property = "NAME", column = "NAME"),
   Result(property = "MEMO", column = "MEMO"),
   Result(property = "GTYPE", column = "GTYPE"),
   Result(property = "SN", column = "SN"),
   Result(property = "TYPEID", column = "TYPEID"),
   Result(property = "CNNAME", column = "CNNAME"),
   Result(property = "ENNAME", column = "ENNAME"),
   Result(property = "BIG5NAME", column = "BIG5NAME")
)
@Select("""<script>
   SELECT * FROM bo_ss_baseinfo
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:bo_ss_baseinfo_dto):bo_ss_baseinfo_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,ORGID,BINDID,CREATEDATE,CREATEUSER,UPDATEDATE,UPDATEUSER,PROCESSDEFID,ISEND,TYPE,NAME,MEMO,GTYPE,SN,TYPEID,CNNAME,ENNAME,BIG5NAME)
    values
    (#{ID},#{ORGID},#{BINDID},#{CREATEDATE},#{CREATEUSER},#{UPDATEDATE},#{UPDATEUSER},#{PROCESSDEFID},#{ISEND},#{TYPE},#{NAME},#{MEMO},#{GTYPE},#{SN},#{TYPEID},#{CNNAME},#{ENNAME},#{BIG5NAME})
</script>""")
fun insert(model:bo_ss_baseinfo_dto):Unit
                

}

        
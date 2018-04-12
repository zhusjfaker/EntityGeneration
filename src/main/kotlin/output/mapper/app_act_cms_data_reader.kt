

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
    insert into TStudent
    (ID,DATAID,READER,ORGID,READTIME,READERIP)
    values
    (#{ID},#{DATAID},#{READER},#{ORGID},#{READTIME},#{READERIP})
</script>""")
fun insert(model:app_act_cms_data_reader_dto):Unit
                

}

        
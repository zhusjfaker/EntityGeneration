

package bpm6.mapper

import bpm6.entity.*
import org.apache.ibatis.annotations.*

interface app_act_cms_widget_module{


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WIDGETID", column = "WIDGETID"),
   Result(property = "MODULEID", column = "MODULEID")
)
@Select("""<script>
   SELECT * FROM app_act_cms_widget_module
</script>""")
fun GetListAll():ArrayList<app_act_cms_widget_module_dto>
        


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WIDGETID", column = "WIDGETID"),
   Result(property = "MODULEID", column = "MODULEID")
)
@Select("""<script>
   SELECT * FROM app_act_cms_widget_module
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   <if test="WIDGETID!=null">
      WIDGETID=#{WIDGETID}
   </if> 
   <if test="MODULEID!=null">
      MODULEID=#{MODULEID}
   </if> 
   </where>
</script>""")
fun ConditionalQuery(model:app_act_cms_widget_module_dto):ArrayList<app_act_cms_widget_module_dto>
                


@Results(
   Result(property = "ID", column = "ID"),
   Result(property = "WIDGETID", column = "WIDGETID"),
   Result(property = "MODULEID", column = "MODULEID")
)
@Select("""<script>
   SELECT * FROM app_act_cms_widget_module
   <where>
   <if test="ID!=null">
      ID=#{ID}
   </if> 
   </where>
</script>""")
fun ConditionalQueryByKey(model:app_act_cms_widget_module_dto):app_act_cms_widget_module_dto?
                


@Insert("""<script>
    insert into TStudent
    (ID,WIDGETID,MODULEID)
    values
    (#{ID},#{WIDGETID},#{MODULEID})
</script>""")
fun insert(model:app_act_cms_widget_module_dto):Unit
                

}

        
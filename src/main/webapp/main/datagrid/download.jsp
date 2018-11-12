<%@ page pageEncoding="UTF-8" isELIgnored="false" %>
<div style="text-align: center;">
    <form id="jixiangsavefrom" method="post" class="easyui-form" enctype="multipart/form-data">
        <div style="margin-top: 20px">专辑:<input id="cc" name="jixiang_id" value="请选择添加专辑分类" class="easyui-validatebox" data-options="required:true"></div>
        <div style="margin-top: 20px">章节:
            <select id="area" name="chaptername">
                <option value="">----请选择下载章节-----</option>
            </select>
            </div>
    </form>
    <script>

        $(function(){
            $('#cc').combobox({
                url:'${pageContext.request.contextPath}/jixiang/queryName',
                valueField:'id',
                textField:'name',
                onChange:function(newValue,oldValue){
                    $.ajax({
                        type:"POST",
                        url:"${pageContext.request.contextPath}/jixiang/queryChapter",
                        data:"id="+newValue,
                        success:function(data) {
                            for (var i=0;i<data.length;i++) {
                                var a=data[i].children;
                                 for(var j=0;j<a.length;j++){
                                     var option=$("<option></option>").attr("value",a[j].filename).text(a[j].name);
                                     $("#area").append(option);
                                 }
                            }
                        }
                    });
            }
        });
        });

    </script>
</div>
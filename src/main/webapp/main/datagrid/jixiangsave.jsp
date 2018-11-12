<%@ page pageEncoding="UTF-8" isELIgnored="false" %>
<div style="text-align: center;">
    <form id="jixiangsavefrom" method="post" class="easyui-form" enctype="multipart/form-data">
        <div style="margin-top: 60px">name:<input type="text" name="name" class="easyui-textbox" data-options="required:true"></div>
        <div style="margin-top: 20px">上传章节:<input class="easyui-filebox" name="upload" style="width:300px"></div>
        <div style="margin-top: 20px">所属专辑:<input id="cc" name="jixiang_id" value="请选择添加专辑分类"  class="easyui-validatebox" data-options="required:true"></div>
    </form>
    <script>
        $('#cc').combobox({
            //查询所有专辑
            url:'${pageContext.request.contextPath}/jixiang/queryName',
            //value值对应字段
            valueField:'id',
            //文本值所对应字段
            textField:'name'
        });
    </script>
</div>
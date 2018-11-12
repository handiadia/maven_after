<%@ page pageEncoding="UTF-8" isELIgnored="false" %>
<div style="text-align: center;">
    <form id="saveform" method="post" class="easyui-form" enctype="multipart/form-data">
        <div style="margin-top: 60px">name:<input type="text" name="name" class="easyui-textbox" data-options="required:true,validType:'uname'"></div>
        <div style="margin-top: 20px">图片:<input class="easyui-filebox" name="upload" style="width:300px"></div>
        <div style="margin-top: 20px">创建日期:<input type="text" name="releaseDate" class="easyui-datebox" data-options="required:true"></div>
        <div style="margin-top: 20px">状&nbsp;&nbsp;态:<input type="text" value="良好" name="state" class="easyui-textbox"></div>
    </form>
</div>
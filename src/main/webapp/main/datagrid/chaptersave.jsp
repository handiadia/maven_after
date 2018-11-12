<%@ page pageEncoding="UTF-8" isELIgnored="false" %>
<div style="text-align: center;">
    <form id="chaptersavefrom" method="post" class="easyui-form" enctype="multipart/form-data">
        <div style="margin-top: 60px">name:<input type="text" name="name" class="easyui-textbox" data-options="required:true,validType:'uname'"></div>
        <div style="margin-top: 20px">专辑图片:<input class="easyui-filebox" name="upload" style="width:300px"></div>
        <div style="margin-top: 20px">作者名:<input  name="author"  class="easyui-textbox" data-options="required:true"></div>
        <div style="margin-top: 20px">播音:<input  name="broadcasting"  class="easyui-textbox" ></div>
        <div style="margin-top: 20px">集数:<input  name="blues"  class="easyui-textbox" ></div>
        <div style="margin-top: 20px">上传时间:<input  name="releaseDate"  class="easyui-datebox" ></div>
        <div style="margin-top: 20px">简介:<input  name="introduction"  class="easyui-textbox"></div>
    </form>

</div>
<%@ page pageEncoding="UTF-8" isELIgnored="false" %>
<script>
    $(function () {
        //接收修改的id发送异步请求至控制器 查询该id对象 自动打到该页面上
        $("#updateform").form('load', '${pageContext.request.contextPath}/shuffing/queryOneId?id=${param.id}');
    });
</script>
<div style="text-align: center;">
    <form id="updateform" method="post" class="easyui-form" enctype="multipart/form-data">
        <div style="margin-top: 20px">name:<input type="text" name="name" class="easyui-textbox" data-options="required:true,validType:'uname',width:240"></div>
        <div style="margin-top: 20px">图片:<input class="easyui-filebox" name="upload" style="width:300px"></div>
        <div style="margin-top: 20px">创建日期:<input type="text" name="releaseDate" class="easyui-datebox" data-options="required:true,width:240"></div>
        <div style="margin-top: 20px">状态:<input type="text" name="state" class="easyui-textbox" data-options="width:240"></div>
    </form>
</div>
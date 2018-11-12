<%@ page pageEncoding="UTF-8" isELIgnored="false" %>
<script>
    $(function () {
        //接收修改的id发送异步请求至控制器 查询该id对象 自动打到该页面上
        $("#workrecordupdateform").form('load', '${pageContext.request.contextPath}/workrecord/queryOneId?id=${param.id}');
    });
</script>
<div style="text-align: center;">
    <form id="workrecordupdateform" method="post" class="easyui-form" >
        <div style="margin-top: 20px">name:<input type="text" name="workrecord_name" class="easyui-textbox" data-options="required:true,width:240"></div>
    </form>
</div>
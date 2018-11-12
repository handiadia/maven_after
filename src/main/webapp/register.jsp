<%--
  Created by IntelliJ IDEA.
  User: 清哥
  Date: 2018/10/25
  Time: 15:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/easyui/themes/icon.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/easyui/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/easyui/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/easyui/form.validator.rules.js"></script>
    <style>
        .up{
            margin: 0 auto;
            width:400px;
        }
    </style>
</head>
<body>
<div  class="up">
    <h1 style="text-align: center">注册</h1>
<form id="ff" method="post" da>
    <h4 style="text-align: center">
        用户名:<input class="easyui-textbox" type="text" name="username" data-options="required:true,validType:'uname'" style="width:100%;height:34px;padding:10px" />
    </h4>
    <h4 style="text-align: center">
        密&nbsp;&nbsp;&nbsp;码:<input class="easyui-passwordbox" name="password" iconWidth="28" style="width:100%;height:34px;padding:10px">

    </h4>
    <h4 style="text-align: center">
        法&nbsp;&nbsp;&nbsp;名:<input class="easyui-textbox" type="text" name="dharmaname" data-options="required:true" style="width:100%;height:34px;padding:10px"/>
    </h4>
    <h4 style="text-align: center">
        头&nbsp;&nbsp;&nbsp;像:<input class="easyui-filebox" name="filename" data-options="buttonText:'上传'" style="width:100%;height:34px;padding:10px">
    </h4>
    <h4 style="text-align: center">
    性&nbsp;&nbsp;&nbsp;别:<select name="sex">
        <option value="m">男</option>
        <option value="f">女</option>
    </select>
    </h4>
    <h4 style="text-align: center">
       <textarea cols="40" rows="10" name="signature">请输入你的签名:</textarea>
    </h4>
    <h4 style="text-align: center">
       <input class="easyui-linkbutton" id="sb" value="注册" data-options=""/>
    </h4>

</form>
</div>
    <script>
        $("#sb").click(function(){
            $("#ff").form('submit',{
                url:'${pageContext.request.contextPath}/user/register',
            });
        });
    </script>

</body>
</html>

<%@page isELIgnored="false" pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
	<title>持名法州后台管理中心</title>

	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="this is my page">
	<meta http-equiv="content-type" content="text/html; charset=UTF-8">

	<link rel="icon" href="${pageContext.request.contextPath}/img/favicon.ico" type="${pageContext.request.contextPath}/image/x-icon" />
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/common.css" type="text/css">
	<link rel="stylesheet" href="${pageContext.request.contextPath}/css/login.css" type="text/css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/script/jquery.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/script/common.js"></script>

	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/themes/default/easyui.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/themes/icon.css">
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easyui.min.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui-lang-zh_CN.js"></script>
	<script type="text/javascript" src="${pageContext.request.contextPath}/js/form.validator.rules.js"></script>
	<script type="text/javascript">

        $(function(){
            //点击更换验证码：
            $("#captchaImage").click(function(){//点击更换验证码
                document.getElementById("captchaImage").src = "${pageContext.request.contextPath}/checkCode?"+ Math.random();
            });
        });
	</script>
</head>
<body>

<div class="login">
	<form id="loginForm" action="${pageContext.request.contextPath}/admin/login"  method="post" >

		<table>
			<tbody>
			<tr>
				<td width="190" rowspan="2" align="center" valign="bottom">
					<img src="${pageContext.request.contextPath}/img/header_logo.gif" />
				</td>
				<th>
					用户名:
				</th>
				<td>
					<input type="text"  name="name" class="easyui-textbox" data-options="required:true,validType:'uname'" maxlength="20"/>
				</td>
			</tr>
			<tr>
				<th>
					密&nbsp;&nbsp;&nbsp;码:
				</th>
				<td>
					<input type="password"  name="password" class="easyui-textbox" data-options="required:true,validType:'pwd'" maxlength="20"/>
				</td>
			</tr>

			<tr>
				<td>&nbsp;</td>
				<th>验证码:</th>
				<td>

					<input type="text" id="enCode" name="enCode" class="easyui-textbox" data-options="required:true" maxlength="4" autocomplete="off" style="width: 70px;"/>
					<img id="captchaImage" class="captchaImage" src="${pageContext.request.contextPath}/checkCode" title="点击更换验证码"/>

				</td>
			</tr>
			<tr>
				<td>
					&nbsp;
				</td>
				<th>
					&nbsp;
				</th>
			</tr>
			<tr>
				<td>&nbsp;</td>
				<th>&nbsp;</th>
				<td>
					<input type="button" class="homeButton" value="" onclick="location.href='/'"><input type="submit" class="loginButton" value="登录">
				</td>
			</tr>
			</tbody></table>
		<div class="powered">COPYRIGHT © 2008-2017.</div>
		<div class="link">
			<a href="javascript:void(0);">持名佛网首页</a> |
			<a href="javascript:void(0);">交流论坛</a> |
			<a href="javascript:void(0);">关于我们</a> |
			<a href="javascript:void(0);">联系我们</a> |
			<a href="javascript:void(0);">授权查询</a>
		</div>
	</form>
</div>
</body>
</html>
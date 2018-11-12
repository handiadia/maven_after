<%@page isELIgnored="false" pageEncoding="UTF-8" contentType="text/html; UTF-8" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>持名法州主页</title>
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/themes/default/easyui.css">
    <link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/themes/icon.css">
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.easyui.min.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/form.validator.rules.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/easyui-lang-zh_CN.js"></script>
    <script type="text/javascript" src="${pageContext.request.contextPath}/js/datagrid-detailview.js"></script>
    <script type="text/javascript">
	<!--菜单处理-->
</script>

</head>
<body class="easyui-layout">   
    <div data-options="region:'north',split:true" style="height:60px;background-color:  #5C160C">
    	<div style="font-size: 24px;color: #FAF7F7;font-family: 楷体;font-weight: 900;width: 500px;float:left;padding-left: 20px;padding-top: 10px" >持名法州后台管理系统</div>
    	<div style="font-size: 16px;color: #FAF7F7;font-family: 楷体;width: 300px;float:right;padding-top:15px">欢迎您:${sessionScope.admin.name}&nbsp;<a href="javascript:void(0);" id="updatepassword" class="easyui-linkbutton" data-options="iconCls:'icon-edit'">修改密码</a>&nbsp;&nbsp;<a href="#" class="easyui-linkbutton" id="stop" data-options="iconCls:'icon-remove'">退出系统</a></div>
    </div>   
    <div data-options="region:'south',split:true" style="height: 40px;background: #5C160C">
    	<div style="text-align: center;font-size:15px; color: #FAF7F7;font-family: 楷体" >&copy;百知教育 htf@zparkhr.com.cn</div>
    </div>   
       
    <div data-options="region:'west',title:'导航菜单',split:false" style="width:220px;">
    	<div id="aa"  class="easyui-accordion" data-options="fit:true">

		</div>  
    </div>

    <div data-options="region:'center'">
    	<div id="tt" class="easyui-tabs" data-options="fit:true,narrow:true,pill:true">
		    <div title="主页" data-options="iconCls:'icon-neighbourhood',"  style="background-image:url(${pageContext.request.contextPath}/main/image/shouye.jpg);background-repeat: no-repeat;background-size:100% 100%;"></div>
        </div>
    </div>

    <script>
        //添加导航栏菜单
        $(function(){
            $.ajax({
                type:"post",
                url:"${pageContext.request.contextPath}/menu/queryAll",
                success:function(result){
                    //一级遍历
                    for(var i=0;i<result.length;i++){
                        var data=result[i].menus;
                        var content = "<div style='text-align: center;'>";
                        //二级遍历
                           for(var j=0;j<data.length;j++){
                               content+="<a onclick=\"shuffingtabs('"+data[j].title+"','"+data[j].href+"')\" style='width:95%;margin:10px 0px;border:1px solid blue;' class='easyui-linkbutton' data-options=\"iconCls:'icon-edit',plain:true\">"+data[j].title+"</a><br>";
                           }
                        content += "</div>"
                        $('#aa').accordion('add', {
                            iconCls:result[i].iconCls,
                            title: result[i].title,
                            content:content,
                        });
                    }
                }
            });
            //修改密码
            $("#updatepassword").click(function(){
                $('#dd').dialog({
                    title: '修改密码',
                    width: 400,
                    height: 200,
                    closed: false,
                    cache: false,
                    modal: true,
                    href:'${pageContext.request.contextPath}/main/updatepassword.jsp',
                    buttons:[{
                        iconCls:'icon-add',
                        text:'保存',
                        handler:function(){
                            $("#ok").dialog({
                                title: '你确定要修改密码吗?',
                                width: 400,
                                height: 200,
                                buttons:[{
                                    text:'确认',
                                    iconCls:'icon-edit',
                                    handler:function(){
                                        $("#updatepasswordform").form('submit',{
                                            url:'${pageContext.request.contextPath}/admin/updatepassword',
                                            success:function (data) {
                                                //保存成功 关闭对话框
                                                $("#dd").dialog("close");
                                                $("#ok").dialog("close");
                                                //提示保存成功信息
                                                $.messager.show({
                                                    title: '提示',
                                                    msg: '修改密码成功',
                                                });
                                            },
                                            error:function(){
                                                //提示保存成功信息
                                                $.messager.show({
                                                    title: '提示',
                                                    msg: '修改密码失败',
                                                });
                                            }
                                        });
                                    }
                                },{
                                    text:'取消',
                                    iconCls:'icon-help',
                                    handler:function(){
                                        $("#ok").dialog("close");
                                    }
                                }]

                            });
                        }
                    },{
                        iconCls:'icon-remove',
                        text:'关闭',
                        handler:function(){
                            $("#dd").dialog("close");
                        }
                    }]

            });
            });

        });
        //退出系统
        $("#stop").click(function(){
          location.href="${pageContext.request.contextPath}/admin/stop";
        });

    </script>
    <script>
        /*触发单击事件 添加选项卡*/
        function shuffingtabs(title,href,id){
            //添加以前先判断tabs中是否存在这个选项卡  如果不存在则添加 存在则跳到存在的选项卡

            if(!$("#tt").tabs('exists',title)){
                $("#tt").tabs('add',{
                    closable:'true',
                    title:title,
                    /*将id值传递到数据表格datagrid页面 同时在main导入*/
                    href:'${pageContext.request.contextPath}'+href
                });
            }else{
                $("#tt").tabs('select',title);
            }
        }

    </script>
    <%--修改密码对话框容器--%>
    <div id="dd"></div>
    <div id="ok"></div>
</body> 
</html>

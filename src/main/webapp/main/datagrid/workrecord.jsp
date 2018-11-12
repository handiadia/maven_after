<%--
  Created by IntelliJ IDEA.
  User: 清哥
  Date: 2018/10/28
  Time: 15:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>

<body>
<script>
    //功能记录
    $(function () {
        $('#workrecorddatagrid').datagrid({
            url:'${pageContext.request.contextPath}/workrecord/queryAll',
            pageSize: 3,//初始化页面大小
            pageList: [1, 2, 3, 4, 5, 6, 7, 8],//初始化页面大小选择列表
            pagination: true,//分页
            method: 'post',//请求方式
            striped: true,//是否显示斑马线
            columns:[[
                {field: 'cks', title: 'cks', width: 200, align: 'center',checkbox:true},//显示复选框
                {field:'id',title:'id',width:100},
                {field:'workrecord_name',title:'名称',width:100},
                {
                    field:'rm',title:'操作选项',width:100,
                    formatter: function (value, row, index) {
                        return "<a href='javascript:void(0);'  onclick=\"removeworkrecord('" + row.id + "')\" class='easyui-linkbutton' data-options=\"iconCls:'icon-edit',plain:true\">删除</a>"+"&nbsp;&nbsp;&nbsp;&nbsp;"+
                            "<a href='javascript:void(0);'  onclick=\"updateworkrecord('" + row.id + "')\" class='easyui-linkbutton' data-options=\"iconCls:'icon-edit',plain:true\">修改</a>";
                    }
                }
            ]],
            toolbar: [{
                text:'添加',
                iconCls: 'icon-edit',
                handler: function(){
                    //添加
                    $("#workrecorddiglog").dialog({
                        title: '保存用户信息',
                        width: 600,
                        height: 400,
                        draggable: false,
                        href: '${pageContext.request.contextPath}/main/datagrid/workrecordsave.jsp',
                        buttons: [{
                            text: '保存',
                            handler: function () {
                                $("#workrecordsaveform").form('submit', {
                                    url: '${pageContext.request.contextPath}/workrecord/save',
                                    success: function (data) {     //返回的为json格式的字符串需要转换为js对象
                                        //保存成功 关闭对话框
                                        $("#workrecorddiglog").dialog("close");
                                        //提示保存成功信息
                                        $.messager.show({
                                            title: '提示',
                                            msg: '保存成功',
                                        });
                                        //刷新页面
                                        $("#workrecorddatagrid").datagrid("reload");
                                    },
                                    error:function(){
                                        $.messager.show({
                                            title: '提示',
                                            msg: '保存失败',
                                        });
                                    }
                                });
                            }
                        }, {
                            text: '关闭',
                            handler: function () {
                                $("#workrecorddiglog").dialog("close");
                            }
                        }]

                    });
                }

            },'-',{
                text:'批量删除',
                iconCls: 'icon-remove',
                handler: function(){
                    //批量删除
                    var str = $("#workrecorddatagrid").datagrid("getSelections");//获得所有选中的行
                    if(str<=0) {
                        $.messager.show({
                            title:'提示',
                            msg:'至少选择1行',
                        });
                    }else {
                        var ids = [];//定义一个数组
                        for (var i = 0; i < str.length; i++) {
                            ids.push(str[i].id);//将所有选中的行存入数组
                        }
                        $.ajax({
                            url: '${pageContext.request.contextPath}/workrecord/removeAll',
                            type: 'post',
                            traditional: true,//传递数据类型的数据时必须设置这个属性为true  数组
                            data: {id: ids},//传递给控制器一个数组
                            success: function (data) {
                                //提示删除成功信息
                                $.messager.show({
                                    title: '提示',
                                    msg: '删除成功',
                                });
                                //刷新页面
                                $("#workrecorddatagrid").datagrid("reload");
                            },
                            error: function () {
                                //提示删除失败信息
                                $.messager.show({
                                    title: '提示',
                                    msg: '删除失败',
                                });
                            }
                        });
                    }

                }
            }]
        });
    });
    //删除单个图片
    function removeworkrecord(id){
        $.ajax({
            type:"post",
            url:"${pageContext.request.contextPath}/workrecord/remove",
            data:"id="+id,
            success:function(data){
                //请求成功刷新页面  刷新父类页面
                $("#workrecorddatagrid").datagrid("reload");
            }
        });
    }


    //修改
    function updateworkrecord(id){
        $('#workrecorddiglog').dialog({
            title: '修改图片信息',
            width: 600,
            height: 300,
            closed: false,
            cache: false,
            href: '${pageContext.request.contextPath}/main/datagrid/updateworkrecord.jsp?id='+id,
            modal: true,
            buttons: [{
                text: '保存',
                handler: function () {
                    $("#workrecordupdateform").form('submit', {
                        url: '${pageContext.request.contextPath}/workrecord/update',
                        success: function (data) {   //返回的为json格式的字符串需要转换为js对象
                            //保存成功 关闭对话框
                            $("#workrecorddiglog").dialog("close");
                            //提示保存成功信息
                            $.messager.show({
                                title: '提示',
                                msg: '保存成功',
                            });
                            //刷新页面
                            $("#workrecorddatagrid").datagrid("reload");
                        },
                        error:function(){
                            $.messager.show({
                                title: '提示',
                                msg: '保存失败',
                            });
                        }
                    });
                }
            },{
                text:'关闭',
                handler:function(){
                    $("#workrecorddiglog").dialog("close");
                }
            }]
        });


    }
</script>
<%--数据表格容器--%>
<table id="workrecorddatagrid"></table>
<%--添加对话框容器--%>
<div id="workrecorddiglog" ></div>
</body>
</html>

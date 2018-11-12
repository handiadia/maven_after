<%--
  Created by IntelliJ IDEA.
  User: 清哥
  Date: 2018/10/30
  Time: 11:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<script>
    $('#tree').treegrid({
        url:'${pageContext.request.contextPath}/jixiang/queryAll',
        idField:'id',
        treeField:'name',
        fitColumns:true,
        pageSize: 20,//初始化页面大小
        pageList: [ 20, 30,40],//初始化页面大小选择列表
        pagination: true,//分页
        method: 'post',//请求方式
        striped: true,//是否显示斑马线
        lines:true,
        onClickCell:function(row){/*用户点击时触发的函数*/

            },
        columns:[[
            {field:'name',title:'专辑名',width:150},
            {field:'filename',title:'文件名',width:150},
            {field:'filesize',title:'文件大小',width:150},
        ]],
        toolbar: [{
            text:'添加专辑',
            iconCls: 'icon-edit',
            handler: function(){
                var str = $("#tree").treegrid("getSelections");//获得所有选中的行

                $("#jixiangdiglog").dialog({
                    title: '添加专辑',
                    width: 600,
                    height: 500,
                    closed: false,
                    cache: false,
                    /*导入专辑对话框引入页面*/
                    href: '${pageContext.request.contextPath}/main/datagrid/chaptersave.jsp',
                    modal: true,
                    buttons:[{
                        text:'保存',
                        handler:function(){
                            $("#chaptersavefrom").form('submit',{
                                url:'${pageContext.request.contextPath}/jixiang/save',
                                success:function(data){
                                    //保存成功 关闭对话框
                                    $("#jixiangdiglog").dialog("close");
                                    //提示保存成功信息
                                    $.messager.show({
                                        title: '提示',
                                        msg: '添加成功',
                                    });
                                    //刷新页面
                                    $("#tree").treegrid("reload");
                                },
                                error:function(){
                                    $.messager.show({
                                        title: '提示',
                                        msg: '添加失败',
                                    });
                                }
                            });
                        }
                    },{
                        text:'关闭',
                        handler:function(){
                            $("#jixiangdiglog").dialog("close");
                        }
                    }]
                    /**/
                });
            }
        },'-',{
            text:'添加章节',
            iconCls: 'icon-add',
            handler: function(){
                $("#jixiangdiglog").dialog({
                    title: '添加章节',
                    width: 600,
                    height: 300,
                    closed: false,
                    cache: false,
                    /*导入专辑对话框引入页面*/
                    href: '${pageContext.request.contextPath}/main/datagrid/jixiangsave.jsp',
                    modal: true,
                    buttons:[{
                        text:'保存',
                        handler:function(){
                            $("#jixiangsavefrom").form('submit',{
                                url:'${pageContext.request.contextPath}/chapter/save',
                                success:function(data){
                                    //保存成功 关闭对话框
                                    $("#jixiangdiglog").dialog("close");
                                    //提示保存成功信息
                                    $.messager.show({
                                        title: '提示',
                                        msg: '添加成功',
                                    });
                                    //刷新页面
                                    $("#tree").treegrid("reload");
                                },
                                error:function(){
                                    $.messager.show({
                                        title: '提示',
                                        msg: '添加失败',
                                    });
                                }
                            });
                        }
                    },{
                        text:'关闭',
                        handler:function(){
                            $("#jixiangdiglog").dialog("close");
                        }
                    }]
                });
            }
        }, {
                text:'下载章节',
                iconCls: 'icon-ok',
                handler: function(){
                    $("#jixiangdiglog").dialog({
                        title: '下载章节',
                        width: 400,
                        height: 200,
                        closed: false,
                        cache: false,
                        /*导入专辑对话框引入页面*/
                        href: '${pageContext.request.contextPath}/main/datagrid/download.jsp',
                        modal: true,
                        buttons:[{
                            text:'确认下载',
                            handler:function(){
                                $("#jixiangsavefrom").form('submit',{
                                    url:'${pageContext.request.contextPath}/file/download',
                                    success:function(data){
                                        //保存成功 关闭对话框
                                        $("#jixiangdiglog").dialog("close");
                                    },
                                    error:function(){
                                        $.messager.show({
                                            title: '提示',
                                            msg: '下载失败',
                                        });
                                    }
                                });
                            }
                        },{
                            text:'取消',
                            handler:function(){
                                $("#jixiangdiglog").dialog("close");
                            }
                        }]
                    });
                }
        },{
            text:'专辑详情',
            iconCls: 'icon-edit',
            handler: function(){
                var selectRow1=$("#tree").treegrid("getSelected");
                if(selectRow1!=null){/*判断是否单击了专辑*/
                    if(selectRow1.filesize==null){/*判断是否点击的是专辑 */
                        $("#jixiangdiglog").dialog({
                            title:'专辑详情',
                            width:500,
                            height:600,
                            href:'${pageContext.request.contextPath}/main/datagrid/jixiangView.jsp?id='+selectRow1.id
                        });
                       /* $("#album_form").form("load",selectRow1);
                        $("#album_img").prop("src",selectRow1.img);*/
                    }else{/*如果是章节则返else*/
                        alert('请选择您要了解的专辑');
                    }
                }else{
                    alert("请选择您要了解的专辑");
                }
            }
        }]
    });
</script>
<table id="tree"></table>
<%--对话框容器 添加章节--%>
<div id="jixiangdiglog" ></div>
</body>
</html>

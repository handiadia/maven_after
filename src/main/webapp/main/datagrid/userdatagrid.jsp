<%--
  Created by IntelliJ IDEA.
  User: 清哥
  Date: 2018/11/2
  Time: 15:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" %>
<script>
    $(function(){
       $("#userdatagrid").datagrid({
           url:'${pageContext.request.contextPath}/user/queryAll',
           pageSize: 3,//初始化页面大小
           pageList: [1, 2, 3, 4, 5, 6, 7, 8],//初始化页面大小选择列表
           pagination: true,//分页
           method: 'post',//请求方式
           striped: true,//是否显示斑马线
           columns:[[
               {field:'id',title:'id',width:100},
               {field:'username',title:'用户名',width:100},
               {field:'dharmaname',title:'法名',width:100},
               {field:'image',title:'头像',width:100},
               {field:'sex',title:'性别',width:100},
               {field:'address',title:'地址',width:100},
               {field:'signature',title:'签名',width:100},
               {field:'state',title:'状态',width:100},
           ]],
           view: detailview,
           detailFormatter: function(rowIndex, rowData){
               return '<table><tr>' +
                   '<td rowspan=2 style="border:0"><img src="${pageContext.request.contextPath}/main/image/' + rowData.image + '" style="height:50px;"></td>' +
                   '<td style="border:0">' +
                   '<p>releaseDate: ' + rowData.username+ '</p>' +
                   '<p>state: ' + rowData.state + '</p>' +
                   '</td>' +
                   '</tr></table>';
           }
       }) ;
    });
</script>
<%--数据库表格容器--%>
<table id="userdatagrid"></table>
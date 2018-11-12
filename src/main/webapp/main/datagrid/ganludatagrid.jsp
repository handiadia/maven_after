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
    $(function () {
        $.ajax({
           type:'post',
            url:'${pageContext.request.contextPath}/ganlu/queryOneId?id='+${param.id},
            success:function(data) {
                for (var i = 0; i < data.length; i++) {

                    var result=data[i].introductions;
                    for (var j=0;j<result.length;i++){
                        $('#dgganlu').datagrid({
                            columns:[[
                                {field:result[j].id,title:'id',width:100},
                                {field:result[j].name,title:'name',width:100},
                                {field:result[j].image,title:'image',width:100},
                                {field:result[j].releaseDate,title:'上传日期',width:100},
                                {field:result[j].author,title:'作者',width:100},
                                {field:result[j].introduction,title:'简介',width:100}
                            ]]
                        });

                    }
                }
            }
        });

    });

</script>
<%--数据表格容器--%>
<table id="dgganlu"></table>
</body>
</html>

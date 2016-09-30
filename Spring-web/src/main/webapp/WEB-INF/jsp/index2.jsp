<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/9/26
  Time: 14:22
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <title></title>
  <!-- 新 Bootstrap 核心 CSS 文件 -->
  <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">

  <!-- 可选的Bootstrap主题文件（一般不用引入） -->
  <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap-theme.min.css">

  <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
  <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>

  <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
  <script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>
  <script type="text/javascript">
    $(function(){
       /*全选*/
      $("#quanxuan").click(function(){
        $(".ch").attr("checked",true);
      });
      //反选
      $("#fanxuan").click(function(){
        $(".ch").each(function(){
          $(this).attr("checked",!$(this).attr("checked"));
        });
      });
    });
  </script>

</head>
<body ><h1 style="text-align: center">学员信息表</h1>
<table border="2px " style="width:600px;margin: 0px auto;text-align: center  " class="table table-hover" >
  <tr>
    <td>学员编号</td>
    <td>学员姓名</td>
    <td>年级id</td>
    <td>编辑</td>
    <td>删除</td></tr>
  <c:forEach items="${slist1.content}" var="sb">
    <tr>
      <td><input type="checkbox" name="studentno" class="ch">${sb.studentNo}</td>
      <td>${sb.studentName}</td>
      <td>${sb.gradeName}</td>
      <td><a type="button" href="toupdate?studentNo=${sb.studentNo}" class="btn btn-success">编辑</a></td>
      <td><button type="button" class="btn btn-danger" title="${sb.studentNo}">删除</button></td>
    </tr>
    </c:forEach>
  <tr><td colspan="5">
    <button type="button" class="btn btn-primary" id="quanxuan">全选</button>
    <button type="button" class="btn btn-primary" id="fanxuan">反选</button>
    <a type="button" href="toadd1" class="btn btn-success">新增</a>
  </td></tr>

</table>
<nav style="text-align:center">
  <ul class="pagination">
    <li><a href="fen?p=${page1}">上一页</a></li>
    <c:forEach var="p" begin="0" end="${slist1.totalPages-1}">
      <li><a href="fen?p=${p}">${p+1}</a></li>
    </c:forEach>
    <li><a href="fen?p=${page2}">下一页</a></li>
  </ul>
</nav>

<script>
  $(function(){
    $(".btn-danger").click(function(){
      var ms=$(this).attr("title");
      confirm("是否确认删除");
      $.post("shanchu",{studentNo:ms},function(data){
        if(data==true){
          alert("删除成功");
          location.reload();
        }
        else
          alert("删除失败");
      })

    })
  })
</script>
</body>
</html>

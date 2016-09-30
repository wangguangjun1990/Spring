<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2016/9/28
  Time: 10:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
  <style type="text/css">
    .cg{
      background-color: chartreuse;
      width: 50%;
      margin: 0px auto;

    }
    .er{
      background-color: red;
      width: 50%;
      margin: 0px auto;
    }
  </style>

  <!-- 新 Bootstrap 核心 CSS 文件 -->
  <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap.min.css">

  <!-- 可选的Bootstrap主题文件（一般不用引入） -->
  <link rel="stylesheet" href="http://cdn.bootcss.com/bootstrap/3.3.0/css/bootstrap-theme.min.css">

  <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
  <script src="http://cdn.bootcss.com/jquery/1.11.1/jquery.min.js"></script>

  <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
  <script src="http://cdn.bootcss.com/bootstrap/3.3.0/js/bootstrap.min.js"></script>

  <title>新增学生</title>
  <script>
    $(function(){
      $("#anniu").click(function(){
        $.post("add",{"studentName":$("#name").val(),"gradeId":$("#nianji").val()},function(data){
          if(data==true){

            $("p").addClass("cg");
            $("p").html("增加成功");
          }
          else{
            $("p").addClass("er")
            $("p").html("增加失败");
          }
          $("p").fadeOut(2000)
        });

      });
    })

  </script>

</head>
<body>
<table align="center" border="2px" width="50%">
  <tr align="center"><td><h2>新增学生信息</h2></td></tr>
<tr><td>
  <div class="form-group">
    <div class="input-group">
      <div class="input-group-addon">学生姓名</div>
         <input class="form-control" id="name" name="studentName" type="text" placeholder="学生姓名">
    </div>
  </div>
  </td></tr>
<tr><td>
   <div class="form-group">
       <div class="input-group">
          <div class="input-group-addon">年级名称</div>
             <select name="gradeId"  class="form-control" id="nianji">
               <c:forEach items="${list1}" var="b">
                 <option value="${b.gradeId}" >${b.gradeName}</option>
               </c:forEach>
             </select>
       </div>
   </div>
</td></tr>
<tr>
<tr align="right">
  <td>
    <button type="button" id="anniu" class="btn btn-primary">提交</button>
  </td></tr>
</table>
<p style="font-family:微软雅黑;color:black" class=""></p>
</body>
</html>
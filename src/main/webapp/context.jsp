<%--
  Created by IntelliJ IDEA.
  User: ww
  Date: 2020/6/11
  Time: 23:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<head>
    <title>Title</title>
    <script type="text/javascript" src="js/read.js"></script>
    <script src="js/jquery.js"></script>
    <script>
    </script>
    <style>
        .kongjian{
            width:34px;
            height:26px;
            border: 1.5px solid;
            border-radius: 3px;
            margin-right: 5px;
            float:right;
            background-color:transparent;
            color:#9E9E9E;}
        .box1{
            width: 60%;
            height: 100%;
            margin-right:auto;
            margin-left:auto;
            position: relative;
        }
        .box1 h1{
            text-align: center;
        }
    </style>
</head>
<body style="margin: 0px;">
<div id="bg" style="width:100%;position:absolute">

    <!--阅读设置控件-->
    <div style="padding:5px 5px 1px 5px;">
        <a href="/" style="text-decoration: none;font-size:19px;margin-left: 4px;color:#9E9E9E;"><i><b>小树林网站</b></i></a>
        <button class="kongjian" style="width:50px;" onclick="return ExecuteFun(this)" >全屏</button>
        <%--  <button class="kongjian" id="pingkuan" style="width:50px;" onclick="pingkuan();" >屏宽</button>--%>
        <button class="kongjian" style="width: 50px;" onclick="bg();">背景</button>
        <button class="kongjian" id="ziti"  style="width:50px;" onclick="ziti();" >字体</button>
        <button class="kongjian" onclick="jiacu()"><b>B</b></button>
         <button class="kongjian" id="Btn2"  value="A-">A-</button>
           <button class="kongjian" id="Btn1" value="A+">A+</button>
        <hr style="margin: 3px;">
    </div>
    <div id="div1">

    </div>
    <div id="content" style="margin: 0 auto;">
        <div class="box1">
        <h1>${requestScope.context.bookchaper}</h1>
        <span>${requestScope.context.booktext}</span>
        </div>
    </div>

</div>
</body>

</html>

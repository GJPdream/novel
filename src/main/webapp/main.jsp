<%--
  Created by IntelliJ IDEA.
  User: ww
  Date: 2020/6/9
  Time: 8:35
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
       #p1{
            margin:1%;
            text-align: center;
            padding: 10px;
           width: 20px;
           line-height: 5;
           text-decoration: none;
           border-bottom: #9E9E9E dotted 1px;
        }


    </style>
</head>

<body style="margin: 0px;">

<div id="bg" style="width:100%;height:100%;position:absolute">
    <!--阅读设置控件-->
    <div style="padding:5px 5px 1px 5px;">
        <a href="/" style="text-decoration: none;font-size:19px;margin-left: 4px;color:#9E9E9E;"><i><b>小树林网站</b></i></a>
        <button class="kongjian" style="width:50px;" onclick="return ExecuteFun(this)" >全屏</button>
     <%--  <button class="kongjian" id="pingkuan" style="width:50px;" onclick="pingkuan();" >屏宽</button>--%>
        <button class="kongjian" style="width: 50px;" onclick="bg();">背景</button>
        <button class="kongjian" id="ziti"  style="width:50px;" onclick="ziti();" >字体</button>
        <button class="kongjian" onclick="jiacu()"><b>B</b></button>
       <%--  <button class="kongjian" id="Btn2"  value="A-">A-</button>
          <button class="kongjian" id="Btn1" value="A+">A+</button>--%>
        <hr style="margin: 3px;">
    </div>
    <br>
<%--   <a href="<c:url value='/BookServlet?pages="斗罗大陆"'/>">121</a>--%>
    <form action="<c:url value='/BookServlet'/>"  method="get">
        <input type="text" name="pages" value=""/>
        <input type="submit" value="搜索"/>
    </form>
    <div id="content" style="margin: 0 auto;">
<%--这里做一个表格的形式怎么样会不会更好--%>
        <div id="box1">
        <c:forEach items="${requestScope.pages}" var="page" varStatus="status">
            <c:choose>
                <c:when test="${(status.index+1)%4!=0}"><a id="p1" href="<c:url value='/ContextServlet?method=context&bid=${page.bookid}'/>">${page.bookchaper}</a></c:when>
                <c:otherwise>
                    <a id="p1" href="<c:url value='/ContextServlet?method=context&bid=${page.bookid}'/>">${page.bookchaper}<br></a>
                </c:otherwise>
            </c:choose>
        </c:forEach>
        </div>
    </div>
</div>
</body>
</html>
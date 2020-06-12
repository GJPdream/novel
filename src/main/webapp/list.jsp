<%--
  Created by IntelliJ IDEA.
  User: ww
  Date: 2020/6/9
  Time: 23:04
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false"%>

<html>
<head>
    <title>Title</title>
</head>
<style>
    body {
        font-size: 10pt;
    }
    .icon {
        margin:10px;
        border: solid 2px gray;
        width: 160px;
        height: 180px;
        text-align: center;
        float: left;
    }
    .icon img{
        width: 160px;
        height: 150px;
    }
</style>
<body>
<h1>下面为你找到的图书：</h1>
<c:forEach items="${requestScope.bookList}" var="book">
   <div class="icon">
       <a href="<c:url value='/pagesServlet?method=findpages&bookname=${book.bookname}'/>"><img src="<c:url value='${book.bookimage}'/>" border="0"/></a>
       <a>${book.bookname}</a>&nbsp; <span>${book.bookauthor}</span><br>
   </div>
</c:forEach>
</body>
</html>

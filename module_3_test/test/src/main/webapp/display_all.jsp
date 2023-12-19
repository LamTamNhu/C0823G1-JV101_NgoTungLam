<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 15/12/2023
  Time: 9:59 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form>
    <button type="submit" name="action" value="to_add_form">Thêm mới chi tiêu</button>
</form>
<table border="1px">
    <tr>
        <th>STT</th>
        <th>Tên chi tiêu</th>
        <th>Ngày chi</th>
        <th>Số tiền chi</th>
        <th>Loại chi</th>
        <th>Mô tả thêm</th>
    </tr>
    <c:forEach items="${requestScope.list}" var="chiTieu" varStatus="loop">
        <tr>
            <td>${loop.count}</td>
            <td>${chiTieu.ten}</td>
            <td>${chiTieu.ngayChi}</td>
            <td>${chiTieu.soTienChi}</td>
            <td>${chiTieu.loaiChi}</td>
            <td>${chiTieu.moTaThem}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

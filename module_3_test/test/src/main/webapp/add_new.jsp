<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: OS
  Date: 15/12/2023
  Time: 10:12 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form method="post">
    <label>Tên chi tiêu
        <input type="text" name="ten">
    </label>
    <label>Ngày chi
        <input type="date" name="ngay_chi">
    </label>
    <label>Số tiền chi
        <input type="number" name="so_tien">
    </label>
    <label>Loại chi
        <select>
            <c:forEach items="${requestScope.loai_chi_tieu}" var="loai_chi" varStatus="loop">
                <option name="loai_chi" value="${loai_chi}">${loai_chi}</option>
            </c:forEach>
        </select>
    </label>
    <label>Mô tả thêm
        <input type="text" name="mo_ta_them">
    </label>
    <button type="submit" name="action" value="add"> Thêm vô </button>
</form>
</body>
</html>


<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1 style="width: 100%; text-align: center;">Danh sách nhân viên</h1>

    <table border="1" style="width: 100%;">
        <tr>
            <th>ID</th>
            <th>CMND</th>
            <th>Họ tên</th>
            <th>Ngày sinh</th>
            <th>Địa chỉ</th>
            <th>Chức vụ</th>
            <th>Phòng</th>
        </tr>

        <c:forEach items="${employees}" var="employee">
            <tr>
                <td>${employee.id}</td>
                <td>${employee.cmnd}</td>
                <td>${employee.hoten}</td>
                <td>${employee.ngaysinh}</td>
                <td>${employee.diachi}</td>
                <td>${employee.chucvu}</td>
                <td>${employee.phong}</td>
            </tr>
        </c:forEach>
    </table>

    <div>
        <a href="emplyee.jsp">Tạo mới</a>
    </div>
</body>
</html>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tạo mới nhân viên</title>
</head>
<body>

<h1>Tạo mới nhân viên</h1>
<form action="/exam__4_war_exploded/employee" method="post">
    <label>Chứng minh nhân dân:</label> <input type="text" name="cmnd"/> <br>
    <label>Họ tên:</label> <input type="text" name="hoTen"/> <br>
    <label>Ngày sinh:</label> <input type="date" name="ngaysinh"/> <br>
    <label>Địa chỉ:</label> <input type="text" name="diachi"/> <br>
    <label>Chức vụ:</label> <input type="text" name="chucvu"/> <br>
    <label>Phòng:</label> <input type="text" name="phong"/> <br>
    <input type="submit" value="Gửi"/>
    <input type="reset" value="Đặt lai">
</form>

</body>
</html>

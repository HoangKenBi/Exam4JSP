package com.example.exam4;

import com.example.exam4.dao.EmployeeDAO;
import com.example.exam4.entity.Employee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@WebServlet(name = "employeeServlet", value = "/employee")
public class EmployeeServlet extends HttpServlet {
  public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
    response.setContentType("text/html");
    List<Employee> employees = new EmployeeDAO().getListEmployee();

    request.setAttribute("employees", employees);

    request.getRequestDispatcher("list.jsp").forward(request, response);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    String cmnd = req.getParameter("cmnd");
    String hoTen = req.getParameter("hoTen");
    String ngaysinh = req.getParameter("ngaysinh");
    String diachi = req.getParameter("diachi");
    String chucvu = req.getParameter("chucvu");
    String phong = req.getParameter("phong");

    SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");

    Date date = null;
    try {
      date = dateFormat.parse(ngaysinh);
    } catch (ParseException e) {
      e.printStackTrace();
    }
    java.sql.Date sqlNgaysinh = new java.sql.Date(date.getTime());

    Employee employee = new Employee(
        cmnd,
        hoTen,
        sqlNgaysinh,
        diachi,
        chucvu,
        phong
    );

    System.out.println(employee);

    new EmployeeDAO().insertEmployee(employee);

    List<Employee> employees = new EmployeeDAO().getListEmployee();

    req.setAttribute("employees", employees);

    req.getRequestDispatcher("list.jsp").forward(req, resp);
  }

  public void destroy() {
  }

}
package com.example.exam4.dao;

import com.example.exam4.entity.Employee;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAO {

  public List<Employee> getListEmployee() {

    List<Employee> dsNhanVien = new ArrayList<>();

    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "0108");

      String sql = "SELECT * FROM employee";
      PreparedStatement ps = conn.prepareStatement(sql);

      ResultSet rs = ps.executeQuery();

      while (rs.next()) {
        Employee nv = new Employee();
        nv.setId(rs.getInt("id"));
        nv.setCmnd(rs.getString("cmnd"));
        nv.setHoten(rs.getString("hoten"));
        nv.setNgaysinh(rs.getDate("ngaysinh"));
        nv.setDiachi(rs.getString("diachi"));
        nv.setChucvu(rs.getString("chucvu"));
        nv.setPhong(rs.getString("phong"));

        dsNhanVien.add(nv);
      }

    } catch (Exception ex) {
      ex.printStackTrace();
    }

    return dsNhanVien;
  }

  public void insertEmployee(Employee emp) {
    try {
      Class.forName("com.mysql.jdbc.Driver");
      Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/demo", "root", "0108");

      String sql = "INSERT INTO employee (cmnd, hoten, ngaysinh, diachi, chucvu, phong) VALUES (?, ?, ?, ?, ?, ?)";
      PreparedStatement ps = conn.prepareStatement(sql);

      ps.setString(1, emp.getCmnd());
      ps.setString(2, emp.getHoten());
      ps.setDate(3, emp.getNgaysinh());
      ps.setString(4, emp.getDiachi());
      ps.setString(5, emp.getChucvu());
      ps.setString(6, emp.getPhong());

      ps.executeUpdate();

      ps.close();
      conn.close();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }

}
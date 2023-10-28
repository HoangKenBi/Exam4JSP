package com.example.exam4.entity;

import java.sql.Date;

public class Employee {
  private Integer id;

  private String cmnd;

  private String hoten;

  private Date ngaysinh;

  private String diachi;

  private String chucvu;

  private String phong;

  public Employee() {

  }

  public Employee(String cmnd, String hoten, Date ngaysinh, String diachi, String chucvu, String phong) {
    this.cmnd = cmnd;
    this.hoten = hoten;
    this.ngaysinh = ngaysinh;
    this.diachi = diachi;
    this.chucvu = chucvu;
    this.phong = phong;
  }

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getCmnd() {
    return cmnd;
  }

  public void setCmnd(String cmnd) {
    this.cmnd = cmnd;
  }

  public String getHoten() {
    return hoten;
  }

  public void setHoten(String hoten) {
    this.hoten = hoten;
  }

  public Date getNgaysinh() {
    return ngaysinh;
  }

  public void setNgaysinh(Date ngaysinh) {
    this.ngaysinh = ngaysinh;
  }

  public String getDiachi() {
    return diachi;
  }

  public void setDiachi(String diachi) {
    this.diachi = diachi;
  }

  public String getChucvu() {
    return chucvu;
  }

  public void setChucvu(String chucvu) {
    this.chucvu = chucvu;
  }

  public String getPhong() {
    return phong;
  }

  public void setPhong(String phong) {
    this.phong = phong;
  }

  @Override
  public String toString() {
    return "Employee{" +
        "id=" + id +
        ", cmnd='" + cmnd + '\'' +
        ", hoten='" + hoten + '\'' +
        ", ngaysinh='" + ngaysinh + '\'' +
        ", diachi='" + diachi + '\'' +
        ", chucvu='" + chucvu + '\'' +
        ", phong='" + phong + '\'' +
        '}';
  }
}

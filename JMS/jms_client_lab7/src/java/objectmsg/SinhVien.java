/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package objectmsg;

import java.io.Serializable;

/**
 *
 * @author Mirai
 */
public class SinhVien implements Serializable{
    private String name;
    private String address;
    private String phoneNo;
    private int age;

    SinhVien(String string) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNo() {
        return phoneNo;
    }

    public void setPhoneNo(String phoneNo) {
        this.phoneNo = phoneNo;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public SinhVien() {
    }

    public SinhVien(String name, String address, String phoneNo, int age) {
        this.name = name;
        this.address = address;
        this.phoneNo = phoneNo;
        this.age = age;
    }

    @Override
    public String toString() {
        return "SinhVien{" + "name=" + name + ", address=" + address + ", phoneNo=" + phoneNo + ", age=" + age + '}';
    }
    
    
}

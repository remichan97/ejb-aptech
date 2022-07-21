/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package textmsg;

import java.io.Serializable;

/**
 *
 * @author Mirai
 */
public class MyInfo implements Serializable{
    private String name;
    private String className;
    private int age;

    public MyInfo() {
    }

    public MyInfo(String name, String className, int age) {
        this.name = name;
        this.className = className;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "MyInfo{" + "name=" + name + ", className=" + className + ", age=" + age + '}';
    }
    
    
}

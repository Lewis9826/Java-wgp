/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter04.exp1;

/**
 *
 * @author 喃卿
 */
public class Student {
    public int age;    //年龄
    public String name;    //姓名
    public String department;    //院系名称
    public Student(){
    }
    public Student(int newAge,String newDepartent){
       this.age = newAge;
       this.department = newDepartent;
    }
    public void setAge(int age){
        this.age = age;
    }
    public void setDepartent(String departent){
        this.department = departent;
    }
    public int getAge(){
        return this.age;
    }
    public String getDepartent(){
        return this.department;
    }
}

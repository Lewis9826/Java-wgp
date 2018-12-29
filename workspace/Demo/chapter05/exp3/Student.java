/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter05.exp3;

/**
 *
 * @author 喃卿
 */
public class Student {
    public int age;
    public String name;
    public String department;
    public String toString(){
        String info = "姓名："+name+" 年龄："+age+" 院系"+department;
        return info;
    }
}

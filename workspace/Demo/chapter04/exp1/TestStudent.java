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
public class TestStudent {
    public static void main(String[] args){
        Student s = new Student();
        s.setAge(18);
        s.setDepartent("地信");
        System.out.println("默认的年龄为"+s.getAge());
        System.out.println("默认的专业为"+s.getDepartent());
                
    }
}

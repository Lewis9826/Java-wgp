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
public class StudentDemo {
    public static void main(String[] args){
        Student S1 = new Student();
        S1.name="zjc";
        S1.age=20;
        S1.department="计科";
        System.out.println(S1.toString());
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter03.exp2;

/**
 *
 * @author 喃卿
 */
public class TestPerson {
    public static void main(String[] args){
    Person[] testPerson;
    testPerson=new Person[2];
    Person zhang=new Person();
    zhang.age = 20;
    zhang.height=172;
    testPerson[0]=zhang;
    zhang.info();
    
    }
}

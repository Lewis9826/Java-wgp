/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter05.exp4;

/**
 *
 * @author 喃卿
 */
public class PersonDemo {
    public static void main(String[] args){
        Person p1 = new Person("631607040111");
        Person p2 = new Person("631607040122");
        Person p3 = new Person("631607040111");
        if(!p1.equals(p2))
            System.out.println("不相等");
        else
            System.out.println("相等");
        if(!p1.equals(p3))
            System.out.println("不相等");
        else
            System.out.println("相等");
    }

}

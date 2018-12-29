/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter03.exp3;

/**
 *
 * @author 喃卿
 */
public class Library {
    public static void main(String[] args){
        Book b;
        b=new Book();
        b.bookName="Java程序设计";
        b.location="32排2层4号";
        System.out.println(b.bookName);
        System.out.println(b.location);
        b.say("Java666");
        
    }
}

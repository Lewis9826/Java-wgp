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
public class Person {
    public int age;
    public String name;
    public String ID;   
    Person(String id){
        ID = id;
    }   
    public boolean equals(Person p){
        if(this.ID==p.ID)
            return true;
        else
            return false;
        
    }

}
